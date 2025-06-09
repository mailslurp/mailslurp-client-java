

# InboxForwarderEventProjection

Inbox forwarder event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**sentId** | **UUID** |  |  [optional] |
|**forwarderId** | **UUID** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



