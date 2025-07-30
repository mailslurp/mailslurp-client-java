# InboxControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelScheduledJob**](InboxControllerApi#cancelScheduledJob) | **DELETE** /inboxes/scheduled-jobs/{jobId} | Cancel a scheduled email job |
| [**createInbox**](InboxControllerApi#createInbox) | **POST** /inboxes | Create an inbox email address. An inbox has a real email address and can send and receive emails. Inboxes can be either &#x60;SMTP&#x60; or &#x60;HTTP&#x60; inboxes. |
| [**createInboxRuleset**](InboxControllerApi#createInboxRuleset) | **POST** /inboxes/{inboxId}/rulesets | Create an inbox ruleset |
| [**createInboxWithDefaults**](InboxControllerApi#createInboxWithDefaults) | **POST** /inboxes/withDefaults | Create an inbox with default options. Uses MailSlurp domain pool address and is private. |
| [**createInboxWithOptions**](InboxControllerApi#createInboxWithOptions) | **POST** /inboxes/withOptions | Create an inbox with options. Extended options for inbox creation. |
| [**deleteAllInboxEmails**](InboxControllerApi#deleteAllInboxEmails) | **DELETE** /inboxes/{inboxId}/deleteAllInboxEmails | Delete all emails in a given inboxes. |
| [**deleteAllInboxes**](InboxControllerApi#deleteAllInboxes) | **DELETE** /inboxes | Delete all inboxes |
| [**deleteAllInboxesByDescription**](InboxControllerApi#deleteAllInboxesByDescription) | **DELETE** /inboxes/by-description | Delete inboxes by description |
| [**deleteAllInboxesByName**](InboxControllerApi#deleteAllInboxesByName) | **DELETE** /inboxes/by-name | Delete inboxes by name |
| [**deleteAllInboxesByTag**](InboxControllerApi#deleteAllInboxesByTag) | **DELETE** /inboxes/by-tag | Delete inboxes by tag |
| [**deleteInbox**](InboxControllerApi#deleteInbox) | **DELETE** /inboxes/{inboxId} | Delete inbox |
| [**doesInboxExist**](InboxControllerApi#doesInboxExist) | **GET** /inboxes/exists | Does inbox exist |
| [**doesInboxHaveAutomations**](InboxControllerApi#doesInboxHaveAutomations) | **GET** /inboxes/automations | Does inbox have automations |
| [**flushExpired**](InboxControllerApi#flushExpired) | **DELETE** /inboxes/expired | Remove expired inboxes |
| [**getAllInboxes**](InboxControllerApi#getAllInboxes) | **GET** /inboxes/paginated | List All Inboxes Paginated |
| [**getAllInboxesOffsetPaginated**](InboxControllerApi#getAllInboxesOffsetPaginated) | **GET** /inboxes/offset-paginated | List All Inboxes Offset Paginated |
| [**getAllPlusAddresses**](InboxControllerApi#getAllPlusAddresses) | **GET** /inboxes/plus-addresses | Get all sub address plus address aliases for an inbox |
| [**getAllScheduledJobs**](InboxControllerApi#getAllScheduledJobs) | **GET** /inboxes/scheduled-jobs | Get all scheduled email sending jobs for account |
| [**getDeliveryStatusesByInboxId**](InboxControllerApi#getDeliveryStatusesByInboxId) | **GET** /inboxes/{inboxId}/delivery-status |  |
| [**getEmails**](InboxControllerApi#getEmails) | **GET** /inboxes/{inboxId}/emails | Get emails in an Inbox. This method is not idempotent as it allows retries and waits if you want certain conditions to be met before returning. For simple listing and sorting of known emails use the email controller instead. |
| [**getImapAccess**](InboxControllerApi#getImapAccess) | **GET** /inboxes/imap-access |  |
| [**getImapSmtpAccess**](InboxControllerApi#getImapSmtpAccess) | **GET** /inboxes/imap-smtp-access |  |
| [**getImapSmtpAccessEnv**](InboxControllerApi#getImapSmtpAccessEnv) | **GET** /inboxes/imap-smtp-access/env |  |
| [**getImapSmtpAccessServers**](InboxControllerApi#getImapSmtpAccessServers) | **GET** /inboxes/imap-smtp-access/servers |  |
| [**getInbox**](InboxControllerApi#getInbox) | **GET** /inboxes/{inboxId} | Get Inbox. Returns properties of an inbox. |
| [**getInboxByEmailAddress**](InboxControllerApi#getInboxByEmailAddress) | **GET** /inboxes/byEmailAddress | Search for an inbox with the provided email address |
| [**getInboxByName**](InboxControllerApi#getInboxByName) | **GET** /inboxes/byName | Search for an inbox with the given name |
| [**getInboxCount**](InboxControllerApi#getInboxCount) | **GET** /inboxes/count | Get total inbox count |
| [**getInboxEmailCount**](InboxControllerApi#getInboxEmailCount) | **GET** /inboxes/{inboxId}/emails/count | Get email count in inbox |
| [**getInboxEmailsPaginated**](InboxControllerApi#getInboxEmailsPaginated) | **GET** /inboxes/{inboxId}/emails/paginated | Get inbox emails paginated |
| [**getInboxIds**](InboxControllerApi#getInboxIds) | **GET** /inboxes/ids | Get all inbox IDs |
| [**getInboxPlusAddress**](InboxControllerApi#getInboxPlusAddress) | **GET** /inboxes/{inboxId}/plus-addresses/{plusAddressId} | Get sub address plus address for an inbox |
| [**getInboxPlusAddressById**](InboxControllerApi#getInboxPlusAddressById) | **GET** /inboxes/plus-addresses/{plusAddressId} | Get sub address plus address by ID |
| [**getInboxPlusAddressEmails**](InboxControllerApi#getInboxPlusAddressEmails) | **GET** /inboxes/{inboxId}/plus-addresses/emails | Get emails for a given inbox plus address |
| [**getInboxPlusAddressEmailsForPlusAddressId**](InboxControllerApi#getInboxPlusAddressEmailsForPlusAddressId) | **GET** /inboxes/{inboxId}/plus-addresses/{plusAddressId}/emails | Get emails for a given inbox plus address |
| [**getInboxPlusAddresses**](InboxControllerApi#getInboxPlusAddresses) | **GET** /inboxes/{inboxId}/plus-addresses | Get sub address plus address aliases for an inbox |
| [**getInboxSentCount**](InboxControllerApi#getInboxSentCount) | **GET** /inboxes/{inboxId}/sent/count | Get sent email count in inbox |
| [**getInboxSentEmails**](InboxControllerApi#getInboxSentEmails) | **GET** /inboxes/{inboxId}/sent | Get Inbox Sent Emails |
| [**getInboxTags**](InboxControllerApi#getInboxTags) | **GET** /inboxes/tags | Get inbox tags |
| [**getInboxTagsPaginated**](InboxControllerApi#getInboxTagsPaginated) | **GET** /inboxes/tags/paginated | Get inbox tags paginated |
| [**getInboxes**](InboxControllerApi#getInboxes) | **GET** /inboxes | List Inboxes and email addresses |
| [**getInboxesByTag**](InboxControllerApi#getInboxesByTag) | **GET** /inboxes/tags/inboxes | Get inboxes for a tag |
| [**getLatestEmailInInbox**](InboxControllerApi#getLatestEmailInInbox) | **GET** /inboxes/getLatestEmail | Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet. |
| [**getOrganizationInboxes**](InboxControllerApi#getOrganizationInboxes) | **GET** /inboxes/organization | List Organization Inboxes Paginated |
| [**getOutboxes**](InboxControllerApi#getOutboxes) | **GET** /inboxes/outboxes | List all inboxes with sent emails |
| [**getScheduledJob**](InboxControllerApi#getScheduledJob) | **GET** /inboxes/scheduled-jobs/{jobId} | Get a scheduled email job |
| [**getScheduledJobsByInboxId**](InboxControllerApi#getScheduledJobsByInboxId) | **GET** /inboxes/{inboxId}/scheduled-jobs | Get all scheduled email sending jobs for the inbox |
| [**getSmtpAccess**](InboxControllerApi#getSmtpAccess) | **GET** /inboxes/smtp-access |  |
| [**isEmailAddressAvailable**](InboxControllerApi#isEmailAddressAvailable) | **POST** /inboxes/available | Is email address available |
| [**listInboxRulesets**](InboxControllerApi#listInboxRulesets) | **GET** /inboxes/{inboxId}/rulesets | List inbox rulesets |
| [**listInboxTrackingPixels**](InboxControllerApi#listInboxTrackingPixels) | **GET** /inboxes/{inboxId}/tracking-pixels | List inbox tracking pixels |
| [**searchInboxes**](InboxControllerApi#searchInboxes) | **POST** /inboxes/search | Search all inboxes and return matching inboxes |
| [**sendEmail**](InboxControllerApi#sendEmail) | **POST** /inboxes/{inboxId} | Send Email |
| [**sendEmailAndConfirm**](InboxControllerApi#sendEmailAndConfirm) | **POST** /inboxes/{inboxId}/confirm | Send email and return sent confirmation |
| [**sendEmailWithQueue**](InboxControllerApi#sendEmailWithQueue) | **POST** /inboxes/{inboxId}/with-queue | Send email with queue |
| [**sendSmtpEnvelope**](InboxControllerApi#sendSmtpEnvelope) | **POST** /inboxes/{inboxId}/smtp-envelope | Send email using an SMTP mail envelope and message body and return sent confirmation |
| [**sendTestEmail**](InboxControllerApi#sendTestEmail) | **POST** /inboxes/{inboxId}/send-test-email | Send a test email to inbox |
| [**sendWithSchedule**](InboxControllerApi#sendWithSchedule) | **POST** /inboxes/{inboxId}/with-schedule | Send email with with delay or schedule |
| [**setInboxFavourited**](InboxControllerApi#setInboxFavourited) | **PUT** /inboxes/{inboxId}/favourite | Set inbox favourited state |
| [**updateImapAccess**](InboxControllerApi#updateImapAccess) | **PATCH** /inboxes/imap-access |  |
| [**updateInbox**](InboxControllerApi#updateInbox) | **PATCH** /inboxes/{inboxId} | Update Inbox. Change name and description. Email address is not editable. |
| [**updateSmtpAccess**](InboxControllerApi#updateSmtpAccess) | **PATCH** /inboxes/smtp-access |  |


<a id="cancelScheduledJob"></a>
# **cancelScheduledJob**
> ScheduledJobDto cancelScheduledJob(jobId).execute();

Cancel a scheduled email job

Get a scheduled email job and cancel it. Will fail if status of job is already cancelled, failed, or complete.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      ScheduledJobDto result = apiInstance.cancelScheduledJob(jobId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#cancelScheduledJob");
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

[**ScheduledJobDto**](ScheduledJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createInbox"></a>
# **createInbox**
> InboxDto createInbox().emailAddress(emailAddress).tags(tags).name(name).description(description).useDomainPool(useDomainPool).favourite(favourite).expiresAt(expiresAt).expiresIn(expiresIn).allowTeamAccess(allowTeamAccess).inboxType(inboxType).virtualInbox(virtualInbox).useShortAddress(useShortAddress).domainId(domainId).domainName(domainName).prefix(prefix).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as `123@mailslurp.com`. If you use the `useDomainPool` option when the email address is null it will generate an email address with a more varied domain ending such as `123@mailslurp.info` or `123@mailslurp.biz`. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so `SMTP` inboxes will only work with `SMTP` type domains. Avoid `SMTP` inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID.
    List<String> tags = Arrays.asList(); // List<String> | Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI.
    String name = "name_example"; // String | Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails.
    String description = "description_example"; // String | Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with
    Boolean useDomainPool = true; // Boolean | Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default `@mailslurp.com` email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in `@mailslurp.{world,info,xyz,...}` . This means a TLD is randomly selecting from a list of `.biz`, `.info`, `.xyz` etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of `@mailslurp.com` or custom email address provided by the emailAddress field. Note this feature is only available for `HTTP` inbox types.
    Boolean favourite = true; // Boolean | Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering
    OffsetDateTime expiresAt = OffsetDateTime.now(); // OffsetDateTime | Optional inbox expiration date. If null then this inbox is permanent and the emails in it won't be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd'T'HH:mm:ss.SSSXXX.
    Long expiresIn = 56L; // Long | Number of milliseconds that inbox should exist for
    Boolean allowTeamAccess = true; // Boolean | DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization.
    String inboxType = "HTTP_INBOX"; // String | HTTP (default) or SMTP inbox type. HTTP inboxes are default and best solution for most cases. SMTP inboxes are more reliable for public inbound email consumption (but do not support sending emails). When using custom domains the domain type must match the inbox type. HTTP inboxes are processed by AWS SES while SMTP inboxes use a custom mail server running at `mxslurp.click`.
    Boolean virtualInbox = true; // Boolean | Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending.
    Boolean useShortAddress = true; // Boolean | Use a shorter email address under 31 characters
    UUID domainId = UUID.randomUUID(); // UUID | ID of custom domain to use for email address.
    String domainName = "domainName_example"; // String | FQDN domain name for the domain you have verified. Will be appended with a randomly assigned recipient name. Use the `emailAddress` option instead to specify the full custom inbox.
    String prefix = "prefix_example"; // String | Prefix to add before the email address for easier labelling or identification.
    try {
      InboxDto result = apiInstance.createInbox()
            .emailAddress(emailAddress)
            .tags(tags)
            .name(name)
            .description(description)
            .useDomainPool(useDomainPool)
            .favourite(favourite)
            .expiresAt(expiresAt)
            .expiresIn(expiresIn)
            .allowTeamAccess(allowTeamAccess)
            .inboxType(inboxType)
            .virtualInbox(virtualInbox)
            .useShortAddress(useShortAddress)
            .domainId(domainId)
            .domainName(domainName)
            .prefix(prefix)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailAddress** | **String**| A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as &#x60;123@mailslurp.com&#x60;. If you use the &#x60;useDomainPool&#x60; option when the email address is null it will generate an email address with a more varied domain ending such as &#x60;123@mailslurp.info&#x60; or &#x60;123@mailslurp.biz&#x60;. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so &#x60;SMTP&#x60; inboxes will only work with &#x60;SMTP&#x60; type domains. Avoid &#x60;SMTP&#x60; inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. | [optional] |
| **tags** | [**List&lt;String&gt;**](String)| Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. | [optional] |
| **name** | **String**| Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails. | [optional] |
| **description** | **String**| Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with | [optional] |
| **useDomainPool** | **Boolean**| Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default &#x60;@mailslurp.com&#x60; email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in &#x60;@mailslurp.{world,info,xyz,...}&#x60; . This means a TLD is randomly selecting from a list of &#x60;.biz&#x60;, &#x60;.info&#x60;, &#x60;.xyz&#x60; etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of &#x60;@mailslurp.com&#x60; or custom email address provided by the emailAddress field. Note this feature is only available for &#x60;HTTP&#x60; inbox types. | [optional] |
| **favourite** | **Boolean**| Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering | [optional] |
| **expiresAt** | **OffsetDateTime**| Optional inbox expiration date. If null then this inbox is permanent and the emails in it won&#39;t be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX. | [optional] |
| **expiresIn** | **Long**| Number of milliseconds that inbox should exist for | [optional] |
| **allowTeamAccess** | **Boolean**| DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization. | [optional] |
| **inboxType** | **String**| HTTP (default) or SMTP inbox type. HTTP inboxes are default and best solution for most cases. SMTP inboxes are more reliable for public inbound email consumption (but do not support sending emails). When using custom domains the domain type must match the inbox type. HTTP inboxes are processed by AWS SES while SMTP inboxes use a custom mail server running at &#x60;mxslurp.click&#x60;. | [optional] [enum: HTTP_INBOX, SMTP_INBOX] |
| **virtualInbox** | **Boolean**| Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending. | [optional] |
| **useShortAddress** | **Boolean**| Use a shorter email address under 31 characters | [optional] |
| **domainId** | **UUID**| ID of custom domain to use for email address. | [optional] |
| **domainName** | **String**| FQDN domain name for the domain you have verified. Will be appended with a randomly assigned recipient name. Use the &#x60;emailAddress&#x60; option instead to specify the full custom inbox. | [optional] |
| **prefix** | **String**| Prefix to add before the email address for easier labelling or identification. | [optional] |

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

<a id="createInboxRuleset"></a>
# **createInboxRuleset**
> InboxRulesetDto createInboxRuleset(inboxId, createInboxRulesetOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | inboxId
    CreateInboxRulesetOptions createInboxRulesetOptions = new CreateInboxRulesetOptions(); // CreateInboxRulesetOptions | 
    try {
      InboxRulesetDto result = apiInstance.createInboxRuleset(inboxId, createInboxRulesetOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| inboxId | |
| **createInboxRulesetOptions** | [**CreateInboxRulesetOptions**](CreateInboxRulesetOptions)|  | |

### Return type

[**InboxRulesetDto**](InboxRulesetDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createInboxWithDefaults"></a>
# **createInboxWithDefaults**
> InboxDto createInboxWithDefaults().execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      InboxDto result = apiInstance.createInboxWithDefaults()
            .execute();
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

<a id="createInboxWithOptions"></a>
# **createInboxWithOptions**
> InboxDto createInboxWithOptions(createInboxDto).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    CreateInboxDto createInboxDto = new CreateInboxDto(); // CreateInboxDto | 
    try {
      InboxDto result = apiInstance.createInboxWithOptions(createInboxDto)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createInboxDto** | [**CreateInboxDto**](CreateInboxDto)|  | |

### Return type

[**InboxDto**](InboxDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteAllInboxEmails"></a>
# **deleteAllInboxEmails**
> deleteAllInboxEmails(inboxId).execute();

Delete all emails in a given inboxes.

Deletes all emails in an inbox. Be careful as emails cannot be recovered

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAllInboxEmails(inboxId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#deleteAllInboxEmails");
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
| **inboxId** | **UUID**|  | |

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

<a id="deleteAllInboxes"></a>
# **deleteAllInboxes**
> deleteAllInboxes().execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      apiInstance.deleteAllInboxes()
            .execute();
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
| **204** | No Content |  -  |

<a id="deleteAllInboxesByDescription"></a>
# **deleteAllInboxesByDescription**
> deleteAllInboxesByDescription(description).execute();

Delete inboxes by description

Permanently delete all inboxes by description

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String description = "description_example"; // String | 
    try {
      apiInstance.deleteAllInboxesByDescription(description)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#deleteAllInboxesByDescription");
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
| **description** | **String**|  | |

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

<a id="deleteAllInboxesByName"></a>
# **deleteAllInboxesByName**
> deleteAllInboxesByName(name).execute();

Delete inboxes by name

Permanently delete all inboxes by name

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      apiInstance.deleteAllInboxesByName(name)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#deleteAllInboxesByName");
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

<a id="deleteAllInboxesByTag"></a>
# **deleteAllInboxesByTag**
> deleteAllInboxesByTag(tag).execute();

Delete inboxes by tag

Permanently delete all inboxes by tag

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String tag = "tag_example"; // String | 
    try {
      apiInstance.deleteAllInboxesByTag(tag)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#deleteAllInboxesByTag");
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
| **tag** | **String**|  | |

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

<a id="deleteInbox"></a>
# **deleteInbox**
> deleteInbox(inboxId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteInbox(inboxId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | |

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

<a id="doesInboxExist"></a>
# **doesInboxExist**
> InboxExistsDto doesInboxExist(emailAddress).allowCatchAll(allowCatchAll).ipAddress(ipAddress).sender(sender).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | Email address
    Boolean allowCatchAll = true; // Boolean | Allow catch all
    String ipAddress = "ipAddress_example"; // String | IP address
    String sender = "sender_example"; // String | Sender
    try {
      InboxExistsDto result = apiInstance.doesInboxExist(emailAddress)
            .allowCatchAll(allowCatchAll)
            .ipAddress(ipAddress)
            .sender(sender)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **emailAddress** | **String**| Email address | |
| **allowCatchAll** | **Boolean**| Allow catch all | [optional] |
| **ipAddress** | **String**| IP address | [optional] |
| **sender** | **String**| Sender | [optional] |

### Return type

[**InboxExistsDto**](InboxExistsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="doesInboxHaveAutomations"></a>
# **doesInboxHaveAutomations**
> doesInboxHaveAutomations().execute();

Does inbox have automations

Check if an inbox has automations.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      apiInstance.doesInboxHaveAutomations()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#doesInboxHaveAutomations");
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
| **201** | Created |  -  |

<a id="flushExpired"></a>
# **flushExpired**
> FlushExpiredInboxesResult flushExpired().before(before).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional expired at before flag to flush expired inboxes that have expired before the given time
    try {
      FlushExpiredInboxesResult result = apiInstance.flushExpired()
            .before(before)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **before** | **OffsetDateTime**| Optional expired at before flag to flush expired inboxes that have expired before the given time | [optional] |

### Return type

[**FlushExpiredInboxesResult**](FlushExpiredInboxesResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllInboxes"></a>
# **getAllInboxes**
> PageInboxProjection getAllInboxes().page(page).size(size).sort(sort).favourite(favourite).search(search).tag(tag).teamAccess(teamAccess).since(since).before(before).inboxType(inboxType).inboxFunction(inboxFunction).domainId(domainId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean favourite = false; // Boolean | Optionally filter results for favourites only
    String search = "search_example"; // String | Optionally filter by search words partial matching ID, tags, name, and email address
    String tag = "tag_example"; // String | Optionally filter by tags. Will return inboxes that include given tags
    Boolean teamAccess = true; // Boolean | DEPRECATED. Optionally filter by team access.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    String inboxType = "HTTP_INBOX"; // String | Optional filter by inbox type
    String inboxFunction = "ALIAS"; // String | Optional filter by inbox function
    UUID domainId = UUID.randomUUID(); // UUID | Optional domain ID filter
    try {
      PageInboxProjection result = apiInstance.getAllInboxes()
            .page(page)
            .size(size)
            .sort(sort)
            .favourite(favourite)
            .search(search)
            .tag(tag)
            .teamAccess(teamAccess)
            .since(since)
            .before(before)
            .inboxType(inboxType)
            .inboxFunction(inboxFunction)
            .domainId(domainId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **favourite** | **Boolean**| Optionally filter results for favourites only | [optional] [default to false] |
| **search** | **String**| Optionally filter by search words partial matching ID, tags, name, and email address | [optional] |
| **tag** | **String**| Optionally filter by tags. Will return inboxes that include given tags | [optional] |
| **teamAccess** | **Boolean**| DEPRECATED. Optionally filter by team access. | [optional] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |
| **inboxType** | **String**| Optional filter by inbox type | [optional] [enum: HTTP_INBOX, SMTP_INBOX] |
| **inboxFunction** | **String**| Optional filter by inbox function | [optional] [enum: ALIAS, THREAD, CATCH_ALL, CONNECTOR, ACCOUNT, GUEST, OAUTH_CONNECTION_GMAIL] |
| **domainId** | **UUID**| Optional domain ID filter | [optional] |

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllInboxesOffsetPaginated"></a>
# **getAllInboxesOffsetPaginated**
> PageInboxProjection getAllInboxesOffsetPaginated().page(page).size(size).sort(sort).favourite(favourite).search(search).tag(tag).teamAccess(teamAccess).since(since).before(before).inboxType(inboxType).inboxFunction(inboxFunction).domainId(domainId).execute();

List All Inboxes Offset Paginated

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean favourite = false; // Boolean | Optionally filter results for favourites only
    String search = "search_example"; // String | Optionally filter by search words partial matching ID, tags, name, and email address
    String tag = "tag_example"; // String | Optionally filter by tags. Will return inboxes that include given tags
    Boolean teamAccess = true; // Boolean | DEPRECATED. Optionally filter by team access.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    String inboxType = "HTTP_INBOX"; // String | Optional filter by inbox type
    String inboxFunction = "ALIAS"; // String | Optional filter by inbox function
    UUID domainId = UUID.randomUUID(); // UUID | Optional domain ID filter
    try {
      PageInboxProjection result = apiInstance.getAllInboxesOffsetPaginated()
            .page(page)
            .size(size)
            .sort(sort)
            .favourite(favourite)
            .search(search)
            .tag(tag)
            .teamAccess(teamAccess)
            .since(since)
            .before(before)
            .inboxType(inboxType)
            .inboxFunction(inboxFunction)
            .domainId(domainId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getAllInboxesOffsetPaginated");
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
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **favourite** | **Boolean**| Optionally filter results for favourites only | [optional] [default to false] |
| **search** | **String**| Optionally filter by search words partial matching ID, tags, name, and email address | [optional] |
| **tag** | **String**| Optionally filter by tags. Will return inboxes that include given tags | [optional] |
| **teamAccess** | **Boolean**| DEPRECATED. Optionally filter by team access. | [optional] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |
| **inboxType** | **String**| Optional filter by inbox type | [optional] [enum: HTTP_INBOX, SMTP_INBOX] |
| **inboxFunction** | **String**| Optional filter by inbox function | [optional] [enum: ALIAS, THREAD, CATCH_ALL, CONNECTOR, ACCOUNT, GUEST, OAUTH_CONNECTION_GMAIL] |
| **domainId** | **UUID**| Optional domain ID filter | [optional] |

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllPlusAddresses"></a>
# **getAllPlusAddresses**
> PagePlusAddressProjection getAllPlusAddresses().page(page).size(size).sort(sort).inboxId(inboxId).execute();

Get all sub address plus address aliases for an inbox

Returns paginated list of all plus alias addresses found for in account based on received emails that used the inbox address with a +xyz alias.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in inbox tracking pixel list pagination
    Integer size = 20; // Integer | Optional page size in inbox tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inboxId filter
    try {
      PagePlusAddressProjection result = apiInstance.getAllPlusAddresses()
            .page(page)
            .size(size)
            .sort(sort)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getAllPlusAddresses");
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
| **page** | **Integer**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox tracking pixel list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **inboxId** | **UUID**| Optional inboxId filter | [optional] |

### Return type

[**PagePlusAddressProjection**](PagePlusAddressProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAllScheduledJobs"></a>
# **getAllScheduledJobs**
> PageScheduledJobs getAllScheduledJobs().page(page).size(size).sort(sort).since(since).before(before).inboxId(inboxId).execute();

Get all scheduled email sending jobs for account

Schedule sending of emails using scheduled jobs. These can be inbox or account level.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in scheduled job list pagination
    Integer size = 20; // Integer | Optional page size in scheduled job list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    UUID inboxId = UUID.randomUUID(); // UUID | 
    try {
      PageScheduledJobs result = apiInstance.getAllScheduledJobs()
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getAllScheduledJobs");
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
| **page** | **Integer**| Optional page index in scheduled job list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in scheduled job list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **inboxId** | **UUID**|  | [optional] |

### Return type

[**PageScheduledJobs**](PageScheduledJobs)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliveryStatusesByInboxId"></a>
# **getDeliveryStatusesByInboxId**
> PageDeliveryStatus getDeliveryStatusesByInboxId(inboxId).page(page).size(size).sort(sort).since(since).before(before).execute();



Get all email delivery statuses for an inbox

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in delivery status list pagination
    Integer size = 20; // Integer | Optional page size in delivery status list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageDeliveryStatus result = apiInstance.getDeliveryStatusesByInboxId(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getDeliveryStatusesByInboxId");
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
| **inboxId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in delivery status list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in delivery status list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageDeliveryStatus**](PageDeliveryStatus)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmails"></a>
# **getEmails**
> List&lt;EmailPreview&gt; getEmails(inboxId).size(size).limit(limit).sort(sort).retryTimeout(retryTimeout).delayTimeout(delayTimeout).minCount(minCount).unreadOnly(unreadOnly).before(before).since(since).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of inbox that emails belongs to
    Integer size = 56; // Integer | Alias for limit. Assessed first before assessing any passed limit.
    Integer limit = 56; // Integer | Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller
    String sort = "ASC"; // String | Sort the results by received date and direction ASC or DESC
    Long retryTimeout = 56L; // Long | Maximum milliseconds to spend retrying inbox database until minCount emails are returned
    Long delayTimeout = 56L; // Long | 
    Long minCount = 56L; // Long | Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached.
    Boolean unreadOnly = true; // Boolean | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Exclude emails received after this ISO 8601 date time
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Exclude emails received before this ISO 8601 date time
    try {
      List<EmailPreview> result = apiInstance.getEmails(inboxId)
            .size(size)
            .limit(limit)
            .sort(sort)
            .retryTimeout(retryTimeout)
            .delayTimeout(delayTimeout)
            .minCount(minCount)
            .unreadOnly(unreadOnly)
            .before(before)
            .since(since)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| Id of inbox that emails belongs to | |
| **size** | **Integer**| Alias for limit. Assessed first before assessing any passed limit. | [optional] |
| **limit** | **Integer**| Limit the result set, ordered by received date time sort direction. Maximum 100. For more listing options see the email controller | [optional] |
| **sort** | **String**| Sort the results by received date and direction ASC or DESC | [optional] [enum: ASC, DESC] |
| **retryTimeout** | **Long**| Maximum milliseconds to spend retrying inbox database until minCount emails are returned | [optional] |
| **delayTimeout** | **Long**|  | [optional] |
| **minCount** | **Long**| Minimum acceptable email count. Will cause request to hang (and retry) until minCount is satisfied or retryTimeout is reached. | [optional] |
| **unreadOnly** | **Boolean**|  | [optional] |
| **before** | **OffsetDateTime**| Exclude emails received after this ISO 8601 date time | [optional] |
| **since** | **OffsetDateTime**| Exclude emails received before this ISO 8601 date time | [optional] |

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

<a id="getImapAccess"></a>
# **getImapAccess**
> ImapAccessDetails getImapAccess().inboxId(inboxId).execute();



Get IMAP access usernames and passwords

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID
    try {
      ImapAccessDetails result = apiInstance.getImapAccess()
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getImapAccess");
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
| **inboxId** | **UUID**| Inbox ID | [optional] |

### Return type

[**ImapAccessDetails**](ImapAccessDetails)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getImapSmtpAccess"></a>
# **getImapSmtpAccess**
> ImapSmtpAccessDetails getImapSmtpAccess().inboxId(inboxId).execute();



Get IMAP and SMTP access usernames and passwords

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID
    try {
      ImapSmtpAccessDetails result = apiInstance.getImapSmtpAccess()
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getImapSmtpAccess");
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
| **inboxId** | **UUID**| Inbox ID | [optional] |

### Return type

[**ImapSmtpAccessDetails**](ImapSmtpAccessDetails)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getImapSmtpAccessEnv"></a>
# **getImapSmtpAccessEnv**
> String getImapSmtpAccessEnv().inboxId(inboxId).execute();



Get IMAP and SMTP access details in .env format

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID
    try {
      String result = apiInstance.getImapSmtpAccessEnv()
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getImapSmtpAccessEnv");
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
| **inboxId** | **UUID**| Inbox ID | [optional] |

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getImapSmtpAccessServers"></a>
# **getImapSmtpAccessServers**
> ImapSmtpAccessServers getImapSmtpAccessServers().execute();



Get IMAP and SMTP server hosts

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      ImapSmtpAccessServers result = apiInstance.getImapSmtpAccessServers()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getImapSmtpAccessServers");
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

[**ImapSmtpAccessServers**](ImapSmtpAccessServers)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInbox"></a>
# **getInbox**
> InboxDto getInbox(inboxId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    try {
      InboxDto result = apiInstance.getInbox(inboxId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | |

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
| **200** | OK |  -  |

<a id="getInboxByEmailAddress"></a>
# **getInboxByEmailAddress**
> InboxByEmailAddressResult getInboxByEmailAddress(emailAddress).execute();

Search for an inbox with the provided email address

Get a inbox result by email address

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    try {
      InboxByEmailAddressResult result = apiInstance.getInboxByEmailAddress(emailAddress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxByEmailAddress");
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
| **emailAddress** | **String**|  | |

### Return type

[**InboxByEmailAddressResult**](InboxByEmailAddressResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxByName"></a>
# **getInboxByName**
> InboxByNameResult getInboxByName(name).execute();

Search for an inbox with the given name

Get a inbox result by name

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      InboxByNameResult result = apiInstance.getInboxByName(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxByName");
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

[**InboxByNameResult**](InboxByNameResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxCount"></a>
# **getInboxCount**
> CountDto getInboxCount().execute();

Get total inbox count

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      CountDto result = apiInstance.getInboxCount()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxCount");
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

<a id="getInboxEmailCount"></a>
# **getInboxEmailCount**
> CountDto getInboxEmailCount(inboxId).execute();

Get email count in inbox

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of inbox that emails belongs to
    try {
      CountDto result = apiInstance.getInboxEmailCount(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxEmailCount");
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
| **inboxId** | **UUID**| Id of inbox that emails belongs to | |

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

<a id="getInboxEmailsPaginated"></a>
# **getInboxEmailsPaginated**
> PageEmailPreview getInboxEmailsPaginated(inboxId).page(page).size(size).sort(sort).since(since).before(before).syncConnectors(syncConnectors).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of inbox that emails belongs to
    Integer page = 0; // Integer | Optional page index in inbox emails list pagination
    Integer size = 20; // Integer | Optional page size in inbox emails list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by received after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by received before given date time
    Boolean syncConnectors = true; // Boolean | Sync connectors before fetching emails
    try {
      PageEmailPreview result = apiInstance.getInboxEmailsPaginated(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .syncConnectors(syncConnectors)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| Id of inbox that emails belongs to | |
| **page** | **Integer**| Optional page index in inbox emails list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox emails list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Optional filter by received after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by received before given date time | [optional] |
| **syncConnectors** | **Boolean**| Sync connectors before fetching emails | [optional] |

### Return type

[**PageEmailPreview**](PageEmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxIds"></a>
# **getInboxIds**
> InboxIdsResult getInboxIds().execute();

Get all inbox IDs

Get list of inbox IDs

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    try {
      InboxIdsResult result = apiInstance.getInboxIds()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxIds");
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

[**InboxIdsResult**](InboxIdsResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlusAddress"></a>
# **getInboxPlusAddress**
> PlusAddressDto getInboxPlusAddress(plusAddressId, inboxId).execute();

Get sub address plus address for an inbox

Returns a plus address object based on emails that used the inbox address with a +xyz alias.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID plusAddressId = UUID.randomUUID(); // UUID | ID of the plus address you want to fetch
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to fetch
    try {
      PlusAddressDto result = apiInstance.getInboxPlusAddress(plusAddressId, inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxPlusAddress");
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
| **plusAddressId** | **UUID**| ID of the plus address you want to fetch | |
| **inboxId** | **UUID**| ID of the inbox you want to fetch | |

### Return type

[**PlusAddressDto**](PlusAddressDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlusAddressById"></a>
# **getInboxPlusAddressById**
> PlusAddressDto getInboxPlusAddressById(plusAddressId).inboxId(inboxId).execute();

Get sub address plus address by ID

Returns a plus address object based on emails that used the inbox address with a +xyz alias.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID plusAddressId = UUID.randomUUID(); // UUID | ID of the plus address you want to fetch
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to filter for
    try {
      PlusAddressDto result = apiInstance.getInboxPlusAddressById(plusAddressId)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxPlusAddressById");
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
| **plusAddressId** | **UUID**| ID of the plus address you want to fetch | |
| **inboxId** | **UUID**| ID of the inbox you want to filter for | [optional] |

### Return type

[**PlusAddressDto**](PlusAddressDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlusAddressEmails"></a>
# **getInboxPlusAddressEmails**
> PageEmailPreview getInboxPlusAddressEmails(plusAddress, inboxId).page(page).size(size).sort(sort).since(since).before(before).execute();

Get emails for a given inbox plus address

Returns paginated list of all emails for a given plus alias addresses found for an inbox based on received emails that used the inbox address with a +xyz alias.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String plusAddress = "plusAddress_example"; // String | The plus address to fetch emails for. If your inbox address is `123@test.com` and the email was sent to `123+abc@test.com` then the plus address is `abc`
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    Integer page = 0; // Integer | Optional page index in inbox tracking pixel list pagination
    Integer size = 20; // Integer | Optional page size in inbox tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    try {
      PageEmailPreview result = apiInstance.getInboxPlusAddressEmails(plusAddress, inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxPlusAddressEmails");
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
| **plusAddress** | **String**| The plus address to fetch emails for. If your inbox address is &#x60;123@test.com&#x60; and the email was sent to &#x60;123+abc@test.com&#x60; then the plus address is &#x60;abc&#x60; | |
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **page** | **Integer**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox tracking pixel list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |

### Return type

[**PageEmailPreview**](PageEmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlusAddressEmailsForPlusAddressId"></a>
# **getInboxPlusAddressEmailsForPlusAddressId**
> PageEmailPreview getInboxPlusAddressEmailsForPlusAddressId(plusAddressId, inboxId).page(page).size(size).sort(sort).since(since).before(before).execute();

Get emails for a given inbox plus address

Returns paginated list of all emails for a given plus alias addresses found for an inbox based on received emails that used the inbox address with a +xyz alias.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID plusAddressId = UUID.randomUUID(); // UUID | The plus address ID to fetch emails for.
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    Integer page = 0; // Integer | Optional page index in inbox tracking pixel list pagination
    Integer size = 20; // Integer | Optional page size in inbox tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    try {
      PageEmailPreview result = apiInstance.getInboxPlusAddressEmailsForPlusAddressId(plusAddressId, inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxPlusAddressEmailsForPlusAddressId");
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
| **plusAddressId** | **UUID**| The plus address ID to fetch emails for. | |
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **page** | **Integer**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox tracking pixel list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |

### Return type

[**PageEmailPreview**](PageEmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxPlusAddresses"></a>
# **getInboxPlusAddresses**
> PagePlusAddressProjection getInboxPlusAddresses(inboxId).page(page).size(size).sort(sort).execute();

Get sub address plus address aliases for an inbox

Returns paginated list of all plus alias addresses found for an inbox based on received emails that used the inbox address with a +xyz alias.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    Integer page = 0; // Integer | Optional page index in inbox tracking pixel list pagination
    Integer size = 20; // Integer | Optional page size in inbox tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PagePlusAddressProjection result = apiInstance.getInboxPlusAddresses(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxPlusAddresses");
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
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **page** | **Integer**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox tracking pixel list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PagePlusAddressProjection**](PagePlusAddressProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxSentCount"></a>
# **getInboxSentCount**
> CountDto getInboxSentCount(inboxId).execute();

Get sent email count in inbox

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Id of inbox that emails were sent from
    try {
      CountDto result = apiInstance.getInboxSentCount(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxSentCount");
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
| **inboxId** | **UUID**| Id of inbox that emails were sent from | |

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

<a id="getInboxSentEmails"></a>
# **getInboxSentEmails**
> PageSentEmailProjection getInboxSentEmails(inboxId).page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in inbox sent email list pagination
    Integer size = 20; // Integer | Optional page size in inbox sent email list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional sent email search
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by sent after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by sent before given date time
    try {
      PageSentEmailProjection result = apiInstance.getInboxSentEmails(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in inbox sent email list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox sent email list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional sent email search | [optional] |
| **since** | **OffsetDateTime**| Optional filter by sent after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by sent before given date time | [optional] |

### Return type

[**PageSentEmailProjection**](PageSentEmailProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxTags"></a>
# **getInboxTags**
> List&lt;String&gt; getInboxTags().page(page).size(size).sort(sort).searchFilter(searchFilter).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    try {
      List<String> result = apiInstance.getInboxTags()
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxTagsPaginated"></a>
# **getInboxTagsPaginated**
> PageInboxTags getInboxTagsPaginated().page(page).size(size).sort(sort).searchFilter(searchFilter).execute();

Get inbox tags paginated

Get all inbox tags paginated

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    try {
      PageInboxTags result = apiInstance.getInboxTagsPaginated()
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxTagsPaginated");
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
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |

### Return type

[**PageInboxTags**](PageInboxTags)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxes"></a>
# **getInboxes**
> List&lt;InboxDto&gt; getInboxes().size(size).sort(sort).since(since).excludeCatchAllInboxes(excludeCatchAllInboxes).before(before).include(include).execute();

List Inboxes and email addresses

List the inboxes you have created. Note use of the more advanced &#x60;getAllInboxes&#x60; is recommended and allows paginated access using a limit and sort parameter.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer size = 100; // Integer | Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated `getAllEmails` for larger queries.
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    Boolean excludeCatchAllInboxes = true; // Boolean | Optional exclude catch all inboxes
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    List<UUID> include = Arrays.asList(); // List<UUID> | Optional inboxIds to include in result
    try {
      List<InboxDto> result = apiInstance.getInboxes()
            .size(size)
            .sort(sort)
            .since(since)
            .excludeCatchAllInboxes(excludeCatchAllInboxes)
            .before(before)
            .include(include)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **size** | **Integer**| Optional result size limit. Note an automatic limit of 100 results is applied. See the paginated &#x60;getAllEmails&#x60; for larger queries. | [optional] [default to 100] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **excludeCatchAllInboxes** | **Boolean**| Optional exclude catch all inboxes | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |
| **include** | [**List&lt;UUID&gt;**](UUID)| Optional inboxIds to include in result | [optional] |

### Return type

[**List&lt;InboxDto&gt;**](InboxDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getInboxesByTag"></a>
# **getInboxesByTag**
> PageInboxProjection getInboxesByTag(tag).page(page).size(size).sort(sort).searchFilter(searchFilter).execute();

Get inboxes for a tag

Get all inboxes for a given inbox tag

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String tag = "tag_example"; // String | Tag to filter by
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    try {
      PageInboxProjection result = apiInstance.getInboxesByTag(tag)
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getInboxesByTag");
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
| **tag** | **String**| Tag to filter by | |
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getLatestEmailInInbox"></a>
# **getLatestEmailInInbox**
> Email getLatestEmailInInbox(inboxId, timeoutMillis).execute();

Get latest email in an inbox. Use &#x60;WaitForController&#x60; to get emails that may not have arrived yet.

Get the newest email in an inbox or wait for one to arrive

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to get the latest email from
    Long timeoutMillis = 56L; // Long | Timeout milliseconds to wait for latest email
    try {
      Email result = apiInstance.getLatestEmailInInbox(inboxId, timeoutMillis)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getLatestEmailInInbox");
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
| **inboxId** | **UUID**| ID of the inbox you want to get the latest email from | |
| **timeoutMillis** | **Long**| Timeout milliseconds to wait for latest email | |

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

<a id="getOrganizationInboxes"></a>
# **getOrganizationInboxes**
> PageOrganizationInboxProjection getOrganizationInboxes().page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    try {
      PageOrganizationInboxProjection result = apiInstance.getOrganizationInboxes()
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |

### Return type

[**PageOrganizationInboxProjection**](PageOrganizationInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOutboxes"></a>
# **getOutboxes**
> PageInboxProjection getOutboxes().page(page).size(size).sort(sort).execute();

List all inboxes with sent emails

List inboxes that have sent emails

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size in list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageInboxProjection result = apiInstance.getOutboxes()
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getOutboxes");
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
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getScheduledJob"></a>
# **getScheduledJob**
> ScheduledJobDto getScheduledJob(jobId).execute();

Get a scheduled email job

Get a scheduled email job details.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID jobId = UUID.randomUUID(); // UUID | 
    try {
      ScheduledJobDto result = apiInstance.getScheduledJob(jobId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getScheduledJob");
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

[**ScheduledJobDto**](ScheduledJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getScheduledJobsByInboxId"></a>
# **getScheduledJobsByInboxId**
> PageScheduledJobs getScheduledJobsByInboxId(inboxId).page(page).size(size).sort(sort).since(since).before(before).execute();

Get all scheduled email sending jobs for the inbox

Schedule sending of emails using scheduled jobs.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in scheduled job list pagination
    Integer size = 20; // Integer | Optional page size in scheduled job list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageScheduledJobs result = apiInstance.getScheduledJobsByInboxId(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getScheduledJobsByInboxId");
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
| **inboxId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in scheduled job list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in scheduled job list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageScheduledJobs**](PageScheduledJobs)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSmtpAccess"></a>
# **getSmtpAccess**
> SmtpAccessDetails getSmtpAccess().inboxId(inboxId).execute();



Get SMTP access usernames and passwords

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID
    try {
      SmtpAccessDetails result = apiInstance.getSmtpAccess()
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#getSmtpAccess");
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
| **inboxId** | **UUID**| Inbox ID | [optional] |

### Return type

[**SmtpAccessDetails**](SmtpAccessDetails)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="isEmailAddressAvailable"></a>
# **isEmailAddressAvailable**
> EmailAvailableResult isEmailAddressAvailable(emailAddress).execute();

Is email address available

Returns whether an email address is available

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    try {
      EmailAvailableResult result = apiInstance.isEmailAddressAvailable(emailAddress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#isEmailAddressAvailable");
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
| **emailAddress** | **String**|  | |

### Return type

[**EmailAvailableResult**](EmailAvailableResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInboxRulesets"></a>
# **listInboxRulesets**
> PageInboxRulesetDto listInboxRulesets(inboxId).page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in inbox ruleset list pagination
    Integer size = 20; // Integer | Optional page size in inbox ruleset list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    try {
      PageInboxRulesetDto result = apiInstance.listInboxRulesets(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in inbox ruleset list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox ruleset list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |

### Return type

[**PageInboxRulesetDto**](PageInboxRulesetDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInboxTrackingPixels"></a>
# **listInboxTrackingPixels**
> PageTrackingPixelProjection listInboxTrackingPixels(inboxId).page(page).size(size).sort(sort).searchFilter(searchFilter).since(since).before(before).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in inbox tracking pixel list pagination
    Integer size = 20; // Integer | Optional page size in inbox tracking pixel list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    String searchFilter = "searchFilter_example"; // String | Optional search filter
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by created before given date time
    try {
      PageTrackingPixelProjection result = apiInstance.listInboxTrackingPixels(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .searchFilter(searchFilter)
            .since(since)
            .before(before)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in inbox tracking pixel list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in inbox tracking pixel list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **searchFilter** | **String**| Optional search filter | [optional] |
| **since** | **OffsetDateTime**| Optional filter by created after given date time | [optional] |
| **before** | **OffsetDateTime**| Optional filter by created before given date time | [optional] |

### Return type

[**PageTrackingPixelProjection**](PageTrackingPixelProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchInboxes"></a>
# **searchInboxes**
> PageInboxProjection searchInboxes(searchInboxesOptions).execute();

Search all inboxes and return matching inboxes

Search inboxes and return in paginated form. The results are available on the &#x60;content&#x60; property of the returned object. This method allows for page index (zero based), page size (how many results to return), and a sort direction (based on createdAt time). You Can also filter by whether an inbox is favorited or use email address pattern. This method is the recommended way to query inboxes. The alternative &#x60;getInboxes&#x60; method returns a full list of inboxes but is limited to 100 results.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    SearchInboxesOptions searchInboxesOptions = new SearchInboxesOptions(); // SearchInboxesOptions | 
    try {
      PageInboxProjection result = apiInstance.searchInboxes(searchInboxesOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#searchInboxes");
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
| **searchInboxesOptions** | [**SearchInboxesOptions**](SearchInboxesOptions)|  | |

### Return type

[**PageInboxProjection**](PageInboxProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendEmail"></a>
# **sendEmail**
> sendEmail(inboxId, sendEmailOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    try {
      apiInstance.sendEmail(inboxId, sendEmailOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |

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

<a id="sendEmailAndConfirm"></a>
# **sendEmailAndConfirm**
> SentEmailDto sendEmailAndConfirm(inboxId, sendEmailOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    try {
      SentEmailDto result = apiInstance.sendEmailAndConfirm(inboxId, sendEmailOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="sendEmailWithQueue"></a>
# **sendEmailWithQueue**
> sendEmailWithQueue(inboxId, validateBeforeEnqueue, sendEmailOptions).execute();

Send email with queue

Send an email using a queue. Will place the email onto a queue that will then be processed and sent. Use this queue method to enable any failed email sending to be recovered. This will prevent lost emails when sending if your account encounters a block or payment issue.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    Boolean validateBeforeEnqueue = true; // Boolean | Validate before adding to queue
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    try {
      apiInstance.sendEmailWithQueue(inboxId, validateBeforeEnqueue, sendEmailOptions)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#sendEmailWithQueue");
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
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **validateBeforeEnqueue** | **Boolean**| Validate before adding to queue | |
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |

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

<a id="sendSmtpEnvelope"></a>
# **sendSmtpEnvelope**
> SentEmailDto sendSmtpEnvelope(inboxId, sendSMTPEnvelopeOptions).execute();

Send email using an SMTP mail envelope and message body and return sent confirmation

Send email using an SMTP envelope containing RCPT TO, MAIL FROM, and a SMTP BODY.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    SendSMTPEnvelopeOptions sendSMTPEnvelopeOptions = new SendSMTPEnvelopeOptions(); // SendSMTPEnvelopeOptions | 
    try {
      SentEmailDto result = apiInstance.sendSmtpEnvelope(inboxId, sendSMTPEnvelopeOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#sendSmtpEnvelope");
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
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **sendSMTPEnvelopeOptions** | [**SendSMTPEnvelopeOptions**](SendSMTPEnvelopeOptions)|  | |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="sendTestEmail"></a>
# **sendTestEmail**
> sendTestEmail(inboxId).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.sendTestEmail(inboxId)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | |

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

<a id="sendWithSchedule"></a>
# **sendWithSchedule**
> ScheduledJobDto sendWithSchedule(inboxId, sendEmailOptions).sendAtTimestamp(sendAtTimestamp).sendAtNowPlusSeconds(sendAtNowPlusSeconds).validateBeforeEnqueue(validateBeforeEnqueue).execute();

Send email with with delay or schedule

Send an email using a delay. Will place the email onto a scheduler that will then be processed and sent. Use delays to schedule email sending.

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of the inbox you want to send the email from
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    OffsetDateTime sendAtTimestamp = OffsetDateTime.now(); // OffsetDateTime | Sending timestamp
    Long sendAtNowPlusSeconds = 56L; // Long | Send after n seconds
    Boolean validateBeforeEnqueue = true; // Boolean | Validate before adding to queue
    try {
      ScheduledJobDto result = apiInstance.sendWithSchedule(inboxId, sendEmailOptions)
            .sendAtTimestamp(sendAtTimestamp)
            .sendAtNowPlusSeconds(sendAtNowPlusSeconds)
            .validateBeforeEnqueue(validateBeforeEnqueue)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#sendWithSchedule");
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
| **inboxId** | **UUID**| ID of the inbox you want to send the email from | |
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |
| **sendAtTimestamp** | **OffsetDateTime**| Sending timestamp | [optional] |
| **sendAtNowPlusSeconds** | **Long**| Send after n seconds | [optional] |
| **validateBeforeEnqueue** | **Boolean**| Validate before adding to queue | [optional] |

### Return type

[**ScheduledJobDto**](ScheduledJobDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="setInboxFavourited"></a>
# **setInboxFavourited**
> InboxDto setInboxFavourited(inboxId, setInboxFavouritedOptions).execute();

Set inbox favourited state

Set and return new favorite state for an inbox

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox to set favourite state
    SetInboxFavouritedOptions setInboxFavouritedOptions = new SetInboxFavouritedOptions(); // SetInboxFavouritedOptions | 
    try {
      InboxDto result = apiInstance.setInboxFavourited(inboxId, setInboxFavouritedOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**| ID of inbox to set favourite state | |
| **setInboxFavouritedOptions** | [**SetInboxFavouritedOptions**](SetInboxFavouritedOptions)|  | |

### Return type

[**InboxDto**](InboxDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateImapAccess"></a>
# **updateImapAccess**
> updateImapAccess(updateImapAccessOptions).inboxId(inboxId).execute();



Update IMAP access usernames and passwords

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UpdateImapAccessOptions updateImapAccessOptions = new UpdateImapAccessOptions(); // UpdateImapAccessOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID
    try {
      apiInstance.updateImapAccess(updateImapAccessOptions)
            .inboxId(inboxId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#updateImapAccess");
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
| **updateImapAccessOptions** | [**UpdateImapAccessOptions**](UpdateImapAccessOptions)|  | |
| **inboxId** | **UUID**| Inbox ID | [optional] |

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

<a id="updateInbox"></a>
# **updateInbox**
> InboxDto updateInbox(inboxId, updateInboxOptions).execute();

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    UpdateInboxOptions updateInboxOptions = new UpdateInboxOptions(); // UpdateInboxOptions | 
    try {
      InboxDto result = apiInstance.updateInbox(inboxId, updateInboxOptions)
            .execute();
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **inboxId** | **UUID**|  | |
| **updateInboxOptions** | [**UpdateInboxOptions**](UpdateInboxOptions)|  | |

### Return type

[**InboxDto**](InboxDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateSmtpAccess"></a>
# **updateSmtpAccess**
> updateSmtpAccess(updateSmtpAccessOptions).inboxId(inboxId).execute();



Update SMTP access usernames and passwords

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
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    InboxControllerApi apiInstance = new InboxControllerApi(defaultClient);
    UpdateSmtpAccessOptions updateSmtpAccessOptions = new UpdateSmtpAccessOptions(); // UpdateSmtpAccessOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID
    try {
      apiInstance.updateSmtpAccess(updateSmtpAccessOptions)
            .inboxId(inboxId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxControllerApi#updateSmtpAccess");
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
| **updateSmtpAccessOptions** | [**UpdateSmtpAccessOptions**](UpdateSmtpAccessOptions)|  | |
| **inboxId** | **UUID**| Inbox ID | [optional] |

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

