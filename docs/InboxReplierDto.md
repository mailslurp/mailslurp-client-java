

# InboxReplierDto

Inbox replier. Will automatically reply to inbound emails that match given field for an inbox.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**field** | [**FieldEnum**](#FieldEnum) |  |  [optional] |
|**match** | **String** |  |  [optional] |
|**replyTo** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**from** | **String** |  |  [optional] |
|**charset** | **String** |  |  [optional] |
|**isHTML** | **Boolean** |  |  |
|**templateId** | **UUID** |  |  [optional] |
|**templateVariables** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**ignoreReplyTo** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**should** | [**ShouldEnum**](#ShouldEnum) | Comparison mode for inbox automation matching. |  [optional] |
|**matchOptions** | [**InboxAutomationMatchOptions**](InboxAutomationMatchOptions) |  |  [optional] |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| RECIPIENTS | &quot;RECIPIENTS&quot; |
| SENDER | &quot;SENDER&quot; |
| SUBJECT | &quot;SUBJECT&quot; |
| ATTACHMENTS | &quot;ATTACHMENTS&quot; |
| ATTACHMENT_FILENAME | &quot;ATTACHMENT_FILENAME&quot; |
| ATTACHMENT_TEXT | &quot;ATTACHMENT_TEXT&quot; |



## Enum: ShouldEnum

| Name | Value |
|---- | -----|
| WILDCARD | &quot;WILDCARD&quot; |
| MATCH | &quot;MATCH&quot; |
| CONTAIN | &quot;CONTAIN&quot; |
| EQUAL | &quot;EQUAL&quot; |



