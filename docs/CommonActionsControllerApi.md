# CommonActionsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEmailAddress**](CommonActionsControllerApi#createNewEmailAddress) | **POST** /newEmailAddress | Create new random inbox |
| [**createRandomInbox**](CommonActionsControllerApi#createRandomInbox) | **POST** /createInbox | Create new random inbox |
| [**deleteEmailAddress**](CommonActionsControllerApi#deleteEmailAddress) | **DELETE** /deleteEmailAddress | Delete inbox email address by inbox id |
| [**emptyInbox**](CommonActionsControllerApi#emptyInbox) | **DELETE** /emptyInbox | Delete all emails in an inbox |
| [**sendEmailQuery**](CommonActionsControllerApi#sendEmailQuery) | **POST** /sendEmailQuery | Send an email using query parameters |
| [**sendEmailSimple**](CommonActionsControllerApi#sendEmailSimple) | **POST** /sendEmail | Send an email |


<a id="createNewEmailAddress"></a>
# **createNewEmailAddress**
> InboxDto createNewEmailAddress().allowTeamAccess(allowTeamAccess).useDomainPool(useDomainPool).expiresAt(expiresAt).expiresIn(expiresIn).emailAddress(emailAddress).inboxType(inboxType).description(description).name(name).tags(tags).favourite(favourite).virtualInbox(virtualInbox).useShortAddress(useShortAddress).domainName(domainName).domainId(domainId).prefix(prefix).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    Boolean allowTeamAccess = true; // Boolean | 
    Boolean useDomainPool = true; // Boolean | 
    OffsetDateTime expiresAt = OffsetDateTime.now(); // OffsetDateTime | 
    Long expiresIn = 56L; // Long | 
    String emailAddress = "emailAddress_example"; // String | 
    String inboxType = "HTTP_INBOX"; // String | 
    String description = "description_example"; // String | 
    String name = "name_example"; // String | 
    List<String> tags = Arrays.asList(); // List<String> | 
    Boolean favourite = true; // Boolean | 
    Boolean virtualInbox = true; // Boolean | 
    Boolean useShortAddress = true; // Boolean | 
    String domainName = "domainName_example"; // String | 
    UUID domainId = UUID.randomUUID(); // UUID | 
    String prefix = "prefix_example"; // String | 
    try {
      InboxDto result = apiInstance.createNewEmailAddress()
            .allowTeamAccess(allowTeamAccess)
            .useDomainPool(useDomainPool)
            .expiresAt(expiresAt)
            .expiresIn(expiresIn)
            .emailAddress(emailAddress)
            .inboxType(inboxType)
            .description(description)
            .name(name)
            .tags(tags)
            .favourite(favourite)
            .virtualInbox(virtualInbox)
            .useShortAddress(useShortAddress)
            .domainName(domainName)
            .domainId(domainId)
            .prefix(prefix)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **allowTeamAccess** | **Boolean**|  | [optional] |
| **useDomainPool** | **Boolean**|  | [optional] |
| **expiresAt** | **OffsetDateTime**|  | [optional] |
| **expiresIn** | **Long**|  | [optional] |
| **emailAddress** | **String**|  | [optional] |
| **inboxType** | **String**|  | [optional] [enum: HTTP_INBOX, SMTP_INBOX] |
| **description** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **tags** | [**List&lt;String&gt;**](String)|  | [optional] |
| **favourite** | **Boolean**|  | [optional] |
| **virtualInbox** | **Boolean**|  | [optional] |
| **useShortAddress** | **Boolean**|  | [optional] |
| **domainName** | **String**|  | [optional] |
| **domainId** | **UUID**|  | [optional] |
| **prefix** | **String**|  | [optional] |

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
| **201** | Created |  -  |

<a id="createRandomInbox"></a>
# **createRandomInbox**
> InboxDto createRandomInbox().allowTeamAccess(allowTeamAccess).useDomainPool(useDomainPool).expiresAt(expiresAt).expiresIn(expiresIn).emailAddress(emailAddress).inboxType(inboxType).description(description).name(name).tags(tags).favourite(favourite).virtualInbox(virtualInbox).useShortAddress(useShortAddress).domainName(domainName).domainId(domainId).prefix(prefix).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    Boolean allowTeamAccess = true; // Boolean | 
    Boolean useDomainPool = true; // Boolean | 
    OffsetDateTime expiresAt = OffsetDateTime.now(); // OffsetDateTime | 
    Long expiresIn = 56L; // Long | 
    String emailAddress = "emailAddress_example"; // String | 
    String inboxType = "HTTP_INBOX"; // String | 
    String description = "description_example"; // String | 
    String name = "name_example"; // String | 
    List<String> tags = Arrays.asList(); // List<String> | 
    Boolean favourite = true; // Boolean | 
    Boolean virtualInbox = true; // Boolean | 
    Boolean useShortAddress = true; // Boolean | 
    String domainName = "domainName_example"; // String | 
    UUID domainId = UUID.randomUUID(); // UUID | 
    String prefix = "prefix_example"; // String | 
    try {
      InboxDto result = apiInstance.createRandomInbox()
            .allowTeamAccess(allowTeamAccess)
            .useDomainPool(useDomainPool)
            .expiresAt(expiresAt)
            .expiresIn(expiresIn)
            .emailAddress(emailAddress)
            .inboxType(inboxType)
            .description(description)
            .name(name)
            .tags(tags)
            .favourite(favourite)
            .virtualInbox(virtualInbox)
            .useShortAddress(useShortAddress)
            .domainName(domainName)
            .domainId(domainId)
            .prefix(prefix)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **allowTeamAccess** | **Boolean**|  | [optional] |
| **useDomainPool** | **Boolean**|  | [optional] |
| **expiresAt** | **OffsetDateTime**|  | [optional] |
| **expiresIn** | **Long**|  | [optional] |
| **emailAddress** | **String**|  | [optional] |
| **inboxType** | **String**|  | [optional] [enum: HTTP_INBOX, SMTP_INBOX] |
| **description** | **String**|  | [optional] |
| **name** | **String**|  | [optional] |
| **tags** | [**List&lt;String&gt;**](String)|  | [optional] |
| **favourite** | **Boolean**|  | [optional] |
| **virtualInbox** | **Boolean**|  | [optional] |
| **useShortAddress** | **Boolean**|  | [optional] |
| **domainName** | **String**|  | [optional] |
| **domainId** | **UUID**|  | [optional] |
| **prefix** | **String**|  | [optional] |

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
| **201** | Created |  -  |

<a id="deleteEmailAddress"></a>
# **deleteEmailAddress**
> deleteEmailAddress(inboxId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox to delete
    try {
      apiInstance.deleteEmailAddress(inboxId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of inbox to delete | |

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

<a id="emptyInbox"></a>
# **emptyInbox**
> emptyInbox(inboxId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox to empty
    try {
      apiInstance.emptyInbox(inboxId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of inbox to empty | |

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

<a id="sendEmailQuery"></a>
# **sendEmailQuery**
> sendEmailQuery(to).senderId(senderId).body(body).subject(subject).execute();

Send an email using query parameters

If no senderId or inboxId provided a random email address will be used to send from. Ensure your parameters are URL encoded.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    String to = "to_example"; // String | Email address to send to
    UUID senderId = UUID.randomUUID(); // UUID | ID of inbox to send from. If null an inbox will be created for sending
    String body = "body_example"; // String | Body of the email message. Supports HTML
    String subject = "subject_example"; // String | Subject line of the email
    try {
      apiInstance.sendEmailQuery(to)
            .senderId(senderId)
            .body(body)
            .subject(subject)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CommonActionsControllerApi#sendEmailQuery");
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
| **to** | **String**| Email address to send to | |
| **senderId** | **UUID**| ID of inbox to send from. If null an inbox will be created for sending | [optional] |
| **body** | **String**| Body of the email message. Supports HTML | [optional] |
| **subject** | **String**| Subject line of the email | [optional] |

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
| **201** | Created |  -  |

<a id="sendEmailSimple"></a>
# **sendEmailSimple**
> sendEmailSimple(simpleSendEmailOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    CommonActionsControllerApi apiInstance = new CommonActionsControllerApi(defaultClient);
    SimpleSendEmailOptions simpleSendEmailOptions = new SimpleSendEmailOptions(); // SimpleSendEmailOptions | 
    try {
      apiInstance.sendEmailSimple(simpleSendEmailOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **simpleSendEmailOptions** | [**SimpleSendEmailOptions**](SimpleSendEmailOptions)|  | |

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
| **201** | Created |  -  |

