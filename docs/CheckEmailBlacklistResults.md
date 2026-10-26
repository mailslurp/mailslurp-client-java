

# CheckEmailBlacklistResults

Public blacklist lookup results for a domain or IP address

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** |  |  [optional] |
|**requestedIpAddress** | **String** |  |  [optional] |
|**requestedMxHost** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**listed** | **Boolean** |  |  |
|**checkedIpAddresses** | [**List&lt;EmailBlacklistIpResult&gt;**](EmailBlacklistIpResult) |  |  |
|**checkedZoneCount** | **Integer** |  |  |
|**totalListings** | **Integer** |  |  |
|**warnings** | **List&lt;String&gt;** |  |  |
|**errors** | **List&lt;String&gt;** |  |  |
|**checkStatus** | [**CheckStatusEnum**](#CheckStatusEnum) |  |  |
|**checkedDomains** | [**List&lt;EmailBlacklistDomainResult&gt;**](EmailBlacklistDomainResult) |  |  |
|**checkedAt** | **OffsetDateTime** |  |  |
|**evidenceVersion** | **String** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| DEGRADED | &quot;DEGRADED&quot; |
| CRITICAL | &quot;CRITICAL&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: CheckStatusEnum

| Name | Value |
|---- | -----|
| LISTED | &quot;LISTED&quot; |
| NOT_LISTED | &quot;NOT_LISTED&quot; |
| ERROR | &quot;ERROR&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



