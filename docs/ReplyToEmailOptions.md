

# ReplyToEmailOptions

Options for replying to email with API
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | **List&lt;String&gt;** | List of uploaded attachments to send with the reply. Optional. |  [optional]
**body** | **String** | Body of the reply email you want to send |  [optional]
**charset** | **String** | The charset that your message should be sent with. Optional. Default is UTF-8 |  [optional]
**from** | **String** | The from header that should be used. Optional |  [optional]
**isHTML** | **Boolean** | Is the reply HTML |  [optional]
**replyTo** | **String** | The replyTo header that should be used. Optional |  [optional]
**sendStrategy** | [**SendStrategyEnum**](#SendStrategyEnum) | When to send the email. Typically immediately |  [optional]
**template** | [**UUID**](UUID) | Template ID to use instead of body. Will use template variable map to fill defined variable slots. |  [optional]
**templateVariables** | [**Object**]() | Template variables if using a template |  [optional]
**useInboxName** | **Boolean** | Optionally use inbox name as display name for sender email address |  [optional]



## Enum: SendStrategyEnum

Name | Value
---- | -----
SINGLE_MESSAGE | &quot;SINGLE_MESSAGE&quot;



