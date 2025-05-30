# InboxForwarderControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewInboxForwarder**](InboxForwarderControllerApi#createNewInboxForwarder) | **POST** /forwarders | Create an inbox forwarder |
| [**deleteInboxForwarder**](InboxForwarderControllerApi#deleteInboxForwarder) | **DELETE** /forwarders/{id} | Delete an inbox forwarder |
| [**deleteInboxForwarders**](InboxForwarderControllerApi#deleteInboxForwarders) | **DELETE** /forwarders | Delete inbox forwarders |
| [**getAllInboxForwarderEvents**](InboxForwarderControllerApi#getAllInboxForwarderEvents) | **GET** /forwarders/events | Get all inbox forwarder events |
| [**getForwarderEvent**](InboxForwarderControllerApi#getForwarderEvent) | **GET** /forwarders/events/{eventId} | Get a forwarder event |
| [**getInboxForwarder**](InboxForwarderControllerApi#getInboxForwarder) | **GET** /forwarders/{id} | Get an inbox forwarder |
| [**getInboxForwarderEvent**](InboxForwarderControllerApi#getInboxForwarderEvent) | **GET** /forwarders/{id}/events/{eventId} | Get an inbox forwarder event |
| [**getInboxForwarderEvents**](InboxForwarderControllerApi#getInboxForwarderEvents) | **GET** /forwarders/{id}/events | Get an inbox forwarder event list |
| [**getInboxForwarders**](InboxForwarderControllerApi#getInboxForwarders) | **GET** /forwarders | List inbox forwarders |
| [**testInboxForwarder**](InboxForwarderControllerApi#testInboxForwarder) | **POST** /forwarders/{id}/test | Test an inbox forwarder |
| [**testInboxForwardersForInbox**](InboxForwarderControllerApi#testInboxForwardersForInbox) | **PUT** /forwarders | Test inbox forwarders for inbox |
| [**testNewInboxForwarder**](InboxForwarderControllerApi#testNewInboxForwarder) | **PATCH** /forwarders | Test new inbox forwarder |
| [**updateInboxForwarder**](InboxForwarderControllerApi#updateInboxForwarder) | **PUT** /forwarders/{id} | Update an inbox forwarder |


<a id="createNewInboxForwarder"></a>
# **createNewInboxForwarder**
> InboxForwarderDto createNewInboxForwarder(createInboxForwarderOptions).inboxId(inboxId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    CreateInboxForwarderOptions createInboxForwarderOptions = new CreateInboxForwarderOptions(); // CreateInboxForwarderOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox id to attach forwarder to
    try {
      InboxForwarderDto result = apiInstance.createNewInboxForwarder(createInboxForwarderOptions)
            .inboxId(inboxId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createInboxForwarderOptions** | [**CreateInboxForwarderOptions**](CreateInboxForwarderOptions)|  | |
| **inboxId** | **UUID**| Inbox id to attach forwarder to | [optional] |

### Return type

[**InboxForwarderDto**](InboxForwarderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteInboxForwarder"></a>
# **deleteInboxForwarder**
> deleteInboxForwarder(id).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox forwarder
    try {
      apiInstance.deleteInboxForwarder(id)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| ID of inbox forwarder | |

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

<a id="deleteInboxForwarders"></a>
# **deleteInboxForwarders**
> deleteInboxForwarders().inboxId(inboxId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox id to attach forwarder to
    try {
      apiInstance.deleteInboxForwarders()
            .inboxId(inboxId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| Optional inbox id to attach forwarder to | [optional] |

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

<a id="getAllInboxForwarderEvents"></a>
# **getAllInboxForwarderEvents**
> PageInboxForwarderEvents getAllInboxForwarderEvents().page(page).size(size).inboxId(inboxId).emailId(emailId).sentId(sentId).sort(sort).execute();

Get all inbox forwarder events

Get all inbox forwarder events

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in inbox forwarder event list pagination
    Integer size = 20; // Integer | Optional page size in inbox forwarder event list pagination
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox ID to filter for
    UUID emailId = UUID.randomUUID(); // UUID | Optional email ID to filter for
    UUID sentId = UUID.randomUUID(); // UUID | Optional sent ID to filter for
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxForwarderEvents result = apiInstance.getAllInboxForwarderEvents()
            .page(page)
            .size(size)
            .inboxId(inboxId)
            .emailId(emailId)
            .sentId(sentId)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#getAllInboxForwarderEvents");
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
| **page** | **Integer**| Optional page index in inbox forwarder event list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox forwarder event list pagination | [optional] [default to 20] |
| **inboxId** | **UUID**| Optional inbox ID to filter for | [optional] |
| **emailId** | **UUID**| Optional email ID to filter for | [optional] |
| **sentId** | **UUID**| Optional sent ID to filter for | [optional] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageInboxForwarderEvents**](PageInboxForwarderEvents)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getForwarderEvent"></a>
# **getForwarderEvent**
> InboxForwarderEventDto getForwarderEvent(eventId).execute();

Get a forwarder event

Get forwarder event

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID eventId = UUID.randomUUID(); // UUID | ID of inbox forwarder event
    try {
      InboxForwarderEventDto result = apiInstance.getForwarderEvent(eventId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#getForwarderEvent");
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
| **eventId** | **UUID**| ID of inbox forwarder event | |

### Return type

[**InboxForwarderEventDto**](InboxForwarderEventDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxForwarder"></a>
# **getInboxForwarder**
> InboxForwarderDto getInboxForwarder(id).execute();

Get an inbox forwarder

Get inbox forwarder

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox forwarder
    try {
      InboxForwarderDto result = apiInstance.getInboxForwarder(id)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| ID of inbox forwarder | |

### Return type

[**InboxForwarderDto**](InboxForwarderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxForwarderEvent"></a>
# **getInboxForwarderEvent**
> InboxForwarderEventDto getInboxForwarderEvent(id, eventId).execute();

Get an inbox forwarder event

Get inbox forwarder event

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox forwarder
    UUID eventId = UUID.randomUUID(); // UUID | ID of inbox forwarder event
    try {
      InboxForwarderEventDto result = apiInstance.getInboxForwarderEvent(id, eventId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#getInboxForwarderEvent");
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
| **id** | **UUID**| ID of inbox forwarder | |
| **eventId** | **UUID**| ID of inbox forwarder event | |

### Return type

[**InboxForwarderEventDto**](InboxForwarderEventDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxForwarderEvents"></a>
# **getInboxForwarderEvents**
> PageInboxForwarderEvents getInboxForwarderEvents(id).page(page).size(size).sort(sort).execute();

Get an inbox forwarder event list

Get inbox forwarder events

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox forwarder
    Integer page = 0; // Integer | Optional page index in inbox forwarder event list pagination
    Integer size = 20; // Integer | Optional page size in inbox forwarder event list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxForwarderEvents result = apiInstance.getInboxForwarderEvents(id)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#getInboxForwarderEvents");
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
| **id** | **UUID**| ID of inbox forwarder | |
| **page** | **Integer**| Optional page index in inbox forwarder event list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox forwarder event list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageInboxForwarderEvents**](PageInboxForwarderEvents)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxForwarders"></a>
# **getInboxForwarders**
> PageInboxForwarderDto getInboxForwarders().inboxId(inboxId).page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox id to get forwarders from
    Integer page = 0; // Integer | Optional page index in inbox forwarder list pagination
    Integer size = 20; // Integer | Optional page size in inbox forwarder list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageInboxForwarderDto result = apiInstance.getInboxForwarders()
            .inboxId(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| Optional inbox id to get forwarders from | [optional] |
| **page** | **Integer**| Optional page index in inbox forwarder list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox forwarder list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageInboxForwarderDto**](PageInboxForwarderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testInboxForwarder"></a>
# **testInboxForwarder**
> InboxForwarderTestResult testInboxForwarder(id, inboxForwarderTestOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox forwarder
    InboxForwarderTestOptions inboxForwarderTestOptions = new InboxForwarderTestOptions(); // InboxForwarderTestOptions | 
    try {
      InboxForwarderTestResult result = apiInstance.testInboxForwarder(id, inboxForwarderTestOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| ID of inbox forwarder | |
| **inboxForwarderTestOptions** | [**InboxForwarderTestOptions**](InboxForwarderTestOptions)|  | |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testInboxForwardersForInbox"></a>
# **testInboxForwardersForInbox**
> InboxForwarderTestResult testInboxForwardersForInbox(inboxId, inboxForwarderTestOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox
    InboxForwarderTestOptions inboxForwarderTestOptions = new InboxForwarderTestOptions(); // InboxForwarderTestOptions | 
    try {
      InboxForwarderTestResult result = apiInstance.testInboxForwardersForInbox(inboxId, inboxForwarderTestOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of inbox | |
| **inboxForwarderTestOptions** | [**InboxForwarderTestOptions**](InboxForwarderTestOptions)|  | |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testNewInboxForwarder"></a>
# **testNewInboxForwarder**
> InboxForwarderTestResult testNewInboxForwarder(testNewInboxForwarderOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    TestNewInboxForwarderOptions testNewInboxForwarderOptions = new TestNewInboxForwarderOptions(); // TestNewInboxForwarderOptions | 
    try {
      InboxForwarderTestResult result = apiInstance.testNewInboxForwarder(testNewInboxForwarderOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **testNewInboxForwarderOptions** | [**TestNewInboxForwarderOptions**](TestNewInboxForwarderOptions)|  | |

### Return type

[**InboxForwarderTestResult**](InboxForwarderTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateInboxForwarder"></a>
# **updateInboxForwarder**
> InboxForwarderDto updateInboxForwarder(id, createInboxForwarderOptions).execute();

Update an inbox forwarder

Update inbox forwarder

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxForwarderControllerApi apiInstance = new InboxForwarderControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox forwarder
    CreateInboxForwarderOptions createInboxForwarderOptions = new CreateInboxForwarderOptions(); // CreateInboxForwarderOptions | 
    try {
      InboxForwarderDto result = apiInstance.updateInboxForwarder(id, createInboxForwarderOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxForwarderControllerApi#updateInboxForwarder");
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
| **id** | **UUID**| ID of inbox forwarder | |
| **createInboxForwarderOptions** | [**CreateInboxForwarderOptions**](CreateInboxForwarderOptions)|  | |

### Return type

[**InboxForwarderDto**](InboxForwarderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

