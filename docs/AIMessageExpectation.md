

# AIMessageExpectation

One independently tracked delivery expectation. By default, each expectation must select a distinct message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**scope** | [**AIMessageScope**](AIMessageScope) |  |  |
|**match** | [**AIMessageMatchOptions**](AIMessageMatchOptions) |  |  [optional] |
|**emailMatchOptions** | [**MatchOptions**](MatchOptions) |  |  [optional] |
|**smsMatchOptions** | [**SmsMatchOptions**](SmsMatchOptions) |  |  [optional] |
|**assertions** | [**List&lt;AIMessageAssertion&gt;**](AIMessageAssertion) |  |  |
|**outputSchema** | [**StructuredOutputSchema**](StructuredOutputSchema) |  |  [optional] |
|**transformId** | **UUID** |  |  [optional] |
|**instructions** | **String** |  |  [optional] |
|**extractionPreset** | [**ExtractionPresetEnum**](#ExtractionPresetEnum) | Built-in extraction schema. OTP_CODE returns data.code as a verbatim string, preserving leading zeros and letter case. Missing or equally eligible codes are INCONCLUSIVE. |  [optional] |



## Enum: ExtractionPresetEnum

| Name | Value |
|---- | -----|
| OTP_CODE | &quot;OTP_CODE&quot; |



