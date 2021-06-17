

# EmailPreview

Preview of an email message. For full message (including body and attachments) call the `getEmail` or other email endpoints with the provided email ID.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **List&lt;String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional]
**bcc** | **List&lt;String&gt;** | List of &#x60;BCC&#x60; recipients email was addressed to |  [optional]
**cc** | **List&lt;String&gt;** | List of &#x60;CC&#x60; recipients email was addressed to |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | When was the email received by MailSlurp |  [optional]
**from** | **String** | Who the email was sent from |  [optional]
**id** | [**UUID**](UUID) | ID of the email entity |  [optional]
**read** | **Boolean** | Read flag. Has the email ever been viewed in the dashboard or fetched via the API? If so the email is marked as read. |  [optional]
**subject** | **String** | The subject line of the email message |  [optional]
**to** | **List&lt;String&gt;** | List of &#x60;To&#x60; recipients that email was addressed to |  [optional]



