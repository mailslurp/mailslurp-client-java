# PhoneControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmergencyAddress**](PhoneControllerApi#createEmergencyAddress) | **POST** /phone/emergency-addresses | 
[**deleteEmergencyAddress**](PhoneControllerApi#deleteEmergencyAddress) | **DELETE** /phone/emergency-addresses/{addressId} | 
[**deletePhoneNumber**](PhoneControllerApi#deletePhoneNumber) | **DELETE** /phone/numbers/{phoneNumberId} | 
[**getEmergencyAddress**](PhoneControllerApi#getEmergencyAddress) | **GET** /phone/emergency-addresses/{addressId} | 
[**getEmergencyAddresses**](PhoneControllerApi#getEmergencyAddresses) | **GET** /phone/emergency-addresses | 
[**getPhoneNumber**](PhoneControllerApi#getPhoneNumber) | **GET** /phone/numbers/{phoneNumberId} | 
[**getPhoneNumbers**](PhoneControllerApi#getPhoneNumbers) | **GET** /phone/numbers | 
[**getPhonePlans**](PhoneControllerApi#getPhonePlans) | **GET** /phone/plans | 


<a name="createEmergencyAddress"></a>
# **createEmergencyAddress**
> EmergencyAddress createEmergencyAddress(createEmergencyAddressOptions)



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    CreateEmergencyAddressOptions createEmergencyAddressOptions = new CreateEmergencyAddressOptions(); // CreateEmergencyAddressOptions | 
    try {
      EmergencyAddress result = apiInstance.createEmergencyAddress(createEmergencyAddressOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#createEmergencyAddress");
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
 **createEmergencyAddressOptions** | [**CreateEmergencyAddressOptions**](CreateEmergencyAddressOptions)|  |

### Return type

[**EmergencyAddress**](EmergencyAddress)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="deleteEmergencyAddress"></a>
# **deleteEmergencyAddress**
> EmptyResponseDto deleteEmergencyAddress(addressId)



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    UUID addressId = new UUID(); // UUID | 
    try {
      EmptyResponseDto result = apiInstance.deleteEmergencyAddress(addressId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#deleteEmergencyAddress");
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
 **addressId** | [**UUID**]()|  |

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
**200** | OK |  -  |

<a name="deletePhoneNumber"></a>
# **deletePhoneNumber**
> deletePhoneNumber(phoneNumberId)



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    UUID phoneNumberId = new UUID(); // UUID | 
    try {
      apiInstance.deletePhoneNumber(phoneNumberId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#deletePhoneNumber");
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
 **phoneNumberId** | [**UUID**]()|  |

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

<a name="getEmergencyAddress"></a>
# **getEmergencyAddress**
> EmergencyAddress getEmergencyAddress(addressId)



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    UUID addressId = new UUID(); // UUID | 
    try {
      EmergencyAddress result = apiInstance.getEmergencyAddress(addressId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getEmergencyAddress");
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
 **addressId** | [**UUID**]()|  |

### Return type

[**EmergencyAddress**](EmergencyAddress)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getEmergencyAddresses"></a>
# **getEmergencyAddresses**
> List&lt;EmergencyAddressDto&gt; getEmergencyAddresses()



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    try {
      List<EmergencyAddressDto> result = apiInstance.getEmergencyAddresses();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getEmergencyAddresses");
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

[**List&lt;EmergencyAddressDto&gt;**](EmergencyAddressDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getPhoneNumber"></a>
# **getPhoneNumber**
> PhoneNumberDto getPhoneNumber(phoneNumberId)



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    UUID phoneNumberId = new UUID(); // UUID | 
    try {
      PhoneNumberDto result = apiInstance.getPhoneNumber(phoneNumberId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneNumber");
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
 **phoneNumberId** | [**UUID**]()|  |

### Return type

[**PhoneNumberDto**](PhoneNumberDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getPhoneNumbers"></a>
# **getPhoneNumbers**
> PagePhoneNumberProjection getPhoneNumbers(page, size, sort, since, before)



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index for list pagination
    Integer size = 20; // Integer | Optional page size for list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PagePhoneNumberProjection result = apiInstance.getPhoneNumbers(page, size, sort, since, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneNumbers");
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
 **page** | **Integer**| Optional page index for list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size for list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**PagePhoneNumberProjection**](PagePhoneNumberProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getPhonePlans"></a>
# **getPhonePlans**
> List&lt;PhonePlanDto&gt; getPhonePlans()



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.PhoneControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    PhoneControllerApi apiInstance = new PhoneControllerApi(defaultClient);
    try {
      List<PhonePlanDto> result = apiInstance.getPhonePlans();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhonePlans");
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

[**List&lt;PhonePlanDto&gt;**](PhonePlanDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

