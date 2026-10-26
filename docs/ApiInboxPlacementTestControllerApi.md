# ApiInboxPlacementTestControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**confirmInboxPlacementTestSent**](ApiInboxPlacementTestControllerApi#confirmInboxPlacementTestSent) | **POST** /inbox-placement-tests/{id}/confirm-sent | Confirm an inbox placement test email has been sent |
| [**createInboxPlacementTest**](ApiInboxPlacementTestControllerApi#createInboxPlacementTest) | **POST** /inbox-placement-tests | Create a new direct-send inbox placement test |
| [**exportInboxPlacementSeedList**](ApiInboxPlacementTestControllerApi#exportInboxPlacementSeedList) | **GET** /inbox-placement-tests/{id}/seed-list.csv | Download inbox placement seed addresses as an email-platform CSV |
| [**exportInboxPlacementTestResults**](ApiInboxPlacementTestControllerApi#exportInboxPlacementTestResults) | **GET** /inbox-placement-tests/{id}/results/export | Export inbox placement test results as CSV |
| [**getInboxPlacementAnalyticsBreakdown**](ApiInboxPlacementTestControllerApi#getInboxPlacementAnalyticsBreakdown) | **GET** /inbox-placement-tests/analytics/breakdown | Get inbox placement analytics breakdowns |
| [**getInboxPlacementAnalyticsSeries**](ApiInboxPlacementTestControllerApi#getInboxPlacementAnalyticsSeries) | **GET** /inbox-placement-tests/analytics/series | Get inbox placement analytics time series |
| [**getInboxPlacementPublicShare**](ApiInboxPlacementTestControllerApi#getInboxPlacementPublicShare) | **GET** /inbox-placement-tests/share/{shareToken} | Get a public inbox placement share |
| [**getInboxPlacementPublicShareAnalysis**](ApiInboxPlacementTestControllerApi#getInboxPlacementPublicShareAnalysis) | **GET** /inbox-placement-tests/share/{shareToken}/analysis | Get public inbox placement share analysis |
| [**getInboxPlacementTest**](ApiInboxPlacementTestControllerApi#getInboxPlacementTest) | **GET** /inbox-placement-tests/{id} | Get inbox placement test run |
| [**getInboxPlacementTestAnalysis**](ApiInboxPlacementTestControllerApi#getInboxPlacementTestAnalysis) | **GET** /inbox-placement-tests/{id}/analysis | Get inbox placement run analysis |
| [**getInboxPlacementTestResults**](ApiInboxPlacementTestControllerApi#getInboxPlacementTestResults) | **GET** /inbox-placement-tests/{id}/results | Get inbox placement test results |
| [**getInboxPlacementTests**](ApiInboxPlacementTestControllerApi#getInboxPlacementTests) | **GET** /inbox-placement-tests | List inbox placement test runs |
| [**prepareInboxPlacementTest**](ApiInboxPlacementTestControllerApi#prepareInboxPlacementTest) | **POST** /inbox-placement-tests/prepare | Prepare a direct-send inbox placement test without consuming allowance |


<a id="confirmInboxPlacementTestSent"></a>
# **confirmInboxPlacementTestSent**
> InboxPlacementTestRunDto confirmInboxPlacementTestSent(id).execute();

Confirm an inbox placement test email has been sent

Reconcile any messages that arrived after seed reservation, commit allowance, and move a prepared dashboard test into its active lifecycle. This operation is idempotent.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      InboxPlacementTestRunDto result = apiInstance.confirmInboxPlacementTestSent(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#confirmInboxPlacementTestSent");
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
| **id** | **UUID**|  | |

### Return type

[**InboxPlacementTestRunDto**](InboxPlacementTestRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createInboxPlacementTest"></a>
# **createInboxPlacementTest**
> InboxPlacementTestRunDto createInboxPlacementTest(createInboxPlacementTestOptions).execute();

Create a new direct-send inbox placement test

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    CreateInboxPlacementTestOptions createInboxPlacementTestOptions = new CreateInboxPlacementTestOptions(); // CreateInboxPlacementTestOptions | 
    try {
      InboxPlacementTestRunDto result = apiInstance.createInboxPlacementTest(createInboxPlacementTestOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#createInboxPlacementTest");
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
| **createInboxPlacementTestOptions** | [**CreateInboxPlacementTestOptions**](CreateInboxPlacementTestOptions)|  | |

### Return type

[**InboxPlacementTestRunDto**](InboxPlacementTestRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="exportInboxPlacementSeedList"></a>
# **exportInboxPlacementSeedList**
> exportInboxPlacementSeedList(id).provider(provider).execute();

Download inbox placement seed addresses as an email-platform CSV

Export the current run&#39;s seed addresses with headers recognized by the selected email platform. Downloading a prepared seed list does not confirm the send or consume allowance.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String provider = "GENERIC"; // String | 
    try {
      apiInstance.exportInboxPlacementSeedList(id)
            .provider(provider)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#exportInboxPlacementSeedList");
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
| **id** | **UUID**|  | |
| **provider** | **String**|  | [optional] [default to GENERIC] [enum: GENERIC, MAILCHIMP, KLAVIYO, SALESFORCE, HUBSPOT, BRAZE, BREVO, MAILERLITE, MAILJET, OMNISEND, GETRESPONSE, CONSTANT_CONTACT, KIT] |

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

<a id="exportInboxPlacementTestResults"></a>
# **exportInboxPlacementTestResults**
> exportInboxPlacementTestResults(id).execute();

Export inbox placement test results as CSV

Export one row per placement target, including run-level delivery totals, 0-10 placement scores, and target placement outcome fields.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.exportInboxPlacementTestResults(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#exportInboxPlacementTestResults");
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
| **id** | **UUID**|  | |

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

<a id="getInboxPlacementAnalyticsBreakdown"></a>
# **getInboxPlacementAnalyticsBreakdown**
> InboxPlacementAnalyticsBreakdownDto getInboxPlacementAnalyticsBreakdown().since(since).before(before).senderDomain(senderDomain).fromEmail(fromEmail).limit(limit).execute();

Get inbox placement analytics breakdowns

Return aggregated folder, provider, sender-domain, and from-email breakdowns for inbox placement runs in a time range.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String senderDomain = "senderDomain_example"; // String | 
    String fromEmail = "fromEmail_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      InboxPlacementAnalyticsBreakdownDto result = apiInstance.getInboxPlacementAnalyticsBreakdown()
            .since(since)
            .before(before)
            .senderDomain(senderDomain)
            .fromEmail(fromEmail)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementAnalyticsBreakdown");
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
| **senderDomain** | **String**|  | [optional] |
| **fromEmail** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**InboxPlacementAnalyticsBreakdownDto**](InboxPlacementAnalyticsBreakdownDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlacementAnalyticsSeries"></a>
# **getInboxPlacementAnalyticsSeries**
> InboxPlacementAnalyticsSeriesDto getInboxPlacementAnalyticsSeries().since(since).before(before).bucket(bucket).groupBy(groupBy).senderDomain(senderDomain).fromEmail(fromEmail).runLimit(runLimit).groupLimit(groupLimit).execute();

Get inbox placement analytics time series

Return chart-ready inbox placement metrics over time, with optional sender/domain filters and grouped comparisons for sender domains or from-email addresses.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String bucket = "HOUR"; // String | 
    String groupBy = "NONE"; // String | 
    String senderDomain = "senderDomain_example"; // String | 
    String fromEmail = "fromEmail_example"; // String | 
    Integer runLimit = 56; // Integer | 
    Integer groupLimit = 56; // Integer | 
    try {
      InboxPlacementAnalyticsSeriesDto result = apiInstance.getInboxPlacementAnalyticsSeries()
            .since(since)
            .before(before)
            .bucket(bucket)
            .groupBy(groupBy)
            .senderDomain(senderDomain)
            .fromEmail(fromEmail)
            .runLimit(runLimit)
            .groupLimit(groupLimit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementAnalyticsSeries");
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
| **bucket** | **String**|  | [optional] [default to DAY] [enum: HOUR, DAY] |
| **groupBy** | **String**|  | [optional] [default to NONE] [enum: NONE, SENDER_DOMAIN, FROM_EMAIL] |
| **senderDomain** | **String**|  | [optional] |
| **fromEmail** | **String**|  | [optional] |
| **runLimit** | **Integer**|  | [optional] |
| **groupLimit** | **Integer**|  | [optional] |

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

<a id="getInboxPlacementPublicShare"></a>
# **getInboxPlacementPublicShare**
> InboxPlacementPublicShareDto getInboxPlacementPublicShare(shareToken).execute();

Get a public inbox placement share

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    String shareToken = "shareToken_example"; // String | 
    try {
      InboxPlacementPublicShareDto result = apiInstance.getInboxPlacementPublicShare(shareToken)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementPublicShare");
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
| **shareToken** | **String**|  | |

### Return type

[**InboxPlacementPublicShareDto**](InboxPlacementPublicShareDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlacementPublicShareAnalysis"></a>
# **getInboxPlacementPublicShareAnalysis**
> InboxPlacementAnalysisBundleDto getInboxPlacementPublicShareAnalysis(shareToken).execute();

Get public inbox placement share analysis

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    String shareToken = "shareToken_example"; // String | 
    try {
      InboxPlacementAnalysisBundleDto result = apiInstance.getInboxPlacementPublicShareAnalysis(shareToken)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementPublicShareAnalysis");
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
| **shareToken** | **String**|  | |

### Return type

[**InboxPlacementAnalysisBundleDto**](InboxPlacementAnalysisBundleDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlacementTest"></a>
# **getInboxPlacementTest**
> InboxPlacementTestRunDto getInboxPlacementTest(id).execute();

Get inbox placement test run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      InboxPlacementTestRunDto result = apiInstance.getInboxPlacementTest(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementTest");
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
| **id** | **UUID**|  | |

### Return type

[**InboxPlacementTestRunDto**](InboxPlacementTestRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlacementTestAnalysis"></a>
# **getInboxPlacementTestAnalysis**
> InboxPlacementAnalysisBundleDto getInboxPlacementTestAnalysis(id).execute();

Get inbox placement run analysis

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      InboxPlacementAnalysisBundleDto result = apiInstance.getInboxPlacementTestAnalysis(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementTestAnalysis");
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
| **id** | **UUID**|  | |

### Return type

[**InboxPlacementAnalysisBundleDto**](InboxPlacementAnalysisBundleDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlacementTestResults"></a>
# **getInboxPlacementTestResults**
> InboxPlacementTestResultsDto getInboxPlacementTestResults(id).execute();

Get inbox placement test results

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      InboxPlacementTestResultsDto result = apiInstance.getInboxPlacementTestResults(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementTestResults");
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
| **id** | **UUID**|  | |

### Return type

[**InboxPlacementTestResultsDto**](InboxPlacementTestResultsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlacementTests"></a>
# **getInboxPlacementTests**
> List&lt;InboxPlacementTestRunDto&gt; getInboxPlacementTests().limit(limit).execute();

List inbox placement test runs

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    Integer limit = 50; // Integer | 
    try {
      List<InboxPlacementTestRunDto> result = apiInstance.getInboxPlacementTests()
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#getInboxPlacementTests");
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

[**List&lt;InboxPlacementTestRunDto&gt;**](InboxPlacementTestRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="prepareInboxPlacementTest"></a>
# **prepareInboxPlacementTest**
> InboxPlacementTestRunDto prepareInboxPlacementTest(createInboxPlacementTestOptions).execute();

Prepare a direct-send inbox placement test without consuming allowance

Reserve seed addresses for the dashboard create flow. The run remains staged and allowance is not committed until send confirmation. Reuses a recent active preparation when possible.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInboxPlacementTestControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInboxPlacementTestControllerApi apiInstance = new ApiInboxPlacementTestControllerApi(defaultClient);
    CreateInboxPlacementTestOptions createInboxPlacementTestOptions = new CreateInboxPlacementTestOptions(); // CreateInboxPlacementTestOptions | 
    try {
      InboxPlacementTestRunDto result = apiInstance.prepareInboxPlacementTest(createInboxPlacementTestOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInboxPlacementTestControllerApi#prepareInboxPlacementTest");
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
| **createInboxPlacementTestOptions** | [**CreateInboxPlacementTestOptions**](CreateInboxPlacementTestOptions)|  | |

### Return type

[**InboxPlacementTestRunDto**](InboxPlacementTestRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

