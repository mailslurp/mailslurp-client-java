# EmailControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyImapFlagOperation**](EmailControllerApi#applyImapFlagOperation) | **POST** /emails/{emailId}/imap-flag-operation | Set IMAP flags associated with a message. Only supports &#39;\\Seen&#39; flag. |
| [**canSend**](EmailControllerApi#canSend) | **POST** /emails/can-send | Check whether an email send would be accepted |
| [**checkEmailBody**](EmailControllerApi#checkEmailBody) | **POST** /emails/{emailId}/check-email-body | Check email body for broken links, images, and spelling issues |
| [**checkEmailBodyFeatureSupport**](EmailControllerApi#checkEmailBodyFeatureSupport) | **POST** /emails/{emailId}/check-email-body-feature-support | Check client support for features used in a stored email body |
| [**checkEmailClientSupport**](EmailControllerApi#checkEmailClientSupport) | **POST** /emails/check-email-client-support | Check email-client support for a provided HTML body |
| [**deleteAllEmails**](EmailControllerApi#deleteAllEmails) | **DELETE** /emails | Delete all emails in all inboxes. |
| [**deleteEmail**](EmailControllerApi#deleteEmail) | **DELETE** /emails/{emailId} | Delete an email |
| [**downloadAttachment**](EmailControllerApi#downloadAttachment) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment bytes. Returned as &#x60;octet-stream&#x60; with content type header. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints and convert the base 64 encoded content to a file or string. |
| [**downloadAttachmentBase64**](EmailControllerApi#downloadAttachmentBase64) | **GET** /emails/{emailId}/attachments/{attachmentId}/base64 | Get email attachment as base64 encoded string as an alternative to binary responses. Decode the &#x60;base64FileContents&#x60; as a &#x60;utf-8&#x60; encoded string or array of bytes depending on the &#x60;contentType&#x60;. |
| [**downloadBody**](EmailControllerApi#downloadBody) | **GET** /emails/{emailId}/body | Get email body as string. Returned as &#x60;plain/text&#x60; with content type header. |
| [**downloadBodyBytes**](EmailControllerApi#downloadBodyBytes) | **GET** /emails/{emailId}/body-bytes | Get email body in bytes. Returned as &#x60;octet-stream&#x60; with content type header. |
| [**forwardEmail**](EmailControllerApi#forwardEmail) | **POST** /emails/{emailId}/forward | Forward email to recipients |
| [**getAttachmentMetaData**](EmailControllerApi#getAttachmentMetaData) | **GET** /emails/{emailId}/attachments/{attachmentId}/metadata | Get email attachment metadata. This is the &#x60;contentType&#x60; and &#x60;contentLength&#x60; of an attachment. To get the individual attachments  use the &#x60;downloadAttachment&#x60; methods. |
| [**getEmail**](EmailControllerApi#getEmail) | **GET** /emails/{emailId} | Get hydrated email (headers and body) |
| [**getEmailAttachments**](EmailControllerApi#getEmailAttachments) | **GET** /emails/{emailId}/attachments | List attachment metadata for an email |
| [**getEmailCodes**](EmailControllerApi#getEmailCodes) | **POST** /emails/{emailId}/codes | Extract verification codes from an email |
| [**getEmailContentMatch**](EmailControllerApi#getEmailContentMatch) | **POST** /emails/{emailId}/contentMatch | Run regex against hydrated email body and return matches |
| [**getEmailContentPart**](EmailControllerApi#getEmailContentPart) | **GET** /emails/{emailId}/contentPart | Get email content part by content type |
| [**getEmailContentPartContent**](EmailControllerApi#getEmailContentPartContent) | **GET** /emails/{emailId}/contentPart/raw | Get multipart content part as raw response |
| [**getEmailCount**](EmailControllerApi#getEmailCount) | **GET** /emails/emails/count | Get email count |
| [**getEmailHTML**](EmailControllerApi#getEmailHTML) | **GET** /emails/{emailId}/html | Get hydrated email HTML for browser rendering |
| [**getEmailHTMLJson**](EmailControllerApi#getEmailHTMLJson) | **GET** /emails/{emailId}/html/json | Get hydrated email HTML wrapped in JSON |
| [**getEmailHTMLQuery**](EmailControllerApi#getEmailHTMLQuery) | **GET** /emails/{emailId}/htmlQuery | Query hydrated HTML body and return matching text lines |
| [**getEmailLinks**](EmailControllerApi#getEmailLinks) | **GET** /emails/{emailId}/links | Extract links from an email HTML body |
| [**getEmailPreviewURLs**](EmailControllerApi#getEmailPreviewURLs) | **GET** /emails/{emailId}/urls | Get email URLs for viewing in browser or downloading |
| [**getEmailScreenshotAsBase64**](EmailControllerApi#getEmailScreenshotAsBase64) | **POST** /emails/{emailId}/screenshot/base64 | Take a screenshot of an email in a browser and return base64 encoded string |
| [**getEmailScreenshotAsBinary**](EmailControllerApi#getEmailScreenshotAsBinary) | **POST** /emails/{emailId}/screenshot/binary | Take a screenshot of an email in a browser |
| [**getEmailSignature**](EmailControllerApi#getEmailSignature) | **GET** /emails/{emailId}/signature | Extract signature from an inbound email |
| [**getEmailSummary**](EmailControllerApi#getEmailSummary) | **GET** /emails/{emailId}/summary | Get email summary (headers/metadata only) |
| [**getEmailTextLines**](EmailControllerApi#getEmailTextLines) | **GET** /emails/{emailId}/textLines | Extract normalized text lines from email body |
| [**getEmailThread**](EmailControllerApi#getEmailThread) | **GET** /emails/threads/{threadId} | Get email thread metadata by thread ID |
| [**getEmailThreadItems**](EmailControllerApi#getEmailThreadItems) | **GET** /emails/threads/{threadId}/items | Get messages in a specific email thread |
| [**getEmailThreads**](EmailControllerApi#getEmailThreads) | **GET** /emails/threads | List email threads in paginated form |
| [**getEmailsOffsetPaginated**](EmailControllerApi#getEmailsOffsetPaginated) | **GET** /emails/offset-paginated | Get all emails in all inboxes in paginated form. Email API list all. |
| [**getEmailsPaginated**](EmailControllerApi#getEmailsPaginated) | **GET** /emails | Get all emails in all inboxes in paginated form. Email API list all. |
| [**getGravatarUrlForEmailAddress**](EmailControllerApi#getGravatarUrlForEmailAddress) | **GET** /emails/gravatarFor | Get Gravatar URL for an email address |
| [**getLatestEmail**](EmailControllerApi#getLatestEmail) | **GET** /emails/latest | Get latest email in all inboxes. Most recently received. |
| [**getLatestEmailInInbox1**](EmailControllerApi#getLatestEmailInInbox1) | **GET** /emails/latestIn | Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet. |
| [**getOrganizationEmailsPaginated**](EmailControllerApi#getOrganizationEmailsPaginated) | **GET** /emails/organization | List organization-visible emails |
| [**getRawEmailContents**](EmailControllerApi#getRawEmailContents) | **GET** /emails/{emailId}/raw | Get raw email string. Returns unparsed raw SMTP message with headers and body. |
| [**getRawEmailJson**](EmailControllerApi#getRawEmailJson) | **GET** /emails/{emailId}/raw/json | Get raw email in JSON. Unparsed SMTP message in JSON wrapper format. |
| [**getUnreadEmailCount**](EmailControllerApi#getUnreadEmailCount) | **GET** /emails/unreadCount | Get unread email count |
| [**markAllAsRead**](EmailControllerApi#markAllAsRead) | **PATCH** /emails/read | Mark all emails as read or unread |
| [**markAsRead**](EmailControllerApi#markAsRead) | **PATCH** /emails/{emailId}/read | Mark an email as read or unread |
| [**replyToEmail**](EmailControllerApi#replyToEmail) | **PUT** /emails/{emailId} | Reply to an email |
| [**searchEmails**](EmailControllerApi#searchEmails) | **POST** /emails/search | Get all emails by search criteria. Return in paginated form. |
| [**sendEmailSourceOptional**](EmailControllerApi#sendEmailSourceOptional) | **POST** /emails | Send email |
| [**setEmailFavourited**](EmailControllerApi#setEmailFavourited) | **PUT** /emails/{emailId}/favourite | Set email favourited state |
| [**validateEmail**](EmailControllerApi#validateEmail) | **POST** /emails/{emailId}/validate | Validate email HTML contents |


<a id="applyImapFlagOperation"></a>
# **applyImapFlagOperation**
> EmailPreview applyImapFlagOperation(emailId, imapFlagOperationOptions).execute();

Set IMAP flags associated with a message. Only supports &#39;\\Seen&#39; flag.

Applies RFC3501 IMAP flag operations on a message. Current implementation supports read/unread semantics via the &#x60;\\\\Seen&#x60; flag only.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    ImapFlagOperationOptions imapFlagOperationOptions = new ImapFlagOperationOptions(); // ImapFlagOperationOptions | 
    try {
      EmailPreview result = apiInstance.applyImapFlagOperation(emailId, imapFlagOperationOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#applyImapFlagOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |
| **imapFlagOperationOptions** | [**ImapFlagOperationOptions**](ImapFlagOperationOptions)|  | |

### Return type

[**EmailPreview**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="canSend"></a>
# **canSend**
> CanSendEmailResults canSend(inboxId, sendEmailOptions).execute();

Check whether an email send would be accepted

Validates sender/inbox context and recipient eligibility before attempting a send. Useful for preflight checks in UI or test workflows.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    try {
      CanSendEmailResults result = apiInstance.canSend(inboxId, sendEmailOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#canSend");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |

### Return type

[**CanSendEmailResults**](CanSendEmailResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEmailBody"></a>
# **checkEmailBody**
> CheckEmailBodyResults checkEmailBody(emailId).execute();

Check email body for broken links, images, and spelling issues

Runs content quality checks against hydrated email body content. This endpoint performs outbound HTTP checks for linked resources, so avoid use with sensitive or stateful URLs.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    try {
      CheckEmailBodyResults result = apiInstance.checkEmailBody(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#checkEmailBody");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |

### Return type

[**CheckEmailBodyResults**](CheckEmailBodyResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEmailBodyFeatureSupport"></a>
# **checkEmailBodyFeatureSupport**
> CheckEmailBodyFeatureSupportResults checkEmailBodyFeatureSupport(emailId).execute();

Check client support for features used in a stored email body

Detects HTML/CSS features in the target email body and reports compatibility across major email clients and devices.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    try {
      CheckEmailBodyFeatureSupportResults result = apiInstance.checkEmailBodyFeatureSupport(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#checkEmailBodyFeatureSupport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |

### Return type

[**CheckEmailBodyFeatureSupportResults**](CheckEmailBodyFeatureSupportResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEmailClientSupport"></a>
# **checkEmailClientSupport**
> CheckEmailClientSupportResults checkEmailClientSupport(checkEmailClientSupportOptions).execute();

Check email-client support for a provided HTML body

Evaluates HTML/CSS features in the supplied body and reports support coverage across major email clients and platforms.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    CheckEmailClientSupportOptions checkEmailClientSupportOptions = new CheckEmailClientSupportOptions(); // CheckEmailClientSupportOptions | 
    try {
      CheckEmailClientSupportResults result = apiInstance.checkEmailClientSupport(checkEmailClientSupportOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#checkEmailClientSupport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **checkEmailClientSupportOptions** | [**CheckEmailClientSupportOptions**](CheckEmailClientSupportOptions)|  | |

### Return type

[**CheckEmailClientSupportResults**](CheckEmailClientSupportResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAllEmails"></a>
# **deleteAllEmails**
> deleteAllEmails().execute();

Delete all emails in all inboxes.

Deletes all emails for the authenticated account context. This operation is destructive and cannot be undone.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    try {
      apiInstance.deleteAllEmails()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#deleteAllEmails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteEmail"></a>
# **deleteEmail**
> deleteEmail(emailId).execute();

Delete an email

Deletes a single email from account scope. Operation is destructive and not reversible.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to delete
    try {
      apiInstance.deleteEmail(emailId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#deleteEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to delete | |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="downloadAttachment"></a>
# **downloadAttachment**
> byte[] downloadAttachment(emailId, attachmentId).apiKey(apiKey).execute();

Get email attachment bytes. Returned as &#x60;octet-stream&#x60; with content type header. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints and convert the base 64 encoded content to a file or string.

Returns attachment bytes by attachment ID. Use attachment IDs from email payloads or attachment listing endpoints.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    String apiKey = "apiKey_example"; // String | Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly.
    try {
      byte[] result = apiInstance.downloadAttachment(emailId, attachmentId)
            .apiKey(apiKey)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#downloadAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |
| **attachmentId** | **String**| ID of attachment | |
| **apiKey** | **String**| Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly. | [optional] |

### Return type

**byte[]**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="downloadAttachmentBase64"></a>
# **downloadAttachmentBase64**
> DownloadAttachmentDto downloadAttachmentBase64(emailId, attachmentId).execute();

Get email attachment as base64 encoded string as an alternative to binary responses. Decode the &#x60;base64FileContents&#x60; as a &#x60;utf-8&#x60; encoded string or array of bytes depending on the &#x60;contentType&#x60;.

Returns attachment payload as base64 in JSON. Useful for clients that cannot reliably consume binary streaming responses.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    try {
      DownloadAttachmentDto result = apiInstance.downloadAttachmentBase64(emailId, attachmentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#downloadAttachmentBase64");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |
| **attachmentId** | **String**| ID of attachment | |

### Return type

[**DownloadAttachmentDto**](DownloadAttachmentDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadBody"></a>
# **downloadBody**
> String downloadBody(emailId).execute();

Get email body as string. Returned as &#x60;plain/text&#x60; with content type header.

Returns hydrated email body text as a string with content type aligned to the underlying body format.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    try {
      String result = apiInstance.downloadBody(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#downloadBody");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadBodyBytes"></a>
# **downloadBodyBytes**
> byte[] downloadBodyBytes(emailId).execute();

Get email body in bytes. Returned as &#x60;octet-stream&#x60; with content type header.

Streams hydrated email body bytes with content type derived from the message body format.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    try {
      byte[] result = apiInstance.downloadBodyBytes(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#downloadBodyBytes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |

### Return type

**byte[]**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

<a id="forwardEmail"></a>
# **forwardEmail**
> SentEmailDto forwardEmail(emailId, forwardEmailOptions).execute();

Forward email to recipients

Forwards an existing email to new recipients. Uses the owning inbox context unless overridden by allowed sender options.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    ForwardEmailOptions forwardEmailOptions = new ForwardEmailOptions(); // ForwardEmailOptions | 
    try {
      SentEmailDto result = apiInstance.forwardEmail(emailId, forwardEmailOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#forwardEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |
| **forwardEmailOptions** | [**ForwardEmailOptions**](ForwardEmailOptions)|  | |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="getAttachmentMetaData"></a>
# **getAttachmentMetaData**
> AttachmentMetaData getAttachmentMetaData(emailId, attachmentId).execute();

Get email attachment metadata. This is the &#x60;contentType&#x60; and &#x60;contentLength&#x60; of an attachment. To get the individual attachments  use the &#x60;downloadAttachment&#x60; methods.

Returns metadata for a specific attachment ID (name, content type, and size fields).

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    try {
      AttachmentMetaData result = apiInstance.getAttachmentMetaData(emailId, attachmentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getAttachmentMetaData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |
| **attachmentId** | **String**| ID of attachment | |

### Return type

[**AttachmentMetaData**](AttachmentMetaData)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmail"></a>
# **getEmail**
> Email getEmail(emailId).execute();

Get hydrated email (headers and body)

Returns parsed email content including headers and body fields. Accessing hydrated content may mark the email as read depending on read-state rules.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    try {
      Email result = apiInstance.getEmail(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8, application/xml;charset=UTF-8, application/json; charset=UTF-8, application/xml; charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailAttachments"></a>
# **getEmailAttachments**
> List&lt;AttachmentMetaData&gt; getEmailAttachments(emailId).execute();

List attachment metadata for an email

Returns metadata for all attachment IDs associated with the email (name, content type, size, and IDs).

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    try {
      List<AttachmentMetaData> result = apiInstance.getEmailAttachments(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailAttachments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |

### Return type

[**List&lt;AttachmentMetaData&gt;**](AttachmentMetaData)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailCodes"></a>
# **getEmailCodes**
> ExtractCodesResult getEmailCodes(emailId).extractCodesOptions(extractCodesOptions).execute();

Extract verification codes from an email

Extracts one-time passcodes and similar tokens from email content. Supports deterministic extraction now with method/fallback flags (&#x60;AUTO&#x60;, &#x60;PATTERN&#x60;, &#x60;LLM&#x60;, &#x60;OCR&#x60;, &#x60;OCR_THEN_LLM&#x60;) for QA and future advanced pipelines.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to extract codes from
    ExtractCodesOptions extractCodesOptions = new ExtractCodesOptions(); // ExtractCodesOptions | 
    try {
      ExtractCodesResult result = apiInstance.getEmailCodes(emailId)
            .extractCodesOptions(extractCodesOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailCodes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to extract codes from | |
| **extractCodesOptions** | [**ExtractCodesOptions**](ExtractCodesOptions)|  | [optional] |

### Return type

[**ExtractCodesResult**](ExtractCodesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailContentMatch"></a>
# **getEmailContentMatch**
> EmailContentMatchResult getEmailContentMatch(emailId, contentMatchOptions).execute();

Run regex against hydrated email body and return matches

Executes a Java regex pattern over hydrated email body text and returns the full match plus capture groups. Pattern syntax follows Java &#x60;Pattern&#x60; rules.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to match against
    ContentMatchOptions contentMatchOptions = new ContentMatchOptions(); // ContentMatchOptions | 
    try {
      EmailContentMatchResult result = apiInstance.getEmailContentMatch(emailId, contentMatchOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailContentMatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to match against | |
| **contentMatchOptions** | [**ContentMatchOptions**](ContentMatchOptions)|  | |

### Return type

[**EmailContentMatchResult**](EmailContentMatchResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailContentPart"></a>
# **getEmailContentPart**
> EmailContentPartResult getEmailContentPart(emailId, contentType).strict(strict).index(index).execute();

Get email content part by content type

Extracts one MIME body part by &#x60;contentType&#x60; and optional &#x60;index&#x60;, returned in a structured DTO with metadata.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to match against
    String contentType = "contentType_example"; // String | Content type
    Boolean strict = true; // Boolean | Strict content type match
    Integer index = 56; // Integer | Index of content type part if multiple
    try {
      EmailContentPartResult result = apiInstance.getEmailContentPart(emailId, contentType)
            .strict(strict)
            .index(index)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailContentPart");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to match against | |
| **contentType** | **String**| Content type | |
| **strict** | **Boolean**| Strict content type match | [optional] |
| **index** | **Integer**| Index of content type part if multiple | [optional] |

### Return type

[**EmailContentPartResult**](EmailContentPartResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8, application/xml;charset=UTF-8, application/json; charset=UTF-8, application/xml; charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailContentPartContent"></a>
# **getEmailContentPartContent**
> String getEmailContentPartContent(emailId, contentType).strict(strict).index(index).execute();

Get multipart content part as raw response

Extracts one MIME body part by &#x60;contentType&#x60; and optional &#x60;index&#x60;, and returns raw content with matching response content type when valid.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to match against
    String contentType = "contentType_example"; // String | Content type
    Boolean strict = true; // Boolean | Strict content type match
    Integer index = 56; // Integer | Index of content type part if multiple. Starts from 0 and applies to the result list after selecting for your content type. Content type parts are sorted by order found in original MIME message.
    try {
      String result = apiInstance.getEmailContentPartContent(emailId, contentType)
            .strict(strict)
            .index(index)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailContentPartContent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to match against | |
| **contentType** | **String**| Content type | |
| **strict** | **Boolean**| Strict content type match | [optional] |
| **index** | **Integer**| Index of content type part if multiple. Starts from 0 and applies to the result list after selecting for your content type. Content type parts are sorted by order found in original MIME message. | [optional] |

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailCount"></a>
# **getEmailCount**
> CountDto getEmailCount().inboxId(inboxId).execute();

Get email count

Returns total email count for the authenticated user, or count scoped to a specific inbox when &#x60;inboxId&#x60; is provided.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    try {
      CountDto result = apiInstance.getEmailCount()
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | [optional] |

### Return type

[**CountDto**](CountDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailHTML"></a>
# **getEmailHTML**
> String getEmailHTML(emailId).replaceCidImages(replaceCidImages).execute();

Get hydrated email HTML for browser rendering

Returns hydrated HTML body directly with &#x60;text/html&#x60; content type. Supports temporary access/browser usage and optional CID replacement for inline asset rendering.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Boolean replaceCidImages = false; // Boolean | 
    try {
      String result = apiInstance.getEmailHTML(emailId)
            .replaceCidImages(replaceCidImages)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailHTML");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |
| **replaceCidImages** | **Boolean**|  | [optional] [default to false] |

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html;charset=utf-8, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailHTMLJson"></a>
# **getEmailHTMLJson**
> EmailHtmlDto getEmailHTMLJson(emailId).replaceCidImages(replaceCidImages).execute();

Get hydrated email HTML wrapped in JSON

Returns hydrated HTML body and subject in a JSON DTO. Useful for API clients that need structured response payloads instead of raw HTML responses.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Boolean replaceCidImages = false; // Boolean | 
    try {
      EmailHtmlDto result = apiInstance.getEmailHTMLJson(emailId)
            .replaceCidImages(replaceCidImages)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailHTMLJson");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |
| **replaceCidImages** | **Boolean**|  | [optional] [default to false] |

### Return type

[**EmailHtmlDto**](EmailHtmlDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailHTMLQuery"></a>
# **getEmailHTMLQuery**
> EmailTextLinesResult getEmailHTMLQuery(emailId, htmlSelector).execute();

Query hydrated HTML body and return matching text lines

Applies a JSoup/CSS selector to hydrated HTML email body and returns matching text lines.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to perform HTML query on
    String htmlSelector = "htmlSelector_example"; // String | HTML selector to search for. Uses JQuery/JSoup/CSS style selector like '.my-div' to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information.
    try {
      EmailTextLinesResult result = apiInstance.getEmailHTMLQuery(emailId, htmlSelector)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailHTMLQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to perform HTML query on | |
| **htmlSelector** | **String**| HTML selector to search for. Uses JQuery/JSoup/CSS style selector like &#39;.my-div&#39; to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information. | |

### Return type

[**EmailTextLinesResult**](EmailTextLinesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailLinks"></a>
# **getEmailLinks**
> EmailLinksResult getEmailLinks(emailId).selector(selector).execute();

Extract links from an email HTML body

Parses HTML content and extracts link URLs (&#x60;href&#x60;). For non-HTML emails this endpoint returns a validation error.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to fetch text for
    String selector = "selector_example"; // String | Optional HTML query selector for links
    try {
      EmailLinksResult result = apiInstance.getEmailLinks(emailId)
            .selector(selector)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailLinks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to fetch text for | |
| **selector** | **String**| Optional HTML query selector for links | [optional] |

### Return type

[**EmailLinksResult**](EmailLinksResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailPreviewURLs"></a>
# **getEmailPreviewURLs**
> EmailPreviewUrls getEmailPreviewURLs(emailId).execute();

Get email URLs for viewing in browser or downloading

Returns precomputed URLs for preview and raw message access for the specified email.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    try {
      EmailPreviewUrls result = apiInstance.getEmailPreviewURLs(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailPreviewURLs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |

### Return type

[**EmailPreviewUrls**](EmailPreviewUrls)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailScreenshotAsBase64"></a>
# **getEmailScreenshotAsBase64**
> EmailScreenshotResult getEmailScreenshotAsBase64(emailId, getEmailScreenshotOptions).execute();

Take a screenshot of an email in a browser and return base64 encoded string

Renders the email in a browser engine and returns PNG data as base64. Useful for APIs and dashboards that cannot easily stream binary responses.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    GetEmailScreenshotOptions getEmailScreenshotOptions = new GetEmailScreenshotOptions(); // GetEmailScreenshotOptions | 
    try {
      EmailScreenshotResult result = apiInstance.getEmailScreenshotAsBase64(emailId, getEmailScreenshotOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailScreenshotAsBase64");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |
| **getEmailScreenshotOptions** | [**GetEmailScreenshotOptions**](GetEmailScreenshotOptions)|  | |

### Return type

[**EmailScreenshotResult**](EmailScreenshotResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailScreenshotAsBinary"></a>
# **getEmailScreenshotAsBinary**
> getEmailScreenshotAsBinary(emailId, getEmailScreenshotOptions).execute();

Take a screenshot of an email in a browser

Renders the email in a browser engine and returns PNG bytes. Intended for visual QA and rendering regression checks.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    GetEmailScreenshotOptions getEmailScreenshotOptions = new GetEmailScreenshotOptions(); // GetEmailScreenshotOptions | 
    try {
      apiInstance.getEmailScreenshotAsBinary(emailId, getEmailScreenshotOptions)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailScreenshotAsBinary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |
| **getEmailScreenshotOptions** | [**GetEmailScreenshotOptions**](GetEmailScreenshotOptions)|  | |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailSignature"></a>
# **getEmailSignature**
> EmailSignatureParseResult getEmailSignature(emailId).execute();

Extract signature from an inbound email

Attempts to parse a sender signature block from an email body. Uses raw MIME content parts when possible and falls back to hydrated body parsing. This is heuristic and may not be accurate for all email clients or formats.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to extract signature from
    try {
      EmailSignatureParseResult result = apiInstance.getEmailSignature(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailSignature");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to extract signature from | |

### Return type

[**EmailSignatureParseResult**](EmailSignatureParseResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailSummary"></a>
# **getEmailSummary**
> EmailPreview getEmailSummary(emailId).decode(decode).execute();

Get email summary (headers/metadata only)

Returns lightweight metadata and headers for an email. Use &#x60;getEmail&#x60; for hydrated body content or &#x60;getRawEmail&#x60; for original SMTP content.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Boolean decode = true; // Boolean | Deprecated and ignored. Retained for backwards compatibility.
    try {
      EmailPreview result = apiInstance.getEmailSummary(emailId)
            .decode(decode)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |
| **decode** | **Boolean**| Deprecated and ignored. Retained for backwards compatibility. | [optional] |

### Return type

[**EmailPreview**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailTextLines"></a>
# **getEmailTextLines**
> EmailTextLinesResult getEmailTextLines(emailId).decodeHtmlEntities(decodeHtmlEntities).lineSeparator(lineSeparator).execute();

Extract normalized text lines from email body

Converts email body content to line-based plain text with optional HTML entity decoding and custom line separator.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to fetch text for
    Boolean decodeHtmlEntities = true; // Boolean | Decode HTML entities
    String lineSeparator = "lineSeparator_example"; // String | Line separator character
    try {
      EmailTextLinesResult result = apiInstance.getEmailTextLines(emailId)
            .decodeHtmlEntities(decodeHtmlEntities)
            .lineSeparator(lineSeparator)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailTextLines");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to fetch text for | |
| **decodeHtmlEntities** | **Boolean**| Decode HTML entities | [optional] |
| **lineSeparator** | **String**| Line separator character | [optional] |

### Return type

[**EmailTextLinesResult**](EmailTextLinesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailThread"></a>
# **getEmailThread**
> EmailThreadDto getEmailThread(threadId).execute();

Get email thread metadata by thread ID

Returns thread metadata built from RFC 5322 &#x60;Message-ID&#x60;, &#x60;In-Reply-To&#x60;, and &#x60;References&#x60; headers. Use &#x60;getEmailThreadItems&#x60; to fetch the thread messages.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID threadId = UUID.randomUUID(); // UUID | 
    try {
      EmailThreadDto result = apiInstance.getEmailThread(threadId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailThread");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | **UUID**|  | |

### Return type

[**EmailThreadDto**](EmailThreadDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailThreadItems"></a>
# **getEmailThreadItems**
> EmailThreadItemsDto getEmailThreadItems(threadId).sort(sort).execute();

Get messages in a specific email thread

Returns all messages in a thread ordered by &#x60;createdAt&#x60; using the requested sort direction.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID threadId = UUID.randomUUID(); // UUID | 
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      EmailThreadItemsDto result = apiInstance.getEmailThreadItems(threadId)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailThreadItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **threadId** | **UUID**|  | |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**EmailThreadItemsDto**](EmailThreadItemsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailThreads"></a>
# **getEmailThreads**
> PageEmailThreadProjection getEmailThreads().htmlSelector(htmlSelector).page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).execute();

List email threads in paginated form

Lists conversation threads inferred from &#x60;Message-ID&#x60;, &#x60;In-Reply-To&#x60;, and &#x60;References&#x60;. Supports filtering by inbox, search text, and time range.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID htmlSelector = UUID.randomUUID(); // UUID | Optional inbox filter. Query parameter name is `htmlSelector` for legacy compatibility.
    Integer page = 0; // Integer | Optional page index in email thread pagination
    Integer size = 20; // Integer | Optional page size in email thread pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter search filter for email threads.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter email threads created since time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter emails threads created before given date time
    try {
      PageEmailThreadProjection result = apiInstance.getEmailThreads()
            .htmlSelector(htmlSelector)
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailThreads");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **htmlSelector** | **UUID**| Optional inbox filter. Query parameter name is &#x60;htmlSelector&#x60; for legacy compatibility. | [optional] |
| **page** | **Integer**| Optional page index in email thread pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in email thread pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter search filter for email threads. | [optional] |
| **since** | **OffsetDateTime**| Optional filter email threads created since time | [optional] |
| **before** | **OffsetDateTime**| Optional filter emails threads created before given date time | [optional] |

### Return type

[**PageEmailThreadProjection**](PageEmailThreadProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailsOffsetPaginated"></a>
# **getEmailsOffsetPaginated**
> PageEmailProjection getEmailsOffsetPaginated().inboxId(inboxId).page(page).size(size).sort(sort).unreadOnly(unreadOnly).searchFilter(searchFilter).since(since).before(before).favourited(favourited).syncConnectors(syncConnectors).plusAddressId(plusAddressId).include(include).execute();

Get all emails in all inboxes in paginated form. Email API list all.

Offset-style pagination endpoint for listing emails across inboxes. Supports inbox filters, unread-only, search, date boundaries, favourites, connector sync, plus-address filtering, and explicit include IDs.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    List<UUID> inboxId = Arrays.asList(); // List<UUID> | Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
    Integer page = 0; // Integer | Optional page index in email list pagination
    Integer size = 20; // Integer | Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean unreadOnly = false; // Boolean | Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
    String searchFilter = "searchFilter_example"; // String | Optional search filter. Full email addresses match sender and receiving inbox email or receiving plus-address full address exactly. Address-like fragments containing @ (for example +alias@) also match sender, receiving inbox email, and receiving plus-address full address by contains. General text search matches sender, subject, and ID.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter emails received after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter emails received before given date time
    Boolean favourited = true; // Boolean | Optional filter emails that are favourited
    Boolean syncConnectors = true; // Boolean | Sync connectors
    UUID plusAddressId = UUID.randomUUID(); // UUID | Optional plus address ID filter
    List<UUID> include = Arrays.asList(); // List<UUID> | Optional list of IDs to include in result
    try {
      PageEmailProjection result = apiInstance.getEmailsOffsetPaginated()
            .inboxId(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .unreadOnly(unreadOnly)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .favourited(favourited)
            .syncConnectors(syncConnectors)
            .plusAddressId(plusAddressId)
            .include(include)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailsOffsetPaginated");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | [**List&lt;UUID&gt;**](UUID)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional] |
| **page** | **Integer**| Optional page index in email list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **unreadOnly** | **Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false] |
| **searchFilter** | **String**| Optional search filter. Full email addresses match sender and receiving inbox email or receiving plus-address full address exactly. Address-like fragments containing @ (for example +alias@) also match sender, receiving inbox email, and receiving plus-address full address by contains. General text search matches sender, subject, and ID. | [optional] |
| **since** | **OffsetDateTime**| Optional filter emails received after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter emails received before given date time | [optional] |
| **favourited** | **Boolean**| Optional filter emails that are favourited | [optional] |
| **syncConnectors** | **Boolean**| Sync connectors | [optional] |
| **plusAddressId** | **UUID**| Optional plus address ID filter | [optional] |
| **include** | [**List&lt;UUID&gt;**](UUID)| Optional list of IDs to include in result | [optional] |

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailsPaginated"></a>
# **getEmailsPaginated**
> PageEmailProjection getEmailsPaginated().inboxId(inboxId).page(page).size(size).sort(sort).unreadOnly(unreadOnly).searchFilter(searchFilter).since(since).before(before).syncConnectors(syncConnectors).plusAddressId(plusAddressId).favourited(favourited).execute();

Get all emails in all inboxes in paginated form. Email API list all.

Primary paginated email listing endpoint. Returns emails across inboxes with support for inbox filters, unread-only, search, date boundaries, favourites, connector sync, and plus-address filtering.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    List<UUID> inboxId = Arrays.asList(); // List<UUID> | Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
    Integer page = 0; // Integer | Optional page index in email list pagination
    Integer size = 20; // Integer | Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean unreadOnly = false; // Boolean | Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
    String searchFilter = "searchFilter_example"; // String | Optional search filter. Full email addresses match sender and receiving inbox email or receiving plus-address full address exactly. Address-like fragments containing @ (for example +alias@) also match sender, receiving inbox email, and receiving plus-address full address by contains. General text search matches sender, subject, and ID.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter emails received after given date time. If unset will use time 24hours prior to now.
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter emails received before given date time
    Boolean syncConnectors = true; // Boolean | Sync connectors
    UUID plusAddressId = UUID.randomUUID(); // UUID | Optional plus address ID filter
    Boolean favourited = true; // Boolean | Optional filter emails that are favourited
    try {
      PageEmailProjection result = apiInstance.getEmailsPaginated()
            .inboxId(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .unreadOnly(unreadOnly)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .syncConnectors(syncConnectors)
            .plusAddressId(plusAddressId)
            .favourited(favourited)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getEmailsPaginated");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | [**List&lt;UUID&gt;**](UUID)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional] |
| **page** | **Integer**| Optional page index in email list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **unreadOnly** | **Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false] |
| **searchFilter** | **String**| Optional search filter. Full email addresses match sender and receiving inbox email or receiving plus-address full address exactly. Address-like fragments containing @ (for example +alias@) also match sender, receiving inbox email, and receiving plus-address full address by contains. General text search matches sender, subject, and ID. | [optional] |
| **since** | **OffsetDateTime**| Optional filter emails received after given date time. If unset will use time 24hours prior to now. | [optional] |
| **before** | **OffsetDateTime**| Optional filter emails received before given date time | [optional] |
| **syncConnectors** | **Boolean**| Sync connectors | [optional] |
| **plusAddressId** | **UUID**| Optional plus address ID filter | [optional] |
| **favourited** | **Boolean**| Optional filter emails that are favourited | [optional] |

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getGravatarUrlForEmailAddress"></a>
# **getGravatarUrlForEmailAddress**
> GravatarUrl getGravatarUrlForEmailAddress(emailAddress).size(size).execute();

Get Gravatar URL for an email address

Builds a Gravatar image URL from the provided email address and optional size. This endpoint does not fetch image bytes; it only returns the computed URL.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    String size = "size_example"; // String | 
    try {
      GravatarUrl result = apiInstance.getGravatarUrlForEmailAddress(emailAddress)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getGravatarUrlForEmailAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailAddress** | **String**|  | |
| **size** | **String**|  | [optional] |

### Return type

[**GravatarUrl**](GravatarUrl)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLatestEmail"></a>
# **getLatestEmail**
> Email getLatestEmail().inboxIds(inboxIds).execute();

Get latest email in all inboxes. Most recently received.

Returns the most recently received email across all inboxes or an optional subset of inbox IDs.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    List<UUID> inboxIds = Arrays.asList(); // List<UUID> | Optional set of inboxes to filter by. Only get the latest email from these inbox IDs. If not provided will search across all inboxes
    try {
      Email result = apiInstance.getLatestEmail()
            .inboxIds(inboxIds)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getLatestEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxIds** | [**List&lt;UUID&gt;**](UUID)| Optional set of inboxes to filter by. Only get the latest email from these inbox IDs. If not provided will search across all inboxes | [optional] |

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLatestEmailInInbox1"></a>
# **getLatestEmailInInbox1**
> Email getLatestEmailInInbox1(inboxId).execute();

Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.

Returns the newest email for the specified inbox ID. For polling/wait semantics use wait endpoints.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to get the latest email from
    try {
      Email result = apiInstance.getLatestEmailInInbox1(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getLatestEmailInInbox1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of the inbox you want to get the latest email from | |

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOrganizationEmailsPaginated"></a>
# **getOrganizationEmailsPaginated**
> PageEmailProjection getOrganizationEmailsPaginated().inboxId(inboxId).page(page).size(size).sort(sort).unreadOnly(unreadOnly).searchFilter(searchFilter).since(since).before(before).syncConnectors(syncConnectors).favourited(favourited).plusAddressId(plusAddressId).execute();

List organization-visible emails

Returns paginated emails visible through organization/team access. Supports inbox filtering, unread-only filtering, search, favourites, plus-address filtering, and optional connector sync.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    List<UUID> inboxId = Arrays.asList(); // List<UUID> | Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account.
    Integer page = 0; // Integer | Optional page index in email list pagination
    Integer size = 20; // Integer | Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean unreadOnly = false; // Boolean | Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly
    String searchFilter = "searchFilter_example"; // String | Optional search filter search filter for emails.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter emails received after given date time. If unset will use time 24hours prior to now.
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter emails received before given date time
    Boolean syncConnectors = true; // Boolean | Sync connectors
    Boolean favourited = true; // Boolean | Search only favorited emails
    UUID plusAddressId = UUID.randomUUID(); // UUID | Optional plus address ID filter
    try {
      PageEmailProjection result = apiInstance.getOrganizationEmailsPaginated()
            .inboxId(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .unreadOnly(unreadOnly)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .syncConnectors(syncConnectors)
            .favourited(favourited)
            .plusAddressId(plusAddressId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getOrganizationEmailsPaginated");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | [**List&lt;UUID&gt;**](UUID)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional] |
| **page** | **Integer**| Optional page index in email list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **unreadOnly** | **Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false] |
| **searchFilter** | **String**| Optional search filter search filter for emails. | [optional] |
| **since** | **OffsetDateTime**| Optional filter emails received after given date time. If unset will use time 24hours prior to now. | [optional] |
| **before** | **OffsetDateTime**| Optional filter emails received before given date time | [optional] |
| **syncConnectors** | **Boolean**| Sync connectors | [optional] |
| **favourited** | **Boolean**| Search only favorited emails | [optional] |
| **plusAddressId** | **UUID**| Optional plus address ID filter | [optional] |

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRawEmailContents"></a>
# **getRawEmailContents**
> getRawEmailContents(emailId).execute();

Get raw email string. Returns unparsed raw SMTP message with headers and body.

Returns the original unparsed SMTP/MIME message as &#x60;text/plain&#x60;. Use JSON variant if your client expects JSON transport.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    try {
      apiInstance.getRawEmailContents(emailId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getRawEmailContents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRawEmailJson"></a>
# **getRawEmailJson**
> RawEmailJson getRawEmailJson(emailId).execute();

Get raw email in JSON. Unparsed SMTP message in JSON wrapper format.

Returns the original unparsed SMTP/MIME message wrapped in a JSON DTO for API clients that avoid plain-text stream responses.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    try {
      RawEmailJson result = apiInstance.getRawEmailJson(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getRawEmailJson");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |

### Return type

[**RawEmailJson**](RawEmailJson)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUnreadEmailCount"></a>
# **getUnreadEmailCount**
> UnreadCount getUnreadEmailCount().inboxId(inboxId).execute();

Get unread email count

Returns unread email count. An email is considered read after dashboard/API retrieval depending on your read workflow.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID filter for unread count scope
    try {
      UnreadCount result = apiInstance.getUnreadEmailCount()
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getUnreadEmailCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| Inbox ID filter for unread count scope | [optional] |

### Return type

[**UnreadCount**](UnreadCount)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="markAllAsRead"></a>
# **markAllAsRead**
> markAllAsRead().read(read).inboxId(inboxId).execute();

Mark all emails as read or unread

Sets read state for all emails, optionally scoped to one inbox. Use &#x60;read&#x3D;false&#x60; to reset unread state in bulk.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    Boolean read = true; // Boolean | What value to assign to email read property. Default true.
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox ID filter
    try {
      apiInstance.markAllAsRead()
            .read(read)
            .inboxId(inboxId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#markAllAsRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **read** | **Boolean**| What value to assign to email read property. Default true. | [optional] [default to true] |
| **inboxId** | **UUID**| Optional inbox ID filter | [optional] |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="markAsRead"></a>
# **markAsRead**
> EmailPreview markAsRead(emailId).read(read).execute();

Mark an email as read or unread

Sets read state for one email. Useful when implementing custom mailbox workflows that treat viewed messages as unread.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Boolean read = true; // Boolean | What value to assign to email read property. Default true.
    try {
      EmailPreview result = apiInstance.markAsRead(emailId)
            .read(read)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#markAsRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**|  | |
| **read** | **Boolean**| What value to assign to email read property. Default true. | [optional] [default to true] |

### Return type

[**EmailPreview**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="replyToEmail"></a>
# **replyToEmail**
> SentEmailDto replyToEmail(emailId, replyToEmailOptions).execute();

Reply to an email

Sends a reply using the original conversation context (subject/thread headers). Reply target resolution honors sender/reply-to semantics.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of the email that should be replied to
    ReplyToEmailOptions replyToEmailOptions = new ReplyToEmailOptions(); // ReplyToEmailOptions | 
    try {
      SentEmailDto result = apiInstance.replyToEmail(emailId, replyToEmailOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#replyToEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of the email that should be replied to | |
| **replyToEmailOptions** | [**ReplyToEmailOptions**](ReplyToEmailOptions)|  | |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchEmails"></a>
# **searchEmails**
> PageEmailProjection searchEmails(searchEmailsOptions).syncConnectors(syncConnectors).favourited(favourited).plusAddressId(plusAddressId).execute();

Get all emails by search criteria. Return in paginated form.

Searches emails by sender/recipient/address/subject/id fields and returns paginated matches. Does not perform full-text body search.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    SearchEmailsOptions searchEmailsOptions = new SearchEmailsOptions(); // SearchEmailsOptions | 
    Boolean syncConnectors = true; // Boolean | Sync connectors
    Boolean favourited = true; // Boolean | Search only favourited emails
    UUID plusAddressId = UUID.randomUUID(); // UUID | Optional plus address ID filter
    try {
      PageEmailProjection result = apiInstance.searchEmails(searchEmailsOptions)
            .syncConnectors(syncConnectors)
            .favourited(favourited)
            .plusAddressId(plusAddressId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#searchEmails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchEmailsOptions** | [**SearchEmailsOptions**](SearchEmailsOptions)|  | |
| **syncConnectors** | **Boolean**| Sync connectors | [optional] |
| **favourited** | **Boolean**| Search only favourited emails | [optional] |
| **plusAddressId** | **UUID**| Optional plus address ID filter | [optional] |

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendEmailSourceOptional"></a>
# **sendEmailSourceOptional**
> sendEmailSourceOptional(sendEmailOptions).inboxId(inboxId).useDomainPool(useDomainPool).virtualSend(virtualSend).execute();

Send email

Sends an email from an existing inbox, or creates a temporary inbox when &#x60;inboxId&#x60; is not provided. Supports &#x60;useDomainPool&#x60; and &#x60;virtualSend&#x60; inbox creation behavior for convenience sends.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    Boolean useDomainPool = true; // Boolean | Use domain pool. Optionally create inbox to send from using the mailslurp domain pool.
    Boolean virtualSend = true; // Boolean | Optionally create inbox to send from that is a virtual inbox and won't send to external addresses
    try {
      apiInstance.sendEmailSourceOptional(sendEmailOptions)
            .inboxId(inboxId)
            .useDomainPool(useDomainPool)
            .virtualSend(virtualSend)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#sendEmailSourceOptional");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | [optional] |
| **useDomainPool** | **Boolean**| Use domain pool. Optionally create inbox to send from using the mailslurp domain pool. | [optional] |
| **virtualSend** | **Boolean**| Optionally create inbox to send from that is a virtual inbox and won&#39;t send to external addresses | [optional] |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="setEmailFavourited"></a>
# **setEmailFavourited**
> setEmailFavourited(emailId, favourited).execute();

Set email favourited state

Sets favourite state for an email for dashboard/search workflows.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to set favourite state
    Boolean favourited = true; // Boolean | 
    try {
      apiInstance.setEmailFavourited(emailId, favourited)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#setEmailFavourited");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email to set favourite state | |
| **favourited** | **Boolean**|  | |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="validateEmail"></a>
# **validateEmail**
> ValidationDto validateEmail(emailId).execute();

Validate email HTML contents

Runs HTML validation on the email body when HTML is present. Non-HTML emails are treated as valid for this check.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    try {
      ValidationDto result = apiInstance.validateEmail(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#validateEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailId** | **UUID**| ID of email | |

### Return type

[**ValidationDto**](ValidationDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

