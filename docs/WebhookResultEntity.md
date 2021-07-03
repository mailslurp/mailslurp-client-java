

# WebhookResultEntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**httpMethod** | [**HttpMethodEnum**](#HttpMethodEnum) |  | 
**id** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  | 
**messageId** | **String** |  | 
**responseBodyExtract** | **String** |  |  [optional]
**responseStatus** | **Integer** |  |  [optional]
**responseTimeMillis** | **Long** |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**userId** | [**UUID**](UUID) |  | 
**webhookEvent** | [**WebhookEventEnum**](#WebhookEventEnum) |  | 
**webhookId** | [**UUID**](UUID) |  | 
**webhookUrl** | **String** |  | 



## Enum: HttpMethodEnum

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



## Enum: WebhookEventEnum

Name | Value
---- | -----
EMAIL_RECEIVED | &quot;EMAIL_RECEIVED&quot;
NEW_EMAIL | &quot;NEW_EMAIL&quot;
NEW_CONTACT | &quot;NEW_CONTACT&quot;
NEW_ATTACHMENT | &quot;NEW_ATTACHMENT&quot;
EMAIL_OPENED | &quot;EMAIL_OPENED&quot;



