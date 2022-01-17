# CommonActionsControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewEmailAddress**](CommonActionsControllerApi#createNewEmailAddress) | **POST** /newEmailAddress | Create new random inbox
[**createRandomInbox**](CommonActionsControllerApi#createRandomInbox) | **POST** /createInbox | Create new random inbox
[**deleteEmailAddress**](CommonActionsControllerApi#deleteEmailAddress) | **DELETE** /deleteEmailAddress | Delete inbox email address by inbox id
[**emptyInbox**](CommonActionsControllerApi#emptyInbox) | **DELETE** /emptyInbox | Delete all emails in an inbox
[**sendEmailSimple**](CommonActionsControllerApi#sendEmailSimple) | **POST** /sendEmail | Send an email


<a name="createNewEmailAddress"></a>
# **createNewEmailAddress**
> InboxDto createNewEmailAddress(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite)

Create new random inbox

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CommonActionsControllerApi;

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
    Boolean allowTeamAccess = true; // Boolean | 
    Boolean useDomainPool = true; // Boolean | 
    OffsetDateTime expiresAt = new OffsetDateTime(); // OffsetDateTime | 
    Long expiresIn = 56L; // Long | 
    String emailAddress = "emailAddress_example"; // String | 
    String inboxType = "inboxType_example"; // String | 
    String description = "description_example"; // String | 
    String name = "name_example"; // String | 
    List<String> tags = Arrays.asList(); // List<String> | 
    Boolean favourite = true; // Boolean | 
    try {
      InboxDto result = apiInstance.createNewEmailAddress(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowTeamAccess** | **Boolean**|  | [optional]
 **useDomainPool** | **Boolean**|  | [optional]
 **expiresAt** | **OffsetDateTime**|  | [optional]
 **expiresIn** | **Long**|  | [optional]
 **emailAddress** | **String**|  | [optional]
 **inboxType** | **String**|  | [optional] [enum: HTTP_INBOX, SMTP_INBOX]
 **description** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **tags** | [**List&lt;String&gt;**](String)|  | [optional]
 **favourite** | **Boolean**|  | [optional]

### Return type

[**InboxDto**](InboxDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="createRandomInbox"></a>
# **createRandomInbox**
> InboxDto createRandomInbox(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite)

Create new random inbox

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CommonActionsControllerApi;

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
    Boolean allowTeamAccess = true; // Boolean | 
    Boolean useDomainPool = true; // Boolean | 
    OffsetDateTime expiresAt = new OffsetDateTime(); // OffsetDateTime | 
    Long expiresIn = 56L; // Long | 
    String emailAddress = "emailAddress_example"; // String | 
    String inboxType = "inboxType_example"; // String | 
    String description = "description_example"; // String | 
    String name = "name_example"; // String | 
    List<String> tags = Arrays.asList(); // List<String> | 
    Boolean favourite = true; // Boolean | 
    try {
      InboxDto result = apiInstance.createRandomInbox(allowTeamAccess, useDomainPool, expiresAt, expiresIn, emailAddress, inboxType, description, name, tags, favourite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#createRandomInbox");
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
 **allowTeamAccess** | **Boolean**|  | [optional]
 **useDomainPool** | **Boolean**|  | [optional]
 **expiresAt** | **OffsetDateTime**|  | [optional]
 **expiresIn** | **Long**|  | [optional]
 **emailAddress** | **String**|  | [optional]
 **inboxType** | **String**|  | [optional] [enum: HTTP_INBOX, SMTP_INBOX]
 **description** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **tags** | [**List&lt;String&gt;**](String)|  | [optional]
 **favourite** | **Boolean**|  | [optional]

### Return type

[**InboxDto**](InboxDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |

<a name="deleteEmailAddress"></a>
# **deleteEmailAddress**
> deleteEmailAddress(inboxId)

Delete inbox email address by inbox id

Deletes inbox email address

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CommonActionsControllerApi;

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
    UUID inboxId = new UUID(); // UUID | 
    try {
      apiInstance.deleteEmailAddress(inboxId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#deleteEmailAddress");
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
 **inboxId** | [**UUID**]()|  |

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

<a name="emptyInbox"></a>
# **emptyInbox**
> emptyInbox(inboxId)

Delete all emails in an inbox

Deletes all emails

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CommonActionsControllerApi;

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
    UUID inboxId = new UUID(); // UUID | 
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
 **inboxId** | [**UUID**]()|  |

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

<a name="sendEmailSimple"></a>
# **sendEmailSimple**
> sendEmailSimple(simpleSendEmailOptions)

Send an email

If no senderId or inboxId provided a random email address will be used to send from.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.CommonActionsControllerApi;

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
    SimpleSendEmailOptions simpleSendEmailOptions = new SimpleSendEmailOptions(); // SimpleSendEmailOptions | 
    try {
      apiInstance.sendEmailSimple(simpleSendEmailOptions);
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
 **simpleSendEmailOptions** | [**SimpleSendEmailOptions**](SimpleSendEmailOptions)|  |

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
**201** | Created |  -  |

