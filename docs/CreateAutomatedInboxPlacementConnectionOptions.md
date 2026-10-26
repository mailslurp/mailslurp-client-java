

# CreateAutomatedInboxPlacementConnectionOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  |
|**fromEmail** | **String** |  |  |
|**smtp** | [**AutomatedInboxPlacementSmtpOptions**](AutomatedInboxPlacementSmtpOptions) |  |  [optional] |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| SMTP | &quot;SMTP&quot; |
| AMAZON_SES | &quot;AMAZON_SES&quot; |
| SENDGRID | &quot;SENDGRID&quot; |
| RESEND | &quot;RESEND&quot; |
| MAILGUN | &quot;MAILGUN&quot; |
| POSTMARK | &quot;POSTMARK&quot; |



