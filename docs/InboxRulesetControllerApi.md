# InboxRulesetControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewInboxRuleset**](InboxRulesetControllerApi#createNewInboxRuleset) | **POST** /rulesets | Create an inbox ruleset
[**deleteInboxRuleset**](InboxRulesetControllerApi#deleteInboxRuleset) | **DELETE** /rulesets/{id} | Delete an inbox ruleset
[**deleteInboxRulesets**](InboxRulesetControllerApi#deleteInboxRulesets) | **DELETE** /rulesets | Delete inbox rulesets
[**getInboxRuleset**](InboxRulesetControllerApi#getInboxRuleset) | **GET** /rulesets/{id} | Get an inbox ruleset
[**getInboxRulesets**](InboxRulesetControllerApi#getInboxRulesets) | **GET** /rulesets | List inbox rulesets
[**testInboxRuleset**](InboxRulesetControllerApi#testInboxRuleset) | **POST** /rulesets/{id}/test | Test an inbox ruleset
[**testInboxRulesetsForInbox**](InboxRulesetControllerApi#testInboxRulesetsForInbox) | **PUT** /rulesets | Test inbox rulesets for inbox
[**testNewInboxRuleset**](InboxRulesetControllerApi#testNewInboxRuleset) | **PATCH** /rulesets | Test new inbox ruleset


<a name="createNewInboxRuleset"></a>
# **createNewInboxRuleset**
> InboxRulesetDto createNewInboxRuleset(createInboxRulesetOptions, inboxId)

Create an inbox ruleset

Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    CreateInboxRulesetOptions createInboxRulesetOptions = new CreateInboxRulesetOptions(); // CreateInboxRulesetOptions | createInboxRulesetOptions
    UUID inboxId = new UUID(); // UUID | Inbox id to attach ruleset to
    try {
      InboxRulesetDto result = apiInstance.createNewInboxRuleset(createInboxRulesetOptions, inboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#createNewInboxRuleset");
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
 **createInboxRulesetOptions** | [**CreateInboxRulesetOptions**](CreateInboxRulesetOptions)| createInboxRulesetOptions |
 **inboxId** | [**UUID**]()| Inbox id to attach ruleset to | [optional]

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

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

<a name="deleteInboxRuleset"></a>
# **deleteInboxRuleset**
> deleteInboxRuleset(id)

Delete an inbox ruleset

Delete inbox ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | ID of inbox ruleset
    try {
      apiInstance.deleteInboxRuleset(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#deleteInboxRuleset");
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
 **id** | [**UUID**]()| ID of inbox ruleset |

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

<a name="deleteInboxRulesets"></a>
# **deleteInboxRulesets**
> deleteInboxRulesets(inboxId)

Delete inbox rulesets

Delete inbox rulesets. Accepts optional inboxId filter.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Optional inbox id to attach ruleset to
    try {
      apiInstance.deleteInboxRulesets(inboxId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#deleteInboxRulesets");
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
 **inboxId** | [**UUID**]()| Optional inbox id to attach ruleset to | [optional]

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

<a name="getInboxRuleset"></a>
# **getInboxRuleset**
> InboxRulesetDto getInboxRuleset(id)

Get an inbox ruleset

Get inbox ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | ID of inbox ruleset
    try {
      InboxRulesetDto result = apiInstance.getInboxRuleset(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#getInboxRuleset");
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
 **id** | [**UUID**]()| ID of inbox ruleset |

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

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

<a name="getInboxRulesets"></a>
# **getInboxRulesets**
> PageInboxRulesetDto getInboxRulesets(inboxId, page, searchFilter, size, sort)

List inbox rulesets

List all rulesets attached to an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Optional inbox id to get rulesets from
    Integer page = 0; // Integer | Optional page index in inbox ruleset list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    Integer size = 20; // Integer | Optional page size in inbox ruleset list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxRulesetDto result = apiInstance.getInboxRulesets(inboxId, page, searchFilter, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#getInboxRulesets");
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
 **inboxId** | [**UUID**]()| Optional inbox id to get rulesets from | [optional]
 **page** | **Integer**| Optional page index in inbox ruleset list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **size** | **Integer**| Optional page size in inbox ruleset list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageInboxRulesetDto**](PageInboxRulesetDto)

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

<a name="testInboxRuleset"></a>
# **testInboxRuleset**
> InboxRulesetTestResult testInboxRuleset(id, inboxRulesetTestOptions)

Test an inbox ruleset

Test an inbox ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    UUID id = new UUID(); // UUID | ID of inbox ruleset
    InboxRulesetTestOptions inboxRulesetTestOptions = new InboxRulesetTestOptions(); // InboxRulesetTestOptions | inboxRulesetTestOptions
    try {
      InboxRulesetTestResult result = apiInstance.testInboxRuleset(id, inboxRulesetTestOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#testInboxRuleset");
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
 **id** | [**UUID**]()| ID of inbox ruleset |
 **inboxRulesetTestOptions** | [**InboxRulesetTestOptions**](InboxRulesetTestOptions)| inboxRulesetTestOptions |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

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

<a name="testInboxRulesetsForInbox"></a>
# **testInboxRulesetsForInbox**
> InboxRulesetTestResult testInboxRulesetsForInbox(inboxId, inboxRulesetTestOptions)

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
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | ID of inbox
    InboxRulesetTestOptions inboxRulesetTestOptions = new InboxRulesetTestOptions(); // InboxRulesetTestOptions | inboxRulesetTestOptions
    try {
      InboxRulesetTestResult result = apiInstance.testInboxRulesetsForInbox(inboxId, inboxRulesetTestOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#testInboxRulesetsForInbox");
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
 **inboxRulesetTestOptions** | [**InboxRulesetTestOptions**](InboxRulesetTestOptions)| inboxRulesetTestOptions |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

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

<a name="testNewInboxRuleset"></a>
# **testNewInboxRuleset**
> InboxRulesetTestResult testNewInboxRuleset(testNewInboxRulesetOptions)

Test new inbox ruleset

Test new inbox ruleset

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxRulesetControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxRulesetControllerApi apiInstance = new InboxRulesetControllerApi(defaultClient);
    TestNewInboxRulesetOptions testNewInboxRulesetOptions = new TestNewInboxRulesetOptions(); // TestNewInboxRulesetOptions | testNewInboxRulesetOptions
    try {
      InboxRulesetTestResult result = apiInstance.testNewInboxRuleset(testNewInboxRulesetOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxRulesetControllerApi#testNewInboxRuleset");
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
 **testNewInboxRulesetOptions** | [**TestNewInboxRulesetOptions**](TestNewInboxRulesetOptions)| testNewInboxRulesetOptions |

### Return type

[**InboxRulesetTestResult**](InboxRulesetTestResult)

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

