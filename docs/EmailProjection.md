

# EmailProjection

A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the `getEmail` method with the email projection's ID. See `EmailDto` for documentation on projection properties.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**from** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**inboxId** | **UUID** |  |  |
|**attachments** | **List&lt;String&gt;** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**to** | **List&lt;String&gt;** |  |  |
|**bcc** | **List&lt;String&gt;** |  |  [optional] |
|**cc** | **List&lt;String&gt;** |  |  [optional] |
|**read** | **Boolean** |  |  |
|**domainId** | **UUID** |  |  [optional] |
|**bodyExcerpt** | **String** |  |  [optional] |
|**teamAccess** | **Boolean** |  |  |
|**bodyMD5Hash** | **String** |  |  [optional] |



