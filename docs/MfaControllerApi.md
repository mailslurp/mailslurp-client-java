# MfaControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTotpDeviceForCustom**](MfaControllerApi#createTotpDeviceForCustom) | **POST** /mfa/totp/device/custom | Create a TOTP device from custom options |
| [**createTotpDeviceForOtpAuthUrl**](MfaControllerApi#createTotpDeviceForOtpAuthUrl) | **POST** /mfa/totp/device/otpAuthUrl | Create a TOTP device from an OTP Auth URL |
| [**getTotpDevice**](MfaControllerApi#getTotpDevice) | **GET** /mfa/totp/device/{id} | Get a TOTP device by ID |
| [**getTotpDeviceBy**](MfaControllerApi#getTotpDeviceBy) | **GET** /mfa/totp/device/by | Get a TOTP device by username, issuer, or name. Returns empty if not found. |
| [**getTotpDeviceCode**](MfaControllerApi#getTotpDeviceCode) | **GET** /mfa/totp/device/{id}/code | Get a TOTP device code by device ID |


<a id="createTotpDeviceForCustom"></a>
# **createTotpDeviceForCustom**
> TotpDeviceDto createTotpDeviceForCustom(createTotpDeviceOtpAuthUrlOptions).execute();

Create a TOTP device from custom options

Create a virtual TOTP device for custom options specifying all parameters of the TOTP device.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MfaControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MfaControllerApi apiInstance = new MfaControllerApi(defaultClient);
    CreateTotpDeviceOtpAuthUrlOptions createTotpDeviceOtpAuthUrlOptions = new CreateTotpDeviceOtpAuthUrlOptions(); // CreateTotpDeviceOtpAuthUrlOptions | 
    try {
      TotpDeviceDto result = apiInstance.createTotpDeviceForCustom(createTotpDeviceOtpAuthUrlOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaControllerApi#createTotpDeviceForCustom");
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
| **createTotpDeviceOtpAuthUrlOptions** | [**CreateTotpDeviceOtpAuthUrlOptions**](CreateTotpDeviceOtpAuthUrlOptions)|  | |

### Return type

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createTotpDeviceForOtpAuthUrl"></a>
# **createTotpDeviceForOtpAuthUrl**
> TotpDeviceDto createTotpDeviceForOtpAuthUrl(createTotpDeviceOtpAuthUrlOptions).execute();

Create a TOTP device from an OTP Auth URL

Create a virtual TOTP device for a given OTP Auth URL such as otpauth://totp/MyApp:alice@example.com?secret&#x3D;ABC123&amp;issuer&#x3D;MyApp&amp;period&#x3D;30&amp;digits&#x3D;6&amp;algorithm&#x3D;SHA1. You can provider overrides in the options for each component of the URL.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MfaControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MfaControllerApi apiInstance = new MfaControllerApi(defaultClient);
    CreateTotpDeviceOtpAuthUrlOptions createTotpDeviceOtpAuthUrlOptions = new CreateTotpDeviceOtpAuthUrlOptions(); // CreateTotpDeviceOtpAuthUrlOptions | 
    try {
      TotpDeviceDto result = apiInstance.createTotpDeviceForOtpAuthUrl(createTotpDeviceOtpAuthUrlOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaControllerApi#createTotpDeviceForOtpAuthUrl");
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
| **createTotpDeviceOtpAuthUrlOptions** | [**CreateTotpDeviceOtpAuthUrlOptions**](CreateTotpDeviceOtpAuthUrlOptions)|  | |

### Return type

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTotpDevice"></a>
# **getTotpDevice**
> TotpDeviceDto getTotpDevice(id).execute();

Get a TOTP device by ID

Get Time-Based One-Time Password (TOTP) device by its ID.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MfaControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MfaControllerApi apiInstance = new MfaControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      TotpDeviceDto result = apiInstance.getTotpDevice(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaControllerApi#getTotpDevice");
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

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTotpDeviceBy"></a>
# **getTotpDeviceBy**
> TotpDeviceOptionalDto getTotpDeviceBy().name(name).issuer(issuer).username(username).execute();

Get a TOTP device by username, issuer, or name. Returns empty if not found.

Get Time-Based One-Time Password (TOTP) device by its username and issuer mapping.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MfaControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MfaControllerApi apiInstance = new MfaControllerApi(defaultClient);
    String name = "name_example"; // String | Optional name filter
    String issuer = "issuer_example"; // String | Optional issuer filter
    String username = "username_example"; // String | Optional username filter
    try {
      TotpDeviceOptionalDto result = apiInstance.getTotpDeviceBy()
            .name(name)
            .issuer(issuer)
            .username(username)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaControllerApi#getTotpDeviceBy");
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
| **name** | **String**| Optional name filter | [optional] |
| **issuer** | **String**| Optional issuer filter | [optional] |
| **username** | **String**| Optional username filter | [optional] |

### Return type

[**TotpDeviceOptionalDto**](TotpDeviceOptionalDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTotpDeviceCode"></a>
# **getTotpDeviceCode**
> TotpDeviceCodeDto getTotpDeviceCode(id).at(at).execute();

Get a TOTP device code by device ID

Get Time-Based One-Time Password for a device by its ID.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MfaControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MfaControllerApi apiInstance = new MfaControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    OffsetDateTime at = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      TotpDeviceCodeDto result = apiInstance.getTotpDeviceCode(id)
            .at(at)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MfaControllerApi#getTotpDeviceCode");
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
| **at** | **OffsetDateTime**|  | [optional] |

### Return type

[**TotpDeviceCodeDto**](TotpDeviceCodeDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

