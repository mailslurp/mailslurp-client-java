

# SendingConnectionProviderDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providerPreset** | [**ProviderPresetEnum**](#ProviderPresetEnum) |  |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  |
|**displayName** | **String** |  |  |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) |  |  |
|**setupType** | [**SetupTypeEnum**](#SetupTypeEnum) |  |  |
|**nativeIntegration** | **Boolean** |  |  |
|**smtpDefaults** | [**SendingConnectionSmtpDefaults**](SendingConnectionSmtpDefaults) |  |  [optional] |
|**supportedApiRegions** | [**List&lt;SupportedApiRegionsEnum&gt;**](#List&lt;SupportedApiRegionsEnum&gt;) |  |  |
|**requiresSendingDomain** | **Boolean** |  |  |
|**setupNotes** | **List&lt;String&gt;** |  |  |
|**credentialType** | **String** |  |  |
|**capabilities** | [**Set&lt;CapabilitiesEnum&gt;**](#Set&lt;CapabilitiesEnum&gt;) |  |  |



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



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;CUSTOM&quot; |
| MAILBOX | &quot;MAILBOX&quot; |
| TRANSACTIONAL | &quot;TRANSACTIONAL&quot; |



## Enum: AvailabilityEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| PLANNED | &quot;PLANNED&quot; |



## Enum: SetupTypeEnum

| Name | Value |
|---- | -----|
| SMTP | &quot;SMTP&quot; |
| API_KEY | &quot;API_KEY&quot; |
| AWS_CREDENTIALS | &quot;AWS_CREDENTIALS&quot; |
| OAUTH | &quot;OAUTH&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |



## Enum: List&lt;SupportedApiRegionsEnum&gt;

| Name | Value |
|---- | -----|
| US | &quot;US&quot; |
| EU | &quot;EU&quot; |



## Enum: Set&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| SEND_EMAIL | &quot;SEND_EMAIL&quot; |
| VERIFY_CONNECTION | &quot;VERIFY_CONNECTION&quot; |
| ROTATE_CREDENTIALS | &quot;ROTATE_CREDENTIALS&quot; |
| DELIVERY_PROBE | &quot;DELIVERY_PROBE&quot; |



