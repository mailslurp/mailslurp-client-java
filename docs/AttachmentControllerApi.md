# AttachmentControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadAttachment**](AttachmentControllerApi.md#uploadAttachment) | **POST** /attachments | Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.
[**uploadAttachmentBytes**](AttachmentControllerApi.md#uploadAttachmentBytes) | **POST** /attachments/bytes | Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.
[**uploadMultipartForm**](AttachmentControllerApi.md#uploadMultipartForm) | **POST** /attachments/multipart | Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.


<a name="uploadAttachment"></a>
# **uploadAttachment**
> List&lt;String&gt; uploadAttachment(uploadOptions)

Upload an attachment for sending using base64 file encoding. Returns an array whose first element is the ID of the uploaded attachment.

When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment IDs. For legacy reasons the ID is returned in an array. Only a single ID is ever returned at one time. To send the attachments pass a list of attachment IDs with SendEmailOptions when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    UploadAttachmentOptions uploadOptions = new UploadAttachmentOptions(); // UploadAttachmentOptions | uploadOptions
    try {
      List<String> result = apiInstance.uploadAttachment(uploadOptions);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uploadOptions** | [**UploadAttachmentOptions**](UploadAttachmentOptions.md)| uploadOptions |

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="uploadAttachmentBytes"></a>
# **uploadAttachmentBytes**
> List&lt;String&gt; uploadAttachmentBytes(string, filename, byteArray)

Upload an attachment for sending using file byte stream input octet stream. Returns an array whose first element is the ID of the uploaded attachment.

When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment IDs. For legacy reasons the ID is returned in an array. Only a single ID is ever returned at one time. To send the attachments pass a list of attachment IDs with SendEmailOptions when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    String string = "string_example"; // String | Optional contentType for file. For instance `application/pdf`
    String filename = "filename_example"; // String | Optional filename to save upload with
    byte[] byteArray = null; // byte[] | Byte array request body
    try {
      List<String> result = apiInstance.uploadAttachmentBytes(string, filename, byteArray);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **string** | **String**| Optional contentType for file. For instance &#x60;application/pdf&#x60; | [optional]
 **filename** | **String**| Optional filename to save upload with | [optional]
 **byteArray** | **byte[]**| Byte array request body | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="uploadMultipartForm"></a>
# **uploadMultipartForm**
> List&lt;String&gt; uploadMultipartForm(file, contentType, filename, xFilename)

Upload an attachment for sending using a Multipart Form request. Returns an array whose first element is the ID of the uploaded attachment.

When sending emails with attachments first upload each attachment with an upload endpoint. Record the returned attachment IDs. For legacy reasons the ID is returned in an array. Only a single ID is ever returned at one time. To send the attachments pass a list of attachment IDs with SendEmailOptions when sending an email. Using the upload endpoints prior to sending mean attachments can easily be reused.

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AttachmentControllerApi apiInstance = new AttachmentControllerApi(defaultClient);
    File file = new File("/path/to/file"); // File | file
    String contentType = "contentType_example"; // String | Optional content type of attachment
    String filename = "filename_example"; // String | Optional name of file
    String xFilename = "xFilename_example"; // String | Optional content type header of attachment
    try {
      List<String> result = apiInstance.uploadMultipartForm(file, contentType, filename, xFilename);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file |
 **contentType** | **String**| Optional content type of attachment | [optional]
 **filename** | **String**| Optional name of file | [optional]
 **xFilename** | **String**| Optional content type header of attachment | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

