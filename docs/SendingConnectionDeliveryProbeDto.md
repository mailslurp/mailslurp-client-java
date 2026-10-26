

# SendingConnectionDeliveryProbeDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**acceptedAt** | **OffsetDateTime** |  |  [optional] |
|**deliveredAt** | **OffsetDateTime** |  |  [optional] |
|**latencyMillis** | **Long** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DELIVERED | &quot;DELIVERED&quot; |
| INCONCLUSIVE | &quot;INCONCLUSIVE&quot; |



