

# WebhookProjection

Representation of a webhook
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**id** | [**UUID**](UUID) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**url** | **String** |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**eventName** | [**EventNameEnum**](#EventNameEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;



