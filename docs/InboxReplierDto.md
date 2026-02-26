

# InboxReplierDto

Inbox replier. Will automatically reply to inbound emails that match given field for an inbox.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**field** | [**FieldEnum**](#FieldEnum) |  |  |
|**match** | **String** |  |  |
|**replyTo** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**from** | **String** |  |  [optional] |
|**charset** | **String** |  |  [optional] |
|**isHTML** | **Boolean** |  |  |
|**templateId** | **UUID** |  |  [optional] |
|**templateVariables** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**ignoreReplyTo** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| RECIPIENTS | &quot;RECIPIENTS&quot; |
| SENDER | &quot;SENDER&quot; |
| SUBJECT | &quot;SUBJECT&quot; |
| ATTACHMENTS | &quot;ATTACHMENTS&quot; |



