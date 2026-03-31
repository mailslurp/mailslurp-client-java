

# DomainMonitorRunDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**monitorId** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**domain** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**triggerSource** | [**TriggerSourceEnum**](#TriggerSourceEnum) |  |  |
|**healthScore** | **Integer** |  |  |
|**totalChecks** | **Integer** |  |  |
|**passingChecks** | **Integer** |  |  |
|**failingChecks** | **Integer** |  |  |
|**spfOk** | **Boolean** |  |  |
|**dmarcOk** | **Boolean** |  |  |
|**dmarcEnforced** | **Boolean** |  |  |
|**mxOk** | **Boolean** |  |  |
|**insights** | **List&lt;String&gt;** |  |  |
|**errorMessage** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| DEGRADED | &quot;DEGRADED&quot; |
| CRITICAL | &quot;CRITICAL&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: TriggerSourceEnum

| Name | Value |
|---- | -----|
| API | &quot;API&quot; |
| USER_SCHEDULE | &quot;USER_SCHEDULE&quot; |
| CRON | &quot;CRON&quot; |
| SCHEDULER | &quot;SCHEDULER&quot; |



