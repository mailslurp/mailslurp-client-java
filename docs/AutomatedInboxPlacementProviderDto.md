

# AutomatedInboxPlacementProviderDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  |
|**displayName** | **String** |  |  |
|**availability** | [**AvailabilityEnum**](#AvailabilityEnum) |  |  |
|**credentialType** | **String** |  |  |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| SMTP | &quot;SMTP&quot; |
| AMAZON_SES | &quot;AMAZON_SES&quot; |
| SENDGRID | &quot;SENDGRID&quot; |
| RESEND | &quot;RESEND&quot; |
| MAILGUN | &quot;MAILGUN&quot; |
| POSTMARK | &quot;POSTMARK&quot; |



## Enum: AvailabilityEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| PLANNED | &quot;PLANNED&quot; |



