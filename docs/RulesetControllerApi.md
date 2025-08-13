# RulesetControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewRuleset**](RulesetControllerApi#createNewRuleset) | **POST** /rulesets | Create a ruleset |
| [**deleteRuleset**](RulesetControllerApi#deleteRuleset) | **DELETE** /rulesets/{id} | Delete a ruleset |
| [**deleteRulesets**](RulesetControllerApi#deleteRulesets) | **DELETE** /rulesets | Delete rulesets |
| [**getRuleset**](RulesetControllerApi#getRuleset) | **GET** /rulesets/{id} | Get a ruleset |
| [**getRulesets**](RulesetControllerApi#getRulesets) | **GET** /rulesets | List rulesets block and allow lists |
| [**testInboxRulesetsForInbox**](RulesetControllerApi#testInboxRulesetsForInbox) | **PUT** /rulesets | Test inbox rulesets for inbox |
| [**testNewRuleset**](RulesetControllerApi#testNewRuleset) | **PATCH** /rulesets | Test new ruleset |
| [**testRuleset**](RulesetControllerApi#testRuleset) | **POST** /rulesets/{id}/test | Test a ruleset |
| [**testRulesetReceiving**](RulesetControllerApi#testRulesetReceiving) | **POST** /rulesets/test-receiving | Test receiving with rulesets |
| [**testRulesetSending**](RulesetControllerApi#testRulesetSending) | **POST** /rulesets/test-sending | Test sending with rulesets |


<a id="createNewRuleset"></a>
# **createNewRuleset**
> RulesetDto createNewRuleset(createRulesetOptions).inboxId(inboxId).phoneId(phoneId).execute();

Create a ruleset

Create a new inbox or phone number rule for forwarding, blocking, and allowing emails or SMS when sending and receiving

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    CreateRulesetOptions createRulesetOptions = new CreateRulesetOptions(); // CreateRulesetOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox id to attach ruleset to
    UUID phoneId = UUID.randomUUID(); // UUID | Phone id to attach ruleset to
    try {
      RulesetDto result = apiInstance.createNewRuleset(createRulesetOptions)
            .inboxId(inboxId)
            .phoneId(phoneId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#createNewRuleset");
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
| **createRulesetOptions** | [**CreateRulesetOptions**](CreateRulesetOptions)|  | |
| **inboxId** | **UUID**| Inbox id to attach ruleset to | [optional] |
| **phoneId** | **UUID**| Phone id to attach ruleset to | [optional] |

### Return type

[**RulesetDto**](RulesetDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteRuleset"></a>
# **deleteRuleset**
> deleteRuleset(id).execute();

Delete a ruleset

Delete ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of ruleset
    try {
      apiInstance.deleteRuleset(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#deleteRuleset");
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
| **id** | **UUID**| ID of ruleset | |

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

<a id="deleteRulesets"></a>
# **deleteRulesets**
> deleteRulesets().inboxId(inboxId).phoneId(phoneId).execute();

Delete rulesets

Delete rulesets. Accepts optional inboxId or phoneId filters.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox id to attach ruleset to
    UUID phoneId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteRulesets()
            .inboxId(inboxId)
            .phoneId(phoneId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#deleteRulesets");
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
| **inboxId** | **UUID**| Optional inbox id to attach ruleset to | [optional] |
| **phoneId** | **UUID**|  | [optional] |

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

<a id="getRuleset"></a>
# **getRuleset**
> RulesetDto getRuleset(id).execute();

Get a ruleset

Get ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of ruleset
    try {
      RulesetDto result = apiInstance.getRuleset(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#getRuleset");
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
| **id** | **UUID**| ID of ruleset | |

### Return type

[**RulesetDto**](RulesetDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getRulesets"></a>
# **getRulesets**
> PageRulesetDto getRulesets().inboxId(inboxId).phoneId(phoneId).page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).execute();

List rulesets block and allow lists

List all rulesets attached to an inbox or phone or account

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox id to get rulesets from
    UUID phoneId = UUID.randomUUID(); // UUID | Optional phone id to get rulesets from
    Integer page = 0; // Integer | Optional page index in inbox ruleset list pagination
    Integer size = 20; // Integer | Optional page size in inbox ruleset list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageRulesetDto result = apiInstance.getRulesets()
            .inboxId(inboxId)
            .phoneId(phoneId)
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#getRulesets");
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
| **inboxId** | **UUID**| Optional inbox id to get rulesets from | [optional] |
| **phoneId** | **UUID**| Optional phone id to get rulesets from | [optional] |
| **page** | **Integer**| Optional page index in inbox ruleset list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox ruleset list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageRulesetDto**](PageRulesetDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testInboxRulesetsForInbox"></a>
# **testInboxRulesetsForInbox**
> InboxRulesetTestResult testInboxRulesetsForInbox(inboxId, rulesetTestOptions).execute();

Test inbox rulesets for inbox

Test inbox rulesets for inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox
    RulesetTestOptions rulesetTestOptions = new RulesetTestOptions(); // RulesetTestOptions | 
    try {
      InboxRulesetTestResult result = apiInstance.testInboxRulesetsForInbox(inboxId, rulesetTestOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#testInboxRulesetsForInbox");
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
| **rulesetTestOptions** | [**RulesetTestOptions**](RulesetTestOptions)|  | |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testNewRuleset"></a>
# **testNewRuleset**
> InboxRulesetTestResult testNewRuleset(testNewInboxRulesetOptions).execute();

Test new ruleset

Test new ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    TestNewInboxRulesetOptions testNewInboxRulesetOptions = new TestNewInboxRulesetOptions(); // TestNewInboxRulesetOptions | 
    try {
      InboxRulesetTestResult result = apiInstance.testNewRuleset(testNewInboxRulesetOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#testNewRuleset");
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
| **testNewInboxRulesetOptions** | [**TestNewInboxRulesetOptions**](TestNewInboxRulesetOptions)|  | |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testRuleset"></a>
# **testRuleset**
> InboxRulesetTestResult testRuleset(id, rulesetTestOptions).execute();

Test a ruleset

Test an inbox or phone ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of ruleset
    RulesetTestOptions rulesetTestOptions = new RulesetTestOptions(); // RulesetTestOptions | 
    try {
      InboxRulesetTestResult result = apiInstance.testRuleset(id, rulesetTestOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#testRuleset");
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
| **id** | **UUID**| ID of ruleset | |
| **rulesetTestOptions** | [**RulesetTestOptions**](RulesetTestOptions)|  | |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testRulesetReceiving"></a>
# **testRulesetReceiving**
> TestRulesetReceivingResult testRulesetReceiving(testRulesetReceivingOptions).execute();

Test receiving with rulesets

Test whether inbound emails from an email address would be blocked or allowed by inbox rulesets or test if phone number can receive SMS

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    TestRulesetReceivingOptions testRulesetReceivingOptions = new TestRulesetReceivingOptions(); // TestRulesetReceivingOptions | 
    try {
      TestRulesetReceivingResult result = apiInstance.testRulesetReceiving(testRulesetReceivingOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#testRulesetReceiving");
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
| **testRulesetReceivingOptions** | [**TestRulesetReceivingOptions**](TestRulesetReceivingOptions)|  | |

### Return type

[**TestRulesetReceivingResult**](TestRulesetReceivingResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testRulesetSending"></a>
# **testRulesetSending**
> TestRulesetSendingResult testRulesetSending(testInboxRulesetSendingOptions).execute();

Test sending with rulesets

Test whether outbound emails to an email address would be blocked or allowed by inbox rulesets or whether a phone number can send SMS

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.RulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    RulesetControllerApi apiInstance = new RulesetControllerApi(defaultClient);
    TestInboxRulesetSendingOptions testInboxRulesetSendingOptions = new TestInboxRulesetSendingOptions(); // TestInboxRulesetSendingOptions | 
    try {
      TestRulesetSendingResult result = apiInstance.testRulesetSending(testInboxRulesetSendingOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RulesetControllerApi#testRulesetSending");
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
| **testInboxRulesetSendingOptions** | [**TestInboxRulesetSendingOptions**](TestInboxRulesetSendingOptions)|  | |

### Return type

[**TestRulesetSendingResult**](TestRulesetSendingResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

