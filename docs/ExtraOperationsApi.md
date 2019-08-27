# ExtraOperationsApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateInboxesUsingPOST**](ExtraOperationsApi.md#bulkCreateInboxesUsingPOST) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses)
[**bulkDeleteInboxesUsingDELETE**](ExtraOperationsApi.md#bulkDeleteInboxesUsingDELETE) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes
[**bulkSendEmailsUsingPOST**](ExtraOperationsApi.md#bulkSendEmailsUsingPOST) | **POST** /bulk/send | Bulk Send Emails
[**createInboxUsingPOST**](ExtraOperationsApi.md#createInboxUsingPOST) | **POST** /inboxes | Create an Inbox (email address)
[**createInboxWebhookUsingPOST**](ExtraOperationsApi.md#createInboxWebhookUsingPOST) | **POST** /inboxes/{inboxId}/webhooks | Attach a webhook URL to an inbox
[**deleteEmailUsingDELETE**](ExtraOperationsApi.md#deleteEmailUsingDELETE) | **DELETE** /emails/{emailId} | Delete Email
[**deleteInboxUsingDELETE**](ExtraOperationsApi.md#deleteInboxUsingDELETE) | **DELETE** /inboxes/{inboxId} | Delete Inbox
[**getEmailAttachmentUsingGET**](ExtraOperationsApi.md#getEmailAttachmentUsingGET) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment
[**getEmailUsingGET**](ExtraOperationsApi.md#getEmailUsingGET) | **GET** /emails/{emailId} | Get Email Content
[**getEmailsUsingGET**](ExtraOperationsApi.md#getEmailsUsingGET) | **GET** /inboxes/{inboxId}/emails | List an Inbox&#39;s Emails
[**getInboxUsingGET**](ExtraOperationsApi.md#getInboxUsingGET) | **GET** /inboxes/{inboxId} | Get Inbox
[**getInboxWebhooksUsingDELETE**](ExtraOperationsApi.md#getInboxWebhooksUsingDELETE) | **DELETE** /inboxes/{inboxId}/webhooks/{webhookId} | Delete and disable a webhook for an inbox
[**getInboxWebhooksUsingGET**](ExtraOperationsApi.md#getInboxWebhooksUsingGET) | **GET** /inboxes/{inboxId}/webhooks | Get all webhooks for an inbox
[**getInboxesUsingGET**](ExtraOperationsApi.md#getInboxesUsingGET) | **GET** /inboxes | List Inboxes
[**getRawEmailUsingGET**](ExtraOperationsApi.md#getRawEmailUsingGET) | **GET** /emails/{emailId}/raw | Get Raw Email Content
[**sendEmailUsingPOST**](ExtraOperationsApi.md#sendEmailUsingPOST) | **POST** /inboxes/{inboxId} | Send Email


<a name="bulkCreateInboxesUsingPOST"></a>
# **bulkCreateInboxesUsingPOST**
> List&lt;Inbox&gt; bulkCreateInboxesUsingPOST(count)

Bulk create Inboxes (email addresses)

Enterprise Plan Required

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
Integer count = 56; // Integer | Number of inboxes to be created in bulk
try {
    List<Inbox> result = apiInstance.bulkCreateInboxesUsingPOST(count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#bulkCreateInboxesUsingPOST");
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

<a name="bulkDeleteInboxesUsingDELETE"></a>
# **bulkDeleteInboxesUsingDELETE**
> bulkDeleteInboxesUsingDELETE(UUID)

Bulk Delete Inboxes

Enterprise Plan Required

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
List<UUID> UUID = Arrays.asList(); // List<UUID> | ids
try {
    apiInstance.bulkDeleteInboxesUsingDELETE(UUID);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#bulkDeleteInboxesUsingDELETE");
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

<a name="bulkSendEmailsUsingPOST"></a>
# **bulkSendEmailsUsingPOST**
> bulkSendEmailsUsingPOST(bulkSendEmailOptions)

Bulk Send Emails

Enterprise Plan Required

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
BulkSendEmailOptions bulkSendEmailOptions = new BulkSendEmailOptions(); // BulkSendEmailOptions | bulkSendEmailOptions
try {
    apiInstance.bulkSendEmailsUsingPOST(bulkSendEmailOptions);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#bulkSendEmailsUsingPOST");
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

<a name="createInboxUsingPOST"></a>
# **createInboxUsingPOST**
> Inbox createInboxUsingPOST()

Create an Inbox (email address)

Create a new inbox and ephemeral email address to send and receive from. This is a necessary step before sending or receiving emails. The response contains the inbox&#39;s ID and its associated email address. It is recommended that you create a new inbox during each test method so that it is unique and empty

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
try {
    Inbox result = apiInstance.createInboxUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#createInboxUsingPOST");
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

<a name="createInboxWebhookUsingPOST"></a>
# **createInboxWebhookUsingPOST**
> Webhook createInboxWebhookUsingPOST(inboxId, createWebhookOptions)

Attach a webhook URL to an inbox

Get notified whenever an inbox receives an email via a webhook URL. An emailID will be posted to this URL every time an email is received for this inbox. The URL must be publicly reachable by the MailSlurp server. You can provide basicAuth values if you wish to secure this endpoint.

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
CreateWebhookOptions createWebhookOptions = new CreateWebhookOptions(); // CreateWebhookOptions | options
try {
    Webhook result = apiInstance.createInboxWebhookUsingPOST(inboxId, createWebhookOptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#createInboxWebhookUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |
 **createWebhookOptions** | [**CreateWebhookOptions**](CreateWebhookOptions.md)| options |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailUsingDELETE"></a>
# **deleteEmailUsingDELETE**
> deleteEmailUsingDELETE(emailId)

Delete Email

Deletes an email and removes it from the inbox

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID emailId = new UUID(); // UUID | emailId
try {
    apiInstance.deleteEmailUsingDELETE(emailId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#deleteEmailUsingDELETE");
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

<a name="deleteInboxUsingDELETE"></a>
# **deleteInboxUsingDELETE**
> deleteInboxUsingDELETE(inboxId)

Delete Inbox

Permanently delete an inbox and associated email address

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    apiInstance.deleteInboxUsingDELETE(inboxId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#deleteInboxUsingDELETE");
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

<a name="getEmailAttachmentUsingGET"></a>
# **getEmailAttachmentUsingGET**
> getEmailAttachmentUsingGET(attachmentId, emailId)

Get email attachment

Returns the specified attachment for a given email as a byte stream (file download). Get the attachmentId from the email response. Requires enterprise account.

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

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
    apiInstance.getEmailAttachmentUsingGET(attachmentId, emailId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getEmailAttachmentUsingGET");
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

<a name="getEmailUsingGET"></a>
# **getEmailUsingGET**
> Email getEmailUsingGET(emailId)

Get Email Content

Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawMessage endpoint

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID emailId = new UUID(); // UUID | emailId
try {
    Email result = apiInstance.getEmailUsingGET(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getEmailUsingGET");
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

<a name="getEmailsUsingGET"></a>
# **getEmailsUsingGET**
> List&lt;EmailPreview&gt; getEmailsUsingGET(inboxId, limit, minCount, retryTimeout, since)

List an Inbox&#39;s Emails

List emails that an inbox has received. Only emails that are sent to the inbox&#39;s email address will appear in the inbox. It may take several seconds for any email you send to an inbox&#39;s email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the &#x60;minCount&#x60; parameter. The server will retry the inbox database until the &#x60;minCount&#x60; is satisfied or the &#x60;retryTimeout&#x60; is reached

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

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
    List<EmailPreview> result = apiInstance.getEmailsUsingGET(inboxId, limit, minCount, retryTimeout, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getEmailsUsingGET");
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

<a name="getInboxUsingGET"></a>
# **getInboxUsingGET**
> Inbox getInboxUsingGET(inboxId)

Get Inbox

Returns an inbox&#39;s properties, including its email address and ID

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    Inbox result = apiInstance.getInboxUsingGET(inboxId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getInboxUsingGET");
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

<a name="getInboxWebhooksUsingDELETE"></a>
# **getInboxWebhooksUsingDELETE**
> getInboxWebhooksUsingDELETE(inboxId, webhookId)

Delete and disable a webhook for an inbox

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

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
    apiInstance.getInboxWebhooksUsingDELETE(inboxId, webhookId);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getInboxWebhooksUsingDELETE");
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

<a name="getInboxWebhooksUsingGET"></a>
# **getInboxWebhooksUsingGET**
> List&lt;Webhook&gt; getInboxWebhooksUsingGET(inboxId)

Get all webhooks for an inbox

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    List<Webhook> result = apiInstance.getInboxWebhooksUsingGET(inboxId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getInboxWebhooksUsingGET");
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

<a name="getInboxesUsingGET"></a>
# **getInboxesUsingGET**
> List&lt;Inbox&gt; getInboxesUsingGET()

List Inboxes

List the inboxes you have created

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
try {
    List<Inbox> result = apiInstance.getInboxesUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getInboxesUsingGET");
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

<a name="getRawEmailUsingGET"></a>
# **getRawEmailUsingGET**
> String getRawEmailUsingGET(emailId)

Get Raw Email Content

Returns a raw, unparsed and unprocessed email

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

ExtraOperationsApi apiInstance = new ExtraOperationsApi();
UUID emailId = new UUID(); // UUID | emailId
try {
    String result = apiInstance.getRawEmailUsingGET(emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#getRawEmailUsingGET");
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

<a name="sendEmailUsingPOST"></a>
# **sendEmailUsingPOST**
> sendEmailUsingPOST(inboxId, sendEmailOptions)

Send Email

Send an email from the inbox&#39;s email address. Specify the email recipients and contents in the request body. See the &#x60;SendEmailOptions&#x60; for more information. Note the &#x60;inboxId&#x60; refers to the inbox&#39;s id NOT its email address

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.ExtraOperationsApi;

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
    apiInstance.sendEmailUsingPOST(inboxId, sendEmailOptions);
} catch (ApiException e) {
    System.err.println("Exception when calling ExtraOperationsApi#sendEmailUsingPOST");
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

