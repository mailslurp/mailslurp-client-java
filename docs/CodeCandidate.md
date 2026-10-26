

# CodeCandidate

Candidate verification code extracted from content

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Extracted code value |  |
|**confidence** | **Double** | Relative confidence score from 0 to 1 |  |
|**method** | [**MethodEnum**](#MethodEnum) | Extraction strategy for verification codes. Unsupported strategies may fall back when allowFallback is true. |  |
|**source** | **String** | Source fragment used for extraction, for example RAW_TEXT_PART or SMS_BODY |  |
|**context** | **String** | Nearby text context useful for debugging extraction decisions |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| PATTERN | &quot;PATTERN&quot; |
| LLM | &quot;LLM&quot; |
| OCR | &quot;OCR&quot; |
| OCR_THEN_LLM | &quot;OCR_THEN_LLM&quot; |



