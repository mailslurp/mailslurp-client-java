

# CreateInboxRetentionPolicyOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**retentionDays** | **Integer** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**domainId** | **UUID** |  |  [optional] |
|**enabled** | **Boolean** |  |  |
|**excludedInboxIds** | **List&lt;UUID&gt;** |  |  |
|**excludedDomainIds** | **List&lt;UUID&gt;** |  |  |
|**excludedInboxEmailAddressPatterns** | **List&lt;String&gt;** |  |  |
|**excludedDomainNamePatterns** | **List&lt;String&gt;** |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |
| INBOX | &quot;INBOX&quot; |
| DOMAIN | &quot;DOMAIN&quot; |



