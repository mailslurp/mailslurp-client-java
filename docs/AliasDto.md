

# AliasDto

Email alias representation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  |  [optional]
**emailAddress** | **String** | The alias&#39;s email address for receiving email |  [optional]
**maskedEmailAddress** | **String** | The underlying email address that is hidden and will received forwarded email |  [optional]
**userId** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) | Inbox that is associated with the alias |  [optional]
**name** | **String** |  |  [optional]
**useThreads** | **Boolean** | If alias will generate response threads or not when email are received by it |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**verified** | **Boolean** |  |  [optional]



