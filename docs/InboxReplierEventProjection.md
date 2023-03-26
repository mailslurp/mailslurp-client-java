

# InboxReplierEventProjection

Inbox replier event
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** |  |  [optional]
**id** | [**UUID**](UUID) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**recipients** | **List&lt;String&gt;** |  |  [optional]
**userId** | [**UUID**](UUID) |  |  [optional]
**emailId** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**sentId** | [**UUID**](UUID) |  |  [optional]
**replierId** | [**UUID**](UUID) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
FAILURE | &quot;FAILURE&quot;



