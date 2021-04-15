

# DomainDto

Domain plus verification records and status
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catchAllInboxId** | [**UUID**](UUID) | The optional catch all inbox that will receive emails sent to the domain that cannot be matched. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**dkimTokens** | **List&lt;String&gt;** | Unique token DKIM tokens |  [optional]
**domain** | **String** | Custom domain name |  [optional]
**domainNameRecords** | [**List&lt;DomainNameRecord&gt;**](DomainNameRecord) | List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. |  [optional]
**id** | [**UUID**](UUID) |  | 
**isVerified** | **Boolean** | Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**userId** | [**UUID**](UUID) |  | 
**verificationToken** | **String** | Verification tokens |  [optional]



