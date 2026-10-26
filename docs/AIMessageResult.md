

# AIMessageResult

AI message evaluation, message payload and bounded diagnostics. Check status before using data. An assertion failure returns the selected message and never resumes searching. Evidence is verified against the message source. No model is silently substituted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evaluationId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**summary** | **String** |  |  |
|**model** | [**AIMessageModelDto**](AIMessageModelDto) |  |  |
|**usage** | [**AIMessageUsage**](AIMessageUsage) |  |  |
|**elapsedMs** | **Long** |  |  |
|**message** | [**AIMessageReference**](AIMessageReference) |  |  [optional] |
|**email** | [**Email**](Email) |  |  [optional] |
|**sms** | [**SmsDto**](SmsDto) |  |  [optional] |
|**match** | [**AIMessageMatchResult**](AIMessageMatchResult) |  |  [optional] |
|**assertionStatus** | [**AssertionStatusEnum**](#AssertionStatusEnum) |  |  [optional] |
|**assertions** | [**List&lt;AIMessageAssertionResult&gt;**](AIMessageAssertionResult) |  |  |
|**data** | **Object** | Extracted JSON value conforming to the requested schema or extraction preset. Null when extraction is inconclusive or unavailable. |  [optional] |
|**extractionEvidence** | **Map&lt;String, List&lt;AIMessageEvidence&gt;&gt;** |  |  |
|**candidates** | [**List&lt;AIMessageCandidateResult&gt;**](AIMessageCandidateResult) |  |  |
|**extractionReason** | **String** | Explanation when extraction is inconclusive. May contain a model-reported explanation of missing or ambiguous fields, or a server evidence-validation failure. Diagnostic text, not a stable machine-readable status. |  [optional] |
|**successful** | **Boolean** | True only when all requested work succeeded. Assert this in tests and use summary as the assertion failure message. |  [readonly] |
|**failedAssertionIds** | **List&lt;String&gt;** |  |  [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MATCHED | &quot;MATCHED&quot; |
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| EXTRACTED | &quot;EXTRACTED&quot; |
| INCONCLUSIVE | &quot;INCONCLUSIVE&quot; |
| TIMED_OUT | &quot;TIMED_OUT&quot; |
| TOKEN_LIMIT | &quot;TOKEN_LIMIT&quot; |
| CANDIDATE_LIMIT | &quot;CANDIDATE_LIMIT&quot; |
| PROVIDER_ERROR | &quot;PROVIDER_ERROR&quot; |
| PROVIDER_TIMEOUT | &quot;PROVIDER_TIMEOUT&quot; |
| INVALID_OUTPUT | &quot;INVALID_OUTPUT&quot; |



## Enum: AssertionStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| INCONCLUSIVE | &quot;INCONCLUSIVE&quot; |



