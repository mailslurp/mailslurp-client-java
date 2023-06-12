

# ConnectorProjection

Connector

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**connectorType** | [**ConnectorTypeEnum**](#ConnectorTypeEnum) |  |  |
|**syncScheduleType** | [**SyncScheduleTypeEnum**](#SyncScheduleTypeEnum) |  |  |
|**syncInterval** | **Integer** |  |  [optional] |
|**syncEnabled** | **Boolean** |  |  |



## Enum: ConnectorTypeEnum

| Name | Value |
|---- | -----|
| IMAP | &quot;IMAP&quot; |



## Enum: SyncScheduleTypeEnum

| Name | Value |
|---- | -----|
| INTERVAL | &quot;INTERVAL&quot; |



