

# InboxPlacementAnalysisItemDto

A single setup or content analysis insight for an inbox placement run

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status for a setup or content analysis item |  |
|**title** | **String** |  |  |
|**message** | **String** |  |  |
|**meta** | **Map&lt;String, String&gt;** |  |  |
|**actionLabel** | **String** |  |  [optional] |
|**actionUrl** | **String** |  |  [optional] |
|**detailTable** | [**InboxPlacementAnalysisDetailTableDto**](InboxPlacementAnalysisDetailTableDto) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| WARN | &quot;WARN&quot; |
| FAIL | &quot;FAIL&quot; |
| INFO | &quot;INFO&quot; |



