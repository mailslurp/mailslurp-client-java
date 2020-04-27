# EmailControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAllEmails**](EmailControllerApi.md#deleteAllEmails) | **DELETE** /emails | Delete all emails
[**deleteEmail**](EmailControllerApi.md#deleteEmail) | **DELETE** /emails/{emailId} | Delete an email
[**downloadAttachment**](EmailControllerApi.md#downloadAttachment) | **GET** /emails/{emailId}/attachments/{attachmentId} | Get email attachment bytes
[**forwardEmail**](EmailControllerApi.md#forwardEmail) | **POST** /emails/{emailId}/forward | Forward email
[**getAttachmentMetaData**](EmailControllerApi.md#getAttachmentMetaData) | **GET** /emails/{emailId}/attachments/{attachmentId}/metadata | Get email attachment metadata
[**getAttachments**](EmailControllerApi.md#getAttachments) | **GET** /emails/{emailId}/attachments | Get all email attachment metadata
[**getEmail**](EmailControllerApi.md#getEmail) | **GET** /emails/{emailId} | Get email content
[**getEmailHTML**](EmailControllerApi.md#getEmailHTML) | **GET** /emails/{emailId}/html | Get email content as HTML
[**getEmailsPaginated**](EmailControllerApi.md#getEmailsPaginated) | **GET** /emails | Get all emails
[**getRawEmailContents**](EmailControllerApi.md#getRawEmailContents) | **GET** /emails/{emailId}/raw | Get raw email string
[**getRawEmailJson**](EmailControllerApi.md#getRawEmailJson) | **GET** /emails/{emailId}/raw/json | Get raw email in JSON
[**getUnreadEmailCount**](EmailControllerApi.md#getUnreadEmailCount) | **GET** /emails/unreadCount | Get unread email count
[**validateEmail**](EmailControllerApi.md#validateEmail) | **POST** /emails/{emailId}/validate | Validate email


<a name="deleteAllEmails"></a>
# **deleteAllEmails**
> deleteAllEmails()

Delete all emails

Deletes all emails in your account. Be careful as emails cannot be recovered

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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

[API_KEY](../README.md#API_KEY)

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
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

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

Get email attachment bytes

Returns the specified attachment for a given email as a byte stream (file download). You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
    String attachmentId = "attachmentId_example"; // String | attachmentId
    UUID emailId = new UUID(); // UUID | emailId
    String apiKey = "apiKey_example"; // String | Can pass apiKey in url for this request if you wish to download the file in a browser
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
 **attachmentId** | **String**| attachmentId |
 **emailId** | [**UUID**](.md)| emailId |
 **apiKey** | **String**| Can pass apiKey in url for this request if you wish to download the file in a browser | [optional]

### Return type

**byte[]**

### Authorization

[API_KEY](../README.md#API_KEY)

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

<a name="forwardEmail"></a>
# **forwardEmail**
> forwardEmail(emailId, forwardEmailOptions)

Forward email

Forward an existing email to new recipients.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |
 **forwardEmailOptions** | [**ForwardEmailOptions**](ForwardEmailOptions.md)| forwardEmailOptions |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

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

Get email attachment metadata

Returns the metadata such as name and content-type for a given attachment and email.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
    String attachmentId = "attachmentId_example"; // String | attachmentId
    UUID emailId = new UUID(); // UUID | emailId
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
 **attachmentId** | **String**| attachmentId |
 **emailId** | [**UUID**](.md)| emailId |

### Return type

[**AttachmentMetaData**](AttachmentMetaData.md)

### Authorization

[API_KEY](../README.md#API_KEY)

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

Get all email attachment metadata

Returns an array of attachment metadata such as name and content-type for a given email if present.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |

### Return type

[**List&lt;AttachmentMetaData&gt;**](AttachmentMetaData.md)

### Authorization

[API_KEY](../README.md#API_KEY)

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
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |
 **decode** | **Boolean**| Decode email body quoted-printable encoding to plain text. SMTP servers often encode text using quoted-printable format (for instance &#x60;&#x3D;D7&#x60;). This can be a pain for testing | [optional] [default to false]

### Return type

[**Email**](Email.md)

### Authorization

[API_KEY](../README.md#API_KEY)

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

<a name="getEmailHTML"></a>
# **getEmailHTML**
> String getEmailHTML(emailId, decode)

Get email content as HTML

Retrieve email content as HTML response for viewing in browsers. Decodes quoted-printable entities and converts charset to UTF-8. Pass your API KEY as a request parameter when viewing in a browser: &#x60;?apiKey&#x3D;xxx&#x60;

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |
 **decode** | **Boolean**| decode | [optional] [default to false]

### Return type

**String**

### Authorization

[API_KEY](../README.md#API_KEY)

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

<a name="getEmailsPaginated"></a>
# **getEmailsPaginated**
> PageEmailProjection getEmailsPaginated(inboxId, page, size, sort, unreadOnly)

Get all emails

By default returns all emails across all inboxes sorted by ascending created at date. Responses are paginated. You can restrict results to a list of inbox IDs. You can also filter out read messages

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
    Integer size = 20; // Integer | Optional page size in email list pagination
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
 **inboxId** | [**List&lt;UUID&gt;**](UUID.md)| Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. | [optional]
 **page** | **Integer**| Optional page index in email list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size in email list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **unreadOnly** | **Boolean**| Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false]

### Return type

[**PageEmailProjection**](PageEmailProjection.md)

### Authorization

[API_KEY](../README.md#API_KEY)

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

Get raw email string

Returns a raw, unparsed, and unprocessed email. If your client has issues processing the response it is likely due to the response content-type which is text/plain. If you need a JSON response content-type use the getRawEmailJson endpoint

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |

### Return type

**String**

### Authorization

[API_KEY](../README.md#API_KEY)

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

Get raw email in JSON

Returns a raw, unparsed, and unprocessed email wrapped in a JSON response object for easier handling when compared with the getRawEmail text/plain response

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |

### Return type

[**RawEmailJson**](RawEmailJson.md)

### Authorization

[API_KEY](../README.md#API_KEY)

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

Get number of emails unread

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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

[**UnreadCount**](UnreadCount.md)

### Authorization

[API_KEY](../README.md#API_KEY)

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

<a name="validateEmail"></a>
# **validateEmail**
> ValidationDto validateEmail(emailId)

Validate email

Validate the HTML content of email if HTML is found. Considered valid if no HTML.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.EmailControllerApi;

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
 **emailId** | [**UUID**](.md)| emailId |

### Return type

[**ValidationDto**](ValidationDto.md)

### Authorization

[API_KEY](../README.md#API_KEY)

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

