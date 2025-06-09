

# WebhookBouncePayload

BOUNCE webhook payload. Sent to your webhook url endpoint via HTTP POST when an email bounced or was rejected by a recipient. Save the recipients to a ban list on your server and avoid emailing them again. It is recommended you also listen to the BOUNCE_RECIPIENT payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  |
|**webhookId** | **UUID** | ID of webhook entity being triggered |  |
|**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  |
|**webhookName** | **String** | Name of the webhook being triggered |  [optional] |
|**bounceId** | **UUID** | ID of the bounce email record. Use the ID with the bounce controller to view more information |  |
|**sentToRecipients** | **List&lt;String&gt;** | Email sent to recipients |  [optional] |
|**sender** | **String** | Sender causing bounce |  |
|**bounceRecipients** | **List&lt;String&gt;** | Email addresses that resulted in a bounce or email being rejected. Please save these recipients and avoid emailing them in the future to maintain your reputation. |  [optional] |



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
| NEW_GUEST_USER | &quot;NEW_GUEST_USER&quot; |



