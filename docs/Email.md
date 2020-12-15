

# Email

Email model (also referred to as EmailDto). Represents an email that was received by an inbox. If you want the original SMTP message see the `getRawEmail` endpoint.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysis** | [**EmailAnalysis**](EmailAnalysis.md) |  |  [optional]
**attachments** | **List&lt;String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional]
**bcc** | **List&lt;String&gt;** | List of &#x60;BCC&#x60; recipients email was addressed to |  [optional]
**body** | **String** | The body of the email message |  [optional]
**bodyMD5Hash** | **String** | A hash signature of the email message |  [optional]
**cc** | **List&lt;String&gt;** | List of &#x60;CC&#x60; recipients email was addressed to |  [optional]
**charset** | **String** | Detected character set of the email body such as UTF-8 |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | When was the email received by MailSlurp |  [optional]
**from** | **String** | Who the email was sent from |  [optional]
**headers** | **Map&lt;String, String&gt;** |  |  [optional]
**id** | [**UUID**](UUID.md) | ID of the email |  [optional]
**inboxId** | [**UUID**](UUID.md) | ID of the inbox that received the email |  [optional]
**isHTML** | **Boolean** | Was HTML sent in the email body |  [optional]
**read** | **Boolean** | Has the email been viewed ever |  [optional]
**replyTo** | **String** | The replyTo field on the received email |  [optional]
**subject** | **String** | The subject line of the email message |  [optional]
**to** | **List&lt;String&gt;** | List of &#x60;To&#x60; recipients email was addressed to |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When was the email last updated |  [optional]
**userId** | [**UUID**](UUID.md) | ID of user that email belongs |  [optional]



