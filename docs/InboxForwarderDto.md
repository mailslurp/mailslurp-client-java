

# InboxForwarderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**field** | [**FieldEnum**](#FieldEnum) |  |  [optional]
**match** | **String** |  |  [optional]
**forwardToRecipients** | **List&lt;String&gt;** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]



## Enum: FieldEnum

Name | Value
---- | -----
RECIPIENTS | &quot;RECIPIENTS&quot;
SENDER | &quot;SENDER&quot;
SUBJECT | &quot;SUBJECT&quot;
ATTACHMENTS | &quot;ATTACHMENTS&quot;



