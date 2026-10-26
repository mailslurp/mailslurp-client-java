

# AIMessageAIOptions

AI evaluator and execution limits. Tokens are weighted AI allowance units, shared across all candidates and expectations in a request. Confidence is model-reported, not a calibrated probability.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | [**ModelEnum**](#ModelEnum) |  |  |
|**maxTokens** | **Long** |  |  |
|**maxCandidates** | **Integer** |  |  |
|**maxOutputTokens** | **Integer** |  |  |
|**minimumConfidence** | **Double** | Optional advanced abstention threshold for model-reported confidence. Below it the decision is INCONCLUSIVE. It does not guarantee accuracy or cause reevaluation. |  [optional] |



## Enum: ModelEnum

| Name | Value |
|---- | -----|
| BALANCED_V1 | &quot;BALANCED_V1&quot; |
| FLASH_LATEST | &quot;FLASH_LATEST&quot; |
| QUALITY_V1 | &quot;QUALITY_V1&quot; |



