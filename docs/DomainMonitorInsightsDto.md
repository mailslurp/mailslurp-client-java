

# DomainMonitorInsightsDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**monitorId** | **UUID** |  |  |
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**totalRuns** | **Integer** |  |  |
|**healthyRuns** | **Integer** |  |  |
|**degradedRuns** | **Integer** |  |  |
|**criticalRuns** | **Integer** |  |  |
|**failedRuns** | **Integer** |  |  |
|**successRate** | **Double** |  |  |
|**averageHealthScore** | **Double** |  |  |
|**currentHealthyStreak** | **Integer** |  |  |
|**bestHealthyStreak** | **Integer** |  |  |
|**goodPerformanceSignals** | **List&lt;String&gt;** |  |  |
|**attentionSignals** | **List&lt;String&gt;** |  |  |
|**topFindings** | **List&lt;String&gt;** |  |  |
|**latestRun** | [**DomainMonitorRunDto**](DomainMonitorRunDto) |  |  [optional] |



