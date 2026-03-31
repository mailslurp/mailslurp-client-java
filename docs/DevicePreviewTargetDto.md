

# DevicePreviewTargetDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**runId** | **UUID** |  |  |
|**provider** | **String** |  |  [optional] |
|**clientProfile** | **String** |  |  [optional] |
|**deviceType** | **String** |  |  [optional] |
|**browserFamily** | **String** |  |  [optional] |
|**platform** | **String** |  |  [optional] |
|**colorScheme** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |
|**primaryScreenshotId** | **UUID** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING | &quot;WAITING&quot; |
| READY_TO_CAPTURE | &quot;READY_TO_CAPTURE&quot; |
| CAPTURING | &quot;CAPTURING&quot; |
| READY | &quot;READY&quot; |
| FAILED | &quot;FAILED&quot; |
| NEEDS_INTERVENTION | &quot;NEEDS_INTERVENTION&quot; |



