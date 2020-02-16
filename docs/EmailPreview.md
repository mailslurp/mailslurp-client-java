

# EmailPreview

Preview of an email message. For full message call the email endpoints with the provided email id.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **List&lt;String&gt;** | List of IDs of attachments found in the email. Use these IDs with the Inbox and Email Controllers to download attachments and attachment meta data such as filesize, name, extension. |  [optional]
**bcc** | **List&lt;String&gt;** | List of &#x60;BCC&#x60; recipients email was addressed to |  [optional]
**cc** | **List&lt;String&gt;** | List of &#x60;CC&#x60; recipients email was addressed to |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | When was the email received by MailSlurp |  [optional]
**id** | [**UUID**](UUID.md) | ID of the email |  [optional]
**read** | **Boolean** | Has the email been viewed ever |  [optional]
**subject** | **String** | The subject line of the email message |  [optional]
**to** | **List&lt;String&gt;** | List of &#x60;To&#x60; recipients email was addressed to |  [optional]



