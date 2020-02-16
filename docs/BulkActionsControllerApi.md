# BulkActionsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkCreateInboxes**](BulkActionsControllerApi.md#bulkCreateInboxes) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses)
[**bulkDeleteInboxes**](BulkActionsControllerApi.md#bulkDeleteInboxes) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes
[**bulkSendEmails**](BulkActionsControllerApi.md#bulkSendEmails) | **POST** /bulk/send | Bulk Send Emails


<a name="bulkCreateInboxes"></a>
# **bulkCreateInboxes**
> List&lt;Inbox&gt; bulkCreateInboxes(count)

Bulk create Inboxes (email addresses)

Enterprise Plan Required

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.BulkActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    BulkActionsControllerApi apiInstance = new BulkActionsControllerApi(defaultClient);
    Integer count = 56; // Integer | Number of inboxes to be created in bulk
    try {
      List<Inbox> result = apiInstance.bulkCreateInboxes(count);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkActionsControllerApi#bulkCreateInboxes");
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
 **count** | **Integer**| Number of inboxes to be created in bulk |

### Return type

[**List&lt;Inbox&gt;**](Inbox.md)

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

<a name="bulkDeleteInboxes"></a>
# **bulkDeleteInboxes**
> bulkDeleteInboxes(ids)

Bulk Delete Inboxes

Enterprise Plan Required

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.BulkActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    BulkActionsControllerApi apiInstance = new BulkActionsControllerApi(defaultClient);
    List<UUID> ids = Arrays.asList(); // List<UUID> | ids
    try {
      apiInstance.bulkDeleteInboxes(ids);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkActionsControllerApi#bulkDeleteInboxes");
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
 **ids** | [**List&lt;UUID&gt;**](UUID.md)| ids |

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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="bulkSendEmails"></a>
# **bulkSendEmails**
> bulkSendEmails(bulkSendEmailOptions)

Bulk Send Emails

Enterprise Plan Required

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.BulkActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    BulkActionsControllerApi apiInstance = new BulkActionsControllerApi(defaultClient);
    BulkSendEmailOptions bulkSendEmailOptions = new BulkSendEmailOptions(); // BulkSendEmailOptions | bulkSendEmailOptions
    try {
      apiInstance.bulkSendEmails(bulkSendEmailOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkActionsControllerApi#bulkSendEmails");
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
 **bulkSendEmailOptions** | [**BulkSendEmailOptions**](BulkSendEmailOptions.md)| bulkSendEmailOptions |

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

