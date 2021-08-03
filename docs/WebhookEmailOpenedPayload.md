

# WebhookEmailOpenedPayload

EMAIL_OPENED webhook payload. Sent to your webhook url endpoint via HTTP POST when an email containing a tracking pixel is opened and the pixel image is loaded by a reader.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | Date time of event creation |  [optional]
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**inboxId** | [**UUID**](UUID) | Id of the inbox that received an email |  [optional]
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**pixelId** | [**UUID**](UUID) | ID of the tracking pixel |  [optional]
**recipient** | **String** | Email address for the recipient of the tracking pixel |  [optional]
**sentEmailId** | [**UUID**](UUID) | ID of sent email |  [optional]
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **String** | Name of the webhook being triggered |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;



