

# SendingConnectionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  |
|**providerPreset** | [**ProviderPresetEnum**](#ProviderPresetEnum) |  |  |
|**capabilities** | [**Set&lt;CapabilitiesEnum&gt;**](#Set&lt;CapabilitiesEnum&gt;) |  |  |
|**fromEmail** | **String** |  |  |
|**smtpHost** | **String** |  |  [optional] |
|**smtpPort** | **Integer** |  |  [optional] |
|**smtpSecurity** | [**SmtpSecurityEnum**](#SmtpSecurityEnum) |  |  [optional] |
|**usernameHint** | **String** |  |  [optional] |
|**apiRegion** | [**ApiRegionEnum**](#ApiRegionEnum) |  |  [optional] |
|**sendingDomain** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**enabled** | **Boolean** |  |  |
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



## Enum: ProviderPresetEnum

| Name | Value |
|---- | -----|
| GENERIC_SMTP | &quot;GENERIC_SMTP&quot; |
| GMAIL | &quot;GMAIL&quot; |
| GOOGLE_WORKSPACE | &quot;GOOGLE_WORKSPACE&quot; |
| MICROSOFT_365 | &quot;MICROSOFT_365&quot; |
| OUTLOOK_COM | &quot;OUTLOOK_COM&quot; |
| YAHOO_MAIL | &quot;YAHOO_MAIL&quot; |
| APPLE_ICLOUD | &quot;APPLE_ICLOUD&quot; |
| FASTMAIL | &quot;FASTMAIL&quot; |
| ZOHO_MAIL | &quot;ZOHO_MAIL&quot; |
| AOL_MAIL | &quot;AOL_MAIL&quot; |
| GMX_MAIL | &quot;GMX_MAIL&quot; |
| MAIL_COM | &quot;MAIL_COM&quot; |
| PROTON_MAIL | &quot;PROTON_MAIL&quot; |
| AMAZON_SES | &quot;AMAZON_SES&quot; |
| SENDGRID | &quot;SENDGRID&quot; |
| RESEND | &quot;RESEND&quot; |
| MAILGUN | &quot;MAILGUN&quot; |
| POSTMARK | &quot;POSTMARK&quot; |
| BREVO | &quot;BREVO&quot; |
| MAILJET | &quot;MAILJET&quot; |
| SPARKPOST | &quot;SPARKPOST&quot; |
| SMTP2_GO | &quot;SMTP2GO&quot; |
| SENDPULSE | &quot;SENDPULSE&quot; |
| SOCKETLABS | &quot;SOCKETLABS&quot; |
| MAILERSEND | &quot;MAILERSEND&quot; |
| MANDRILL | &quot;MANDRILL&quot; |
| ELASTIC_EMAIL | &quot;ELASTIC_EMAIL&quot; |



## Enum: Set&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| SEND_EMAIL | &quot;SEND_EMAIL&quot; |
| VERIFY_CONNECTION | &quot;VERIFY_CONNECTION&quot; |
| ROTATE_CREDENTIALS | &quot;ROTATE_CREDENTIALS&quot; |
| DELIVERY_PROBE | &quot;DELIVERY_PROBE&quot; |



## Enum: SmtpSecurityEnum

| Name | Value |
|---- | -----|
| START_TLS | &quot;START_TLS&quot; |
| TLS | &quot;TLS&quot; |



## Enum: ApiRegionEnum

| Name | Value |
|---- | -----|
| US | &quot;US&quot; |
| EU | &quot;EU&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNVERIFIED | &quot;UNVERIFIED&quot; |
| CONNECTED | &quot;CONNECTED&quot; |
| ERROR | &quot;ERROR&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |



