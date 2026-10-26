

# WebhookProjection

Representation of a webhook

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**eventName** | [**EventNameEnum**](#EventNameEnum) |  |  [optional] |
|**url** | **String** |  |  |
|**password** | **String** |  |  [optional] |
|**username** | **String** |  |  [optional] |
|**userId** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**aiTransformerId** | **UUID** |  |  [optional] |
|**phoneNumberId** | **UUID** |  |  [optional] |
|**aiTransformId** | **UUID** |  |  [optional] |
|**healthStatus** | [**HealthStatusEnum**](#HealthStatusEnum) |  |  [optional] |



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



