

# InboxRetentionPolicyDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**domainId** | **UUID** |  |  [optional] |
|**retentionDays** | **Integer** |  |  |
|**enabled** | **Boolean** |  |  |
|**excludedInboxIds** | **List&lt;UUID&gt;** |  |  |
|**excludedDomainIds** | **List&lt;UUID&gt;** |  |  |
|**excludedInboxEmailAddressPatterns** | **List&lt;String&gt;** |  |  |
|**excludedDomainNamePatterns** | **List&lt;String&gt;** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| ACCOUNT | &quot;ACCOUNT&quot; |
| INBOX | &quot;INBOX&quot; |
| DOMAIN | &quot;DOMAIN&quot; |



