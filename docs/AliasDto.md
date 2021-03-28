

# AliasDto

Email alias representation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**emailAddress** | **String** | The alias&#39;s email address for receiving email |  [optional]
**id** | [**UUID**](UUID.md) |  | 
**inboxId** | [**UUID**](UUID.md) | Inbox that is associated with the alias |  [optional]
**isVerified** | **Boolean** | Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account |  [optional]
**maskedEmailAddress** | **String** | The underlying email address that is hidden and will received forwarded email |  [optional]
**name** | **String** |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**useThreads** | **Boolean** | If alias will generate response threads or not when email are received by it |  [optional]
**userId** | [**UUID**](UUID.md) |  | 



