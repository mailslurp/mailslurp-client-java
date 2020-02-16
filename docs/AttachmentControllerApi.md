# AttachmentControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**uploadAttachment**](AttachmentControllerApi.md#uploadAttachment) | **POST** /attachments | Upload an attachment for sending
[**uploadMultipartForm**](AttachmentControllerApi.md#uploadMultipartForm) | **POST** /attachments/multipart | Upload an attachment for sending using Multipart Form


<a name="uploadAttachment"></a>
# **uploadAttachment**
> List&lt;String&gt; uploadAttachment(uploadOptions)

Upload an attachment for sending

When sending emails with attachments first upload each attachment with this endpoint. Record the returned attachment IDs. Then use these attachment IDs in the SendEmailOptions when sending an email. This means that attachments can easily be reused.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.AttachmentControllerApi;

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

<a name="uploadMultipartForm"></a>
# **uploadMultipartForm**
> List&lt;String&gt; uploadMultipartForm(file, contentType, filename)

Upload an attachment for sending using Multipart Form

When sending emails with attachments first upload each attachment with this endpoint. Record the returned attachment IDs. Then use these attachment IDs in the SendEmailOptions when sending an email. This means that attachments can easily be reused.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.AttachmentControllerApi;

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
    String contentType = "contentType_example"; // String | contentType
    String filename = "filename_example"; // String | filename
    try {
      List<String> result = apiInstance.uploadMultipartForm(file, contentType, filename);
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
 **contentType** | **String**| contentType | [optional]
 **filename** | **String**| filename | [optional]

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

