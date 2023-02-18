# SmsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSmsMessage**](SmsControllerApi#deleteSmsMessage) | **DELETE** /sms/{smsId} | Delete SMS message.
[**deleteSmsMessages**](SmsControllerApi#deleteSmsMessages) | **DELETE** /sms | Delete all SMS messages
[**getSmsMessage**](SmsControllerApi#getSmsMessage) | **GET** /sms/{smsId} | Get SMS content including body. Expects SMS to exist by ID. For SMS that may not have arrived yet use the WaitForController.
[**getSmsMessagesPaginated**](SmsControllerApi#getSmsMessagesPaginated) | **GET** /sms | Get all SMS messages in all phone numbers in paginated form. .


<a name="deleteSmsMessage"></a>
# **deleteSmsMessage**
> deleteSmsMessage(smsId)

Delete SMS message.

Delete an SMS message

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SmsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SmsControllerApi apiInstance = new SmsControllerApi(defaultClient);
    UUID smsId = new UUID(); // UUID | 
    try {
      apiInstance.deleteSmsMessage(smsId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#deleteSmsMessage");
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
 **smsId** | [**UUID**]()|  |

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

<a name="deleteSmsMessages"></a>
# **deleteSmsMessages**
> deleteSmsMessages(phoneNumberId)

Delete all SMS messages

Delete all SMS messages or all messages for a given phone number

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SmsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SmsControllerApi apiInstance = new SmsControllerApi(defaultClient);
    UUID phoneNumberId = new UUID(); // UUID | 
    try {
      apiInstance.deleteSmsMessages(phoneNumberId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#deleteSmsMessages");
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
 **phoneNumberId** | [**UUID**]()|  | [optional]

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

<a name="getSmsMessage"></a>
# **getSmsMessage**
> SmsDto getSmsMessage(smsId)

Get SMS content including body. Expects SMS to exist by ID. For SMS that may not have arrived yet use the WaitForController.

Returns a SMS summary object with content.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SmsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SmsControllerApi apiInstance = new SmsControllerApi(defaultClient);
    UUID smsId = new UUID(); // UUID | 
    try {
      SmsDto result = apiInstance.getSmsMessage(smsId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getSmsMessage");
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
 **smsId** | [**UUID**]()|  |

### Return type

[**SmsDto**](SmsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getSmsMessagesPaginated"></a>
# **getSmsMessagesPaginated**
> PageSmsProjection getSmsMessagesPaginated(phoneNumber, page, size, sort, unreadOnly, since, before)

Get all SMS messages in all phone numbers in paginated form. .

By default returns all SMS messages across all phone numbers sorted by ascending created at date. Responses are paginated. You can restrict results to a list of phone number IDs. You can also filter out read messages

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.SmsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    SmsControllerApi apiInstance = new SmsControllerApi(defaultClient);
    UUID phoneNumber = new UUID(); // UUID | Optional receiving phone number to filter SMS messages for
    Integer page = 0; // Integer | Optional page index in SMS list pagination
    Integer size = 20; // Integer | Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean unreadOnly = false; // Boolean | Optional filter for unread SMS only. All SMS are considered unread until they are viewed in the dashboard or requested directly
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter SMSs received after given date time
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter SMSs received before given date time
    try {
      PageSmsProjection result = apiInstance.getSmsMessagesPaginated(phoneNumber, page, size, sort, unreadOnly, since, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getSmsMessagesPaginated");
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
 **phoneNumber** | [**UUID**]()| Optional receiving phone number to filter SMS messages for | [optional]
 **page** | **Integer**| Optional page index in SMS list pagination | [optional] [default to 0]
 **size** | **Integer**| Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **unreadOnly** | **Boolean**| Optional filter for unread SMS only. All SMS are considered unread until they are viewed in the dashboard or requested directly | [optional] [default to false]
 **since** | **OffsetDateTime**| Optional filter SMSs received after given date time | [optional]
 **before** | **OffsetDateTime**| Optional filter SMSs received before given date time | [optional]

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
**200** | OK |  -  |

