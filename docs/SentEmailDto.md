

# SentEmailDto

Sent email details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) | ID of sent email | 
**userId** | [**UUID**](UUID) | User ID | 
**inboxId** | [**UUID**](UUID) | Inbox ID email was sent from | 
**to** | **List&lt;String&gt;** | Recipients email was sent to |  [optional]
**from** | **String** |  |  [optional]
**replyTo** | **String** |  |  [optional]
**cc** | **List&lt;String&gt;** |  |  [optional]
**bcc** | **List&lt;String&gt;** |  |  [optional]
**attachments** | **List&lt;String&gt;** | Array of IDs of attachments that were sent with this email |  [optional]
**subject** | **String** |  |  [optional]
**bodyMD5Hash** | **String** | MD5 Hash |  [optional]
**body** | **String** |  |  [optional]
**charset** | **String** |  |  [optional]
**isHTML** | **Boolean** |  |  [optional]
**sentAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**pixelIds** | [**List&lt;UUID&gt;**](UUID) |  |  [optional]
**messageId** | **String** |  |  [optional]



