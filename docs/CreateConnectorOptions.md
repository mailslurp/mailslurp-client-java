

# CreateConnectorOptions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectorType** | [**ConnectorTypeEnum**](#ConnectorTypeEnum) |  | 
**connectorAuthType** | [**ConnectorAuthTypeEnum**](#ConnectorAuthTypeEnum) |  | 
**imapSettings** | [**CreateConnectorImapOptions**](CreateConnectorImapOptions) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**syncEnabled** | **Boolean** |  | 
**syncScheduleType** | [**SyncScheduleTypeEnum**](#SyncScheduleTypeEnum) |  | 
**syncInterval** | **Integer** |  |  [optional]



## Enum: ConnectorTypeEnum

Name | Value
---- | -----
IMAP | &quot;IMAP&quot;



## Enum: ConnectorAuthTypeEnum

Name | Value
---- | -----
PLAIN_TEXT | &quot;PLAIN_TEXT&quot;



## Enum: SyncScheduleTypeEnum

Name | Value
---- | -----
INTERVAL | &quot;INTERVAL&quot;



