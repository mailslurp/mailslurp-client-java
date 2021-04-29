

# CreateWebhookOptions

Options for creating a webhook. Webhooks can be attached to inboxes and MailSlurp will POST a webhook payload to the URL specified whenever the inbox receives an email. Webhooks are great for processing many inbound emails.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basicAuth** | [**BasicAuthOptions**](BasicAuthOptions) |  |  [optional]
**name** | **String** | Optional name for the webhook |  [optional]
**url** | **String** | Public URL on your server that MailSlurp can post WebhookNotification payload to when an email is received. The payload of the submitted JSON is described by https://api.mailslurp.com/schemas/webhook-payload |  [optional]



