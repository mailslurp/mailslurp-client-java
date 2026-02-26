

# EmailProjection

A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the `getEmail` method with the email projection's ID. See `EmailDto` for documentation on projection properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** |  |  [optional] |
|**inboxId** | **UUID** |  |  |
|**attachments** | **List&lt;String&gt;** |  |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**sizeBytes** | **Long** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**to** | **List&lt;String&gt;** |  |  |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**bcc** | **List&lt;String&gt;** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**domainId** | **UUID** |  |  [optional] |
|**favourite** | **Boolean** |  |  [optional] |
|**plusAddress** | **UUID** |  |  [optional] |
|**imapUid** | **Long** |  |  [optional] |
|**inReplyTo** | **String** |  |  [optional] |
|**read** | **Boolean** |  |  |
|**bodyExcerpt** | **String** |  |  [optional] |
|**textExcerpt** | **String** |  |  [optional] |
|**bodyPartContentTypes** | **List&lt;String&gt;** |  |  [optional] |
|**bodyMD5Hash** | **String** |  |  [optional] |
|**teamAccess** | **Boolean** |  |  |
|**id** | **UUID** |  |  |
|**threadId** | **UUID** |  |  [optional] |
|**from** | **String** |  |  |



