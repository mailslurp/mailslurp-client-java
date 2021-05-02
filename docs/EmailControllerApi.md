# EmailControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllEmails**](EmailControllerApi#deleteAllEmails) | **DELETE** /emails | Delete all emails in all inboxes.
[**deleteEmail**](EmailControllerApi#deleteEmail) | **DELETE** /emails/{emailId} | Delete an email
[**downloadAttachment**](EmailControllerApi#downloadAttachment) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment bytes. Returned as &#x60;octet-stream&#x60; with content type header. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints and convert the base 64 encoded content to a file or string.
[**downloadAttachmentBase64**](EmailControllerApi#downloadAttachmentBase64) | **GET** /emails/{emailId}/attachments/{attachmentId}/base64 | Get email attachment as base64 encoded string alternative to binary responses. Decode the &#x60;base64FileContents&#x60; as a &#x60;utf-8&#x60; encoded string or array of bytes depending on the &#x60;contentType&#x60;.
[**forwardEmail**](EmailControllerApi#forwardEmail) | **POST** /emails/{emailId}/forward | Forward email to recipients
[**getAttachmentMetaData**](EmailControllerApi#getAttachmentMetaData) | **GET** /emails/{emailId}/attachments/{attachmentId}/metadata | Get email attachment metadata. This is the &#x60;contentType&#x60; and &#x60;contentLength&#x60; of an attachment. To get the individual attachments  use the &#x60;downloadAttachment&#x60; methods.
[**getAttachments**](EmailControllerApi#getAttachments) | **GET** /emails/{emailId}/attachments | Get all email attachment metadata. Metadata includes name and attachment size.
[**getEmail**](EmailControllerApi#getEmail) | **GET** /emails/{emailId} | Get email content
[**getEmailContentMatch**](EmailControllerApi#getEmailContentMatch) | **POST** /emails/{emailId}/contentMatch | Get email content regex pattern match results. Runs regex against email body and returns match groups.
[**getEmailHTML**](EmailControllerApi#getEmailHTML) | **GET** /emails/{emailId}/html | Get email content as HTML. For displaying emails in browser context.
[**getEmailHTMLQuery**](EmailControllerApi#getEmailHTMLQuery) | **GET** /emails/{emailId}/htmlQuery | Parse and return text from an email, stripping HTML and decoding encoded characters
[**getEmailTextLines**](EmailControllerApi#getEmailTextLines) | **GET** /emails/{emailId}/textLines | Parse and return text from an email, stripping HTML and decoding encoded characters
[**getEmailsPaginated**](EmailControllerApi#getEmailsPaginated) | **GET** /emails | Get all emails in all inboxes. Email API list all.
[**getLatestEmail**](EmailControllerApi#getLatestEmail) | **GET** /emails/latest | Get latest email in all inboxes. Most recently received.
[**getLatestEmailInInbox**](EmailControllerApi#getLatestEmailInInbox) | **GET** /emails/latestIn | Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.
[**getOrganizationEmailsPaginated**](EmailControllerApi#getOrganizationEmailsPaginated) | **GET** /emails/organization | Get all organization emails. List team or shared test email accounts
[**getRawEmailContents**](EmailControllerApi#getRawEmailContents) | **GET** /emails/{emailId}/raw | Get raw email string. Returns unparsed raw SMTP message with headers and body.
[**getRawEmailJson**](EmailControllerApi#getRawEmailJson) | **GET** /emails/{emailId}/raw/json | Get raw email in JSON. Unparsed SMTP message in JSON wrapper format.
[**getUnreadEmailCount**](EmailControllerApi#getUnreadEmailCount) | **GET** /emails/unreadCount | Get unread email count
[**replyToEmail**](EmailControllerApi#replyToEmail) | **PUT** /emails/{emailId} | Reply to an email
[**validateEmail**](EmailControllerApi#validateEmail) | **POST** /emails/{emailId}/validate | Validate email HTML contents


<a name="deleteAllEmails"></a>
# **deleteAllEmails**
> deleteAllEmails()

Delete all emails in all inboxes.

Deletes all emails in your account. Be careful as emails cannot be recovered

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    try {
      apiInstance.deleteAllEmails();
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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="deleteEmail"></a>
# **deleteEmail**
> deleteEmail(emailId)

Delete an email

Deletes an email and removes it from the inbox. Deleted emails cannot be recovered.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email to delete
    try {
      apiInstance.deleteEmail(emailId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email to delete |

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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="downloadAttachment"></a>
# **downloadAttachment**
> byte[] downloadAttachment(attachmentId, emailId, apiKey)

Get email attachment bytes. Returned as &#x60;octet-stream&#x60; with content type header. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints and convert the base 64 encoded content to a file or string.

Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    UUID emailId = new UUID(); // UUID | ID of email
    String apiKey = "apiKey_example"; // String | Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly.
    try {
      byte[] result = apiInstance.downloadAttachment(attachmentId, emailId, apiKey);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| ID of attachment |
 **emailId** | [**UUID**]()| ID of email |
 **apiKey** | **String**| Can pass apiKey in url for this request if you wish to download the file in a browser. Content type will be set to original content type of the attachment file. This is so that browsers can download the file correctly. | [optional]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="downloadAttachmentBase64"></a>
# **downloadAttachmentBase64**
> DownloadAttachmentDto downloadAttachmentBase64(attachmentId, emailId)

Get email attachment as base64 encoded string alternative to binary responses. Decode the &#x60;base64FileContents&#x60; as a &#x60;utf-8&#x60; encoded string or array of bytes depending on the &#x60;contentType&#x60;.

Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the &#x60;downloadAttachment&#x60; method but allows some clients to get around issues with binary responses.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    UUID emailId = new UUID(); // UUID | ID of email
    try {
      DownloadAttachmentDto result = apiInstance.downloadAttachmentBase64(attachmentId, emailId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| ID of attachment |
 **emailId** | [**UUID**]()| ID of email |

### Return type

[**DownloadAttachmentDto**](DownloadAttachmentDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="forwardEmail"></a>
# **forwardEmail**
> forwardEmail(emailId, forwardEmailOptions)

Forward email to recipients

Forward an existing email to new recipients.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email
    ForwardEmailOptions forwardEmailOptions = new ForwardEmailOptions(); // ForwardEmailOptions | forwardEmailOptions
    try {
      apiInstance.forwardEmail(emailId, forwardEmailOptions);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email |
 **forwardEmailOptions** | [**ForwardEmailOptions**](ForwardEmailOptions)| forwardEmailOptions |

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
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getAttachmentMetaData"></a>
# **getAttachmentMetaData**
> AttachmentMetaData getAttachmentMetaData(attachmentId, emailId)

Get email attachment metadata. This is the &#x60;contentType&#x60; and &#x60;contentLength&#x60; of an attachment. To get the individual attachments  use the &#x60;downloadAttachment&#x60; methods.

Returns the metadata such as name and content-type for a given attachment and email.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    UUID emailId = new UUID(); // UUID | ID of email
    try {
      AttachmentMetaData result = apiInstance.getAttachmentMetaData(attachmentId, emailId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **String**| ID of attachment |
 **emailId** | [**UUID**]()| ID of email |

### Return type

[**AttachmentMetaData**](AttachmentMetaData)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getAttachments"></a>
# **getAttachments**
> List&lt;AttachmentMetaData&gt; getAttachments(emailId)

Get all email attachment metadata. Metadata includes name and attachment size.

Returns an array of attachment metadata such as name and content-type for a given email if present.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email
    try {
      List<AttachmentMetaData> result = apiInstance.getAttachments(emailId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getAttachments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email |

### Return type

[**List&lt;AttachmentMetaData&gt;**](AttachmentMetaData)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getEmail"></a>
# **getEmail**
> Email getEmail(emailId, decode)

Get email content

Returns a email summary object with headers and content. To retrieve the raw unparsed email use the getRawEmail endpoints

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | emailId
    Boolean decode = false; // Boolean | Decode email body quoted-printable encoding to plain text. SMTP servers often encode text using quoted-printable format (for instance `=D7`). This can be a pain for testing
    try {
      Email result = apiInstance.getEmail(emailId, decode);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| emailId |
 **decode** | **Boolean**| Decode email body quoted-printable encoding to plain text. SMTP servers often encode text using quoted-printable format (for instance &#x60;&#x3D;D7&#x60;). This can be a pain for testing | [optional] [default to false]

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getEmailContentMatch"></a>
# **getEmailContentMatch**
> EmailContentMatchResult getEmailContentMatch(emailId, contentMatchOptions)

Get email content regex pattern match results. Runs regex against email body and returns match groups.

Return the matches for a given Java style regex pattern. Do not include the typical &#x60;/&#x60; at start or end of regex in some languages. Given an example &#x60;your code is: 12345&#x60; the pattern to extract match looks like &#x60;code is: (\\d{6})&#x60;. This will return an array of matches with the first matching the entire pattern and the subsequent matching the groups: &#x60;[&#39;code is: 123456&#39;, &#39;123456&#39;]&#x60; See https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html for more information of available patterns. 

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email to match against
    ContentMatchOptions contentMatchOptions = new ContentMatchOptions(); // ContentMatchOptions | contentMatchOptions
    try {
      EmailContentMatchResult result = apiInstance.getEmailContentMatch(emailId, contentMatchOptions);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email to match against |
 **contentMatchOptions** | [**ContentMatchOptions**](ContentMatchOptions)| contentMatchOptions |

### Return type

[**EmailContentMatchResult**](EmailContentMatchResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getEmailHTML"></a>
# **getEmailHTML**
> String getEmailHTML(emailId, decode)

Get email content as HTML. For displaying emails in browser context.

Retrieve email content as HTML response for viewing in browsers. Decodes quoted-printable entities and converts charset to UTF-8. Pass your API KEY as a request parameter when viewing in a browser: &#x60;?apiKey&#x3D;xxx&#x60;

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | emailId
    Boolean decode = false; // Boolean | decode
    try {
      String result = apiInstance.getEmailHTML(emailId, decode);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| emailId |
 **decode** | **Boolean**| decode | [optional] [default to false]

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getEmailHTMLQuery"></a>
# **getEmailHTMLQuery**
> EmailTextLinesResult getEmailHTMLQuery(emailId, htmlSelector)

Parse and return text from an email, stripping HTML and decoding encoded characters

Parse an email body and return the content as an array of text. HTML parsing uses JSoup which supports JQuery/CSS style selectors

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email to perform HTML query on
    String htmlSelector = "htmlSelector_example"; // String | HTML selector to search for. Uses JQuery/JSoup/CSS style selector like '.my-div' to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information.
    try {
      EmailTextLinesResult result = apiInstance.getEmailHTMLQuery(emailId, htmlSelector);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email to perform HTML query on |
 **htmlSelector** | **String**| HTML selector to search for. Uses JQuery/JSoup/CSS style selector like &#39;.my-div&#39; to match content. See https://jsoup.org/apidocs/org/jsoup/select/Selector.html for more information. | [optional]

### Return type

[**EmailTextLinesResult**](EmailTextLinesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getEmailTextLines"></a>
# **getEmailTextLines**
> EmailTextLinesResult getEmailTextLines(emailId, decodeHtmlEntities, lineSeparator)

Parse and return text from an email, stripping HTML and decoding encoded characters

Parse an email body and return the content as an array of strings. HTML parsing uses JSoup and UNIX line separators.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email to fetch text for
    Boolean decodeHtmlEntities = true; // Boolean | Decode HTML entities
    String lineSeparator = "lineSeparator_example"; // String | Line separator character
    try {
      EmailTextLinesResult result = apiInstance.getEmailTextLines(emailId, decodeHtmlEntities, lineSeparator);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email to fetch text for |
 **decodeHtmlEntities** | **Boolean**| Decode HTML entities | [optional]
 **lineSeparator** | **String**| Line separator character | [optional]

### Return type

[**EmailTextLinesResult**](EmailTextLinesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getEmailsPaginated"></a>
# **getEmailsPaginated**
> PageEmailProjection getEmailsPaginated(inboxId, page, size, sort, unreadOnly)

Get all emails in all inboxes. Email API list all.

By default returns all emails across all inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
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
    try {
      PageEmailProjection result = apiInstance.getEmailsPaginated(inboxId, page, size, sort, unreadOnly);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**List&lt;UUID&gt;**](UUID)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional]
 **page** | **Integer**| Optional page index in email list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **unreadOnly** | **Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false]

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getLatestEmail"></a>
# **getLatestEmail**
> Email getLatestEmail(inboxIds)

Get latest email in all inboxes. Most recently received.

Get the newest email in all inboxes or in a passed set of inbox IDs

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    List<UUID> inboxIds = Arrays.asList(); // List<UUID> | Optional set of inboxes to filter by. Only get the latest email from these inbox IDs
    try {
      Email result = apiInstance.getLatestEmail(inboxIds);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxIds** | [**List&lt;UUID&gt;**](UUID)| Optional set of inboxes to filter by. Only get the latest email from these inbox IDs | [optional]

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getLatestEmailInInbox"></a>
# **getLatestEmailInInbox**
> Email getLatestEmailInInbox(inboxId)

Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.

Get the newest email in all inboxes or in a passed set of inbox IDs

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | ID of the inbox you want to get the latest email from
    try {
      Email result = apiInstance.getLatestEmailInInbox(inboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailControllerApi#getLatestEmailInInbox");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**]()| ID of the inbox you want to get the latest email from | [optional]

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getOrganizationEmailsPaginated"></a>
# **getOrganizationEmailsPaginated**
> PageEmailProjection getOrganizationEmailsPaginated(inboxId, page, size, sort, unreadOnly)

Get all organization emails. List team or shared test email accounts

By default returns all emails across all team inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
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
    try {
      PageEmailProjection result = apiInstance.getOrganizationEmailsPaginated(inboxId, page, size, sort, unreadOnly);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**List&lt;UUID&gt;**](UUID)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional]
 **page** | **Integer**| Optional page index in email list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **unreadOnly** | **Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false]

### Return type

[**PageEmailProjection**](PageEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getRawEmailContents"></a>
# **getRawEmailContents**
> String getRawEmailContents(emailId)

Get raw email string. Returns unparsed raw SMTP message with headers and body.

Returns a raw, unparsed, and unprocessed email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawEmailJson endpoint

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email
    try {
      String result = apiInstance.getRawEmailContents(emailId);
      System.out.println(result);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email |

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | text/plain raw email |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getRawEmailJson"></a>
# **getRawEmailJson**
> RawEmailJson getRawEmailJson(emailId)

Get raw email in JSON. Unparsed SMTP message in JSON wrapper format.

Returns a raw, unparsed, and unprocessed email wrapped in a JSON response object for easier handling when compared with the getRawEmail text/plain response

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email
    try {
      RawEmailJson result = apiInstance.getRawEmailJson(emailId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email |

### Return type

[**RawEmailJson**](RawEmailJson)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="getUnreadEmailCount"></a>
# **getUnreadEmailCount**
> UnreadCount getUnreadEmailCount()

Get unread email count

Get number of emails unread. Unread means has not been viewed in dashboard or returned in an email API response

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    try {
      UnreadCount result = apiInstance.getUnreadEmailCount();
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
This endpoint does not need any parameter.

### Return type

[**UnreadCount**](UnreadCount)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="replyToEmail"></a>
# **replyToEmail**
> SentEmailDto replyToEmail(emailId, replyToEmailOptions)

Reply to an email

Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails &#x60;to&#x60;, &#x60;cc&#x60;, and &#x60;bcc&#x60;.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of the email that should be replied to
    ReplyToEmailOptions replyToEmailOptions = new ReplyToEmailOptions(); // ReplyToEmailOptions | replyToEmailOptions
    try {
      SentEmailDto result = apiInstance.replyToEmail(emailId, replyToEmailOptions);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of the email that should be replied to |
 **replyToEmailOptions** | [**ReplyToEmailOptions**](ReplyToEmailOptions)| replyToEmailOptions |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="validateEmail"></a>
# **validateEmail**
> ValidationDto validateEmail(emailId)

Validate email HTML contents

Validate the HTML content of email if HTML is found. Considered valid if no HTML.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailControllerApi apiInstance = new EmailControllerApi(defaultClient);
    UUID emailId = new UUID(); // UUID | ID of email
    try {
      ValidationDto result = apiInstance.validateEmail(emailId);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**]()| ID of email |

### Return type

[**ValidationDto**](ValidationDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

