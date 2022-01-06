# MissedEmailControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMissedEmails**](MissedEmailControllerApi#getAllMissedEmails) | **GET** /missed-emails | Get all MissedEmails in paginated format
[**getAllUnknownMissedEmails**](MissedEmailControllerApi#getAllUnknownMissedEmails) | **GET** /missed-emails/unknown | Get all unknown missed emails in paginated format
[**getMissedEmail**](MissedEmailControllerApi#getMissedEmail) | **GET** /missed-emails/{missedEmailId} | Get MissedEmail
[**waitForNthMissedEmail**](MissedEmailControllerApi#waitForNthMissedEmail) | **GET** /missed-emails/waitForNthMissedEmail | Wait for Nth missed email


<a name="getAllMissedEmails"></a>
# **getAllMissedEmails**
> PageMissedEmailProjection getAllMissedEmails(page, size, sort, searchFilter, since, before, inboxId)

Get all MissedEmails in paginated format

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MissedEmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MissedEmailControllerApi apiInstance = new MissedEmailControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Filter by created at before the given timestamp
    UUID inboxId = new UUID(); // UUID | Optional inbox ID filter
    try {
      PageMissedEmailProjection result = apiInstance.getAllMissedEmails(page, size, sort, searchFilter, since, before, inboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MissedEmailControllerApi#getAllMissedEmails");
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
 **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **String**| Optional search filter | [optional]
 **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **inboxId** | [**UUID**]()| Optional inbox ID filter | [optional]

### Return type

[**PageMissedEmailProjection**](PageMissedEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getAllUnknownMissedEmails"></a>
# **getAllUnknownMissedEmails**
> PageUnknownMissedEmailProjection getAllUnknownMissedEmails(page, size, sort, searchFilter, since, before, inboxId)

Get all unknown missed emails in paginated format

Unknown missed emails are emails that were sent to MailSlurp but could not be assigned to an existing inbox.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MissedEmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MissedEmailControllerApi apiInstance = new MissedEmailControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Filter by created at before the given timestamp
    UUID inboxId = new UUID(); // UUID | Optional inbox ID filter
    try {
      PageUnknownMissedEmailProjection result = apiInstance.getAllUnknownMissedEmails(page, size, sort, searchFilter, since, before, inboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MissedEmailControllerApi#getAllUnknownMissedEmails");
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
 **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **searchFilter** | **String**| Optional search filter | [optional]
 **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional]
 **inboxId** | [**UUID**]()| Optional inbox ID filter | [optional]

### Return type

[**PageUnknownMissedEmailProjection**](PageUnknownMissedEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getMissedEmail"></a>
# **getMissedEmail**
> MissedEmail getMissedEmail(missedEmailId)

Get MissedEmail

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MissedEmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MissedEmailControllerApi apiInstance = new MissedEmailControllerApi(defaultClient);
    UUID missedEmailId = new UUID(); // UUID | 
    try {
      MissedEmail result = apiInstance.getMissedEmail(missedEmailId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MissedEmailControllerApi#getMissedEmail");
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
 **missedEmailId** | [**UUID**]()|  |

### Return type

[**MissedEmail**](MissedEmail)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="waitForNthMissedEmail"></a>
# **waitForNthMissedEmail**
> MissedEmail waitForNthMissedEmail(index, inboxId, timeout, since, before)

Wait for Nth missed email

Wait for 0 based index missed email

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MissedEmailControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MissedEmailControllerApi apiInstance = new MissedEmailControllerApi(defaultClient);
    Integer index = 56; // Integer | Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index=1
    UUID inboxId = new UUID(); // UUID | Optional inbox ID filter
    Long timeout = 56L; // Long | Optional timeout milliseconds
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      MissedEmail result = apiInstance.waitForNthMissedEmail(index, inboxId, timeout, since, before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MissedEmailControllerApi#waitForNthMissedEmail");
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
 **index** | **Integer**| Zero based index of the email to wait for. If 1 missed email already and you want to wait for the 2nd email pass index&#x3D;1 |
 **inboxId** | [**UUID**]()| Optional inbox ID filter | [optional]
 **timeout** | **Long**| Optional timeout milliseconds | [optional]
 **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional]
 **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional]

### Return type

[**MissedEmail**](MissedEmail)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

