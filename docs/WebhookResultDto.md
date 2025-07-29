

# WebhookResultDto

Result of a webhook notification

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**userId** | **UUID** |  |  |
|**webhookId** | **UUID** |  |  |
|**webhookUrl** | **String** |  |  |
|**messageId** | **String** |  |  |
|**redriveId** | **UUID** |  |  [optional] |
|**httpMethod** | [**HttpMethodEnum**](#HttpMethodEnum) |  |  |
|**webhookEvent** | [**WebhookEventEnum**](#WebhookEventEnum) |  |  |
|**responseStatus** | **Integer** |  |  [optional] |
|**responseTimeMillis** | **Long** |  |  |
|**responseBodyExtract** | **String** |  |  [optional] |
|**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**seen** | **Boolean** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**attachmentId** | **UUID** |  |  [optional] |
|**phoneId** | **UUID** |  |  [optional] |
|**smsId** | **UUID** |  |  [optional] |



## Enum: HttpMethodEnum

| Name | Value |
|---- | -----|
| POST | &quot;POST&quot; |
| DELETE | &quot;DELETE&quot; |
| GET | &quot;GET&quot; |
| PUT | &quot;PUT&quot; |
| PATCH | &quot;PATCH&quot; |
| HEAD | &quot;HEAD&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| TRACE | &quot;TRACE&quot; |



## Enum: WebhookEventEnum

| Name | Value |
|---- | -----|
| EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot; |
| NEW_AI_TRANSFORM_RESULT | &quot;NEW_AI_TRANSFORM_RESULT&quot; |
| NEW_EMAIL | &quot;NEW_EMAIL&quot; |
| NEW_CONTACT | &quot;NEW_CONTACT&quot; |
| NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot; |
| EMAIL_OPENED | &quot;EMAIL_OPENED&quot; |
| EMAIL_READ | &quot;EMAIL_READ&quot; |
| DELIVERY_STATUS | &quot;DELIVERY_STATUS&quot; |
| BOUNCE | &quot;BOUNCE&quot; |
| BOUNCE_RECIPIENT | &quot;BOUNCE_RECIPIENT&quot; |
| NEW_SMS | &quot;NEW_SMS&quot; |
| NEW_GUEST_USER | &quot;NEW_GUEST_USER&quot; |



## Enum: ResultTypeEnum

| Name | Value |
|---- | -----|
| BAD_RESPONSE | &quot;BAD_RESPONSE&quot; |
| EXCEPTION | &quot;EXCEPTION&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| REDRIVEN | &quot;REDRIVEN&quot; |



