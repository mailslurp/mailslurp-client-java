

# InboxForwarderEventProjection

Inbox forwarder event

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**forwarderId** | **UUID** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



