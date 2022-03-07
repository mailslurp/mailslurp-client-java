# EmailVerificationControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getValidationRequests**](EmailVerificationControllerApi#getValidationRequests) | **GET** /email-verification/validation-requests | Validate a list of email addresses. Per unit billing. See your plan for pricing.
[**validateEmailAddressList**](EmailVerificationControllerApi#validateEmailAddressList) | **POST** /email-verification/email-address-list | Validate a list of email addresses. Per unit billing. See your plan for pricing.


<a name="getValidationRequests"></a>
# **getValidationRequests**
> PageEmailValidationRequest getValidationRequests(page, size, sort, searchFilter, since, before, isValid)

Validate a list of email addresses. Per unit billing. See your plan for pricing.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailVerificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailVerificationControllerApi apiInstance = new EmailVerificationControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size for paginated result list.
    String sort = "DESC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Filter by created at before the given timestamp
    Boolean isValid = true; // Boolean | Filter where email is valid is true or false
    try {
      PageEmailValidationRequest result = apiInstance.getValidationRequests(page, size, sort, searchFilter, since, before, isValid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailVerificationControllerApi#getValidationRequests");
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
 **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size for paginated result list. | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC]
 **searchFilter** | **String**| Optional search filter | [optional]
 **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **isValid** | **Boolean**| Filter where email is valid is true or false | [optional]

### Return type

[**PageEmailValidationRequest**](PageEmailValidationRequest)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="validateEmailAddressList"></a>
# **validateEmailAddressList**
> ValidateEmailAddressListResult validateEmailAddressList(validateEmailAddressListOptions)

Validate a list of email addresses. Per unit billing. See your plan for pricing.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailVerificationControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailVerificationControllerApi apiInstance = new EmailVerificationControllerApi(defaultClient);
    ValidateEmailAddressListOptions validateEmailAddressListOptions = new ValidateEmailAddressListOptions(); // ValidateEmailAddressListOptions | 
    try {
      ValidateEmailAddressListResult result = apiInstance.validateEmailAddressList(validateEmailAddressListOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailVerificationControllerApi#validateEmailAddressList");
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
 **validateEmailAddressListOptions** | [**ValidateEmailAddressListOptions**](ValidateEmailAddressListOptions)|  |

### Return type

[**ValidateEmailAddressListResult**](ValidateEmailAddressListResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

