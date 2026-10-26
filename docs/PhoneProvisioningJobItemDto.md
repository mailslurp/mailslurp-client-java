

# PhoneProvisioningJobItemDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**phoneNumber** | **String** |  |  |
|**providerLabel** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**lineType** | **String** |  |  [optional] |
|**carrierName** | **String** |  |  [optional] |
|**mobileCountryCode** | **String** |  |  [optional] |
|**mobileNetworkCode** | **String** |  |  [optional] |
|**phoneNumberId** | **UUID** |  |  [optional] |
|**failureMessage** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| PROVISIONING | &quot;PROVISIONING&quot; |
| PROVISIONED | &quot;PROVISIONED&quot; |
| UNAVAILABLE | &quot;UNAVAILABLE&quot; |
| FAILED | &quot;FAILED&quot; |



