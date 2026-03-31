

# FakeEmailDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**emailAddress** | **String** |  |  |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**attachmentNames** | **List&lt;String&gt;** |  |  |
|**subject** | **String** |  |  [optional] |
|**preview** | **String** |  |  [optional] |
|**body** | **String** | use read content endpoints instead |  |
|**seen** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**contentType** | **String** |  |  |
|**bodyUrl** | **String** |  |  |



