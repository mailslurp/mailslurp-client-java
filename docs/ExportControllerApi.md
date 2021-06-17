# ExportControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportEntities**](ExportControllerApi#exportEntities) | **GET** /export | Export inboxes link callable via browser
[**getExportLink**](ExportControllerApi#getExportLink) | **POST** /export | Get export link


<a name="exportEntities"></a>
# **exportEntities**
> byte[] exportEntities(apiKey, exportType, outputFormat, createdEarliestTime, createdOldestTime, excludePreviouslyExported, filter, listSeparatorToken)

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String apiKey = "apiKey_example"; // String | apiKey
    String exportType = "exportType_example"; // String | exportType
    String outputFormat = "outputFormat_example"; // String | outputFormat
    OffsetDateTime createdEarliestTime = new OffsetDateTime(); // OffsetDateTime | createdEarliestTime
    OffsetDateTime createdOldestTime = new OffsetDateTime(); // OffsetDateTime | createdOldestTime
    Boolean excludePreviouslyExported = true; // Boolean | excludePreviouslyExported
    String filter = "filter_example"; // String | filter
    String listSeparatorToken = "listSeparatorToken_example"; // String | listSeparatorToken
    try {
      byte[] result = apiInstance.exportEntities(apiKey, exportType, outputFormat, createdEarliestTime, createdOldestTime, excludePreviouslyExported, filter, listSeparatorToken);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiKey** | **String**| apiKey |
 **exportType** | **String**| exportType | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS]
 **outputFormat** | **String**| outputFormat | [enum: CSV_DEFAULT, CSV_EXCEL]
 **createdEarliestTime** | **OffsetDateTime**| createdEarliestTime | [optional]
 **createdOldestTime** | **OffsetDateTime**| createdOldestTime | [optional]
 **excludePreviouslyExported** | **Boolean**| excludePreviouslyExported | [optional]
 **filter** | **String**| filter | [optional]
 **listSeparatorToken** | **String**| listSeparatorToken | [optional]

### Return type

**byte[]**

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

<a name="getExportLink"></a>
# **getExportLink**
> ExportLink getExportLink(exportType, exportOptions, apiKey)

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
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ExportControllerApi apiInstance = new ExportControllerApi(defaultClient);
    String exportType = "exportType_example"; // String | exportType
    ExportOptions exportOptions = new ExportOptions(); // ExportOptions | exportOptions
    String apiKey = "apiKey_example"; // String | apiKey
    try {
      ExportLink result = apiInstance.getExportLink(exportType, exportOptions, apiKey);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportType** | **String**| exportType | [enum: INBOXES, CONTACTS, ATTACHMENTS, EMAILS]
 **exportOptions** | [**ExportOptions**](ExportOptions)| exportOptions |
 **apiKey** | **String**| apiKey | [optional]

### Return type

[**ExportLink**](ExportLink)

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

