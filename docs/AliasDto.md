

# AliasDto

Email alias representation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**emailAddress** | **String** | The alias&#39;s email address for receiving email |  |
|**maskedEmailAddress** | **String** | The underlying email address that is hidden and will received forwarded email |  [optional] |
|**userId** | **UUID** |  |  |
|**inboxId** | **UUID** | Inbox that is associated with the alias |  |
|**name** | **String** |  |  [optional] |
|**useThreads** | **Boolean** | If alias will generate response threads or not when email are received by it |  [optional] |
|**isVerified** | **Boolean** | Has the alias been verified. You must verify an alias if the masked email address has not yet been verified by your account |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



