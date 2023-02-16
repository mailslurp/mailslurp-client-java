

# WebhookDeliveryStatusPayload

DELIVERY_STATUS webhook payload. Sent to your webhook url endpoint via HTTP POST when an email delivery status is created. This could be a successful delivery or a delivery failure.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**webhookName** | **String** | Name of the webhook being triggered |  [optional]
**id** | [**UUID**](UUID) | ID of delivery status | 
**userId** | [**UUID**](UUID) | User ID of event | 
**sentId** | [**UUID**](UUID) | ID of sent email |  [optional]
**remoteMtaIp** | **String** | IP address of the remote Mail Transfer Agent |  [optional]
**inboxId** | [**UUID**](UUID) | Id of the inbox |  [optional]
**reportingMta** | **String** | Mail Transfer Agent reporting delivery status |  [optional]
**recipients** | **List&lt;String&gt;** | Recipients for delivery |  [optional]
**smtpResponse** | **String** | SMTP server response message |  [optional]
**smtpStatusCode** | **Integer** | SMTP server status |  [optional]
**processingTimeMillis** | **Long** | Time in milliseconds for delivery processing |  [optional]
**received** | [**OffsetDateTime**](OffsetDateTime) | Time event was received |  [optional]
**subject** | **String** | Email subject |  [optional]



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



