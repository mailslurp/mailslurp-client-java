

# ConnectorEventDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**connectorId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**size** | **Long** |  |  |
|**message** | **String** |  |  [optional] |
|**logs** | **String** |  |  [optional] |
|**seen** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| INTERNAL_ERROR | &quot;INTERNAL_ERROR&quot; |
| SUBSCRIPTION_ERROR | &quot;SUBSCRIPTION_ERROR&quot; |
| CONNECTION_ERROR | &quot;CONNECTION_ERROR&quot; |
| NOT_FOUND | &quot;NOT_FOUND&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| SEND | &quot;SEND&quot; |
| SYNC | &quot;SYNC&quot; |



