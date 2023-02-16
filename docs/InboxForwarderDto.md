

# InboxForwarderDto

Inbox forwarder
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  | 
**field** | [**FieldEnum**](#FieldEnum) |  | 
**match** | **String** |  | 
**forwardToRecipients** | **List&lt;String&gt;** |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



## Enum: FieldEnum

Name | Value
---- | -----
RECIPIENTS | &quot;RECIPIENTS&quot;
SENDER | &quot;SENDER&quot;
SUBJECT | &quot;SUBJECT&quot;
ATTACHMENTS | &quot;ATTACHMENTS&quot;



