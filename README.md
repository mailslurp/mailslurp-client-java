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

{{<gen_java_java_demo_imports>}}

Then create a default client with your API Key:

{{<gen_java_java_demo_create_client>}}

Then you can create controller instances with the client.

{{<gen_java_java_demo_create_controller>}}

### Important: set connection timeouts

MailSlurp uses 'Keep-Alive' connections for many endpoints to allow your code to wait for conditions. It is important to set a connection timeout on the client and its underlying http client implementation.

{{<gen_java_java_demo_client_timeout>}}

This will help to avoid `java.net.SocketTimeoutException` errors that you may encounter with default timeout settings.

## Email usage

Here are some common email use cases.

### Create email addresses

MailSlurp has the concept of Inboxes. Each inbox has an ID and a real email address.
Use the [`InboxControllerApi`](https://java.mailslurp.com/com/mailslurp/apis/InboxControllerApi.html) to create an inbox:

{{<gen_java_java_demo_create_inbox>}}

For more options use the options method:

{{<gen_java_java_demo_create_inbox_options>}}

### Get an inbox

{{<gen_java_java_demo_get_inbox>}}

### List inboxes

Inbox responses are paginated. You can set the page index and size with [method parameters](https://java.mailslurp.com/com/mailslurp/apis/InboxControllerApi.html).

{{<gen_java_java_demo_list_inboxes>}}

### Send emails

You can send emails with MailSlurp by first creating an inbox then using its ID to send from:

{{<gen_java_java_demo_send_email>}}


### Send Attachments

To send attachments first upload them as base64 strings before sending (that way you can re-use them). Use the [AttachmentController](https://java.mailslurp.com/com/mailslurp/apis/AttachmentControllerApi.html) methods to send and receive attachments in Java.

{{<gen_java_java_demo_upload_attachment>}}

Then use the attachment ids when sending.

{{<gen_java_java_demo_send_attachment>}}


### Receive emails

You can receive emails using the `waitFor` methods on the [WaitForControllerApi](https://java.mailslurp.com/com/mailslurp/apis/WaitForControllerApi.html) class.

{{<gen_java_java_demo_wait_for_email>}}

There are many [other waitFor methods](https://github.com/mailslurp/mailslurp-client-java) available. Most accept an optional `unreadOnly` parameter.

You can extract email content using `email.getBody()` or regex patterns.

{{<gen_java_java_demo_wait_for_matching_email>}}

If you are having trouble receiving emails please see the [email receiving guide](https://www.mailslurp.com/guides/receiving-emails/) or the [inbox not receiving support page](https://www.mailslurp.com/support/inbox-not-receiving-emails/).


### Matching and searching

There are various search and match options available in the [WaitForControllerApi](https://java.mailslurp.com/com/mailslurp/apis/WaitForControllerApi.html).

{{<gen_java_java_demo_matching>}}

### Extracting content

{{<gen_java_java_demo_extract>}}

### Downloading attachments

You can fetch metadata for an email's attachments or fetch the attachment files themselves as byte streams using the [attachment controller](https://java.mailslurp.com/com/mailslurp/apis/AttachmentControllerApi.html).

{{<gen_java_java_demo_download_attachments>}}

## SDK Documentation

See the examples page for [usage with Selenium and Junit](https://docs.mailslurp.com/examples/) or see the GitHub repository for [full method documentation](https://github.com/mailslurp/mailslurp-client-java/).
