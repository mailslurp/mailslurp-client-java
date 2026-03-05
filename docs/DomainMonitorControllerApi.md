# DomainMonitorControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDomainMonitor**](DomainMonitorControllerApi#createDomainMonitor) | **POST** /domain-monitor/monitors | Create domain monitor |
| [**createDomainMonitorAlertSink**](DomainMonitorControllerApi#createDomainMonitorAlertSink) | **POST** /domain-monitor/monitors/{monitorId}/alert-sinks | Create alert sink for monitor |
| [**deleteDomainMonitor**](DomainMonitorControllerApi#deleteDomainMonitor) | **DELETE** /domain-monitor/monitors/{monitorId} | Delete domain monitor |
| [**deleteDomainMonitorAlertSink**](DomainMonitorControllerApi#deleteDomainMonitorAlertSink) | **DELETE** /domain-monitor/monitors/{monitorId}/alert-sinks/{sinkId} | Delete monitor alert sink |
| [**getDomainMonitor**](DomainMonitorControllerApi#getDomainMonitor) | **GET** /domain-monitor/monitors/{monitorId} | Get domain monitor |
| [**getDomainMonitorAlertSinks**](DomainMonitorControllerApi#getDomainMonitorAlertSinks) | **GET** /domain-monitor/monitors/{monitorId}/alert-sinks | List alert sinks for monitor |
| [**getDomainMonitorInsights**](DomainMonitorControllerApi#getDomainMonitorInsights) | **GET** /domain-monitor/monitors/{monitorId}/insights | Get monitor insights |
| [**getDomainMonitorRuns**](DomainMonitorControllerApi#getDomainMonitorRuns) | **GET** /domain-monitor/monitors/{monitorId}/runs | List monitor runs |
| [**getDomainMonitorSeries**](DomainMonitorControllerApi#getDomainMonitorSeries) | **GET** /domain-monitor/monitors/{monitorId}/series | Get monitor trend series |
| [**getDomainMonitors**](DomainMonitorControllerApi#getDomainMonitors) | **GET** /domain-monitor/monitors | List domain monitors |
| [**runDomainMonitorNow**](DomainMonitorControllerApi#runDomainMonitorNow) | **POST** /domain-monitor/monitors/{monitorId}/run-now | Run monitor now |
| [**runDueDomainMonitors**](DomainMonitorControllerApi#runDueDomainMonitors) | **POST** /domain-monitor/monitors/run-due | Run due monitors for user |
| [**updateDomainMonitor**](DomainMonitorControllerApi#updateDomainMonitor) | **PUT** /domain-monitor/monitors/{monitorId} | Update domain monitor |


<a id="createDomainMonitor"></a>
# **createDomainMonitor**
> DomainMonitorDto createDomainMonitor(createDomainMonitorOptions).execute();

Create domain monitor

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    CreateDomainMonitorOptions createDomainMonitorOptions = new CreateDomainMonitorOptions(); // CreateDomainMonitorOptions | 
    try {
      DomainMonitorDto result = apiInstance.createDomainMonitor(createDomainMonitorOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#createDomainMonitor");
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
| **createDomainMonitorOptions** | [**CreateDomainMonitorOptions**](CreateDomainMonitorOptions)|  | |

### Return type

[**DomainMonitorDto**](DomainMonitorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createDomainMonitorAlertSink"></a>
# **createDomainMonitorAlertSink**
> DomainMonitorAlertSinkDto createDomainMonitorAlertSink(monitorId, createDomainMonitorAlertSinkOptions).execute();

Create alert sink for monitor

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    CreateDomainMonitorAlertSinkOptions createDomainMonitorAlertSinkOptions = new CreateDomainMonitorAlertSinkOptions(); // CreateDomainMonitorAlertSinkOptions | 
    try {
      DomainMonitorAlertSinkDto result = apiInstance.createDomainMonitorAlertSink(monitorId, createDomainMonitorAlertSinkOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#createDomainMonitorAlertSink");
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
| **monitorId** | **UUID**|  | |
| **createDomainMonitorAlertSinkOptions** | [**CreateDomainMonitorAlertSinkOptions**](CreateDomainMonitorAlertSinkOptions)|  | |

### Return type

[**DomainMonitorAlertSinkDto**](DomainMonitorAlertSinkDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteDomainMonitor"></a>
# **deleteDomainMonitor**
> deleteDomainMonitor(monitorId).execute();

Delete domain monitor

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteDomainMonitor(monitorId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#deleteDomainMonitor");
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
| **monitorId** | **UUID**|  | |

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

<a id="deleteDomainMonitorAlertSink"></a>
# **deleteDomainMonitorAlertSink**
> deleteDomainMonitorAlertSink(monitorId, sinkId).execute();

Delete monitor alert sink

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    UUID sinkId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteDomainMonitorAlertSink(monitorId, sinkId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#deleteDomainMonitorAlertSink");
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
| **monitorId** | **UUID**|  | |
| **sinkId** | **UUID**|  | |

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

<a id="getDomainMonitor"></a>
# **getDomainMonitor**
> DomainMonitorDto getDomainMonitor(monitorId).execute();

Get domain monitor

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    try {
      DomainMonitorDto result = apiInstance.getDomainMonitor(monitorId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#getDomainMonitor");
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
| **monitorId** | **UUID**|  | |

### Return type

[**DomainMonitorDto**](DomainMonitorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDomainMonitorAlertSinks"></a>
# **getDomainMonitorAlertSinks**
> List&lt;DomainMonitorAlertSinkDto&gt; getDomainMonitorAlertSinks(monitorId).execute();

List alert sinks for monitor

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    try {
      List<DomainMonitorAlertSinkDto> result = apiInstance.getDomainMonitorAlertSinks(monitorId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#getDomainMonitorAlertSinks");
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
| **monitorId** | **UUID**|  | |

### Return type

[**List&lt;DomainMonitorAlertSinkDto&gt;**](DomainMonitorAlertSinkDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDomainMonitorInsights"></a>
# **getDomainMonitorInsights**
> DomainMonitorInsightsDto getDomainMonitorInsights(monitorId).since(since).before(before).execute();

Get monitor insights

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      DomainMonitorInsightsDto result = apiInstance.getDomainMonitorInsights(monitorId)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#getDomainMonitorInsights");
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
| **monitorId** | **UUID**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |

### Return type

[**DomainMonitorInsightsDto**](DomainMonitorInsightsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDomainMonitorRuns"></a>
# **getDomainMonitorRuns**
> List&lt;DomainMonitorRunDto&gt; getDomainMonitorRuns(monitorId).since(since).before(before).status(status).limit(limit).execute();

List monitor runs

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String status = "HEALTHY"; // String | 
    Integer limit = 56; // Integer | 
    try {
      List<DomainMonitorRunDto> result = apiInstance.getDomainMonitorRuns(monitorId)
            .since(since)
            .before(before)
            .status(status)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#getDomainMonitorRuns");
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
| **monitorId** | **UUID**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **status** | **String**|  | [optional] [enum: HEALTHY, DEGRADED, CRITICAL, FAILED] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;DomainMonitorRunDto&gt;**](DomainMonitorRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDomainMonitorSeries"></a>
# **getDomainMonitorSeries**
> DomainMonitorSeriesDto getDomainMonitorSeries(monitorId).since(since).before(before).bucket(bucket).execute();

Get monitor trend series

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String bucket = "HOUR"; // String | 
    try {
      DomainMonitorSeriesDto result = apiInstance.getDomainMonitorSeries(monitorId)
            .since(since)
            .before(before)
            .bucket(bucket)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#getDomainMonitorSeries");
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
| **monitorId** | **UUID**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **bucket** | **String**|  | [optional] [default to DAY] [enum: HOUR, DAY] |

### Return type

[**DomainMonitorSeriesDto**](DomainMonitorSeriesDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDomainMonitors"></a>
# **getDomainMonitors**
> List&lt;DomainMonitorDto&gt; getDomainMonitors().execute();

List domain monitors

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    try {
      List<DomainMonitorDto> result = apiInstance.getDomainMonitors()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#getDomainMonitors");
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

[**List&lt;DomainMonitorDto&gt;**](DomainMonitorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="runDomainMonitorNow"></a>
# **runDomainMonitorNow**
> DomainMonitorRunNowResult runDomainMonitorNow(monitorId).execute();

Run monitor now

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    try {
      DomainMonitorRunNowResult result = apiInstance.runDomainMonitorNow(monitorId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#runDomainMonitorNow");
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
| **monitorId** | **UUID**|  | |

### Return type

[**DomainMonitorRunNowResult**](DomainMonitorRunNowResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="runDueDomainMonitors"></a>
# **runDueDomainMonitors**
> DomainMonitorRunDueResult runDueDomainMonitors().maxRuns(maxRuns).execute();

Run due monitors for user

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    Integer maxRuns = 56; // Integer | 
    try {
      DomainMonitorRunDueResult result = apiInstance.runDueDomainMonitors()
            .maxRuns(maxRuns)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#runDueDomainMonitors");
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
| **maxRuns** | **Integer**|  | [optional] |

### Return type

[**DomainMonitorRunDueResult**](DomainMonitorRunDueResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDomainMonitor"></a>
# **updateDomainMonitor**
> DomainMonitorDto updateDomainMonitor(monitorId, updateDomainMonitorOptions).execute();

Update domain monitor

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorControllerApi apiInstance = new DomainMonitorControllerApi(defaultClient);
    UUID monitorId = UUID.randomUUID(); // UUID | 
    UpdateDomainMonitorOptions updateDomainMonitorOptions = new UpdateDomainMonitorOptions(); // UpdateDomainMonitorOptions | 
    try {
      DomainMonitorDto result = apiInstance.updateDomainMonitor(monitorId, updateDomainMonitorOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorControllerApi#updateDomainMonitor");
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
| **monitorId** | **UUID**|  | |
| **updateDomainMonitorOptions** | [**UpdateDomainMonitorOptions**](UpdateDomainMonitorOptions)|  | |

### Return type

[**DomainMonitorDto**](DomainMonitorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

