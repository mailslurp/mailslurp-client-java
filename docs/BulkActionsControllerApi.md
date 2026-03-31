# BulkActionsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkCreateInboxes**](BulkActionsControllerApi#bulkCreateInboxes) | **POST** /bulk/inboxes | Bulk create Inboxes (email addresses) |
| [**bulkDeleteInboxes**](BulkActionsControllerApi#bulkDeleteInboxes) | **DELETE** /bulk/inboxes | Bulk Delete Inboxes |
| [**bulkSendEmails**](BulkActionsControllerApi#bulkSendEmails) | **POST** /bulk/send | Bulk Send Emails |


<a id="bulkCreateInboxes"></a>
# **bulkCreateInboxes**
> List&lt;InboxDto&gt; bulkCreateInboxes(count).execute();

Bulk create Inboxes (email addresses)

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.BulkActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    BulkActionsControllerApi apiInstance = new BulkActionsControllerApi(defaultClient);
    Integer count = 56; // Integer | Number of inboxes to be created in bulk
    try {
      List<InboxDto> result = apiInstance.bulkCreateInboxes(count)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **count** | **Integer**| Number of inboxes to be created in bulk | |

### Return type

[**List&lt;InboxDto&gt;**](InboxDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="bulkDeleteInboxes"></a>
# **bulkDeleteInboxes**
> bulkDeleteInboxes(UUID).execute();

Bulk Delete Inboxes

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.BulkActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    BulkActionsControllerApi apiInstance = new BulkActionsControllerApi(defaultClient);
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    try {
      apiInstance.bulkDeleteInboxes(UUID)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **UUID** | [**List&lt;UUID&gt;**](UUID)|  | |

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
| **204** | No Content |  -  |

<a id="bulkSendEmails"></a>
# **bulkSendEmails**
> bulkSendEmails(bulkSendEmailOptions).execute();

Bulk Send Emails

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.BulkActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    BulkActionsControllerApi apiInstance = new BulkActionsControllerApi(defaultClient);
    BulkSendEmailOptions bulkSendEmailOptions = new BulkSendEmailOptions(); // BulkSendEmailOptions | 
    try {
      apiInstance.bulkSendEmails(bulkSendEmailOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bulkSendEmailOptions** | [**BulkSendEmailOptions**](BulkSendEmailOptions)|  | |

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

