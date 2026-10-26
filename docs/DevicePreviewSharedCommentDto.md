

# DevicePreviewSharedCommentDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commentId** | **UUID** |  |  |
|**targetId** | **UUID** |  |  [optional] |
|**screenshotId** | **UUID** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**authorLabel** | **String** |  |  [optional] |
|**targetLabel** | **String** |  |  [optional] |
|**comment** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| ACKNOWLEDGED | &quot;ACKNOWLEDGED&quot; |
| RESOLVED | &quot;RESOLVED&quot; |
| DISMISSED | &quot;DISMISSED&quot; |



