# UserControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEntityAutomations**](UserControllerApi#getEntityAutomations) | **GET** /user/automations |  |
| [**getEntityEvents**](UserControllerApi#getEntityEvents) | **GET** /user/events |  |
| [**getEntityFavorites**](UserControllerApi#getEntityFavorites) | **GET** /user/favorites |  |
| [**getJsonPropertyAsString**](UserControllerApi#getJsonPropertyAsString) | **POST** /user/json/pluck |  |
| [**getUserInfo**](UserControllerApi#getUserInfo) | **GET** /user/info |  |


<a id="getEntityAutomations"></a>
# **getEntityAutomations**
> PageEntityAutomationItems getEntityAutomations().page(page).size(size).sort(sort).since(since).before(before).inboxId(inboxId).phoneId(phoneId).filter(filter).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index
    Integer size = 20; // Integer | Optional page size
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox ID
    UUID phoneId = UUID.randomUUID(); // UUID | Optional phone ID
    String filter = "INBOX_FORWARDER"; // String | Optional automation type filter
    try {
      PageEntityAutomationItems result = apiInstance.getEntityAutomations()
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .inboxId(inboxId)
            .phoneId(phoneId)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getEntityAutomations");
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
| **page** | **Integer**| Optional page index | [optional] [default to 0] |
| **size** | **Integer**| Optional page size | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **inboxId** | **UUID**| Optional inbox ID | [optional] |
| **phoneId** | **UUID**| Optional phone ID | [optional] |
| **filter** | **String**| Optional automation type filter | [optional] [enum: INBOX_FORWARDER, INBOX_REPLIER, INBOX_RULESET] |

### Return type

[**PageEntityAutomationItems**](PageEntityAutomationItems)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEntityEvents"></a>
# **getEntityEvents**
> PageEntityEventItems getEntityEvents().page(page).size(size).sort(sort).since(since).before(before).inboxId(inboxId).emailId(emailId).phoneId(phoneId).smsId(smsId).attachmentId(attachmentId).filter(filter).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index
    Integer size = 20; // Integer | Optional page size
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox ID
    UUID emailId = UUID.randomUUID(); // UUID | Optional email ID
    UUID phoneId = UUID.randomUUID(); // UUID | Optional phone ID
    UUID smsId = UUID.randomUUID(); // UUID | Optional SMS ID
    UUID attachmentId = UUID.randomUUID(); // UUID | Optional attachment ID
    String filter = "WEBHOOK_EVENT"; // String | Optional type filter
    try {
      PageEntityEventItems result = apiInstance.getEntityEvents()
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .inboxId(inboxId)
            .emailId(emailId)
            .phoneId(phoneId)
            .smsId(smsId)
            .attachmentId(attachmentId)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getEntityEvents");
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
| **page** | **Integer**| Optional page index | [optional] [default to 0] |
| **size** | **Integer**| Optional page size | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **inboxId** | **UUID**| Optional inbox ID | [optional] |
| **emailId** | **UUID**| Optional email ID | [optional] |
| **phoneId** | **UUID**| Optional phone ID | [optional] |
| **smsId** | **UUID**| Optional SMS ID | [optional] |
| **attachmentId** | **UUID**| Optional attachment ID | [optional] |
| **filter** | **String**| Optional type filter | [optional] [enum: WEBHOOK_EVENT, INBOX_FORWARDER_EVENT, INBOX_REPLIER_EVENT, INBOX_RULESET_EVENT, ALIAS_EVENT] |

### Return type

[**PageEntityEventItems**](PageEntityEventItems)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEntityFavorites"></a>
# **getEntityFavorites**
> PageEntityFavouriteItems getEntityFavorites().page(page).size(size).sort(sort).since(since).before(before).filter(filter).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index
    Integer size = 20; // Integer | Optional page size
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    String filter = "INBOX"; // String | Optional type filter
    try {
      PageEntityFavouriteItems result = apiInstance.getEntityFavorites()
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getEntityFavorites");
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
| **page** | **Integer**| Optional page index | [optional] [default to 0] |
| **size** | **Integer**| Optional page size | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **filter** | **String**| Optional type filter | [optional] [enum: INBOX, EMAIL, ATTACHMENT, PHONE, SMS] |

### Return type

[**PageEntityFavouriteItems**](PageEntityFavouriteItems)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getJsonPropertyAsString"></a>
# **getJsonPropertyAsString**
> String getJsonPropertyAsString(property, body).execute();



Utility function to extract properties from JSON objects in language where this is cumbersome.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    String property = "property_example"; // String | JSON property name or dot separated path selector such as `a.b.c`
    Object body = null; // Object | 
    try {
      String result = apiInstance.getJsonPropertyAsString(property, body)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getJsonPropertyAsString");
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
| **property** | **String**| JSON property name or dot separated path selector such as &#x60;a.b.c&#x60; | |
| **body** | **Object**|  | |

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getUserInfo"></a>
# **getUserInfo**
> UserInfoDto getUserInfo().execute();



Get account information for your user

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.UserControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    UserControllerApi apiInstance = new UserControllerApi(defaultClient);
    try {
      UserInfoDto result = apiInstance.getUserInfo()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getUserInfo");
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

[**UserInfoDto**](UserInfoDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

