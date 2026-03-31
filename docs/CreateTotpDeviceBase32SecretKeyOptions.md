

# CreateTotpDeviceBase32SecretKeyOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**base32SecretKey** | **String** | Base32 secret key for TOTP device as alternative to OTP Auth URI or QR code. |  |
|**name** | **String** | Name for labeling the TOTP device |  [optional] |
|**username** | **String** | Optional username for the TOTP device |  [optional] |
|**issuer** | **String** | Optional issuer override for the TOTP device |  [optional] |
|**digits** | **Integer** | Optional number of digits in TOTP code |  [optional] |
|**period** | **Integer** | Optional period in seconds for TOTP code expiration |  [optional] |
|**algorithm** | **String** | Optional algorithm override |  [optional] |



