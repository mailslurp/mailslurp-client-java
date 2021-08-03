

# WebhookProjection

Representation of a webhook
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**eventName** | [**EventNameEnum**](#EventNameEnum) |  |  [optional]
**id** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  | 
**name** | **String** |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**url** | **String** |  | 



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;



