

# GenerateSpfRecordOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | Domain the SPF record applies to |  |
|**includeDomains** | **List&lt;String&gt;** | Optional include domains |  [optional] |
|**ip4** | **List&lt;String&gt;** | Optional IPv4 CIDRs or hosts |  [optional] |
|**ip6** | **List&lt;String&gt;** | Optional IPv6 CIDRs or hosts |  [optional] |
|**mx** | **Boolean** | Whether to include the MX mechanism |  |
|**a** | **Boolean** | Whether to include the A mechanism |  |
|**allPolicy** | [**AllPolicyEnum**](#AllPolicyEnum) |  |  |



## Enum: AllPolicyEnum

| Name | Value |
|---- | -----|
| FAIL | &quot;FAIL&quot; |
| SOFTFAIL | &quot;SOFTFAIL&quot; |
| NEUTRAL | &quot;NEUTRAL&quot; |



