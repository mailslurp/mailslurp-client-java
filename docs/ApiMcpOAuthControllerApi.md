# ApiMcpOAuthControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorizationServerMetadata**](ApiMcpOAuthControllerApi#authorizationServerMetadata) | **GET** /.well-known/oauth-authorization-server/mcp |  |
| [**authorizationServerMetadata1**](ApiMcpOAuthControllerApi#authorizationServerMetadata1) | **GET** /.well-known/oauth-authorization-server |  |
| [**authorize**](ApiMcpOAuthControllerApi#authorize) | **GET** /mcp/oauth/authorize |  |
| [**protectedResourceMetadata**](ApiMcpOAuthControllerApi#protectedResourceMetadata) | **GET** /.well-known/oauth-protected-resource/mcp |  |
| [**protectedResourceMetadata1**](ApiMcpOAuthControllerApi#protectedResourceMetadata1) | **GET** /.well-known/oauth-protected-resource |  |
| [**register**](ApiMcpOAuthControllerApi#register) | **POST** /mcp/oauth/register |  |
| [**token**](ApiMcpOAuthControllerApi#token) | **POST** /mcp/oauth/token |  |


<a id="authorizationServerMetadata"></a>
# **authorizationServerMetadata**
> Map&lt;String, Object&gt; authorizationServerMetadata().execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiMcpOAuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiMcpOAuthControllerApi apiInstance = new ApiMcpOAuthControllerApi(defaultClient);
    try {
      Map<String, Object> result = apiInstance.authorizationServerMetadata()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiMcpOAuthControllerApi#authorizationServerMetadata");
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

**Map&lt;String, Object&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authorizationServerMetadata1"></a>
# **authorizationServerMetadata1**
> Map&lt;String, Object&gt; authorizationServerMetadata1().execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiMcpOAuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiMcpOAuthControllerApi apiInstance = new ApiMcpOAuthControllerApi(defaultClient);
    try {
      Map<String, Object> result = apiInstance.authorizationServerMetadata1()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiMcpOAuthControllerApi#authorizationServerMetadata1");
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

**Map&lt;String, Object&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="authorize"></a>
# **authorize**
> Object authorize(clientId, redirectUri, responseType, codeChallenge, codeChallengeMethod, resource).scope(scope).state(state).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiMcpOAuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiMcpOAuthControllerApi apiInstance = new ApiMcpOAuthControllerApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    String redirectUri = "redirectUri_example"; // String | 
    String responseType = "responseType_example"; // String | 
    String codeChallenge = "codeChallenge_example"; // String | 
    String codeChallengeMethod = "codeChallengeMethod_example"; // String | 
    String resource = "resource_example"; // String | 
    String scope = "scope_example"; // String | 
    String state = "state_example"; // String | 
    try {
      Object result = apiInstance.authorize(clientId, redirectUri, responseType, codeChallenge, codeChallengeMethod, resource)
            .scope(scope)
            .state(state)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiMcpOAuthControllerApi#authorize");
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
| **clientId** | **String**|  | |
| **redirectUri** | **String**|  | |
| **responseType** | **String**|  | |
| **codeChallenge** | **String**|  | |
| **codeChallengeMethod** | **String**|  | |
| **resource** | **String**|  | |
| **scope** | **String**|  | [optional] |
| **state** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="protectedResourceMetadata"></a>
# **protectedResourceMetadata**
> Map&lt;String, Object&gt; protectedResourceMetadata().execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiMcpOAuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiMcpOAuthControllerApi apiInstance = new ApiMcpOAuthControllerApi(defaultClient);
    try {
      Map<String, Object> result = apiInstance.protectedResourceMetadata()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiMcpOAuthControllerApi#protectedResourceMetadata");
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

**Map&lt;String, Object&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="protectedResourceMetadata1"></a>
# **protectedResourceMetadata1**
> Map&lt;String, Object&gt; protectedResourceMetadata1().execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiMcpOAuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiMcpOAuthControllerApi apiInstance = new ApiMcpOAuthControllerApi(defaultClient);
    try {
      Map<String, Object> result = apiInstance.protectedResourceMetadata1()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiMcpOAuthControllerApi#protectedResourceMetadata1");
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

**Map&lt;String, Object&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="register"></a>
# **register**
> Object register(mcpOAuthClientRegistrationOptions).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiMcpOAuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiMcpOAuthControllerApi apiInstance = new ApiMcpOAuthControllerApi(defaultClient);
    McpOAuthClientRegistrationOptions mcpOAuthClientRegistrationOptions = new McpOAuthClientRegistrationOptions(); // McpOAuthClientRegistrationOptions | 
    try {
      Object result = apiInstance.register(mcpOAuthClientRegistrationOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiMcpOAuthControllerApi#register");
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
| **mcpOAuthClientRegistrationOptions** | [**McpOAuthClientRegistrationOptions**](McpOAuthClientRegistrationOptions)|  | |

### Return type

**Object**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="token"></a>
# **token**
> Object token(grantType, clientId, resource).code(code).redirectUri(redirectUri).codeVerifier(codeVerifier).refreshToken(refreshToken).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiMcpOAuthControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiMcpOAuthControllerApi apiInstance = new ApiMcpOAuthControllerApi(defaultClient);
    String grantType = "grantType_example"; // String | 
    String clientId = "clientId_example"; // String | 
    String resource = "resource_example"; // String | 
    String code = "code_example"; // String | 
    String redirectUri = "redirectUri_example"; // String | 
    String codeVerifier = "codeVerifier_example"; // String | 
    String refreshToken = "refreshToken_example"; // String | 
    try {
      Object result = apiInstance.token(grantType, clientId, resource)
            .code(code)
            .redirectUri(redirectUri)
            .codeVerifier(codeVerifier)
            .refreshToken(refreshToken)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiMcpOAuthControllerApi#token");
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
| **grantType** | **String**|  | |
| **clientId** | **String**|  | |
| **resource** | **String**|  | |
| **code** | **String**|  | [optional] |
| **redirectUri** | **String**|  | [optional] |
| **codeVerifier** | **String**|  | [optional] |
| **refreshToken** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

