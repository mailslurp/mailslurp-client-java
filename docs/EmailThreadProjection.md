

# EmailThreadProjection

An email thread is a message thread created for a email based on Message-ID, In-Reply-To, and References headers

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** | Thread topic subject |  [optional] |
|**sender** | [**SenderProjection**](SenderProjection) |  |  [optional] |
|**recipients** | [**EmailRecipientsProjection**](EmailRecipientsProjection) |  |  [optional] |
|**inboxId** | **UUID** | Inbox ID |  [optional] |
|**userId** | **UUID** | User ID |  |
|**updatedAt** | **OffsetDateTime** | Updated at DateTime |  |
|**createdAt** | **OffsetDateTime** | Created at DateTime |  |
|**to** | **List&lt;String&gt;** | To recipients |  |
|**cc** | **List&lt;String&gt;** | CC recipients |  [optional] |
|**bcc** | **List&lt;String&gt;** | BCC recipients |  [optional] |
|**hasAttachments** | **Boolean** | Has attachments |  |
|**unread** | **Boolean** | Has unread |  |
|**messageCount** | **Integer** | Number of messages in the thread |  |
|**lastBodyExcerpt** | **String** | Last body excerpt |  [optional] |
|**lastTextExcerpt** | **String** | Last text excerpt |  [optional] |
|**lastCreatedAt** | **OffsetDateTime** | Last email created time |  [optional] |
|**lastFrom** | **String** | Last sender |  [optional] |
|**lastSender** | [**SenderProjection**](SenderProjection) |  |  [optional] |
|**id** | **UUID** | ID of email thread |  |
|**from** | **String** | From sender |  [optional] |



