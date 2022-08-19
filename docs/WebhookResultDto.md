

# WebhookResultDto

Result of a webhook notification
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  |  [optional]
**userId** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  |  [optional]
**webhookId** | [**UUID**](UUID) |  | 
**webhookUrl** | **String** |  | 
**messageId** | **String** |  | 
**redriveId** | [**UUID**](UUID) |  |  [optional]
**httpMethod** | [**HttpMethodEnum**](#HttpMethodEnum) |  | 
**webhookEvent** | [**WebhookEventEnum**](#WebhookEventEnum) |  | 
**responseStatus** | **Integer** |  |  [optional]
**responseTimeMillis** | **Long** |  | 
**responseBodyExtract** | **String** |  |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**seen** | **Boolean** |  | 



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
EMAIL_READ | &quot;EMAIL_READ&quot;
DELIVERY_STATUS | &quot;DELIVERY_STATUS&quot;
BOUNCE | &quot;BOUNCE&quot;
BOUNCE_RECIPIENT | &quot;BOUNCE_RECIPIENT&quot;
NEW_SMS | &quot;NEW_SMS&quot;



## Enum: ResultTypeEnum

Name | Value
---- | -----
BAD_RESPONSE | &quot;BAD_RESPONSE&quot;
EXCEPTION | &quot;EXCEPTION&quot;
SUCCESS | &quot;SUCCESS&quot;



