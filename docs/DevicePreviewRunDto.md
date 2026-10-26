

# DevicePreviewRunDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runId** | **UUID** |  |  |
|**emailId** | **UUID** |  |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**sourceInboxId** | **UUID** |  |  [optional] |
|**sourceAlias** | **String** |  |  [optional] |
|**sourceExternalId** | **String** |  |  [optional] |
|**sourceFrom** | **String** |  |  [optional] |
|**sourceTo** | **List&lt;String&gt;** |  |  [optional] |
|**sourceSubject** | **String** |  |  [optional] |
|**sourceMessageId** | **String** |  |  [optional] |
|**sourceSizeBytes** | **Long** |  |  [optional] |
|**sourceStorageProvider** | **String** |  |  [optional] |
|**sourceStorageBucket** | **String** |  |  [optional] |
|**sourceStorageObjectKey** | **String** |  |  [optional] |
|**sourceStorageRegion** | **String** |  |  [optional] |
|**sourceStorageEndpoint** | **String** |  |  [optional] |
|**sourceStoragePublicBaseUrl** | **String** |  |  [optional] |
|**sourceRecipientEmailAddress** | **String** |  |  [optional] |
|**sourceRecipientLocalPart** | **String** |  |  [optional] |
|**sourceIngestDomainId** | **UUID** |  |  [optional] |
|**sourceProfileId** | **UUID** |  |  [optional] |
|**sourceProfileLocalPart** | **String** |  |  [optional] |
|**sourceProfileDisplayName** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**primaryScreenshotId** | **UUID** |  |  [optional] |
|**requestedProviders** | **List&lt;String&gt;** |  |  [optional] |
|**importedProviders** | **List&lt;String&gt;** |  |  [optional] |
|**warnings** | **List&lt;String&gt;** |  |  [optional] |
|**providerMessageIds** | **Map&lt;String, String&gt;** |  |  [optional] |
|**latestError** | **String** | Latest run-level error, if the preview run was blocked or failed after creation. |  [optional] |
|**targetCount** | **Long** |  |  |
|**screenshotCount** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**thumbnail** | [**DevicePreviewRunThumbnailDto**](DevicePreviewRunThumbnailDto) |  |  [optional] |
|**qaBundle** | [**DevicePreviewQaBundleDto**](DevicePreviewQaBundleDto) |  |  [optional] |
|**folderId** | **UUID** |  |  [optional] |



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



