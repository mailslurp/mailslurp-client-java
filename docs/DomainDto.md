

# DomainDto

Domain plus verification records and status

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**domain** | **String** | Custom domain name |  |
|**verificationToken** | **String** | Verification tokens |  |
|**dkimTokens** | **List&lt;String&gt;** | Unique token DKIM tokens |  |
|**missingRecordsMessage** | **String** | If the domain is missing records then show which pairs are missing. |  [optional] |
|**hasMissingRecords** | **Boolean** | Whether the domain has missing required records. If true then see the domain in the dashboard app. |  |
|**isVerified** | **Boolean** | Whether domain has been verified or not. If the domain is not verified after 72 hours there is most likely an issue with the domains DNS records. |  |
|**domainNameRecords** | [**List&lt;DomainNameRecord&gt;**](DomainNameRecord) | List of DNS domain name records (C, MX, TXT) etc that you must add to the DNS server associated with your domain provider. |  |
|**catchAllInboxId** | **UUID** | The optional catch all inbox that will receive emails sent to the domain that cannot be matched. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**domainType** | [**DomainTypeEnum**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. |  |



## Enum: DomainTypeEnum

| Name | Value |
|---- | -----|
| HTTP_INBOX | &quot;HTTP_INBOX&quot; |
| SMTP_DOMAIN | &quot;SMTP_DOMAIN&quot; |



