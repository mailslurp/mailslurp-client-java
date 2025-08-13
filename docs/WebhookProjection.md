

# WebhookProjection

Representation of a webhook

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **String** |  |  |
|**password** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**userId** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**eventName** | [**EventNameEnum**](#EventNameEnum) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**healthStatus** | [**HealthStatusEnum**](#HealthStatusEnum) |  |  [optional] |
|**aiTransformerId** | **UUID** |  |  [optional] |
|**aiTransformId** | **UUID** |  |  [optional] |
|**phoneNumberId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |



## Enum: EventNameEnum

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



## Enum: HealthStatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| UNHEALTHY | &quot;UNHEALTHY&quot; |



