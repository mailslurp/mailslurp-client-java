

# CreateOwnedAliasOptions

Create email alias options. Email aliases can be used to mask real email addresses behind an ID. You can also attach an inbox to an alias so that any email received by the inbox email address if forwarded to the alias email address.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailAddress** | **String** | Email address to be hidden behind alias |  [optional]
**inboxId** | [**UUID**](UUID.md) | Optional inbox ID to attach to alias. Emails received by this inbox will be forwarded to the alias email address |  [optional]
**name** | **String** | Optional name for alias |  [optional]
**proxied** | **Boolean** | Optional proxied flag. When proxied is true alias will forward the incoming emails to the aliased email address via a proxy inbox. A new proxy is created for every new email thread. By replying to the proxy you can correspond with using your email alias without revealing your real email address. |  [optional]



