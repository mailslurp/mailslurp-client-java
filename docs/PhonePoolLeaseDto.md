

# PhonePoolLeaseDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**poolId** | **UUID** |  |  |
|**phoneNumberId** | **UUID** |  |  |
|**phoneNumber** | **String** |  |  |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  |  |
|**phoneName** | **String** |  |  [optional] |
|**leaseName** | **String** |  |  [optional] |
|**leaseOwner** | **String** |  |  [optional] |
|**leasedAt** | **OffsetDateTime** |  |  |
|**expiresAt** | **OffsetDateTime** |  |  [optional] |



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



