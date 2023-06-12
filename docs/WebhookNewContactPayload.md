

# WebhookNewContactPayload

NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  |
|**webhookId** | **UUID** | ID of webhook entity being triggered |  |
|**webhookName** | **String** | Name of the webhook being triggered |  [optional] |
|**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  |
|**contactId** | **UUID** | Contact ID |  |
|**groupId** | **UUID** | Contact group ID |  [optional] |
|**firstName** | **String** | Contact first name |  [optional] |
|**lastName** | **String** | Contact last name |  [optional] |
|**company** | **String** | Contact company name |  [optional] |
|**primaryEmailAddress** | **String** | Primary email address for contact |  [optional] |
|**emailAddresses** | **List&lt;String&gt;** | Email addresses for contact |  |
|**tags** | **List&lt;String&gt;** | Tags for contact |  |
|**metaData** | **Object** |  |  [optional] |
|**optOut** | **Boolean** | Has contact opted out of emails |  |
|**createdAt** | **OffsetDateTime** | Date time of event creation |  |



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



