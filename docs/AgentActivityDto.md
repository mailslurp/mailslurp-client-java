

# AgentActivityDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**apiKeyEntityId** | **UUID** |  |  [optional] |
|**agentName** | **String** |  |  [optional] |
|**agentRole** | [**AgentRoleEnum**](#AgentRoleEnum) |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**toolName** | **String** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**draftId** | **UUID** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**conversationId** | **UUID** |  |  [optional] |
|**threadId** | **UUID** |  |  [optional] |
|**actionName** | **String** |  |  [optional] |
|**actionRequestId** | **UUID** |  |  [optional] |
|**errorCode** | **String** |  |  [optional] |
|**phoneNumberId** | **UUID** |  |  [optional] |
|**smsId** | **UUID** |  |  [optional] |
|**sentSmsId** | **UUID** |  |  [optional] |
|**smsParticipant** | **String** |  |  [optional] |



## Enum: AgentRoleEnum

| Name | Value |
|---- | -----|
| AGENT_READ_ONLY | &quot;AGENT_READ_ONLY&quot; |
| AGENT_DRAFT_ONLY | &quot;AGENT_DRAFT_ONLY&quot; |
| AGENT_RESPONDER | &quot;AGENT_RESPONDER&quot; |
| AGENT_INBOX_MANAGER | &quot;AGENT_INBOX_MANAGER&quot; |
| AGENT_SUPPORT | &quot;AGENT_SUPPORT&quot; |
| AGENT_TOTP_MANAGER | &quot;AGENT_TOTP_MANAGER&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| LIST_INBOX_EMAILS | &quot;LIST_INBOX_EMAILS&quot; |
| GET_LATEST_INBOX_EMAIL | &quot;GET_LATEST_INBOX_EMAIL&quot; |
| GET_EMAIL_SUMMARY | &quot;GET_EMAIL_SUMMARY&quot; |
| GET_EMAIL | &quot;GET_EMAIL&quot; |
| REPLY_TO_EMAIL | &quot;REPLY_TO_EMAIL&quot; |
| CREATE_EMAIL_DRAFT | &quot;CREATE_EMAIL_DRAFT&quot; |
| LIST_EMAIL_DRAFTS | &quot;LIST_EMAIL_DRAFTS&quot; |
| GET_EMAIL_DRAFT | &quot;GET_EMAIL_DRAFT&quot; |
| UPDATE_EMAIL_DRAFT | &quot;UPDATE_EMAIL_DRAFT&quot; |
| SEND_EMAIL_DRAFT | &quot;SEND_EMAIL_DRAFT&quot; |
| DELETE_EMAIL_DRAFT | &quot;DELETE_EMAIL_DRAFT&quot; |
| CREATE_TOTP_DEVICE | &quot;CREATE_TOTP_DEVICE&quot; |
| LIST_TOTP_DEVICES | &quot;LIST_TOTP_DEVICES&quot; |
| GET_TOTP_DEVICE | &quot;GET_TOTP_DEVICE&quot; |
| UPDATE_TOTP_DEVICE | &quot;UPDATE_TOTP_DEVICE&quot; |
| DELETE_TOTP_DEVICE | &quot;DELETE_TOTP_DEVICE&quot; |
| GENERATE_TOTP_CODE | &quot;GENERATE_TOTP_CODE&quot; |
| LIST_PHONE_NUMBERS | &quot;LIST_PHONE_NUMBERS&quot; |
| GET_PHONE_NUMBER | &quot;GET_PHONE_NUMBER&quot; |
| LIST_RECEIVED_SMS | &quot;LIST_RECEIVED_SMS&quot; |
| GET_RECEIVED_SMS | &quot;GET_RECEIVED_SMS&quot; |
| LIST_SENT_SMS | &quot;LIST_SENT_SMS&quot; |
| GET_SENT_SMS | &quot;GET_SENT_SMS&quot; |
| LIST_PHONE_MESSAGE_THREADS | &quot;LIST_PHONE_MESSAGE_THREADS&quot; |
| LIST_PHONE_MESSAGE_THREAD_ITEMS | &quot;LIST_PHONE_MESSAGE_THREAD_ITEMS&quot; |
| LIST_SMS_CONVERSATIONS | &quot;LIST_SMS_CONVERSATIONS&quot; |
| GET_SMS_CONVERSATION | &quot;GET_SMS_CONVERSATION&quot; |
| CLAIM_SMS_CONVERSATION | &quot;CLAIM_SMS_CONVERSATION&quot; |
| ADD_SMS_CONVERSATION_NOTE | &quot;ADD_SMS_CONVERSATION_NOTE&quot; |
| REQUEST_SMS_CONVERSATION_HANDOFF | &quot;REQUEST_SMS_CONVERSATION_HANDOFF&quot; |
| SEND_SMS | &quot;SEND_SMS&quot; |
| REPLY_SMS | &quot;REPLY_SMS&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



