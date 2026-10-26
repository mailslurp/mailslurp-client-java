

# EmailWarmupReadinessDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**summary** | **String** |  |  |
|**readyForDailyVolume** | **Integer** |  |  |
|**goalDailyVolume** | **Integer** |  |  |
|**estimatedReadyAt** | **LocalDate** |  |  [optional] |
|**today** | [**EmailWarmupTodayDto**](EmailWarmupTodayDto) |  |  |
|**pacing** | [**EmailWarmupPacingDto**](EmailWarmupPacingDto) |  |  |
|**placementDeltas** | [**List&lt;EmailWarmupPlacementDeltaDto&gt;**](EmailWarmupPlacementDeltaDto) |  |  |
|**domainHealth** | [**EmailWarmupDomainHealthDto**](EmailWarmupDomainHealthDto) |  |  |
|**postmasterSignals** | [**EmailWarmupPostmasterSignalsDto**](EmailWarmupPostmasterSignalsDto) |  |  [optional] |
|**recommendations** | **List&lt;String&gt;** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PREPARING | &quot;PREPARING&quot; |
| IMPROVING | &quot;IMPROVING&quot; |
| READY | &quot;READY&quot; |
| NEEDS_ATTENTION | &quot;NEEDS_ATTENTION&quot; |



