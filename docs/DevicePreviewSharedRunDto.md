

# DevicePreviewSharedRunDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runId** | **UUID** |  |  |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**sourceAlias** | **String** |  |  [optional] |
|**sourceSubject** | **String** |  |  [optional] |
|**sourceFrom** | **String** |  |  [optional] |
|**sourceTo** | **List&lt;String&gt;** |  |  [optional] |
|**sourceRecipientEmailAddress** | **String** |  |  [optional] |
|**sourceRecipientLocalPart** | **String** |  |  [optional] |
|**sourceProfileLocalPart** | **String** |  |  [optional] |
|**sourceProfileDisplayName** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**primaryScreenshotId** | **UUID** |  |  [optional] |
|**targetCount** | **Long** |  |  |
|**screenshotCount** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| STORED_EMAIL | &quot;STORED_EMAIL&quot; |
| RAW_UPLOAD | &quot;RAW_UPLOAD&quot; |
| DEVICE_PREVIEW_INGEST | &quot;DEVICE_PREVIEW_INGEST&quot; |
| PUBLIC_FREE_TEST | &quot;PUBLIC_FREE_TEST&quot; |
| GUIDED_TOUR | &quot;GUIDED_TOUR&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| AWAITING_ARRIVAL | &quot;AWAITING_ARRIVAL&quot; |
| CAPTURING | &quot;CAPTURING&quot; |
| PARTIAL_COMPLETE | &quot;PARTIAL_COMPLETE&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |



