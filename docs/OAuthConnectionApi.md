# OAuthConnectionApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOAuthConnection**](OAuthConnectionApi#createOAuthConnection) | **POST** /oauth-connection | Create an OAuth connection |
| [**exchangeAuthorizationTokenAndCreateOrUpdateInbox**](OAuthConnectionApi#exchangeAuthorizationTokenAndCreateOrUpdateInbox) | **POST** /oauth-connection/oauth-exchange/google | Exchange authorization code for access token and create inbox |


<a id="createOAuthConnection"></a>
# **createOAuthConnection**
> CreateOAuthConnectionResult createOAuthConnection(redirectBase, oAuthConnectionType).emailAddress(emailAddress).execute();

Create an OAuth connection

Configure an inbox for OAuth sync with MailSlurp

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.OAuthConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    OAuthConnectionApi apiInstance = new OAuthConnectionApi(defaultClient);
    String redirectBase = "redirectBase_example"; // String | 
    String oAuthConnectionType = "GOOGLE"; // String | 
    String emailAddress = "emailAddress_example"; // String | 
    try {
      CreateOAuthConnectionResult result = apiInstance.createOAuthConnection(redirectBase, oAuthConnectionType)
            .emailAddress(emailAddress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthConnectionApi#createOAuthConnection");
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
| **redirectBase** | **String**|  | |
| **oAuthConnectionType** | **String**|  | [enum: GOOGLE, MICROSOFT] |
| **emailAddress** | **String**|  | [optional] |

### Return type

[**CreateOAuthConnectionResult**](CreateOAuthConnectionResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="exchangeAuthorizationTokenAndCreateOrUpdateInbox"></a>
# **exchangeAuthorizationTokenAndCreateOrUpdateInbox**
> CreateOAuthExchangeResult exchangeAuthorizationTokenAndCreateOrUpdateInbox(authorizationCode, redirectUri).execute();

Exchange authorization code for access token and create inbox

Exchange an OAuth code for an access token and create an inbox connection in MailSlurp

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.OAuthConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    OAuthConnectionApi apiInstance = new OAuthConnectionApi(defaultClient);
    String authorizationCode = "authorizationCode_example"; // String | 
    String redirectUri = "redirectUri_example"; // String | 
    try {
      CreateOAuthExchangeResult result = apiInstance.exchangeAuthorizationTokenAndCreateOrUpdateInbox(authorizationCode, redirectUri)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthConnectionApi#exchangeAuthorizationTokenAndCreateOrUpdateInbox");
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
| **authorizationCode** | **String**|  | |
| **redirectUri** | **String**|  | |

### Return type

[**CreateOAuthExchangeResult**](CreateOAuthExchangeResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

