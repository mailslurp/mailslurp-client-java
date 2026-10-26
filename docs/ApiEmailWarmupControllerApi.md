# ApiEmailWarmupControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmailWarmupProgram**](ApiEmailWarmupControllerApi#createEmailWarmupProgram) | **POST** /email-warmup/programs | Create an email warmup program |
| [**deleteEmailWarmupProgram**](ApiEmailWarmupControllerApi#deleteEmailWarmupProgram) | **DELETE** /email-warmup/programs/{programId} | Delete an email warmup program |
| [**deleteEmailWarmupSenderSeats**](ApiEmailWarmupControllerApi#deleteEmailWarmupSenderSeats) | **DELETE** /email-warmup/programs/sender-seats | Cancel purchased email warmup sender seats |
| [**getEmailWarmupOverview**](ApiEmailWarmupControllerApi#getEmailWarmupOverview) | **GET** /email-warmup/programs/overview | Get operational email warmup activity and program progress |
| [**getEmailWarmupPlacementChecks**](ApiEmailWarmupControllerApi#getEmailWarmupPlacementChecks) | **GET** /email-warmup/programs/{programId}/placement-checks | List Gmail and Outlook placement checks for an email warmup program |
| [**getEmailWarmupProgram**](ApiEmailWarmupControllerApi#getEmailWarmupProgram) | **GET** /email-warmup/programs/{programId} | Get an email warmup program |
| [**getEmailWarmupProgramAnalytics**](ApiEmailWarmupControllerApi#getEmailWarmupProgramAnalytics) | **GET** /email-warmup/programs/{programId}/analytics | Get email warmup program progress and daily activity |
| [**getEmailWarmupPrograms**](ApiEmailWarmupControllerApi#getEmailWarmupPrograms) | **GET** /email-warmup/programs | List email warmup programs |
| [**getEmailWarmupReadiness**](ApiEmailWarmupControllerApi#getEmailWarmupReadiness) | **GET** /email-warmup/programs/{programId}/readiness | Get warmup readiness, adaptive pacing, and sender-health signals |
| [**getEmailWarmupSlots**](ApiEmailWarmupControllerApi#getEmailWarmupSlots) | **GET** /email-warmup/programs/{programId}/slots | List scheduled email warmup slots |
| [**getEmailWarmupUsage**](ApiEmailWarmupControllerApi#getEmailWarmupUsage) | **GET** /email-warmup/programs/usage | Get email warmup sender capacity, included credits, and billable usage |
| [**pauseEmailWarmupProgram**](ApiEmailWarmupControllerApi#pauseEmailWarmupProgram) | **POST** /email-warmup/programs/{programId}/pause | Pause an email warmup program |
| [**resumeEmailWarmupProgram**](ApiEmailWarmupControllerApi#resumeEmailWarmupProgram) | **POST** /email-warmup/programs/{programId}/resume | Resume an email warmup program |
| [**retryEmailWarmupProgram**](ApiEmailWarmupControllerApi#retryEmailWarmupProgram) | **POST** /email-warmup/programs/{programId}/retry | Retry a system-paused email warmup program |
| [**startEmailWarmupProgram**](ApiEmailWarmupControllerApi#startEmailWarmupProgram) | **POST** /email-warmup/programs/{programId}/start | Start an email warmup program |
| [**stopEmailWarmupProgram**](ApiEmailWarmupControllerApi#stopEmailWarmupProgram) | **POST** /email-warmup/programs/{programId}/stop | Stop an email warmup program |
| [**updateEmailWarmupProgram**](ApiEmailWarmupControllerApi#updateEmailWarmupProgram) | **PUT** /email-warmup/programs/{programId} | Update a draft email warmup program |
| [**updateEmailWarmupSenderSeats**](ApiEmailWarmupControllerApi#updateEmailWarmupSenderSeats) | **PUT** /email-warmup/programs/sender-seats | Update purchased email warmup sender seats |


<a id="createEmailWarmupProgram"></a>
# **createEmailWarmupProgram**
> EmailWarmupProgramDto createEmailWarmupProgram(createEmailWarmupProgramOptions).execute();

Create an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    CreateEmailWarmupProgramOptions createEmailWarmupProgramOptions = new CreateEmailWarmupProgramOptions(); // CreateEmailWarmupProgramOptions | 
    try {
      EmailWarmupProgramDto result = apiInstance.createEmailWarmupProgram(createEmailWarmupProgramOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#createEmailWarmupProgram");
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
| **createEmailWarmupProgramOptions** | [**CreateEmailWarmupProgramOptions**](CreateEmailWarmupProgramOptions)|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteEmailWarmupProgram"></a>
# **deleteEmailWarmupProgram**
> deleteEmailWarmupProgram(programId, emailWarmupProgramCommandOptions).execute();

Delete an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    EmailWarmupProgramCommandOptions emailWarmupProgramCommandOptions = new EmailWarmupProgramCommandOptions(); // EmailWarmupProgramCommandOptions | 
    try {
      apiInstance.deleteEmailWarmupProgram(programId, emailWarmupProgramCommandOptions)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#deleteEmailWarmupProgram");
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
| **programId** | **UUID**|  | |
| **emailWarmupProgramCommandOptions** | [**EmailWarmupProgramCommandOptions**](EmailWarmupProgramCommandOptions)|  | |

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

<a id="deleteEmailWarmupSenderSeats"></a>
# **deleteEmailWarmupSenderSeats**
> EmailWarmupUsageSummaryDto deleteEmailWarmupSenderSeats().execute();

Cancel purchased email warmup sender seats

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    try {
      EmailWarmupUsageSummaryDto result = apiInstance.deleteEmailWarmupSenderSeats()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#deleteEmailWarmupSenderSeats");
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

[**EmailWarmupUsageSummaryDto**](EmailWarmupUsageSummaryDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupOverview"></a>
# **getEmailWarmupOverview**
> EmailWarmupOverviewDto getEmailWarmupOverview().days(days).execute();

Get operational email warmup activity and program progress

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    Integer days = 30; // Integer | 
    try {
      EmailWarmupOverviewDto result = apiInstance.getEmailWarmupOverview()
            .days(days)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupOverview");
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
| **days** | **Integer**|  | [optional] [default to 30] |

### Return type

[**EmailWarmupOverviewDto**](EmailWarmupOverviewDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupPlacementChecks"></a>
# **getEmailWarmupPlacementChecks**
> List&lt;EmailWarmupPlacementCheckDto&gt; getEmailWarmupPlacementChecks(programId).execute();

List Gmail and Outlook placement checks for an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    try {
      List<EmailWarmupPlacementCheckDto> result = apiInstance.getEmailWarmupPlacementChecks(programId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupPlacementChecks");
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
| **programId** | **UUID**|  | |

### Return type

[**List&lt;EmailWarmupPlacementCheckDto&gt;**](EmailWarmupPlacementCheckDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupProgram"></a>
# **getEmailWarmupProgram**
> EmailWarmupProgramDto getEmailWarmupProgram(programId).execute();

Get an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    try {
      EmailWarmupProgramDto result = apiInstance.getEmailWarmupProgram(programId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupProgram");
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
| **programId** | **UUID**|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupProgramAnalytics"></a>
# **getEmailWarmupProgramAnalytics**
> EmailWarmupProgramAnalyticsDto getEmailWarmupProgramAnalytics(programId).days(days).execute();

Get email warmup program progress and daily activity

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    Integer days = 30; // Integer | 
    try {
      EmailWarmupProgramAnalyticsDto result = apiInstance.getEmailWarmupProgramAnalytics(programId)
            .days(days)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupProgramAnalytics");
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
| **programId** | **UUID**|  | |
| **days** | **Integer**|  | [optional] [default to 30] |

### Return type

[**EmailWarmupProgramAnalyticsDto**](EmailWarmupProgramAnalyticsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupPrograms"></a>
# **getEmailWarmupPrograms**
> EmailWarmupProgramPageDto getEmailWarmupPrograms().page(page).size(size).execute();

List email warmup programs

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    try {
      EmailWarmupProgramPageDto result = apiInstance.getEmailWarmupPrograms()
            .page(page)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupPrograms");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**EmailWarmupProgramPageDto**](EmailWarmupProgramPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupReadiness"></a>
# **getEmailWarmupReadiness**
> EmailWarmupReadinessDto getEmailWarmupReadiness(programId).execute();

Get warmup readiness, adaptive pacing, and sender-health signals

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    try {
      EmailWarmupReadinessDto result = apiInstance.getEmailWarmupReadiness(programId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupReadiness");
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
| **programId** | **UUID**|  | |

### Return type

[**EmailWarmupReadinessDto**](EmailWarmupReadinessDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupSlots"></a>
# **getEmailWarmupSlots**
> EmailWarmupSendSlotPageDto getEmailWarmupSlots(programId).page(page).size(size).execute();

List scheduled email warmup slots

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 50; // Integer | 
    try {
      EmailWarmupSendSlotPageDto result = apiInstance.getEmailWarmupSlots(programId)
            .page(page)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupSlots");
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
| **programId** | **UUID**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 50] |

### Return type

[**EmailWarmupSendSlotPageDto**](EmailWarmupSendSlotPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailWarmupUsage"></a>
# **getEmailWarmupUsage**
> EmailWarmupUsageSummaryDto getEmailWarmupUsage().execute();

Get email warmup sender capacity, included credits, and billable usage

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    try {
      EmailWarmupUsageSummaryDto result = apiInstance.getEmailWarmupUsage()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#getEmailWarmupUsage");
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

[**EmailWarmupUsageSummaryDto**](EmailWarmupUsageSummaryDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="pauseEmailWarmupProgram"></a>
# **pauseEmailWarmupProgram**
> EmailWarmupProgramDto pauseEmailWarmupProgram(programId, emailWarmupProgramCommandOptions).execute();

Pause an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    EmailWarmupProgramCommandOptions emailWarmupProgramCommandOptions = new EmailWarmupProgramCommandOptions(); // EmailWarmupProgramCommandOptions | 
    try {
      EmailWarmupProgramDto result = apiInstance.pauseEmailWarmupProgram(programId, emailWarmupProgramCommandOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#pauseEmailWarmupProgram");
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
| **programId** | **UUID**|  | |
| **emailWarmupProgramCommandOptions** | [**EmailWarmupProgramCommandOptions**](EmailWarmupProgramCommandOptions)|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="resumeEmailWarmupProgram"></a>
# **resumeEmailWarmupProgram**
> EmailWarmupProgramDto resumeEmailWarmupProgram(programId, emailWarmupProgramCommandOptions).execute();

Resume an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    EmailWarmupProgramCommandOptions emailWarmupProgramCommandOptions = new EmailWarmupProgramCommandOptions(); // EmailWarmupProgramCommandOptions | 
    try {
      EmailWarmupProgramDto result = apiInstance.resumeEmailWarmupProgram(programId, emailWarmupProgramCommandOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#resumeEmailWarmupProgram");
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
| **programId** | **UUID**|  | |
| **emailWarmupProgramCommandOptions** | [**EmailWarmupProgramCommandOptions**](EmailWarmupProgramCommandOptions)|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="retryEmailWarmupProgram"></a>
# **retryEmailWarmupProgram**
> EmailWarmupProgramDto retryEmailWarmupProgram(programId, emailWarmupProgramCommandOptions).execute();

Retry a system-paused email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    EmailWarmupProgramCommandOptions emailWarmupProgramCommandOptions = new EmailWarmupProgramCommandOptions(); // EmailWarmupProgramCommandOptions | 
    try {
      EmailWarmupProgramDto result = apiInstance.retryEmailWarmupProgram(programId, emailWarmupProgramCommandOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#retryEmailWarmupProgram");
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
| **programId** | **UUID**|  | |
| **emailWarmupProgramCommandOptions** | [**EmailWarmupProgramCommandOptions**](EmailWarmupProgramCommandOptions)|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="startEmailWarmupProgram"></a>
# **startEmailWarmupProgram**
> EmailWarmupProgramDto startEmailWarmupProgram(programId, emailWarmupProgramCommandOptions).execute();

Start an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    EmailWarmupProgramCommandOptions emailWarmupProgramCommandOptions = new EmailWarmupProgramCommandOptions(); // EmailWarmupProgramCommandOptions | 
    try {
      EmailWarmupProgramDto result = apiInstance.startEmailWarmupProgram(programId, emailWarmupProgramCommandOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#startEmailWarmupProgram");
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
| **programId** | **UUID**|  | |
| **emailWarmupProgramCommandOptions** | [**EmailWarmupProgramCommandOptions**](EmailWarmupProgramCommandOptions)|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="stopEmailWarmupProgram"></a>
# **stopEmailWarmupProgram**
> EmailWarmupProgramDto stopEmailWarmupProgram(programId, emailWarmupProgramCommandOptions).execute();

Stop an email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    EmailWarmupProgramCommandOptions emailWarmupProgramCommandOptions = new EmailWarmupProgramCommandOptions(); // EmailWarmupProgramCommandOptions | 
    try {
      EmailWarmupProgramDto result = apiInstance.stopEmailWarmupProgram(programId, emailWarmupProgramCommandOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#stopEmailWarmupProgram");
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
| **programId** | **UUID**|  | |
| **emailWarmupProgramCommandOptions** | [**EmailWarmupProgramCommandOptions**](EmailWarmupProgramCommandOptions)|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEmailWarmupProgram"></a>
# **updateEmailWarmupProgram**
> EmailWarmupProgramDto updateEmailWarmupProgram(programId, updateEmailWarmupProgramOptions).execute();

Update a draft email warmup program

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UUID programId = UUID.randomUUID(); // UUID | 
    UpdateEmailWarmupProgramOptions updateEmailWarmupProgramOptions = new UpdateEmailWarmupProgramOptions(); // UpdateEmailWarmupProgramOptions | 
    try {
      EmailWarmupProgramDto result = apiInstance.updateEmailWarmupProgram(programId, updateEmailWarmupProgramOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#updateEmailWarmupProgram");
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
| **programId** | **UUID**|  | |
| **updateEmailWarmupProgramOptions** | [**UpdateEmailWarmupProgramOptions**](UpdateEmailWarmupProgramOptions)|  | |

### Return type

[**EmailWarmupProgramDto**](EmailWarmupProgramDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateEmailWarmupSenderSeats"></a>
# **updateEmailWarmupSenderSeats**
> EmailWarmupUsageSummaryDto updateEmailWarmupSenderSeats(updateEmailWarmupSenderSeatsOptions).execute();

Update purchased email warmup sender seats

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiEmailWarmupControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiEmailWarmupControllerApi apiInstance = new ApiEmailWarmupControllerApi(defaultClient);
    UpdateEmailWarmupSenderSeatsOptions updateEmailWarmupSenderSeatsOptions = new UpdateEmailWarmupSenderSeatsOptions(); // UpdateEmailWarmupSenderSeatsOptions | 
    try {
      EmailWarmupUsageSummaryDto result = apiInstance.updateEmailWarmupSenderSeats(updateEmailWarmupSenderSeatsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiEmailWarmupControllerApi#updateEmailWarmupSenderSeats");
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
| **updateEmailWarmupSenderSeatsOptions** | [**UpdateEmailWarmupSenderSeatsOptions**](UpdateEmailWarmupSenderSeatsOptions)|  | |

### Return type

[**EmailWarmupUsageSummaryDto**](EmailWarmupUsageSummaryDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

