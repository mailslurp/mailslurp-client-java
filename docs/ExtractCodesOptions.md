

# ExtractCodesOptions

Options for extracting verification codes from email or SMS content. Use method to control extraction strategy and allowFallback to control strictness.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodEnum**](#MethodEnum) | Extraction strategy for verification codes. Unsupported strategies may fall back when allowFallback is true. |  [optional] |
|**allowFallback** | **Boolean** | Allow fallback to deterministic pattern extraction when the selected method is unavailable. |  [optional] |
|**minLength** | **Integer** | Minimum code length to consider. Typical OTP values are between 4 and 8 characters. |  [optional] |
|**maxLength** | **Integer** | Maximum code length to consider. |  [optional] |
|**maxCandidates** | **Integer** | Maximum number of code candidates to return. Best candidate is also returned separately. |  [optional] |
|**customPatterns** | **List&lt;String&gt;** | Optional custom regex patterns for code extraction. Each pattern should have either one capture group for the code or match the full code directly. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| PATTERN | &quot;PATTERN&quot; |
| LLM | &quot;LLM&quot; |
| OCR | &quot;OCR&quot; |
| OCR_THEN_LLM | &quot;OCR_THEN_LLM&quot; |



