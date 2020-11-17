# MailSlurp Java Client

> Create real email addresses on demand. Send and receive emails and attachments from code and tests using Java (and JVM languages).

MailSlurp is an email API service for creating and using real email addresses in code. 
You can create then send and receive emails and attachments in Java and JVM languages.

## Quick links

- [Java Method Documentation](./docs)
- [JCenter Package](https://bintray.com/mailslurp/mailslurp-client/mailslurp-client-java)
- [Github Source](https://github.com/mailslurp/mailslurp-client-java)
- [Examples](https://www.mailslurp.com/examples/)


## Create API Key

First you'll need an API Key. [Create a free account](https://app.mailslurp.com) and copy the key from your dashboard.

## Install MailSlurp dependency
The `mailslurp.mailslurp-client:mailslurp-client-java` package is [published to JCenter](https://bintray.com/mailslurp/mailslurp-client/mailslurp-client-java).

### Install using Maven
To use MailSlurp with Maven first add JCenter support to your mvn settings file. This can be in the default location `~/.m2/settings.xml` or a custom path specified with the `-s` argument when running `mvn`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    mvn settings.xml file for maven to allow pull from jcenter
-->
<settings>
    <profiles>
        <profile>
            <repositories>
                <repository>
                    <id>central</id>
                    <name>bintray</name>
                    <url>https://jcenter.bintray.com</url>
                </repository>
            </repositories>
            <id>bintray</id>
        </profile>
    </profiles>
    <activeProfiles>
        <activeProfile>bintray</activeProfile>
    </activeProfiles>
</settings>
```

Now we can use MailSlurp as a regular dependency in our projects `pom.xml` file.

```xml
<!-- place inside the <dependencies> block -->
<dependency>
  <groupId>mailslurp.mailslurp-client</groupId>
  <artifactId>mailslurp-client-java</artifactId>
  <version>LATEST</version>
  <type>pom</type>
</dependency>
```

### Import and configure

The top namespace for the MailSlurp package is `com.mailslurp`.

The library is organized into controller classes that reflect the [MailSlurp REST API](./docs). To use a controller first create a default client with your API Key.

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

## Common usage

Here are some common use cases.

### Create email addresses

MailSlurp has the concept of Inboxes. Each inbox has an ID and a real email address.
You can use either the [`InboxControllerApi`](./docs/InboxControllerApi/) or the [`CommonActionsControllerApi`](./docs/CommonActionsControllerApi/) classes to interact with inboxes.

```java
// create an inbox using the inbox controller
InboxControllerApi inboxControllerApi = new InboxControllerApi(defaultClient);
Inbox inbox = inboxControllerApi.createInbox(null, null, null, null, null, null);

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

### List inboxes
Inbox responses are paginated. You can set the page index and size with [method parameters](./docs/InboxControllerApi/).

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
To send attachments first upload them as base64 strings before sending (that way you can re-use them).

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

You can receive emails using the `waitFor` methods on the `WaitForControllerApi` class.

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

### Downloading attachments

You can fetch metadata for an email's attachments or fetch the attachment files themselves as byte streams.

```java
EmailControllerApi emailControllerApi = new EmailControllerApi(defaultClient);
List<AttachmentMetaData> attachments = emailControllerApi.getAttachments(emailId);

Assertions.assertEquals(attachments.size(), 1);
```

### Matching and searching

There are various search and match options available in the [WaitForControllerApi](./docs/WaitForControllerApi/).

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
