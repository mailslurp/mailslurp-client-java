

# InboxProjection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**emailAddress** | **String** |  |  [optional]
**favourite** | **Boolean** |  | 
**id** | [**UUID**](UUID) |  | 
**inboxType** | [**InboxTypeEnum**](#InboxTypeEnum) |  |  [optional]
**name** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**teamAccess** | **Boolean** |  | 



## Enum: InboxTypeEnum

Name | Value
---- | -----
HTTP_INBOX | &quot;HTTP_INBOX&quot;
SMTP_INBOX | &quot;SMTP_INBOX&quot;



