

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
|**pixelIds** | **List&lt;UUID&gt;** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**messageIds** | **List&lt;String&gt;** |  |  [optional] |
|**virtualSend** | **Boolean** |  |  [optional] |
|**templateId** | **UUID** |  |  [optional] |
|**templateVariables** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**html** | **Boolean** |  |  [optional] |



