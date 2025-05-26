# PhoneControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEmergencyAddress**](PhoneControllerApi#createEmergencyAddress) | **POST** /phone/emergency-addresses | Create an emergency address |
| [**createPhoneNumber**](PhoneControllerApi#createPhoneNumber) | **POST** /phone | Add phone number to your account. Only works if you have already added a plan and an initial phone number in your account and acknowledged the pricing and terms of service by enabling API phone creation. |
| [**deleteEmergencyAddress**](PhoneControllerApi#deleteEmergencyAddress) | **DELETE** /phone/emergency-addresses/{addressId} | Delete an emergency address |
| [**deletePhoneNumber**](PhoneControllerApi#deletePhoneNumber) | **DELETE** /phone/numbers/{phoneNumberId} | Delete a phone number |
| [**getAllPhoneMessageThreads**](PhoneControllerApi#getAllPhoneMessageThreads) | **GET** /phone/numbers/message-threads | Get the latest messages for all phones |
| [**getConsentStatus**](PhoneControllerApi#getConsentStatus) | **GET** /phone/consent | Get consent status |
| [**getEmergencyAddress**](PhoneControllerApi#getEmergencyAddress) | **GET** /phone/emergency-addresses/{addressId} | Get an emergency address |
| [**getEmergencyAddresses**](PhoneControllerApi#getEmergencyAddresses) | **GET** /phone/emergency-addresses | Get emergency addresses |
| [**getPhoneMessageThreadItems**](PhoneControllerApi#getPhoneMessageThreadItems) | **GET** /phone/numbers/{phoneNumberId}/message-threads/{otherNumber} | Get messages in a phone thread |
| [**getPhoneMessageThreads**](PhoneControllerApi#getPhoneMessageThreads) | **GET** /phone/numbers/{phoneNumberId}/message-threads | Get the latest message preview for a thread |
| [**getPhoneNumber**](PhoneControllerApi#getPhoneNumber) | **GET** /phone/numbers/{phoneNumberId} | Get a phone number by ID |
| [**getPhoneNumberByName**](PhoneControllerApi#getPhoneNumberByName) | **GET** /phone/numbers/by-name | Get a phone number by name |
| [**getPhoneNumberByPhoneNumber**](PhoneControllerApi#getPhoneNumberByPhoneNumber) | **GET** /phone/numbers/by-phone-number | Get a phone number by phone number |
| [**getPhoneNumbers**](PhoneControllerApi#getPhoneNumbers) | **GET** /phone/numbers | Get phone numbers |
| [**getPhonePlans**](PhoneControllerApi#getPhonePlans) | **GET** /phone/plans | Get phone plans |
| [**getPhonePlansAvailability**](PhoneControllerApi#getPhonePlansAvailability) | **GET** /phone/plans/availability | Get phone plans availability |
| [**getSentSmsByPhoneNumber**](PhoneControllerApi#getSentSmsByPhoneNumber) | **GET** /phone/numbers/{phoneNumberId}/sms-sent | List sent TXT messages for a phone number |
| [**getSmsByPhoneNumber**](PhoneControllerApi#getSmsByPhoneNumber) | **GET** /phone/numbers/{phoneNumberId}/sms | List SMS messages for a phone number |
| [**sendSmsFromPhoneNumber**](PhoneControllerApi#sendSmsFromPhoneNumber) | **POST** /phone/numbers/{phoneNumberId}/sms | Send TXT message from a phone number |
| [**setConsentStatus**](PhoneControllerApi#setConsentStatus) | **POST** /phone/consent | Set consent status |
| [**setPhoneFavourited**](PhoneControllerApi#setPhoneFavourited) | **PUT** /phone/numbers/{phoneNumberId}/favourite | Set phone favourited state |
| [**testPhoneNumberSendSms**](PhoneControllerApi#testPhoneNumberSendSms) | **POST** /phone/numbers/{phoneNumberId}/test | Test sending an SMS to a number |
| [**updatePhoneNumber**](PhoneControllerApi#updatePhoneNumber) | **PUT** /phone/numbers/{phoneNumberId} | Update a phone number |
| [**validatePhoneNumber**](PhoneControllerApi#validatePhoneNumber) | **POST** /phone/validate | Verify validity of a phone number |


<a id="createEmergencyAddress"></a>
# **createEmergencyAddress**
> EmergencyAddress createEmergencyAddress(createEmergencyAddressOptions).execute();

Create an emergency address

Add an emergency address to a phone number

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
      EmergencyAddress result = apiInstance.createEmergencyAddress(createEmergencyAddressOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createEmergencyAddressOptions** | [**CreateEmergencyAddressOptions**](CreateEmergencyAddressOptions)|  | |

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
| **200** | OK |  -  |

<a id="createPhoneNumber"></a>
# **createPhoneNumber**
> PhoneNumberDto createPhoneNumber(createPhoneNumberOptions).execute();

Add phone number to your account. Only works if you have already added a plan and an initial phone number in your account and acknowledged the pricing and terms of service by enabling API phone creation.

Create new phone number

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
    CreatePhoneNumberOptions createPhoneNumberOptions = new CreatePhoneNumberOptions(); // CreatePhoneNumberOptions | 
    try {
      PhoneNumberDto result = apiInstance.createPhoneNumber(createPhoneNumberOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#createPhoneNumber");
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
| **createPhoneNumberOptions** | [**CreatePhoneNumberOptions**](CreatePhoneNumberOptions)|  | |

### Return type

[**PhoneNumberDto**](PhoneNumberDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteEmergencyAddress"></a>
# **deleteEmergencyAddress**
> EmptyResponseDto deleteEmergencyAddress(addressId).execute();

Delete an emergency address

Delete an emergency address

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
    UUID addressId = UUID.randomUUID(); // UUID | 
    try {
      EmptyResponseDto result = apiInstance.deleteEmergencyAddress(addressId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addressId** | **UUID**|  | |

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
| **200** | OK |  -  |

<a id="deletePhoneNumber"></a>
# **deletePhoneNumber**
> deletePhoneNumber(phoneNumberId).execute();

Delete a phone number

Remove phone number from account

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deletePhoneNumber(phoneNumberId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phoneNumberId** | **UUID**|  | |

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

<a id="getAllPhoneMessageThreads"></a>
# **getAllPhoneMessageThreads**
> PagePhoneMessageThreadProjection getAllPhoneMessageThreads().page(page).size(size).execute();

Get the latest messages for all phones

List all message threads for all phones

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
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    try {
      PagePhoneMessageThreadProjection result = apiInstance.getAllPhoneMessageThreads()
            .page(page)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getAllPhoneMessageThreads");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**PagePhoneMessageThreadProjection**](PagePhoneMessageThreadProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConsentStatus"></a>
# **getConsentStatus**
> ConsentStatusDto getConsentStatus().execute();

Get consent status

Get the status of phone usage consent

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
      ConsentStatusDto result = apiInstance.getConsentStatus()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getConsentStatus");
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

[**ConsentStatusDto**](ConsentStatusDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmergencyAddress"></a>
# **getEmergencyAddress**
> EmergencyAddress getEmergencyAddress(addressId).execute();

Get an emergency address

Fetch an emergency address by ID

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
    UUID addressId = UUID.randomUUID(); // UUID | 
    try {
      EmergencyAddress result = apiInstance.getEmergencyAddress(addressId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addressId** | **UUID**|  | |

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
| **200** | OK |  -  |

<a id="getEmergencyAddresses"></a>
# **getEmergencyAddresses**
> List&lt;EmergencyAddressDto&gt; getEmergencyAddresses().execute();

Get emergency addresses

List emergency addresses

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
      List<EmergencyAddressDto> result = apiInstance.getEmergencyAddresses()
            .execute();
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
| **200** | OK |  -  |

<a id="getPhoneMessageThreadItems"></a>
# **getPhoneMessageThreadItems**
> PagePhoneMessageThreadItemProjection getPhoneMessageThreadItems(phoneNumberId, otherNumber).page(page).size(size).execute();

Get messages in a phone thread

List message thread messages for a phone message thread

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    String otherNumber = "otherNumber_example"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    try {
      PagePhoneMessageThreadItemProjection result = apiInstance.getPhoneMessageThreadItems(phoneNumberId, otherNumber)
            .page(page)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneMessageThreadItems");
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
| **phoneNumberId** | **UUID**|  | |
| **otherNumber** | **String**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**PagePhoneMessageThreadItemProjection**](PagePhoneMessageThreadItemProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneMessageThreads"></a>
# **getPhoneMessageThreads**
> PagePhoneMessageThreadProjection getPhoneMessageThreads(phoneNumberId).page(page).size(size).execute();

Get the latest message preview for a thread

List message threads for a phone

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    try {
      PagePhoneMessageThreadProjection result = apiInstance.getPhoneMessageThreads(phoneNumberId)
            .page(page)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneMessageThreads");
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
| **phoneNumberId** | **UUID**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**PagePhoneMessageThreadProjection**](PagePhoneMessageThreadProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneNumber"></a>
# **getPhoneNumber**
> PhoneNumberDto getPhoneNumber(phoneNumberId).execute();

Get a phone number by ID

Get a phone number by ID

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    try {
      PhoneNumberDto result = apiInstance.getPhoneNumber(phoneNumberId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phoneNumberId** | **UUID**|  | |

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
| **200** | OK |  -  |

<a id="getPhoneNumberByName"></a>
# **getPhoneNumberByName**
> PhoneNumberDto getPhoneNumberByName(name).execute();

Get a phone number by name

Get a phone number by name

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
    String name = "name_example"; // String | 
    try {
      PhoneNumberDto result = apiInstance.getPhoneNumberByName(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneNumberByName");
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
| **name** | **String**|  | |

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
| **200** | OK |  -  |

<a id="getPhoneNumberByPhoneNumber"></a>
# **getPhoneNumberByPhoneNumber**
> PhoneNumberDto getPhoneNumberByPhoneNumber(phoneNumber).execute();

Get a phone number by phone number

Get a phone number by phone number

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
    String phoneNumber = "phoneNumber_example"; // String | 
    try {
      PhoneNumberDto result = apiInstance.getPhoneNumberByPhoneNumber(phoneNumber)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneNumberByPhoneNumber");
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
| **phoneNumber** | **String**|  | |

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
| **200** | OK |  -  |

<a id="getPhoneNumbers"></a>
# **getPhoneNumbers**
> PagePhoneNumberProjection getPhoneNumbers().phoneCountry(phoneCountry).page(page).size(size).sort(sort).since(since).before(before).search(search).include(include).favourite(favourite).execute();

Get phone numbers

List phone numbers for account

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
    String phoneCountry = "US"; // String | Optional phone country
    Integer page = 0; // Integer | Optional page index for list pagination
    Integer size = 20; // Integer | Optional page size for list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    String search = "search_example"; // String | Optional search filter
    List<UUID> include = Arrays.asList(); // List<UUID> | Optional phoneIds to include in result
    Boolean favourite = false; // Boolean | Optionally filter results for favourites only
    try {
      PagePhoneNumberProjection result = apiInstance.getPhoneNumbers()
            .phoneCountry(phoneCountry)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .search(search)
            .include(include)
            .favourite(favourite)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phoneCountry** | **String**| Optional phone country | [optional] [enum: US, GB, AU, CA, EE, HK, PL, CH, PT, NL, IL, SE] |
| **page** | **Integer**| Optional page index for list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size for list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **search** | **String**| Optional search filter | [optional] |
| **include** | [**List&lt;UUID&gt;**](UUID)| Optional phoneIds to include in result | [optional] |
| **favourite** | **Boolean**| Optionally filter results for favourites only | [optional] [default to false] |

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
| **200** | OK |  -  |

<a id="getPhonePlans"></a>
# **getPhonePlans**
> List&lt;PhonePlanDto&gt; getPhonePlans().execute();

Get phone plans

Get phone number plans

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
      List<PhonePlanDto> result = apiInstance.getPhonePlans()
            .execute();
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
| **200** | OK |  -  |

<a id="getPhonePlansAvailability"></a>
# **getPhonePlansAvailability**
> PhonePlanAvailability getPhonePlansAvailability().execute();

Get phone plans availability

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
      PhonePlanAvailability result = apiInstance.getPhonePlansAvailability()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhonePlansAvailability");
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

[**PhonePlanAvailability**](PhonePlanAvailability)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSentSmsByPhoneNumber"></a>
# **getSentSmsByPhoneNumber**
> PageSentSmsProjection getSentSmsByPhoneNumber(phoneNumberId).page(page).size(size).sort(sort).since(since).before(before).search(search).execute();

List sent TXT messages for a phone number

Get sent SMS messages for a phone number

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in SMS list pagination
    Integer size = 20; // Integer | Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received before given date time
    String search = "search_example"; // String | Optional search filter
    try {
      PageSentSmsProjection result = apiInstance.getSentSmsByPhoneNumber(phoneNumberId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .search(search)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getSentSmsByPhoneNumber");
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
| **phoneNumberId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in SMS list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Optional filter SMSs received after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter SMSs received before given date time | [optional] |
| **search** | **String**| Optional search filter | [optional] |

### Return type

[**PageSentSmsProjection**](PageSentSmsProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSmsByPhoneNumber"></a>
# **getSmsByPhoneNumber**
> PageSmsProjection getSmsByPhoneNumber(phoneNumberId).page(page).size(size).sort(sort).unreadOnly(unreadOnly).since(since).before(before).search(search).favourite(favourite).execute();

List SMS messages for a phone number

Get SMS messages for a phone number

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in SMS list pagination
    Integer size = 20; // Integer | Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean unreadOnly = false; // Boolean | Optional filter for unread SMS only. All SMS are considered unread until they are viewed in the dashboard or requested directly
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received before given date time
    String search = "search_example"; // String | Optional search filter
    Boolean favourite = false; // Boolean | Optionally filter results for favourites only
    try {
      PageSmsProjection result = apiInstance.getSmsByPhoneNumber(phoneNumberId)
            .page(page)
            .size(size)
            .sort(sort)
            .unreadOnly(unreadOnly)
            .since(since)
            .before(before)
            .search(search)
            .favourite(favourite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getSmsByPhoneNumber");
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
| **phoneNumberId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in SMS list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **unreadOnly** | **Boolean**| Optional filter for unread SMS only. All SMS are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false] |
| **since** | **OffsetDateTime**| Optional filter SMSs received after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter SMSs received before given date time | [optional] |
| **search** | **String**| Optional search filter | [optional] |
| **favourite** | **Boolean**| Optionally filter results for favourites only | [optional] [default to false] |

### Return type

[**PageSmsProjection**](PageSmsProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendSmsFromPhoneNumber"></a>
# **sendSmsFromPhoneNumber**
> SentSmsDto sendSmsFromPhoneNumber(phoneNumberId, smsSendOptions).execute();

Send TXT message from a phone number

Send SMS from a phone number

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    SmsSendOptions smsSendOptions = new SmsSendOptions(); // SmsSendOptions | 
    try {
      SentSmsDto result = apiInstance.sendSmsFromPhoneNumber(phoneNumberId, smsSendOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#sendSmsFromPhoneNumber");
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
| **phoneNumberId** | **UUID**|  | |
| **smsSendOptions** | [**SmsSendOptions**](SmsSendOptions)|  | |

### Return type

[**SentSmsDto**](SentSmsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setConsentStatus"></a>
# **setConsentStatus**
> ConsentStatusDto setConsentStatus(agree).execute();

Set consent status

Give or revoke consent for phone usage

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
    Boolean agree = true; // Boolean | 
    try {
      ConsentStatusDto result = apiInstance.setConsentStatus(agree)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#setConsentStatus");
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
| **agree** | **Boolean**|  | |

### Return type

[**ConsentStatusDto**](ConsentStatusDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setPhoneFavourited"></a>
# **setPhoneFavourited**
> PhoneNumberDto setPhoneFavourited(phoneNumberId, setPhoneFavouritedOptions).execute();

Set phone favourited state

Set and return new favorite state for a phone

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | ID of phone to set favourite state
    SetPhoneFavouritedOptions setPhoneFavouritedOptions = new SetPhoneFavouritedOptions(); // SetPhoneFavouritedOptions | 
    try {
      PhoneNumberDto result = apiInstance.setPhoneFavourited(phoneNumberId, setPhoneFavouritedOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#setPhoneFavourited");
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
| **phoneNumberId** | **UUID**| ID of phone to set favourite state | |
| **setPhoneFavouritedOptions** | [**SetPhoneFavouritedOptions**](SetPhoneFavouritedOptions)|  | |

### Return type

[**PhoneNumberDto**](PhoneNumberDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testPhoneNumberSendSms"></a>
# **testPhoneNumberSendSms**
> testPhoneNumberSendSms(phoneNumberId, testPhoneNumberOptions).xTestId(xTestId).execute();

Test sending an SMS to a number

Test a phone number by sending an SMS to it

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    TestPhoneNumberOptions testPhoneNumberOptions = new TestPhoneNumberOptions(); // TestPhoneNumberOptions | 
    String xTestId = "xTestId_example"; // String | 
    try {
      apiInstance.testPhoneNumberSendSms(phoneNumberId, testPhoneNumberOptions)
            .xTestId(xTestId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#testPhoneNumberSendSms");
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
| **phoneNumberId** | **UUID**|  | |
| **testPhoneNumberOptions** | [**TestPhoneNumberOptions**](TestPhoneNumberOptions)|  | |
| **xTestId** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updatePhoneNumber"></a>
# **updatePhoneNumber**
> PhoneNumberDto updatePhoneNumber(phoneNumberId, updatePhoneNumberOptions).execute();

Update a phone number

Set field for phone number

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | ID of phone to set favourite state
    UpdatePhoneNumberOptions updatePhoneNumberOptions = new UpdatePhoneNumberOptions(); // UpdatePhoneNumberOptions | 
    try {
      PhoneNumberDto result = apiInstance.updatePhoneNumber(phoneNumberId, updatePhoneNumberOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#updatePhoneNumber");
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
| **phoneNumberId** | **UUID**| ID of phone to set favourite state | |
| **updatePhoneNumberOptions** | [**UpdatePhoneNumberOptions**](UpdatePhoneNumberOptions)|  | |

### Return type

[**PhoneNumberDto**](PhoneNumberDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="validatePhoneNumber"></a>
# **validatePhoneNumber**
> PhoneNumberValidationDto validatePhoneNumber(validatePhoneNumberOptions).execute();

Verify validity of a phone number

Validate a phone number

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
    ValidatePhoneNumberOptions validatePhoneNumberOptions = new ValidatePhoneNumberOptions(); // ValidatePhoneNumberOptions | 
    try {
      PhoneNumberValidationDto result = apiInstance.validatePhoneNumber(validatePhoneNumberOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#validatePhoneNumber");
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
| **validatePhoneNumberOptions** | [**ValidatePhoneNumberOptions**](ValidatePhoneNumberOptions)|  | |

### Return type

[**PhoneNumberValidationDto**](PhoneNumberValidationDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

