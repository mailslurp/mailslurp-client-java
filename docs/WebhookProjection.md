

# WebhookProjection

Representation of a webhook
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**id** | [**UUID**](UUID) |  | 
**url** | **String** |  | 
**inboxId** | [**UUID**](UUID) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**eventName** | [**EventNameEnum**](#EventNameEnum) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;



