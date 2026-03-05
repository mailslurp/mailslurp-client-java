

# DeliverabilityTestDto

Deliverability test configuration and progress summary

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**selector** | [**DeliverabilitySelectorOptions**](DeliverabilitySelectorOptions) |  |  |
|**selectedEntityCount** | **Long** |  |  |
|**expectations** | [**List&lt;DeliverabilityExpectation&gt;**](DeliverabilityExpectation) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**startAt** | **OffsetDateTime** |  |  |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**maxDurationSeconds** | **Long** |  |  [optional] |
|**successThresholdPercent** | **Double** |  |  [optional] |
|**thresholdStatus** | [**ThresholdStatusEnum**](#ThresholdStatusEnum) |  |  |
|**thresholdMet** | **Boolean** |  |  [optional] |
|**lastEvaluatedAt** | **OffsetDateTime** |  |  [optional] |
|**totalEntities** | **Long** |  |  |
|**matchedEntities** | **Long** |  |  |
|**unmatchedEntities** | **Long** |  |  |
|**completionPercentage** | **Double** |  |  |
|**timedOut** | **Boolean** |  |  |
|**failureReason** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



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



