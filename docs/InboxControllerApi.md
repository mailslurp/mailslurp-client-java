# InboxControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInbox**](InboxControllerApi#createInbox) | **POST** /inboxes | Create an inbox email address. An inbox has a real email address and can send and receive emails. Inboxes can be either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; inboxes.
[**createInboxRuleset**](InboxControllerApi#createInboxRuleset) | **POST** /inboxes/{inboxId}/rulesets | Create an inbox ruleset
[**createInboxWithDefaults**](InboxControllerApi#createInboxWithDefaults) | **POST** /inboxes/withDefaults | Create an inbox with default options. Uses MailSlurp domain pool address and is private.
[**createInboxWithOptions**](InboxControllerApi#createInboxWithOptions) | **POST** /inboxes/withOptions | Create an inbox with options. Extended options for inbox creation.
[**deleteAllInboxes**](InboxControllerApi#deleteAllInboxes) | **DELETE** /inboxes | Delete all inboxes
[**deleteInbox**](InboxControllerApi#deleteInbox) | **DELETE** /inboxes/{inboxId} | Delete inbox
[**doesInboxExist**](InboxControllerApi#doesInboxExist) | **GET** /inboxes/exists | Does inbox exist
[**flushExpired**](InboxControllerApi#flushExpired) | **DELETE** /inboxes/expired | Remove expired inboxes
[**getAllInboxes**](InboxControllerApi#getAllInboxes) | **GET** /inboxes/paginated | List All Inboxes Paginated
[**getEmails**](InboxControllerApi#getEmails) | **GET** /inboxes/{inboxId}/emails | Get emails in an Inbox. This method is not idempotent as it allows retries and waits if you want certain conditions to be met before returning. For simple listing and sorting of known emails use the email controller instead.
[**getInbox**](InboxControllerApi#getInbox) | **GET** /inboxes/{inboxId} | Get Inbox. Returns properties of an inbox.
[**getInboxEmailsPaginated**](InboxControllerApi#getInboxEmailsPaginated) | **GET** /inboxes/{inboxId}/emails/paginated | Get inbox emails paginated
[**getInboxSentEmails**](InboxControllerApi#getInboxSentEmails) | **GET** /inboxes/{inboxId}/sent | Get Inbox Sent Emails
[**getInboxTags**](InboxControllerApi#getInboxTags) | **GET** /inboxes/tags | Get inbox tags
[**getInboxes**](InboxControllerApi#getInboxes) | **GET** /inboxes | List Inboxes and email addresses
[**getOrganizationInboxes**](InboxControllerApi#getOrganizationInboxes) | **GET** /inboxes/organization | List Organization Inboxes Paginated
[**listInboxRulesets**](InboxControllerApi#listInboxRulesets) | **GET** /inboxes/{inboxId}/rulesets | List inbox rulesets
[**listInboxTrackingPixels**](InboxControllerApi#listInboxTrackingPixels) | **GET** /inboxes/{inboxId}/tracking-pixels | List inbox tracking pixels
[**sendEmail**](InboxControllerApi#sendEmail) | **POST** /inboxes/{inboxId} | Send Email
[**sendEmailAndConfirm**](InboxControllerApi#sendEmailAndConfirm) | **POST** /inboxes/{inboxId}/confirm | Send email and return sent confirmation
[**sendTestEmail**](InboxControllerApi#sendTestEmail) | **POST** /inboxes/{inboxId}/send-test-email | Send a test email to inbox
[**setInboxFavourited**](InboxControllerApi#setInboxFavourited) | **PUT** /inboxes/{inboxId}/favourite | Set inbox favourited state
[**updateInbox**](InboxControllerApi#updateInbox) | **PATCH** /inboxes/{inboxId} | Update Inbox. Change name and description. Email address is not editable.


<a name="createInbox"></a>
# **createInbox**
> Inbox createInbox(allowTeamAccess, description, emailAddress, expiresAt, expiresIn, favourite, inboxType, name, tags, useDomainPool)

Create an inbox email address. An inbox has a real email address and can send and receive emails. Inboxes can be either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; inboxes.

Create a new inbox and with a randomized email address to send and receive from. Pass emailAddress parameter if you wish to use a specific email address. Creating an inbox is required before sending or receiving emails. If writing tests it is recommended that you create a new inbox during each test method so that it is unique and empty. 

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Boolean allowTeamAccess = true; // Boolean | DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization.
    String description = "description_example"; // String | Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with
    String emailAddress = "emailAddress_example"; // String | A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as `123@mailslurp.com`. If you use the `useDomainPool` option when the email address is null it will generate an email address with a more varied domain ending such as `123@mailslurp.info` or `123@mailslurp.biz`. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so `SMTP` inboxes will only work with `SMTP` type domains. Avoid `SMTP` inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
    OffsetDateTime expiresAt = new OffsetDateTime(); // OffsetDateTime | Optional inbox expiration date. If null then this inbox is permanent and the emails in it won't be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd'T'HH:mm:ss.SSSXXX.
    Long expiresIn = 56L; // Long | Number of milliseconds that inbox should exist for
    Boolean favourite = true; // Boolean | Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering
    String inboxType = "inboxType_example"; // String | HTTP (default) or SMTP inbox type. HTTP inboxes are default and best solution for most cases. SMTP inboxes are more reliable for public inbound email consumption (but do not support sending emails). When using custom domains the domain type must match the inbox type. HTTP inboxes are processed by AWS SES while SMTP inboxes use a custom mail server running at `mx.mailslurp.com`.
    String name = "name_example"; // String | Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails.
    List<String> tags = Arrays.asList(); // List<String> | Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
    Boolean useDomainPool = true; // Boolean | Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default `@mailslurp.com` email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in `@mailslurp.{world,info,xyz,...}` . This means a TLD is randomly selecting from a list of `.biz`, `.info`, `.xyz` etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of `@mailslurp.com` or custom email address provided by the emailAddress field. Note this feature is only available for `HTTP` inbox types.
    try {
      Inbox result = apiInstance.createInbox(allowTeamAccess, description, emailAddress, expiresAt, expiresIn, favourite, inboxType, name, tags, useDomainPool);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#createInbox");
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
 **allowTeamAccess** | **Boolean**| DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization. | [optional]
 **description** | **String**| Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with | [optional]
 **emailAddress** | **String**| A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as &#x60;123@mailslurp.com&#x60;. If you use the &#x60;useDomainPool&#x60; option when the email address is null it will generate an email address with a more varied domain ending such as &#x60;123@mailslurp.info&#x60; or &#x60;123@mailslurp.biz&#x60;. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so &#x60;SMTP&#x60; inboxes will only work with &#x60;SMTP&#x60; type domains. Avoid &#x60;SMTP&#x60; inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. | [optional]
 **expiresAt** | **OffsetDateTime**| Optional inbox expiration date. If null then this inbox is permanent and the emails in it won&#39;t be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX. | [optional]
 **expiresIn** | **Long**| Number of milliseconds that inbox should exist for | [optional]
 **favourite** | **Boolean**| Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering | [optional]
 **inboxType** | **String**| HTTP (default) or SMTP inbox type. HTTP inboxes are default and best solution for most cases. SMTP inboxes are more reliable for public inbound email consumption (but do not support sending emails). When using custom domains the domain type must match the inbox type. HTTP inboxes are processed by AWS SES while SMTP inboxes use a custom mail server running at &#x60;mx.mailslurp.com&#x60;. | [optional] [enum: HTTP_INBOX, SMTP_INBOX]
 **name** | **String**| Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails. | [optional]
 **tags** | [**List&lt;String&gt;**](String)| Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. | [optional]
 **useDomainPool** | **Boolean**| Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default &#x60;@mailslurp.com&#x60; email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in &#x60;@mailslurp.{world,info,xyz,...}&#x60; . This means a TLD is randomly selecting from a list of &#x60;.biz&#x60;, &#x60;.info&#x60;, &#x60;.xyz&#x60; etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of &#x60;@mailslurp.com&#x60; or custom email address provided by the emailAddress field. Note this feature is only available for &#x60;HTTP&#x60; inbox types. | [optional]

### Return type

[**Inbox**](Inbox)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="createInboxRuleset"></a>
# **createInboxRuleset**
> InboxRulesetDto createInboxRuleset(inboxId, createInboxRulesetOptions)

Create an inbox ruleset

Create a new inbox rule for forwarding, blocking, and allowing emails when sending and receiving

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    CreateInboxRulesetOptions createInboxRulesetOptions = new CreateInboxRulesetOptions(); // CreateInboxRulesetOptions | createInboxRulesetOptions
    try {
      InboxRulesetDto result = apiInstance.createInboxRuleset(inboxId, createInboxRulesetOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#createInboxRuleset");
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
 **inboxId** | [**UUID**]()| inboxId |
 **createInboxRulesetOptions** | [**CreateInboxRulesetOptions**](CreateInboxRulesetOptions)| createInboxRulesetOptions |

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="createInboxWithDefaults"></a>
# **createInboxWithDefaults**
> Inbox createInboxWithDefaults()

Create an inbox with default options. Uses MailSlurp domain pool address and is private.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      Inbox result = apiInstance.createInboxWithDefaults();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#createInboxWithDefaults");
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

[**Inbox**](Inbox)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="createInboxWithOptions"></a>
# **createInboxWithOptions**
> Inbox createInboxWithOptions(createInboxDto)

Create an inbox with options. Extended options for inbox creation.

Additional endpoint that allows inbox creation with request body options. Can be more flexible that other methods for some clients.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    CreateInboxDto createInboxDto = new CreateInboxDto(); // CreateInboxDto | createInboxDto
    try {
      Inbox result = apiInstance.createInboxWithOptions(createInboxDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#createInboxWithOptions");
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
 **createInboxDto** | [**CreateInboxDto**](CreateInboxDto)| createInboxDto |

### Return type

[**Inbox**](Inbox)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="deleteAllInboxes"></a>
# **deleteAllInboxes**
> deleteAllInboxes()

Delete all inboxes

Permanently delete all inboxes and associated email addresses. This will also delete all emails within the inboxes. Be careful as inboxes cannot be recovered once deleted. Note: deleting inboxes will not impact your usage limits. Monthly inbox creation limits are based on how many inboxes were created in the last 30 days, not how many inboxes you currently have.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      apiInstance.deleteAllInboxes();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#deleteAllInboxes");
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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="deleteInbox"></a>
# **deleteInbox**
> deleteInbox(inboxId)

Delete inbox

Permanently delete an inbox and associated email address as well as all emails within the given inbox. This action cannot be undone. Note: deleting an inbox will not affect your account usage. Monthly inbox usage is based on how many inboxes you create within 30 days, not how many exist at time of request.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    try {
      apiInstance.deleteInbox(inboxId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#deleteInbox");
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
 **inboxId** | [**UUID**]()| inboxId |

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="doesInboxExist"></a>
# **doesInboxExist**
> InboxExistsDto doesInboxExist(emailAddress)

Does inbox exist

Check if inboxes exist by email address. Useful if you are sending emails to mailslurp addresses

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | Email address
    try {
      InboxExistsDto result = apiInstance.doesInboxExist(emailAddress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#doesInboxExist");
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
 **emailAddress** | **String**| Email address |

### Return type

[**InboxExistsDto**](InboxExistsDto)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="flushExpired"></a>
# **flushExpired**
> FlushExpiredInboxesResult flushExpired(before)

Remove expired inboxes

Remove any expired inboxes for your account (instead of waiting for scheduled removal on server)

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional expired at before flag to flush expired inboxes that have expired before the given time
    try {
      FlushExpiredInboxesResult result = apiInstance.flushExpired(before);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#flushExpired");
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
 **before** | **OffsetDateTime**| Optional expired at before flag to flush expired inboxes that have expired before the given time | [optional]

### Return type

[**FlushExpiredInboxesResult**](FlushExpiredInboxesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

<a name="getAllInboxes"></a>
# **getAllInboxes**
> PageInboxProjection getAllInboxes(before, favourite, page, search, since, size, sort, tag, teamAccess)

List All Inboxes Paginated

List inboxes in paginated form. The results are available on the &#x60;content&#x60; property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). You Can also filter by whether an inbox is favorited or use email address pattern. This method is the recommended way to query inboxes. The alternative &#x60;getInboxes&#x60; method returns a full list of inboxes but is limited to 100 results.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter by created before given date time
    Boolean favourite = false; // Boolean | Optionally filter results for favourites only
    Integer page = 0; // Integer | Optional page index in list pagination
    String search = "search_example"; // String | Optionally filter by search words partial matching ID, tags, name, and email address
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter by created after given date time
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String tag = "tag_example"; // String | Optionally filter by tags. Will return inboxes that include given tags
    Boolean teamAccess = false; // Boolean | DEPRECATED. Optionally filter by team access.
    try {
      PageInboxProjection result = apiInstance.getAllInboxes(before, favourite, page, search, since, size, sort, tag, teamAccess);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getAllInboxes");
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
 **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional]
 **favourite** | **Boolean**| Optionally filter results for favourites only | [optional] [default to false]
 **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0]
 **search** | **String**| Optionally filter by search words partial matching ID, tags, name, and email address | [optional]
 **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional]
 **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **tag** | **String**| Optionally filter by tags. Will return inboxes that include given tags | [optional]
 **teamAccess** | **Boolean**| DEPRECATED. Optionally filter by team access. | [optional] [default to false]

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="getEmails"></a>
# **getEmails**
> List&lt;EmailPreview&gt; getEmails(inboxId, before, delayTimeout, limit, minCount, retryTimeout, since, size, sort, unreadOnly)

Get emails in an Inbox. This method is not idempotent as it allows retries and waits if you want certain conditions to be met before returning. For simple listing and sorting of known emails use the email controller instead.

List emails that an inbox has received. Only emails that are sent to the inbox&#39;s email address will appear in the inbox. It may take several seconds for any email you send to an inbox&#39;s email address to appear in the inbox. To make this endpoint wait for a minimum number of emails use the &#x60;minCount&#x60; parameter. The server will retry the inbox database until the &#x60;minCount&#x60; is satisfied or the &#x60;retryTimeout&#x60; is reached

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Id of inbox that emails belongs to
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Exclude emails received after this ISO 8601 date time
    Long delayTimeout = 56L; // Long | delayTimeout
    Integer limit = 56; // Integer | Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller
    Long minCount = 56L; // Long | Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached.
    Long retryTimeout = 56L; // Long | Maximum milliseconds to spend retrying inbox database until minCount emails are returned
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Exclude emails received before this ISO 8601 date time
    Integer size = 56; // Integer | Alias for limit. Assessed first before assessing any passed limit.
    String sort = "sort_example"; // String | Sort the results by received date and direction ASC or DESC
    Boolean unreadOnly = true; // Boolean | unreadOnly
    try {
      List<EmailPreview> result = apiInstance.getEmails(inboxId, before, delayTimeout, limit, minCount, retryTimeout, since, size, sort, unreadOnly);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getEmails");
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
 **inboxId** | [**UUID**]()| Id of inbox that emails belongs to |
 **before** | **OffsetDateTime**| Exclude emails received after this ISO 8601 date time | [optional]
 **delayTimeout** | **Long**| delayTimeout | [optional]
 **limit** | **Integer**| Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller | [optional]
 **minCount** | **Long**| Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached. | [optional]
 **retryTimeout** | **Long**| Maximum milliseconds to spend retrying inbox database until minCount emails are returned | [optional]
 **since** | **OffsetDateTime**| Exclude emails received before this ISO 8601 date time | [optional]
 **size** | **Integer**| Alias for limit. Assessed first before assessing any passed limit. | [optional]
 **sort** | **String**| Sort the results by received date and direction ASC or DESC | [optional] [enum: ASC, DESC]
 **unreadOnly** | **Boolean**| unreadOnly | [optional]

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="getInbox"></a>
# **getInbox**
> Inbox getInbox(inboxId)

Get Inbox. Returns properties of an inbox.

Returns an inbox&#39;s properties, including its email address and ID.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    try {
      Inbox result = apiInstance.getInbox(inboxId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInbox");
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
 **inboxId** | [**UUID**]()| inboxId |

### Return type

[**Inbox**](Inbox)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="getInboxEmailsPaginated"></a>
# **getInboxEmailsPaginated**
> PageEmailPreview getInboxEmailsPaginated(inboxId, before, page, since, size, sort)

Get inbox emails paginated

Get a paginated list of emails in an inbox. Does not hold connections open.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | Id of inbox that emails belongs to
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter by received before given date time
    Integer page = 0; // Integer | Optional page index in inbox emails list pagination
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter by received after given date time
    Integer size = 20; // Integer | Optional page size in inbox emails list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageEmailPreview result = apiInstance.getInboxEmailsPaginated(inboxId, before, page, since, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxEmailsPaginated");
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
 **inboxId** | [**UUID**]()| Id of inbox that emails belongs to |
 **before** | **OffsetDateTime**| Optional filter by received before given date time | [optional]
 **page** | **Integer**| Optional page index in inbox emails list pagination | [optional] [default to 0]
 **since** | **OffsetDateTime**| Optional filter by received after given date time | [optional]
 **size** | **Integer**| Optional page size in inbox emails list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageEmailPreview**](PageEmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="getInboxSentEmails"></a>
# **getInboxSentEmails**
> PageSentEmailProjection getInboxSentEmails(inboxId, before, page, searchFilter, since, size, sort)

Get Inbox Sent Emails

Returns an inbox&#39;s sent email receipts. Call individual sent email endpoints for more details. Note for privacy reasons the full body of sent emails is never stored. An MD5 hash hex is available for comparison instead.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter by sent before given date time
    Integer page = 0; // Integer | Optional page index in inbox sent email list pagination
    String searchFilter = "searchFilter_example"; // String | Optional sent email search
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter by sent after given date time
    Integer size = 20; // Integer | Optional page size in inbox sent email list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageSentEmailProjection result = apiInstance.getInboxSentEmails(inboxId, before, page, searchFilter, since, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxSentEmails");
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
 **inboxId** | [**UUID**]()| inboxId |
 **before** | **OffsetDateTime**| Optional filter by sent before given date time | [optional]
 **page** | **Integer**| Optional page index in inbox sent email list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional sent email search | [optional]
 **since** | **OffsetDateTime**| Optional filter by sent after given date time | [optional]
 **size** | **Integer**| Optional page size in inbox sent email list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="getInboxTags"></a>
# **getInboxTags**
> List&lt;String&gt; getInboxTags()

Get inbox tags

Get all inbox tags

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      List<String> result = apiInstance.getInboxTags();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxTags");
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

**List&lt;String&gt;**

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="getInboxes"></a>
# **getInboxes**
> List&lt;Inbox&gt; getInboxes(before, since, size, sort)

List Inboxes and email addresses

List the inboxes you have created. Note use of the more advanced &#x60;getAllEmails&#x60; is recommended and allows paginated access using a limit and sort parameter.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter by created before given date time
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter by created after given date time
    Integer size = 100; // Integer | Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated `getAllEmails` for larger queries.
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      List<Inbox> result = apiInstance.getInboxes(before, since, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxes");
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
 **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional]
 **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional]
 **size** | **Integer**| Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated &#x60;getAllEmails&#x60; for larger queries. | [optional] [default to 100]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**List&lt;Inbox&gt;**](Inbox)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="getOrganizationInboxes"></a>
# **getOrganizationInboxes**
> PageOrganizationInboxProjection getOrganizationInboxes(before, page, searchFilter, since, size, sort)

List Organization Inboxes Paginated

List organization inboxes in paginated form. These are inboxes created with &#x60;allowTeamAccess&#x60; flag enabled. Organization inboxes are &#x60;readOnly&#x60; for non-admin users. The results are available on the &#x60;content&#x60; property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). 

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter by created before given date time
    Integer page = 0; // Integer | Optional page index in list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter by created after given date time
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageOrganizationInboxProjection result = apiInstance.getOrganizationInboxes(before, page, searchFilter, since, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getOrganizationInboxes");
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
 **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional]
 **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional]
 **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageOrganizationInboxProjection**](PageOrganizationInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="listInboxRulesets"></a>
# **listInboxRulesets**
> PageInboxRulesetDto listInboxRulesets(inboxId, before, page, searchFilter, since, size, sort)

List inbox rulesets

List all rulesets attached to an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter by created before given date time
    Integer page = 0; // Integer | Optional page index in inbox ruleset list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter by created after given date time
    Integer size = 20; // Integer | Optional page size in inbox ruleset list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxRulesetDto result = apiInstance.listInboxRulesets(inboxId, before, page, searchFilter, since, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#listInboxRulesets");
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
 **inboxId** | [**UUID**]()| inboxId |
 **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional]
 **page** | **Integer**| Optional page index in inbox ruleset list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional]
 **size** | **Integer**| Optional page size in inbox ruleset list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageInboxRulesetDto**](PageInboxRulesetDto)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="listInboxTrackingPixels"></a>
# **listInboxTrackingPixels**
> PageTrackingPixelProjection listInboxTrackingPixels(inboxId, before, page, searchFilter, since, size, sort)

List inbox tracking pixels

List all tracking pixels sent from an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Optional filter by created before given date time
    Integer page = 0; // Integer | Optional page index in inbox tracking pixel list pagination
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Optional filter by created after given date time
    Integer size = 20; // Integer | Optional page size in inbox tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageTrackingPixelProjection result = apiInstance.listInboxTrackingPixels(inboxId, before, page, searchFilter, since, size, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#listInboxTrackingPixels");
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
 **inboxId** | [**UUID**]()| inboxId |
 **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional]
 **page** | **Integer**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0]
 **searchFilter** | **String**| Optional search filter | [optional]
 **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional]
 **size** | **Integer**| Optional page size in inbox tracking pixel list pagination | [optional] [default to 20]
 **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="sendEmail"></a>
# **sendEmail**
> sendEmail(inboxId, sendEmailOptions)

Send Email

Send an email from an inbox&#39;s email address.  The request body should contain the &#x60;SendEmailOptions&#x60; that include recipients, attachments, body etc. See &#x60;SendEmailOptions&#x60; for all available properties. Note the &#x60;inboxId&#x60; refers to the inbox&#39;s id not the inbox&#39;s email address. See https://www.mailslurp.com/guides/ for more information on how to send emails. This method does not return a sent email entity due to legacy reasons. To send and get a sent email as returned response use the sister method &#x60;sendEmailAndConfirm&#x60;.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | ID of the inbox you want to send the email from
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | Options for the email
    try {
      apiInstance.sendEmail(inboxId, sendEmailOptions);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#sendEmail");
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
 **inboxId** | [**UUID**]()| ID of the inbox you want to send the email from |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)| Options for the email | [optional]

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
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="sendEmailAndConfirm"></a>
# **sendEmailAndConfirm**
> SentEmailDto sendEmailAndConfirm(inboxId, sendEmailOptions)

Send email and return sent confirmation

Sister method for standard &#x60;sendEmail&#x60; method with the benefit of returning a &#x60;SentEmail&#x60; entity confirming the successful sending of the email with a link to the sent object created for it.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | ID of the inbox you want to send the email from
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | Options for the email
    try {
      SentEmailDto result = apiInstance.sendEmailAndConfirm(inboxId, sendEmailOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#sendEmailAndConfirm");
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
 **inboxId** | [**UUID**]()| ID of the inbox you want to send the email from |
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)| Options for the email | [optional]

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="sendTestEmail"></a>
# **sendTestEmail**
> sendTestEmail(inboxId)

Send a test email to inbox

Send an inbox a test email to test email receiving is working

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    try {
      apiInstance.sendTestEmail(inboxId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#sendTestEmail");
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
 **inboxId** | [**UUID**]()| inboxId |

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
**201** | Created |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

<a name="setInboxFavourited"></a>
# **setInboxFavourited**
> Inbox setInboxFavourited(inboxId, setInboxFavouritedOptions)

Set inbox favourited state

Set and return new favourite state for an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    SetInboxFavouritedOptions setInboxFavouritedOptions = new SetInboxFavouritedOptions(); // SetInboxFavouritedOptions | setInboxFavouritedOptions
    try {
      Inbox result = apiInstance.setInboxFavourited(inboxId, setInboxFavouritedOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#setInboxFavourited");
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
 **inboxId** | [**UUID**]()| inboxId |
 **setInboxFavouritedOptions** | [**SetInboxFavouritedOptions**](SetInboxFavouritedOptions)| setInboxFavouritedOptions |

### Return type

[**Inbox**](Inbox)

### Authorization

[API_KEY](../README#API_KEY)

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

<a name="updateInbox"></a>
# **updateInbox**
> Inbox updateInbox(inboxId, updateInboxOptions)

Update Inbox. Change name and description. Email address is not editable.

Update editable fields on an inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.InboxControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = new UUID(); // UUID | inboxId
    UpdateInboxOptions updateInboxOptions = new UpdateInboxOptions(); // UpdateInboxOptions | updateInboxOptions
    try {
      Inbox result = apiInstance.updateInbox(inboxId, updateInboxOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#updateInbox");
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
 **inboxId** | [**UUID**]()| inboxId |
 **updateInboxOptions** | [**UpdateInboxOptions**](UpdateInboxOptions)| updateInboxOptions |

### Return type

[**Inbox**](Inbox)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |

