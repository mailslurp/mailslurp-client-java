# CampaignProbeControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCampaignProbe**](CampaignProbeControllerApi#createCampaignProbe) | **POST** /campaign-probe/probes | Create campaign probe |
| [**deleteCampaignProbe**](CampaignProbeControllerApi#deleteCampaignProbe) | **DELETE** /campaign-probe/probes/{probeId} | Delete campaign probe |
| [**getCampaignProbe**](CampaignProbeControllerApi#getCampaignProbe) | **GET** /campaign-probe/probes/{probeId} | Get campaign probe |
| [**getCampaignProbeInsights**](CampaignProbeControllerApi#getCampaignProbeInsights) | **GET** /campaign-probe/probes/{probeId}/insights | Get campaign probe insights |
| [**getCampaignProbeRuns**](CampaignProbeControllerApi#getCampaignProbeRuns) | **GET** /campaign-probe/probes/{probeId}/runs | List campaign probe runs |
| [**getCampaignProbeSeries**](CampaignProbeControllerApi#getCampaignProbeSeries) | **GET** /campaign-probe/probes/{probeId}/series | Get campaign probe trend series |
| [**getCampaignProbes**](CampaignProbeControllerApi#getCampaignProbes) | **GET** /campaign-probe/probes | List campaign probes |
| [**runCampaignProbeNow**](CampaignProbeControllerApi#runCampaignProbeNow) | **POST** /campaign-probe/probes/{probeId}/run-now | Run campaign probe now |
| [**runDueCampaignProbes**](CampaignProbeControllerApi#runDueCampaignProbes) | **POST** /campaign-probe/probes/run-due | Run due campaign probes for user |
| [**updateCampaignProbe**](CampaignProbeControllerApi#updateCampaignProbe) | **PUT** /campaign-probe/probes/{probeId} | Update campaign probe |


<a id="createCampaignProbe"></a>
# **createCampaignProbe**
> CampaignProbeDto createCampaignProbe(createCampaignProbeOptions).execute();

Create campaign probe

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    CreateCampaignProbeOptions createCampaignProbeOptions = new CreateCampaignProbeOptions(); // CreateCampaignProbeOptions | 
    try {
      CampaignProbeDto result = apiInstance.createCampaignProbe(createCampaignProbeOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#createCampaignProbe");
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
| **createCampaignProbeOptions** | [**CreateCampaignProbeOptions**](CreateCampaignProbeOptions)|  | |

### Return type

[**CampaignProbeDto**](CampaignProbeDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteCampaignProbe"></a>
# **deleteCampaignProbe**
> deleteCampaignProbe(probeId).execute();

Delete campaign probe

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    UUID probeId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteCampaignProbe(probeId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#deleteCampaignProbe");
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
| **probeId** | **UUID**|  | |

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

<a id="getCampaignProbe"></a>
# **getCampaignProbe**
> CampaignProbeDto getCampaignProbe(probeId).execute();

Get campaign probe

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    UUID probeId = UUID.randomUUID(); // UUID | 
    try {
      CampaignProbeDto result = apiInstance.getCampaignProbe(probeId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#getCampaignProbe");
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
| **probeId** | **UUID**|  | |

### Return type

[**CampaignProbeDto**](CampaignProbeDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignProbeInsights"></a>
# **getCampaignProbeInsights**
> CampaignProbeInsightsDto getCampaignProbeInsights(probeId).since(since).before(before).execute();

Get campaign probe insights

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    UUID probeId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      CampaignProbeInsightsDto result = apiInstance.getCampaignProbeInsights(probeId)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#getCampaignProbeInsights");
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
| **probeId** | **UUID**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |

### Return type

[**CampaignProbeInsightsDto**](CampaignProbeInsightsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignProbeRuns"></a>
# **getCampaignProbeRuns**
> List&lt;CampaignProbeRunDto&gt; getCampaignProbeRuns(probeId).since(since).before(before).status(status).limit(limit).execute();

List campaign probe runs

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    UUID probeId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String status = "HEALTHY"; // String | 
    Integer limit = 56; // Integer | 
    try {
      List<CampaignProbeRunDto> result = apiInstance.getCampaignProbeRuns(probeId)
            .since(since)
            .before(before)
            .status(status)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#getCampaignProbeRuns");
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
| **probeId** | **UUID**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **status** | **String**|  | [optional] [enum: HEALTHY, WARNING, FAILED] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;CampaignProbeRunDto&gt;**](CampaignProbeRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignProbeSeries"></a>
# **getCampaignProbeSeries**
> CampaignProbeSeriesDto getCampaignProbeSeries(probeId).since(since).before(before).bucket(bucket).execute();

Get campaign probe trend series

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    UUID probeId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String bucket = "HOUR"; // String | 
    try {
      CampaignProbeSeriesDto result = apiInstance.getCampaignProbeSeries(probeId)
            .since(since)
            .before(before)
            .bucket(bucket)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#getCampaignProbeSeries");
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
| **probeId** | **UUID**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **bucket** | **String**|  | [optional] [default to DAY] [enum: HOUR, DAY] |

### Return type

[**CampaignProbeSeriesDto**](CampaignProbeSeriesDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getCampaignProbes"></a>
# **getCampaignProbes**
> List&lt;CampaignProbeDto&gt; getCampaignProbes().execute();

List campaign probes

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    try {
      List<CampaignProbeDto> result = apiInstance.getCampaignProbes()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#getCampaignProbes");
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

[**List&lt;CampaignProbeDto&gt;**](CampaignProbeDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="runCampaignProbeNow"></a>
# **runCampaignProbeNow**
> CampaignProbeRunNowResult runCampaignProbeNow(probeId, createCampaignProbeRunOptions).execute();

Run campaign probe now

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    UUID probeId = UUID.randomUUID(); // UUID | 
    CreateCampaignProbeRunOptions createCampaignProbeRunOptions = new CreateCampaignProbeRunOptions(); // CreateCampaignProbeRunOptions | 
    try {
      CampaignProbeRunNowResult result = apiInstance.runCampaignProbeNow(probeId, createCampaignProbeRunOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#runCampaignProbeNow");
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
| **probeId** | **UUID**|  | |
| **createCampaignProbeRunOptions** | [**CreateCampaignProbeRunOptions**](CreateCampaignProbeRunOptions)|  | |

### Return type

[**CampaignProbeRunNowResult**](CampaignProbeRunNowResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="runDueCampaignProbes"></a>
# **runDueCampaignProbes**
> CampaignProbeRunDueResult runDueCampaignProbes().maxRuns(maxRuns).execute();

Run due campaign probes for user

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    Integer maxRuns = 56; // Integer | 
    try {
      CampaignProbeRunDueResult result = apiInstance.runDueCampaignProbes()
            .maxRuns(maxRuns)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#runDueCampaignProbes");
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

[**CampaignProbeRunDueResult**](CampaignProbeRunDueResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateCampaignProbe"></a>
# **updateCampaignProbe**
> CampaignProbeDto updateCampaignProbe(probeId, updateCampaignProbeOptions).execute();

Update campaign probe

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CampaignProbeControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CampaignProbeControllerApi apiInstance = new CampaignProbeControllerApi(defaultClient);
    UUID probeId = UUID.randomUUID(); // UUID | 
    UpdateCampaignProbeOptions updateCampaignProbeOptions = new UpdateCampaignProbeOptions(); // UpdateCampaignProbeOptions | 
    try {
      CampaignProbeDto result = apiInstance.updateCampaignProbe(probeId, updateCampaignProbeOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignProbeControllerApi#updateCampaignProbe");
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
| **probeId** | **UUID**|  | |
| **updateCampaignProbeOptions** | [**UpdateCampaignProbeOptions**](UpdateCampaignProbeOptions)|  | |

### Return type

[**CampaignProbeDto**](CampaignProbeDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

