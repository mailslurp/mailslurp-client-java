

# ConnectorSyncEventProjection

ConnectorSyncEventProjection
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** |  |  [optional]
**id** | [**UUID**](UUID) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**connectorId** | [**UUID**](UUID) |  | 
**syncCount** | **Long** |  | 
**syncStatus** | [**SyncStatusEnum**](#SyncStatusEnum) |  | 



## Enum: SyncStatusEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
INTERNAL_ERROR | &quot;INTERNAL_ERROR&quot;
SUBSCRIPTION_ERROR | &quot;SUBSCRIPTION_ERROR&quot;
CONNECTION_ERROR | &quot;CONNECTION_ERROR&quot;
NOT_FOUND | &quot;NOT_FOUND&quot;



