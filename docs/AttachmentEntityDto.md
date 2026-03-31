

# AttachmentEntityDto

DTO representation of an attachment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for this attachment. |  |
|**attachmentId** | **String** | The identifier of the attachment file |  |
|**userId** | **UUID** | The user identifier associated with this attachment. |  |
|**contentType** | **String** | The content type of the attachment. |  [optional] |
|**contentLength** | **Long** | The content length of the attachment in bytes. |  [optional] |
|**contentId** | **String** | The content identifier, which is a unique ID for the content part of the email. |  [optional] |
|**name** | **String** | The name of the attachment file. |  [optional] |
|**inboxId** | **UUID** | The inbox identifier associated with this attachment. |  [optional] |
|**createdAt** | **OffsetDateTime** | The timestamp when this attachment was created. |  |
|**updatedAt** | **OffsetDateTime** | The timestamp when this attachment was last updated. |  |



