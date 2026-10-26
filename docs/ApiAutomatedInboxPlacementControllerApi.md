# ApiAutomatedInboxPlacementControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAutomatedInboxPlacementConnection**](ApiAutomatedInboxPlacementControllerApi#createAutomatedInboxPlacementConnection) | **POST** /inbox-placement-tests/automations/connections | Create an encrypted sender connection |
| [**createAutomatedInboxPlacementSchedule**](ApiAutomatedInboxPlacementControllerApi#createAutomatedInboxPlacementSchedule) | **POST** /inbox-placement-tests/automations/schedules | Create an automated inbox placement schedule |
| [**deleteAutomatedInboxPlacementConnection**](ApiAutomatedInboxPlacementControllerApi#deleteAutomatedInboxPlacementConnection) | **DELETE** /inbox-placement-tests/automations/connections/{connectionId} | Disconnect a sender connection |
| [**deleteAutomatedInboxPlacementSchedule**](ApiAutomatedInboxPlacementControllerApi#deleteAutomatedInboxPlacementSchedule) | **DELETE** /inbox-placement-tests/automations/schedules/{scheduleId} | Delete an automated inbox placement schedule |
| [**getAutomatedInboxPlacementConnection**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementConnection) | **GET** /inbox-placement-tests/automations/connections/{connectionId} | Get a sender connection |
| [**getAutomatedInboxPlacementConnections**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementConnections) | **GET** /inbox-placement-tests/automations/connections | List sender connections |
| [**getAutomatedInboxPlacementExecutionEvents**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementExecutionEvents) | **GET** /inbox-placement-tests/automations/schedules/{scheduleId}/executions/{executionId}/events | List non-secret execution events |
| [**getAutomatedInboxPlacementExecutions**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementExecutions) | **GET** /inbox-placement-tests/automations/schedules/{scheduleId}/executions | List schedule executions |
| [**getAutomatedInboxPlacementProviders**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementProviders) | **GET** /inbox-placement-tests/automations/providers | List automated inbox placement sender providers |
| [**getAutomatedInboxPlacementSchedule**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementSchedule) | **GET** /inbox-placement-tests/automations/schedules/{scheduleId} | Get an automated inbox placement schedule |
| [**getAutomatedInboxPlacementScheduleAnalyticsSeries**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementScheduleAnalyticsSeries) | **GET** /inbox-placement-tests/automations/schedules/{scheduleId}/analytics/series | Get automation inbox placement analytics over time |
| [**getAutomatedInboxPlacementSchedules**](ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementSchedules) | **GET** /inbox-placement-tests/automations/schedules | List automated inbox placement schedules |
| [**rotateAutomatedInboxPlacementConnectionCredentials**](ApiAutomatedInboxPlacementControllerApi#rotateAutomatedInboxPlacementConnectionCredentials) | **POST** /inbox-placement-tests/automations/connections/{connectionId}/credentials | Rotate sender connection credentials |
| [**runAutomatedInboxPlacementSchedule**](ApiAutomatedInboxPlacementControllerApi#runAutomatedInboxPlacementSchedule) | **POST** /inbox-placement-tests/automations/schedules/{scheduleId}/run | Run an automated inbox placement schedule now |
| [**updateAutomatedInboxPlacementConnection**](ApiAutomatedInboxPlacementControllerApi#updateAutomatedInboxPlacementConnection) | **PATCH** /inbox-placement-tests/automations/connections/{connectionId} | Update a sender connection |
| [**updateAutomatedInboxPlacementSchedule**](ApiAutomatedInboxPlacementControllerApi#updateAutomatedInboxPlacementSchedule) | **PATCH** /inbox-placement-tests/automations/schedules/{scheduleId} | Update an automated inbox placement schedule |
| [**verifyAutomatedInboxPlacementConnection**](ApiAutomatedInboxPlacementControllerApi#verifyAutomatedInboxPlacementConnection) | **POST** /inbox-placement-tests/automations/connections/{connectionId}/verify | Verify a sender connection |


<a id="createAutomatedInboxPlacementConnection"></a>
# **createAutomatedInboxPlacementConnection**
> AutomatedInboxPlacementConnectionDto createAutomatedInboxPlacementConnection(createAutomatedInboxPlacementConnectionOptions).execute();

Create an encrypted sender connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    CreateAutomatedInboxPlacementConnectionOptions createAutomatedInboxPlacementConnectionOptions = new CreateAutomatedInboxPlacementConnectionOptions(); // CreateAutomatedInboxPlacementConnectionOptions | 
    try {
      AutomatedInboxPlacementConnectionDto result = apiInstance.createAutomatedInboxPlacementConnection(createAutomatedInboxPlacementConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#createAutomatedInboxPlacementConnection");
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
| **createAutomatedInboxPlacementConnectionOptions** | [**CreateAutomatedInboxPlacementConnectionOptions**](CreateAutomatedInboxPlacementConnectionOptions)|  | |

### Return type

[**AutomatedInboxPlacementConnectionDto**](AutomatedInboxPlacementConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createAutomatedInboxPlacementSchedule"></a>
# **createAutomatedInboxPlacementSchedule**
> AutomatedInboxPlacementScheduleDto createAutomatedInboxPlacementSchedule(createAutomatedInboxPlacementScheduleOptions).execute();

Create an automated inbox placement schedule

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    CreateAutomatedInboxPlacementScheduleOptions createAutomatedInboxPlacementScheduleOptions = new CreateAutomatedInboxPlacementScheduleOptions(); // CreateAutomatedInboxPlacementScheduleOptions | 
    try {
      AutomatedInboxPlacementScheduleDto result = apiInstance.createAutomatedInboxPlacementSchedule(createAutomatedInboxPlacementScheduleOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#createAutomatedInboxPlacementSchedule");
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
| **createAutomatedInboxPlacementScheduleOptions** | [**CreateAutomatedInboxPlacementScheduleOptions**](CreateAutomatedInboxPlacementScheduleOptions)|  | |

### Return type

[**AutomatedInboxPlacementScheduleDto**](AutomatedInboxPlacementScheduleDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAutomatedInboxPlacementConnection"></a>
# **deleteAutomatedInboxPlacementConnection**
> deleteAutomatedInboxPlacementConnection(connectionId).execute();

Disconnect a sender connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAutomatedInboxPlacementConnection(connectionId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#deleteAutomatedInboxPlacementConnection");
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
| **connectionId** | **UUID**|  | |

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

<a id="deleteAutomatedInboxPlacementSchedule"></a>
# **deleteAutomatedInboxPlacementSchedule**
> deleteAutomatedInboxPlacementSchedule(scheduleId).execute();

Delete an automated inbox placement schedule

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID scheduleId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAutomatedInboxPlacementSchedule(scheduleId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#deleteAutomatedInboxPlacementSchedule");
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
| **scheduleId** | **UUID**|  | |

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

<a id="getAutomatedInboxPlacementConnection"></a>
# **getAutomatedInboxPlacementConnection**
> AutomatedInboxPlacementConnectionDto getAutomatedInboxPlacementConnection(connectionId).execute();

Get a sender connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      AutomatedInboxPlacementConnectionDto result = apiInstance.getAutomatedInboxPlacementConnection(connectionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementConnection");
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
| **connectionId** | **UUID**|  | |

### Return type

[**AutomatedInboxPlacementConnectionDto**](AutomatedInboxPlacementConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomatedInboxPlacementConnections"></a>
# **getAutomatedInboxPlacementConnections**
> List&lt;AutomatedInboxPlacementConnectionDto&gt; getAutomatedInboxPlacementConnections().execute();

List sender connections

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    try {
      List<AutomatedInboxPlacementConnectionDto> result = apiInstance.getAutomatedInboxPlacementConnections()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementConnections");
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

[**List&lt;AutomatedInboxPlacementConnectionDto&gt;**](AutomatedInboxPlacementConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomatedInboxPlacementExecutionEvents"></a>
# **getAutomatedInboxPlacementExecutionEvents**
> List&lt;AutomatedInboxPlacementEventDto&gt; getAutomatedInboxPlacementExecutionEvents(scheduleId, executionId).execute();

List non-secret execution events

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID scheduleId = UUID.randomUUID(); // UUID | 
    UUID executionId = UUID.randomUUID(); // UUID | 
    try {
      List<AutomatedInboxPlacementEventDto> result = apiInstance.getAutomatedInboxPlacementExecutionEvents(scheduleId, executionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementExecutionEvents");
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
| **scheduleId** | **UUID**|  | |
| **executionId** | **UUID**|  | |

### Return type

[**List&lt;AutomatedInboxPlacementEventDto&gt;**](AutomatedInboxPlacementEventDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomatedInboxPlacementExecutions"></a>
# **getAutomatedInboxPlacementExecutions**
> List&lt;AutomatedInboxPlacementExecutionDto&gt; getAutomatedInboxPlacementExecutions(scheduleId).limit(limit).execute();

List schedule executions

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID scheduleId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    try {
      List<AutomatedInboxPlacementExecutionDto> result = apiInstance.getAutomatedInboxPlacementExecutions(scheduleId)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementExecutions");
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
| **scheduleId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 50] |

### Return type

[**List&lt;AutomatedInboxPlacementExecutionDto&gt;**](AutomatedInboxPlacementExecutionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomatedInboxPlacementProviders"></a>
# **getAutomatedInboxPlacementProviders**
> List&lt;AutomatedInboxPlacementProviderDto&gt; getAutomatedInboxPlacementProviders().execute();

List automated inbox placement sender providers

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    try {
      List<AutomatedInboxPlacementProviderDto> result = apiInstance.getAutomatedInboxPlacementProviders()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementProviders");
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

[**List&lt;AutomatedInboxPlacementProviderDto&gt;**](AutomatedInboxPlacementProviderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomatedInboxPlacementSchedule"></a>
# **getAutomatedInboxPlacementSchedule**
> AutomatedInboxPlacementScheduleDto getAutomatedInboxPlacementSchedule(scheduleId).execute();

Get an automated inbox placement schedule

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID scheduleId = UUID.randomUUID(); // UUID | 
    try {
      AutomatedInboxPlacementScheduleDto result = apiInstance.getAutomatedInboxPlacementSchedule(scheduleId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementSchedule");
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
| **scheduleId** | **UUID**|  | |

### Return type

[**AutomatedInboxPlacementScheduleDto**](AutomatedInboxPlacementScheduleDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomatedInboxPlacementScheduleAnalyticsSeries"></a>
# **getAutomatedInboxPlacementScheduleAnalyticsSeries**
> InboxPlacementAnalyticsSeriesDto getAutomatedInboxPlacementScheduleAnalyticsSeries(scheduleId).since(since).before(before).bucket(bucket).runLimit(runLimit).execute();

Get automation inbox placement analytics over time

Returns chart-ready metrics for billed placement runs created by this schedule only.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID scheduleId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String bucket = "HOUR"; // String | 
    Integer runLimit = 56; // Integer | 
    try {
      InboxPlacementAnalyticsSeriesDto result = apiInstance.getAutomatedInboxPlacementScheduleAnalyticsSeries(scheduleId)
            .since(since)
            .before(before)
            .bucket(bucket)
            .runLimit(runLimit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementScheduleAnalyticsSeries");
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
| **scheduleId** | **UUID**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **bucket** | **String**|  | [optional] [default to DAY] [enum: HOUR, DAY] |
| **runLimit** | **Integer**|  | [optional] |

### Return type

[**InboxPlacementAnalyticsSeriesDto**](InboxPlacementAnalyticsSeriesDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAutomatedInboxPlacementSchedules"></a>
# **getAutomatedInboxPlacementSchedules**
> List&lt;AutomatedInboxPlacementScheduleDto&gt; getAutomatedInboxPlacementSchedules().execute();

List automated inbox placement schedules

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    try {
      List<AutomatedInboxPlacementScheduleDto> result = apiInstance.getAutomatedInboxPlacementSchedules()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#getAutomatedInboxPlacementSchedules");
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

[**List&lt;AutomatedInboxPlacementScheduleDto&gt;**](AutomatedInboxPlacementScheduleDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rotateAutomatedInboxPlacementConnectionCredentials"></a>
# **rotateAutomatedInboxPlacementConnectionCredentials**
> AutomatedInboxPlacementConnectionDto rotateAutomatedInboxPlacementConnectionCredentials(connectionId, rotateAutomatedInboxPlacementConnectionCredentialsOptions).execute();

Rotate sender connection credentials

Verifies the replacement SMTP settings before atomically replacing the encrypted credential envelope. A failed verification leaves the existing connection unchanged.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    RotateAutomatedInboxPlacementConnectionCredentialsOptions rotateAutomatedInboxPlacementConnectionCredentialsOptions = new RotateAutomatedInboxPlacementConnectionCredentialsOptions(); // RotateAutomatedInboxPlacementConnectionCredentialsOptions | 
    try {
      AutomatedInboxPlacementConnectionDto result = apiInstance.rotateAutomatedInboxPlacementConnectionCredentials(connectionId, rotateAutomatedInboxPlacementConnectionCredentialsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#rotateAutomatedInboxPlacementConnectionCredentials");
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
| **connectionId** | **UUID**|  | |
| **rotateAutomatedInboxPlacementConnectionCredentialsOptions** | [**RotateAutomatedInboxPlacementConnectionCredentialsOptions**](RotateAutomatedInboxPlacementConnectionCredentialsOptions)|  | |

### Return type

[**AutomatedInboxPlacementConnectionDto**](AutomatedInboxPlacementConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="runAutomatedInboxPlacementSchedule"></a>
# **runAutomatedInboxPlacementSchedule**
> AutomatedInboxPlacementExecutionDto runAutomatedInboxPlacementSchedule(scheduleId).execute();

Run an automated inbox placement schedule now

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID scheduleId = UUID.randomUUID(); // UUID | 
    try {
      AutomatedInboxPlacementExecutionDto result = apiInstance.runAutomatedInboxPlacementSchedule(scheduleId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#runAutomatedInboxPlacementSchedule");
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
| **scheduleId** | **UUID**|  | |

### Return type

[**AutomatedInboxPlacementExecutionDto**](AutomatedInboxPlacementExecutionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAutomatedInboxPlacementConnection"></a>
# **updateAutomatedInboxPlacementConnection**
> AutomatedInboxPlacementConnectionDto updateAutomatedInboxPlacementConnection(connectionId, updateAutomatedInboxPlacementConnectionOptions).execute();

Update a sender connection

Updates non-secret connection metadata. Use the credentials endpoint to replace SMTP credentials or transport settings.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    UpdateAutomatedInboxPlacementConnectionOptions updateAutomatedInboxPlacementConnectionOptions = new UpdateAutomatedInboxPlacementConnectionOptions(); // UpdateAutomatedInboxPlacementConnectionOptions | 
    try {
      AutomatedInboxPlacementConnectionDto result = apiInstance.updateAutomatedInboxPlacementConnection(connectionId, updateAutomatedInboxPlacementConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#updateAutomatedInboxPlacementConnection");
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
| **connectionId** | **UUID**|  | |
| **updateAutomatedInboxPlacementConnectionOptions** | [**UpdateAutomatedInboxPlacementConnectionOptions**](UpdateAutomatedInboxPlacementConnectionOptions)|  | |

### Return type

[**AutomatedInboxPlacementConnectionDto**](AutomatedInboxPlacementConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateAutomatedInboxPlacementSchedule"></a>
# **updateAutomatedInboxPlacementSchedule**
> AutomatedInboxPlacementScheduleDto updateAutomatedInboxPlacementSchedule(scheduleId, updateAutomatedInboxPlacementScheduleOptions).execute();

Update an automated inbox placement schedule

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID scheduleId = UUID.randomUUID(); // UUID | 
    UpdateAutomatedInboxPlacementScheduleOptions updateAutomatedInboxPlacementScheduleOptions = new UpdateAutomatedInboxPlacementScheduleOptions(); // UpdateAutomatedInboxPlacementScheduleOptions | 
    try {
      AutomatedInboxPlacementScheduleDto result = apiInstance.updateAutomatedInboxPlacementSchedule(scheduleId, updateAutomatedInboxPlacementScheduleOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#updateAutomatedInboxPlacementSchedule");
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
| **scheduleId** | **UUID**|  | |
| **updateAutomatedInboxPlacementScheduleOptions** | [**UpdateAutomatedInboxPlacementScheduleOptions**](UpdateAutomatedInboxPlacementScheduleOptions)|  | |

### Return type

[**AutomatedInboxPlacementScheduleDto**](AutomatedInboxPlacementScheduleDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="verifyAutomatedInboxPlacementConnection"></a>
# **verifyAutomatedInboxPlacementConnection**
> AutomatedInboxPlacementConnectionDto verifyAutomatedInboxPlacementConnection(connectionId).execute();

Verify a sender connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAutomatedInboxPlacementControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAutomatedInboxPlacementControllerApi apiInstance = new ApiAutomatedInboxPlacementControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      AutomatedInboxPlacementConnectionDto result = apiInstance.verifyAutomatedInboxPlacementConnection(connectionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAutomatedInboxPlacementControllerApi#verifyAutomatedInboxPlacementConnection");
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
| **connectionId** | **UUID**|  | |

### Return type

[**AutomatedInboxPlacementConnectionDto**](AutomatedInboxPlacementConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

