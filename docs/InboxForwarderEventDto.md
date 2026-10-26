

# InboxForwarderEventDto

Inbox forwarder event. Describes how an email was handled by an inbox forwarder.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**sentId** | **UUID** |  |  [optional] |
|**userId** | **UUID** |  |  [optional] |
|**forwarderId** | **UUID** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILURE | &quot;FAILURE&quot; |



