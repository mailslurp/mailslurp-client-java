

# ReplyToAliasEmailOptions

Options for replying to an alias email using the alias inbox
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **List&lt;String&gt;** | List of uploaded attachments to send with the reply. Optional. |  [optional]
**body** | **String** | Body of the reply email you want to send |  [optional]
**charset** | **String** | The charset that your message should be sent with. Optional. Default is UTF-8 |  [optional]
**isHTML** | **Boolean** | Is the reply HTML |  [optional]
**sendStrategy** | [**SendStrategyEnum**](#SendStrategyEnum) | When to send the email. Typically immediately |  [optional]
**template** | [**UUID**](UUID) | Template ID to use instead of body. Will use template variable map to fill defined variable slots. |  [optional]
**templateVariables** | [**Object**]() | Template variables if using a template |  [optional]



## Enum: SendStrategyEnum

Name | Value
---- | -----
SINGLE_MESSAGE | &quot;SINGLE_MESSAGE&quot;



