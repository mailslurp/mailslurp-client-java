# CommonActionsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewEmailAddress**](CommonActionsControllerApi.md#createNewEmailAddress) | **POST** /newEmailAddress | Create new random inbox
[**emptyInbox**](CommonActionsControllerApi.md#emptyInbox) | **DELETE** /emptyInbox | Delete all emails in an inbox
[**sendEmailSimple**](CommonActionsControllerApi.md#sendEmailSimple) | **POST** /sendEmail | Send an email from a random email address
[**waitForEmailCount**](CommonActionsControllerApi.md#waitForEmailCount) | **GET** /waitForEmailCount | Wait for and return count number of emails 
[**waitForLatestEmail**](CommonActionsControllerApi.md#waitForLatestEmail) | **GET** /waitForLatestEmail | Fetch inbox&#39;s latest email or if empty wait for email to arrive
[**waitForMatchingEmail**](CommonActionsControllerApi.md#waitForMatchingEmail) | **POST** /waitForMatchingEmails | Wait or return list of emails that match simple matching patterns
[**waitForNthEmail**](CommonActionsControllerApi.md#waitForNthEmail) | **GET** /waitForNthEmail | Wait for or fetch the email with a given index in the inbox specified


<a name="createNewEmailAddress"></a>
# **createNewEmailAddress**
> Inbox createNewEmailAddress()

Create new random inbox

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.CommonActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    try {
      Inbox result = apiInstance.createNewEmailAddress();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#createNewEmailAddress");
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

[**Inbox**](Inbox.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="emptyInbox"></a>
# **emptyInbox**
> emptyInbox(inboxId)

Delete all emails in an inbox

Deletes all emails

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.CommonActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    try {
      apiInstance.emptyInbox(inboxId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#emptyInbox");
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
 **inboxId** | [**UUID**](.md)| inboxId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="sendEmailSimple"></a>
# **sendEmailSimple**
> sendEmailSimple(sendEmailOptions)

Send an email from a random email address

To specify an email address first create an inbox and use that with the other send email methods

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.CommonActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | sendEmailOptions
    try {
      apiInstance.sendEmailSimple(sendEmailOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#sendEmailSimple");
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
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions.md)| sendEmailOptions |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="waitForEmailCount"></a>
# **waitForEmailCount**
> List&lt;EmailPreview&gt; waitForEmailCount(count, inboxId, timeout, unreadOnly)

Wait for and return count number of emails 

Will only wait if count is greater that the found emails in given inbox.If you need to wait for an email for a non-empty inbox see the other receive methods.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.CommonActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    Integer count = 56; // Integer | Number of emails to wait for. Must be greater that 1
    UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    try {
      List<EmailPreview> result = apiInstance.waitForEmailCount(count, inboxId, timeout, unreadOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#waitForEmailCount");
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
 **count** | **Integer**| Number of emails to wait for. Must be greater that 1 | [optional]
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="waitForLatestEmail"></a>
# **waitForLatestEmail**
> Email waitForLatestEmail(inboxId, timeout, unreadOnly)

Fetch inbox&#39;s latest email or if empty wait for email to arrive

Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox see the other receive methods.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.CommonActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    try {
      Email result = apiInstance.waitForLatestEmail(inboxId, timeout, unreadOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#waitForLatestEmail");
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
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**Email**](Email.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="waitForMatchingEmail"></a>
# **waitForMatchingEmail**
> List&lt;EmailPreview&gt; waitForMatchingEmail(matchOptions, count, inboxId, timeout, unreadOnly)

Wait or return list of emails that match simple matching patterns

Results must also meet provided count. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM.

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.CommonActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    MatchOptions matchOptions = new MatchOptions(); // MatchOptions | matchOptions
    Integer count = 56; // Integer | Number of emails to wait for. Must be greater that 1
    UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    try {
      List<EmailPreview> result = apiInstance.waitForMatchingEmail(matchOptions, count, inboxId, timeout, unreadOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#waitForMatchingEmail");
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
 **matchOptions** | [**MatchOptions**](MatchOptions.md)| matchOptions |
 **count** | **Integer**| Number of emails to wait for. Must be greater that 1 | [optional]
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="waitForNthEmail"></a>
# **waitForNthEmail**
> Email waitForNthEmail(inboxId, index, timeout, unreadOnly)

Wait for or fetch the email with a given index in the inbox specified

### Example
```java
// Import classes:
import com.mailslurp.client.ApiClient;
import com.mailslurp.client.ApiException;
import com.mailslurp.client.Configuration;
import com.mailslurp.client.auth.*;
import com.mailslurp.client.models.*;
import com.mailslurp.api.api.CommonActionsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
    Integer index = 56; // Integer | Zero based index of the email to wait for
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    try {
      Email result = apiInstance.waitForNthEmail(inboxId, index, timeout, unreadOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#waitForNthEmail");
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
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **index** | **Integer**| Zero based index of the email to wait for | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]
 **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false]

### Return type

[**Email**](Email.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

