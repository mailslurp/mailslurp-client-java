

# ConnectorDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**userId** | [**UUID**](UUID) |  | 
**connectorType** | [**ConnectorTypeEnum**](#ConnectorTypeEnum) |  | 
**connectorAuthType** | [**ConnectorAuthTypeEnum**](#ConnectorAuthTypeEnum) |  | 
**syncEnabled** | **Boolean** |  | 
**syncScheduleType** | [**SyncScheduleTypeEnum**](#SyncScheduleTypeEnum) |  | 
**syncInterval** | **Integer** |  |  [optional]
**imapHost** | **String** |  |  [optional]
**imapPort** | **Integer** |  |  [optional]
**imapUsername** | **String** |  |  [optional]
**imapPassword** | **String** |  |  [optional]
**imapSsl** | **Boolean** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



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



