

# Email

Email entity (also known as EmailDto). When an SMTP email message is received by MailSlurp it is parsed. The body and attachments are written to disk and the fields such as to, from, subject etc are stored in a database. The `body` contains the email content. If you want the original SMTP message see the `getRawEmail` endpoints. The attachments can be fetched using the AttachmentController

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | ID of the email entity |  |
|**userId** | **UUID** | ID of user that email belongs to |  |
|**inboxId** | **UUID** | ID of the inbox that received the email |  |
|**domainId** | **UUID** | ID of the domain that received the email |  [optional] |
|**to** | **List&lt;String&gt;** | List of &#x60;To&#x60; recipient email addresses that the email was addressed to. See recipients object for names. |  |
|**from** | **String** | Who the email was sent from. An email address - see fromName for the sender name. |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**replyTo** | **String** | The &#x60;replyTo&#x60; field on the received email message |  [optional] |
|**cc** | **List&lt;String&gt;** | List of &#x60;CC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. |  [optional] |
|**bcc** | **List&lt;String&gt;** | List of &#x60;BCC&#x60; recipients email addresses that the email was addressed to. See recipients object for names. |  [optional] |
|**headers** | **Map&lt;String, String&gt;** | Collection of SMTP headers attached to email |  [optional] |
|**headersMap** | **Map&lt;String, List&lt;String&gt;&gt;** | Multi-value map of SMTP headers attached to email |  [optional] |
|**attachments** | **List&lt;String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional] |
|**subject** | **String** | The subject line of the email message as specified by SMTP subject header |  [optional] |
|**body** | **String** | The body of the email message as text parsed from the SMTP message body (does not include attachments). Fetch the raw content to access the SMTP message and use the attachments property to access attachments. The body is stored separately to the email entity so the body is not returned in paginated results only in full single email or wait requests. |  [optional] |
|**bodyExcerpt** | **String** | An excerpt of the body of the email message for quick preview. Takes HTML content part if exists falls back to TEXT content part if not |  [optional] |
|**textExcerpt** | **String** | An excerpt of the body of the email message for quick preview. Takes TEXT content part if exists |  [optional] |
|**bodyMD5Hash** | **String** | A hash signature of the email message using MD5. Useful for comparing emails without fetching full body. |  [optional] |
|**isHTML** | **Boolean** | Is the email body content type HTML? |  [optional] |
|**charset** | **String** | Detected character set of the email body such as UTF-8 |  [optional] |
|**analysis** | [**EmailAnalysis**](EmailAnalysis) |  |  [optional] |
|**createdAt** | **OffsetDateTime** | When was the email received by MailSlurp |  |
|**updatedAt** | **OffsetDateTime** | When was the email last updated |  |
|**read** | **Boolean** | Read flag. Has the email ever been viewed in the dashboard or fetched via the API with a hydrated body? If so the email is marked as read. Paginated results do not affect read status. Read status is different to email opened event as it depends on your own account accessing the email. Email opened is determined by tracking pixels sent to other uses if enable during sending. You can listened for both email read and email opened events using webhooks. |  |
|**teamAccess** | **Boolean** | Can the email be accessed by organization team members |  |
|**isXAmpHtml** | **Boolean** | Is the email body content type x-amp-html Amp4Email? |  [optional] |
|**bodyPartContentTypes** | **List&lt;String&gt;** | A list of detected multipart mime message body part content types such as text/plain and text/html. Can be used with email bodyPart endpoints to fetch individual body parts. |  [optional] |
|**externalId** | **String** | UID used by external IMAP server to identify email |  [optional] |
|**messageId** | **String** | RFC 5322 Message-ID header value without angle brackets. |  [optional] |
|**threadId** | **UUID** | MailSlurp thread ID for email chain that enables lookup for In-Reply-To and References fields. |  [optional] |
|**inReplyTo** | **String** | Parsed value of In-Reply-To header. A Message-ID in a thread. |  [optional] |
|**favourite** | **Boolean** | Is email favourited |  [optional] |
|**sizeBytes** | **Long** | Size of raw email message in bytes |  [optional] |
|**html** | **Boolean** |  |  [optional] |
|**xampHtml** | **Boolean** |  |  [optional] |



