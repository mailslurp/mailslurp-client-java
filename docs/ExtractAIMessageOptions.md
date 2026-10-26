

# ExtractAIMessageOptions

Extract structured data from an existing email or SMS. Supply exactly one of extractionPreset, outputSchema or transformId. Required strings must be grounded in source evidence; missing or ambiguous fields are reported as INCONCLUSIVE.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**message** | [**AIMessageReference**](AIMessageReference) |  |  |
|**outputSchema** | [**StructuredOutputSchema**](StructuredOutputSchema) |  |  [optional] |
|**transformId** | **UUID** |  |  [optional] |
|**instructions** | **String** |  |  [optional] |
|**timeout** | **Long** |  |  |
|**aiOptions** | [**AIMessageAIOptions**](AIMessageAIOptions) |  |  |
|**extractionPreset** | [**ExtractionPresetEnum**](#ExtractionPresetEnum) | Built-in extraction schema. OTP_CODE returns data.code as a verbatim string, preserving leading zeros and letter case. Missing or equally eligible codes are INCONCLUSIVE. |  [optional] |



## Enum: ExtractionPresetEnum

| Name | Value |
|---- | -----|
| OTP_CODE | &quot;OTP_CODE&quot; |



