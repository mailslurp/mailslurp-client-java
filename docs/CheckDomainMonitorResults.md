

# CheckDomainMonitorResults

One-shot public domain monitor check results

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**healthScore** | **Integer** |  |  |
|**totalChecks** | **Integer** |  |  |
|**passingChecks** | **Integer** |  |  |
|**failingChecks** | **Integer** |  |  |
|**spfOk** | **Boolean** |  |  |
|**dmarcOk** | **Boolean** |  |  |
|**dmarcEnforced** | **Boolean** |  |  |
|**mxOk** | **Boolean** |  |  |
|**insights** | **List&lt;String&gt;** |  |  |
|**errorMessage** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| DEGRADED | &quot;DEGRADED&quot; |
| CRITICAL | &quot;CRITICAL&quot; |
| FAILED | &quot;FAILED&quot; |



