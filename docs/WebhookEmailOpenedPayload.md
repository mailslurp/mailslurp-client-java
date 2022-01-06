

# WebhookEmailOpenedPayload

EMAIL_OPENED webhook payload. Sent to your webhook url endpoint via HTTP POST when an email containing a tracking pixel is opened and the pixel image is loaded by a reader.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered |  [optional]
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**webhookName** | **String** | Name of the webhook being triggered |  [optional]
**inboxId** | [**UUID**](UUID) | Id of the inbox that received an email |  [optional]
**pixelId** | [**UUID**](UUID) | ID of the tracking pixel |  [optional]
**sentEmailId** | [**UUID**](UUID) | ID of sent email |  [optional]
**recipient** | **String** | Email address for the recipient of the tracking pixel |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | Date time of event creation |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;



