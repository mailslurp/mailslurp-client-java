

# EmailWarmupProgramAnalyticsDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**programId** | **UUID** |  |  |
|**fromDate** | **LocalDate** |  |  |
|**throughDate** | **LocalDate** |  |  |
|**progress** | [**EmailWarmupProgramProgressDto**](EmailWarmupProgramProgressDto) |  |  |
|**totalScheduledSends** | **Long** |  |  |
|**totalAcceptedSends** | **Long** |  |  |
|**totalObservedSends** | **Long** |  |  |
|**totalFailedSends** | **Long** |  |  |
|**attentionRequiredSends** | **Long** |  |  |
|**dailyActivity** | [**List&lt;EmailWarmupDailyActivityDto&gt;**](EmailWarmupDailyActivityDto) |  |  |
|**placementChecks** | [**List&lt;EmailWarmupPlacementCheckDto&gt;**](EmailWarmupPlacementCheckDto) |  |  |
|**readiness** | [**EmailWarmupReadinessDto**](EmailWarmupReadinessDto) |  |  [optional] |



