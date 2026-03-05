

# DomainRegionInformation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domainName** | **String** |  |  |
|**verified** | **Boolean** |  |  |
|**domainType** | [**DomainTypeEnum**](#DomainTypeEnum) | Type of domain. Dictates type of inbox that can be created with domain. HTTP means inboxes are processed using SES while SMTP inboxes use a custom SMTP mail server. SMTP does not support sending so use HTTP for sending emails. |  |
|**accountRegion** | [**AccountRegionEnum**](#AccountRegionEnum) |  |  [optional] |
|**creationEnabled** | **Boolean** |  |  |
|**sendingEnabled** | **Boolean** |  |  |
|**active** | **Boolean** |  |  |



## Enum: DomainTypeEnum

| Name | Value |
|---- | -----|
| HTTP_INBOX | &quot;HTTP_INBOX&quot; |
| SMTP_DOMAIN | &quot;SMTP_DOMAIN&quot; |



## Enum: AccountRegionEnum

| Name | Value |
|---- | -----|
| US_WEST_2_ACCOUNT_STAGING | &quot;US_WEST_2_ACCOUNT_STAGING&quot; |
| US_EAST_1_ACCOUNT_STAGING | &quot;US_EAST_1_ACCOUNT_STAGING&quot; |
| EU_WEST_1_ACCOUNT_STAGING | &quot;EU_WEST_1_ACCOUNT_STAGING&quot; |
| US_WEST_2_ACCOUNT_SES_1 | &quot;US_WEST_2_ACCOUNT_SES_1&quot; |
| EU_WEST_1_ACCOUNT_SES_1 | &quot;EU_WEST_1_ACCOUNT_SES_1&quot; |
| US_WEST_2_ACCOUNT_SES_2 | &quot;US_WEST_2_ACCOUNT_SES_2&quot; |
| EU_WEST_1_ACCOUNT_SES_2 | &quot;EU_WEST_1_ACCOUNT_SES_2&quot; |
| US_WEST_2_ACCOUNT_BYTEWISE | &quot;US_WEST_2_ACCOUNT_BYTEWISE&quot; |
| EU_WEST_1_ACCOUNT_BYTEWISE | &quot;EU_WEST_1_ACCOUNT_BYTEWISE&quot; |
| US_WEST_2 | &quot;US_WEST_2&quot; |
| EU_WEST_1 | &quot;EU_WEST_1&quot; |
| US_EAST_1 | &quot;US_EAST_1&quot; |



