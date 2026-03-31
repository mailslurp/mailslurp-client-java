

# SentEmailDto

Sent email details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | ID of sent email |  |
|**userId** | **UUID** | User ID |  |
|**inboxId** | **UUID** | Inbox ID email was sent from |  |
|**domainId** | **UUID** | Domain ID |  [optional] |
|**to** | **List&lt;String&gt;** | Recipients email was sent to |  [optional] |
|**from** | **String** | Sent from address |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**replyTo** | **String** |  |  [optional] |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**bcc** | **List&lt;String&gt;** |  |  [optional] |
|**attachments** | **List&lt;String&gt;** | Array of IDs of attachments that were sent with this email |  [optional] |
|**subject** | **String** |  |  [optional] |
|**bodyMD5Hash** | **String** | MD5 Hash |  [optional] |
|**body** | **String** | Sent email body |  [optional] |
|**toContacts** | **List&lt;UUID&gt;** |  |  [optional] |
|**toGroup** | **UUID** |  |  [optional] |
|**charset** | **String** |  |  [optional] |
|**isHTML** | **Boolean** |  |  [optional] |
|**sentAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**pixelIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**messageId** | **String** | RFC 5322 Message-ID header value without angle brackets. |  [optional] |
|**messageIds** | **List&lt;String&gt;** |  |  [optional] |
|**virtualSend** | **Boolean** |  |  [optional] |
|**templateId** | **UUID** |  |  [optional] |
|**templateVariables** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**headers** | **Map&lt;String, String&gt;** |  |  [optional] |
|**threadId** | **UUID** | MailSlurp thread ID for email chain that enables lookup for In-Reply-To and References fields. |  [optional] |
|**bodyExcerpt** | **String** | An excerpt of the body of the email message for quick preview. Takes HTML content part if exists falls back to TEXT content part if not |  [optional] |
|**textExcerpt** | **String** | An excerpt of the body of the email message for quick preview. Takes TEXT content part if exists |  [optional] |
|**inReplyTo** | **String** | Parsed value of In-Reply-To header. A Message-ID in a thread. |  [optional] |
|**favourite** | **Boolean** | Is email favourited |  [optional] |
|**sizeBytes** | **Long** | Size of raw email message in bytes |  [optional] |
|**html** | **Boolean** |  |  [optional] |



