

# CreateDeliverabilityTestOptions

Create a new deliverability/load test

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Optional name for the test |  [optional] |
|**description** | **String** | Optional description |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | Entity scope to evaluate |  |
|**startAt** | **OffsetDateTime** | UTC instant when the receive window starts. Defaults to now if omitted. |  [optional] |
|**maxDurationSeconds** | **Long** | Optional timeout in seconds after startAt. If not all entities match before timeout the test transitions to FAILED. |  [optional] |
|**successThresholdPercent** | **Double** | Optional acceptable success threshold percentage (0,100]. If set, a timed-out test can complete successfully when matchedEntities/totalEntities reaches this percentage. |  [optional] |
|**selector** | [**DeliverabilitySelectorOptions**](DeliverabilitySelectorOptions) |  |  |
|**expectations** | [**List&lt;DeliverabilityExpectation&gt;**](DeliverabilityExpectation) | One or more expectations to evaluate for each entity |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



