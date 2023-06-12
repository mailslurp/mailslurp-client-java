

# CreateInboxDto

Options for creating an inbox. An inbox has a real email address that can send and receive emails. Inboxes can be permanent or expire at a given time. Inboxes are either `SMTP` or `HTTP` mailboxes. `SMTP` inboxes are processed by a mail server running at `mailslurp.mx` while `HTTP` inboxes are processed by AWS SES backed mailservers. An inbox email address is randomly assigned by default ending in either `mailslurp.com` or (if `useDomainPool` is enabled) ending in a similar domain such as `mailslurp.xyz` (selected at random). To specify an address use a custom domain: either pass the `emailAddress` options with `<your-recipient>@<your-domain>`. To create a randomized address for your domain set the `domainName` to the domain you have verified or pass the `domainId`. Virtual inboxes prevent outbound sending and instead trap mail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | A custom email address to use with the inbox. Defaults to null. When null MailSlurp will assign a random email address to the inbox such as &#x60;123@mailslurp.com&#x60;. If you use the &#x60;useDomainPool&#x60; option when the email address is null it will generate an email address with a more varied domain ending such as &#x60;123@mailslurp.info&#x60; or &#x60;123@mailslurp.biz&#x60;. When a custom email address is provided the address is split into a domain and the domain is queried against your user. If you have created the domain in the MailSlurp dashboard and verified it you can use any email address that ends with the domain. Note domain types must match the inbox type - so &#x60;SMTP&#x60; inboxes will only work with &#x60;SMTP&#x60; type domains. Avoid &#x60;SMTP&#x60; inboxes if you need to send emails as they can only receive. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints with the inbox ID. |  [optional] |
|**domainName** | **String** | FQDN domain name for the domain you have verified. Will be appended with a randomly assigned recipient name. Use the &#x60;emailAddress&#x60; option instead to specify the full custom inbox. |  [optional] |
|**domainId** | **UUID** | ID of custom domain to use for email address. |  [optional] |
|**name** | **String** | Optional name of the inbox. Displayed in the dashboard for easier search and used as the sender name when sending emails. |  [optional] |
|**description** | **String** | Optional description of the inbox for labelling purposes. Is shown in the dashboard and can be used with |  [optional] |
|**useDomainPool** | **Boolean** | Use the MailSlurp domain name pool with this inbox when creating the email address. Defaults to null. If enabled the inbox will be an email address with a domain randomly chosen from a list of the MailSlurp domains. This is useful when the default &#x60;@mailslurp.com&#x60; email addresses used with inboxes are blocked or considered spam by a provider or receiving service. When domain pool is enabled an email address will be generated ending in &#x60;@mailslurp.{world,info,xyz,...}&#x60; . This means a TLD is randomly selecting from a list of &#x60;.biz&#x60;, &#x60;.info&#x60;, &#x60;.xyz&#x60; etc to add variance to the generated email addresses. When null or false MailSlurp uses the default behavior of &#x60;@mailslurp.com&#x60; or custom email address provided by the emailAddress field. Note this feature is only available for &#x60;HTTP&#x60; inbox types. |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags that inbox has been tagged with. Tags can be added to inboxes to group different inboxes within an account. You can also search for inboxes by tag in the dashboard UI. |  [optional] |
|**expiresAt** | **OffsetDateTime** | Optional inbox expiration date. If null then this inbox is permanent and the emails in it won&#39;t be deleted. If an expiration date is provided or is required by your plan the inbox will be closed when the expiration time is reached. Expired inboxes still contain their emails but can no longer send or receive emails. An ExpiredInboxRecord is created when an inbox and the email address and inbox ID are recorded. The expiresAt property is a timestamp string in ISO DateTime Format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSXXX. |  [optional] |
|**favourite** | **Boolean** | Is the inbox a favorite. Marking an inbox as a favorite is typically done in the dashboard for quick access or filtering |  [optional] |
|**expiresIn** | **Long** | Number of milliseconds that inbox should exist for |  [optional] |
|**allowTeamAccess** | **Boolean** | DEPRECATED (team access is always true). Grant team access to this inbox and the emails that belong to it for team members of your organization. |  [optional] |
|**inboxType** | [**InboxTypeEnum**](#InboxTypeEnum) | Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send). |  [optional] |
|**virtualInbox** | **Boolean** | Virtual inbox prevents any outbound emails from being sent. It creates sent email records but will never send real emails to recipients. Great for testing and faking email sending. |  [optional] |
|**useShortAddress** | **Boolean** | Use a shorter email address under 31 characters |  [optional] |



## Enum: InboxTypeEnum

| Name | Value |
|---- | -----|
| HTTP_INBOX | &quot;HTTP_INBOX&quot; |
| SMTP_INBOX | &quot;SMTP_INBOX&quot; |



