

# DomainPreview

Preview object for domain entity
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catchAllInboxId** | [**UUID**](UUID) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**domain** | **String** |  | 
**domainType** | [**DomainTypeEnum**](#DomainTypeEnum) |  | 
**id** | [**UUID**](UUID) |  | 
**isVerified** | **Boolean** |  | 



## Enum: DomainTypeEnum

Name | Value
---- | -----
HTTP_INBOX | &quot;HTTP_INBOX&quot;
SMTP_DOMAIN | &quot;SMTP_DOMAIN&quot;



