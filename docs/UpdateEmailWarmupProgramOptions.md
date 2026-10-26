

# UpdateEmailWarmupProgramOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expectedVersion** | **Long** |  |  |
|**name** | **String** |  |  [optional] |
|**goalDailyVolume** | **Integer** |  |  [optional] |
|**schedulePreset** | [**SchedulePresetEnum**](#SchedulePresetEnum) |  |  [optional] |
|**rampDurationDays** | **Integer** |  |  [optional] |
|**maintenanceEnabled** | **Boolean** |  |  [optional] |
|**maintenanceDailyVolume** | **Integer** |  |  [optional] |
|**sendWindowStart** | **String** |  |  [optional] |
|**sendWindowEnd** | **String** |  |  [optional] |
|**timeZone** | **String** |  |  [optional] |
|**content** | [**EmailWarmupContentOptions**](EmailWarmupContentOptions) |  |  [optional] |



## Enum: SchedulePresetEnum

| Name | Value |
|---- | -----|
| GENTLE | &quot;GENTLE&quot; |
| STANDARD | &quot;STANDARD&quot; |
| REPAIR | &quot;REPAIR&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



