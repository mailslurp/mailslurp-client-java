

# DeliveryStatusDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**userId** | [**UUID**](UUID) |  | 
**sentId** | [**UUID**](UUID) |  |  [optional]
**remoteMtaIp** | **String** |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**reportingMta** | **String** |  |  [optional]
**recipients** | **List&lt;String&gt;** |  |  [optional]
**smtpResponse** | **String** |  |  [optional]
**smtpStatusCode** | **Integer** |  |  [optional]
**processingTimeMillis** | **Long** |  |  [optional]
**received** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**subject** | **String** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



