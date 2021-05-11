# AliasControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAlias**](AliasControllerApi#createAlias) | **POST** /aliases | Create an email alias. Must be verified by clicking link inside verification email that will be sent to the address. Once verified the alias will be active.
[**deleteAlias**](AliasControllerApi#deleteAlias) | **DELETE** /aliases/{aliasId} | Delete an email alias
[**getAlias**](AliasControllerApi#getAlias) | **GET** /aliases/{aliasId} | Get an email alias
[**getAliasEmails**](AliasControllerApi#getAliasEmails) | **GET** /aliases/{aliasId}/emails | Get emails for an alias
[**getAliasThreads**](AliasControllerApi#getAliasThreads) | **GET** /aliases/{aliasId}/threads | Get threads created for an alias
[**getAliases**](AliasControllerApi#getAliases) | **GET** /aliases | Get all email aliases you have created
[**replyToAliasEmail**](AliasControllerApi#replyToAliasEmail) | **PUT** /aliases/{aliasId}/emails/{emailId} | Reply to an email
[**sendAliasEmail**](AliasControllerApi#sendAliasEmail) | **POST** /aliases/{aliasId}/emails | Send an email from an alias inbox
[**updateAlias**](AliasControllerApi#updateAlias) | **PUT** /aliases/{aliasId} | Update an email alias


<a name="createAlias"></a>
# **createAlias**
> AliasDto createAlias(createAliasOptions)

Create an email alias. Must be verified by clicking link inside verification email that will be sent to the address. Once verified the alias will be active.

Email aliases use a MailSlurp randomly generated email address (or a custom domain inbox that you provide) to mask or proxy a real email address. Emails sent to the alias address will be forwarded to the hidden email address it was created for. If you want to send a reply use the threadId attached

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    CreateAliasOptions createAliasOptions = new CreateAliasOptions(); // CreateAliasOptions | createAliasOptions
    try {
      AliasDto result = apiInstance.createAlias(createAliasOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#createAlias");
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
 **createAliasOptions** | [**CreateAliasOptions**](CreateAliasOptions)| createAliasOptions |

### Return type

[**AliasDto**](AliasDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="deleteAlias"></a>
# **deleteAlias**
> deleteAlias(aliasId)

Delete an email alias

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    UUID aliasId = new UUID(); // UUID | aliasId
    try {
      apiInstance.deleteAlias(aliasId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#deleteAlias");
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
 **aliasId** | [**UUID**]()| aliasId |

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

<a name="getAlias"></a>
# **getAlias**
> AliasDto getAlias(aliasId)

Get an email alias

Get an email alias by ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    UUID aliasId = new UUID(); // UUID | aliasId
    try {
      AliasDto result = apiInstance.getAlias(aliasId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#getAlias");
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
 **aliasId** | [**UUID**]()| aliasId |

### Return type

[**AliasDto**](AliasDto)

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

<a name="getAliasEmails"></a>
# **getAliasEmails**
> PageEmailProjection getAliasEmails(aliasId, page, size, sort)

Get emails for an alias

Get paginated emails for an alias by ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    UUID aliasId = new UUID(); // UUID | aliasId
    Integer page = 0; // Integer | Optional page index alias email list pagination
    Integer size = 20; // Integer | Optional page size alias email list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageEmailProjection result = apiInstance.getAliasEmails(aliasId, page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#getAliasEmails");
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
 **aliasId** | [**UUID**]()| aliasId |
 **page** | **Integer**| Optional page index alias email list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size alias email list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageEmailProjection**](PageEmailProjection)

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

<a name="getAliasThreads"></a>
# **getAliasThreads**
> PageThreadProjection getAliasThreads(aliasId, page, size, sort)

Get threads created for an alias

Returns threads created for an email alias in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    UUID aliasId = new UUID(); // UUID | aliasId
    Integer page = 0; // Integer | Optional page index in thread list pagination
    Integer size = 20; // Integer | Optional page size in thread list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageThreadProjection result = apiInstance.getAliasThreads(aliasId, page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#getAliasThreads");
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
 **aliasId** | [**UUID**]()| aliasId |
 **page** | **Integer**| Optional page index in thread list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size in thread list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageThreadProjection**](PageThreadProjection)

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

<a name="getAliases"></a>
# **getAliases**
> PageAlias getAliases(page, size, sort)

Get all email aliases you have created

Get all email aliases in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in alias list pagination
    Integer size = 20; // Integer | Optional page size in alias list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageAlias result = apiInstance.getAliases(page, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#getAliases");
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
 **page** | **Integer**| Optional page index in alias list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size in alias list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageAlias**](PageAlias)

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

<a name="replyToAliasEmail"></a>
# **replyToAliasEmail**
> SentEmailDto replyToAliasEmail(aliasId, emailId, replyToAliasEmailOptions)

Reply to an email

Send the reply to the email sender or reply-to and include same subject cc bcc etc. Reply to an email and the contents will be sent with the existing subject to the emails &#x60;to&#x60;, &#x60;cc&#x60;, and &#x60;bcc&#x60;.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    UUID aliasId = new UUID(); // UUID | ID of the alias that email belongs to
    UUID emailId = new UUID(); // UUID | ID of the email that should be replied to
    ReplyToAliasEmailOptions replyToAliasEmailOptions = new ReplyToAliasEmailOptions(); // ReplyToAliasEmailOptions | replyToAliasEmailOptions
    try {
      SentEmailDto result = apiInstance.replyToAliasEmail(aliasId, emailId, replyToAliasEmailOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#replyToAliasEmail");
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
 **aliasId** | [**UUID**]()| ID of the alias that email belongs to |
 **emailId** | [**UUID**]()| ID of the email that should be replied to |
 **replyToAliasEmailOptions** | [**ReplyToAliasEmailOptions**](ReplyToAliasEmailOptions)| replyToAliasEmailOptions |

### Return type

[**SentEmailDto**](SentEmailDto)

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

<a name="sendAliasEmail"></a>
# **sendAliasEmail**
> SentEmailDto sendAliasEmail(aliasId, sendEmailOptions)

Send an email from an alias inbox

Send an email from an alias. Replies to the email will be forwarded to the alias masked email address

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    UUID aliasId = new UUID(); // UUID | aliasId
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | Options for the email to be sent
    try {
      SentEmailDto result = apiInstance.sendAliasEmail(aliasId, sendEmailOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#sendAliasEmail");
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
 **aliasId** | [**UUID**]()| aliasId |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)| Options for the email to be sent | [optional]

### Return type

[**SentEmailDto**](SentEmailDto)

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

<a name="updateAlias"></a>
# **updateAlias**
> updateAlias(aliasId, updateAliasOptions)

Update an email alias

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AliasControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AliasControllerApi apiInstance = new AliasControllerApi(defaultClient);
    UUID aliasId = new UUID(); // UUID | aliasId
    UpdateAliasOptions updateAliasOptions = new UpdateAliasOptions(); // UpdateAliasOptions | updateAliasOptions
    try {
      apiInstance.updateAlias(aliasId, updateAliasOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasControllerApi#updateAlias");
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
 **aliasId** | [**UUID**]()| aliasId |
 **updateAliasOptions** | [**UpdateAliasOptions**](UpdateAliasOptions)| updateAliasOptions |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**202** | Accepted |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

