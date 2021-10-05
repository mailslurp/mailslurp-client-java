# InboxForwarderControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewInboxForwarder**](InboxForwarderControllerApi#createNewInboxForwarder) | **POST** /forwarders | Create an inbox forwarder
[**deleteInboxForwarder**](InboxForwarderControllerApi#deleteInboxForwarder) | **DELETE** /forwarders/{id} | Delete an inbox forwarder
[**deleteInboxForwarders**](InboxForwarderControllerApi#deleteInboxForwarders) | **DELETE** /forwarders | Delete inbox forwarders
[**getInboxForwarder**](InboxForwarderControllerApi#getInboxForwarder) | **GET** /forwarders/{id} | Get an inbox forwarder
[**getInboxForwarders**](InboxForwarderControllerApi#getInboxForwarders) | **GET** /forwarders | List inbox forwarders
[**testInboxForwarder**](InboxForwarderControllerApi#testInboxForwarder) | **POST** /forwarders/{id}/test | Test an inbox forwarder
[**testInboxForwardersForInbox**](InboxForwarderControllerApi#testInboxForwardersForInbox) | **PUT** /forwarders | Test inbox forwarders for inbox
[**testNewInboxForwarder**](InboxForwarderControllerApi#testNewInboxForwarder) | **PATCH** /forwarders | Test new inbox forwarder


<a name="createNewInboxForwarder"></a>
# **createNewInboxForwarder**
> InboxForwarderDto createNewInboxForwarder(createInboxForwarderOptions, inboxId)

Create an inbox forwarder

Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    CreateInboxForwarderOptions createInboxForwarderOptions = new CreateInboxForwarderOptions(); // CreateInboxForwarderOptions | createInboxForwarderOptions
    UUID inboxId = new UUID(); // UUID | Inbox id to attach forwarder to
    try {
      InboxForwarderDto result = apiInstance.createNewInboxForwarder(createInboxForwarderOptions, inboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#createNewInboxForwarder");
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
 **createInboxForwarderOptions** | [**CreateInboxForwarderOptions**](CreateInboxForwarderOptions)| createInboxForwarderOptions |
 **inboxId** | [**UUID**]()| Inbox id to attach forwarder to | [optional]

### Return type

[**InboxForwarderDto**](InboxForwarderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="deleteInboxForwarder"></a>
# **deleteInboxForwarder**
> deleteInboxForwarder(id)

Delete an inbox forwarder

Delete inbox forwarder

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | ID of inbox forwarder
    try {
      apiInstance.deleteInboxForwarder(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#deleteInboxForwarder");
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
 **id** | [**UUID**]()| ID of inbox forwarder |

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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="deleteInboxForwarders"></a>
# **deleteInboxForwarders**
> deleteInboxForwarders(inboxId)

Delete inbox forwarders

Delete inbox forwarders. Accepts optional inboxId filter.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Optional inbox id to attach forwarder to
    try {
      apiInstance.deleteInboxForwarders(inboxId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#deleteInboxForwarders");
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
 **inboxId** | [**UUID**]()| Optional inbox id to attach forwarder to | [optional]

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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="getInboxForwarder"></a>
# **getInboxForwarder**
> InboxForwarderDto getInboxForwarder(id)

Get an inbox forwarder

Get inbox ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | ID of inbox forwarder
    try {
      InboxForwarderDto result = apiInstance.getInboxForwarder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#getInboxForwarder");
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
 **id** | [**UUID**]()| ID of inbox forwarder |

### Return type

[**InboxForwarderDto**](InboxForwarderDto)

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

<a name="getInboxForwarders"></a>
# **getInboxForwarders**
> PageInboxForwarderDto getInboxForwarders(before, inboxId, page, searchFilter, since, size, sort)

List inbox forwarders

List all forwarders attached to an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Filter by created at before the given timestamp
    UUID inboxId = new UUID(); // UUID | Optional inbox id to get forwarders from
    Integer page = 0; // Integer | Optional page index in inbox forwarder list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Filter by created at after the given timestamp
    Integer size = 20; // Integer | Optional page size in inbox forwarder list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxForwarderDto result = apiInstance.getInboxForwarders(before, inboxId, page, searchFilter, since, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#getInboxForwarders");
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
 **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **inboxId** | [**UUID**]()| Optional inbox id to get forwarders from | [optional]
 **page** | **Integer**| Optional page index in inbox forwarder list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **size** | **Integer**| Optional page size in inbox forwarder list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageInboxForwarderDto**](PageInboxForwarderDto)

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

<a name="testInboxForwarder"></a>
# **testInboxForwarder**
> InboxForwarderTestResult testInboxForwarder(id, inboxForwarderTestOptions)

Test an inbox forwarder

Test an inbox forwarder

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | ID of inbox forwarder
    InboxForwarderTestOptions inboxForwarderTestOptions = new InboxForwarderTestOptions(); // InboxForwarderTestOptions | inboxForwarderTestOptions
    try {
      InboxForwarderTestResult result = apiInstance.testInboxForwarder(id, inboxForwarderTestOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#testInboxForwarder");
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
 **id** | [**UUID**]()| ID of inbox forwarder |
 **inboxForwarderTestOptions** | [**InboxForwarderTestOptions**](InboxForwarderTestOptions)| inboxForwarderTestOptions |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="testInboxForwardersForInbox"></a>
# **testInboxForwardersForInbox**
> InboxForwarderTestResult testInboxForwardersForInbox(inboxId, inboxForwarderTestOptions)

Test inbox forwarders for inbox

Test inbox forwarders for inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | ID of inbox
    InboxForwarderTestOptions inboxForwarderTestOptions = new InboxForwarderTestOptions(); // InboxForwarderTestOptions | inboxForwarderTestOptions
    try {
      InboxForwarderTestResult result = apiInstance.testInboxForwardersForInbox(inboxId, inboxForwarderTestOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#testInboxForwardersForInbox");
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
 **inboxId** | [**UUID**]()| ID of inbox |
 **inboxForwarderTestOptions** | [**InboxForwarderTestOptions**](InboxForwarderTestOptions)| inboxForwarderTestOptions |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="testNewInboxForwarder"></a>
# **testNewInboxForwarder**
> InboxForwarderTestResult testNewInboxForwarder(testNewInboxForwarderOptions)

Test new inbox forwarder

Test new inbox forwarder

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxForwarderControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    TestNewInboxForwarderOptions testNewInboxForwarderOptions = new TestNewInboxForwarderOptions(); // TestNewInboxForwarderOptions | testNewInboxForwarderOptions
    try {
      InboxForwarderTestResult result = apiInstance.testNewInboxForwarder(testNewInboxForwarderOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#testNewInboxForwarder");
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
 **testNewInboxForwarderOptions** | [**TestNewInboxForwarderOptions**](TestNewInboxForwarderOptions)| testNewInboxForwarderOptions |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

