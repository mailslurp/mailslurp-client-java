# DomainMonitorPostmasterControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDomainMonitorPostmasterConnection**](DomainMonitorPostmasterControllerApi#createDomainMonitorPostmasterConnection) | **POST** /domain-monitor/postmaster/connect | Create Postmaster OAuth connection URL |
| [**deleteDomainMonitorPostmasterConnection**](DomainMonitorPostmasterControllerApi#deleteDomainMonitorPostmasterConnection) | **DELETE** /domain-monitor/postmaster/connection | Disconnect Postmaster OAuth |
| [**exchangeDomainMonitorPostmasterCode**](DomainMonitorPostmasterControllerApi#exchangeDomainMonitorPostmasterCode) | **POST** /domain-monitor/postmaster/oauth-exchange | Exchange Postmaster OAuth authorization code |
| [**getDomainMonitorPostmasterConnection**](DomainMonitorPostmasterControllerApi#getDomainMonitorPostmasterConnection) | **GET** /domain-monitor/postmaster/connection | Get Postmaster connection status |
| [**getDomainMonitorPostmasterDomains**](DomainMonitorPostmasterControllerApi#getDomainMonitorPostmasterDomains) | **GET** /domain-monitor/postmaster/domains | List local Postmaster domain snapshots |
| [**getDomainMonitorPostmasterTrafficStats**](DomainMonitorPostmasterControllerApi#getDomainMonitorPostmasterTrafficStats) | **GET** /domain-monitor/postmaster/domains/{domain}/traffic-stats | Get local Postmaster traffic stats |
| [**syncDomainMonitorPostmasterDomains**](DomainMonitorPostmasterControllerApi#syncDomainMonitorPostmasterDomains) | **POST** /domain-monitor/postmaster/domains/sync | Sync Postmaster domains |
| [**syncDomainMonitorPostmasterTrafficStats**](DomainMonitorPostmasterControllerApi#syncDomainMonitorPostmasterTrafficStats) | **POST** /domain-monitor/postmaster/domains/{domain}/traffic-stats/sync | Sync Postmaster traffic stats |


<a id="createDomainMonitorPostmasterConnection"></a>
# **createDomainMonitorPostmasterConnection**
> CreatePostmasterConnectionResult createDomainMonitorPostmasterConnection(createPostmasterConnectionOptions).execute();

Create Postmaster OAuth connection URL

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    CreatePostmasterConnectionOptions createPostmasterConnectionOptions = new CreatePostmasterConnectionOptions(); // CreatePostmasterConnectionOptions | 
    try {
      CreatePostmasterConnectionResult result = apiInstance.createDomainMonitorPostmasterConnection(createPostmasterConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#createDomainMonitorPostmasterConnection");
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
| **createPostmasterConnectionOptions** | [**CreatePostmasterConnectionOptions**](CreatePostmasterConnectionOptions)|  | |

### Return type

[**CreatePostmasterConnectionResult**](CreatePostmasterConnectionResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteDomainMonitorPostmasterConnection"></a>
# **deleteDomainMonitorPostmasterConnection**
> deleteDomainMonitorPostmasterConnection().execute();

Disconnect Postmaster OAuth

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    try {
      apiInstance.deleteDomainMonitorPostmasterConnection()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#deleteDomainMonitorPostmasterConnection");
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

<a id="exchangeDomainMonitorPostmasterCode"></a>
# **exchangeDomainMonitorPostmasterCode**
> PostmasterConnectionDto exchangeDomainMonitorPostmasterCode(exchangePostmasterCodeOptions).execute();

Exchange Postmaster OAuth authorization code

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    ExchangePostmasterCodeOptions exchangePostmasterCodeOptions = new ExchangePostmasterCodeOptions(); // ExchangePostmasterCodeOptions | 
    try {
      PostmasterConnectionDto result = apiInstance.exchangeDomainMonitorPostmasterCode(exchangePostmasterCodeOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#exchangeDomainMonitorPostmasterCode");
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
| **exchangePostmasterCodeOptions** | [**ExchangePostmasterCodeOptions**](ExchangePostmasterCodeOptions)|  | |

### Return type

[**PostmasterConnectionDto**](PostmasterConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="getDomainMonitorPostmasterConnection"></a>
# **getDomainMonitorPostmasterConnection**
> PostmasterConnectionStatusDto getDomainMonitorPostmasterConnection().execute();

Get Postmaster connection status

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    try {
      PostmasterConnectionStatusDto result = apiInstance.getDomainMonitorPostmasterConnection()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#getDomainMonitorPostmasterConnection");
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

[**PostmasterConnectionStatusDto**](PostmasterConnectionStatusDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDomainMonitorPostmasterDomains"></a>
# **getDomainMonitorPostmasterDomains**
> List&lt;PostmasterDomainDto&gt; getDomainMonitorPostmasterDomains().execute();

List local Postmaster domain snapshots

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    try {
      List<PostmasterDomainDto> result = apiInstance.getDomainMonitorPostmasterDomains()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#getDomainMonitorPostmasterDomains");
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

[**List&lt;PostmasterDomainDto&gt;**](PostmasterDomainDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDomainMonitorPostmasterTrafficStats"></a>
# **getDomainMonitorPostmasterTrafficStats**
> PostmasterTrafficStatsListDto getDomainMonitorPostmasterTrafficStats(domain).startDate(startDate).endDate(endDate).execute();

Get local Postmaster traffic stats

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    LocalDate startDate = LocalDate.now(); // LocalDate | 
    LocalDate endDate = LocalDate.now(); // LocalDate | 
    try {
      PostmasterTrafficStatsListDto result = apiInstance.getDomainMonitorPostmasterTrafficStats(domain)
            .startDate(startDate)
            .endDate(endDate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#getDomainMonitorPostmasterTrafficStats");
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
| **domain** | **String**|  | |
| **startDate** | **LocalDate**|  | [optional] |
| **endDate** | **LocalDate**|  | [optional] |

### Return type

[**PostmasterTrafficStatsListDto**](PostmasterTrafficStatsListDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="syncDomainMonitorPostmasterDomains"></a>
# **syncDomainMonitorPostmasterDomains**
> List&lt;PostmasterDomainDto&gt; syncDomainMonitorPostmasterDomains().execute();

Sync Postmaster domains

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    try {
      List<PostmasterDomainDto> result = apiInstance.syncDomainMonitorPostmasterDomains()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#syncDomainMonitorPostmasterDomains");
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

[**List&lt;PostmasterDomainDto&gt;**](PostmasterDomainDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="syncDomainMonitorPostmasterTrafficStats"></a>
# **syncDomainMonitorPostmasterTrafficStats**
> PostmasterTrafficStatsListDto syncDomainMonitorPostmasterTrafficStats(domain).startDate(startDate).endDate(endDate).execute();

Sync Postmaster traffic stats

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DomainMonitorPostmasterControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DomainMonitorPostmasterControllerApi apiInstance = new DomainMonitorPostmasterControllerApi(defaultClient);
    String domain = "domain_example"; // String | 
    LocalDate startDate = LocalDate.now(); // LocalDate | 
    LocalDate endDate = LocalDate.now(); // LocalDate | 
    try {
      PostmasterTrafficStatsListDto result = apiInstance.syncDomainMonitorPostmasterTrafficStats(domain)
            .startDate(startDate)
            .endDate(endDate)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DomainMonitorPostmasterControllerApi#syncDomainMonitorPostmasterTrafficStats");
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
| **domain** | **String**|  | |
| **startDate** | **LocalDate**|  | [optional] |
| **endDate** | **LocalDate**|  | [optional] |

### Return type

[**PostmasterTrafficStatsListDto**](PostmasterTrafficStatsListDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

