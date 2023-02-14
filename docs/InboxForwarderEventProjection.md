

# InboxForwarderEventProjection

Inbox forwarder event
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** |  |  [optional]
**id** | [**UUID**](UUID) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**forwarderId** | [**UUID**](UUID) |  |  [optional]
**emailId** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**userId** | [**UUID**](UUID) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;



