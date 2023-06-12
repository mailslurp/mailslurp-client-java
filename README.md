# MailSlurp Java Client

Create real email addresses on demand. Send and receive emails and attachments from code and tests using Java (and JVM languages).

MailSlurp is an email API service for creating and using real email addresses in code. 
You can create then send and receive emails and attachments in Java and JVM languages.

> For the Kotlin version see [mailslurp-client-kotlin](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-kotlin).

## Quick links

- [API documentation](https://docs.mailslurp.com/api/)
- [Method documentation](https://java.mailslurp.com/)
- [Maven Central Package](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-java)
- [Github Source](https://github.com/mailslurp/mailslurp-client-java)
- [Example guides](https://www.mailslurp.com/examples/)
- [Example Github projects](https://www.mailtesting.net/)
- [Send email using SMTP in Java](https://www.mailslurp.com/smtp/java-send-email-smtp/)

### Common controller classes

- [EmailController](https://java.mailslurp.com/com/mailslurp/apis/EmailControllerApi.html) read and send emails
- [InboxController](https://java.mailslurp.com/com/mailslurp/apis/InboxControllerApi.html) create email account inboxes
- [WaitForController](https://java.mailslurp.com/com/mailslurp/apis/WaitForControllerApi.html) wait for expected emails or sms to arrive
- [SMSController](https://java.mailslurp.com/com/mailslurp/apis/SmsControllerApi.html) control phone and sms

For more controller documentation see the [JavaDocs](https://java.mailslurp.com/).

### Tutorial articles

- [Java email testing with Selenium](https://www.mailslurp.com/examples/receive-emails-in-java-selenium-tests/)
- [Java Serenity BDD](https://www.mailslurp.com/examples/serenity-email-account-testing-jbehave-java/)

## Create API Key

First you'll need an API Key. [Create a free account](https://app.mailslurp.com) and copy the key from your dashboard.

## Install MailSlurp dependency

The `com.mailslurp:mailslurp-client-java` package is [published to Maven Central](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-java).

### Install using Gradle

You can install MailSlurp with gradle like so

```groovy
dependencies {
    implementation("com.mailslurp:mailslurp-client-java")
}
```

### Install using Maven

To use MailSlurp with Maven add the dependency to your `pom.xml` file:

```xml
<!-- place inside the <dependencies> block -->
<dependency>
  <groupId>com.mailslurp</groupId>
  <artifactId>mailslurp-client-java</artifactId>
  <version>LATEST</version>
  <type>pom</type>
</dependency>
```

### Import and configure

The top namespace for the MailSlurp package is `com.mailslurp`.

The library is organized into controller classes that reflect the [MailSlurp REST API](https://java.mailslurp.com/com/mailslurp/apis/package-summary.html). To use a controller first import the correct packages:

```java
import com.mailslurp.apis.*;
import com.mailslurp.clients.*;
import com.mailslurp.models.*;
```

Then create a default client with your API Key:

```java
// create a MailSlurp client with your API_KEY
ApiClient defaultClient = Configuration.getDefaultApiClient();
defaultClient.setApiKey(YOUR_API_KEY);
```

Then you can create controller instances with the client.

```java
InboxControllerApi inboxControllerApi = new InboxControllerApi(defaultClient);
```

### Important: set connection timeouts

MailSlurp uses 'Keep-Alive' connections for many endpoints to allow your code to wait for conditions. It is important to set a connection timeout on the client and its underlying http client implementation.

```java
defaultClient.setConnectTimeout(TIMEOUT_MILLIS);
defaultClient.setWriteTimeout(TIMEOUT_MILLIS);
defaultClient.setReadTimeout(TIMEOUT_MILLIS);
```

This will help to avoid `java.net.SocketTimeoutException` errors that you may encounter with default timeout settings.

## Email usage

Here are some common email use cases.

### Create email addresses

MailSlurp has the concept of Inboxes. Each inbox has an ID and a real email address.
Use the [`InboxControllerApi`](https://java.mailslurp.com/com/mailslurp/apis/InboxControllerApi.html) to create an inbox:

```java
InboxDto inbox = inboxControllerApi.createInboxWithDefaults();
// verify inbox
assertEquals(inbox.getEmailAddress().contains("@mailslurp"), true);
assertNotNull(inbox.getId());
```

For more options use the options method:

```java
CreateInboxDto options = new CreateInboxDto()
        .description("My inbox")
        .inboxType(CreateInboxDto.InboxTypeEnum.SMTP_INBOX);
InboxDto inboxWithOptions = inboxControllerApi.createInboxWithOptions(options);
```

### Get an inbox

```java
// get inbox by id
InboxDto inboxById = inboxControllerApi.getInbox(inbox.getId());

// lookup inbox by address
InboxByEmailAddressResult inboxByAddress = inboxControllerApi.getInboxByEmailAddress(inbox.getEmailAddress());
assertEquals(inboxByAddress.getInboxId(), inbox.getId());

// lookup inbox by name
InboxByNameResult inboxByName = inboxControllerApi.getInboxByName("Non-existing inbox");
assertFalse(inboxByName.getExists());
```

### List inboxes

Inbox responses are paginated. You can set the page index and size with [method parameters](https://java.mailslurp.com/com/mailslurp/apis/InboxControllerApi.html).

```java
PageInboxProjection allInboxes = inboxControllerApi.getAllInboxes(0, 10, null, null, null, null, null, null, null, null, null);
// can access pagination
assertTrue(allInboxes.getTotalElements() > 0);
assertEquals(allInboxes.getPageable().getPageNumber().intValue(), 0);
assertEquals(allInboxes.getPageable().getPageSize().intValue(), 10);
// can access inboxes
InboxPreview inboxPreview = allInboxes.getContent().get(0);
```

### Send emails

You can send emails with MailSlurp by first creating an inbox then using its ID to send from:

```java
SendEmailOptions sendEmailOptions = new SendEmailOptions()
        .to(singletonList(inbox.getEmailAddress()))
        .subject("Test")
        .body("Hello");
inboxControllerApi.sendEmail(inbox.getId(), sendEmailOptions);
```


### Send Attachments

To send attachments first upload them as base64 strings before sending (that way you can re-use them). Use the [AttachmentController](https://java.mailslurp.com/com/mailslurp/apis/AttachmentControllerApi.html) methods to send and receive attachments in Java.

```java
byte[] bytes = {0}; // test file, in reality read a file or input stream as bytes;
UploadAttachmentOptions uploadAttachmentOptions = new UploadAttachmentOptions()
        .contentType("text/plain")
        .filename("hello.txt")
        .base64Contents(Base64.getEncoder().encodeToString(bytes));

AttachmentControllerApi attachmentControllerApi = new AttachmentControllerApi(defaultClient);
List<String> attachmentIds = attachmentControllerApi.uploadAttachment(uploadAttachmentOptions);
```

Then use the attachment ids when sending.

```java
SendEmailOptions sendOptions = new SendEmailOptions()
        .to(singletonList(inbox2.getEmailAddress()))
        .subject("Test email")
        .body("Hello with attachment")
        .attachments(attachmentIds);
inboxControllerApi.sendEmail(inbox2.getId(), sendOptions);
```


### Receive emails

You can receive emails using the `waitFor` methods on the [WaitForControllerApi](https://java.mailslurp.com/com/mailslurp/apis/WaitForControllerApi.html) class.

```java
WaitForControllerApi waitForControllerApi = new WaitForControllerApi(defaultClient);
Email email = waitForControllerApi.waitForLatestEmail(inbox2.getId(), TIMEOUT_MILLIS.longValue(), UNREAD_ONLY, null, null, null, null);

assertEquals(email.getSubject(), "Hello inbox2");
assertEquals(email.getBody().contains("Your code is:"), true);
```

There are many [other waitFor methods](https://github.com/mailslurp/mailslurp-client-java) available. Most accept an optional `unreadOnly` parameter.

You can extract email content using `email.getBody()` or regex patterns.

```java
Pattern p = Pattern.compile("Your code is: ([0-9]{3})");
Matcher m = p.matcher(email.getBody());
m.find();

String code = m.group(1);
assertEquals(code, "123");
```

If you are having trouble receiving emails please see the [email receiving guide](https://www.mailslurp.com/guides/receiving-emails/) or the [inbox not receiving support page](https://www.mailslurp.com/support/inbox-not-receiving-emails/).


### Matching and searching

There are various search and match options available in the [WaitForControllerApi](https://java.mailslurp.com/com/mailslurp/apis/WaitForControllerApi.html).

```java
inboxControllerApi.sendEmail(inbox1.getId(), new SendEmailOptions()
        .to(singletonList(inbox1.getEmailAddress()))
        .subject("Verification code")
        .body("Your code is: 456"));
// complex match option
List<EmailPreview> verificationEmail = waitForControllerApi.waitFor(new WaitForConditions()
        .inboxId(inbox1.getId())
        .unreadOnly(true)
        .countType(WaitForConditions.CountTypeEnum.EXACTLY)
        .count(1)
        .addMatchesItem(new MatchOption()
                .field(MatchOption.FieldEnum.FROM)
                .should(MatchOption.ShouldEnum.EQUAL)
                .value(inbox1.getEmailAddress()))
        .addMatchesItem(new MatchOption()
                .field(MatchOption.FieldEnum.SUBJECT)
                .should(MatchOption.ShouldEnum.CONTAIN)
                .value("Verification code")));
assertEquals(verificationEmail.size(), 1);
```

### Extracting content

```java
inboxControllerApi.sendEmail(inbox1.getId(), new SendEmailOptions()
        .to(singletonList(inbox3.getEmailAddress()))
        .subject("HTML notification")
        .body("<div><p>Use xpath selectors to <em class='needle'>find</em> content.</p></div>"));
Email emailWithHtml = waitForControllerApi.waitForLatestEmail(inbox3.getId(), TIMEOUT_MILLIS.longValue(), UNREAD_ONLY, null, null, null, null);
// extract content from email body
EmailTextLinesResult emailHTMLQuery = new EmailControllerApi(defaultClient).getEmailHTMLQuery(emailWithHtml.getId(), ".needle");
assertEquals(emailHTMLQuery.getLines().get(0), "find");
```

### Downloading attachments

You can fetch metadata for an email's attachments or fetch the attachment files themselves as byte streams using the [attachment controller](https://java.mailslurp.com/com/mailslurp/apis/AttachmentControllerApi.html).

```java
String attachmentId = email.getAttachments().get(0);
// get attachment file name etc
AttachmentMetaData attachmentInfo = attachmentControllerApi.getAttachmentInfo(attachmentId);
assertNotNull(attachmentInfo.getName());
// download as bytes
byte[] attachmentBytes = attachmentControllerApi.downloadAttachmentAsBytes(attachmentId);
```

## SDK Documentation

See the examples page for [usage with Selenium and Junit](https://docs.mailslurp.com/examples/) or see the GitHub repository for [full method documentation](https://github.com/mailslurp/mailslurp-client-java/).
