# InboxReplierControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewInboxReplier**](InboxReplierControllerApi#createNewInboxReplier) | **POST** /repliers | Create an inbox replier |
| [**deleteInboxReplier**](InboxReplierControllerApi#deleteInboxReplier) | **DELETE** /repliers/{id} | Delete an inbox replier |
| [**deleteInboxRepliers**](InboxReplierControllerApi#deleteInboxRepliers) | **DELETE** /repliers | Delete inbox repliers |
| [**getAllInboxReplierEvents**](InboxReplierControllerApi#getAllInboxReplierEvents) | **GET** /repliers/events | Get inbox replier event list |
| [**getInboxReplier**](InboxReplierControllerApi#getInboxReplier) | **GET** /repliers/{id} | Get an inbox replier |
| [**getInboxReplierEvents**](InboxReplierControllerApi#getInboxReplierEvents) | **GET** /repliers/{id}/events | Get an inbox replier event list |
| [**getInboxRepliers**](InboxReplierControllerApi#getInboxRepliers) | **GET** /repliers | List inbox repliers |
| [**updateInboxReplier**](InboxReplierControllerApi#updateInboxReplier) | **PUT** /repliers/{id} | Update an inbox replier |


<a id="createNewInboxReplier"></a>
# **createNewInboxReplier**
> InboxReplierDto createNewInboxReplier(createInboxReplierOptions).execute();

Create an inbox replier

Create a new inbox rule for reply toing, blocking, and allowing emails when sending and receiving

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    CreateInboxReplierOptions createInboxReplierOptions = new CreateInboxReplierOptions(); // CreateInboxReplierOptions | 
    try {
      InboxReplierDto result = apiInstance.createNewInboxReplier(createInboxReplierOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#createNewInboxReplier");
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
| **createInboxReplierOptions** | [**CreateInboxReplierOptions**](CreateInboxReplierOptions)|  | |

### Return type

[**InboxReplierDto**](InboxReplierDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteInboxReplier"></a>
# **deleteInboxReplier**
> deleteInboxReplier(id).execute();

Delete an inbox replier

Delete inbox replier

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox replier
    try {
      apiInstance.deleteInboxReplier(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#deleteInboxReplier");
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
| **id** | **UUID**| ID of inbox replier | |

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

<a id="deleteInboxRepliers"></a>
# **deleteInboxRepliers**
> deleteInboxRepliers().inboxId(inboxId).execute();

Delete inbox repliers

Delete inbox repliers. Accepts optional inboxId filter.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox id to attach replier to
    try {
      apiInstance.deleteInboxRepliers()
            .inboxId(inboxId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#deleteInboxRepliers");
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
| **inboxId** | **UUID**| Optional inbox id to attach replier to | [optional] |

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

<a id="getAllInboxReplierEvents"></a>
# **getAllInboxReplierEvents**
> PageInboxReplierEvents getAllInboxReplierEvents().inboxReplierId(inboxReplierId).inboxId(inboxId).emailId(emailId).sentId(sentId).page(page).size(size).sort(sort).execute();

Get inbox replier event list

Get all inbox ruleset events

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    UUID inboxReplierId = UUID.randomUUID(); // UUID | ID of inbox replier
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox
    UUID emailId = UUID.randomUUID(); // UUID | ID of email
    UUID sentId = UUID.randomUUID(); // UUID | ID of sent
    Integer page = 0; // Integer | Optional page index in inbox replier event list pagination
    Integer size = 20; // Integer | Optional page size in inbox replier event list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxReplierEvents result = apiInstance.getAllInboxReplierEvents()
            .inboxReplierId(inboxReplierId)
            .inboxId(inboxId)
            .emailId(emailId)
            .sentId(sentId)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#getAllInboxReplierEvents");
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
| **inboxReplierId** | **UUID**| ID of inbox replier | [optional] |
| **inboxId** | **UUID**| ID of inbox | [optional] |
| **emailId** | **UUID**| ID of email | [optional] |
| **sentId** | **UUID**| ID of sent | [optional] |
| **page** | **Integer**| Optional page index in inbox replier event list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox replier event list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageInboxReplierEvents**](PageInboxReplierEvents)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxReplier"></a>
# **getInboxReplier**
> InboxReplierDto getInboxReplier(id).execute();

Get an inbox replier

Get inbox ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox replier
    try {
      InboxReplierDto result = apiInstance.getInboxReplier(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#getInboxReplier");
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
| **id** | **UUID**| ID of inbox replier | |

### Return type

[**InboxReplierDto**](InboxReplierDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxReplierEvents"></a>
# **getInboxReplierEvents**
> PageInboxReplierEvents getInboxReplierEvents(id).page(page).size(size).sort(sort).execute();

Get an inbox replier event list

Get inbox ruleset events

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox replier
    Integer page = 0; // Integer | Optional page index in inbox replier event list pagination
    Integer size = 20; // Integer | Optional page size in inbox replier event list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxReplierEvents result = apiInstance.getInboxReplierEvents(id)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#getInboxReplierEvents");
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
| **id** | **UUID**| ID of inbox replier | |
| **page** | **Integer**| Optional page index in inbox replier event list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox replier event list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageInboxReplierEvents**](PageInboxReplierEvents)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxRepliers"></a>
# **getInboxRepliers**
> PageInboxReplierDto getInboxRepliers().inboxId(inboxId).page(page).size(size).sort(sort).since(since).before(before).execute();

List inbox repliers

List all repliers attached to an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox id to get repliers from
    Integer page = 0; // Integer | Optional page index in inbox replier list pagination
    Integer size = 20; // Integer | Optional page size in inbox replier list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageInboxReplierDto result = apiInstance.getInboxRepliers()
            .inboxId(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#getInboxRepliers");
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
| **inboxId** | **UUID**| Optional inbox id to get repliers from | [optional] |
| **page** | **Integer**| Optional page index in inbox replier list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox replier list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageInboxReplierDto**](PageInboxReplierDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateInboxReplier"></a>
# **updateInboxReplier**
> InboxReplierDto updateInboxReplier(id, updateInboxReplierOptions).execute();

Update an inbox replier

Update inbox ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxReplierControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxReplierControllerApi apiInstance = new InboxReplierControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of inbox replier
    UpdateInboxReplierOptions updateInboxReplierOptions = new UpdateInboxReplierOptions(); // UpdateInboxReplierOptions | 
    try {
      InboxReplierDto result = apiInstance.updateInboxReplier(id, updateInboxReplierOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxReplierControllerApi#updateInboxReplier");
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
| **id** | **UUID**| ID of inbox replier | |
| **updateInboxReplierOptions** | [**UpdateInboxReplierOptions**](UpdateInboxReplierOptions)|  | |

### Return type

[**InboxReplierDto**](InboxReplierDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

