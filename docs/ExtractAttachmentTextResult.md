

# ExtractAttachmentTextResult

Extracted text result for an attachment

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**present** | **Boolean** | True if extracted text is present |  |
|**text** | **String** | Extracted text when present |  [optional] |
|**methodUsed** | [**MethodUsedEnum**](#MethodUsedEnum) | Method for extracting text from attachments. OCR/LLM methods are reserved for advanced extraction. |  [optional] |
|**contentType** | **String** | Detected attachment content type |  [optional] |
|**warnings** | **List&lt;String&gt;** | Warnings or fallback notes |  |



## Enum: MethodUsedEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| NATIVE | &quot;NATIVE&quot; |
| OCR | &quot;OCR&quot; |
| LLM | &quot;LLM&quot; |
| OCR_THEN_LLM | &quot;OCR_THEN_LLM&quot; |



