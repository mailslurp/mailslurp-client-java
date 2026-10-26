

# AgentConversationNoteDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**conversationId** | **UUID** |  |  |
|**actorType** | [**ActorTypeEnum**](#ActorTypeEnum) |  |  |
|**actorApiKeyEntityId** | **UUID** |  |  [optional] |
|**actorUserId** | **UUID** |  |  [optional] |
|**body** | **String** |  |  |
|**sourceEmailId** | **UUID** |  |  [optional] |
|**draftId** | **UUID** |  |  [optional] |
|**handoffId** | **UUID** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**sourceSmsId** | **UUID** |  |  [optional] |
|**conversationVersion** | **Long** |  |  [optional] |



## Enum: ActorTypeEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;AGENT&quot; |
| OPERATOR | &quot;OPERATOR&quot; |
| SYSTEM | &quot;SYSTEM&quot; |



