

# InboxReplierEventProjection

Inbox replier event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**recipients** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**emailId** | **UUID** |  |  [optional] |
|**sentId** | **UUID** |  |  [optional] |
|**replierId** | **UUID** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



