

# WebhookEmailReadPayload

EMAIL_READ webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is read. This happens when an email is requested in full from the API or a user views the email in the dashboard.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  |
|**webhookId** | **UUID** | ID of webhook entity being triggered |  |
|**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  |
|**webhookName** | **String** | Name of the webhook being triggered |  [optional] |
|**emailId** | **UUID** | ID of the email that was received. Use this ID for fetching the email with the &#x60;EmailController&#x60;. |  |
|**inboxId** | **UUID** | Id of the inbox |  |
|**emailIsRead** | **Boolean** | Is the email read |  |
|**createdAt** | **OffsetDateTime** | Date time of event creation |  |



## Enum: EventNameEnum

| Name | Value |
|---- | -----|
| EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot; |
| NEW_AI_TRANSFORM_RESULT | &quot;NEW_AI_TRANSFORM_RESULT&quot; |
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



