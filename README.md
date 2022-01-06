# MailSlurp Java Client

Create real email addresses on demand. Send and receive emails and attachments from code and tests using Java (and JVM languages).

MailSlurp is an email API service for creating and using real email addresses in code. 
You can create then send and receive emails and attachments in Java and JVM languages.

> For the Kotlin version see [mailslurp-client-kotlin](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-kotlin).

## Quick links

- [Java Method Documentation](https://www.mailslurp.com/docs/java/docs)
- [Maven Central Package](https://search.maven.org/artifact/com.mailslurp/mailslurp-client-java)
- [Github Source](https://github.com/mailslurp/mailslurp-client-java)
- [Examples](https://www.mailslurp.com/examples/)

### Common controller classes

- [EmailController](https://www.mailslurp.com/docs/java/docs/EmailControllerApi/) read and send emails
- [InboxController](https://www.mailslurp.com/docs/java/docs/InboxControllerApi/) create email account inboxes
- [WaitForController](https://www.mailslurp.com/docs/java/docs/WaitForControllerApi/) wait for expected emails to arrive

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

The library is organized into controller classes that reflect the [MailSlurp REST API](https://www.mailslurp.com/docs/java/docs/). To use a controller first create a default client with your API Key.

```java
import com.mailslurp.apis.*;
import com.mailslurp.clients.*;
import com.mailslurp.models.*;

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

public class MailSlurpExamplesTest {

    private static ApiClient apiClient;
    private static final Long TIMEOUT = 30000L;
    private static final String apiKey = System.getenv("API_KEY");

    @BeforeAll
    public static void beforeAll() throws Exception {
        // get API KEY for mailslurp from environment variable
        if (StringUtils.isBlank(apiKey)) {
            throw new Exception("Must provide API KEY");
        }

        // IMPORTANT set timeout for the http client
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(TIMEOUT, TimeUnit.MILLISECONDS)
                .writeTimeout(TIMEOUT, TimeUnit.MILLISECONDS)
                .readTimeout(TIMEOUT, TimeUnit.MILLISECONDS)
                .build();

        apiClient = Configuration.getDefaultApiClient();

        // IMPORTANT set api client timeouts
        apiClient.setConnectTimeout(TIMEOUT.intValue());
        apiClient.setWriteTimeout(TIMEOUT.intValue());
        apiClient.setReadTimeout(TIMEOUT.intValue());

        // IMPORTANT set API KEY and client
        apiClient.setHttpClient(httpClient);
        apiClient.setApiKey(apiKey);
    }
}
```

This will help to avoid `java.net.SocketTimeoutException` errors that you may encounter with default timeout settings.

## Common usage

Here are some common use cases.

### Create email addresses

MailSlurp has the concept of Inboxes. Each inbox has an ID and a real email address.
You can use either the [`InboxControllerApi`](https://www.mailslurp.com/docs/java/docs/InboxControllerApi/) or the [`CommonActionsControllerApi`](https://www.mailslurp.com/docs/java/docs/CommonActionsControllerApi/) classes to interact with inboxes.

```java
// create an inbox using the inbox controller
InboxControllerApi inboxControllerApi = new InboxControllerApi(defaultClient);
Inbox inbox = inboxControllerApi.createInbox(null, null, null, null, null, null, null);

// verify inbox
assertEquals(inbox.getEmailAddress().contains("@mailslurp.com"), true);
assertNotNull(inbox.getId())
```

The `createInbox` method takes nullable parameters for inbox name, description, email address etc. See the method signature for options.
For a simpler method call try the `CommonActionsControllerApi`.

```java
// common actions controller convenience method
CommonActionsControllerApi commonActionsControllerApi = new CommonActionsControllerApi(defaultClient);
Inbox inbox = commonActionsControllerApi.createNewEmailAddress();
```

#### Inbox types

Inboxes can be either `SMTP` or `HTTP` type. Set the inbox type using the `inboxType` property. SMTP inboxes are handled by a custom mailserver and support a wide range of clients while HTTP inboxes use Amazon SES and don't support some older clients like Outlook. SMTP inboxes are recommended for public facing email addresses while HTTP inboxes are best for application testing. Please see the guide on [types of inboxes](https://www.mailslurp.com/guides/smtp-vs-http-email-inboxes/) for more information.

### List inboxes

Inbox responses are paginated. You can set the page index and size with [method parameters](https://www.mailslurp.com/docs/java/docs/InboxControllerApi/).

```java
InboxControllerApi inboxControllerApi = new InboxControllerApi(defaultClient);
PageInboxProjection pageOfInboxes = inboxControllerApi.getAllInboxes(null, null, null, null, null, null);
// inbox list responses are paginated. You can control sort, page size etc with method parameters
pageOfInboxes.getTotalElements(); // total inboxes
pageOfInboxes.getPageable().getPageNumber(); // pagination index
pageOfInboxes.getContent(); // List<InboxProjection>
Assertions.assertFalse(pageOfInboxes.getContent().isEmpty());
```

### Send emails

You can send emails with MailSlurp by first creating an inbox then using its ID to send from:

```java
// simple sending
SendEmailOptions sendEmailOptions = new SendEmailOptions()
    .to(singletonList(inbox.getEmailAddress()))
    .subject("Test")
    .body("Hello");
inboxControllerApi.sendEmail(inbox.getId(), sendEmailOptions);
```

### Send Attachments

To send attachments first upload them as base64 strings before sending (that way you can re-use them). Use the [AttachmentController](https://www.mailslurp.com/docs/java/docs/AttachmentControllerApi/) methods to send and receive attachments in Java.

```java
AttachmentControllerApi attachmentControllerApi = new AttachmentControllerApi();

byte[] bytes = {0}; // test file, in reality read a file or input stream as bytes;
UploadAttachmentOptions uploadAttachmentOptions = new UploadAttachmentOptions();
uploadAttachmentOptions.setFilename("test.txt");
uploadAttachmentOptions.contentType("text/plain");
uploadAttachmentOptions.base64Contents(Base64.getEncoder().encodeToString(bytes));

// for legacy reasons returns array of ids regardless of how many you have added
List<String> attachmentIds = attachmentControllerApi.uploadAttachment(uploadAttachmentOptions);
```

Then use the attachment ids when sending.

```java
SendEmailOptions sendEmailOptions = new SendEmailOptions();
sendEmailOptions.setAttachments(attachmentIds);
sendEmailOptions.setTo(Collections.singletonList(inbox2.getEmailAddress()));

inboxControllerApi.sendEmail(inbox1.getId(), sendEmailOptions);
```

### Receive emails

You can receive emails using the `waitFor` methods on the [WaitForControllerApi](https://www.mailslurp.com/docs/java/docs/WaitForControllerApi/) class.

```java
WaitForControllerApi waitForControllerApi = new WaitForControllerApi(defaultClient);

Email email = waitForControllerApi
    .waitForLatestEmail(inbox2.getId(), TIMEOUT_MILLIS, UNREAD_ONLY);

assertEquals(email.getSubject(), "Hello inbox2");
assertEquals(email.getBody().contains("Your code is:"), true);
```

There are many [other waitFor methods](https://github.com/mailslurp/mailslurp-client-java) available. Most accept an optional `unreadOnly` parameter.

You can extract email content using `email.getBody()` or regex patterns.

```java
assertEquals(email.getBody().contains("Your code is:"), true);

Pattern p = Pattern.compile("Your code is: ([0-9]{3})");
Matcher m = p.matcher(email.getBody());
m.find();

String code =  m.group(1);
assertEquals(code, "123");
```

If you are having trouble receiving emails please see the [email receiving guide](https://www.mailslurp.com/guides/receiving-emails/) or the [inbox not receiving support page](https://www.mailslurp.com/support/inbox-not-receiving-emails/).

### Downloading attachments

You can fetch metadata for an email's attachments or fetch the attachment files themselves as byte streams using the [attachment controller](https://www.mailslurp.com/docs/java/docs/AttachmentControllerApi/).

```java
EmailControllerApi emailControllerApi = new EmailControllerApi(defaultClient);
List<AttachmentMetaData> attachments = emailControllerApi.getAttachments(emailId);

AttachmentMetaData attachment = attachments.get(0);
attachment.getContentType(); // content type of attachment
attachment.getContentLength(); // size in bytes of attachment

// get the attachment id for fetching the content bytes
String attachmentId  = attachment.getId();

// get the bytes for the attachment
byte[] attachmentBytes = emailControllerApi.downloadAttachment(attachmentId, emailId, apiKey);
```

### Replying to emails

You can reply to an email in Java using the [email controller](https://www.mailslurp.com/docs/java/docs/Email/). Here is an example.

```java
@Test
public void canReceiveAnEmailAndReplyToIt() throws ApiException {
    // create two inboxes inbox
    InboxControllerApi inboxController = new InboxControllerApi(defaultClient);
    Inbox inbox1 = inboxController.createInboxWithOptions(new CreateInboxDto().name("inbox1"));
    Inbox inbox2 = inboxController.createInboxWithOptions(new CreateInboxDto().name("inbox2"));

    // send an email from inbox1 to inbox2 and wait for confirmation
    SentEmailDto confirmation = inboxController.sendEmailAndConfirm(inbox1.getId(), new SendEmailOptions()
            .to(asList(inbox2.getEmailAddress())).subject("Hello inbox 2").body("Send me a reply"));
    assertEquals(confirmation.getReplyTo(), inbox1.getEmailAddress());

    // build a match for the email so can receive
    MatchOption matchForSubject = new MatchOption().field(MatchOption.FieldEnum.SUBJECT)
            .should(MatchOption.ShouldEnum.CONTAIN).value("Hello inbox 2");
    MatchOptions matchOptions = new MatchOptions().matches(asList(matchForSubject));

    // receive the email that was sent to inbox2 using match
    WaitForControllerApi waitForControllerApi = new WaitForControllerApi(defaultClient);
    Email email = waitForControllerApi.waitForMatchingFirstEmail(matchOptions, inbox2.getId(), TIMEOUT, true);

    assertEquals(email.getBody().contains("Send me a reply"), true);
    EmailControllerApi emailControllerApi = new EmailControllerApi(defaultClient);
    SentEmailDto replyReceipt = emailControllerApi.replyToEmail(email.getId(),
            new ReplyToEmailOptions().body("Back at you inbox 1"));

    // reply was sent from inbox 1
    assertEquals(replyReceipt.getFrom(), inbox2.getEmailAddress());
    assertEquals(replyReceipt.getReplyTo(), inbox2.getEmailAddress());
    // subject line is the same
    assertEquals(replyReceipt.getSubject(), "Hello inbox 2");
}
```

### Matching and searching

There are various search and match options available in the [WaitForControllerApi](https://www.mailslurp.com/docs/java/docs/WaitForControllerApi/).

```java
// wait for email matching the one we sent
WaitForControllerApi waitForControllerApi = new WaitForControllerApi(defaultClient);
MatchOptions matchOptions = new MatchOptions();
MatchOption matchOption = new MatchOption();

// match for emails where subject contains
matchOption.setField(MatchOption.FieldEnum.SUBJECT);
matchOption.setShould(MatchOption.ShouldEnum.CONTAIN);
matchOption.setValue("Subject I want to match");
matchOptions.addMatchesItem(matchOption);

// wait time for conditions to match, recommended as emails can take several seconds to send and arrive
Long timeoutMillis = 30000L;
Integer expectedCount = 1;
List<EmailPreview> results = waitForControllerApi.waitForMatchingEmail(matchOptions, expectedCount, inbox2.getId(), timeoutMillis, null);
```

## Verify an email address

MailSlurp can test email addresses for their existence on demand. It will query email servers on your behalf.

```java
MailServerControllerApi mailServerControllerApi = new MailServerControllerApi(defaultClient);

VerifyEmailAddressOptions options = new VerifyEmailAddressOptions();
options.setEmailAddress("test@gmail.com");

EmailVerificationResult validationResult = mailServerControllerApi.verifyEmailAddress(options);
Assertions.assertEquals(validationResult.getIsValid(), true);
```

## SDK Documentation

See the examples page for [usage with Selenium and Junit](https://www.mailslurp.com/examples/) or see the GitHub repository for [full method documentation](https://github.com/mailslurp/mailslurp-client-java/).
