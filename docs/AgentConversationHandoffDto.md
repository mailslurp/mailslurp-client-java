

# AgentConversationHandoffDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**conversationId** | **UUID** |  |  |
|**requestedByApiKeyEntityId** | **UUID** |  |  [optional] |
|**requestedByUserId** | **UUID** |  |  [optional] |
|**reasonCode** | **String** |  |  |
|**reason** | **String** |  |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**assignedUserId** | **UUID** |  |  [optional] |
|**sourceEmailId** | **UUID** |  |  [optional] |
|**draftId** | **UUID** |  |  [optional] |
|**version** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**sourceSmsId** | **UUID** |  |  [optional] |
|**conversationVersion** | **Long** |  |  [optional] |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| NORMAL | &quot;NORMAL&quot; |
| HIGH | &quot;HIGH&quot; |
| URGENT | &quot;URGENT&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REQUESTED | &quot;REQUESTED&quot; |
| ASSIGNED | &quot;ASSIGNED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



