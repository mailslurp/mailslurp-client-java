

# SentEmailDto

Sent email details
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) | ID of sent email |  [optional]
**userId** | [**UUID**](UUID) | User ID |  [optional]
**inboxId** | [**UUID**](UUID) | Inbox ID email was sent from |  [optional]
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
**sentAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**pixelIds** | [**List&lt;UUID&gt;**](UUID) |  |  [optional]
**html** | **Boolean** |  |  [optional]



