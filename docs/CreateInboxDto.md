

# CreateInboxDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Optional description of an inbox for labelling purposes |  [optional]
**emailAddress** | **String** | Optionally specify an email address you want the inbox to have. When left blank an email address will be randomly assigned to the inbox usually ending in &#x60;@mailslurp.com&#x60;. Custom email addresses must include your own custom domain that you have configured in MailSlurp. So if your domain is &#x60;mysite.com&#x60; you can created any email address ending in &#x60;@mysite.com&#x60;. All email addresses are transformed to lowercase! |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When, if ever, will the inbox expire and be deleted. If null then this inbox is permanent and the emails in it won&#39;t be deleted. Timestamp passed as string. |  [optional]
**favourite** | **Boolean** | Is the inbox favorited. Favouriting inboxes is typically done in the dashboard for quick access |  [optional]
**name** | **String** | Optional name of the inbox. Displayed in the dashboard for easier search |  [optional]
**tags** | **List&lt;String&gt;** | Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. |  [optional]



