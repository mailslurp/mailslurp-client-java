

# CreateAutomatedInboxPlacementScheduleOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**intervalMinutes** | **Long** |  |  |
|**enabled** | **Boolean** |  |  |
|**requestedSegment** | [**RequestedSegmentEnum**](#RequestedSegmentEnum) |  |  |
|**seedlistProfile** | **String** |  |  [optional] |
|**subjectTemplate** | **String** |  |  |
|**textBodyTemplate** | **String** |  |  [optional] |
|**htmlBodyTemplate** | **String** |  |  [optional] |
|**sourceRunId** | **UUID** |  |  [optional] |



## Enum: RequestedSegmentEnum

| Name | Value |
|---- | -----|
| ALL_INBOXES | &quot;ALL_INBOXES&quot; |
| PERSONAL_INBOXES | &quot;PERSONAL_INBOXES&quot; |
| PROFESSIONAL_INBOXES | &quot;PROFESSIONAL_INBOXES&quot; |



