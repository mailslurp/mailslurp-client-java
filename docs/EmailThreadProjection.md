

# EmailThreadProjection

An email thread is a message thread created for a email based on Message-ID, In-Reply-To, and References headers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** | Thread topic subject |  [optional] |
|**from** | **String** | From sender |  [optional] |
|**id** | **UUID** | ID of email thread |  |
|**userId** | **UUID** | User ID |  |
|**inboxId** | **UUID** | Inbox ID |  [optional] |
|**recipients** | [**EmailRecipientsProjection**](EmailRecipientsProjection) |  |  [optional] |
|**to** | **List&lt;String&gt;** | To recipients |  |
|**createdAt** | **OffsetDateTime** | Created at DateTime |  |
|**cc** | **List&lt;String&gt;** | CC recipients |  [optional] |
|**bcc** | **List&lt;String&gt;** | BCC recipients |  [optional] |
|**updatedAt** | **OffsetDateTime** | Updated at DateTime |  |
|**sender** | [**SenderProjection**](SenderProjection) |  |  [optional] |
|**lastCreatedAt** | **OffsetDateTime** | Last email created time |  [optional] |
|**hasAttachments** | **Boolean** | Has attachments |  |
|**lastSender** | [**SenderProjection**](SenderProjection) |  |  [optional] |
|**lastFrom** | **String** | Last sender |  [optional] |
|**unread** | **Boolean** | Has unread |  |
|**messageCount** | **Integer** | Number of messages in the thread |  |
|**lastBodyExcerpt** | **String** | Last body excerpt |  [optional] |
|**lastTextExcerpt** | **String** | Last text excerpt |  [optional] |



