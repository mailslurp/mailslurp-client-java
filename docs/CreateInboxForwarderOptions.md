

# CreateInboxForwarderOptions

Options for creating an inbox forwarder

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**FieldEnum**](#FieldEnum) | Field to match against to trigger inbox forwarding for inbound email |  |
|**match** | **String** | String or wildcard style match for field specified when evaluating forwarding rules |  |
|**forwardToRecipients** | **List&lt;String&gt;** | Email addresses to forward an email to if it matches the field and match criteria of the forwarder |  |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| RECIPIENTS | &quot;RECIPIENTS&quot; |
| SENDER | &quot;SENDER&quot; |
| SUBJECT | &quot;SUBJECT&quot; |
| ATTACHMENTS | &quot;ATTACHMENTS&quot; |



