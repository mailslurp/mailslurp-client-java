

# CreatePublicDeviceRenderTestOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**captchaToken** | **String** | Optional captcha token when captcha protection is enabled. |  [optional] |
|**target** | **String** | One exact device preview target key. Omit only for backwards compatibility; the service still chooses one target. |  [optional] |
|**previewMode** | [**PreviewModeEnum**](#PreviewModeEnum) | Public preview workflow to create. |  |



## Enum: PreviewModeEnum

| Name | Value |
|---- | -----|
| DEVICE_RENDER | &quot;DEVICE_RENDER&quot; |
| LIGHT_DARK | &quot;LIGHT_DARK&quot; |



