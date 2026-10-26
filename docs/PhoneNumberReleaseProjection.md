

# PhoneNumberReleaseProjection

Released phone number projection

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**subscriptionSchedule** | [**SubscriptionScheduleEnum**](#SubscriptionScheduleEnum) |  |  [optional] |
|**planCurrency** | [**PlanCurrencyEnum**](#PlanCurrencyEnum) |  |  [optional] |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  |  |
|**phoneNumber** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: SubscriptionScheduleEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| YEARLY | &quot;YEARLY&quot; |



## Enum: PlanCurrencyEnum

| Name | Value |
|---- | -----|
| EUR | &quot;EUR&quot; |
| USD | &quot;USD&quot; |
| JPY | &quot;JPY&quot; |
| GBP | &quot;GBP&quot; |
| AUD | &quot;AUD&quot; |
| CAD | &quot;CAD&quot; |
| CHF | &quot;CHF&quot; |
| CNY | &quot;CNY&quot; |
| INR | &quot;INR&quot; |
| NZD | &quot;NZD&quot; |



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
| CH | &quot;CH&quot; |
| PT | &quot;PT&quot; |
| NL | &quot;NL&quot; |
| IL | &quot;IL&quot; |
| FI | &quot;FI&quot; |
| SE | &quot;SE&quot; |



