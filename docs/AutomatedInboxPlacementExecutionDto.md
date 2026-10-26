

# AutomatedInboxPlacementExecutionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**scheduleId** | **UUID** |  |  |
|**connectionId** | **UUID** |  |  |
|**scheduledFor** | **OffsetDateTime** |  |  |
|**triggerSource** | [**TriggerSourceEnum**](#TriggerSourceEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**inboxPlacementRunId** | **UUID** |  |  [optional] |
|**targetCount** | **Integer** |  |  |
|**sentCount** | **Integer** |  |  |
|**attemptCount** | **Integer** |  |  |
|**failureCode** | **String** |  |  [optional] |
|**failureMessage** | **String** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**finishedAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: TriggerSourceEnum

| Name | Value |
|---- | -----|
| SCHEDULE | &quot;SCHEDULE&quot; |
| API | &quot;API&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PREPARING | &quot;PREPARING&quot; |
| SENDING | &quot;SENDING&quot; |
| SENT_PENDING_CONFIRMATION | &quot;SENT_PENDING_CONFIRMATION&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| FAILED | &quot;FAILED&quot; |
| UNCERTAIN | &quot;UNCERTAIN&quot; |



