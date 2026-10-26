

# AIMessageAssertionResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**reason** | **String** |  |  |
|**evidence** | [**List&lt;AIMessageEvidence&gt;**](AIMessageEvidence) |  |  |
|**confidence** | [**AIMessageConfidence**](AIMessageConfidence) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| INCONCLUSIVE | &quot;INCONCLUSIVE&quot; |



