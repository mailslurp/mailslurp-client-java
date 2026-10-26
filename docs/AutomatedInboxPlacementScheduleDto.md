

# AutomatedInboxPlacementScheduleDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**connectionId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**enabled** | **Boolean** |  |  |
|**intervalMinutes** | **Long** |  |  |
|**requestedSegment** | [**RequestedSegmentEnum**](#RequestedSegmentEnum) |  |  |
|**seedlistProfile** | **String** |  |  [optional] |
|**subjectTemplate** | **String** |  |  |
|**textBodyTemplate** | **String** |  |  [optional] |
|**htmlBodyTemplate** | **String** |  |  [optional] |
|**sourceRunId** | **UUID** |  |  [optional] |
|**lastStatus** | [**LastStatusEnum**](#LastStatusEnum) |  |  [optional] |
|**consecutiveFailures** | **Integer** |  |  |
|**lastRunAt** | **OffsetDateTime** |  |  [optional] |
|**nextRunAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: RequestedSegmentEnum

| Name | Value |
|---- | -----|
| ALL_INBOXES | &quot;ALL_INBOXES&quot; |
| PERSONAL_INBOXES | &quot;PERSONAL_INBOXES&quot; |
| PROFESSIONAL_INBOXES | &quot;PROFESSIONAL_INBOXES&quot; |



## Enum: LastStatusEnum

| Name | Value |
|---- | -----|
| PREPARING | &quot;PREPARING&quot; |
| SENDING | &quot;SENDING&quot; |
| SENT_PENDING_CONFIRMATION | &quot;SENT_PENDING_CONFIRMATION&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| FAILED | &quot;FAILED&quot; |
| UNCERTAIN | &quot;UNCERTAIN&quot; |



