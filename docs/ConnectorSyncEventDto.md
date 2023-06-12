

# ConnectorSyncEventDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**connectorId** | **UUID** |  |  |
|**syncStatus** | [**SyncStatusEnum**](#SyncStatusEnum) |  |  |
|**syncCount** | **Long** |  |  |
|**message** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: SyncStatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| INTERNAL_ERROR | &quot;INTERNAL_ERROR&quot; |
| SUBSCRIPTION_ERROR | &quot;SUBSCRIPTION_ERROR&quot; |
| CONNECTION_ERROR | &quot;CONNECTION_ERROR&quot; |
| NOT_FOUND | &quot;NOT_FOUND&quot; |



