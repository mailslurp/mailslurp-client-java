

# PhoneNumberDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**name** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**userId** | **UUID** |  |  |
|**complianceAddress** | **UUID** |  |  [optional] |
|**emergencyAddress** | **UUID** |  |  [optional] |
|**phoneNumber** | **String** |  |  |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  |  |
|**phonePlan** | **UUID** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**favourite** | **Boolean** |  |  |
|**phoneVariant** | [**PhoneVariantEnum**](#PhoneVariantEnum) |  |  [optional] |



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



