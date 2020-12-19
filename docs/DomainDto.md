

# DomainDto

Domain plus verification records and status
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**dkimTokens** | **List&lt;String&gt;** | DNS records for DKIM approval |  [optional]
**domain** | **String** | Custom domain name |  [optional]
**id** | [**UUID**](UUID.md) |  | 
**isVerified** | **Boolean** | Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**userId** | [**UUID**](UUID.md) |  | 
**verificationToken** | **String** | A TXT record that you must place in the DNS settings of the domain to complete domain verification |  [optional]



