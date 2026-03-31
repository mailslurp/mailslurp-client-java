

# InboxAutomationMatchOption

Single inbox automation match rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**FieldEnum**](#FieldEnum) | Supported fields for inbox forwarder and replier automation matching. |  |
|**should** | [**ShouldEnum**](#ShouldEnum) | Comparison mode for inbox automation matching. |  |
|**value** | **String** | Pattern or value to compare against the selected field. |  |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| RECIPIENTS | &quot;RECIPIENTS&quot; |
| SENDER | &quot;SENDER&quot; |
| SUBJECT | &quot;SUBJECT&quot; |
| ATTACHMENTS | &quot;ATTACHMENTS&quot; |
| ATTACHMENT_FILENAME | &quot;ATTACHMENT_FILENAME&quot; |
| ATTACHMENT_TEXT | &quot;ATTACHMENT_TEXT&quot; |



## Enum: ShouldEnum

| Name | Value |
|---- | -----|
| WILDCARD | &quot;WILDCARD&quot; |
| MATCH | &quot;MATCH&quot; |
| CONTAIN | &quot;CONTAIN&quot; |
| EQUAL | &quot;EQUAL&quot; |



