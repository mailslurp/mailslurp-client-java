# UserControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInboxRetentionPolicy**](UserControllerApi#createInboxRetentionPolicy) | **POST** /user/inbox-retention-policies |  |
| [**createInboxRetentionPolicyRun**](UserControllerApi#createInboxRetentionPolicyRun) | **POST** /user/inbox-retention-policies/account/run |  |
| [**createOrUpdateInboxRetentionPolicyForAccount**](UserControllerApi#createOrUpdateInboxRetentionPolicyForAccount) | **POST** /user/inbox-retention-policies/account |  |
| [**deleteInboxRetentionPolicy**](UserControllerApi#deleteInboxRetentionPolicy) | **DELETE** /user/inbox-retention-policies/{policyId} |  |
| [**deleteInboxRetentionPolicyForAccount**](UserControllerApi#deleteInboxRetentionPolicyForAccount) | **DELETE** /user/inbox-retention-policies/account |  |
| [**getEntityAutomations**](UserControllerApi#getEntityAutomations) | **GET** /user/automations |  |
| [**getEntityEvents**](UserControllerApi#getEntityEvents) | **GET** /user/events |  |
| [**getEntityFavorites**](UserControllerApi#getEntityFavorites) | **GET** /user/favorites |  |
| [**getInboxRetentionPolicy**](UserControllerApi#getInboxRetentionPolicy) | **GET** /user/inbox-retention-policies/{policyId} |  |
| [**getInboxRetentionPolicyForAccount**](UserControllerApi#getInboxRetentionPolicyForAccount) | **GET** /user/inbox-retention-policies/account |  |
| [**getInboxRetentionPolicyRun**](UserControllerApi#getInboxRetentionPolicyRun) | **GET** /user/inbox-retention-policies/runs/{runId} |  |
| [**getInboxRetentionPolicyRuns**](UserControllerApi#getInboxRetentionPolicyRuns) | **GET** /user/inbox-retention-policies/runs |  |
| [**getJsonPropertyAsString**](UserControllerApi#getJsonPropertyAsString) | **POST** /user/json/pluck |  |
| [**getUserInfo**](UserControllerApi#getUserInfo) | **GET** /user/info |  |
| [**getUserStorageInsights**](UserControllerApi#getUserStorageInsights) | **GET** /user/storage/insights |  |
| [**listInboxRetentionPolicies**](UserControllerApi#listInboxRetentionPolicies) | **GET** /user/inbox-retention-policies |  |
| [**updateInboxRetentionPolicy**](UserControllerApi#updateInboxRetentionPolicy) | **PUT** /user/inbox-retention-policies/{policyId} |  |


<a id="createInboxRetentionPolicy"></a>
# **createInboxRetentionPolicy**
> InboxRetentionPolicyDto createInboxRetentionPolicy(createInboxRetentionPolicyOptions).execute();



Create an inbox retention policy for your account

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
    CreateInboxRetentionPolicyOptions createInboxRetentionPolicyOptions = new CreateInboxRetentionPolicyOptions(); // CreateInboxRetentionPolicyOptions | 
    try {
      InboxRetentionPolicyDto result = apiInstance.createInboxRetentionPolicy(createInboxRetentionPolicyOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#createInboxRetentionPolicy");
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
| **createInboxRetentionPolicyOptions** | [**CreateInboxRetentionPolicyOptions**](CreateInboxRetentionPolicyOptions)|  | |

### Return type

[**InboxRetentionPolicyDto**](InboxRetentionPolicyDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createInboxRetentionPolicyRun"></a>
# **createInboxRetentionPolicyRun**
> InboxRetentionPolicyRunDto createInboxRetentionPolicyRun().execute();



Start an asynchronous inbox retention policy run for your account

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
      InboxRetentionPolicyRunDto result = apiInstance.createInboxRetentionPolicyRun()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#createInboxRetentionPolicyRun");
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

[**InboxRetentionPolicyRunDto**](InboxRetentionPolicyRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |

<a id="createOrUpdateInboxRetentionPolicyForAccount"></a>
# **createOrUpdateInboxRetentionPolicyForAccount**
> InboxRetentionPolicyDto createOrUpdateInboxRetentionPolicyForAccount(createInboxRetentionPolicyForAccountOptions).execute();



Create inbox retention policy for your global account

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
    CreateInboxRetentionPolicyForAccountOptions createInboxRetentionPolicyForAccountOptions = new CreateInboxRetentionPolicyForAccountOptions(); // CreateInboxRetentionPolicyForAccountOptions | 
    try {
      InboxRetentionPolicyDto result = apiInstance.createOrUpdateInboxRetentionPolicyForAccount(createInboxRetentionPolicyForAccountOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#createOrUpdateInboxRetentionPolicyForAccount");
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
| **createInboxRetentionPolicyForAccountOptions** | [**CreateInboxRetentionPolicyForAccountOptions**](CreateInboxRetentionPolicyForAccountOptions)|  | |

### Return type

[**InboxRetentionPolicyDto**](InboxRetentionPolicyDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteInboxRetentionPolicy"></a>
# **deleteInboxRetentionPolicy**
> EmptyResponseDto deleteInboxRetentionPolicy(policyId).execute();



Delete an inbox retention policy for your account

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
    UUID policyId = UUID.randomUUID(); // UUID | 
    try {
      EmptyResponseDto result = apiInstance.deleteInboxRetentionPolicy(policyId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#deleteInboxRetentionPolicy");
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
| **policyId** | **UUID**|  | |

### Return type

[**EmptyResponseDto**](EmptyResponseDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteInboxRetentionPolicyForAccount"></a>
# **deleteInboxRetentionPolicyForAccount**
> EmptyResponseDto deleteInboxRetentionPolicyForAccount().execute();



Delete inbox retention policy for your global account

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
      EmptyResponseDto result = apiInstance.deleteInboxRetentionPolicyForAccount()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#deleteInboxRetentionPolicyForAccount");
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

[**EmptyResponseDto**](EmptyResponseDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

<a id="getInboxRetentionPolicy"></a>
# **getInboxRetentionPolicy**
> InboxRetentionPolicyDto getInboxRetentionPolicy(policyId).execute();



Get an inbox retention policy for your account

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
    UUID policyId = UUID.randomUUID(); // UUID | 
    try {
      InboxRetentionPolicyDto result = apiInstance.getInboxRetentionPolicy(policyId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getInboxRetentionPolicy");
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
| **policyId** | **UUID**|  | |

### Return type

[**InboxRetentionPolicyDto**](InboxRetentionPolicyDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxRetentionPolicyForAccount"></a>
# **getInboxRetentionPolicyForAccount**
> InboxRetentionPolicyOptionalDto getInboxRetentionPolicyForAccount().execute();



Get inbox retention policy for your global account

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
      InboxRetentionPolicyOptionalDto result = apiInstance.getInboxRetentionPolicyForAccount()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getInboxRetentionPolicyForAccount");
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

[**InboxRetentionPolicyOptionalDto**](InboxRetentionPolicyOptionalDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxRetentionPolicyRun"></a>
# **getInboxRetentionPolicyRun**
> InboxRetentionPolicyRunDto getInboxRetentionPolicyRun(runId).execute();



Get a previously submitted inbox retention policy run for your account

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
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      InboxRetentionPolicyRunDto result = apiInstance.getInboxRetentionPolicyRun(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getInboxRetentionPolicyRun");
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

[**InboxRetentionPolicyRunDto**](InboxRetentionPolicyRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxRetentionPolicyRuns"></a>
# **getInboxRetentionPolicyRuns**
> PageInboxRetentionPolicyRunProjection getInboxRetentionPolicyRuns().page(page).size(size).sort(sort).execute();



List recent inbox retention policy runs for your account

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
    try {
      PageInboxRetentionPolicyRunProjection result = apiInstance.getInboxRetentionPolicyRuns()
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getInboxRetentionPolicyRuns");
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

### Return type

[**PageInboxRetentionPolicyRunProjection**](PageInboxRetentionPolicyRunProjection)

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
> String getJsonPropertyAsString(property, jsonNode).execute();



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
    JsonNode jsonNode = new JsonNode(); // JsonNode | 
    try {
      String result = apiInstance.getJsonPropertyAsString(property, jsonNode)
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
| **jsonNode** | [**JsonNode**](JsonNode)|  | |

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

<a id="getUserStorageInsights"></a>
# **getUserStorageInsights**
> UserStorageInsightsDto getUserStorageInsights().limit(limit).execute();



Get retained storage usage insights for your account

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
    Integer limit = 10; // Integer | Maximum number of inboxes and domains to return
    try {
      UserStorageInsightsDto result = apiInstance.getUserStorageInsights()
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#getUserStorageInsights");
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
| **limit** | **Integer**| Maximum number of inboxes and domains to return | [optional] [default to 10] |

### Return type

[**UserStorageInsightsDto**](UserStorageInsightsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInboxRetentionPolicies"></a>
# **listInboxRetentionPolicies**
> InboxRetentionPoliciesDto listInboxRetentionPolicies().execute();



List inbox retention policies for your account

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
      InboxRetentionPoliciesDto result = apiInstance.listInboxRetentionPolicies()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#listInboxRetentionPolicies");
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

[**InboxRetentionPoliciesDto**](InboxRetentionPoliciesDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateInboxRetentionPolicy"></a>
# **updateInboxRetentionPolicy**
> InboxRetentionPolicyDto updateInboxRetentionPolicy(policyId, updateInboxRetentionPolicyOptions).execute();



Update an inbox retention policy for your account

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
    UUID policyId = UUID.randomUUID(); // UUID | 
    UpdateInboxRetentionPolicyOptions updateInboxRetentionPolicyOptions = new UpdateInboxRetentionPolicyOptions(); // UpdateInboxRetentionPolicyOptions | 
    try {
      InboxRetentionPolicyDto result = apiInstance.updateInboxRetentionPolicy(policyId, updateInboxRetentionPolicyOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserControllerApi#updateInboxRetentionPolicy");
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
| **policyId** | **UUID**|  | |
| **updateInboxRetentionPolicyOptions** | [**UpdateInboxRetentionPolicyOptions**](UpdateInboxRetentionPolicyOptions)|  | |

### Return type

[**InboxRetentionPolicyDto**](InboxRetentionPolicyDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

