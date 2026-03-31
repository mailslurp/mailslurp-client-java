

# CreateInboxForwarderOptions

Options for creating an inbox forwarder

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**FieldEnum**](#FieldEnum) | Field to match against to trigger inbox forwarding for inbound email |  [optional] |
|**match** | **String** | String or wildcard style match for field specified when evaluating forwarding rules |  [optional] |
|**forwardToRecipients** | **List&lt;String&gt;** | Email addresses to forward an email to if it matches the field and match criteria of the forwarder |  |
|**should** | [**ShouldEnum**](#ShouldEnum) | Comparison mode for inbox automation matching. |  [optional] |
|**matchOptions** | [**InboxAutomationMatchOptions**](InboxAutomationMatchOptions) |  |  [optional] |
|**attachmentTextExtractionMethod** | [**AttachmentTextExtractionMethodEnum**](#AttachmentTextExtractionMethodEnum) | Method for extracting text from attachments. |  [optional] |



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



## Enum: AttachmentTextExtractionMethodEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| NATIVE | &quot;NATIVE&quot; |
| OCR | &quot;OCR&quot; |
| LLM | &quot;LLM&quot; |
| OCR_THEN_LLM | &quot;OCR_THEN_LLM&quot; |



