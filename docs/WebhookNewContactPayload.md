

# WebhookNewContactPayload

NEW_CONTACT webhook payload
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | **String** |  |  [optional]
**contactId** | [**UUID**](UUID) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**emailAddresses** | **List&lt;String&gt;** |  | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Name of the event type webhook is being triggered for. |  [optional]
**firstName** | **String** |  |  [optional]
**groupId** | [**UUID**](UUID) |  |  [optional]
**lastName** | **String** |  |  [optional]
**messageId** | **String** | Idempotent message ID. Store this ID locally or in a database to prevent message duplication. |  [optional]
**metaData** | [**Object**]() |  |  [optional]
**optOut** | **Boolean** |  |  [optional]
**primaryEmailAddress** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  | 
**webhookId** | [**UUID**](UUID) | ID of webhook entity being triggered |  [optional]
**webhookName** | **String** | Name of the webhook being triggered |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;



