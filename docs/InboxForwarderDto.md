

# InboxForwarderDto

Inbox forwarder. Describes how an inbox will forward matching emails to designated recipients.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  | 
**name** | **String** | Name of inbox forwarder |  [optional]
**field** | [**FieldEnum**](#FieldEnum) | Which field to match against | 
**match** | **String** | Wild-card type pattern to apply to field | 
**forwardToRecipients** | **List&lt;String&gt;** | Who to send forwarded email to | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



## Enum: FieldEnum

Name | Value
---- | -----
RECIPIENTS | &quot;RECIPIENTS&quot;
SENDER | &quot;SENDER&quot;
SUBJECT | &quot;SUBJECT&quot;
ATTACHMENTS | &quot;ATTACHMENTS&quot;



