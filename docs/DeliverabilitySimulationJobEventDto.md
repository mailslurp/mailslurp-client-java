

# DeliverabilitySimulationJobEventDto

Single event for a deliverability simulation job

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**sendIndex** | **Long** |  |  [optional] |
|**entityId** | **UUID** |  |  [optional] |
|**targetLabel** | **String** |  |  [optional] |
|**expectationName** | **String** |  |  [optional] |
|**attempt** | **Integer** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**error** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| JOB_CREATED | &quot;JOB_CREATED&quot; |
| JOB_STARTED | &quot;JOB_STARTED&quot; |
| JOB_PAUSED | &quot;JOB_PAUSED&quot; |
| JOB_RESUMED | &quot;JOB_RESUMED&quot; |
| JOB_CANCELLED | &quot;JOB_CANCELLED&quot; |
| JOB_COMPLETED | &quot;JOB_COMPLETED&quot; |
| JOB_FAILED | &quot;JOB_FAILED&quot; |
| SEND_SUCCESS | &quot;SEND_SUCCESS&quot; |
| SEND_FAILURE | &quot;SEND_FAILURE&quot; |



