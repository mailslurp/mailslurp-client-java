

# PublicDeviceRenderTestDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**emailAddress** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**expiresAt** | **OffsetDateTime** |  |  |
|**target** | **String** |  |  |
|**previewMode** | [**PreviewModeEnum**](#PreviewModeEnum) |  |  |
|**sourceFrom** | **String** |  |  [optional] |
|**sourceSubject** | **String** |  |  [optional] |
|**senderDomain** | **String** |  |  [optional] |
|**runId** | **UUID** |  |  [optional] |
|**shareUrl** | **String** |  |  [optional] |
|**redirectUrl** | **String** |  |  [optional] |
|**freeLimitReached** | **Boolean** |  |  |
|**failureCode** | **String** |  |  [optional] |
|**failureMessage** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING_FOR_EMAIL | &quot;WAITING_FOR_EMAIL&quot; |
| RECEIVED | &quot;RECEIVED&quot; |
| PROCESSING | &quot;PROCESSING&quot; |
| RUN_CREATED | &quot;RUN_CREATED&quot; |
| RATE_LIMITED | &quot;RATE_LIMITED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| FAILED | &quot;FAILED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



## Enum: PreviewModeEnum

| Name | Value |
|---- | -----|
| DEVICE_RENDER | &quot;DEVICE_RENDER&quot; |
| LIGHT_DARK | &quot;LIGHT_DARK&quot; |



