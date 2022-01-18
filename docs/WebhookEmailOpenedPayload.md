

# WebhookEmailOpenedPayload

EMAIL_OPENED webhook payload. Sent to your webhook url endpoint via HTTP POST when an email containing a tracking pixel is opened and the pixel image is loaded by a reader.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**webhookName** | **String** | Name of the webhook being triggered |  [optional]
**inboxId** | [**UUID**](UUID) | Id of the inbox that received an email | 
**pixelId** | [**UUID**](UUID) | ID of the tracking pixel | 
**sentEmailId** | [**UUID**](UUID) | ID of sent email | 
**recipient** | **String** | Email address for the recipient of the tracking pixel | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | Date time of event creation | 



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;



