

# EmailProjection

A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the `getEmail` method with the email projection's ID. See `EmailDto` for documentation on projection properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** |  |  [optional] |
|**from** | **String** |  |  |
|**id** | **UUID** |  |  |
|**threadId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**attachments** | **List&lt;String&gt;** |  |  [optional] |
|**read** | **Boolean** |  |  |
|**textExcerpt** | **String** |  |  [optional] |
|**bodyExcerpt** | **String** |  |  [optional] |
|**to** | **List&lt;String&gt;** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**bcc** | **List&lt;String&gt;** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**inReplyTo** | **String** |  |  [optional] |
|**favourite** | **Boolean** |  |  [optional] |
|**sizeBytes** | **Long** |  |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**domainId** | **UUID** |  |  [optional] |
|**bodyPartContentTypes** | **List&lt;String&gt;** |  |  [optional] |
|**bodyMD5Hash** | **String** |  |  [optional] |
|**plusAddress** | **UUID** |  |  [optional] |
|**imapUid** | **Long** |  |  [optional] |
|**teamAccess** | **Boolean** |  |  |



