# MissedSmsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllMissedSmsMessages**](MissedSmsControllerApi#getAllMissedSmsMessages) | **GET** /missed-sms | Get all missed SMS messages in paginated format |
| [**getMissedSmsCount**](MissedSmsControllerApi#getMissedSmsCount) | **GET** /missed-sms/count | Get missed SMS count |
| [**getMissedSmsMessage**](MissedSmsControllerApi#getMissedSmsMessage) | **GET** /missed-sms/{missedSmsId} | Get missed SMS content |


<a id="getAllMissedSmsMessages"></a>
# **getAllMissedSmsMessages**
> PageMissedSmsProjection getAllMissedSmsMessages().phoneNumber(phoneNumber).page(page).size(size).sort(sort).since(since).before(before).search(search).execute();

Get all missed SMS messages in paginated format

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MissedSmsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MissedSmsControllerApi apiInstance = new MissedSmsControllerApi(defaultClient);
    UUID phoneNumber = UUID.randomUUID(); // UUID | Optional receiving phone number to filter missed SMS for
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter missed SMS after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter missed SMS before given date time
    String search = "search_example"; // String | Optional search filter
    try {
      PageMissedSmsProjection result = apiInstance.getAllMissedSmsMessages()
            .phoneNumber(phoneNumber)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .search(search)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MissedSmsControllerApi#getAllMissedSmsMessages");
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
| **phoneNumber** | **UUID**| Optional receiving phone number to filter missed SMS for | [optional] |
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Optional filter missed SMS after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter missed SMS before given date time | [optional] |
| **search** | **String**| Optional search filter | [optional] |

### Return type

[**PageMissedSmsProjection**](PageMissedSmsProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getMissedSmsCount"></a>
# **getMissedSmsCount**
> CountDto getMissedSmsCount().execute();

Get missed SMS count

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MissedSmsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MissedSmsControllerApi apiInstance = new MissedSmsControllerApi(defaultClient);
    try {
      CountDto result = apiInstance.getMissedSmsCount()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MissedSmsControllerApi#getMissedSmsCount");
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

<a id="getMissedSmsMessage"></a>
# **getMissedSmsMessage**
> MissedSmsDto getMissedSmsMessage(missedSmsId).execute();

Get missed SMS content

Returns a missed SMS with full content.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MissedSmsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MissedSmsControllerApi apiInstance = new MissedSmsControllerApi(defaultClient);
    UUID missedSmsId = UUID.randomUUID(); // UUID | 
    try {
      MissedSmsDto result = apiInstance.getMissedSmsMessage(missedSmsId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MissedSmsControllerApi#getMissedSmsMessage");
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
| **missedSmsId** | **UUID**|  | |

### Return type

[**MissedSmsDto**](MissedSmsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

