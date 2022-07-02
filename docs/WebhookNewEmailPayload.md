

# WebhookNewEmailPayload

NEW_EMAIL webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to. Use the email ID to fetch the full email body or attachments.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. | 
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. | 
**webhookName** | **String** | Name of the webhook being triggered |  [optional]
**inboxId** | [**UUID**](UUID) | Id of the inbox that received an email | 
**emailId** | [**UUID**](UUID) | ID of the email that was received. Use this ID for fetching the email with the &#x60;EmailController&#x60;. | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | Date time of event creation | 
**to** | **List&lt;String&gt;** | List of &#x60;To&#x60; recipient email addresses that the email was addressed to. See recipients object for names. | 
**from** | **String** | Who the email was sent from. An email address - see fromName for the sender name. | 
**cc** | **List&lt;String&gt;** | List of &#x60;CC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. | 
**bcc** | **List&lt;String&gt;** | List of &#x60;BCC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. | 
**subject** | **String** | The subject line of the email message as specified by SMTP subject header |  [optional]
**attachmentMetaDatas** | [**List&lt;AttachmentMetaData&gt;**](AttachmentMetaData) | List of attachment meta data objects if attachments present | 



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
NEW_SMS | &quot;NEW_SMS&quot;



