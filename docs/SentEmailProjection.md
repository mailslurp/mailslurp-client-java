

# SentEmailProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**threadId** | **UUID** |  |  [optional] |
|**from** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**userId** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  |
|**attachments** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**to** | **List&lt;String&gt;** |  |  [optional] |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**bcc** | **List&lt;String&gt;** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**inReplyTo** | **String** |  |  [optional] |
|**virtualSend** | **Boolean** |  |  |
|**bodyExcerpt** | **String** |  |  [optional] |
|**textExcerpt** | **String** |  |  [optional] |
|**bodyMD5Hash** | **String** |  |  [optional] |



