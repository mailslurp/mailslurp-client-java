

# SendEmailOptions

Options for sending an email message from an inbox. Must supply either list of `to` email addresses or `toGroups` list of Contact Group IDs.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **List&lt;String&gt;** | Optional list of attachment IDs to send with this email. You must first upload each attachment separately in order to obtain attachment IDs |  [optional]
**bcc** | **List&lt;String&gt;** | Optional list of bcc destination email addresses |  [optional]
**body** | **String** | Contents of email. If body contains HTML then set &#x60;isHTML&#x60; to true. You can use moustache template syntax in the body in conjunction with &#x60;toGroup&#x60; contact variables or &#x60;templateVariables&#x60; data. |  [optional]
**cc** | **List&lt;String&gt;** | Optional list of cc destination email addresses |  [optional]
**charset** | **String** | Optional charset |  [optional]
**from** | **String** | Optional from address. If not set source inbox address will be used |  [optional]
**isHTML** | **Boolean** | Optional HTML flag. If true the &#x60;content-type&#x60; of the email will be &#x60;text/html&#x60; |  [optional]
**replyTo** | **String** | Optional replyTo header |  [optional]
**subject** | **String** | Optional email subject line |  [optional]
**template** | [**UUID**](UUID.md) | Optional template ID to use for body. Will override body if provided |  [optional]
**templateVariables** | [**Object**](.md) | Optional map of template variables. Will replace moustache syntax variables in subject and body or template with the associated values |  [optional]
**to** | **List&lt;String&gt;** | List of destination email addresses. Even single recipients must be in array form. Max 100 recipients. |  [optional]
**toContacts** | [**List&lt;UUID&gt;**](UUID.md) | Optional list of contact IDs to send email to |  [optional]
**toGroup** | [**UUID**](UUID.md) | Optional contact group ID to send email to |  [optional]



