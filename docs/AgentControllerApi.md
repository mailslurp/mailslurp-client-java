# AgentControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**agentAcquireConversationClaim**](AgentControllerApi#agentAcquireConversationClaim) | **POST** /agent/conversations/{conversationId}/claims | Acquire a renewable conversation claim |
| [**agentAddConversationNote**](AgentControllerApi#agentAddConversationNote) | **POST** /agent/conversations/{conversationId}/notes | Add an internal conversation note |
| [**agentAddSmsNote**](AgentControllerApi#agentAddSmsNote) | **POST** /agent/sms-conversations/{conversationId}/notes | Add an internal SMS conversation note |
| [**agentCheckInboxSendPolicy**](AgentControllerApi#agentCheckInboxSendPolicy) | **POST** /agent/inboxes/{inboxId}/send-policy/check | Check whether sending rules allow recipients |
| [**agentClaimSmsConversation**](AgentControllerApi#agentClaimSmsConversation) | **POST** /agent/sms-conversations/{conversationId}/claims | Acquire an SMS conversation claim |
| [**agentCompleteWorkItem**](AgentControllerApi#agentCompleteWorkItem) | **POST** /agent/work-items/{conversationId}/complete | Complete a work item with an idempotent reply |
| [**agentCreateEmailDraft**](AgentControllerApi#agentCreateEmailDraft) | **POST** /agent/inboxes/{inboxId}/drafts | Create a scoped email draft for an agent |
| [**agentCreateInbox**](AgentControllerApi#agentCreateInbox) | **POST** /agent/inboxes | Create an inbox with an account-wide inbox-manager connection |
| [**agentCreateReplyDraft**](AgentControllerApi#agentCreateReplyDraft) | **POST** /agent/emails/{emailId}/reply-draft | Create a correctly threaded reply draft |
| [**agentCreateTotpDeviceForBase32SecretKey**](AgentControllerApi#agentCreateTotpDeviceForBase32SecretKey) | **POST** /agent/totp/devices/base32-secret-key | Create an agent-managed TOTP device from a base32 secret key |
| [**agentCreateTotpDeviceForCustom**](AgentControllerApi#agentCreateTotpDeviceForCustom) | **POST** /agent/totp/devices/custom | Create an agent-managed TOTP device from custom options |
| [**agentCreateTotpDeviceForOtpAuthUrl**](AgentControllerApi#agentCreateTotpDeviceForOtpAuthUrl) | **POST** /agent/totp/devices/otp-auth-url | Create an agent-managed TOTP device from an OTP Auth URL |
| [**agentDeferWorkItem**](AgentControllerApi#agentDeferWorkItem) | **POST** /agent/work-items/{conversationId}/defer | Defer a work item to human review |
| [**agentDeleteEmailDraft**](AgentControllerApi#agentDeleteEmailDraft) | **DELETE** /agent/inboxes/{inboxId}/drafts/{draftId} | Delete a scoped email draft for an agent |
| [**agentDeleteTotpDevice**](AgentControllerApi#agentDeleteTotpDevice) | **DELETE** /agent/totp/devices/{id} | Delete an agent-managed TOTP device |
| [**agentExtractEmailAttachmentText**](AgentControllerApi#agentExtractEmailAttachmentText) | **POST** /agent/emails/{emailId}/attachments/{attachmentId}/text | Extract text from a scoped email attachment for an agent |
| [**agentGenerateTotpDeviceCode**](AgentControllerApi#agentGenerateTotpDeviceCode) | **GET** /agent/totp/devices/{id}/code | Generate a code for an agent-managed TOTP device |
| [**agentGetCapabilities**](AgentControllerApi#agentGetCapabilities) | **GET** /agent/capabilities | Discover this agent connection&#39;s capabilities |
| [**agentGetConversationV2**](AgentControllerApi#agentGetConversationV2) | **GET** /agent/conversations/{conversationId} | Get one scoped conversation |
| [**agentGetEmail**](AgentControllerApi#agentGetEmail) | **GET** /agent/emails/{emailId} | Get scoped hydrated email for an agent |
| [**agentGetEmailDraft**](AgentControllerApi#agentGetEmailDraft) | **GET** /agent/inboxes/{inboxId}/drafts/{draftId} | Get a scoped email draft for an agent |
| [**agentGetEmailSummary**](AgentControllerApi#agentGetEmailSummary) | **GET** /agent/emails/{emailId}/summary | Get scoped email summary for an agent |
| [**agentGetEmailThread**](AgentControllerApi#agentGetEmailThread) | **GET** /agent/emails/{emailId}/thread | Get a scoped email thread for an agent |
| [**agentGetLatestInboxEmail**](AgentControllerApi#agentGetLatestInboxEmail) | **GET** /agent/inboxes/{inboxId}/emails/latest | Get latest scoped inbox email for an agent |
| [**agentGetNextWorkItem**](AgentControllerApi#agentGetNextWorkItem) | **POST** /agent/work-items/next | Claim the next conversation work item |
| [**agentGetPhoneMessageThreadItems**](AgentControllerApi#agentGetPhoneMessageThreadItems) | **GET** /agent/phone-numbers/{phoneNumberId}/message-threads/{otherPhoneNumber} | List SMS thread messages |
| [**agentGetPhoneMessageThreads**](AgentControllerApi#agentGetPhoneMessageThreads) | **GET** /agent/phone-numbers/{phoneNumberId}/message-threads | List SMS threads |
| [**agentGetPhoneNumber**](AgentControllerApi#agentGetPhoneNumber) | **GET** /agent/phone-numbers/{phoneNumberId} | Get an assigned phone number |
| [**agentGetPhoneNumbers**](AgentControllerApi#agentGetPhoneNumbers) | **GET** /agent/phone-numbers | List assigned phone numbers |
| [**agentGetReceivedSmsMessage**](AgentControllerApi#agentGetReceivedSmsMessage) | **GET** /agent/phone-numbers/{phoneNumberId}/sms/{smsId} | Get received SMS |
| [**agentGetReceivedSmsMessages**](AgentControllerApi#agentGetReceivedSmsMessages) | **GET** /agent/phone-numbers/{phoneNumberId}/sms | List received SMS for an assigned phone number |
| [**agentGetSentSmsMessage**](AgentControllerApi#agentGetSentSmsMessage) | **GET** /agent/phone-numbers/{phoneNumberId}/sms/sent/{sentSmsId} | Get sent SMS |
| [**agentGetSentSmsMessages**](AgentControllerApi#agentGetSentSmsMessages) | **GET** /agent/phone-numbers/{phoneNumberId}/sms/sent | List sent SMS for an assigned phone number |
| [**agentGetSmsConversation**](AgentControllerApi#agentGetSmsConversation) | **GET** /agent/sms-conversations/{conversationId} | Get one SMS conversation |
| [**agentGetTotpDevice**](AgentControllerApi#agentGetTotpDevice) | **GET** /agent/totp/devices/{id} | Get an agent-accessible TOTP device |
| [**agentGetTotpDeviceBy**](AgentControllerApi#agentGetTotpDeviceBy) | **GET** /agent/totp/devices/by | Find an agent-accessible TOTP device by name, issuer, or username |
| [**agentGetTotpDevices**](AgentControllerApi#agentGetTotpDevices) | **GET** /agent/totp/devices | List agent-accessible TOTP devices |
| [**agentListAccessibleInboxes**](AgentControllerApi#agentListAccessibleInboxes) | **GET** /agent/inboxes | List inboxes accessible to an agent |
| [**agentListAutomationEvents**](AgentControllerApi#agentListAutomationEvents) | **GET** /agent/events | Read durable scoped automation events |
| [**agentListConversationsV2**](AgentControllerApi#agentListConversationsV2) | **GET** /agent/conversations | List active conversations with an opaque keyset cursor |
| [**agentListEmailAttachments**](AgentControllerApi#agentListEmailAttachments) | **GET** /agent/emails/{emailId}/attachments | List attachments on a scoped email for an agent |
| [**agentListEmailDrafts**](AgentControllerApi#agentListEmailDrafts) | **GET** /agent/inboxes/{inboxId}/drafts | List scoped email drafts for an agent |
| [**agentListInboxEmails**](AgentControllerApi#agentListInboxEmails) | **GET** /agent/inboxes/{inboxId}/emails | List scoped inbox emails for an agent |
| [**agentListInboxThreads**](AgentControllerApi#agentListInboxThreads) | **GET** /agent/inboxes/{inboxId}/threads | List scoped inbox threads for an agent |
| [**agentListSmsConversations**](AgentControllerApi#agentListSmsConversations) | **GET** /agent/sms-conversations | List active SMS conversations |
| [**agentPrepareWorkItemReply**](AgentControllerApi#agentPrepareWorkItemReply) | **POST** /agent/work-items/{conversationId}/prepare-reply | Prepare a guarded reply draft |
| [**agentReleaseConversationClaim**](AgentControllerApi#agentReleaseConversationClaim) | **DELETE** /agent/conversations/{conversationId}/claims/{claimId} | Release a conversation claim |
| [**agentReleaseSmsClaim**](AgentControllerApi#agentReleaseSmsClaim) | **DELETE** /agent/sms-conversations/{conversationId}/claims/{claimId} | Release an SMS conversation claim |
| [**agentRenewConversationClaim**](AgentControllerApi#agentRenewConversationClaim) | **PUT** /agent/conversations/{conversationId}/claims/{claimId} | Renew a conversation claim |
| [**agentRenewSmsClaim**](AgentControllerApi#agentRenewSmsClaim) | **PUT** /agent/sms-conversations/{conversationId}/claims/{claimId} | Renew an SMS conversation claim |
| [**agentReplyToEmail**](AgentControllerApi#agentReplyToEmail) | **POST** /agent/emails/{emailId}/reply | Reply to a scoped email as an agent |
| [**agentReplyToSms**](AgentControllerApi#agentReplyToSms) | **POST** /agent/phone-numbers/{phoneNumberId}/sms/{smsId}/reply | Reply to received SMS |
| [**agentReportWorkerHeartbeat**](AgentControllerApi#agentReportWorkerHeartbeat) | **POST** /agent/runtime/heartbeat | Report a worker heartbeat |
| [**agentRequestConversationHandoff**](AgentControllerApi#agentRequestConversationHandoff) | **POST** /agent/conversations/{conversationId}/handoffs | Request human review for a conversation |
| [**agentRequestSmsHandoff**](AgentControllerApi#agentRequestSmsHandoff) | **POST** /agent/sms-conversations/{conversationId}/handoffs | Request human review for an SMS conversation |
| [**agentSearchInboxEmails**](AgentControllerApi#agentSearchInboxEmails) | **POST** /agent/inboxes/{inboxId}/emails/search | Search scoped inbox emails for an agent |
| [**agentSendEmailDraft**](AgentControllerApi#agentSendEmailDraft) | **POST** /agent/inboxes/{inboxId}/drafts/{draftId}/send | Send a scoped email draft for an agent |
| [**agentSendSms**](AgentControllerApi#agentSendSms) | **POST** /agent/phone-numbers/{phoneNumberId}/sms | Send SMS from an assigned phone number |
| [**agentUpdateEmailDraft**](AgentControllerApi#agentUpdateEmailDraft) | **PATCH** /agent/inboxes/{inboxId}/drafts/{draftId} | Update a scoped email draft for an agent |
| [**agentUpdateInbox**](AgentControllerApi#agentUpdateInbox) | **PATCH** /agent/inboxes/{inboxId} | Update an inbox visible to an inbox-manager connection |
| [**agentUpdateTotpDevice**](AgentControllerApi#agentUpdateTotpDevice) | **PUT** /agent/totp/devices/{id} | Update an agent-managed TOTP device |


<a id="agentAcquireConversationClaim"></a>
# **agentAcquireConversationClaim**
> AgentConversationClaimDto agentAcquireConversationClaim(conversationId, acquireAgentConversationClaimOptions).execute();

Acquire a renewable conversation claim

Atomically leases a conversation to one worker. A conflict means another unexpired worker owns it. Use expectedVersion to reject work selected from stale context.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    AcquireAgentConversationClaimOptions acquireAgentConversationClaimOptions = new AcquireAgentConversationClaimOptions(); // AcquireAgentConversationClaimOptions | 
    try {
      AgentConversationClaimDto result = apiInstance.agentAcquireConversationClaim(conversationId, acquireAgentConversationClaimOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentAcquireConversationClaim");
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
| **conversationId** | **UUID**|  | |
| **acquireAgentConversationClaimOptions** | [**AcquireAgentConversationClaimOptions**](AcquireAgentConversationClaimOptions)|  | |

### Return type

[**AgentConversationClaimDto**](AgentConversationClaimDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentAddConversationNote"></a>
# **agentAddConversationNote**
> AgentConversationNoteDto agentAddConversationNote(conversationId, createAgentConversationNoteOptions).execute();

Add an internal conversation note

Adds agent/operator collaboration context without sending any email to the customer.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    CreateAgentConversationNoteOptions createAgentConversationNoteOptions = new CreateAgentConversationNoteOptions(); // CreateAgentConversationNoteOptions | 
    try {
      AgentConversationNoteDto result = apiInstance.agentAddConversationNote(conversationId, createAgentConversationNoteOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentAddConversationNote");
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
| **conversationId** | **UUID**|  | |
| **createAgentConversationNoteOptions** | [**CreateAgentConversationNoteOptions**](CreateAgentConversationNoteOptions)|  | |

### Return type

[**AgentConversationNoteDto**](AgentConversationNoteDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentAddSmsNote"></a>
# **agentAddSmsNote**
> AgentConversationNoteDto agentAddSmsNote(conversationId, createAgentSmsConversationNoteOptions).execute();

Add an internal SMS conversation note

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    CreateAgentSmsConversationNoteOptions createAgentSmsConversationNoteOptions = new CreateAgentSmsConversationNoteOptions(); // CreateAgentSmsConversationNoteOptions | 
    try {
      AgentConversationNoteDto result = apiInstance.agentAddSmsNote(conversationId, createAgentSmsConversationNoteOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentAddSmsNote");
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
| **conversationId** | **UUID**|  | |
| **createAgentSmsConversationNoteOptions** | [**CreateAgentSmsConversationNoteOptions**](CreateAgentSmsConversationNoteOptions)|  | |

### Return type

[**AgentConversationNoteDto**](AgentConversationNoteDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentCheckInboxSendPolicy"></a>
# **agentCheckInboxSendPolicy**
> AgentInboxSendPolicyDto agentCheckInboxSendPolicy(inboxId, agentInboxSendPolicyCheckOptions).execute();

Check whether sending rules allow recipients

Evaluates effective inbox and account sending rules before an agent creates a send action. A blocked result includes the operator recovery route.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    AgentInboxSendPolicyCheckOptions agentInboxSendPolicyCheckOptions = new AgentInboxSendPolicyCheckOptions(); // AgentInboxSendPolicyCheckOptions | 
    try {
      AgentInboxSendPolicyDto result = apiInstance.agentCheckInboxSendPolicy(inboxId, agentInboxSendPolicyCheckOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCheckInboxSendPolicy");
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
| **agentInboxSendPolicyCheckOptions** | [**AgentInboxSendPolicyCheckOptions**](AgentInboxSendPolicyCheckOptions)|  | |

### Return type

[**AgentInboxSendPolicyDto**](AgentInboxSendPolicyDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentClaimSmsConversation"></a>
# **agentClaimSmsConversation**
> AgentConversationClaimDto agentClaimSmsConversation(conversationId, acquireAgentConversationClaimOptions).execute();

Acquire an SMS conversation claim

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    AcquireAgentConversationClaimOptions acquireAgentConversationClaimOptions = new AcquireAgentConversationClaimOptions(); // AcquireAgentConversationClaimOptions | 
    try {
      AgentConversationClaimDto result = apiInstance.agentClaimSmsConversation(conversationId, acquireAgentConversationClaimOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentClaimSmsConversation");
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
| **conversationId** | **UUID**|  | |
| **acquireAgentConversationClaimOptions** | [**AcquireAgentConversationClaimOptions**](AcquireAgentConversationClaimOptions)|  | |

### Return type

[**AgentConversationClaimDto**](AgentConversationClaimDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentCompleteWorkItem"></a>
# **agentCompleteWorkItem**
> AgentCompletedWorkItemDto agentCompleteWorkItem(conversationId, completeAgentWorkItemOptions).execute();

Complete a work item with an idempotent reply

Revalidates conversation freshness, sends one threaded reply with an idempotency key, and releases the supplied claim only after the send succeeds.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    CompleteAgentWorkItemOptions completeAgentWorkItemOptions = new CompleteAgentWorkItemOptions(); // CompleteAgentWorkItemOptions | 
    try {
      AgentCompletedWorkItemDto result = apiInstance.agentCompleteWorkItem(conversationId, completeAgentWorkItemOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCompleteWorkItem");
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
| **conversationId** | **UUID**|  | |
| **completeAgentWorkItemOptions** | [**CompleteAgentWorkItemOptions**](CompleteAgentWorkItemOptions)|  | |

### Return type

[**AgentCompletedWorkItemDto**](AgentCompletedWorkItemDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The durable sent-email result and claim release state. |  -  |
| **0** | Agent API error with a stable code, retry guidance, support-safe request ID, and bounded details. |  -  |

<a id="agentCreateEmailDraft"></a>
# **agentCreateEmailDraft**
> EmailDraftDto agentCreateEmailDraft(inboxId, sendEmailOptions).sourceEmailId(sourceEmailId).execute();

Create a scoped email draft for an agent

Creates a saved draft in the path inbox using the same SendEmailOptions shape as sending, without sending the email.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox to save the draft against
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    UUID sourceEmailId = UUID.randomUUID(); // UUID | Optional source email this draft responds to. When supplied, MailSlurp links the draft and later draft actions to that conversation.
    try {
      EmailDraftDto result = apiInstance.agentCreateEmailDraft(inboxId, sendEmailOptions)
            .sourceEmailId(sourceEmailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCreateEmailDraft");
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
| **inboxId** | **UUID**| ID of inbox to save the draft against | |
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |
| **sourceEmailId** | **UUID**| Optional source email this draft responds to. When supplied, MailSlurp links the draft and later draft actions to that conversation. | [optional] |

### Return type

[**EmailDraftDto**](EmailDraftDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentCreateInbox"></a>
# **agentCreateInbox**
> InboxDto agentCreateInbox(createInboxDto).execute();

Create an inbox with an account-wide inbox-manager connection

Creates an inbox without changing this agent connection&#39;s scopes. Account-wide scope is required so the new inbox is already covered.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    CreateInboxDto createInboxDto = new CreateInboxDto(); // CreateInboxDto | 
    try {
      InboxDto result = apiInstance.agentCreateInbox(createInboxDto)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCreateInbox");
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

<a id="agentCreateReplyDraft"></a>
# **agentCreateReplyDraft**
> EmailDraftDto agentCreateReplyDraft(emailId, replyToEmailOptions).execute();

Create a correctly threaded reply draft

Builds the same recipients and RFC In-Reply-To/References headers as immediate reply, saves them as a draft, and preserves the required threading headers across later agent draft updates.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    ReplyToEmailOptions replyToEmailOptions = new ReplyToEmailOptions(); // ReplyToEmailOptions | 
    try {
      EmailDraftDto result = apiInstance.agentCreateReplyDraft(emailId, replyToEmailOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCreateReplyDraft");
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
| **emailId** | **UUID**|  | |
| **replyToEmailOptions** | [**ReplyToEmailOptions**](ReplyToEmailOptions)|  | |

### Return type

[**EmailDraftDto**](EmailDraftDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentCreateTotpDeviceForBase32SecretKey"></a>
# **agentCreateTotpDeviceForBase32SecretKey**
> TotpDeviceDto agentCreateTotpDeviceForBase32SecretKey(createTotpDeviceBase32SecretKeyOptions).execute();

Create an agent-managed TOTP device from a base32 secret key

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    CreateTotpDeviceBase32SecretKeyOptions createTotpDeviceBase32SecretKeyOptions = new CreateTotpDeviceBase32SecretKeyOptions(); // CreateTotpDeviceBase32SecretKeyOptions | 
    try {
      TotpDeviceDto result = apiInstance.agentCreateTotpDeviceForBase32SecretKey(createTotpDeviceBase32SecretKeyOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCreateTotpDeviceForBase32SecretKey");
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
| **createTotpDeviceBase32SecretKeyOptions** | [**CreateTotpDeviceBase32SecretKeyOptions**](CreateTotpDeviceBase32SecretKeyOptions)|  | |

### Return type

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentCreateTotpDeviceForCustom"></a>
# **agentCreateTotpDeviceForCustom**
> TotpDeviceDto agentCreateTotpDeviceForCustom(createTotpDeviceCustomOptions).execute();

Create an agent-managed TOTP device from custom options

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    CreateTotpDeviceCustomOptions createTotpDeviceCustomOptions = new CreateTotpDeviceCustomOptions(); // CreateTotpDeviceCustomOptions | 
    try {
      TotpDeviceDto result = apiInstance.agentCreateTotpDeviceForCustom(createTotpDeviceCustomOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCreateTotpDeviceForCustom");
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
| **createTotpDeviceCustomOptions** | [**CreateTotpDeviceCustomOptions**](CreateTotpDeviceCustomOptions)|  | |

### Return type

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentCreateTotpDeviceForOtpAuthUrl"></a>
# **agentCreateTotpDeviceForOtpAuthUrl**
> TotpDeviceDto agentCreateTotpDeviceForOtpAuthUrl(createTotpDeviceOtpAuthUrlOptions).execute();

Create an agent-managed TOTP device from an OTP Auth URL

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    CreateTotpDeviceOtpAuthUrlOptions createTotpDeviceOtpAuthUrlOptions = new CreateTotpDeviceOtpAuthUrlOptions(); // CreateTotpDeviceOtpAuthUrlOptions | 
    try {
      TotpDeviceDto result = apiInstance.agentCreateTotpDeviceForOtpAuthUrl(createTotpDeviceOtpAuthUrlOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentCreateTotpDeviceForOtpAuthUrl");
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
| **createTotpDeviceOtpAuthUrlOptions** | [**CreateTotpDeviceOtpAuthUrlOptions**](CreateTotpDeviceOtpAuthUrlOptions)|  | |

### Return type

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentDeferWorkItem"></a>
# **agentDeferWorkItem**
> AgentDeferredWorkItemDto agentDeferWorkItem(conversationId, deferAgentWorkItemOptions).execute();

Defer a work item to human review

Creates or returns the active review handoff and releases the supplied claim after the handoff is durable. Deferral is a normal workflow result rather than an operational failure.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    DeferAgentWorkItemOptions deferAgentWorkItemOptions = new DeferAgentWorkItemOptions(); // DeferAgentWorkItemOptions | 
    try {
      AgentDeferredWorkItemDto result = apiInstance.agentDeferWorkItem(conversationId, deferAgentWorkItemOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentDeferWorkItem");
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
| **conversationId** | **UUID**|  | |
| **deferAgentWorkItemOptions** | [**DeferAgentWorkItemOptions**](DeferAgentWorkItemOptions)|  | |

### Return type

[**AgentDeferredWorkItemDto**](AgentDeferredWorkItemDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The human-review handoff and refreshed conversation state. |  -  |
| **0** | Agent API error with a stable code, retry guidance, support-safe request ID, and bounded details. |  -  |

<a id="agentDeleteEmailDraft"></a>
# **agentDeleteEmailDraft**
> agentDeleteEmailDraft(inboxId, draftId).execute();

Delete a scoped email draft for an agent

Deletes a saved draft without sending it.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox the draft belongs to
    UUID draftId = UUID.randomUUID(); // UUID | ID of draft
    try {
      apiInstance.agentDeleteEmailDraft(inboxId, draftId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentDeleteEmailDraft");
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
| **inboxId** | **UUID**| ID of inbox the draft belongs to | |
| **draftId** | **UUID**| ID of draft | |

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

<a id="agentDeleteTotpDevice"></a>
# **agentDeleteTotpDevice**
> agentDeleteTotpDevice(id).execute();

Delete an agent-managed TOTP device

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.agentDeleteTotpDevice(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentDeleteTotpDevice");
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
| **id** | **UUID**|  | |

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

<a id="agentExtractEmailAttachmentText"></a>
# **agentExtractEmailAttachmentText**
> ExtractAttachmentTextResult agentExtractEmailAttachmentText(emailId, attachmentId).extractAttachmentTextOptions(extractAttachmentTextOptions).execute();

Extract text from a scoped email attachment for an agent

Extracts bounded text only after verifying both the email scope and that the attachment belongs to that email. List attachments first instead of guessing IDs.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    String attachmentId = "attachmentId_example"; // String | 
    ExtractAttachmentTextOptions extractAttachmentTextOptions = new ExtractAttachmentTextOptions(); // ExtractAttachmentTextOptions | 
    try {
      ExtractAttachmentTextResult result = apiInstance.agentExtractEmailAttachmentText(emailId, attachmentId)
            .extractAttachmentTextOptions(extractAttachmentTextOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentExtractEmailAttachmentText");
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
| **emailId** | **UUID**|  | |
| **attachmentId** | **String**|  | |
| **extractAttachmentTextOptions** | [**ExtractAttachmentTextOptions**](ExtractAttachmentTextOptions)|  | [optional] |

### Return type

[**ExtractAttachmentTextResult**](ExtractAttachmentTextResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGenerateTotpDeviceCode"></a>
# **agentGenerateTotpDeviceCode**
> TotpDeviceCodeDto agentGenerateTotpDeviceCode(id).at(at).minSecondsUntilExpire(minSecondsUntilExpire).execute();

Generate a code for an agent-managed TOTP device

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    OffsetDateTime at = OffsetDateTime.now(); // OffsetDateTime | 
    Integer minSecondsUntilExpire = 5; // Integer | Minimum remaining code lifetime. The request may wait for the next period when needed.
    try {
      TotpDeviceCodeDto result = apiInstance.agentGenerateTotpDeviceCode(id)
            .at(at)
            .minSecondsUntilExpire(minSecondsUntilExpire)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGenerateTotpDeviceCode");
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
| **id** | **UUID**|  | |
| **at** | **OffsetDateTime**|  | [optional] |
| **minSecondsUntilExpire** | **Integer**| Minimum remaining code lifetime. The request may wait for the next period when needed. | [optional] [default to 5] |

### Return type

[**TotpDeviceCodeDto**](TotpDeviceCodeDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetCapabilities"></a>
# **agentGetCapabilities**
> AgentCapabilitiesDto agentGetCapabilities().execute();

Discover this agent connection&#39;s capabilities

Returns the connection identity, role, effective permission names, declared resource scope, feature availability, and server-enforced limits. Call this once during worker startup instead of hard-coding role behavior.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    try {
      AgentCapabilitiesDto result = apiInstance.agentGetCapabilities()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetCapabilities");
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

[**AgentCapabilitiesDto**](AgentCapabilitiesDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetConversationV2"></a>
# **agentGetConversationV2**
> AgentConversationDetailV2Dto agentGetConversationV2(conversationId).execute();

Get one scoped conversation

Returns the projected conversation plus this connection&#39;s bounded activity timeline, internal notes, and active human-review handoff.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    try {
      AgentConversationDetailV2Dto result = apiInstance.agentGetConversationV2(conversationId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetConversationV2");
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
| **conversationId** | **UUID**|  | |

### Return type

[**AgentConversationDetailV2Dto**](AgentConversationDetailV2Dto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetEmail"></a>
# **agentGetEmail**
> Email agentGetEmail(emailId).execute();

Get scoped hydrated email for an agent

Returns parsed email content after resolving the message inbox and checking agent scope.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to inspect
    try {
      Email result = apiInstance.agentGetEmail(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetEmail");
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
| **emailId** | **UUID**| ID of email to inspect | |

### Return type

[**Email**](Email)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetEmailDraft"></a>
# **agentGetEmailDraft**
> EmailDraftDto agentGetEmailDraft(inboxId, draftId).execute();

Get a scoped email draft for an agent

Returns a saved draft including the full SendEmailOptions payload.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox the draft belongs to
    UUID draftId = UUID.randomUUID(); // UUID | ID of draft
    try {
      EmailDraftDto result = apiInstance.agentGetEmailDraft(inboxId, draftId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetEmailDraft");
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
| **inboxId** | **UUID**| ID of inbox the draft belongs to | |
| **draftId** | **UUID**| ID of draft | |

### Return type

[**EmailDraftDto**](EmailDraftDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetEmailSummary"></a>
# **agentGetEmailSummary**
> EmailPreview agentGetEmailSummary(emailId).execute();

Get scoped email summary for an agent

Returns lightweight metadata and headers for an email after resolving its inbox and checking the agent key scope.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to inspect
    try {
      EmailPreview result = apiInstance.agentGetEmailSummary(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetEmailSummary");
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
| **emailId** | **UUID**| ID of email to inspect | |

### Return type

[**EmailPreview**](EmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetEmailThread"></a>
# **agentGetEmailThread**
> ScopedEmailThread agentGetEmailThread(emailId).sort(sort).execute();

Get a scoped email thread for an agent

Returns thread metadata and ordered messages using an email ID as the authorization anchor. Arbitrary thread-ID probing is not allowed.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    String sort = "ASC"; // String | 
    try {
      ScopedEmailThread result = apiInstance.agentGetEmailThread(emailId)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetEmailThread");
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
| **emailId** | **UUID**|  | |
| **sort** | **String**|  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ScopedEmailThread**](ScopedEmailThread)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetLatestInboxEmail"></a>
# **agentGetLatestInboxEmail**
> Email agentGetLatestInboxEmail(inboxId).timeoutMillis(timeoutMillis).unreadOnly(unreadOnly).since(since).before(before).execute();

Get latest scoped inbox email for an agent

Waits for and returns the latest email in one scoped inbox. This is the agent-shaped equivalent of latest-message polling.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox the agent may read
    Long timeoutMillis = 30000L; // Long | Timeout milliseconds to wait for latest email
    Boolean unreadOnly = false; // Boolean | Only return unread emails
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only return email received at or after this time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only return email received before this time
    try {
      Email result = apiInstance.agentGetLatestInboxEmail(inboxId)
            .timeoutMillis(timeoutMillis)
            .unreadOnly(unreadOnly)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetLatestInboxEmail");
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
| **inboxId** | **UUID**| ID of inbox the agent may read | |
| **timeoutMillis** | **Long**| Timeout milliseconds to wait for latest email | [optional] [default to 30000] |
| **unreadOnly** | **Boolean**| Only return unread emails | [optional] [default to false] |
| **since** | **OffsetDateTime**| Only return email received at or after this time | [optional] |
| **before** | **OffsetDateTime**| Only return email received before this time | [optional] |

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

<a id="agentGetNextWorkItem"></a>
# **agentGetNextWorkItem**
> AgentWorkItemDto agentGetNextWorkItem(getNextAgentWorkItemOptions).execute();

Claim the next conversation work item

Selects the oldest available scoped conversation and atomically claims it for one worker. This combines queue selection and claim acquisition so concurrent workers do not need to coordinate those steps themselves.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    GetNextAgentWorkItemOptions getNextAgentWorkItemOptions = new GetNextAgentWorkItemOptions(); // GetNextAgentWorkItemOptions | 
    try {
      AgentWorkItemDto result = apiInstance.agentGetNextWorkItem(getNextAgentWorkItemOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetNextWorkItem");
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
| **getNextAgentWorkItemOptions** | [**GetNextAgentWorkItemOptions**](GetNextAgentWorkItemOptions)|  | |

### Return type

[**AgentWorkItemDto**](AgentWorkItemDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The claimed conversation, or an empty work item when none is available. |  -  |
| **0** | Agent API error with a stable code, retry guidance, support-safe request ID, and bounded details. |  -  |

<a id="agentGetPhoneMessageThreadItems"></a>
# **agentGetPhoneMessageThreadItems**
> PagePhoneMessageThreadItemProjection agentGetPhoneMessageThreadItems(phoneNumberId, otherPhoneNumber).page(page).size(size).execute();

List SMS thread messages

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    String otherPhoneNumber = "otherPhoneNumber_example"; // String | Other participant phone number in E.164 format
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    try {
      PagePhoneMessageThreadItemProjection result = apiInstance.agentGetPhoneMessageThreadItems(phoneNumberId, otherPhoneNumber)
            .page(page)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetPhoneMessageThreadItems");
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
| **phoneNumberId** | **UUID**|  | |
| **otherPhoneNumber** | **String**| Other participant phone number in E.164 format | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**PagePhoneMessageThreadItemProjection**](PagePhoneMessageThreadItemProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetPhoneMessageThreads"></a>
# **agentGetPhoneMessageThreads**
> PagePhoneMessageThreadProjection agentGetPhoneMessageThreads(phoneNumberId).page(page).size(size).execute();

List SMS threads

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    try {
      PagePhoneMessageThreadProjection result = apiInstance.agentGetPhoneMessageThreads(phoneNumberId)
            .page(page)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetPhoneMessageThreads");
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
| **phoneNumberId** | **UUID**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**PagePhoneMessageThreadProjection**](PagePhoneMessageThreadProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetPhoneNumber"></a>
# **agentGetPhoneNumber**
> PhoneNumberDto agentGetPhoneNumber(phoneNumberId).execute();

Get an assigned phone number

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    try {
      PhoneNumberDto result = apiInstance.agentGetPhoneNumber(phoneNumberId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetPhoneNumber");
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
| **phoneNumberId** | **UUID**|  | |

### Return type

[**PhoneNumberDto**](PhoneNumberDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetPhoneNumbers"></a>
# **agentGetPhoneNumbers**
> PageAgentPhoneNumber agentGetPhoneNumbers().page(page).size(size).sort(sort).search(search).execute();

List assigned phone numbers

Returns only active phone numbers explicitly assigned to this agent connection.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    String search = "search_example"; // String | 
    try {
      PageAgentPhoneNumber result = apiInstance.agentGetPhoneNumbers()
            .page(page)
            .size(size)
            .sort(sort)
            .search(search)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetPhoneNumbers");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **search** | **String**|  | [optional] |

### Return type

[**PageAgentPhoneNumber**](PageAgentPhoneNumber)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetReceivedSmsMessage"></a>
# **agentGetReceivedSmsMessage**
> SmsDto agentGetReceivedSmsMessage(phoneNumberId, smsId).execute();

Get received SMS

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    UUID smsId = UUID.randomUUID(); // UUID | 
    try {
      SmsDto result = apiInstance.agentGetReceivedSmsMessage(phoneNumberId, smsId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetReceivedSmsMessage");
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
| **phoneNumberId** | **UUID**|  | |
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

<a id="agentGetReceivedSmsMessages"></a>
# **agentGetReceivedSmsMessages**
> PageSmsProjection agentGetReceivedSmsMessages(phoneNumberId).page(page).size(size).sort(sort).since(since).before(before).search(search).favourite(favourite).execute();

List received SMS for an assigned phone number

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String search = "search_example"; // String | 
    Boolean favourite = true; // Boolean | 
    try {
      PageSmsProjection result = apiInstance.agentGetReceivedSmsMessages(phoneNumberId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .search(search)
            .favourite(favourite)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetReceivedSmsMessages");
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
| **phoneNumberId** | **UUID**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **search** | **String**|  | [optional] |
| **favourite** | **Boolean**|  | [optional] |

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

<a id="agentGetSentSmsMessage"></a>
# **agentGetSentSmsMessage**
> SentSmsDto agentGetSentSmsMessage(phoneNumberId, sentSmsId).execute();

Get sent SMS

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    UUID sentSmsId = UUID.randomUUID(); // UUID | 
    try {
      SentSmsDto result = apiInstance.agentGetSentSmsMessage(phoneNumberId, sentSmsId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetSentSmsMessage");
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
| **phoneNumberId** | **UUID**|  | |
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

<a id="agentGetSentSmsMessages"></a>
# **agentGetSentSmsMessages**
> PageSentSmsProjection agentGetSentSmsMessages(phoneNumberId).page(page).size(size).sort(sort).since(since).before(before).search(search).execute();

List sent SMS for an assigned phone number

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String search = "search_example"; // String | 
    try {
      PageSentSmsProjection result = apiInstance.agentGetSentSmsMessages(phoneNumberId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .search(search)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetSentSmsMessages");
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
| **phoneNumberId** | **UUID**|  | |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **search** | **String**|  | [optional] |

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

<a id="agentGetSmsConversation"></a>
# **agentGetSmsConversation**
> AgentSmsConversationDetailDto agentGetSmsConversation(conversationId).execute();

Get one SMS conversation

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    try {
      AgentSmsConversationDetailDto result = apiInstance.agentGetSmsConversation(conversationId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetSmsConversation");
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
| **conversationId** | **UUID**|  | |

### Return type

[**AgentSmsConversationDetailDto**](AgentSmsConversationDetailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetTotpDevice"></a>
# **agentGetTotpDevice**
> TotpDeviceDto agentGetTotpDevice(id).execute();

Get an agent-accessible TOTP device

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      TotpDeviceDto result = apiInstance.agentGetTotpDevice(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetTotpDevice");
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
| **id** | **UUID**|  | |

### Return type

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetTotpDeviceBy"></a>
# **agentGetTotpDeviceBy**
> TotpDeviceOptionalDto agentGetTotpDeviceBy().name(name).issuer(issuer).username(username).execute();

Find an agent-accessible TOTP device by name, issuer, or username

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    String name = "name_example"; // String | 
    String issuer = "issuer_example"; // String | 
    String username = "username_example"; // String | 
    try {
      TotpDeviceOptionalDto result = apiInstance.agentGetTotpDeviceBy()
            .name(name)
            .issuer(issuer)
            .username(username)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetTotpDeviceBy");
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
| **name** | **String**|  | [optional] |
| **issuer** | **String**|  | [optional] |
| **username** | **String**|  | [optional] |

### Return type

[**TotpDeviceOptionalDto**](TotpDeviceOptionalDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentGetTotpDevices"></a>
# **agentGetTotpDevices**
> PageTotpDeviceProjection agentGetTotpDevices().page(page).size(size).sort(sort).issuer(issuer).username(username).execute();

List agent-accessible TOTP devices

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    String issuer = "issuer_example"; // String | 
    String username = "username_example"; // String | 
    try {
      PageTotpDeviceProjection result = apiInstance.agentGetTotpDevices()
            .page(page)
            .size(size)
            .sort(sort)
            .issuer(issuer)
            .username(username)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentGetTotpDevices");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **issuer** | **String**|  | [optional] |
| **username** | **String**|  | [optional] |

### Return type

[**PageTotpDeviceProjection**](PageTotpDeviceProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentListAccessibleInboxes"></a>
# **agentListAccessibleInboxes**
> AccessibleInboxList agentListAccessibleInboxes().size(size).sort(sort).execute();

List inboxes accessible to an agent

Returns the inbox IDs, addresses, names, and tags visible to this resource-scoped agent key. Agents should use this endpoint instead of guessing inbox IDs.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    try {
      AccessibleInboxList result = apiInstance.agentListAccessibleInboxes()
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListAccessibleInboxes");
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
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**AccessibleInboxList**](AccessibleInboxList)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentListAutomationEvents"></a>
# **agentListAutomationEvents**
> AgentAutomationEventPageDto agentListAutomationEvents().cursor(cursor).eventType(eventType).size(size).waitSeconds(waitSeconds).execute();

Read durable scoped automation events

Returns an ordered at-least-once event batch. Persist nextCursor after processing and deduplicate by eventId. waitSeconds enables bounded long polling; production workers should not continuously call latest-email polling.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    String cursor = "cursor_example"; // String | 
    Set<String> eventType = Arrays.asList(); // Set<String> | 
    Integer size = 20; // Integer | 
    Integer waitSeconds = 0; // Integer | 
    try {
      AgentAutomationEventPageDto result = apiInstance.agentListAutomationEvents()
            .cursor(cursor)
            .eventType(eventType)
            .size(size)
            .waitSeconds(waitSeconds)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListAutomationEvents");
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
| **cursor** | **String**|  | [optional] |
| **eventType** | [**Set&lt;String&gt;**](String)|  | [optional] [enum: EMAIL_RECEIVED, EMAIL_SENT, SMS_RECEIVED, SMS_SENT, CONVERSATION_CLAIMED, CONVERSATION_CLAIM_RELEASED, CONVERSATION_NOTE_ADDED, CONVERSATION_REVIEW_REQUESTED, CONVERSATION_REVIEW_DECIDED, CONVERSATION_RESOLVED, CONVERSATION_REOPENED, AGENT_REPLY_COMPLETED, AGENT_SMS_SENT, AGENT_SMS_REPLY_COMPLETED, AGENT_DRAFT_CREATED, AGENT_DRAFT_SENT, AGENT_ACTION_FAILED] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **waitSeconds** | **Integer**|  | [optional] [default to 0] |

### Return type

[**AgentAutomationEventPageDto**](AgentAutomationEventPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentListConversationsV2"></a>
# **agentListConversationsV2**
> AgentConversationCursorPageDto agentListConversationsV2().workflowState(workflowState).outcome(outcome).reviewStatus(reviewStatus).inboxId(inboxId).unread(unread).hasAttachments(hasAttachments).since(since).before(before).search(search).sort(sort).cursor(cursor).size(size).execute();

List active conversations with an opaque keyset cursor

Reads the bounded mail-thread projection and applies current connection scope on every request. Persist nextCursor only after processing the returned page. Exact totals are intentionally omitted.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    String workflowState = "AVAILABLE"; // String | 
    String outcome = "READ"; // String | 
    String reviewStatus = "NONE"; // String | 
    UUID inboxId = UUID.randomUUID(); // UUID | 
    Boolean unread = true; // Boolean | 
    Boolean hasAttachments = true; // Boolean | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String search = "search_example"; // String | 
    String sort = "LAST_MESSAGE_DESC"; // String | 
    String cursor = "cursor_example"; // String | 
    Integer size = 20; // Integer | 
    try {
      AgentConversationCursorPageDto result = apiInstance.agentListConversationsV2()
            .workflowState(workflowState)
            .outcome(outcome)
            .reviewStatus(reviewStatus)
            .inboxId(inboxId)
            .unread(unread)
            .hasAttachments(hasAttachments)
            .since(since)
            .before(before)
            .search(search)
            .sort(sort)
            .cursor(cursor)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListConversationsV2");
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
| **workflowState** | **String**|  | [optional] [enum: AVAILABLE, CLAIMED, WAITING_ON_AGENT, WAITING_ON_CUSTOMER, REVIEW, RESOLVED] |
| **outcome** | **String**|  | [optional] [enum: READ, DRAFTED, REPLIED, REVIEW_REQUESTED, FAILED, RESOLVED] |
| **reviewStatus** | **String**|  | [optional] [enum: NONE, REQUESTED, ASSIGNED, APPROVED, REJECTED, RESOLVED] |
| **inboxId** | **UUID**|  | [optional] |
| **unread** | **Boolean**|  | [optional] |
| **hasAttachments** | **Boolean**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **search** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] [default to LAST_MESSAGE_DESC] [enum: LAST_MESSAGE_DESC, OLDEST_UNHANDLED_ASC, REVIEW_PRIORITY_DESC] |
| **cursor** | **String**|  | [optional] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**AgentConversationCursorPageDto**](AgentConversationCursorPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentListEmailAttachments"></a>
# **agentListEmailAttachments**
> List&lt;AttachmentMetaData&gt; agentListEmailAttachments(emailId).execute();

List attachments on a scoped email for an agent

Returns bounded attachment metadata only after verifying the email belongs to an inbox visible to the agent key.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    try {
      List<AttachmentMetaData> result = apiInstance.agentListEmailAttachments(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListEmailAttachments");
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
| **emailId** | **UUID**|  | |

### Return type

[**List&lt;AttachmentMetaData&gt;**](AttachmentMetaData)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentListEmailDrafts"></a>
# **agentListEmailDrafts**
> PageEmailDraftProjection agentListEmailDrafts(inboxId).page(page).size(size).sort(sort).execute();

List scoped email drafts for an agent

Lists draft previews for one scoped inbox.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox to list drafts for
    Integer page = 0; // Integer | Optional page index in draft pagination
    Integer size = 20; // Integer | Optional page size in draft pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageEmailDraftProjection result = apiInstance.agentListEmailDrafts(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListEmailDrafts");
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
| **inboxId** | **UUID**| ID of inbox to list drafts for | |
| **page** | **Integer**| Optional page index in draft pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in draft pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageEmailDraftProjection**](PageEmailDraftProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentListInboxEmails"></a>
# **agentListInboxEmails**
> PageEmailPreview agentListInboxEmails(inboxId).page(page).size(size).sort(sort).since(since).before(before).syncConnectors(syncConnectors).execute();

List scoped inbox emails for an agent

Returns paginated email previews for one inbox after checking the agent key has AGENT_READ_EMAIL and is scoped to the inbox.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox the agent may read
    Integer page = 0; // Integer | Optional page index in inbox emails list pagination
    Integer size = 20; // Integer | Optional page size in inbox emails list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Optional filter by received after given date time
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Optional filter by received before given date time
    Boolean syncConnectors = true; // Boolean | Sync connectors before fetching emails
    try {
      PageEmailPreview result = apiInstance.agentListInboxEmails(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .syncConnectors(syncConnectors)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListInboxEmails");
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
| **inboxId** | **UUID**| ID of inbox the agent may read | |
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

<a id="agentListInboxThreads"></a>
# **agentListInboxThreads**
> PageEmailThreadProjection agentListInboxThreads(inboxId).page(page).size(size).sort(sort).search(search).since(since).before(before).execute();

List scoped inbox threads for an agent

Lists conversation threads for one scoped inbox, including unread state, attachment presence, message count, and latest-message excerpts.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    String search = "search_example"; // String | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      PageEmailThreadProjection result = apiInstance.agentListInboxThreads(inboxId)
            .page(page)
            .size(size)
            .sort(sort)
            .search(search)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListInboxThreads");
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
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **search** | **String**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |

### Return type

[**PageEmailThreadProjection**](PageEmailThreadProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentListSmsConversations"></a>
# **agentListSmsConversations**
> AgentSmsConversationCursorPageDto agentListSmsConversations().workflowState(workflowState).outcome(outcome).reviewStatus(reviewStatus).phoneNumberId(phoneNumberId).unread(unread).hasMedia(hasMedia).since(since).before(before).search(search).sort(sort).cursor(cursor).size(size).execute();

List active SMS conversations

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    String workflowState = "AVAILABLE"; // String | 
    String outcome = "READ"; // String | 
    String reviewStatus = "NONE"; // String | 
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    Boolean unread = true; // Boolean | 
    Boolean hasMedia = true; // Boolean | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String search = "search_example"; // String | 
    String sort = "LAST_MESSAGE_DESC"; // String | 
    String cursor = "cursor_example"; // String | 
    Integer size = 20; // Integer | 
    try {
      AgentSmsConversationCursorPageDto result = apiInstance.agentListSmsConversations()
            .workflowState(workflowState)
            .outcome(outcome)
            .reviewStatus(reviewStatus)
            .phoneNumberId(phoneNumberId)
            .unread(unread)
            .hasMedia(hasMedia)
            .since(since)
            .before(before)
            .search(search)
            .sort(sort)
            .cursor(cursor)
            .size(size)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentListSmsConversations");
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
| **workflowState** | **String**|  | [optional] [enum: AVAILABLE, CLAIMED, WAITING_ON_AGENT, WAITING_ON_CUSTOMER, REVIEW, RESOLVED] |
| **outcome** | **String**|  | [optional] [enum: READ, DRAFTED, REPLIED, REVIEW_REQUESTED, FAILED, RESOLVED] |
| **reviewStatus** | **String**|  | [optional] [enum: NONE, REQUESTED, ASSIGNED, APPROVED, REJECTED, RESOLVED] |
| **phoneNumberId** | **UUID**|  | [optional] |
| **unread** | **Boolean**|  | [optional] |
| **hasMedia** | **Boolean**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **search** | **String**|  | [optional] |
| **sort** | **String**|  | [optional] [default to LAST_MESSAGE_DESC] [enum: LAST_MESSAGE_DESC, OLDEST_UNHANDLED_ASC, REVIEW_PRIORITY_DESC] |
| **cursor** | **String**|  | [optional] |
| **size** | **Integer**|  | [optional] [default to 20] |

### Return type

[**AgentSmsConversationCursorPageDto**](AgentSmsConversationCursorPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentPrepareWorkItemReply"></a>
# **agentPrepareWorkItemReply**
> AgentPreparedReplyDto agentPrepareWorkItemReply(conversationId, prepareAgentReplyOptions).execute();

Prepare a guarded reply draft

Checks that the selected conversation and latest inbound email are still current, then creates a correctly threaded reply draft. An optional internal note records context for human review without sending email.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    PrepareAgentReplyOptions prepareAgentReplyOptions = new PrepareAgentReplyOptions(); // PrepareAgentReplyOptions | 
    try {
      AgentPreparedReplyDto result = apiInstance.agentPrepareWorkItemReply(conversationId, prepareAgentReplyOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentPrepareWorkItemReply");
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
| **conversationId** | **UUID**|  | |
| **prepareAgentReplyOptions** | [**PrepareAgentReplyOptions**](PrepareAgentReplyOptions)|  | |

### Return type

[**AgentPreparedReplyDto**](AgentPreparedReplyDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created reply draft and refreshed conversation state. |  -  |
| **0** | Agent API error with a stable code, retry guidance, support-safe request ID, and bounded details. |  -  |

<a id="agentReleaseConversationClaim"></a>
# **agentReleaseConversationClaim**
> agentReleaseConversationClaim(conversationId, claimId).execute();

Release a conversation claim

Release is idempotent; repeating it does not fail.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    UUID claimId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.agentReleaseConversationClaim(conversationId, claimId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentReleaseConversationClaim");
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
| **conversationId** | **UUID**|  | |
| **claimId** | **UUID**|  | |

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

<a id="agentReleaseSmsClaim"></a>
# **agentReleaseSmsClaim**
> agentReleaseSmsClaim(conversationId, claimId).execute();

Release an SMS conversation claim

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    UUID claimId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.agentReleaseSmsClaim(conversationId, claimId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentReleaseSmsClaim");
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
| **conversationId** | **UUID**|  | |
| **claimId** | **UUID**|  | |

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

<a id="agentRenewConversationClaim"></a>
# **agentRenewConversationClaim**
> AgentConversationClaimDto agentRenewConversationClaim(conversationId, claimId, renewAgentConversationClaimOptions).execute();

Renew a conversation claim

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    UUID claimId = UUID.randomUUID(); // UUID | 
    RenewAgentConversationClaimOptions renewAgentConversationClaimOptions = new RenewAgentConversationClaimOptions(); // RenewAgentConversationClaimOptions | 
    try {
      AgentConversationClaimDto result = apiInstance.agentRenewConversationClaim(conversationId, claimId, renewAgentConversationClaimOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentRenewConversationClaim");
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
| **conversationId** | **UUID**|  | |
| **claimId** | **UUID**|  | |
| **renewAgentConversationClaimOptions** | [**RenewAgentConversationClaimOptions**](RenewAgentConversationClaimOptions)|  | |

### Return type

[**AgentConversationClaimDto**](AgentConversationClaimDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentRenewSmsClaim"></a>
# **agentRenewSmsClaim**
> AgentConversationClaimDto agentRenewSmsClaim(conversationId, claimId, renewAgentConversationClaimOptions).execute();

Renew an SMS conversation claim

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    UUID claimId = UUID.randomUUID(); // UUID | 
    RenewAgentConversationClaimOptions renewAgentConversationClaimOptions = new RenewAgentConversationClaimOptions(); // RenewAgentConversationClaimOptions | 
    try {
      AgentConversationClaimDto result = apiInstance.agentRenewSmsClaim(conversationId, claimId, renewAgentConversationClaimOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentRenewSmsClaim");
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
| **conversationId** | **UUID**|  | |
| **claimId** | **UUID**|  | |
| **renewAgentConversationClaimOptions** | [**RenewAgentConversationClaimOptions**](RenewAgentConversationClaimOptions)|  | |

### Return type

[**AgentConversationClaimDto**](AgentConversationClaimDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentReplyToEmail"></a>
# **agentReplyToEmail**
> SentEmailDto agentReplyToEmail(emailId, replyToEmailOptions).idempotencyKey(idempotencyKey).expectedConversationVersion(expectedConversationVersion).expectedLatestEmailId(expectedLatestEmailId).execute();

Reply to a scoped email as an agent

Sends a reply using the original conversation context after checking AGENT_REPLY_EMAIL and inbox scope.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | ID of email to reply to
    ReplyToEmailOptions replyToEmailOptions = new ReplyToEmailOptions(); // ReplyToEmailOptions | 
    String idempotencyKey = "idempotencyKey_example"; // String | 
    Long expectedConversationVersion = 56L; // Long | 
    UUID expectedLatestEmailId = UUID.randomUUID(); // UUID | 
    try {
      SentEmailDto result = apiInstance.agentReplyToEmail(emailId, replyToEmailOptions)
            .idempotencyKey(idempotencyKey)
            .expectedConversationVersion(expectedConversationVersion)
            .expectedLatestEmailId(expectedLatestEmailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentReplyToEmail");
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
| **emailId** | **UUID**| ID of email to reply to | |
| **replyToEmailOptions** | [**ReplyToEmailOptions**](ReplyToEmailOptions)|  | |
| **idempotencyKey** | **String**|  | [optional] |
| **expectedConversationVersion** | **Long**|  | [optional] |
| **expectedLatestEmailId** | **UUID**|  | [optional] |

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
| **200** | OK |  -  |

<a id="agentReplyToSms"></a>
# **agentReplyToSms**
> SentSmsDto agentReplyToSms(phoneNumberId, smsId, smsReplyOptions).idempotencyKey(idempotencyKey).expectedConversationVersion(expectedConversationVersion).expectedLatestMessageId(expectedLatestMessageId).execute();

Reply to received SMS

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    UUID smsId = UUID.randomUUID(); // UUID | 
    SmsReplyOptions smsReplyOptions = new SmsReplyOptions(); // SmsReplyOptions | 
    String idempotencyKey = "idempotencyKey_example"; // String | 
    Long expectedConversationVersion = 56L; // Long | 
    UUID expectedLatestMessageId = UUID.randomUUID(); // UUID | 
    try {
      SentSmsDto result = apiInstance.agentReplyToSms(phoneNumberId, smsId, smsReplyOptions)
            .idempotencyKey(idempotencyKey)
            .expectedConversationVersion(expectedConversationVersion)
            .expectedLatestMessageId(expectedLatestMessageId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentReplyToSms");
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
| **phoneNumberId** | **UUID**|  | |
| **smsId** | **UUID**|  | |
| **smsReplyOptions** | [**SmsReplyOptions**](SmsReplyOptions)|  | |
| **idempotencyKey** | **String**|  | [optional] |
| **expectedConversationVersion** | **Long**|  | [optional] |
| **expectedLatestMessageId** | **UUID**|  | [optional] |

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
| **201** | Created |  -  |

<a id="agentReportWorkerHeartbeat"></a>
# **agentReportWorkerHeartbeat**
> AgentWorkerHeartbeatDto agentReportWorkerHeartbeat(agentWorkerHeartbeatOptions).execute();

Report a worker heartbeat

Records one running worker instance and its deployed release for owner-side health monitoring. Send this during startup and periodically while the process can accept work; it does not claim or mutate a conversation.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    AgentWorkerHeartbeatOptions agentWorkerHeartbeatOptions = new AgentWorkerHeartbeatOptions(); // AgentWorkerHeartbeatOptions | 
    try {
      AgentWorkerHeartbeatDto result = apiInstance.agentReportWorkerHeartbeat(agentWorkerHeartbeatOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentReportWorkerHeartbeat");
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
| **agentWorkerHeartbeatOptions** | [**AgentWorkerHeartbeatOptions**](AgentWorkerHeartbeatOptions)|  | |

### Return type

[**AgentWorkerHeartbeatDto**](AgentWorkerHeartbeatDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentRequestConversationHandoff"></a>
# **agentRequestConversationHandoff**
> AgentConversationHandoffDto agentRequestConversationHandoff(conversationId, createAgentConversationHandoffOptions).execute();

Request human review for a conversation

Creates or returns the active handoff and moves the shared workflow state into REVIEW without classifying the request as an operational failure.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    CreateAgentConversationHandoffOptions createAgentConversationHandoffOptions = new CreateAgentConversationHandoffOptions(); // CreateAgentConversationHandoffOptions | 
    try {
      AgentConversationHandoffDto result = apiInstance.agentRequestConversationHandoff(conversationId, createAgentConversationHandoffOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentRequestConversationHandoff");
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
| **conversationId** | **UUID**|  | |
| **createAgentConversationHandoffOptions** | [**CreateAgentConversationHandoffOptions**](CreateAgentConversationHandoffOptions)|  | |

### Return type

[**AgentConversationHandoffDto**](AgentConversationHandoffDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentRequestSmsHandoff"></a>
# **agentRequestSmsHandoff**
> AgentConversationHandoffDto agentRequestSmsHandoff(conversationId, createAgentSmsConversationHandoffOptions).execute();

Request human review for an SMS conversation

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID conversationId = UUID.randomUUID(); // UUID | 
    CreateAgentSmsConversationHandoffOptions createAgentSmsConversationHandoffOptions = new CreateAgentSmsConversationHandoffOptions(); // CreateAgentSmsConversationHandoffOptions | 
    try {
      AgentConversationHandoffDto result = apiInstance.agentRequestSmsHandoff(conversationId, createAgentSmsConversationHandoffOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentRequestSmsHandoff");
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
| **conversationId** | **UUID**|  | |
| **createAgentSmsConversationHandoffOptions** | [**CreateAgentSmsConversationHandoffOptions**](CreateAgentSmsConversationHandoffOptions)|  | |

### Return type

[**AgentConversationHandoffDto**](AgentConversationHandoffDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentSearchInboxEmails"></a>
# **agentSearchInboxEmails**
> List&lt;EmailPreview&gt; agentSearchInboxEmails(inboxId, matchOptions).size(size).sort(sort).since(since).before(before).unreadOnly(unreadOnly).execute();

Search scoped inbox emails for an agent

Searches one scoped inbox using explicit field matches and attachment conditions. Use this for deterministic automation recovery instead of repeatedly fetching the latest message.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    MatchOptions matchOptions = new MatchOptions(); // MatchOptions | 
    Integer size = 20; // Integer | 
    String sort = "ASC"; // String | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    Boolean unreadOnly = true; // Boolean | 
    try {
      List<EmailPreview> result = apiInstance.agentSearchInboxEmails(inboxId, matchOptions)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .unreadOnly(unreadOnly)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentSearchInboxEmails");
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
| **matchOptions** | [**MatchOptions**](MatchOptions)|  | |
| **size** | **Integer**|  | [optional] [default to 20] |
| **sort** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **unreadOnly** | **Boolean**|  | [optional] |

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

<a id="agentSendEmailDraft"></a>
# **agentSendEmailDraft**
> SentEmailDto agentSendEmailDraft(inboxId, draftId).idempotencyKey(idempotencyKey).execute();

Send a scoped email draft for an agent

Sends a saved draft through the existing inbox send pipeline and deletes it only after send success.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox the draft belongs to
    UUID draftId = UUID.randomUUID(); // UUID | ID of draft
    String idempotencyKey = "idempotencyKey_example"; // String | 
    try {
      SentEmailDto result = apiInstance.agentSendEmailDraft(inboxId, draftId)
            .idempotencyKey(idempotencyKey)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentSendEmailDraft");
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
| **inboxId** | **UUID**| ID of inbox the draft belongs to | |
| **draftId** | **UUID**| ID of draft | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="agentSendSms"></a>
# **agentSendSms**
> SentSmsDto agentSendSms(phoneNumberId, smsSendOptions).idempotencyKey(idempotencyKey).expectedConversationVersion(expectedConversationVersion).expectedLatestMessageId(expectedLatestMessageId).execute();

Send SMS from an assigned phone number

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID phoneNumberId = UUID.randomUUID(); // UUID | 
    SmsSendOptions smsSendOptions = new SmsSendOptions(); // SmsSendOptions | 
    String idempotencyKey = "idempotencyKey_example"; // String | 
    Long expectedConversationVersion = 56L; // Long | 
    UUID expectedLatestMessageId = UUID.randomUUID(); // UUID | 
    try {
      SentSmsDto result = apiInstance.agentSendSms(phoneNumberId, smsSendOptions)
            .idempotencyKey(idempotencyKey)
            .expectedConversationVersion(expectedConversationVersion)
            .expectedLatestMessageId(expectedLatestMessageId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentSendSms");
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
| **phoneNumberId** | **UUID**|  | |
| **smsSendOptions** | [**SmsSendOptions**](SmsSendOptions)|  | |
| **idempotencyKey** | **String**|  | [optional] |
| **expectedConversationVersion** | **Long**|  | [optional] |
| **expectedLatestMessageId** | **UUID**|  | [optional] |

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
| **201** | Created |  -  |

<a id="agentUpdateEmailDraft"></a>
# **agentUpdateEmailDraft**
> EmailDraftDto agentUpdateEmailDraft(inboxId, draftId, sendEmailOptions).execute();

Update a scoped email draft for an agent

Replaces the SendEmailOptions stored for a draft. The draft remains attached to its original inbox.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | ID of inbox the draft belongs to
    UUID draftId = UUID.randomUUID(); // UUID | ID of draft
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    try {
      EmailDraftDto result = apiInstance.agentUpdateEmailDraft(inboxId, draftId, sendEmailOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentUpdateEmailDraft");
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
| **inboxId** | **UUID**| ID of inbox the draft belongs to | |
| **draftId** | **UUID**| ID of draft | |
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |

### Return type

[**EmailDraftDto**](EmailDraftDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="agentUpdateInbox"></a>
# **agentUpdateInbox**
> InboxDto agentUpdateInbox(inboxId, updateInboxOptions).execute();

Update an inbox visible to an inbox-manager connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | 
    UpdateInboxOptions updateInboxOptions = new UpdateInboxOptions(); // UpdateInboxOptions | 
    try {
      InboxDto result = apiInstance.agentUpdateInbox(inboxId, updateInboxOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentUpdateInbox");
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

<a id="agentUpdateTotpDevice"></a>
# **agentUpdateTotpDevice**
> TotpDeviceDto agentUpdateTotpDevice(id, updateTotpDeviceOptions).execute();

Update an agent-managed TOTP device

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AgentControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AgentControllerApi apiInstance = new AgentControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UpdateTotpDeviceOptions updateTotpDeviceOptions = new UpdateTotpDeviceOptions(); // UpdateTotpDeviceOptions | 
    try {
      TotpDeviceDto result = apiInstance.agentUpdateTotpDevice(id, updateTotpDeviceOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentControllerApi#agentUpdateTotpDevice");
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
| **id** | **UUID**|  | |
| **updateTotpDeviceOptions** | [**UpdateTotpDeviceOptions**](UpdateTotpDeviceOptions)|  | |

### Return type

[**TotpDeviceDto**](TotpDeviceDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

