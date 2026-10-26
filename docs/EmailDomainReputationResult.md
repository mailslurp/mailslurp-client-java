

# EmailDomainReputationResult

Reputation-oriented result for an email identity or sending domain.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**input** | **String** |  |  |
|**normalizedTarget** | **String** |  |  |
|**emailAddress** | **String** |  |  [optional] |
|**domain** | **String** |  |  [optional] |
|**ipAddress** | **String** |  |  [optional] |
|**mxHost** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**listed** | **Boolean** |  |  |
|**blacklist** | [**CheckEmailBlacklistResults**](CheckEmailBlacklistResults) |  |  [optional] |
|**insights** | **List&lt;String&gt;** |  |  |
|**warnings** | **List&lt;String&gt;** |  |  |
|**errors** | **List&lt;String&gt;** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| DEGRADED | &quot;DEGRADED&quot; |
| CRITICAL | &quot;CRITICAL&quot; |
| FAILED | &quot;FAILED&quot; |



