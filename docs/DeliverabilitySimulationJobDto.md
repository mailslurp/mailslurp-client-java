

# DeliverabilitySimulationJobDto

Deliverability simulation job status

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**testId** | **UUID** |  |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**totalTargets** | **Long** |  |  |
|**totalPlannedSends** | **Long** |  |  |
|**nextSendIndex** | **Long** |  |  |
|**sentCount** | **Long** |  |  |
|**successCount** | **Long** |  |  |
|**failureCount** | **Long** |  |  |
|**progressPercent** | **Double** |  |  |
|**activeTargetLabel** | **String** |  |  [optional] |
|**estimatedRemainingMs** | **Long** |  |  [optional] |
|**configSnapshot** | [**DeliverabilitySimulationJobConfigDto**](DeliverabilitySimulationJobConfigDto) |  |  |
|**errorSummary** | [**DeliverabilitySimulationJobErrorSummaryDto**](DeliverabilitySimulationJobErrorSummaryDto) |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RUNNING | &quot;RUNNING&quot; |
| PAUSED | &quot;PAUSED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



