# MailSlurp Java Client

> Create real email addresses on demand. Send and receive emails and attachments from code and tests using Java (and JVM languages).

MailSlurp is an email API service that lets you create real email addresses in code. You can then send and receive emails and attachments in Java and JVM languages.

## Quick links

- [Method Documentation](./docs)
- [JitPack Package](https://jitpack.io/#mailslurp/mailslurp-client-java/)
- [Github Source](https://github.com/mailslurp/mailslurp-client-java)

## Get started

::: tip
This section describes how to get up and running with the Java client.

See the [guides page](https://www.mailslurp.com/guides/) for more examples and use with common frameworks.

See the method documentation for a [list of all functions](https://github.com/mailslurp/mailslurp-client-java)
:::

### Create API Key

First you'll need an API Key. [Create a free account](https://app.mailslurp.com) and copy the key from your dashboard.

### Install

MailSlurp has an official Java client [published to JitPack](https://jitpack.io/#mailslurp/mailslurp-client-java/) (an alternative to Maven central). To include the JAR in your project you must add `https://jitpack.io` as a maven repository.

#### Maven

If you use `mvn` configure your `pom.xml` like this:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>java-maven-mailslurp-example</artifactId>
    <version>1.0-SNAPSHOT</version>

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.github.mailslurp</groupId>
            <artifactId>mailslurp-client-java</artifactId>
            <version>7.0.11-RELEASE</version>
        </dependency>
    </dependencies>
</project>
```

#### Gradle

If you use gradle configure your `build.gradle` like so:

```groovy
plugins {
    id 'java'
}

repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.mailslurp:mailslurp-client-java:7.0.11-RELEASE'
}
```

#### SBT

If you use SBT configure your build like so:

```scala
resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies += "com.github.mailslurp" % "mailslurp-client-java" % "7.0.11-RELEASE"
```

### Configure

The MailSlurp library is split up into controller classes that reflect the [MailSlurp REST API](./docs). To use them first create a default client with your API Key.

```java
import com.mailslurp.api.api.*;
import com.mailslurp.client.*;
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

```java
InboxControllerApi inboxControllerApi = new InboxControllerApi(defaultClient);
Inbox inbox = inboxControllerApi.createInbox(null, null, null, null, null, null);

// verify inbox
assertEquals(inbox.getEmailAddress().contains("@mailslurp.com"), true);
assertNotNull(inbox.getId())
```

The `createInbox` method takes nullable parameters for inbox name, description, email address etc. See the method signature for options.

### Send emails

You can send emails with MailSlurp by first creating an inbox then using its ID to send from:

```java
SendEmailOptions sendEmailOptions = new SendEmailOptions()
    .to(singletonList(inbox.getEmailAddress()))
    .subject("Test")
    .body("Hello");
inboxControllerApi.sendEmail(inbox.getId(), sendEmailOptions);
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

For downloading attachments or more information of fetching see the [guides section](/guides/).

## SDK Documentation

See the examples page for [usage with Selenium and Junit](https://www.mailslurp.com/examples/) or see the GitHub repository for [full method documentation](https://github.com/mailslurp/mailslurp-client-java/).
