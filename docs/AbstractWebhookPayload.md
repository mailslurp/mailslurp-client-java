

# AbstractWebhookPayload

Abstract webhook payload. Use the correct payload type for your webhook event type in order to access all the specific properties for that event. See the `NEW_EMAIL`,`NEW_CONTACT`, `NEW_ATTACHMENT` and `EMAIL_OPENED` payloads for the properties available for those events.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventName** | [**EventNameEnum**](#EventNameEnum) |  | 
**messageId** | **String** |  | 
**webhookId** | [**UUID**](UUID) |  | 
**webhookName** | **String** |  |  [optional]



## Enum: EventNameEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;



