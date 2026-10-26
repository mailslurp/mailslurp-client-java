

# InboxForwarderDto

Inbox forwarder. Describes how an inbox will forward matching emails to designated recipients.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**name** | **String** | Name of inbox forwarder |  [optional] |
|**field** | [**FieldEnum**](#FieldEnum) | Which field to match against |  [optional] |
|**match** | **String** | Pattern to apply to field |  [optional] |
|**forwardToRecipients** | **List&lt;String&gt;** | Who to send forwarded email to |  |
|**createdAt** | **OffsetDateTime** |  |  |
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



