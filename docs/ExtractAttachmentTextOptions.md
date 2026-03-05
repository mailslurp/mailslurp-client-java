

# ExtractAttachmentTextOptions

Options for extracting text from an attachment. Choose a method and whether fallback is allowed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodEnum**](#MethodEnum) | Method for extracting text from attachments. OCR/LLM methods are reserved for advanced extraction. |  [optional] |
|**allowFallback** | **Boolean** | Allow fallback to native extraction when the selected method is unavailable. |  [optional] |
|**maxBytes** | **Long** | Maximum bytes to read from attachment for native text extraction. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| NATIVE | &quot;NATIVE&quot; |
| OCR | &quot;OCR&quot; |
| LLM | &quot;LLM&quot; |
| OCR_THEN_LLM | &quot;OCR_THEN_LLM&quot; |



