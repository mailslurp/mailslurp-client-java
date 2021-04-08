

# DomainDto

Domain plus verification records and status
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catchAllInboxId** | [**UUID**](UUID.md) | The optional catch all inbox that will receive emails sent to the domain that cannot be matched. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**dkimTokens** | **List&lt;String&gt;** | Unique token DKIM tokens |  [optional]
**domain** | **String** | Custom domain name |  [optional]
**domainNameRecords** | [**List&lt;DomainNameRecord&gt;**](DomainNameRecord.md) | List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. |  [optional]
**id** | [**UUID**](UUID.md) |  | 
**isVerified** | **Boolean** | Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**userId** | [**UUID**](UUID.md) |  | 
**verificationToken** | **String** | Verification tokens |  [optional]



