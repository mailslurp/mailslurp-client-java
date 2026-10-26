

# AutomatedInboxPlacementConnectionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  |
|**fromEmail** | **String** |  |  |
|**smtpHost** | **String** |  |  [optional] |
|**smtpPort** | **Integer** |  |  [optional] |
|**smtpSecurity** | [**SmtpSecurityEnum**](#SmtpSecurityEnum) |  |  [optional] |
|**usernameHint** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**lastVerifiedAt** | **OffsetDateTime** |  |  [optional] |
|**lastErrorCode** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| SMTP | &quot;SMTP&quot; |
| AMAZON_SES | &quot;AMAZON_SES&quot; |
| SENDGRID | &quot;SENDGRID&quot; |
| RESEND | &quot;RESEND&quot; |
| MAILGUN | &quot;MAILGUN&quot; |
| POSTMARK | &quot;POSTMARK&quot; |



## Enum: SmtpSecurityEnum

| Name | Value |
|---- | -----|
| START_TLS | &quot;START_TLS&quot; |
| TLS | &quot;TLS&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNVERIFIED | &quot;UNVERIFIED&quot; |
| CONNECTED | &quot;CONNECTED&quot; |
| ERROR | &quot;ERROR&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |



