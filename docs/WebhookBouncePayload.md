

# WebhookBouncePayload

EMAIL_READ webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is read. This happens when an email is requested in full from the API or a user views the email in the dashboard.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**webhookName** | **String** | Name of the webhook being triggered |  [optional]
**bounceId** | [**UUID**](UUID) | ID of the bounce email record. Use the ID with the bounce controller to view more information | 
**sentToRecipients** | **List&lt;String&gt;** |  |  [optional]
**sender** | **String** |  | 
**bounceRecipients** | **List&lt;String&gt;** | Email addresses that resulted in a bounce or email being rejected. Please save these recipients and avoid emailing them in the future to maintain your reputation. |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;
BOUNCE | &quot;BOUNCE&quot;
BOUNCE_RECIPIENT | &quot;BOUNCE_RECIPIENT&quot;



