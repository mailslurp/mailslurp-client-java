# DeliverabilityTestControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDeliverabilitySimulationJob**](DeliverabilityTestControllerApi#cancelDeliverabilitySimulationJob) | **POST** /test/deliverability/{testId}/simulation-jobs/{jobId}/cancel | Cancel deliverability simulation job |
| [**createDeliverabilitySimulationJob**](DeliverabilityTestControllerApi#createDeliverabilitySimulationJob) | **POST** /test/deliverability/{testId}/simulation-jobs | Create deliverability simulation job |
| [**createDeliverabilityTest**](DeliverabilityTestControllerApi#createDeliverabilityTest) | **POST** /test/deliverability | Create deliverability/load test |
| [**deleteDeliverabilityTest**](DeliverabilityTestControllerApi#deleteDeliverabilityTest) | **DELETE** /test/deliverability/{testId} | Delete deliverability/load test |
| [**duplicateDeliverabilityTest**](DeliverabilityTestControllerApi#duplicateDeliverabilityTest) | **POST** /test/deliverability/{testId}/duplicate | Duplicate deliverability/load test |
| [**exportDeliverabilityTestReport**](DeliverabilityTestControllerApi#exportDeliverabilityTestReport) | **GET** /test/deliverability/{testId}/report/export | Export deliverability/load test report as PDF |
| [**exportDeliverabilityTestResults**](DeliverabilityTestControllerApi#exportDeliverabilityTestResults) | **GET** /test/deliverability/{testId}/results/export | Export deliverability/load test entity results as CSV |
| [**getDeliverabilityAnalyticsSeries**](DeliverabilityTestControllerApi#getDeliverabilityAnalyticsSeries) | **GET** /test/deliverability/analytics/series | Get deliverability analytics time series |
| [**getDeliverabilityFailureHotspots**](DeliverabilityTestControllerApi#getDeliverabilityFailureHotspots) | **GET** /test/deliverability/analytics/hotspots | Get deliverability failure hotspots |
| [**getDeliverabilitySimulationJob**](DeliverabilityTestControllerApi#getDeliverabilitySimulationJob) | **GET** /test/deliverability/{testId}/simulation-jobs/{jobId} | Get deliverability simulation job |
| [**getDeliverabilitySimulationJobEvents**](DeliverabilityTestControllerApi#getDeliverabilitySimulationJobEvents) | **GET** /test/deliverability/{testId}/simulation-jobs/{jobId}/events | Get deliverability simulation job events |
| [**getDeliverabilityTest**](DeliverabilityTestControllerApi#getDeliverabilityTest) | **GET** /test/deliverability/{testId} | Get deliverability/load test |
| [**getDeliverabilityTestResults**](DeliverabilityTestControllerApi#getDeliverabilityTestResults) | **GET** /test/deliverability/{testId}/results | Get deliverability/load test entity results |
| [**getDeliverabilityTests**](DeliverabilityTestControllerApi#getDeliverabilityTests) | **GET** /test/deliverability | List deliverability/load tests |
| [**getLatestDeliverabilitySimulationJob**](DeliverabilityTestControllerApi#getLatestDeliverabilitySimulationJob) | **GET** /test/deliverability/{testId}/simulation-jobs/latest | Get latest deliverability simulation job |
| [**pauseDeliverabilitySimulationJob**](DeliverabilityTestControllerApi#pauseDeliverabilitySimulationJob) | **POST** /test/deliverability/{testId}/simulation-jobs/{jobId}/pause | Pause deliverability simulation job |
| [**pauseDeliverabilityTest**](DeliverabilityTestControllerApi#pauseDeliverabilityTest) | **POST** /test/deliverability/{testId}/pause | Pause deliverability/load test |
| [**pollDeliverabilityTestStatus**](DeliverabilityTestControllerApi#pollDeliverabilityTestStatus) | **GET** /test/deliverability/{testId}/status | Poll deliverability/load test status |
| [**resumeDeliverabilitySimulationJob**](DeliverabilityTestControllerApi#resumeDeliverabilitySimulationJob) | **POST** /test/deliverability/{testId}/simulation-jobs/{jobId}/resume | Resume deliverability simulation job |
| [**startDeliverabilityTest**](DeliverabilityTestControllerApi#startDeliverabilityTest) | **POST** /test/deliverability/{testId}/start | Start or resume deliverability/load test |
| [**stopDeliverabilityTest**](DeliverabilityTestControllerApi#stopDeliverabilityTest) | **POST** /test/deliverability/{testId}/stop | Stop deliverability/load test |
| [**updateDeliverabilityTest**](DeliverabilityTestControllerApi#updateDeliverabilityTest) | **PATCH** /test/deliverability/{testId} | Update deliverability/load test |


<a id="cancelDeliverabilitySimulationJob"></a>
# **cancelDeliverabilitySimulationJob**
> DeliverabilitySimulationJobDto cancelDeliverabilitySimulationJob(testId, jobId).execute();

Cancel deliverability simulation job

Cancel a running or paused simulation job.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilitySimulationJobDto result = apiInstance.cancelDeliverabilitySimulationJob(testId, jobId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#cancelDeliverabilitySimulationJob");
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
| **testId** | **UUID**|  | |
| **jobId** | **UUID**|  | |

### Return type

[**DeliverabilitySimulationJobDto**](DeliverabilitySimulationJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDeliverabilitySimulationJob"></a>
# **createDeliverabilitySimulationJob**
> DeliverabilitySimulationJobDto createDeliverabilitySimulationJob(testId, createDeliverabilitySimulationJobOptions).execute();

Create deliverability simulation job

Create and start a simulation job for a running deliverability test. Only one active simulation job is allowed per user.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    CreateDeliverabilitySimulationJobOptions createDeliverabilitySimulationJobOptions = new CreateDeliverabilitySimulationJobOptions(); // CreateDeliverabilitySimulationJobOptions | 
    try {
      DeliverabilitySimulationJobDto result = apiInstance.createDeliverabilitySimulationJob(testId, createDeliverabilitySimulationJobOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#createDeliverabilitySimulationJob");
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
| **testId** | **UUID**|  | |
| **createDeliverabilitySimulationJobOptions** | [**CreateDeliverabilitySimulationJobOptions**](CreateDeliverabilitySimulationJobOptions)|  | |

### Return type

[**DeliverabilitySimulationJobDto**](DeliverabilitySimulationJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDeliverabilityTest"></a>
# **createDeliverabilityTest**
> DeliverabilityTestDto createDeliverabilityTest(createDeliverabilityTestOptions).execute();

Create deliverability/load test

Create a deliverability test for inboxes or phone numbers using ALL, PATTERN, or EXPLICIT selector scope.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    CreateDeliverabilityTestOptions createDeliverabilityTestOptions = new CreateDeliverabilityTestOptions(); // CreateDeliverabilityTestOptions | 
    try {
      DeliverabilityTestDto result = apiInstance.createDeliverabilityTest(createDeliverabilityTestOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#createDeliverabilityTest");
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
| **createDeliverabilityTestOptions** | [**CreateDeliverabilityTestOptions**](CreateDeliverabilityTestOptions)|  | |

### Return type

[**DeliverabilityTestDto**](DeliverabilityTestDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDeliverabilityTest"></a>
# **deleteDeliverabilityTest**
> DeleteResult deleteDeliverabilityTest(testId).execute();

Delete deliverability/load test

Delete test and all persisted entity-level results.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeleteResult result = apiInstance.deleteDeliverabilityTest(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#deleteDeliverabilityTest");
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
| **testId** | **UUID**|  | |

### Return type

[**DeleteResult**](DeleteResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="duplicateDeliverabilityTest"></a>
# **duplicateDeliverabilityTest**
> DeliverabilityTestDto duplicateDeliverabilityTest(testId).execute();

Duplicate deliverability/load test

Create a fresh deliverability test using an existing test configuration, including selector scope, exclusions, and expectations.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilityTestDto result = apiInstance.duplicateDeliverabilityTest(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#duplicateDeliverabilityTest");
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
| **testId** | **UUID**|  | |

### Return type

[**DeliverabilityTestDto**](DeliverabilityTestDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exportDeliverabilityTestReport"></a>
# **exportDeliverabilityTestReport**
> exportDeliverabilityTestReport(testId).execute();

Export deliverability/load test report as PDF

Export a PDF report for a terminal deliverability test (COMPLETE, FAILED, or STOPPED), including configuration, summary outcomes, and detailed entity-level results.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.exportDeliverabilityTestReport(testId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#exportDeliverabilityTestReport");
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
| **testId** | **UUID**|  | |

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
| **200** | OK |  -  |

<a id="exportDeliverabilityTestResults"></a>
# **exportDeliverabilityTestResults**
> exportDeliverabilityTestResults(testId).matched(matched).execute();

Export deliverability/load test entity results as CSV

Export per-entity deliverability results including expectation-level pass/fail counts. The latest status is evaluated with the same polling safeguards before export.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    Boolean matched = true; // Boolean | 
    try {
      apiInstance.exportDeliverabilityTestResults(testId)
            .matched(matched)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#exportDeliverabilityTestResults");
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
| **testId** | **UUID**|  | |
| **matched** | **Boolean**|  | [optional] |

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
| **200** | OK |  -  |

<a id="getDeliverabilityAnalyticsSeries"></a>
# **getDeliverabilityAnalyticsSeries**
> DeliverabilityAnalyticsSeriesDto getDeliverabilityAnalyticsSeries().since(since).before(before).scope(scope).bucket(bucket).runLimit(runLimit).execute();

Get deliverability analytics time series

Compare deliverability runs over a time range with bucketed chart metrics and run-level rows for table views.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String scope = "INBOX"; // String | 
    String bucket = "HOUR"; // String | 
    Integer runLimit = 56; // Integer | 
    try {
      DeliverabilityAnalyticsSeriesDto result = apiInstance.getDeliverabilityAnalyticsSeries()
            .since(since)
            .before(before)
            .scope(scope)
            .bucket(bucket)
            .runLimit(runLimit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getDeliverabilityAnalyticsSeries");
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
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **scope** | **String**|  | [optional] [enum: INBOX, PHONE] |
| **bucket** | **String**|  | [optional] [default to DAY] [enum: HOUR, DAY] |
| **runLimit** | **Integer**|  | [optional] |

### Return type

[**DeliverabilityAnalyticsSeriesDto**](DeliverabilityAnalyticsSeriesDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliverabilityFailureHotspots"></a>
# **getDeliverabilityFailureHotspots**
> DeliverabilityFailureHotspotsDto getDeliverabilityFailureHotspots().since(since).before(before).scope(scope).limit(limit).execute();

Get deliverability failure hotspots

Find commonly failing entities and phone country/variant dimensions across deliverability runs in a time range.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String scope = "INBOX"; // String | 
    Integer limit = 56; // Integer | 
    try {
      DeliverabilityFailureHotspotsDto result = apiInstance.getDeliverabilityFailureHotspots()
            .since(since)
            .before(before)
            .scope(scope)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getDeliverabilityFailureHotspots");
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
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **scope** | **String**|  | [optional] [enum: INBOX, PHONE] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**DeliverabilityFailureHotspotsDto**](DeliverabilityFailureHotspotsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliverabilitySimulationJob"></a>
# **getDeliverabilitySimulationJob**
> DeliverabilitySimulationJobDto getDeliverabilitySimulationJob(testId, jobId).execute();

Get deliverability simulation job

Get simulation job status and progress counters.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilitySimulationJobDto result = apiInstance.getDeliverabilitySimulationJob(testId, jobId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getDeliverabilitySimulationJob");
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
| **testId** | **UUID**|  | |
| **jobId** | **UUID**|  | |

### Return type

[**DeliverabilitySimulationJobDto**](DeliverabilitySimulationJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliverabilitySimulationJobEvents"></a>
# **getDeliverabilitySimulationJobEvents**
> DeliverabilitySimulationJobEventPageDto getDeliverabilitySimulationJobEvents(testId, jobId).page(page).size(size).sort(sort).execute();

Get deliverability simulation job events

Get paged simulation events including send successes and failures.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    UUID jobId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    try {
      DeliverabilitySimulationJobEventPageDto result = apiInstance.getDeliverabilitySimulationJobEvents(testId, jobId)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getDeliverabilitySimulationJobEvents");
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
| **testId** | **UUID**|  | |
| **jobId** | **UUID**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**DeliverabilitySimulationJobEventPageDto**](DeliverabilitySimulationJobEventPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliverabilityTest"></a>
# **getDeliverabilityTest**
> DeliverabilityTestDto getDeliverabilityTest(testId).execute();

Get deliverability/load test

Get deliverability test configuration and latest progress counters.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilityTestDto result = apiInstance.getDeliverabilityTest(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getDeliverabilityTest");
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
| **testId** | **UUID**|  | |

### Return type

[**DeliverabilityTestDto**](DeliverabilityTestDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliverabilityTestResults"></a>
# **getDeliverabilityTestResults**
> DeliverabilityEntityResultPageDto getDeliverabilityTestResults(testId).matched(matched).page(page).size(size).sort(sort).execute();

Get deliverability/load test entity results

Get paged per-entity expectation results with optional matched/unmatched filtering.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    Boolean matched = true; // Boolean | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    try {
      DeliverabilityEntityResultPageDto result = apiInstance.getDeliverabilityTestResults(testId)
            .matched(matched)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getDeliverabilityTestResults");
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
| **testId** | **UUID**|  | |
| **matched** | **Boolean**|  | [optional] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**DeliverabilityEntityResultPageDto**](DeliverabilityEntityResultPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliverabilityTests"></a>
# **getDeliverabilityTests**
> DeliverabilityTestPageDto getDeliverabilityTests().page(page).size(size).sort(sort).execute();

List deliverability/load tests

List deliverability tests for the authenticated account.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    Integer page = 0; // Integer | Page index
    Integer size = 20; // Integer | Page size
    String sort = "ASC"; // String | Sort direction
    try {
      DeliverabilityTestPageDto result = apiInstance.getDeliverabilityTests()
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getDeliverabilityTests");
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
| **page** | **Integer**| Page index | [optional] [default to 0] |
| **size** | **Integer**| Page size | [optional] [default to 20] |
| **sort** | **String**| Sort direction | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**DeliverabilityTestPageDto**](DeliverabilityTestPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLatestDeliverabilitySimulationJob"></a>
# **getLatestDeliverabilitySimulationJob**
> DeliverabilitySimulationJobDto getLatestDeliverabilitySimulationJob(testId).execute();

Get latest deliverability simulation job

Get the most recent simulation job for a deliverability test.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilitySimulationJobDto result = apiInstance.getLatestDeliverabilitySimulationJob(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#getLatestDeliverabilitySimulationJob");
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
| **testId** | **UUID**|  | |

### Return type

[**DeliverabilitySimulationJobDto**](DeliverabilitySimulationJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="pauseDeliverabilitySimulationJob"></a>
# **pauseDeliverabilitySimulationJob**
> DeliverabilitySimulationJobDto pauseDeliverabilitySimulationJob(testId, jobId).execute();

Pause deliverability simulation job

Pause a running simulation job.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilitySimulationJobDto result = apiInstance.pauseDeliverabilitySimulationJob(testId, jobId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#pauseDeliverabilitySimulationJob");
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
| **testId** | **UUID**|  | |
| **jobId** | **UUID**|  | |

### Return type

[**DeliverabilitySimulationJobDto**](DeliverabilitySimulationJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="pauseDeliverabilityTest"></a>
# **pauseDeliverabilityTest**
> DeliverabilityTestDto pauseDeliverabilityTest(testId).execute();

Pause deliverability/load test

Pause a RUNNING or SCHEDULED deliverability test.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilityTestDto result = apiInstance.pauseDeliverabilityTest(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#pauseDeliverabilityTest");
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
| **testId** | **UUID**|  | |

### Return type

[**DeliverabilityTestDto**](DeliverabilityTestDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="pollDeliverabilityTestStatus"></a>
# **pollDeliverabilityTestStatus**
> DeliverabilityPollStatusResultDto pollDeliverabilityTestStatus(testId).execute();

Poll deliverability/load test status

Poll test progress. Evaluation is throttled with a 5-second cache window to protect backing data stores.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilityPollStatusResultDto result = apiInstance.pollDeliverabilityTestStatus(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#pollDeliverabilityTestStatus");
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
| **testId** | **UUID**|  | |

### Return type

[**DeliverabilityPollStatusResultDto**](DeliverabilityPollStatusResultDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="resumeDeliverabilitySimulationJob"></a>
# **resumeDeliverabilitySimulationJob**
> DeliverabilitySimulationJobDto resumeDeliverabilitySimulationJob(testId, jobId).execute();

Resume deliverability simulation job

Resume a paused simulation job.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilitySimulationJobDto result = apiInstance.resumeDeliverabilitySimulationJob(testId, jobId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#resumeDeliverabilitySimulationJob");
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
| **testId** | **UUID**|  | |
| **jobId** | **UUID**|  | |

### Return type

[**DeliverabilitySimulationJobDto**](DeliverabilitySimulationJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="startDeliverabilityTest"></a>
# **startDeliverabilityTest**
> DeliverabilityTestDto startDeliverabilityTest(testId).execute();

Start or resume deliverability/load test

Start a CREATED test or resume a PAUSED/SCHEDULED test.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilityTestDto result = apiInstance.startDeliverabilityTest(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#startDeliverabilityTest");
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
| **testId** | **UUID**|  | |

### Return type

[**DeliverabilityTestDto**](DeliverabilityTestDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="stopDeliverabilityTest"></a>
# **stopDeliverabilityTest**
> DeliverabilityTestDto stopDeliverabilityTest(testId).execute();

Stop deliverability/load test

Stop a deliverability test and mark it terminal.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    try {
      DeliverabilityTestDto result = apiInstance.stopDeliverabilityTest(testId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#stopDeliverabilityTest");
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
| **testId** | **UUID**|  | |

### Return type

[**DeliverabilityTestDto**](DeliverabilityTestDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDeliverabilityTest"></a>
# **updateDeliverabilityTest**
> DeliverabilityTestDto updateDeliverabilityTest(testId, updateDeliverabilityTestOptions).execute();

Update deliverability/load test

Update metadata, timeout, and expectations for a non-running non-terminal test.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DeliverabilityTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DeliverabilityTestControllerApi apiInstance = new DeliverabilityTestControllerApi(defaultClient);
    UUID testId = UUID.randomUUID(); // UUID | 
    UpdateDeliverabilityTestOptions updateDeliverabilityTestOptions = new UpdateDeliverabilityTestOptions(); // UpdateDeliverabilityTestOptions | 
    try {
      DeliverabilityTestDto result = apiInstance.updateDeliverabilityTest(testId, updateDeliverabilityTestOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeliverabilityTestControllerApi#updateDeliverabilityTest");
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
| **testId** | **UUID**|  | |
| **updateDeliverabilityTestOptions** | [**UpdateDeliverabilityTestOptions**](UpdateDeliverabilityTestOptions)|  | |

### Return type

[**DeliverabilityTestDto**](DeliverabilityTestDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

