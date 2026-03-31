

# DeliverabilityAnalyticsRunDto

Run-level metrics for analytics tables

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**startAt** | **OffsetDateTime** |  |  |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**totalEntities** | **Long** |  |  |
|**matchedEntities** | **Long** |  |  |
|**unmatchedEntities** | **Long** |  |  |
|**completionPercentage** | **Double** |  |  |
|**successThresholdPercent** | **Double** |  |  [optional] |
|**thresholdStatus** | [**ThresholdStatusEnum**](#ThresholdStatusEnum) |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| SCHEDULED | &quot;SCHEDULED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| PAUSED | &quot;PAUSED&quot; |
| STOPPED | &quot;STOPPED&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: ThresholdStatusEnum

| Name | Value |
|---- | -----|
| NOT_CONFIGURED | &quot;NOT_CONFIGURED&quot; |
| PASSING | &quot;PASSING&quot; |
| FAILING | &quot;FAILING&quot; |



