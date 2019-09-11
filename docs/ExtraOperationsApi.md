# ExtraOperationsApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateInboxes**](ExtraOperationsApi.md#bulkCreateInboxes) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses)
[**bulkDeleteInboxes**](ExtraOperationsApi.md#bulkDeleteInboxes) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes
[**bulkSendEmails**](ExtraOperationsApi.md#bulkSendEmails) | **POST** /bulk/send | Bulk Send Emails
[**createInbox**](ExtraOperationsApi.md#createInbox) | **POST** /inboxes | Create an Inbox (email address)
[**createWebhook**](ExtraOperationsApi.md#createWebhook) | **POST** /inboxes/{inboxId}/webhooks | Attach a WebHook URL to an inbox
[**deleteEmail1**](ExtraOperationsApi.md#deleteEmail1) | **DELETE** /emails/{emailId} | Delete Email
[**deleteInbox**](ExtraOperationsApi.md#deleteInbox) | **DELETE** /inboxes/{inboxId} | Delete Inbox / Email Address
[**deleteWebhook**](ExtraOperationsApi.md#deleteWebhook) | **DELETE** /inboxes/{inboxId}/webhooks/{webhookId} | Delete and disable a WebHook for an Inbox
[**downloadAttachment**](ExtraOperationsApi.md#downloadAttachment) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment
[**getEmail**](ExtraOperationsApi.md#getEmail) | **GET** /emails/{emailId} | Get Email Content
[**getEmails**](ExtraOperationsApi.md#getEmails) | **GET** /inboxes/{inboxId}/emails | List Emails in an Inbox / EmailAddress
[**getInbox**](ExtraOperationsApi.md#getInbox) | **GET** /inboxes/{inboxId} | Get Inbox / EmailAddress
[**getInboxes**](ExtraOperationsApi.md#getInboxes) | **GET** /inboxes | List Inboxes / Email Addresses
[**getRawEmailContents**](ExtraOperationsApi.md#getRawEmailContents) | **GET** /emails/{emailId}/raw | Get Raw Email Content
[**getWebhooks**](ExtraOperationsApi.md#getWebhooks) | **GET** /inboxes/{inboxId}/webhooks | Get all WebHooks for an Inbox
[**sendEmail**](ExtraOperationsApi.md#sendEmail) | **POST** /inboxes/{inboxId} | Send Email
[**uploadAttachment**](ExtraOperationsApi.md#uploadAttachment) | **POST** /attachments | Upload an attachment for sending
[**uploadMultipartForm**](ExtraOperationsApi.md#uploadMultipartForm) | **POST** /attachments/multipart | Upload an attachment for sending using Multipart Form


<a name="bulkCreateInboxes"></a>
# **bulkCreateInboxes**
> List&lt;Inbox&gt; bulkCreateInboxes(count)

Bulk create Inboxes (email addresses)

Enterprise Plan Required

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
Integer count = 56; // Integer | Number of inboxes to be created in bulk
try {
    List<Inbox> result = apiInstance.bulkCreateInboxes(count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#bulkCreateInboxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of inboxes to be created in bulk |

### Return type

[**List&lt;Inbox&gt;**](Inbox.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="bulkDeleteInboxes"></a>
# **bulkDeleteInboxes**
> bulkDeleteInboxes(UUID)

Bulk Delete Inboxes

Enterprise Plan Required

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
List<UUID> UUID = Arrays.asList(); // List<UUID> | ids
try {
    apiInstance.bulkDeleteInboxes(UUID);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#bulkDeleteInboxes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **UUID** | [**List&lt;UUID&gt;**](List.md)| ids |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="bulkSendEmails"></a>
# **bulkSendEmails**
> bulkSendEmails(bulkSendEmailOptions)

Bulk Send Emails

Enterprise Plan Required

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
BulkSendEmailOptions bulkSendEmailOptions = new BulkSendEmailOptions(); // BulkSendEmailOptions | bulkSendEmailOptions
try {
    apiInstance.bulkSendEmails(bulkSendEmailOptions);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#bulkSendEmails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bulkSendEmailOptions** | [**BulkSendEmailOptions**](BulkSendEmailOptions.md)| bulkSendEmailOptions |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createInbox"></a>
# **createInbox**
> Inbox createInbox()

Create an Inbox (email address)

Create a new inbox and ephemeral email address to send and receive from. This is a necessary step before sending or receiving emails. The response contains the inbox&#39;s ID and its associated email address. It is recommended that you create a new inbox during each test method so that it is unique and empty

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
try {
    Inbox result = apiInstance.createInbox();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#createInbox");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Inbox**](Inbox.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createWebhook"></a>
# **createWebhook**
> Webhook createWebhook(inboxId, createWebhookOptions)

Attach a WebHook URL to an inbox

Get notified whenever an inbox receives an email via a WebHook URL. An emailID will be posted to this URL every time an email is received for this inbox. The URL must be publicly reachable by the MailSlurp server. You can provide basicAuth values if you wish to secure this endpoint.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
CreateWebhookOptions createWebhookOptions = new CreateWebhookOptions(); // CreateWebhookOptions | webhookOptions
try {
    Webhook result = apiInstance.createWebhook(inboxId, createWebhookOptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |
 **createWebhookOptions** | [**CreateWebhookOptions**](CreateWebhookOptions.md)| webhookOptions |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmail1"></a>
# **deleteEmail1**
> deleteEmail1(emailId)

Delete Email

Deletes an email and removes it from the inbox

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID emailId = new UUID(); // UUID | emailId
try {
    apiInstance.deleteEmail1(emailId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#deleteEmail1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**](.md)| emailId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteInbox"></a>
# **deleteInbox**
> deleteInbox(inboxId)

Delete Inbox / Email Address

Permanently delete an inbox and associated email address

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    apiInstance.deleteInbox(inboxId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#deleteInbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(inboxId, webhookId)

Delete and disable a WebHook for an Inbox

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
UUID webhookId = new UUID(); // UUID | webhookId
try {
    apiInstance.deleteWebhook(inboxId, webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |
 **webhookId** | [**UUID**](.md)| webhookId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="downloadAttachment"></a>
# **downloadAttachment**
> downloadAttachment(attachmentId, emailId)

Get email attachment

Returns the specified attachment for a given email as a byte stream (file download). Get the attachmentId from the email response. Requires enterprise account.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
String attachmentId = "attachmentId_example"; // String | attachmentId
UUID emailId = new UUID(); // UUID | emailId
try {
    apiInstance.downloadAttachment(attachmentId, emailId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#downloadAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| attachmentId |
 **emailId** | [**UUID**](.md)| emailId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getEmail"></a>
# **getEmail**
> Email getEmail(emailId)

Get Email Content

Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawMessage endpoint

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID emailId = new UUID(); // UUID | emailId
try {
    Email result = apiInstance.getEmail(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**](.md)| emailId |

### Return type

[**Email**](Email.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEmails"></a>
# **getEmails**
> List&lt;EmailPreview&gt; getEmails(inboxId, limit, minCount, retryTimeout, since)

List Emails in an Inbox / EmailAddress

List emails that an inbox has received. Only emails that are sent to the inbox&#39;s email address will appear in the inbox. It may take several seconds for any email you send to an inbox&#39;s email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the &#x60;minCount&#x60; parameter. The server will retry the inbox database until the &#x60;minCount&#x60; is satisfied or the &#x60;retryTimeout&#x60; is reached

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | Id of inbox that emails belongs to
Integer limit = 56; // Integer | Limit the result set, ordered by descending received date time
Long minCount = 56L; // Long | Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached.
Long retryTimeout = 56L; // Long | Maximum milliseconds to spend retrying inbox database until minCount emails are returned
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Exclude emails received before this ISO 8601 date time
try {
    List<EmailPreview> result = apiInstance.getEmails(inboxId, limit, minCount, retryTimeout, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getEmails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| Id of inbox that emails belongs to |
 **limit** | **Integer**| Limit the result set, ordered by descending received date time | [optional]
 **minCount** | **Long**| Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached. | [optional]
 **retryTimeout** | **Long**| Maximum milliseconds to spend retrying inbox database until minCount emails are returned | [optional]
 **since** | **OffsetDateTime**| Exclude emails received before this ISO 8601 date time | [optional]

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInbox"></a>
# **getInbox**
> Inbox getInbox(inboxId)

Get Inbox / EmailAddress

Returns an inbox&#39;s properties, including its email address and ID.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    Inbox result = apiInstance.getInbox(inboxId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getInbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |

### Return type

[**Inbox**](Inbox.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInboxes"></a>
# **getInboxes**
> List&lt;Inbox&gt; getInboxes()

List Inboxes / Email Addresses

List the inboxes you have created

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
try {
    List<Inbox> result = apiInstance.getInboxes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getInboxes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Inbox&gt;**](Inbox.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRawEmailContents"></a>
# **getRawEmailContents**
> String getRawEmailContents(emailId)

Get Raw Email Content

Returns a raw, unparsed and unprocessed email

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID emailId = new UUID(); // UUID | emailId
try {
    String result = apiInstance.getRawEmailContents(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getRawEmailContents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**](.md)| emailId |

### Return type

**String**

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> List&lt;Webhook&gt; getWebhooks(inboxId)

Get all WebHooks for an Inbox

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    List<Webhook> result = apiInstance.getWebhooks(inboxId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |

### Return type

[**List&lt;Webhook&gt;**](Webhook.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendEmail"></a>
# **sendEmail**
> sendEmail(inboxId, sendEmailOptions)

Send Email

Send an email from the inbox&#39;s email address. Specify the email recipients and contents in the request body. See the &#x60;SendEmailOptions&#x60; for more information. Note the &#x60;inboxId&#x60; refers to the inbox&#39;s id NOT its email address

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | sendEmailOptions
try {
    apiInstance.sendEmail(inboxId, sendEmailOptions);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#sendEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions.md)| sendEmailOptions |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="uploadAttachment"></a>
# **uploadAttachment**
> List&lt;String&gt; uploadAttachment(uploadAttachmentOptions)

Upload an attachment for sending

When sending emails with attachments first upload each attachment with this endpoint. Record the returned attachment IDs. Then use these attachment IDs in the SendEmailOptions when sending an email. This means that attachments can easily be reused.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UploadAttachmentOptions uploadAttachmentOptions = new UploadAttachmentOptions(); // UploadAttachmentOptions | uploadOptions
try {
    List<String> result = apiInstance.uploadAttachment(uploadAttachmentOptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#uploadAttachment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadAttachmentOptions** | [**UploadAttachmentOptions**](UploadAttachmentOptions.md)| uploadOptions |

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadMultipartForm"></a>
# **uploadMultipartForm**
> List&lt;String&gt; uploadMultipartForm(file, contentType, filename)

Upload an attachment for sending using Multipart Form

When sending emails with attachments first upload each attachment with this endpoint. Record the returned attachment IDs. Then use these attachment IDs in the SendEmailOptions when sending an email. This means that attachments can easily be reused.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
File file = new File("/path/to/file"); // File | file
String contentType = "contentType_example"; // String | contentType
String filename = "filename_example"; // String | filename
try {
    List<String> result = apiInstance.uploadMultipartForm(file, contentType, filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#uploadMultipartForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file |
 **contentType** | **String**| contentType | [optional]
 **filename** | **String**| filename | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

