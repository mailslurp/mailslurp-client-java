

# InboxReplierEventProjection

Inbox replier event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **UUID** |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**recipients** | **List&lt;String&gt;** |  |  [optional] |
|**sentId** | **UUID** |  |  [optional] |
|**replierId** | **UUID** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



