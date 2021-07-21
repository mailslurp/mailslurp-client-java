

# InboxForwarderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**field** | [**FieldEnum**](#FieldEnum) |  | 
**forwardToRecipients** | **List&lt;String&gt;** |  | 
**id** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  | 
**match** | **String** |  | 



## Enum: FieldEnum

Name | Value
---- | -----
RECIPIENTS | &quot;RECIPIENTS&quot;
SENDER | &quot;SENDER&quot;
SUBJECT | &quot;SUBJECT&quot;
ATTACHMENTS | &quot;ATTACHMENTS&quot;



