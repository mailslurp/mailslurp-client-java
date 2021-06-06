

# WebhookNewAttachmentPayload

NEW_ATTACHMENT webhook payload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentId** | **String** | ID of attachment. Use the &#x60;AttachmentController&#x60; to |  [optional]
**contentLength** | **Long** | Size of attachment in bytes |  [optional]
**contentType** | **String** | Content type of attachment such as &#39;image/png&#39; or &#39;application/pdf |  [optional]
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**name** | **String** | Filename of the attachment if present |  [optional]
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **String** | Name of the webhook being triggered |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;



