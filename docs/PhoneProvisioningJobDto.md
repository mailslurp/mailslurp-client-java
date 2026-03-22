

# PhoneProvisioningJobDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  |  |
|**phoneVariant** | [**PhoneVariantEnum**](#PhoneVariantEnum) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**requestedCount** | **Integer** |  |  |
|**attemptedCount** | **Integer** |  |  |
|**succeededCount** | **Integer** |  |  |
|**failedCount** | **Integer** |  |  |
|**unavailableCount** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**items** | [**List&lt;PhoneProvisioningJobItemDto&gt;**](PhoneProvisioningJobItemDto) |  |  |



## Enum: PhoneCountryEnum

| Name | Value |
|---- | -----|
| US | &quot;US&quot; |
| GB | &quot;GB&quot; |
| AU | &quot;AU&quot; |
| CA | &quot;CA&quot; |
| EE | &quot;EE&quot; |
| HK | &quot;HK&quot; |
| PL | &quot;PL&quot; |
| PT | &quot;PT&quot; |
| NL | &quot;NL&quot; |
| IL | &quot;IL&quot; |
| FI | &quot;FI&quot; |
| SE | &quot;SE&quot; |



## Enum: PhoneVariantEnum

| Name | Value |
|---- | -----|
| LOCAL | &quot;LOCAL&quot; |
| MOBILE | &quot;MOBILE&quot; |
| TOLL_FREE | &quot;TOLL_FREE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| FAILED | &quot;FAILED&quot; |



