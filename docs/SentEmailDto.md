

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
**id** | [**UUID**](UUID) | ID of sent email |  [optional]
**inboxId** | [**UUID**](UUID) | Inbox ID email was sent from |  [optional]
**isHTML** | **Boolean** |  |  [optional]
**pixelIds** | [**List&lt;UUID&gt;**](UUID) |  |  [optional]
**replyTo** | **String** |  |  [optional]
**sentAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**subject** | **String** |  |  [optional]
**to** | **List&lt;String&gt;** | Recipients email was sent to |  [optional]
**userId** | [**UUID**](UUID) | User ID |  [optional]



