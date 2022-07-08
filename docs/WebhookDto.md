

# WebhookDto

Representation of a webhook for an inbox. The URL specified will be using by MailSlurp whenever an email is received by the attached inbox. A webhook entity should have a URL that points to your server. Your server should accept HTTP/S POST requests and return a success 200. MailSlurp will retry your webhooks if they fail. See https://java.api.mailslurp.com/schemas/webhook-payload for the payload schema.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) | ID of the Webhook | 
**userId** | [**UUID**](UUID) | User ID of the Webhook | 
**basicAuth** | **Boolean** | Does webhook expect basic authentication? If true it means you created this webhook with a username and password. MailSlurp will use these in the URL to authenticate itself. | 
**name** | **String** | Name of the webhook |  [optional]
**inboxId** | [**UUID**](UUID) | The inbox that the Webhook will be triggered by. If null then webhook triggered at account level |  [optional]
**url** | **String** | URL of your server that the webhook will be sent to. The schema of the JSON that is sent is described by the payloadJsonSchema. | 
**method** | [**MethodEnum**](#MethodEnum) | HTTP method that your server endpoint must listen for | 
**payloadJsonSchema** | **String** | Deprecated. Fetch JSON Schema for webhook using the getJsonSchemaForWebhookPayload method | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | When the webhook was created | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Webhook trigger event name |  [optional]
**requestHeaders** | [**WebhookHeaders**](WebhookHeaders) |  |  [optional]



## Enum: MethodEnum

Name | Value
---- | -----
GET | &quot;GET&quot;
HEAD | &quot;HEAD&quot;
POST | &quot;POST&quot;
PUT | &quot;PUT&quot;
PATCH | &quot;PATCH&quot;
DELETE | &quot;DELETE&quot;
OPTIONS | &quot;OPTIONS&quot;
TRACE | &quot;TRACE&quot;



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



