

# CreateInboxReplierOptions

Options for creating an inbox replier. Repliers can be attached to inboxes and send automated responses when an inbound email matches given criteria.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inboxId** | **UUID** | Inbox ID to attach replier to |  [optional] |
|**name** | **String** | Name for replier |  [optional] |
|**field** | [**FieldEnum**](#FieldEnum) | Field to match against to trigger inbox replier for inbound email |  |
|**match** | **String** | String or wildcard style match for field specified when evaluating reply rules. Use &#x60;*&#x60; to match anything. |  |
|**replyTo** | **String** | Reply-to email address when sending replying |  [optional] |
|**subject** | **String** | Subject override when replying to email |  [optional] |
|**from** | **String** | Send email from address |  [optional] |
|**charset** | **String** | Email reply charset |  [optional] |
|**ignoreReplyTo** | **Boolean** | Ignore sender replyTo when responding. Send directly to the sender if enabled. |  [optional] |
|**isHTML** | **Boolean** | Send HTML email |  [optional] |
|**body** | **String** | Email body for reply |  [optional] |
|**templateId** | **UUID** | ID of template to use when sending a reply |  [optional] |
|**templateVariables** | **Map&lt;String, Object&gt;** | Template variable values |  [optional] |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| RECIPIENTS | &quot;RECIPIENTS&quot; |
| SENDER | &quot;SENDER&quot; |
| SUBJECT | &quot;SUBJECT&quot; |
| ATTACHMENTS | &quot;ATTACHMENTS&quot; |



