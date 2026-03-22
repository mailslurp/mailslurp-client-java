

# CampaignProbeRunDueResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**triggerSource** | [**TriggerSourceEnum**](#TriggerSourceEnum) |  |  |
|**runCount** | **Integer** |  |  |
|**dueProbeCount** | **Integer** |  |  |
|**skippedCount** | **Integer** |  |  |
|**requestedMaxRuns** | **Integer** |  |  |
|**executedAt** | **OffsetDateTime** |  |  |



## Enum: TriggerSourceEnum

| Name | Value |
|---- | -----|
| DIRECT_API | &quot;DIRECT_API&quot; |
| SES_MONITOR | &quot;SES_MONITOR&quot; |
| USER_SCHEDULE | &quot;USER_SCHEDULE&quot; |
| CRON | &quot;CRON&quot; |
| SCHEDULER | &quot;SCHEDULER&quot; |



