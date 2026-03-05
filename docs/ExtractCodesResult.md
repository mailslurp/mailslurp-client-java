

# ExtractCodesResult

Result of extracting verification codes from message content

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**found** | **Boolean** | True if at least one code candidate was found |  |
|**code** | **String** | Best candidate code when found |  [optional] |
|**methodUsed** | [**MethodUsedEnum**](#MethodUsedEnum) | Extraction strategy for verification codes. Unsupported strategies may fall back when allowFallback is true. |  [optional] |
|**candidates** | [**List&lt;CodeCandidate&gt;**](CodeCandidate) | Ranked code candidates |  |
|**warnings** | **List&lt;String&gt;** | Warnings or fallback notes explaining extraction behavior for debugging and QA. |  |



## Enum: MethodUsedEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| PATTERN | &quot;PATTERN&quot; |
| LLM | &quot;LLM&quot; |
| OCR | &quot;OCR&quot; |
| OCR_THEN_LLM | &quot;OCR_THEN_LLM&quot; |



