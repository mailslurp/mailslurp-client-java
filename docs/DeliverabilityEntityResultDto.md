

# DeliverabilityEntityResultDto

Entity-level deliverability result

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **UUID** |  |  |
|**entityLabel** | **String** |  |  |
|**matched** | **Boolean** |  |  |
|**matchedExpectationCount** | **Integer** |  |  |
|**totalExpectationCount** | **Integer** |  |  |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  |  [optional] |
|**phoneVariant** | [**PhoneVariantEnum**](#PhoneVariantEnum) |  |  [optional] |
|**evaluatedAt** | **OffsetDateTime** |  |  [optional] |
|**expectationResults** | [**List&lt;DeliverabilityExpectationResultDto&gt;**](DeliverabilityExpectationResultDto) |  |  |



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



