# MailSlurp Java Client

> Create real email addresses on demand. Send and receive emails and attachments from code and tests using Java (and JVM languages).

MailSlurp is an email API service for creating and using real email addresses in code. 
You can create then send and receive emails and attachments in Java and JVM languages.

## Quick links

- [Java Method Documentation](./docs)
- [JCenter Package](https://bintray.com/mailslurp/mailslurp-client/mailslurp-client-java)
- [Github Source](https://github.com/mailslurp/mailslurp-client-java)
- [Examples](https://www.mailslurp.com/examples/)


### Create API Key

First you'll need an API Key. [Create a free account](https://app.mailslurp.com) and copy the key from your dashboard.

### Install MailSlurp dependency
The `mailslurp.mailslurp-client:mailslurp-client-java` package is [published to JCenter](https://bintray.com/mailslurp/mailslurp-client/mailslurp-client-java).

#### Install using Maven
To resolve dependencies from JCenter you must provide maven with a settings file. This can be in the default local `~/.m2/settings.xml` or a custom path specified with the `-s` argument when running `mvn`:

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

#### Install with Gradle

If you use gradle configure your `build.gradle` like so:

```groovy
plugins {
    id 'java'
}

repositories {
    jcenter() // need jcenter repository 
}

dependencies {
    implementation 'mailslurp.mailslurp-client:mailslurp-client-java'
}
```


### Import and configure

The top namespace for the MailSlurp package is `com.mailslurp`.

The library is organized into controller classes that reflect the [MailSlurp REST API](./docs). To use them first create a default client with your API Key.

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

For downloading attachments or more information of fetching see the [guides section](https://www.mailslurp.com/guides/).

## SDK Documentation

See the examples page for [usage with Selenium and Junit](https://www.mailslurp.com/examples/) or see the GitHub repository for [full method documentation](https://github.com/mailslurp/mailslurp-client-java/).
