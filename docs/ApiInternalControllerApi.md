# ApiInternalControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSamlUserOrCreate**](ApiInternalControllerApi#getSamlUserOrCreate) | **POST** /internal/saml/user | 


<a name="getSamlUserOrCreate"></a>
# **getSamlUserOrCreate**
> UserDto getSamlUserOrCreate(key, getOrCreateSamlUserOptions)



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiInternalControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiInternalControllerApi apiInstance = new ApiInternalControllerApi(defaultClient);
    String key = "key_example"; // String | 
    GetOrCreateSamlUserOptions getOrCreateSamlUserOptions = new GetOrCreateSamlUserOptions(); // GetOrCreateSamlUserOptions | 
    try {
      UserDto result = apiInstance.getSamlUserOrCreate(key, getOrCreateSamlUserOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiInternalControllerApi#getSamlUserOrCreate");
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
 **key** | **String**|  |
 **getOrCreateSamlUserOptions** | [**GetOrCreateSamlUserOptions**](GetOrCreateSamlUserOptions)|  |

### Return type

[**UserDto**](UserDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

