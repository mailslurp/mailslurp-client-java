

# DomainHealthEventDto

User-facing domain health event stored for a custom domain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**domainId** | **UUID** |  |  [optional] |
|**domainName** | **String** |  |  [optional] |
|**accountRegion** | [**AccountRegionEnum**](#AccountRegionEnum) |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**title** | **String** |  |  |
|**message** | **String** |  |  |
|**recommendation** | **String** |  |  [optional] |
|**eventTime** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: AccountRegionEnum

| Name | Value |
|---- | -----|
| US_WEST_2_ACCOUNT_STAGING | &quot;US_WEST_2_ACCOUNT_STAGING&quot; |
| US_EAST_1_ACCOUNT_STAGING | &quot;US_EAST_1_ACCOUNT_STAGING&quot; |
| EU_WEST_1_ACCOUNT_STAGING | &quot;EU_WEST_1_ACCOUNT_STAGING&quot; |
| US_WEST_2_ACCOUNT_SES_1 | &quot;US_WEST_2_ACCOUNT_SES_1&quot; |
| US_EAST_1_ACCOUNT_SES_1 | &quot;US_EAST_1_ACCOUNT_SES_1&quot; |
| EU_WEST_1_ACCOUNT_SES_1 | &quot;EU_WEST_1_ACCOUNT_SES_1&quot; |
| US_WEST_2_ACCOUNT_SES_2 | &quot;US_WEST_2_ACCOUNT_SES_2&quot; |
| EU_WEST_1_ACCOUNT_SES_2 | &quot;EU_WEST_1_ACCOUNT_SES_2&quot; |
| US_WEST_2_ACCOUNT_SES_3 | &quot;US_WEST_2_ACCOUNT_SES_3&quot; |
| US_WEST_2_ACCOUNT_BYTEWISE | &quot;US_WEST_2_ACCOUNT_BYTEWISE&quot; |
| EU_WEST_1_ACCOUNT_BYTEWISE | &quot;EU_WEST_1_ACCOUNT_BYTEWISE&quot; |
| US_WEST_2 | &quot;US_WEST_2&quot; |
| EU_WEST_1 | &quot;EU_WEST_1&quot; |
| US_EAST_1 | &quot;US_EAST_1&quot; |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| DKIM_SETUP_REVOKED | &quot;DKIM_SETUP_REVOKED&quot; |
| DKIM_RECORDS_MISSING | &quot;DKIM_RECORDS_MISSING&quot; |
| DKIM_VERIFICATION_FAILED | &quot;DKIM_VERIFICATION_FAILED&quot; |
| DMARC_RECORD_ISSUE | &quot;DMARC_RECORD_ISSUE&quot; |
| SPF_RECORD_ISSUE | &quot;SPF_RECORD_ISSUE&quot; |
| BIMI_RECORD_ISSUE | &quot;BIMI_RECORD_ISSUE&quot; |
| SENDING_DISABLED | &quot;SENDING_DISABLED&quot; |
| SENDING_ENABLED | &quot;SENDING_ENABLED&quot; |
| DOMAIN_AUTHENTICATION_ISSUE | &quot;DOMAIN_AUTHENTICATION_ISSUE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;INFO&quot; |
| WARNING | &quot;WARNING&quot; |
| CRITICAL | &quot;CRITICAL&quot; |



