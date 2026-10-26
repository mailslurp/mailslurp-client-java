

# EmailDraftProjection

Compact email draft representation for list endpoints.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** |  |  [optional] |
|**from** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**attachments** | **List&lt;String&gt;** |  |  [optional] |
|**textExcerpt** | **String** |  |  [optional] |
|**bodyExcerpt** | **String** |  |  [optional] |
|**to** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**bcc** | **List&lt;String&gt;** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  |
|**sender** | [**Sender**](Sender) |  |  [optional] |



