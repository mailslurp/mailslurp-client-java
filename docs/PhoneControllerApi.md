# PhoneControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acquirePhonePoolLease**](PhoneControllerApi#acquirePhonePoolLease) | **POST** /phone/pools/{poolId}/leases | Acquire phone pool lease |
| [**addAllPhoneNumbersToPhonePool**](PhoneControllerApi#addAllPhoneNumbersToPhonePool) | **POST** /phone/pools/{poolId}/numbers/add-all | Add all phone numbers to phone pool |
| [**addPhoneNumbersToPhonePool**](PhoneControllerApi#addPhoneNumbersToPhonePool) | **POST** /phone/pools/{poolId}/numbers | Add phone numbers to phone pool |
| [**createEmergencyAddress**](PhoneControllerApi#createEmergencyAddress) | **POST** /phone/emergency-addresses | Create an emergency address |
| [**createPhoneNumber**](PhoneControllerApi#createPhoneNumber) | **POST** /phone | Add phone number to your account. Only works if you have already added a plan and an initial phone number in your account and acknowledged the pricing and terms of service by enabling API phone creation. |
| [**createPhonePool**](PhoneControllerApi#createPhonePool) | **POST** /phone/pools | Create phone pool |
| [**createPhoneProvisioningJob**](PhoneControllerApi#createPhoneProvisioningJob) | **POST** /phone/provisioning/jobs | Create a phone provisioning job |
| [**deleteAllPhoneNumber**](PhoneControllerApi#deleteAllPhoneNumber) | **DELETE** /phone/numbers | Delete all phone numbers |
| [**deleteEmergencyAddress**](PhoneControllerApi#deleteEmergencyAddress) | **DELETE** /phone/emergency-addresses/{addressId} | Delete an emergency address |
| [**deletePhoneMessageThreadItems**](PhoneControllerApi#deletePhoneMessageThreadItems) | **DELETE** /phone/numbers/{phoneNumberId}/message-threads/{otherNumber} | Delete messages in a phone thread |
| [**deletePhoneNumber**](PhoneControllerApi#deletePhoneNumber) | **DELETE** /phone/numbers/{phoneNumberId} | Delete a phone number |
| [**deletePhonePool**](PhoneControllerApi#deletePhonePool) | **DELETE** /phone/pools/{poolId} | Delete phone pool |
| [**getAllPhoneMessageThreads**](PhoneControllerApi#getAllPhoneMessageThreads) | **GET** /phone/numbers/message-threads | Get the latest messages for all phones |
| [**getAllPhoneNumberReleases**](PhoneControllerApi#getAllPhoneNumberReleases) | **GET** /phone/releases | Get all phone number releases |
| [**getConsentStatus**](PhoneControllerApi#getConsentStatus) | **GET** /phone/consent | Get consent status |
| [**getEmergencyAddress**](PhoneControllerApi#getEmergencyAddress) | **GET** /phone/emergency-addresses/{addressId} | Get an emergency address |
| [**getEmergencyAddresses**](PhoneControllerApi#getEmergencyAddresses) | **GET** /phone/emergency-addresses | Get emergency addresses |
| [**getOrCreatePhonePool**](PhoneControllerApi#getOrCreatePhonePool) | **POST** /phone/pools/get-or-create | Get or create phone pool |
| [**getPhoneMessageThreadItems**](PhoneControllerApi#getPhoneMessageThreadItems) | **GET** /phone/numbers/{phoneNumberId}/message-threads/{otherNumber} | Get messages in a phone thread |
| [**getPhoneMessageThreads**](PhoneControllerApi#getPhoneMessageThreads) | **GET** /phone/numbers/{phoneNumberId}/message-threads | Get the latest message preview for a thread |
| [**getPhoneNumber**](PhoneControllerApi#getPhoneNumber) | **GET** /phone/numbers/{phoneNumberId} | Get a phone number by ID |
| [**getPhoneNumberByName**](PhoneControllerApi#getPhoneNumberByName) | **GET** /phone/numbers/by-name | Get a phone number by name |
| [**getPhoneNumberByPhoneNumber**](PhoneControllerApi#getPhoneNumberByPhoneNumber) | **GET** /phone/numbers/by-phone-number | Get a phone number by phone number |
| [**getPhoneNumberLineTypeIntelligence**](PhoneControllerApi#getPhoneNumberLineTypeIntelligence) | **POST** /phone/validate/line-type-intelligence | Get line type intelligence for a phone number |
| [**getPhoneNumberRelease**](PhoneControllerApi#getPhoneNumberRelease) | **GET** /phone/releases/{releaseId} | Get phone number release |
| [**getPhoneNumbers**](PhoneControllerApi#getPhoneNumbers) | **GET** /phone/numbers | Get phone numbers |
| [**getPhonePlans**](PhoneControllerApi#getPhonePlans) | **GET** /phone/plans | Get phone plans |
| [**getPhonePlansAvailability**](PhoneControllerApi#getPhonePlansAvailability) | **GET** /phone/plans/availability | Get phone plans availability |
| [**getPhonePool**](PhoneControllerApi#getPhonePool) | **GET** /phone/pools/{poolId} | Get phone pool |
| [**getPhonePoolByName**](PhoneControllerApi#getPhonePoolByName) | **GET** /phone/pools/by-name | Get phone pool by name |
| [**getPhonePools**](PhoneControllerApi#getPhonePools) | **GET** /phone/pools | Get phone pools |
| [**getPhoneProvisioningCapabilities**](PhoneControllerApi#getPhoneProvisioningCapabilities) | **GET** /phone/provisioning/capabilities | Get phone provisioning capabilities |
| [**getPhoneProvisioningJob**](PhoneControllerApi#getPhoneProvisioningJob) | **GET** /phone/provisioning/jobs/{jobId} | Get phone provisioning job |
| [**getPhoneSmsPrepaidCredit**](PhoneControllerApi#getPhoneSmsPrepaidCredit) | **GET** /phone/sms-prepaid-credits/{creditId} | Get SMS prepaid credit |
| [**getPhoneSmsPrepaidCredits**](PhoneControllerApi#getPhoneSmsPrepaidCredits) | **GET** /phone/sms-prepaid-credits | Get SMS prepaid credits |
| [**getPhoneSummary**](PhoneControllerApi#getPhoneSummary) | **GET** /phone/summary | Get phone summary |
| [**getSentSmsByPhoneNumber**](PhoneControllerApi#getSentSmsByPhoneNumber) | **GET** /phone/numbers/{phoneNumberId}/sms-sent | List sent TXT messages for a phone number |
| [**getSmsByPhoneNumber**](PhoneControllerApi#getSmsByPhoneNumber) | **GET** /phone/numbers/{phoneNumberId}/sms | List SMS messages for a phone number |
| [**reassignPhoneNumberRelease**](PhoneControllerApi#reassignPhoneNumberRelease) | **GET** /phone/releases/{releaseId}/reassign | Reassign phone number release |
| [**releasePhonePoolLease**](PhoneControllerApi#releasePhonePoolLease) | **DELETE** /phone/pools/{poolId}/leases/{leaseId} | Release phone pool lease |
| [**removePhoneNumberFromPhonePool**](PhoneControllerApi#removePhoneNumberFromPhonePool) | **DELETE** /phone/pools/{poolId}/numbers/{phoneNumberId} | Remove phone number from phone pool |
| [**searchAvailablePhoneNumbers**](PhoneControllerApi#searchAvailablePhoneNumbers) | **POST** /phone/provisioning/search | Search available phone numbers |
| [**sendSmsFromPhoneNumber**](PhoneControllerApi#sendSmsFromPhoneNumber) | **POST** /phone/numbers/{phoneNumberId}/sms | Send TXT message from a phone number |
| [**setConsentStatus**](PhoneControllerApi#setConsentStatus) | **POST** /phone/consent | Set consent status |
| [**setPhoneFavourited**](PhoneControllerApi#setPhoneFavourited) | **PUT** /phone/numbers/{phoneNumberId}/favourite | Set phone favourited state |
| [**testPhoneNumberSendSms**](PhoneControllerApi#testPhoneNumberSendSms) | **POST** /phone/numbers/{phoneNumberId}/test | Test sending an SMS to a number |
| [**updatePhoneNumber**](PhoneControllerApi#updatePhoneNumber) | **PUT** /phone/numbers/{phoneNumberId} | Update a phone number |
| [**updatePhonePool**](PhoneControllerApi#updatePhonePool) | **PUT** /phone/pools/{poolId} | Update phone pool |
| [**validatePhoneNumber**](PhoneControllerApi#validatePhoneNumber) | **POST** /phone/validate | Verify validity of a phone number |


<a id="acquirePhonePoolLease"></a>
# **acquirePhonePoolLease**
> PhonePoolLeaseDto acquirePhonePoolLease(poolId, acquirePhonePoolLeaseOptions).execute();

Acquire phone pool lease

Acquire an available phone number from the pool and mark it leased

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    AcquirePhonePoolLeaseOptions acquirePhonePoolLeaseOptions = new AcquirePhonePoolLeaseOptions(); // AcquirePhonePoolLeaseOptions | 
    try {
      PhonePoolLeaseDto result = apiInstance.acquirePhonePoolLease(poolId, acquirePhonePoolLeaseOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#acquirePhonePoolLease");
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
| **poolId** | **UUID**|  | |
| **acquirePhonePoolLeaseOptions** | [**AcquirePhonePoolLeaseOptions**](AcquirePhonePoolLeaseOptions)|  | |

### Return type

[**PhonePoolLeaseDto**](PhonePoolLeaseDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="addAllPhoneNumbersToPhonePool"></a>
# **addAllPhoneNumbersToPhonePool**
> PhonePoolDetailDto addAllPhoneNumbersToPhonePool(poolId).execute();

Add all phone numbers to phone pool

Add all active owned phone numbers to a pool

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    try {
      PhonePoolDetailDto result = apiInstance.addAllPhoneNumbersToPhonePool(poolId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#addAllPhoneNumbersToPhonePool");
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
| **poolId** | **UUID**|  | |

### Return type

[**PhonePoolDetailDto**](PhonePoolDetailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="addPhoneNumbersToPhonePool"></a>
# **addPhoneNumbersToPhonePool**
> PhonePoolDetailDto addPhoneNumbersToPhonePool(poolId, addPhonePoolNumbersOptions).execute();

Add phone numbers to phone pool

Add one or more owned phone numbers to a pool

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    AddPhonePoolNumbersOptions addPhonePoolNumbersOptions = new AddPhonePoolNumbersOptions(); // AddPhonePoolNumbersOptions | 
    try {
      PhonePoolDetailDto result = apiInstance.addPhoneNumbersToPhonePool(poolId, addPhonePoolNumbersOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#addPhoneNumbersToPhonePool");
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
| **poolId** | **UUID**|  | |
| **addPhonePoolNumbersOptions** | [**AddPhonePoolNumbersOptions**](AddPhonePoolNumbersOptions)|  | |

### Return type

[**PhonePoolDetailDto**](PhonePoolDetailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

<a id="createPhonePool"></a>
# **createPhonePool**
> PhonePoolDetailDto createPhonePool(createPhonePoolOptions).execute();

Create phone pool

Create a reusable pool of phone numbers for coordinated leasing

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
    CreatePhonePoolOptions createPhonePoolOptions = new CreatePhonePoolOptions(); // CreatePhonePoolOptions | 
    try {
      PhonePoolDetailDto result = apiInstance.createPhonePool(createPhonePoolOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#createPhonePool");
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
| **createPhonePoolOptions** | [**CreatePhonePoolOptions**](CreatePhonePoolOptions)|  | |

### Return type

[**PhonePoolDetailDto**](PhonePoolDetailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createPhoneProvisioningJob"></a>
# **createPhoneProvisioningJob**
> PhoneProvisioningJobDto createPhoneProvisioningJob(createPhoneProvisioningJobOptions).execute();

Create a phone provisioning job

Create an advanced phone provisioning job from shortlisted numbers

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
    CreatePhoneProvisioningJobOptions createPhoneProvisioningJobOptions = new CreatePhoneProvisioningJobOptions(); // CreatePhoneProvisioningJobOptions | 
    try {
      PhoneProvisioningJobDto result = apiInstance.createPhoneProvisioningJob(createPhoneProvisioningJobOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#createPhoneProvisioningJob");
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
| **createPhoneProvisioningJobOptions** | [**CreatePhoneProvisioningJobOptions**](CreatePhoneProvisioningJobOptions)|  | |

### Return type

[**PhoneProvisioningJobDto**](PhoneProvisioningJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAllPhoneNumber"></a>
# **deleteAllPhoneNumber**
> deleteAllPhoneNumber().execute();

Delete all phone numbers

Remove all phone number from account

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
      apiInstance.deleteAllPhoneNumber()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#deleteAllPhoneNumber");
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

<a id="deletePhoneMessageThreadItems"></a>
# **deletePhoneMessageThreadItems**
> EmptyResponseDto deletePhoneMessageThreadItems(phoneNumberId, otherNumber).execute();

Delete messages in a phone thread

Delete all messages in an SMS thread

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
    try {
      EmptyResponseDto result = apiInstance.deletePhoneMessageThreadItems(phoneNumberId, otherNumber)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#deletePhoneMessageThreadItems");
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
| **204** | No Content |  -  |

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

<a id="deletePhonePool"></a>
# **deletePhonePool**
> deletePhonePool(poolId).execute();

Delete phone pool

Delete a phone pool and release any active leases from that pool

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deletePhonePool(poolId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#deletePhonePool");
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
| **poolId** | **UUID**|  | |

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

<a id="getAllPhoneNumberReleases"></a>
# **getAllPhoneNumberReleases**
> PagePhoneNumberReleaseProjection getAllPhoneNumberReleases().page(page).size(size).sort(sort).execute();

Get all phone number releases

List released or deleted phone numbers

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
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PagePhoneNumberReleaseProjection result = apiInstance.getAllPhoneNumberReleases()
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getAllPhoneNumberReleases");
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
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**PagePhoneNumberReleaseProjection**](PagePhoneNumberReleaseProjection)

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

<a id="getOrCreatePhonePool"></a>
# **getOrCreatePhonePool**
> PhonePoolDetailDto getOrCreatePhonePool(getOrCreatePhonePoolOptions).execute();

Get or create phone pool

Get a phone pool by name or create it if it does not exist

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
    GetOrCreatePhonePoolOptions getOrCreatePhonePoolOptions = new GetOrCreatePhonePoolOptions(); // GetOrCreatePhonePoolOptions | 
    try {
      PhonePoolDetailDto result = apiInstance.getOrCreatePhonePool(getOrCreatePhonePoolOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getOrCreatePhonePool");
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
| **getOrCreatePhonePoolOptions** | [**GetOrCreatePhonePoolOptions**](GetOrCreatePhonePoolOptions)|  | |

### Return type

[**PhonePoolDetailDto**](PhonePoolDetailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="getPhoneNumberLineTypeIntelligence"></a>
# **getPhoneNumberLineTypeIntelligence**
> PhoneNumberLineTypeLookupDto getPhoneNumberLineTypeIntelligence(validatePhoneNumberOptions).execute();

Get line type intelligence for a phone number

Lookup line type intelligence for a phone number

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
      PhoneNumberLineTypeLookupDto result = apiInstance.getPhoneNumberLineTypeIntelligence(validatePhoneNumberOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneNumberLineTypeIntelligence");
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

[**PhoneNumberLineTypeLookupDto**](PhoneNumberLineTypeLookupDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneNumberRelease"></a>
# **getPhoneNumberRelease**
> PhoneNumberReleaseProjection getPhoneNumberRelease(releaseId).execute();

Get phone number release

Get a released or deleted phone numbers

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
    UUID releaseId = UUID.randomUUID(); // UUID | 
    try {
      PhoneNumberReleaseProjection result = apiInstance.getPhoneNumberRelease(releaseId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneNumberRelease");
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
| **releaseId** | **UUID**|  | |

### Return type

[**PhoneNumberReleaseProjection**](PhoneNumberReleaseProjection)

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
> PagePhoneNumberProjection getPhoneNumbers().phoneCountry(phoneCountry).lineType(lineType).carrierName(carrierName).mobileCountryCode(mobileCountryCode).mobileNetworkCode(mobileNetworkCode).providerLabel(providerLabel).page(page).size(size).sort(sort).since(since).before(before).search(search).include(include).favourite(favourite).execute();

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
    String lineType = "lineType_example"; // String | Optional line type filter
    String carrierName = "carrierName_example"; // String | Optional carrier name filter
    String mobileCountryCode = "mobileCountryCode_example"; // String | Optional mobile country code filter
    String mobileNetworkCode = "mobileNetworkCode_example"; // String | Optional mobile network code filter
    String providerLabel = "providerLabel_example"; // String | Optional provider label filter such as T1 or T2
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
            .lineType(lineType)
            .carrierName(carrierName)
            .mobileCountryCode(mobileCountryCode)
            .mobileNetworkCode(mobileNetworkCode)
            .providerLabel(providerLabel)
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
| **phoneCountry** | **String**| Optional phone country | [optional] [enum: US, GB, AU, CA, EE, HK, PL, PT, NL, IL, FI, SE] |
| **lineType** | **String**| Optional line type filter | [optional] |
| **carrierName** | **String**| Optional carrier name filter | [optional] |
| **mobileCountryCode** | **String**| Optional mobile country code filter | [optional] |
| **mobileNetworkCode** | **String**| Optional mobile network code filter | [optional] |
| **providerLabel** | **String**| Optional provider label filter such as T1 or T2 | [optional] |
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

<a id="getPhonePool"></a>
# **getPhonePool**
> PhonePoolDetailDto getPhonePool(poolId).execute();

Get phone pool

Get phone pool details by ID

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    try {
      PhonePoolDetailDto result = apiInstance.getPhonePool(poolId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhonePool");
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
| **poolId** | **UUID**|  | |

### Return type

[**PhonePoolDetailDto**](PhonePoolDetailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhonePoolByName"></a>
# **getPhonePoolByName**
> PhonePoolDetailDto getPhonePoolByName(name).execute();

Get phone pool by name

Get phone pool details by name

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
      PhonePoolDetailDto result = apiInstance.getPhonePoolByName(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhonePoolByName");
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

[**PhonePoolDetailDto**](PhonePoolDetailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhonePools"></a>
# **getPhonePools**
> List&lt;PhonePoolDto&gt; getPhonePools().execute();

Get phone pools

List phone pools for the authenticated user

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
      List<PhonePoolDto> result = apiInstance.getPhonePools()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhonePools");
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

[**List&lt;PhonePoolDto&gt;**](PhonePoolDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneProvisioningCapabilities"></a>
# **getPhoneProvisioningCapabilities**
> PhoneProviderCapabilitiesResult getPhoneProvisioningCapabilities(phoneCountry).providerLabel(providerLabel).execute();

Get phone provisioning capabilities

Get supported provider-country variant capabilities for advanced provisioning

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
    String phoneCountry = "US"; // String | 
    String providerLabel = "providerLabel_example"; // String | 
    try {
      PhoneProviderCapabilitiesResult result = apiInstance.getPhoneProvisioningCapabilities(phoneCountry)
            .providerLabel(providerLabel)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneProvisioningCapabilities");
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
| **phoneCountry** | **String**|  | [enum: US, GB, AU, CA, EE, HK, PL, PT, NL, IL, FI, SE] |
| **providerLabel** | **String**|  | [optional] |

### Return type

[**PhoneProviderCapabilitiesResult**](PhoneProviderCapabilitiesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneProvisioningJob"></a>
# **getPhoneProvisioningJob**
> PhoneProvisioningJobDto getPhoneProvisioningJob(jobId).execute();

Get phone provisioning job

Get advanced phone provisioning job status

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
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      PhoneProvisioningJobDto result = apiInstance.getPhoneProvisioningJob(jobId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneProvisioningJob");
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
| **jobId** | **UUID**|  | |

### Return type

[**PhoneProvisioningJobDto**](PhoneProvisioningJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneSmsPrepaidCredit"></a>
# **getPhoneSmsPrepaidCredit**
> PhoneSmsPrepaidCreditDto getPhoneSmsPrepaidCredit(creditId).execute();

Get SMS prepaid credit

Get a specific SMS prepaid credit balance for the authenticated account

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
    UUID creditId = UUID.randomUUID(); // UUID | 
    try {
      PhoneSmsPrepaidCreditDto result = apiInstance.getPhoneSmsPrepaidCredit(creditId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneSmsPrepaidCredit");
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
| **creditId** | **UUID**|  | |

### Return type

[**PhoneSmsPrepaidCreditDto**](PhoneSmsPrepaidCreditDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneSmsPrepaidCredits"></a>
# **getPhoneSmsPrepaidCredits**
> PhoneSmsPrepaidCreditsDto getPhoneSmsPrepaidCredits().execute();

Get SMS prepaid credits

List SMS prepaid credits for the authenticated account

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
      PhoneSmsPrepaidCreditsDto result = apiInstance.getPhoneSmsPrepaidCredits()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneSmsPrepaidCredits");
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

[**PhoneSmsPrepaidCreditsDto**](PhoneSmsPrepaidCreditsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPhoneSummary"></a>
# **getPhoneSummary**
> PhoneSummaryDto getPhoneSummary().execute();

Get phone summary

Get overview of assigned phones

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
      PhoneSummaryDto result = apiInstance.getPhoneSummary()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#getPhoneSummary");
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

[**PhoneSummaryDto**](PhoneSummaryDto)

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

<a id="reassignPhoneNumberRelease"></a>
# **reassignPhoneNumberRelease**
> PhoneNumberDto reassignPhoneNumberRelease(releaseId).execute();

Reassign phone number release

Reassign phone number that was released or deleted

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
    UUID releaseId = UUID.randomUUID(); // UUID | 
    try {
      PhoneNumberDto result = apiInstance.reassignPhoneNumberRelease(releaseId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#reassignPhoneNumberRelease");
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
| **releaseId** | **UUID**|  | |

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

<a id="releasePhonePoolLease"></a>
# **releasePhonePoolLease**
> releasePhonePoolLease(poolId, leaseId).execute();

Release phone pool lease

Release an active phone pool lease

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    UUID leaseId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.releasePhonePoolLease(poolId, leaseId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#releasePhonePoolLease");
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
| **poolId** | **UUID**|  | |
| **leaseId** | **UUID**|  | |

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

<a id="removePhoneNumberFromPhonePool"></a>
# **removePhoneNumberFromPhonePool**
> removePhoneNumberFromPhonePool(poolId, phoneNumberId).execute();

Remove phone number from phone pool

Remove a phone number from a pool. If the number is leased from this pool the lease is released.

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.removePhoneNumberFromPhonePool(poolId, phoneNumberId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#removePhoneNumberFromPhonePool");
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
| **poolId** | **UUID**|  | |
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

<a id="searchAvailablePhoneNumbers"></a>
# **searchAvailablePhoneNumbers**
> AvailablePhoneNumbersResult searchAvailablePhoneNumbers(searchAvailablePhoneNumbersOptions).execute();

Search available phone numbers

Search available numbers for advanced provisioning

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
    SearchAvailablePhoneNumbersOptions searchAvailablePhoneNumbersOptions = new SearchAvailablePhoneNumbersOptions(); // SearchAvailablePhoneNumbersOptions | 
    try {
      AvailablePhoneNumbersResult result = apiInstance.searchAvailablePhoneNumbers(searchAvailablePhoneNumbersOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#searchAvailablePhoneNumbers");
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
| **searchAvailablePhoneNumbersOptions** | [**SearchAvailablePhoneNumbersOptions**](SearchAvailablePhoneNumbersOptions)|  | |

### Return type

[**AvailablePhoneNumbersResult**](AvailablePhoneNumbersResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
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

Test a phone number by sending an SMS to it. NOTE this is only for internal use to check that a phone number is working. For end-to-end phone testing see https://docs.mailslurp.com/txt-sms/

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

<a id="updatePhonePool"></a>
# **updatePhonePool**
> PhonePoolDetailDto updatePhonePool(poolId, updatePhonePoolOptions).execute();

Update phone pool

Update phone pool metadata such as name or description

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
    UUID poolId = UUID.randomUUID(); // UUID | 
    UpdatePhonePoolOptions updatePhonePoolOptions = new UpdatePhonePoolOptions(); // UpdatePhonePoolOptions | 
    try {
      PhonePoolDetailDto result = apiInstance.updatePhonePool(poolId, updatePhonePoolOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PhoneControllerApi#updatePhonePool");
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
| **poolId** | **UUID**|  | |
| **updatePhonePoolOptions** | [**UpdatePhonePoolOptions**](UpdatePhonePoolOptions)|  | |

### Return type

[**PhonePoolDetailDto**](PhonePoolDetailDto)

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

