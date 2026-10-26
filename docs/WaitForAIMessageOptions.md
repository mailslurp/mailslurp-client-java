

# WaitForAIMessageOptions

Wait for the first qualifying email or SMS in chronological order, then assert and extract from that same message. since is required to avoid selecting messages from previous test runs. Rejected candidates and selected messages remain unread unless a legacy endpoint normally marks the returned message read.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**AIMessageScope**](AIMessageScope) |  |  |
|**since** | **OffsetDateTime** |  |  |
|**timeout** | **Long** |  |  |
|**before** | **OffsetDateTime** |  |  [optional] |
|**unreadOnly** | **Boolean** |  |  |
|**sortDirection** | [**SortDirectionEnum**](#SortDirectionEnum) |  |  |
|**match** | [**AIMessageMatchOptions**](AIMessageMatchOptions) |  |  [optional] |
|**emailMatchOptions** | [**MatchOptions**](MatchOptions) |  |  [optional] |
|**smsMatchOptions** | [**SmsMatchOptions**](SmsMatchOptions) |  |  [optional] |
|**assertions** | [**List&lt;AIMessageAssertion&gt;**](AIMessageAssertion) |  |  |
|**outputSchema** | [**StructuredOutputSchema**](StructuredOutputSchema) |  |  [optional] |
|**transformId** | **UUID** |  |  [optional] |
|**instructions** | **String** |  |  [optional] |
|**aiOptions** | [**AIMessageAIOptions**](AIMessageAIOptions) |  |  |
|**extractionPreset** | [**ExtractionPresetEnum**](#ExtractionPresetEnum) | Built-in extraction schema. OTP_CODE returns data.code as a verbatim string, preserving leading zeros and letter case. Missing or equally eligible codes are INCONCLUSIVE. |  [optional] |



## Enum: SortDirectionEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



## Enum: ExtractionPresetEnum

| Name | Value |
|---- | -----|
| OTP_CODE | &quot;OTP_CODE&quot; |



