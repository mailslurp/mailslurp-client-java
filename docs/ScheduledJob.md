

# ScheduledJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**userId** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  | 
**jobId** | **String** |  | 
**groupId** | **String** |  | 
**triggerId** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**sendAtTimestamp** | [**OffsetDateTime**](OffsetDateTime) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



## Enum: StatusEnum

Name | Value
---- | -----
SUBMITTED | &quot;SUBMITTED&quot;
COMPLETED | &quot;COMPLETED&quot;
FAILED | &quot;FAILED&quot;



