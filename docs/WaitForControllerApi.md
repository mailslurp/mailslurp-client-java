# WaitForControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**waitFor**](WaitForControllerApi#waitFor) | **POST** /waitFor | Wait for an email to match the provided filter conditions such as subject contains keyword. |
| [**waitForEmailCount**](WaitForControllerApi#waitForEmailCount) | **GET** /waitForEmailCount | Wait for and return count number of emails. Hold connection until inbox count matches expected or timeout occurs |
| [**waitForLatestEmail**](WaitForControllerApi#waitForLatestEmail) | **GET** /waitForLatestEmail | Fetch inbox&#39;s latest email or if empty wait for an email to arrive |
| [**waitForLatestSms**](WaitForControllerApi#waitForLatestSms) | **POST** /waitForLatestSms | Wait for the latest SMS message to match the provided filter conditions such as body contains keyword. |
| [**waitForMatchingEmails**](WaitForControllerApi#waitForMatchingEmails) | **POST** /waitForMatchingEmails | Wait or return list of emails that match simple matching patterns |
| [**waitForMatchingFirstEmail**](WaitForControllerApi#waitForMatchingFirstEmail) | **POST** /waitForMatchingFirstEmail | Wait for or return the first email that matches provided MatchOptions array |
| [**waitForNthEmail**](WaitForControllerApi#waitForNthEmail) | **GET** /waitForNthEmail | Wait for or fetch the email with a given index in the inbox specified. If index doesn&#39;t exist waits for it to exist or timeout to occur. |
| [**waitForSms**](WaitForControllerApi#waitForSms) | **POST** /waitForSms | Wait for an SMS message to match the provided filter conditions such as body contains keyword. |


<a id="waitFor"></a>
# **waitFor**
> List&lt;EmailPreview&gt; waitFor(waitForConditions).execute();

Wait for an email to match the provided filter conditions such as subject contains keyword.

Generic waitFor method that will wait until an inbox meets given conditions or return immediately if already met

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    WaitForConditions waitForConditions = new WaitForConditions(); // WaitForConditions | 
    try {
      List<EmailPreview> result = apiInstance.waitFor(waitForConditions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitFor");
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
| **waitForConditions** | [**WaitForConditions**](WaitForConditions)|  | |

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForEmailCount"></a>
# **waitForEmailCount**
> List&lt;EmailPreview&gt; waitForEmailCount(inboxId, count).timeout(timeout).unreadOnly(unreadOnly).before(before).since(since).sort(sort).delay(delay).execute();

Wait for and return count number of emails. Hold connection until inbox count matches expected or timeout occurs

If inbox contains count or more emails at time of request then return count worth of emails. If not wait until the count is reached and return those or return an error if timeout is exceeded.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of the inbox we are fetching emails from
    Integer count = 56; // Integer | Number of emails to wait for. Must be greater that 1
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received before the given timestamp
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received after the given timestamp
    String sort = "ASC"; // String | Sort direction
    Long delay = 56L; // Long | Max milliseconds delay between calls
    try {
      List<EmailPreview> result = apiInstance.waitForEmailCount(inboxId, count)
            .timeout(timeout)
            .unreadOnly(unreadOnly)
            .before(before)
            .since(since)
            .sort(sort)
            .delay(delay)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitForEmailCount");
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
| **inboxId** | **UUID**| Id of the inbox we are fetching emails from | |
| **count** | **Integer**| Number of emails to wait for. Must be greater that 1 | |
| **timeout** | **Long**| Max milliseconds to wait | [optional] |
| **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false] |
| **before** | **OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional] |
| **since** | **OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional] |
| **sort** | **String**| Sort direction | [optional] [enum: ASC, DESC] |
| **delay** | **Long**| Max milliseconds delay between calls | [optional] |

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForLatestEmail"></a>
# **waitForLatestEmail**
> Email waitForLatestEmail().inboxId(inboxId).timeout(timeout).unreadOnly(unreadOnly).before(before).since(since).sort(sort).delay(delay).execute();

Fetch inbox&#39;s latest email or if empty wait for an email to arrive

Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox set &#x60;unreadOnly&#x3D;true&#x60; or see the other receive methods such as &#x60;waitForNthEmail&#x60; or &#x60;waitForEmailCount&#x60;.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of the inbox we are fetching emails from
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only.
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were before after the given timestamp
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received after the given timestamp
    String sort = "ASC"; // String | Sort direction
    Long delay = 56L; // Long | Max milliseconds delay between calls
    try {
      Email result = apiInstance.waitForLatestEmail()
            .inboxId(inboxId)
            .timeout(timeout)
            .unreadOnly(unreadOnly)
            .before(before)
            .since(since)
            .sort(sort)
            .delay(delay)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitForLatestEmail");
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
| **inboxId** | **UUID**| Id of the inbox we are fetching emails from | [optional] |
| **timeout** | **Long**| Max milliseconds to wait | [optional] |
| **unreadOnly** | **Boolean**| Optional filter for unread only. | [optional] [default to false] |
| **before** | **OffsetDateTime**| Filter for emails that were before after the given timestamp | [optional] |
| **since** | **OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional] |
| **sort** | **String**| Sort direction | [optional] [enum: ASC, DESC] |
| **delay** | **Long**| Max milliseconds delay between calls | [optional] |

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForLatestSms"></a>
# **waitForLatestSms**
> SmsDto waitForLatestSms(waitForSingleSmsOptions).execute();

Wait for the latest SMS message to match the provided filter conditions such as body contains keyword.

Wait until a phone number meets given conditions or return immediately if already met

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    WaitForSingleSmsOptions waitForSingleSmsOptions = new WaitForSingleSmsOptions(); // WaitForSingleSmsOptions | 
    try {
      SmsDto result = apiInstance.waitForLatestSms(waitForSingleSmsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitForLatestSms");
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
| **waitForSingleSmsOptions** | [**WaitForSingleSmsOptions**](WaitForSingleSmsOptions)|  | |

### Return type

[**SmsDto**](SmsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForMatchingEmails"></a>
# **waitForMatchingEmails**
> List&lt;EmailPreview&gt; waitForMatchingEmails(inboxId, count, matchOptions).before(before).since(since).sort(sort).delay(delay).timeout(timeout).unreadOnly(unreadOnly).execute();

Wait or return list of emails that match simple matching patterns

Perform a search of emails in an inbox with the given patterns. If results match expected count then return or else retry the search until results are found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of the inbox we are fetching emails from
    Integer count = 56; // Integer | Number of emails to wait for. Must be greater or equal to 1
    MatchOptions matchOptions = new MatchOptions(); // MatchOptions | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received before the given timestamp
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received after the given timestamp
    String sort = "ASC"; // String | Sort direction
    Long delay = 56L; // Long | Max milliseconds delay between calls
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    try {
      List<EmailPreview> result = apiInstance.waitForMatchingEmails(inboxId, count, matchOptions)
            .before(before)
            .since(since)
            .sort(sort)
            .delay(delay)
            .timeout(timeout)
            .unreadOnly(unreadOnly)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitForMatchingEmails");
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
| **inboxId** | **UUID**| Id of the inbox we are fetching emails from | |
| **count** | **Integer**| Number of emails to wait for. Must be greater or equal to 1 | |
| **matchOptions** | [**MatchOptions**](MatchOptions)|  | |
| **before** | **OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional] |
| **since** | **OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional] |
| **sort** | **String**| Sort direction | [optional] [enum: ASC, DESC] |
| **delay** | **Long**| Max milliseconds delay between calls | [optional] |
| **timeout** | **Long**| Max milliseconds to wait | [optional] |
| **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false] |

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForMatchingFirstEmail"></a>
# **waitForMatchingFirstEmail**
> Email waitForMatchingFirstEmail(inboxId, matchOptions).timeout(timeout).unreadOnly(unreadOnly).since(since).before(before).sort(sort).delay(delay).execute();

Wait for or return the first email that matches provided MatchOptions array

Perform a search of emails in an inbox with the given patterns. If a result if found then return or else retry the search until a result is found or timeout is reached. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM. See the &#x60;MatchOptions&#x60; object for options. An example payload is &#x60;{ matches: [{field: &#39;SUBJECT&#39;,should:&#39;CONTAIN&#39;,value:&#39;needle&#39;}] }&#x60;. You can use an array of matches and they will be applied sequentially to filter out emails. If you want to perform matches and extractions of content using Regex patterns see the EmailController &#x60;getEmailContentMatch&#x60; method.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of the inbox we are matching an email for
    MatchOptions matchOptions = new MatchOptions(); // MatchOptions | 
    Long timeout = 56L; // Long | Max milliseconds to wait
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received before the given timestamp
    String sort = "ASC"; // String | Sort direction
    Long delay = 56L; // Long | Max milliseconds delay between calls
    try {
      Email result = apiInstance.waitForMatchingFirstEmail(inboxId, matchOptions)
            .timeout(timeout)
            .unreadOnly(unreadOnly)
            .since(since)
            .before(before)
            .sort(sort)
            .delay(delay)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitForMatchingFirstEmail");
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
| **inboxId** | **UUID**| Id of the inbox we are matching an email for | |
| **matchOptions** | [**MatchOptions**](MatchOptions)|  | |
| **timeout** | **Long**| Max milliseconds to wait | [optional] |
| **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false] |
| **since** | **OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional] |
| **sort** | **String**| Sort direction | [optional] [enum: ASC, DESC] |
| **delay** | **Long**| Max milliseconds delay between calls | [optional] |

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForNthEmail"></a>
# **waitForNthEmail**
> Email waitForNthEmail().inboxId(inboxId).index(index).timeout(timeout).unreadOnly(unreadOnly).since(since).before(before).sort(sort).delay(delay).execute();

Wait for or fetch the email with a given index in the inbox specified. If index doesn&#39;t exist waits for it to exist or timeout to occur.

If nth email is already present in inbox then return it. If not hold the connection open until timeout expires or the nth email is received and returned.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of the inbox you are fetching emails from
    Integer index = 0; // Integer | Zero based index of the email to wait for. If an inbox has 1 email already and you want to wait for the 2nd email pass index=1
    Long timeout = 56L; // Long | Max milliseconds to wait for the nth email if not already present
    Boolean unreadOnly = false; // Boolean | Optional filter for unread only
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter for emails that were received before the given timestamp
    String sort = "ASC"; // String | Sort direction
    Long delay = 56L; // Long | Max milliseconds delay between calls
    try {
      Email result = apiInstance.waitForNthEmail()
            .inboxId(inboxId)
            .index(index)
            .timeout(timeout)
            .unreadOnly(unreadOnly)
            .since(since)
            .before(before)
            .sort(sort)
            .delay(delay)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitForNthEmail");
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
| **inboxId** | **UUID**| Id of the inbox you are fetching emails from | [optional] |
| **index** | **Integer**| Zero based index of the email to wait for. If an inbox has 1 email already and you want to wait for the 2nd email pass index&#x3D;1 | [optional] [default to 0] |
| **timeout** | **Long**| Max milliseconds to wait for the nth email if not already present | [optional] |
| **unreadOnly** | **Boolean**| Optional filter for unread only | [optional] [default to false] |
| **since** | **OffsetDateTime**| Filter for emails that were received after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter for emails that were received before the given timestamp | [optional] |
| **sort** | **String**| Sort direction | [optional] [enum: ASC, DESC] |
| **delay** | **Long**| Max milliseconds delay between calls | [optional] |

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForSms"></a>
# **waitForSms**
> List&lt;SmsPreview&gt; waitForSms(waitForSmsConditions).execute();

Wait for an SMS message to match the provided filter conditions such as body contains keyword.

Generic waitFor method that will wait until a phone number meets given conditions or return immediately if already met

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.WaitForControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    WaitForControllerApi apiInstance = new WaitForControllerApi(defaultClient);
    WaitForSmsConditions waitForSmsConditions = new WaitForSmsConditions(); // WaitForSmsConditions | 
    try {
      List<SmsPreview> result = apiInstance.waitForSms(waitForSmsConditions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WaitForControllerApi#waitForSms");
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
| **waitForSmsConditions** | [**WaitForSmsConditions**](WaitForSmsConditions)|  | |

### Return type

[**List&lt;SmsPreview&gt;**](SmsPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

