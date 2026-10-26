

# DevicePreviewIngestAddressDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **UUID** |  |  |
|**emailAddress** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**runId** | **UUID** |  |  [optional] |
|**sourceFrom** | **String** |  |  [optional] |
|**sourceTo** | **List&lt;String&gt;** |  |  [optional] |
|**sourceSubject** | **String** |  |  [optional] |
|**sourceMessageId** | **String** |  |  [optional] |
|**sourceSizeBytes** | **Long** |  |  [optional] |
|**latestError** | **String** |  |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| WAITING_FOR_EMAIL | &quot;WAITING_FOR_EMAIL&quot; |
| RUN_CREATED | &quot;RUN_CREATED&quot; |
| EXPIRED | &quot;EXPIRED&quot; |
| FAILED | &quot;FAILED&quot; |



