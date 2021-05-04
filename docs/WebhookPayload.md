

# WebhookPayload

MailSlurp webhook payload schema is available at https://api.mailslurp.com/schemas/webhook-payload. This schema describes the JSON object that is sent via HTTP POST to webhook urls when an email is received by an inbox that a webhook is attached to. Payloads may be delivered multiple times so use the ID as a key for event uniqueness. The payload contains IDs for the email and inbox affected. Use these to fetch more data related to the event using appropriate inbox and email endpoints. See https://www.mailslurp.com/guides/email-webhooks/ for more information. Your webhook endpoint should accept POST HTTP request and return a 200 in under 30 seconds. Process the webhook asynchronously if you need to.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachmentMetaDatas** | [**List&lt;AttachmentMetaData&gt;**](AttachmentMetaData) | List of attachment meta data objects if attachments present |  [optional]
**bcc** | **List&lt;String&gt;** | List of &#x60;BCC&#x60; recipients email was addressed to |  [optional]
**cc** | **List&lt;String&gt;** | List of &#x60;CC&#x60; recipients email was addressed to |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | Date time of event creation |  [optional]
**emailId** | [**UUID**](UUID) | ID of the email that was received. Use this ID for fetching the email |  [optional]
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for |  [optional]
**from** | **String** | Who the email was sent from |  [optional]
**inboxId** | [**UUID**](UUID) | Id of the inbox that receive an email |  [optional]
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**subject** | **String** | The subject line of the email message |  [optional]
**to** | **List&lt;String&gt;** | List of &#x60;To&#x60; recipients that email was addressed to |  [optional]
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **String** | Name of the webhook being triggered |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;



