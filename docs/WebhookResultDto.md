

# WebhookResultDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  |  [optional]
**userId** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**webhookId** | [**UUID**](UUID) |  |  [optional]
**webhookUrl** | **String** |  |  [optional]
**messageId** | **String** |  |  [optional]
**redriveId** | [**UUID**](UUID) |  |  [optional]
**httpMethod** | [**HttpMethodEnum**](#HttpMethodEnum) |  |  [optional]
**webhookEvent** | [**WebhookEventEnum**](#WebhookEventEnum) |  |  [optional]
**responseStatus** | **Integer** |  |  [optional]
**responseTimeMillis** | **Long** |  |  [optional]
**responseBodyExtract** | **String** |  |  [optional]
**resultType** | [**ResultTypeEnum**](#ResultTypeEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**seen** | **Boolean** |  |  [optional]



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



## Enum: ResultTypeEnum

Name | Value
---- | -----
BAD_RESPONSE | &quot;BAD_RESPONSE&quot;
EXCEPTION | &quot;EXCEPTION&quot;
SUCCESS | &quot;SUCCESS&quot;



