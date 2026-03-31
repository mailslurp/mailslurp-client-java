

# CheckEmailAuthStackResults

Combined authentication and deliverability DNS results for a domain

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**healthScore** | **Integer** |  |  |
|**totalChecks** | **Integer** |  |  |
|**passingChecks** | **Integer** |  |  |
|**failingChecks** | **Integer** |  |  |
|**spf** | [**LookupSpfDomainResults**](LookupSpfDomainResults) |  |  |
|**dmarc** | [**LookupDmarcDomainResults**](LookupDmarcDomainResults) |  |  |
|**dkim** | [**LookupDkimDomainResults**](LookupDkimDomainResults) |  |  |
|**bimi** | [**LookupBimiDomainResults**](LookupBimiDomainResults) |  |  |
|**mx** | [**LookupMxRecordsResults**](LookupMxRecordsResults) |  |  |
|**mtaSts** | [**LookupMtaStsDomainResults**](LookupMtaStsDomainResults) |  |  |
|**tlsReporting** | [**LookupTlsReportingDomainResults**](LookupTlsReportingDomainResults) |  |  |
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



