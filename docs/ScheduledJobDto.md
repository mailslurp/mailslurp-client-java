

# ScheduledJobDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  |
|**jobId** | **String** |  |  |
|**groupId** | **String** |  |  |
|**triggerId** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**sendAtTimestamp** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;SUBMITTED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| ABORTED | &quot;ABORTED&quot; |
| FAILED | &quot;FAILED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |



