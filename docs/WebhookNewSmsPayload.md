

# WebhookNewSmsPayload

NEW_SMS webhook payload. Sent to your webhook url endpoint via HTTP POST when an sms is received by the phone number that your webhook is attached to. Use the SMS ID to fetch the full SMS details.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**webhookName** | **String** | Name of the webhook being triggered |  [optional]
**smsId** | [**UUID**](UUID) | ID of SMS message | 
**userId** | [**UUID**](UUID) | User ID of event | 
**phoneNumber** | [**UUID**](UUID) | ID of phone number receiving SMS | 
**toNumber** | **String** | Recipient phone number | 
**fromNumber** | **String** | Sender phone number | 
**body** | **String** | SMS message body | 
**read** | **Boolean** | SMS has been read | 



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;
DELIVERY_STATUS | &quot;DELIVERY_STATUS&quot;
BOUNCE | &quot;BOUNCE&quot;
BOUNCE_RECIPIENT | &quot;BOUNCE_RECIPIENT&quot;
NEW_SMS | &quot;NEW_SMS&quot;



