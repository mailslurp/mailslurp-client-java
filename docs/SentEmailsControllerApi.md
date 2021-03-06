# SentEmailsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSentTrackingPixels**](SentEmailsControllerApi#getAllSentTrackingPixels) | **GET** /sent/tracking-pixels | Get all sent email tracking pixels in paginated form
[**getSentEmail**](SentEmailsControllerApi#getSentEmail) | **GET** /sent/{id} | Get sent email receipt
[**getSentEmailTrackingPixels**](SentEmailsControllerApi#getSentEmailTrackingPixels) | **GET** /sent/{id}/tracking-pixels | Get all tracking pixels for a sent email in paginated form
[**getSentEmails**](SentEmailsControllerApi#getSentEmails) | **GET** /sent | Get all sent emails in paginated form
[**getSentOrganizationEmails**](SentEmailsControllerApi#getSentOrganizationEmails) | **GET** /sent/organization | Get all sent organization emails in paginated form


<a name="getAllSentTrackingPixels"></a>
# **getAllSentTrackingPixels**
> PageTrackingPixelProjection getAllSentTrackingPixels(page, searchFilter, size, sort)

Get all sent email tracking pixels in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SentEmailsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SentEmailsControllerApi apiInstance = new SentEmailsControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in sent email tracking pixel list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    Integer size = 20; // Integer | Optional page size in sent email tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageTrackingPixelProjection result = apiInstance.getAllSentTrackingPixels(page, searchFilter, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SentEmailsControllerApi#getAllSentTrackingPixels");
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
 **page** | **Integer**| Optional page index in sent email tracking pixel list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **size** | **Integer**| Optional page size in sent email tracking pixel list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

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

<a name="getSentEmail"></a>
# **getSentEmail**
> SentEmailDto getSentEmail(id)

Get sent email receipt

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SentEmailsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SentEmailsControllerApi apiInstance = new SentEmailsControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | id
    try {
      SentEmailDto result = apiInstance.getSentEmail(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SentEmailsControllerApi#getSentEmail");
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
 **id** | [**UUID**]()| id |

### Return type

[**SentEmailDto**](SentEmailDto)

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

<a name="getSentEmailTrackingPixels"></a>
# **getSentEmailTrackingPixels**
> PageTrackingPixelProjection getSentEmailTrackingPixels(id, page, searchFilter, size, sort)

Get all tracking pixels for a sent email in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SentEmailsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SentEmailsControllerApi apiInstance = new SentEmailsControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | id
    Integer page = 0; // Integer | Optional page index in sent email tracking pixel list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    Integer size = 20; // Integer | Optional page size in sent email tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageTrackingPixelProjection result = apiInstance.getSentEmailTrackingPixels(id, page, searchFilter, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SentEmailsControllerApi#getSentEmailTrackingPixels");
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
 **id** | [**UUID**]()| id |
 **page** | **Integer**| Optional page index in sent email tracking pixel list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **size** | **Integer**| Optional page size in sent email tracking pixel list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

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

<a name="getSentEmails"></a>
# **getSentEmails**
> PageSentEmailProjection getSentEmails(inboxId, page, searchFilter, size, sort)

Get all sent emails in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SentEmailsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SentEmailsControllerApi apiInstance = new SentEmailsControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Optional inboxId to filter sender of sent emails by
    Integer page = 0; // Integer | Optional page index in inbox sent email list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    Integer size = 20; // Integer | Optional page size in inbox sent email list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageSentEmailProjection result = apiInstance.getSentEmails(inboxId, page, searchFilter, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SentEmailsControllerApi#getSentEmails");
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
 **inboxId** | [**UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **Integer**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **size** | **Integer**| Optional page size in inbox sent email list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

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

<a name="getSentOrganizationEmails"></a>
# **getSentOrganizationEmails**
> PageSentEmailProjection getSentOrganizationEmails(inboxId, page, searchFilter, size, sort)

Get all sent organization emails in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SentEmailsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SentEmailsControllerApi apiInstance = new SentEmailsControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Optional inboxId to filter sender of sent emails by
    Integer page = 0; // Integer | Optional page index in sent email list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    Integer size = 20; // Integer | Optional page size in sent email list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageSentEmailProjection result = apiInstance.getSentOrganizationEmails(inboxId, page, searchFilter, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SentEmailsControllerApi#getSentOrganizationEmails");
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
 **inboxId** | [**UUID**]()| Optional inboxId to filter sender of sent emails by | [optional]
 **page** | **Integer**| Optional page index in sent email list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **size** | **Integer**| Optional page size in sent email list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

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

