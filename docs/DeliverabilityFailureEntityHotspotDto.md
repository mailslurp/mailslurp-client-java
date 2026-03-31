

# DeliverabilityFailureEntityHotspotDto

Most common failing entity across deliverability runs

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityId** | **UUID** |  |  |
|**entityLabel** | **String** |  |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  |  [optional] |
|**phoneVariant** | [**PhoneVariantEnum**](#PhoneVariantEnum) |  |  [optional] |
|**failedRunCount** | **Long** |  |  |
|**totalRunCount** | **Long** |  |  |
|**failureRatePercentage** | **Double** |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



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



