

# SentEmailDto

Sent email details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **List&lt;String&gt;** | Array of IDs of attachments that were sent with this email |  [optional]
**bcc** | **List&lt;String&gt;** |  |  [optional]
**body** | **String** |  |  [optional]
**bodyMD5Hash** | **String** | MD5 Hash |  [optional]
**cc** | **List&lt;String&gt;** |  |  [optional]
**charset** | **String** |  |  [optional]
**from** | **String** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of sent email |  [optional]
**inboxId** | [**UUID**](UUID.md) | Inbox ID email was sent from |  [optional]
**isHTML** | **Boolean** |  |  [optional]
**sentAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**subject** | **String** |  |  [optional]
**to** | **List&lt;String&gt;** | Recipients email was sent to |  [optional]
**userId** | [**UUID**](UUID.md) | User ID |  [optional]



