

# UpdateInboxReplierOptions

Options for updating an inbox replier
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inboxId** | [**UUID**](UUID) | Inbox ID to attach replier to | 
**name** | **String** | Name for replier |  [optional]
**field** | [**FieldEnum**](#FieldEnum) | Field to match against to trigger inbox replier for inbound email | 
**match** | **String** | String or wildcard style match for field specified when evaluating reply rules | 
**replyTo** | **String** | Reply-to email address when sending replying |  [optional]
**subject** | **String** | Subject override when replying to email |  [optional]
**from** | **String** | Send email from address |  [optional]
**charset** | **String** | Email reply charset |  [optional]
**isHTML** | **Boolean** | Send HTML email |  [optional]
**ignoreReplyTo** | **Boolean** | Ignore sender replyTo when responding. Send directly to the sender if enabled. |  [optional]
**body** | **String** | Email body for reply |  [optional]
**templateId** | [**UUID**](UUID) | ID of template to use when sending a reply |  [optional]
**templateVariables** | **Map&lt;String, Object&gt;** | Template variable values |  [optional]



## Enum: FieldEnum

Name | Value
---- | -----
RECIPIENTS | &quot;RECIPIENTS&quot;
SENDER | &quot;SENDER&quot;
SUBJECT | &quot;SUBJECT&quot;
ATTACHMENTS | &quot;ATTACHMENTS&quot;



