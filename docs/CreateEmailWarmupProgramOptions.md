

# CreateEmailWarmupProgramOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**connectionId** | **UUID** |  |  |
|**customerIntent** | [**CustomerIntentEnum**](#CustomerIntentEnum) |  |  |
|**currentDailyVolume** | **Integer** |  |  |
|**goalDailyVolume** | **Integer** |  |  |
|**schedulePreset** | [**SchedulePresetEnum**](#SchedulePresetEnum) |  |  |
|**rampDurationDays** | **Integer** |  |  |
|**maintenanceEnabled** | **Boolean** |  |  |
|**maintenanceDailyVolume** | **Integer** |  |  |
|**sendWindowStart** | **String** |  |  |
|**sendWindowEnd** | **String** |  |  |
|**timeZone** | **String** |  |  |
|**requestedCoverage** | [**RequestedCoverageEnum**](#RequestedCoverageEnum) |  |  |
|**baselineTestId** | **UUID** |  |  [optional] |
|**content** | [**EmailWarmupContentOptions**](EmailWarmupContentOptions) |  |  |
|**senderOwnershipAttested** | **Boolean** |  |  |
|**permissionBasedSendingAttested** | **Boolean** |  |  |



## Enum: CustomerIntentEnum

| Name | Value |
|---- | -----|
| NEW_SENDER_WARMUP | &quot;NEW_SENDER_WARMUP&quot; |
| EXISTING_SENDER_REPAIR | &quot;EXISTING_SENDER_REPAIR&quot; |



## Enum: SchedulePresetEnum

| Name | Value |
|---- | -----|
| GENTLE | &quot;GENTLE&quot; |
| STANDARD | &quot;STANDARD&quot; |
| REPAIR | &quot;REPAIR&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: RequestedCoverageEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| CONTROLLED | &quot;CONTROLLED&quot; |
| CORE | &quot;CORE&quot; |
| EXPANDED | &quot;EXPANDED&quot; |



