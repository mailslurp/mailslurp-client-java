

# UpdateDeliverabilityTestOptions

Update a deliverability/load test

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Optional updated name |  [optional] |
|**description** | **String** | Optional updated description |  [optional] |
|**startAt** | **OffsetDateTime** | Optional updated receive-window start time. Only applied while test is not terminal. |  [optional] |
|**maxDurationSeconds** | **Long** | Optional updated timeout in seconds |  [optional] |
|**clearMaxDuration** | **Boolean** | Set true to clear timeout. If true, maxDurationSeconds is ignored for this request. |  [optional] |
|**successThresholdPercent** | **Double** | Optional updated acceptable success threshold percentage (0,100]. |  [optional] |
|**clearSuccessThreshold** | **Boolean** | Set true to clear success threshold. If true, successThresholdPercent is ignored for this request. |  [optional] |
|**expectations** | [**List&lt;DeliverabilityExpectation&gt;**](DeliverabilityExpectation) | Optional replacement expectations |  [optional] |



