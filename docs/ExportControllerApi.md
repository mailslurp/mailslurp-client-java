# ExportControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportEntities**](ExportControllerApi#exportEntities) | **GET** /export | Export inboxes link callable via browser |
| [**getExportLink**](ExportControllerApi#getExportLink) | **POST** /export | Get export link |


<a id="exportEntities"></a>
# **exportEntities**
> byte[] exportEntities(exportType, apiKey, outputFormat).filter(filter).listSeparatorToken(listSeparatorToken).excludePreviouslyExported(excludePreviouslyExported).createdEarliestTime(createdEarliestTime).createdOldestTime(createdOldestTime).execute();

Export inboxes link callable via browser

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ExportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String exportType = "INBOXES"; // String | 
    String apiKey = "apiKey_example"; // String | 
    String outputFormat = "CSV_DEFAULT"; // String | 
    String filter = "filter_example"; // String | 
    String listSeparatorToken = "listSeparatorToken_example"; // String | 
    Boolean excludePreviouslyExported = true; // Boolean | 
    OffsetDateTime createdEarliestTime = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime createdOldestTime = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      byte[] result = apiInstance.exportEntities(exportType, apiKey, outputFormat)
            .filter(filter)
            .listSeparatorToken(listSeparatorToken)
            .excludePreviouslyExported(excludePreviouslyExported)
            .createdEarliestTime(createdEarliestTime)
            .createdOldestTime(createdOldestTime)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#exportEntities");
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
| **exportType** | **String**|  | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS] |
| **apiKey** | **String**|  | |
| **outputFormat** | **String**|  | [enum: CSV_DEFAULT, CSV_EXCEL] |
| **filter** | **String**|  | [optional] |
| **listSeparatorToken** | **String**|  | [optional] |
| **excludePreviouslyExported** | **Boolean**|  | [optional] |
| **createdEarliestTime** | **OffsetDateTime**|  | [optional] |
| **createdOldestTime** | **OffsetDateTime**|  | [optional] |

### Return type

**byte[]**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getExportLink"></a>
# **getExportLink**
> ExportLink getExportLink(exportType, exportOptions).apiKey(apiKey).execute();

Get export link

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ExportControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String exportType = "INBOXES"; // String | 
    ExportOptions exportOptions = new ExportOptions(); // ExportOptions | 
    String apiKey = "apiKey_example"; // String | 
    try {
      ExportLink result = apiInstance.getExportLink(exportType, exportOptions)
            .apiKey(apiKey)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportControllerApi#getExportLink");
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
| **exportType** | **String**|  | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS] |
| **exportOptions** | [**ExportOptions**](ExportOptions)|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**ExportLink**](ExportLink)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

