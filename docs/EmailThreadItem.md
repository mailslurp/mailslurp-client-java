

# EmailThreadItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemType** | [**ItemTypeEnum**](#ItemTypeEnum) |  |  |
|**entityId** | **UUID** |  |  |
|**bodyExcerpt** | **String** |  |  [optional] |
|**textExcerpt** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**to** | **List&lt;String&gt;** |  |  |
|**from** | **String** |  |  [optional] |
|**bcc** | **List&lt;String&gt;** |  |  [optional] |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**attachments** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**read** | **Boolean** |  |  |
|**inReplyTo** | **String** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**threadId** | **UUID** |  |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |



## Enum: ItemTypeEnum

| Name | Value |
|---- | -----|
| RECEIVED_EMAIL | &quot;RECEIVED_EMAIL&quot; |
| SENT_EMAIL | &quot;SENT_EMAIL&quot; |



