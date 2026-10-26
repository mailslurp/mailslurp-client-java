

# DomainInformation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domainName** | **String** |  |  |
|**verified** | **Boolean** |  |  |
|**domainType** | [**DomainTypeEnum**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. |  |



## Enum: DomainTypeEnum

| Name | Value |
|---- | -----|
| HTTP_INBOX | &quot;HTTP_INBOX&quot; |
| SMTP_DOMAIN | &quot;SMTP_DOMAIN&quot; |



