

# AIMessageMatchResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**reason** | **String** |  |  |
|**evidence** | [**List&lt;AIMessageEvidence&gt;**](AIMessageEvidence) |  |  |
|**confidence** | [**AIMessageConfidence**](AIMessageConfidence) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MATCH | &quot;MATCH&quot; |
| NO_MATCH | &quot;NO_MATCH&quot; |
| INCONCLUSIVE | &quot;INCONCLUSIVE&quot; |



