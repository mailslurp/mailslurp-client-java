

# EmailDraftDto

Saved email draft that can be edited and sent later.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | ID of the draft |  |
|**userId** | **UUID** | User ID |  |
|**inboxId** | **UUID** | Inbox ID the draft will send from |  |
|**to** | **List&lt;String&gt;** | Draft recipients |  [optional] |
|**cc** | **List&lt;String&gt;** | Draft CC recipients |  [optional] |
|**bcc** | **List&lt;String&gt;** | Draft BCC recipients |  [optional] |
|**from** | **String** | Draft sender |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**subject** | **String** | Draft subject |  [optional] |
|**bodyExcerpt** | **String** | Draft body preview |  [optional] |
|**textExcerpt** | **String** | Draft text preview |  [optional] |
|**attachments** | **List&lt;String&gt;** | Attachment IDs selected for the draft |  [optional] |
|**sendOptions** | [**SendEmailOptions**](SendEmailOptions) |  |  |
|**createdAt** | **OffsetDateTime** | Draft creation time |  |
|**updatedAt** | **OffsetDateTime** | Draft last update time |  |



