

# EmailProjection

A compact representation of a full email. Used in list endpoints to keep response sizes low. Body and attachments are not included. To get all fields of the email use the `getEmail` method with the email projection's ID. See `EmailDto` for documentation on projection properties.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **List&lt;String&gt;** |  |  [optional]
**bcc** | **List&lt;String&gt;** |  |  [optional]
**cc** | **List&lt;String&gt;** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**id** | [**UUID**](UUID.md) |  | 
**inboxId** | [**UUID**](UUID.md) |  | 
**read** | **Boolean** |  |  [optional]
**subject** | **String** |  |  [optional]
**to** | **List&lt;String&gt;** |  | 



