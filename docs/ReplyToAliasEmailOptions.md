

# ReplyToAliasEmailOptions

Options for replying to an alias email using the alias inbox

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**body** | **String** | Body of the reply email you want to send |  |
|**isHTML** | **Boolean** | Is the reply HTML |  |
|**charset** | **String** | The charset that your message should be sent with. Optional. Default is UTF-8 |  [optional] |
|**attachments** | **List&lt;String&gt;** | List of uploaded attachments to send with the reply. Optional. |  [optional] |
|**templateVariables** | **Map&lt;String, Object&gt;** | Template variables if using a template |  [optional] |
|**template** | **UUID** | Template ID to use instead of body. Will use template variable map to fill defined variable slots. |  [optional] |
|**sendStrategy** | [**SendStrategyEnum**](#SendStrategyEnum) | How an email should be sent based on its recipients |  [optional] |
|**customHeaders** | **Map&lt;String, String&gt;** | Optional custom headers |  [optional] |
|**useInboxName** | **Boolean** | Optionally use inbox name as display name for sender email address |  [optional] |
|**html** | **Boolean** |  |  [optional] |



## Enum: SendStrategyEnum

| Name | Value |
|---- | -----|
| SINGLE_MESSAGE | &quot;SINGLE_MESSAGE&quot; |



