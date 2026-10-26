

# CreateSendingConnectionOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**providerPreset** | [**ProviderPresetEnum**](#ProviderPresetEnum) |  |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  |
|**fromEmail** | **String** |  |  |
|**smtp** | [**SendingConnectionSmtpOptions**](SendingConnectionSmtpOptions) |  |  [optional] |
|**apiKey** | [**SendingConnectionApiKeyOptions**](SendingConnectionApiKeyOptions) |  |  [optional] |



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



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| SMTP | &quot;SMTP&quot; |
| AMAZON_SES | &quot;AMAZON_SES&quot; |
| SENDGRID | &quot;SENDGRID&quot; |
| RESEND | &quot;RESEND&quot; |
| MAILGUN | &quot;MAILGUN&quot; |
| POSTMARK | &quot;POSTMARK&quot; |



