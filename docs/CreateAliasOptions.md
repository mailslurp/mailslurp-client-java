

# CreateAliasOptions

Create email alias options. Email aliases can be used to mask real email addresses behind an ID. You can also attach an inbox to an alias so that any email received by the inbox email address if forwarded to the alias email address.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | Email address to be hidden behind alias. Emails sent to the alias email address will be forwarded to this address. If you want to enable replies set useThreads true and the reply-to for the email will allow outbound communication via a thread. Some email addresses may require verification if they are not added as a contact first. |  |
|**inboxId** | **UUID** | Optional inbox ID to attach to alias. Null by default means an a new inbox will be created for the alias. Use a custom inbox to control what email address the alias uses. To use custom email addresses create a domain and an inbox, the use the inbox ID with this call. Emails received by this inbox will be forwarded to the alias email address |  [optional] |
|**name** | **String** | Optional name for alias |  [optional] |
|**useThreads** | **Boolean** | Enable threads options. If true emails will be sent with a unique reply-to thread address. This means you can reply to the forwarded email and it will be sent to the recipients via your alias address. That way a thread conversation is preserved. |  |
|**domainId** | **UUID** | Custom domain ID to use when generating alias email addresses |  [optional] |
|**verifyEmailAddress** | **Boolean** | Whether to verify the masked email address exists before sending an email to it |  [optional] |



