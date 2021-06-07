

# Email

Email entity (also known as EmailDto). When an SMTP email message is received by MailSlurp it is parsed. The body and attachments are written to disk and the fields such as to, from, subject etc are stored in a database. The `body` contains the email content. If you want the original SMTP message see the `getRawEmail` endpoints. The attachments can be fetched using the AttachmentController
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysis** | [**EmailAnalysis**](EmailAnalysis) |  |  [optional]
**attachments** | **List&lt;String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional]
**bcc** | **List&lt;String&gt;** | List of &#x60;BCC&#x60; recipients email was addressed to |  [optional]
**body** | **String** | The body of the email message |  [optional]
**bodyMD5Hash** | **String** | A hash signature of the email message |  [optional]
**cc** | **List&lt;String&gt;** | List of &#x60;CC&#x60; recipients email was addressed to |  [optional]
**charset** | **String** | Detected character set of the email body such as UTF-8 |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | When was the email received by MailSlurp |  [optional]
**from** | **String** | Who the email was sent from |  [optional]
**headers** | **Map&lt;String, String&gt;** | Collection of SMTP headers attached to email |  [optional]
**id** | [**UUID**](UUID) | ID of the email entity |  [optional]
**inboxId** | [**UUID**](UUID) | ID of the inbox that received the email |  [optional]
**isHTML** | **Boolean** | Is the email body HTML |  [optional]
**read** | **Boolean** | Read flag. Has the email ever been viewed in the dashboard or fetched via the API? If so the email is marked as read. |  [optional]
**replyTo** | **String** | The &#x60;replyTo&#x60; field on the received email message |  [optional]
**subject** | **String** | The subject line of the email message |  [optional]
**teamAccess** | **Boolean** | Can the email be accessed by organization team members |  [optional]
**to** | **List&lt;String&gt;** | List of &#x60;To&#x60; recipients that email was addressed to |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) | When was the email last updated |  [optional]
**userId** | [**UUID**](UUID) | ID of user that email belongs to |  [optional]



