

# PhoneSmsPrepaidCreditDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) | Null means the balance is global for the account rather than country-specific. |  [optional] |
|**global** | **Boolean** |  |  |
|**remainingCredits** | **Long** |  |  |
|**initialCredits** | **Long** |  |  |
|**sentMultiplier** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



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



