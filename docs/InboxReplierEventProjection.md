

# InboxReplierEventProjection

Inbox replier event
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** |  |  [optional]
**id** | [**UUID**](UUID) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**userId** | [**UUID**](UUID) |  |  [optional]
**emailId** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**replierId** | [**UUID**](UUID) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;



