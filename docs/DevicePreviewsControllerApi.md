# DevicePreviewsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDevicePreviewRun**](DevicePreviewsControllerApi#cancelDevicePreviewRun) | **POST** /emails/device-previews/{runId}/cancel | Cancel a running device preview run |
| [**createDevicePreviewFeedback**](DevicePreviewsControllerApi#createDevicePreviewFeedback) | **POST** /emails/device-previews/feedback | Create device preview feedback |
| [**createDevicePreviewRun**](DevicePreviewsControllerApi#createDevicePreviewRun) | **POST** /emails/{emailId}/device-previews | Create a new device preview run for an email |
| [**deleteDevicePreviewRun**](DevicePreviewsControllerApi#deleteDevicePreviewRun) | **DELETE** /emails/device-previews/{runId} | Delete local device preview run data |
| [**ensureDevicePreviewRun**](DevicePreviewsControllerApi#ensureDevicePreviewRun) | **PUT** /emails/{emailId}/device-previews/latest | Return active run for email or create one when none exists |
| [**getDevicePreviewFeedback**](DevicePreviewsControllerApi#getDevicePreviewFeedback) | **GET** /emails/device-previews/feedback/{feedbackId} | Get a single device preview feedback item |
| [**getDevicePreviewFeedbackItems**](DevicePreviewsControllerApi#getDevicePreviewFeedbackItems) | **GET** /emails/device-previews/feedback | List device preview feedback |
| [**getDevicePreviewRun**](DevicePreviewsControllerApi#getDevicePreviewRun) | **GET** /emails/device-previews/{runId} | Get device preview run status |
| [**getDevicePreviewRunProviderProgress**](DevicePreviewsControllerApi#getDevicePreviewRunProviderProgress) | **GET** /emails/device-previews/{runId}/providers/{provider} | Get provider-level progress for a device preview run |
| [**getDevicePreviewRunResults**](DevicePreviewsControllerApi#getDevicePreviewRunResults) | **GET** /emails/device-previews/{runId}/results | Get device preview run results |
| [**getDevicePreviewRunScreenshot**](DevicePreviewsControllerApi#getDevicePreviewRunScreenshot) | **GET** /emails/device-previews/{runId}/screenshots/{screenshotId}/image | Get a seeded device preview screenshot image |
| [**getDevicePreviewRuns**](DevicePreviewsControllerApi#getDevicePreviewRuns) | **GET** /emails/{emailId}/device-previews | List previous device preview runs for an email |
| [**getDevicePreviewRunsForAccount**](DevicePreviewsControllerApi#getDevicePreviewRunsForAccount) | **GET** /emails/device-previews | List previous device preview runs for account |
| [**getDevicePreviewRunsOffsetPaginated**](DevicePreviewsControllerApi#getDevicePreviewRunsOffsetPaginated) | **GET** /emails/{emailId}/device-previews/offset-paginated | List previous device preview runs for an email in paginated form |
| [**updateDevicePreviewFeedback**](DevicePreviewsControllerApi#updateDevicePreviewFeedback) | **PUT** /emails/device-previews/feedback/{feedbackId} | Update device preview feedback |


<a id="cancelDevicePreviewRun"></a>
# **cancelDevicePreviewRun**
> CancelDevicePreviewRunResult cancelDevicePreviewRun(runId).cancelDevicePreviewRunOptions(cancelDevicePreviewRunOptions).execute();

Cancel a running device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    CancelDevicePreviewRunOptions cancelDevicePreviewRunOptions = new CancelDevicePreviewRunOptions(); // CancelDevicePreviewRunOptions | 
    try {
      CancelDevicePreviewRunResult result = apiInstance.cancelDevicePreviewRun(runId)
            .cancelDevicePreviewRunOptions(cancelDevicePreviewRunOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#cancelDevicePreviewRun");
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
| **runId** | **UUID**|  | |
| **cancelDevicePreviewRunOptions** | [**CancelDevicePreviewRunOptions**](CancelDevicePreviewRunOptions)|  | [optional] |

### Return type

[**CancelDevicePreviewRunResult**](CancelDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewFeedback"></a>
# **createDevicePreviewFeedback**
> DevicePreviewFeedbackDto createDevicePreviewFeedback(createDevicePreviewFeedbackOptions).execute();

Create device preview feedback

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    CreateDevicePreviewFeedbackOptions createDevicePreviewFeedbackOptions = new CreateDevicePreviewFeedbackOptions(); // CreateDevicePreviewFeedbackOptions | 
    try {
      DevicePreviewFeedbackDto result = apiInstance.createDevicePreviewFeedback(createDevicePreviewFeedbackOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewFeedback");
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
| **createDevicePreviewFeedbackOptions** | [**CreateDevicePreviewFeedbackOptions**](CreateDevicePreviewFeedbackOptions)|  | |

### Return type

[**DevicePreviewFeedbackDto**](DevicePreviewFeedbackDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewRun"></a>
# **createDevicePreviewRun**
> CreateDevicePreviewRunResult createDevicePreviewRun(emailId).createDevicePreviewOptions(createDevicePreviewOptions).execute();

Create a new device preview run for an email

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    CreateDevicePreviewOptions createDevicePreviewOptions = new CreateDevicePreviewOptions(); // CreateDevicePreviewOptions | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.createDevicePreviewRun(emailId)
            .createDevicePreviewOptions(createDevicePreviewOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewRun");
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
| **emailId** | **UUID**|  | |
| **createDevicePreviewOptions** | [**CreateDevicePreviewOptions**](CreateDevicePreviewOptions)|  | [optional] |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDevicePreviewRun"></a>
# **deleteDevicePreviewRun**
> DeleteDevicePreviewRunResult deleteDevicePreviewRun(runId).execute();

Delete local device preview run data

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      DeleteDevicePreviewRunResult result = apiInstance.deleteDevicePreviewRun(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#deleteDevicePreviewRun");
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
| **runId** | **UUID**|  | |

### Return type

[**DeleteDevicePreviewRunResult**](DeleteDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ensureDevicePreviewRun"></a>
# **ensureDevicePreviewRun**
> CreateDevicePreviewRunResult ensureDevicePreviewRun(emailId).createDevicePreviewOptions(createDevicePreviewOptions).execute();

Return active run for email or create one when none exists

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    CreateDevicePreviewOptions createDevicePreviewOptions = new CreateDevicePreviewOptions(); // CreateDevicePreviewOptions | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.ensureDevicePreviewRun(emailId)
            .createDevicePreviewOptions(createDevicePreviewOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#ensureDevicePreviewRun");
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
| **emailId** | **UUID**|  | |
| **createDevicePreviewOptions** | [**CreateDevicePreviewOptions**](CreateDevicePreviewOptions)|  | [optional] |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewFeedback"></a>
# **getDevicePreviewFeedback**
> DevicePreviewFeedbackDto getDevicePreviewFeedback(feedbackId).execute();

Get a single device preview feedback item

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID feedbackId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewFeedbackDto result = apiInstance.getDevicePreviewFeedback(feedbackId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewFeedback");
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
| **feedbackId** | **UUID**|  | |

### Return type

[**DevicePreviewFeedbackDto**](DevicePreviewFeedbackDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewFeedbackItems"></a>
# **getDevicePreviewFeedbackItems**
> DevicePreviewFeedbackListDto getDevicePreviewFeedbackItems().page(page).size(size).source(source).runId(runId).status(status).provider(provider).category(category).search(search).execute();

List device preview feedback

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer size = 56; // Integer | 
    String source = "API_SERVICE"; // String | 
    UUID runId = UUID.randomUUID(); // UUID | 
    String status = "OPEN"; // String | 
    String provider = "GMAIL"; // String | 
    String category = "GENERAL"; // String | 
    String search = "search_example"; // String | 
    try {
      DevicePreviewFeedbackListDto result = apiInstance.getDevicePreviewFeedbackItems()
            .page(page)
            .size(size)
            .source(source)
            .runId(runId)
            .status(status)
            .provider(provider)
            .category(category)
            .search(search)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewFeedbackItems");
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
| **page** | **Integer**|  | [optional] |
| **size** | **Integer**|  | [optional] |
| **source** | **String**|  | [optional] [enum: API_SERVICE, LAB_USER, END_USER, SYSTEM] |
| **runId** | **UUID**|  | [optional] |
| **status** | **String**|  | [optional] [enum: OPEN, ACKNOWLEDGED, RESOLVED, DISMISSED] |
| **provider** | **String**|  | [optional] [enum: GMAIL, OUTLOOK, YAHOO] |
| **category** | **String**|  | [optional] [enum: GENERAL, RUN_QUALITY, SCREENSHOT_QUALITY, PROVIDER_ISSUE, BUG_REPORT, FEATURE_REQUEST, NOTE] |
| **search** | **String**|  | [optional] |

### Return type

[**DevicePreviewFeedbackListDto**](DevicePreviewFeedbackListDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRun"></a>
# **getDevicePreviewRun**
> DevicePreviewRunDto getDevicePreviewRun(runId).execute();

Get device preview run status

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewRunDto result = apiInstance.getDevicePreviewRun(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRun");
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
| **runId** | **UUID**|  | |

### Return type

[**DevicePreviewRunDto**](DevicePreviewRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunProviderProgress"></a>
# **getDevicePreviewRunProviderProgress**
> DevicePreviewProviderProgressDto getDevicePreviewRunProviderProgress(runId, provider).execute();

Get provider-level progress for a device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    String provider = "GMAIL"; // String | 
    try {
      DevicePreviewProviderProgressDto result = apiInstance.getDevicePreviewRunProviderProgress(runId, provider)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunProviderProgress");
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
| **runId** | **UUID**|  | |
| **provider** | **String**|  | [enum: GMAIL, OUTLOOK, YAHOO] |

### Return type

[**DevicePreviewProviderProgressDto**](DevicePreviewProviderProgressDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunResults"></a>
# **getDevicePreviewRunResults**
> DevicePreviewRunResultsDto getDevicePreviewRunResults(runId).execute();

Get device preview run results

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewRunResultsDto result = apiInstance.getDevicePreviewRunResults(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunResults");
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
| **runId** | **UUID**|  | |

### Return type

[**DevicePreviewRunResultsDto**](DevicePreviewRunResultsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunScreenshot"></a>
# **getDevicePreviewRunScreenshot**
> byte[] getDevicePreviewRunScreenshot(runId, screenshotId).execute();

Get a seeded device preview screenshot image

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    UUID screenshotId = UUID.randomUUID(); // UUID | 
    try {
      byte[] result = apiInstance.getDevicePreviewRunScreenshot(runId, screenshotId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunScreenshot");
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
| **runId** | **UUID**|  | |
| **screenshotId** | **UUID**|  | |

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

<a id="getDevicePreviewRuns"></a>
# **getDevicePreviewRuns**
> List&lt;DevicePreviewRunDto&gt; getDevicePreviewRuns(emailId).limit(limit).execute();

List previous device preview runs for an email

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    try {
      List<DevicePreviewRunDto> result = apiInstance.getDevicePreviewRuns(emailId)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRuns");
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
| **emailId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 50] |

### Return type

[**List&lt;DevicePreviewRunDto&gt;**](DevicePreviewRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunsForAccount"></a>
# **getDevicePreviewRunsForAccount**
> List&lt;DevicePreviewRunDto&gt; getDevicePreviewRunsForAccount().limit(limit).execute();

List previous device preview runs for account

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    Integer limit = 50; // Integer | 
    try {
      List<DevicePreviewRunDto> result = apiInstance.getDevicePreviewRunsForAccount()
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunsForAccount");
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
| **limit** | **Integer**|  | [optional] [default to 50] |

### Return type

[**List&lt;DevicePreviewRunDto&gt;**](DevicePreviewRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunsOffsetPaginated"></a>
# **getDevicePreviewRunsOffsetPaginated**
> PageDevicePreviewRunProjection getDevicePreviewRunsOffsetPaginated(emailId).page(page).size(size).sort(sort).execute();

List previous device preview runs for an email in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size for paginated result list.
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageDevicePreviewRunProjection result = apiInstance.getDevicePreviewRunsOffsetPaginated(emailId)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunsOffsetPaginated");
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
| **emailId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size for paginated result list. | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**PageDevicePreviewRunProjection**](PageDevicePreviewRunProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDevicePreviewFeedback"></a>
# **updateDevicePreviewFeedback**
> DevicePreviewFeedbackDto updateDevicePreviewFeedback(feedbackId, updateDevicePreviewFeedbackOptions).execute();

Update device preview feedback

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID feedbackId = UUID.randomUUID(); // UUID | 
    UpdateDevicePreviewFeedbackOptions updateDevicePreviewFeedbackOptions = new UpdateDevicePreviewFeedbackOptions(); // UpdateDevicePreviewFeedbackOptions | 
    try {
      DevicePreviewFeedbackDto result = apiInstance.updateDevicePreviewFeedback(feedbackId, updateDevicePreviewFeedbackOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#updateDevicePreviewFeedback");
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
| **feedbackId** | **UUID**|  | |
| **updateDevicePreviewFeedbackOptions** | [**UpdateDevicePreviewFeedbackOptions**](UpdateDevicePreviewFeedbackOptions)|  | |

### Return type

[**DevicePreviewFeedbackDto**](DevicePreviewFeedbackDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

