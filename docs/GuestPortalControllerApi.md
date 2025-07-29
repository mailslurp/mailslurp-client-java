# GuestPortalControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createGuestPortal**](GuestPortalControllerApi#createGuestPortal) | **POST** /guest-portal | Create a portal page for your customers or clients to log into email accounts and view emails. |
| [**createGuestPortalUser**](GuestPortalControllerApi#createGuestPortalUser) | **POST** /guest-portal/{portalId}/user | Create a portal guest user |
| [**getAllGuestPortalUsers**](GuestPortalControllerApi#getAllGuestPortalUsers) | **GET** /guest-portal/user | Get all guest users for portal |
| [**getGuestPortal**](GuestPortalControllerApi#getGuestPortal) | **GET** /guest-portal/{portalId} | Get a client email portal |
| [**getGuestPortalUser**](GuestPortalControllerApi#getGuestPortalUser) | **GET** /guest-portal/{portalId}/user/{guestId} | Get guest user for portal |
| [**getGuestPortalUserById**](GuestPortalControllerApi#getGuestPortalUserById) | **GET** /guest-portal/user/{guestId} | Get guest user |
| [**getGuestPortalUsers**](GuestPortalControllerApi#getGuestPortalUsers) | **GET** /guest-portal/{portalId}/user | Get all guest users for portal |
| [**getGuestPortals**](GuestPortalControllerApi#getGuestPortals) | **GET** /guest-portal | Get guest portals |


<a id="createGuestPortal"></a>
# **createGuestPortal**
> GuestPortalDto createGuestPortal(createPortalOptions).execute();

Create a portal page for your customers or clients to log into email accounts and view emails.

Create a guest login page for customers or clients to access assigned email addresses

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    CreatePortalOptions createPortalOptions = new CreatePortalOptions(); // CreatePortalOptions | 
    try {
      GuestPortalDto result = apiInstance.createGuestPortal(createPortalOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#createGuestPortal");
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
| **createPortalOptions** | [**CreatePortalOptions**](CreatePortalOptions)|  | |

### Return type

[**GuestPortalDto**](GuestPortalDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createGuestPortalUser"></a>
# **createGuestPortalUser**
> GuestPortalUserCreateDto createGuestPortalUser(portalId, createPortalUserOptions).execute();

Create a portal guest user

Add customer to portal

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    UUID portalId = UUID.randomUUID(); // UUID | 
    CreatePortalUserOptions createPortalUserOptions = new CreatePortalUserOptions(); // CreatePortalUserOptions | 
    try {
      GuestPortalUserCreateDto result = apiInstance.createGuestPortalUser(portalId, createPortalUserOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#createGuestPortalUser");
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
| **portalId** | **UUID**|  | |
| **createPortalUserOptions** | [**CreatePortalUserOptions**](CreatePortalUserOptions)|  | |

### Return type

[**GuestPortalUserCreateDto**](GuestPortalUserCreateDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllGuestPortalUsers"></a>
# **getAllGuestPortalUsers**
> PageGuestPortalUsers getAllGuestPortalUsers().portalId(portalId).search(search).page(page).size(size).sort(sort).since(since).before(before).execute();

Get all guest users for portal

Get all customers for a portal

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    UUID portalId = UUID.randomUUID(); // UUID | Optional portal ID
    String search = "search_example"; // String | Optional search term
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageGuestPortalUsers result = apiInstance.getAllGuestPortalUsers()
            .portalId(portalId)
            .search(search)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#getAllGuestPortalUsers");
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
| **portalId** | **UUID**| Optional portal ID | [optional] |
| **search** | **String**| Optional search term | [optional] |
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageGuestPortalUsers**](PageGuestPortalUsers)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getGuestPortal"></a>
# **getGuestPortal**
> GuestPortalDto getGuestPortal(portalId).execute();

Get a client email portal

Fetch a customer guest portal

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    UUID portalId = UUID.randomUUID(); // UUID | 
    try {
      GuestPortalDto result = apiInstance.getGuestPortal(portalId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#getGuestPortal");
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
| **portalId** | **UUID**|  | |

### Return type

[**GuestPortalDto**](GuestPortalDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getGuestPortalUser"></a>
# **getGuestPortalUser**
> GuestPortalUserDto getGuestPortalUser(portalId, guestId).execute();

Get guest user for portal

Get customer for portal

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    UUID portalId = UUID.randomUUID(); // UUID | 
    UUID guestId = UUID.randomUUID(); // UUID | 
    try {
      GuestPortalUserDto result = apiInstance.getGuestPortalUser(portalId, guestId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#getGuestPortalUser");
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
| **portalId** | **UUID**|  | |
| **guestId** | **UUID**|  | |

### Return type

[**GuestPortalUserDto**](GuestPortalUserDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getGuestPortalUserById"></a>
# **getGuestPortalUserById**
> GuestPortalUserDto getGuestPortalUserById(guestId).execute();

Get guest user

Get customer by ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    UUID guestId = UUID.randomUUID(); // UUID | 
    try {
      GuestPortalUserDto result = apiInstance.getGuestPortalUserById(guestId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#getGuestPortalUserById");
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
| **guestId** | **UUID**|  | |

### Return type

[**GuestPortalUserDto**](GuestPortalUserDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getGuestPortalUsers"></a>
# **getGuestPortalUsers**
> PageGuestPortalUsers getGuestPortalUsers(portalId).search(search).page(page).size(size).sort(sort).since(since).before(before).execute();

Get all guest users for portal

Get customers for a portal

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    UUID portalId = UUID.randomUUID(); // UUID | 
    String search = "search_example"; // String | Optional search term
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageGuestPortalUsers result = apiInstance.getGuestPortalUsers(portalId)
            .search(search)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#getGuestPortalUsers");
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
| **portalId** | **UUID**|  | |
| **search** | **String**| Optional search term | [optional] |
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageGuestPortalUsers**](PageGuestPortalUsers)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getGuestPortals"></a>
# **getGuestPortals**
> List&lt;GuestPortalDto&gt; getGuestPortals().execute();

Get guest portals

Get portals

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.GuestPortalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    GuestPortalControllerApi apiInstance = new GuestPortalControllerApi(defaultClient);
    try {
      List<GuestPortalDto> result = apiInstance.getGuestPortals()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GuestPortalControllerApi#getGuestPortals");
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

[**List&lt;GuestPortalDto&gt;**](GuestPortalDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

