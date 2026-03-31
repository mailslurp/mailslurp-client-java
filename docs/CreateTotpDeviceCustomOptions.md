

# CreateTotpDeviceCustomOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**secret** | **String** | The base32 encoded secret provided by the identity provider for the TOTP device. |  |
|**name** | **String** | Name for labeling the TOTP device |  [optional] |
|**username** | **String** | Optional username for the TOTP device |  [optional] |
|**issuer** | **String** | Optional issuer override for the TOTP device |  [optional] |
|**digits** | **Integer** | Optional number of digits in TOTP code |  [optional] |
|**period** | **Integer** | Optional period in seconds for TOTP code expiration |  [optional] |
|**algorithm** | **String** | Optional algorithm override |  [optional] |



