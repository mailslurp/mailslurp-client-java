

# AgentAutomationEventDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **UUID** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**schemaVersion** | **Integer** |  |  |
|**occurredAt** | **OffsetDateTime** |  |  |
|**publishedAt** | **OffsetDateTime** |  |  |
|**conversationId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**conversationVersion** | **Long** |  |  [optional] |
|**phoneNumberId** | **UUID** |  |  [optional] |
|**smsId** | **UUID** |  |  [optional] |
|**sentSmsId** | **UUID** |  |  [optional] |
|**sourceType** | **String** |  |  [optional] |
|**sourceId** | **UUID** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot; |
| EMAIL_SENT | &quot;EMAIL_SENT&quot; |
| SMS_RECEIVED | &quot;SMS_RECEIVED&quot; |
| SMS_SENT | &quot;SMS_SENT&quot; |
| CONVERSATION_CLAIMED | &quot;CONVERSATION_CLAIMED&quot; |
| CONVERSATION_CLAIM_RELEASED | &quot;CONVERSATION_CLAIM_RELEASED&quot; |
| CONVERSATION_NOTE_ADDED | &quot;CONVERSATION_NOTE_ADDED&quot; |
| CONVERSATION_REVIEW_REQUESTED | &quot;CONVERSATION_REVIEW_REQUESTED&quot; |
| CONVERSATION_REVIEW_DECIDED | &quot;CONVERSATION_REVIEW_DECIDED&quot; |
| CONVERSATION_RESOLVED | &quot;CONVERSATION_RESOLVED&quot; |
| CONVERSATION_REOPENED | &quot;CONVERSATION_REOPENED&quot; |
| AGENT_REPLY_COMPLETED | &quot;AGENT_REPLY_COMPLETED&quot; |
| AGENT_SMS_SENT | &quot;AGENT_SMS_SENT&quot; |
| AGENT_SMS_REPLY_COMPLETED | &quot;AGENT_SMS_REPLY_COMPLETED&quot; |
| AGENT_DRAFT_CREATED | &quot;AGENT_DRAFT_CREATED&quot; |
| AGENT_DRAFT_SENT | &quot;AGENT_DRAFT_SENT&quot; |
| AGENT_ACTION_FAILED | &quot;AGENT_ACTION_FAILED&quot; |



