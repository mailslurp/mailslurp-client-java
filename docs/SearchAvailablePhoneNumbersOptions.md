

# SearchAvailablePhoneNumbersOptions

Search criteria for advanced phone provisioning

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  |  |
|**phoneVariant** | [**PhoneVariantEnum**](#PhoneVariantEnum) |  |  [optional] |
|**qualityFilter** | [**QualityFilterEnum**](#QualityFilterEnum) | Quality filter for advanced phone provisioning search |  [optional] |
|**lineType** | **String** |  |  [optional] |
|**carrierName** | **String** |  |  [optional] |
|**mobileCountryCode** | **String** |  |  [optional] |
|**mobileNetworkCode** | **String** |  |  [optional] |
|**providerLabels** | **List&lt;String&gt;** |  |  [optional] |
|**limit** | **Integer** |  |  [optional] |



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



## Enum: QualityFilterEnum

| Name | Value |
|---- | -----|
| OTP | &quot;OTP&quot; |
| NON_VOIP | &quot;NON_VOIP&quot; |
| MOBILE_ONLY | &quot;MOBILE_ONLY&quot; |
| ANY | &quot;ANY&quot; |



