

# DomainPreview

Preview object for domain entity
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**domain** | **String** |  | 
**catchAllInboxId** | [**UUID**](UUID) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**domainType** | [**DomainTypeEnum**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. | 
**isVerified** | **Boolean** |  | 



## Enum: DomainTypeEnum

Name | Value
---- | -----
HTTP_INBOX | &quot;HTTP_INBOX&quot;
SMTP_DOMAIN | &quot;SMTP_DOMAIN&quot;



