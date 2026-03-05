# EmailVerificationControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAllValidationRequests**](EmailVerificationControllerApi#deleteAllValidationRequests) | **DELETE** /email-verification | Delete all validation requests |
| [**deleteValidationRequest**](EmailVerificationControllerApi#deleteValidationRequest) | **DELETE** /email-verification/{id} | Delete a validation record |
| [**getValidationRequests**](EmailVerificationControllerApi#getValidationRequests) | **GET** /email-verification/validation-requests | Validate a list of email addresses. Per unit billing. See your plan for pricing. |
| [**validateEmailAddressList**](EmailVerificationControllerApi#validateEmailAddressList) | **POST** /email-verification/email-address-list | Validate a list of email addresses. Per unit billing. See your plan for pricing. |


<a id="deleteAllValidationRequests"></a>
# **deleteAllValidationRequests**
> deleteAllValidationRequests().execute();

Delete all validation requests

Remove validation requests

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailVerificationControllerApi apiInstance = new EmailVerificationControllerApi(defaultClient);
    try {
      apiInstance.deleteAllValidationRequests()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailVerificationControllerApi#deleteAllValidationRequests");
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

<a id="deleteValidationRequest"></a>
# **deleteValidationRequest**
> deleteValidationRequest(id).execute();

Delete a validation record

Delete a validation record

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailVerificationControllerApi apiInstance = new EmailVerificationControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteValidationRequest(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailVerificationControllerApi#deleteValidationRequest");
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
| **id** | **UUID**|  | |

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

<a id="getValidationRequests"></a>
# **getValidationRequests**
> PageEmailValidationRequest getValidationRequests().page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).isValid(isValid).execute();

Validate a list of email addresses. Per unit billing. See your plan for pricing.

List email verification requests

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailVerificationControllerApi apiInstance = new EmailVerificationControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size for paginated result list.
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    Boolean isValid = true; // Boolean | Filter where email is valid is true or false
    try {
      PageEmailValidationRequest result = apiInstance.getValidationRequests()
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .isValid(isValid)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size for paginated result list. | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **isValid** | **Boolean**| Filter where email is valid is true or false | [optional] |

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
| **200** | OK |  -  |

<a id="validateEmailAddressList"></a>
# **validateEmailAddressList**
> ValidateEmailAddressListResult validateEmailAddressList(validateEmailAddressListOptions).execute();

Validate a list of email addresses. Per unit billing. See your plan for pricing.

Verify a list of email addresses is valid and can be contacted.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailVerificationControllerApi apiInstance = new EmailVerificationControllerApi(defaultClient);
    ValidateEmailAddressListOptions validateEmailAddressListOptions = new ValidateEmailAddressListOptions(); // ValidateEmailAddressListOptions | 
    try {
      ValidateEmailAddressListResult result = apiInstance.validateEmailAddressList(validateEmailAddressListOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validateEmailAddressListOptions** | [**ValidateEmailAddressListOptions**](ValidateEmailAddressListOptions)|  | |

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
| **200** | OK |  -  |

