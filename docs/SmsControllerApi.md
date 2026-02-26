# SmsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteSentSmsMessage**](SmsControllerApi#deleteSentSmsMessage) | **DELETE** /sms/sent/{sentSmsId} | Delete sent SMS message. |
| [**deleteSentSmsMessages**](SmsControllerApi#deleteSentSmsMessages) | **DELETE** /sms/sent | Delete all sent SMS messages |
| [**deleteSmsMessage**](SmsControllerApi#deleteSmsMessage) | **DELETE** /sms/{smsId} | Delete SMS message. |
| [**deleteSmsMessages**](SmsControllerApi#deleteSmsMessages) | **DELETE** /sms | Delete all SMS messages |
| [**getAllSmsMessages**](SmsControllerApi#getAllSmsMessages) | **GET** /sms |  |
| [**getReplyForSmsMessage**](SmsControllerApi#getReplyForSmsMessage) | **GET** /sms/{smsId}/reply | Get reply for an SMS message |
| [**getSentSmsCount**](SmsControllerApi#getSentSmsCount) | **GET** /sms/sent/count | Get sent SMS count |
| [**getSentSmsMessage**](SmsControllerApi#getSentSmsMessage) | **GET** /sms/sent/{sentSmsId} | Get sent SMS content including body. Expects sent SMS to exist by ID. |
| [**getSentSmsMessagesPaginated**](SmsControllerApi#getSentSmsMessagesPaginated) | **GET** /sms/sent | Get all SMS messages in all phone numbers in paginated form. . |
| [**getSmsCount**](SmsControllerApi#getSmsCount) | **GET** /sms/count | Get SMS count |
| [**getSmsMessage**](SmsControllerApi#getSmsMessage) | **GET** /sms/{smsId} | Get SMS content including body. Expects SMS to exist by ID. For SMS that may not have arrived yet use the WaitForController. |
| [**getUnreadSmsCount**](SmsControllerApi#getUnreadSmsCount) | **GET** /sms/unreadCount | Get unread SMS count |
| [**replyToSmsMessage**](SmsControllerApi#replyToSmsMessage) | **POST** /sms/{smsId}/reply | Send a reply to a received SMS message. Replies are sent from the receiving number. |
| [**sendSms**](SmsControllerApi#sendSms) | **POST** /sms/send |  |
| [**setSmsFavourited**](SmsControllerApi#setSmsFavourited) | **PUT** /sms/{smsId}/favourite |  |


<a id="deleteSentSmsMessage"></a>
# **deleteSentSmsMessage**
> deleteSentSmsMessage(sentSmsId).execute();

Delete sent SMS message.

Delete a sent SMS message

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
    UUID sentSmsId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSentSmsMessage(sentSmsId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#deleteSentSmsMessage");
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
| **sentSmsId** | **UUID**|  | |

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

<a id="deleteSentSmsMessages"></a>
# **deleteSentSmsMessages**
> deleteSentSmsMessages().phoneNumberId(phoneNumberId).execute();

Delete all sent SMS messages

Delete all sent SMS messages or all messages for a given phone number

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSentSmsMessages()
            .phoneNumberId(phoneNumberId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#deleteSentSmsMessages");
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
| **phoneNumberId** | **UUID**|  | [optional] |

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

<a id="deleteSmsMessage"></a>
# **deleteSmsMessage**
> deleteSmsMessage(smsId).execute();

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
    UUID smsId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSmsMessage(smsId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **smsId** | **UUID**|  | |

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

<a id="deleteSmsMessages"></a>
# **deleteSmsMessages**
> deleteSmsMessages().phoneNumberId(phoneNumberId).execute();

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
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSmsMessages()
            .phoneNumberId(phoneNumberId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **phoneNumberId** | **UUID**|  | [optional] |

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

<a id="getAllSmsMessages"></a>
# **getAllSmsMessages**
> PageSmsProjection getAllSmsMessages().phoneNumber(phoneNumber).page(page).size(size).sort(sort).since(since).before(before).search(search).favourite(favourite).include(include).execute();



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
    UUID phoneNumber = UUID.randomUUID(); // UUID | Optional receiving phone number to filter SMS messages for
    Integer page = 0; // Integer | Optional page index in SMS list pagination
    Integer size = 20; // Integer | Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received before given date time
    String search = "search_example"; // String | Optional search filter
    Boolean favourite = false; // Boolean | Optionally filter results for favourites only
    List<UUID> include = Arrays.asList(); // List<UUID> | Optional list of IDs to include in result
    try {
      PageSmsProjection result = apiInstance.getAllSmsMessages()
            .phoneNumber(phoneNumber)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .search(search)
            .favourite(favourite)
            .include(include)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getAllSmsMessages");
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
| **phoneNumber** | **UUID**| Optional receiving phone number to filter SMS messages for | [optional] |
| **page** | **Integer**| Optional page index in SMS list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Optional filter SMSs received after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter SMSs received before given date time | [optional] |
| **search** | **String**| Optional search filter | [optional] |
| **favourite** | **Boolean**| Optionally filter results for favourites only | [optional] [default to false] |
| **include** | [**List&lt;UUID&gt;**](UUID)| Optional list of IDs to include in result | [optional] |

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

<a id="getReplyForSmsMessage"></a>
# **getReplyForSmsMessage**
> ReplyForSms getReplyForSmsMessage(smsId).execute();

Get reply for an SMS message

Get reply for an SMS message.

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
    UUID smsId = UUID.randomUUID(); // UUID | 
    try {
      ReplyForSms result = apiInstance.getReplyForSmsMessage(smsId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getReplyForSmsMessage");
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
| **smsId** | **UUID**|  | |

### Return type

[**ReplyForSms**](ReplyForSms)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSentSmsCount"></a>
# **getSentSmsCount**
> CountDto getSentSmsCount().execute();

Get sent SMS count

Get number of sent SMS

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
    try {
      CountDto result = apiInstance.getSentSmsCount()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getSentSmsCount");
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

[**CountDto**](CountDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSentSmsMessage"></a>
# **getSentSmsMessage**
> SentSmsDto getSentSmsMessage(sentSmsId).execute();

Get sent SMS content including body. Expects sent SMS to exist by ID.

Returns an SMS summary object with content.

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
    UUID sentSmsId = UUID.randomUUID(); // UUID | 
    try {
      SentSmsDto result = apiInstance.getSentSmsMessage(sentSmsId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getSentSmsMessage");
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
| **sentSmsId** | **UUID**|  | |

### Return type

[**SentSmsDto**](SentSmsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSentSmsMessagesPaginated"></a>
# **getSentSmsMessagesPaginated**
> PageSentSmsProjection getSentSmsMessagesPaginated().phoneNumber(phoneNumber).page(page).size(size).sort(sort).since(since).before(before).search(search).execute();

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
    UUID phoneNumber = UUID.randomUUID(); // UUID | Optional phone number to filter sent SMS messages for
    Integer page = 0; // Integer | Optional page index in SMS list pagination
    Integer size = 20; // Integer | Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter SMSs received before given date time
    String search = "search_example"; // String | Optional search filter
    try {
      PageSentSmsProjection result = apiInstance.getSentSmsMessagesPaginated()
            .phoneNumber(phoneNumber)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .search(search)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getSentSmsMessagesPaginated");
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
| **phoneNumber** | **UUID**| Optional phone number to filter sent SMS messages for | [optional] |
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

<a id="getSmsCount"></a>
# **getSmsCount**
> CountDto getSmsCount().execute();

Get SMS count

Get number of SMS

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
    try {
      CountDto result = apiInstance.getSmsCount()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getSmsCount");
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

[**CountDto**](CountDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSmsMessage"></a>
# **getSmsMessage**
> SmsDto getSmsMessage(smsId).execute();

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
    UUID smsId = UUID.randomUUID(); // UUID | 
    try {
      SmsDto result = apiInstance.getSmsMessage(smsId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **smsId** | **UUID**|  | |

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
| **200** | OK |  -  |

<a id="getUnreadSmsCount"></a>
# **getUnreadSmsCount**
> UnreadCount getUnreadSmsCount().execute();

Get unread SMS count

Get number of SMS unread. Unread means has not been viewed in dashboard or returned in an email API response

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
    try {
      UnreadCount result = apiInstance.getUnreadSmsCount()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#getUnreadSmsCount");
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

[**UnreadCount**](UnreadCount)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="replyToSmsMessage"></a>
# **replyToSmsMessage**
> SentSmsDto replyToSmsMessage(smsId, smsReplyOptions).execute();

Send a reply to a received SMS message. Replies are sent from the receiving number.

Reply to an SMS message.

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
    UUID smsId = UUID.randomUUID(); // UUID | 
    SmsReplyOptions smsReplyOptions = new SmsReplyOptions(); // SmsReplyOptions | 
    try {
      SentSmsDto result = apiInstance.replyToSmsMessage(smsId, smsReplyOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#replyToSmsMessage");
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
| **smsId** | **UUID**|  | |
| **smsReplyOptions** | [**SmsReplyOptions**](SmsReplyOptions)|  | |

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

<a id="sendSms"></a>
# **sendSms**
> SentSmsDto sendSms(smsSendOptions).fromPhoneNumber(fromPhoneNumber).fromPhoneId(fromPhoneId).execute();



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
    SmsSendOptions smsSendOptions = new SmsSendOptions(); // SmsSendOptions | 
    String fromPhoneNumber = "fromPhoneNumber_example"; // String | Phone number to send from in E.164 format
    UUID fromPhoneId = UUID.randomUUID(); // UUID | Phone number ID to send from in UUID form
    try {
      SentSmsDto result = apiInstance.sendSms(smsSendOptions)
            .fromPhoneNumber(fromPhoneNumber)
            .fromPhoneId(fromPhoneId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#sendSms");
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
| **smsSendOptions** | [**SmsSendOptions**](SmsSendOptions)|  | |
| **fromPhoneNumber** | **String**| Phone number to send from in E.164 format | [optional] |
| **fromPhoneId** | **UUID**| Phone number ID to send from in UUID form | [optional] |

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

<a id="setSmsFavourited"></a>
# **setSmsFavourited**
> SmsDto setSmsFavourited(smsId, favourited).execute();



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
    UUID smsId = UUID.randomUUID(); // UUID | ID of SMS to set favourite state
    Boolean favourited = true; // Boolean | 
    try {
      SmsDto result = apiInstance.setSmsFavourited(smsId, favourited)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsControllerApi#setSmsFavourited");
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
| **smsId** | **UUID**| ID of SMS to set favourite state | |
| **favourited** | **Boolean**|  | |

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
| **204** | No Content |  -  |

