

# WebhookNewContactPayload

NEW_CONTACT webhook payload. Sent to your webhook url endpoint via HTTP POST when an email is received by the inbox that your webhook is attached to that contains a recipient that has not been saved as a contact.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **String** | Name of the webhook being triggered |  [optional]
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**contactId** | [**UUID**](UUID) |  |  [optional]
**groupId** | [**UUID**](UUID) |  |  [optional]
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**primaryEmailAddress** | **String** |  |  [optional]
**emailAddresses** | **List&lt;String&gt;** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**metaData** | [**Object**]() |  |  [optional]
**optOut** | **Boolean** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;
EMAIL_READ | &quot;EMAIL_READ&quot;



