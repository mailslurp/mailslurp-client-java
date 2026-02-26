

# ConnectorEventProjection

ConnectorEventProjection

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**connectorId** | **UUID** |  |  |
|**seen** | **Boolean** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**id** | **UUID** |  |  [optional] |
|**size** | **Long** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| SEND | &quot;SEND&quot; |
| SYNC | &quot;SYNC&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| INTERNAL_ERROR | &quot;INTERNAL_ERROR&quot; |
| SUBSCRIPTION_ERROR | &quot;SUBSCRIPTION_ERROR&quot; |
| CONNECTION_ERROR | &quot;CONNECTION_ERROR&quot; |
| NOT_FOUND | &quot;NOT_FOUND&quot; |



