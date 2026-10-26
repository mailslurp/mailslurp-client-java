

# AIMessagesResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evaluationId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**results** | [**List&lt;AIMessageExpectationResult&gt;**](AIMessageExpectationResult) |  |  |
|**usage** | [**AIMessageUsage**](AIMessageUsage) |  |  |
|**elapsedMs** | **Long** |  |  |
|**summary** | **String** |  |  [readonly] |
|**successful** | **Boolean** |  |  [readonly] |
|**unsatisfiedExpectationIds** | **List&lt;String&gt;** |  |  [readonly] |



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



