

# WebhookNewAttachmentPayload

NEW_ATTACHMENT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains an attachment. You can use the attachmentId to download the attachment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  |
|**webhookId** | **UUID** | ID of webhook entity being triggered |  |
|**webhookName** | **String** | Name of the webhook being triggered |  [optional] |
|**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  |
|**attachmentId** | **String** | ID of attachment. Use the &#x60;AttachmentController&#x60; to |  |
|**name** | **String** | Filename of the attachment if present |  |
|**contentType** | **String** | Content type of attachment such as &#39;image/png&#39; or &#39;application/pdf |  |
|**contentLength** | **Long** | Size of attachment in bytes |  |



## Enum: EventNameEnum

| Name | Value |
|---- | -----|
| EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot; |
| NEW_EMAIL | &quot;NEW_EMAIL&quot; |
| NEW_CONTACT | &quot;NEW_CONTACT&quot; |
| NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot; |
| EMAIL_OPENED | &quot;EMAIL_OPENED&quot; |
| EMAIL_READ | &quot;EMAIL_READ&quot; |
| DELIVERY_STATUS | &quot;DELIVERY_STATUS&quot; |
| BOUNCE | &quot;BOUNCE&quot; |
| BOUNCE_RECIPIENT | &quot;BOUNCE_RECIPIENT&quot; |
| NEW_SMS | &quot;NEW_SMS&quot; |



