

# CampaignProbeInsightsDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**probeId** | **UUID** |  |  |
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**totalRuns** | **Integer** |  |  |
|**healthyRuns** | **Integer** |  |  |
|**warningRuns** | **Integer** |  |  |
|**failedRuns** | **Integer** |  |  |
|**successRate** | **Double** |  |  |
|**averageHealthScore** | **Double** |  |  |
|**currentHealthyStreak** | **Integer** |  |  |
|**bestHealthyStreak** | **Integer** |  |  |
|**goodPerformanceSignals** | **List&lt;String&gt;** |  |  |
|**attentionSignals** | **List&lt;String&gt;** |  |  |
|**topFindings** | **List&lt;String&gt;** |  |  |
|**latestRun** | [**CampaignProbeRunDto**](CampaignProbeRunDto) |  |  [optional] |



