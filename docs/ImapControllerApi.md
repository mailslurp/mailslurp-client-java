# ImapControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**imapServerFetch**](ImapControllerApi#imapServerFetch) | **POST** /imap/server/fetch | Fetch message in an inbox |
| [**imapServerGet**](ImapControllerApi#imapServerGet) | **POST** /imap/server/get | Get a message by email ID |
| [**imapServerList**](ImapControllerApi#imapServerList) | **POST** /imap/server/list | List messages in an inbox |
| [**imapServerMailbox**](ImapControllerApi#imapServerMailbox) | **POST** /imap/server/mailbox | Create a new mailbox if possible |
| [**imapServerSearch**](ImapControllerApi#imapServerSearch) | **POST** /imap/server/search | Search messages in an inbox |
| [**imapServerStatus**](ImapControllerApi#imapServerStatus) | **POST** /imap/server/status | Get status for mailbox |
| [**imapServerUpdateFlags**](ImapControllerApi#imapServerUpdateFlags) | **POST** /imap/server/update-flags |  |


<a id="imapServerFetch"></a>
# **imapServerFetch**
> ImapServerFetchResult imapServerFetch(seqNum).inboxId(inboxId).execute();

Fetch message in an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ImapControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ImapControllerApi apiInstance = new ImapControllerApi(defaultClient);
    Long seqNum = 56L; // Long | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID to search
    try {
      ImapServerFetchResult result = apiInstance.imapServerFetch(seqNum)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImapControllerApi#imapServerFetch");
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
| **seqNum** | **Long**|  | |
| **inboxId** | **UUID**| Inbox ID to search | [optional] |

### Return type

[**ImapServerFetchResult**](ImapServerFetchResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="imapServerGet"></a>
# **imapServerGet**
> ImapServerGetResult imapServerGet(emailId).inboxId(inboxId).execute();

Get a message by email ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ImapControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ImapControllerApi apiInstance = new ImapControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | Email ID to get
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID to search
    try {
      ImapServerGetResult result = apiInstance.imapServerGet(emailId)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImapControllerApi#imapServerGet");
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
| **emailId** | **UUID**| Email ID to get | |
| **inboxId** | **UUID**| Inbox ID to search | [optional] |

### Return type

[**ImapServerGetResult**](ImapServerGetResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="imapServerList"></a>
# **imapServerList**
> ImapServerListResult imapServerList(imapServerListOptions).inboxId(inboxId).execute();

List messages in an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ImapControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ImapControllerApi apiInstance = new ImapControllerApi(defaultClient);
    ImapServerListOptions imapServerListOptions = new ImapServerListOptions(); // ImapServerListOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID to list
    try {
      ImapServerListResult result = apiInstance.imapServerList(imapServerListOptions)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImapControllerApi#imapServerList");
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
| **imapServerListOptions** | [**ImapServerListOptions**](ImapServerListOptions)|  | |
| **inboxId** | **UUID**| Inbox ID to list | [optional] |

### Return type

[**ImapServerListResult**](ImapServerListResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="imapServerMailbox"></a>
# **imapServerMailbox**
> ImapServerMailboxResult imapServerMailbox(name).execute();

Create a new mailbox if possible

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ImapControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ImapControllerApi apiInstance = new ImapControllerApi(defaultClient);
    String name = "name_example"; // String | Inbox email address to create
    try {
      ImapServerMailboxResult result = apiInstance.imapServerMailbox(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImapControllerApi#imapServerMailbox");
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
| **name** | **String**| Inbox email address to create | |

### Return type

[**ImapServerMailboxResult**](ImapServerMailboxResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="imapServerSearch"></a>
# **imapServerSearch**
> ImapServerSearchResult imapServerSearch(imapServerSearchOptions).inboxId(inboxId).execute();

Search messages in an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ImapControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ImapControllerApi apiInstance = new ImapControllerApi(defaultClient);
    ImapServerSearchOptions imapServerSearchOptions = new ImapServerSearchOptions(); // ImapServerSearchOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID to search
    try {
      ImapServerSearchResult result = apiInstance.imapServerSearch(imapServerSearchOptions)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImapControllerApi#imapServerSearch");
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
| **imapServerSearchOptions** | [**ImapServerSearchOptions**](ImapServerSearchOptions)|  | |
| **inboxId** | **UUID**| Inbox ID to search | [optional] |

### Return type

[**ImapServerSearchResult**](ImapServerSearchResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="imapServerStatus"></a>
# **imapServerStatus**
> ImapServerStatusResult imapServerStatus(imapServerStatusOptions).inboxId(inboxId).execute();

Get status for mailbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ImapControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ImapControllerApi apiInstance = new ImapControllerApi(defaultClient);
    ImapServerStatusOptions imapServerStatusOptions = new ImapServerStatusOptions(); // ImapServerStatusOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID to list
    try {
      ImapServerStatusResult result = apiInstance.imapServerStatus(imapServerStatusOptions)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImapControllerApi#imapServerStatus");
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
| **imapServerStatusOptions** | [**ImapServerStatusOptions**](ImapServerStatusOptions)|  | |
| **inboxId** | **UUID**| Inbox ID to list | [optional] |

### Return type

[**ImapServerStatusResult**](ImapServerStatusResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="imapServerUpdateFlags"></a>
# **imapServerUpdateFlags**
> imapServerUpdateFlags(imapUpdateFlagsOptions).inboxId(inboxId).execute();



Update message flags

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ImapControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ImapControllerApi apiInstance = new ImapControllerApi(defaultClient);
    ImapUpdateFlagsOptions imapUpdateFlagsOptions = new ImapUpdateFlagsOptions(); // ImapUpdateFlagsOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.imapServerUpdateFlags(imapUpdateFlagsOptions)
            .inboxId(inboxId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ImapControllerApi#imapServerUpdateFlags");
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
| **imapUpdateFlagsOptions** | [**ImapUpdateFlagsOptions**](ImapUpdateFlagsOptions)|  | |
| **inboxId** | **UUID**|  | [optional] |

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
| **204** | No Content |  -  |

