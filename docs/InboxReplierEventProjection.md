

# InboxReplierEventProjection

Inbox replier event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**recipients** | **List&lt;String&gt;** |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**sentId** | **UUID** |  |  [optional] |
|**replierId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



