# AttachmentControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAllAttachments**](AttachmentControllerApi#deleteAllAttachments) | **DELETE** /attachments | Delete all attachments |
| [**deleteAttachment**](AttachmentControllerApi#deleteAttachment) | **DELETE** /attachments/{attachmentId} | Delete an attachment |
| [**downloadAttachmentAsBase64Encoded**](AttachmentControllerApi#downloadAttachmentAsBase64Encoded) | **GET** /attachments/{attachmentId}/base64 | Get email attachment as base64 encoded string as alternative to binary responses. To read the content decode the Base64 encoded contents. |
| [**downloadAttachmentAsBytes**](AttachmentControllerApi#downloadAttachmentAsBytes) | **GET** /attachments/{attachmentId}/bytes | Download attachments. Get email attachment bytes. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints. |
| [**getAttachment**](AttachmentControllerApi#getAttachment) | **GET** /attachments/{attachmentId} | Get an attachment entity |
| [**getAttachmentInfo**](AttachmentControllerApi#getAttachmentInfo) | **GET** /attachments/{attachmentId}/metadata | Get email attachment metadata information |
| [**getAttachments**](AttachmentControllerApi#getAttachments) | **GET** /attachments | Get email attachments |
| [**uploadAttachment**](AttachmentControllerApi#uploadAttachment) | **POST** /attachments | Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment. |
| [**uploadAttachmentBytes**](AttachmentControllerApi#uploadAttachmentBytes) | **POST** /attachments/bytes | Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment. |
| [**uploadMultipartForm**](AttachmentControllerApi#uploadMultipartForm) | **POST** /attachments/multipart | Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment. |


<a id="deleteAllAttachments"></a>
# **deleteAllAttachments**
> deleteAllAttachments().execute();

Delete all attachments

Delete all attachments

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    try {
      apiInstance.deleteAllAttachments()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#deleteAllAttachments");
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

<a id="deleteAttachment"></a>
# **deleteAttachment**
> deleteAttachment(attachmentId).execute();

Delete an attachment

Delete an attachment

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    try {
      apiInstance.deleteAttachment(attachmentId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#deleteAttachment");
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
| **attachmentId** | **String**| ID of attachment | |

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

<a id="downloadAttachmentAsBase64Encoded"></a>
# **downloadAttachmentAsBase64Encoded**
> DownloadAttachmentDto downloadAttachmentAsBase64Encoded(attachmentId).execute();

Get email attachment as base64 encoded string as alternative to binary responses. To read the content decode the Base64 encoded contents.

Returns the specified attachment for a given email as a base 64 encoded string. The response type is application/json. This method is similar to the &#x60;downloadAttachment&#x60; method but allows some clients to get around issues with binary responses.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    try {
      DownloadAttachmentDto result = apiInstance.downloadAttachmentAsBase64Encoded(attachmentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#downloadAttachmentAsBase64Encoded");
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

<a id="downloadAttachmentAsBytes"></a>
# **downloadAttachmentAsBytes**
> byte[] downloadAttachmentAsBytes(attachmentId).execute();

Download attachments. Get email attachment bytes. If you have trouble with byte responses try the &#x60;downloadAttachmentBase64&#x60; response endpoints.

Returns the specified attachment for a given email as a stream / array of bytes. You can find attachment ids in email responses endpoint responses. The response type is application/octet-stream.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    try {
      byte[] result = apiInstance.downloadAttachmentAsBytes(attachmentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#downloadAttachmentAsBytes");
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
| **attachmentId** | **String**| ID of attachment | |

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

<a id="getAttachment"></a>
# **getAttachment**
> AttachmentEntityDto getAttachment(attachmentId).execute();

Get an attachment entity

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    try {
      AttachmentEntityDto result = apiInstance.getAttachment(attachmentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#getAttachment");
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
| **attachmentId** | **String**| ID of attachment | |

### Return type

[**AttachmentEntityDto**](AttachmentEntityDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAttachmentInfo"></a>
# **getAttachmentInfo**
> AttachmentMetaData getAttachmentInfo(attachmentId).execute();

Get email attachment metadata information

Returns the metadata for an attachment. It is saved separately to the content of the attachment. Contains properties &#x60;name&#x60; and &#x60;content-type&#x60; and &#x60;content-length&#x60; in bytes for a given attachment.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String attachmentId = "attachmentId_example"; // String | ID of attachment
    try {
      AttachmentMetaData result = apiInstance.getAttachmentInfo(attachmentId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#getAttachmentInfo");
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

<a id="getAttachments"></a>
# **getAttachments**
> PageAttachmentEntity getAttachments().page(page).size(size).sort(sort).fileNameFilter(fileNameFilter).since(since).before(before).inboxId(inboxId).emailId(emailId).sentEmailId(sentEmailId).execute();

Get email attachments

Get all attachments in paginated response. Each entity contains meta data for the attachment such as &#x60;name&#x60; and &#x60;content-type&#x60;. Use the &#x60;attachmentId&#x60; and the download endpoints to get the file contents.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index for list pagination
    Integer size = 20; // Integer | Optional page size for list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String fileNameFilter = "fileNameFilter_example"; // String | Optional file name and content type search filter
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inboxId to filter attachments by
    UUID emailId = UUID.randomUUID(); // UUID | Optional emailId to filter attachments by
    UUID sentEmailId = UUID.randomUUID(); // UUID | Optional sentEmailId to filter attachments by
    try {
      PageAttachmentEntity result = apiInstance.getAttachments()
            .page(page)
            .size(size)
            .sort(sort)
            .fileNameFilter(fileNameFilter)
            .since(since)
            .before(before)
            .inboxId(inboxId)
            .emailId(emailId)
            .sentEmailId(sentEmailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#getAttachments");
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
| **page** | **Integer**| Optional page index for list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size for list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **fileNameFilter** | **String**| Optional file name and content type search filter | [optional] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **inboxId** | **UUID**| Optional inboxId to filter attachments by | [optional] |
| **emailId** | **UUID**| Optional emailId to filter attachments by | [optional] |
| **sentEmailId** | **UUID**| Optional sentEmailId to filter attachments by | [optional] |

### Return type

[**PageAttachmentEntity**](PageAttachmentEntity)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="uploadAttachment"></a>
# **uploadAttachment**
> List&lt;String&gt; uploadAttachment(uploadAttachmentOptions).execute();

Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    UploadAttachmentOptions uploadAttachmentOptions = new UploadAttachmentOptions(); // UploadAttachmentOptions | 
    try {
      List<String> result = apiInstance.uploadAttachment(uploadAttachmentOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#uploadAttachment");
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
| **uploadAttachmentOptions** | [**UploadAttachmentOptions**](UploadAttachmentOptions)|  | |

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="uploadAttachmentBytes"></a>
# **uploadAttachmentBytes**
> List&lt;String&gt; uploadAttachmentBytes().contentType(contentType).contentType2(contentType2).contentId(contentId).filename(filename).fileSize(fileSize).filename2(filename2).execute();

Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String contentType = "contentType_example"; // String | 
    String contentType2 = "contentType_example"; // String | Optional contentType for file. For instance `application/pdf`
    String contentId = "contentId_example"; // String | Optional content ID (CID) to save upload with
    String filename = "filename_example"; // String | Optional filename to save upload with
    Long fileSize = 56L; // Long | Optional byte length to save upload with
    String filename2 = "filename_example"; // String | 
    try {
      List<String> result = apiInstance.uploadAttachmentBytes()
            .contentType(contentType)
            .contentType2(contentType2)
            .contentId(contentId)
            .filename(filename)
            .fileSize(fileSize)
            .filename2(filename2)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#uploadAttachmentBytes");
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
| **contentType** | **String**|  | [optional] |
| **contentType2** | **String**| Optional contentType for file. For instance &#x60;application/pdf&#x60; | [optional] |
| **contentId** | **String**| Optional content ID (CID) to save upload with | [optional] |
| **filename** | **String**| Optional filename to save upload with | [optional] |
| **fileSize** | **Long**| Optional byte length to save upload with | [optional] |
| **filename2** | **String**|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="uploadMultipartForm"></a>
# **uploadMultipartForm**
> List&lt;String&gt; uploadMultipartForm().contentId(contentId).contentType(contentType).filename(filename).contentTypeHeader(contentTypeHeader).xFilename(xFilename).xFilenameRaw(xFilenameRaw).xFilesize(xFilesize).uploadMultipartFormRequest(uploadMultipartFormRequest).execute();

Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AttachmentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String contentId = "contentId_example"; // String | Optional content ID of attachment
    String contentType = "contentType_example"; // String | Optional content type of attachment
    String filename = "filename_example"; // String | Optional name of file
    String contentTypeHeader = "contentTypeHeader_example"; // String | Optional content type header of attachment
    String xFilename = "xFilename_example"; // String | Optional filename header of attachment
    String xFilenameRaw = "xFilenameRaw_example"; // String | Optional raw filename header of attachment that will be converted to punycode
    Long xFilesize = 56L; // Long | Optional content size of attachment
    UploadMultipartFormRequest uploadMultipartFormRequest = new UploadMultipartFormRequest(); // UploadMultipartFormRequest | 
    try {
      List<String> result = apiInstance.uploadMultipartForm()
            .contentId(contentId)
            .contentType(contentType)
            .filename(filename)
            .contentTypeHeader(contentTypeHeader)
            .xFilename(xFilename)
            .xFilenameRaw(xFilenameRaw)
            .xFilesize(xFilesize)
            .uploadMultipartFormRequest(uploadMultipartFormRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttachmentControllerApi#uploadMultipartForm");
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
| **contentId** | **String**| Optional content ID of attachment | [optional] |
| **contentType** | **String**| Optional content type of attachment | [optional] |
| **filename** | **String**| Optional name of file | [optional] |
| **contentTypeHeader** | **String**| Optional content type header of attachment | [optional] |
| **xFilename** | **String**| Optional filename header of attachment | [optional] |
| **xFilenameRaw** | **String**| Optional raw filename header of attachment that will be converted to punycode | [optional] |
| **xFilesize** | **Long**| Optional content size of attachment | [optional] |
| **uploadMultipartFormRequest** | [**UploadMultipartFormRequest**](UploadMultipartFormRequest)|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

