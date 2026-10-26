

# DevicePreviewShareLinkDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**runId** | **UUID** |  |  |
|**tokenPrefix** | **String** |  |  |
|**token** | **String** | Raw share token. Only returned immediately after creation. |  [optional] |
|**shareUrl** | **String** | Public share URL with social preview metadata. Only returned when the raw token is available. |  [optional] |
|**label** | **String** |  |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  [optional] |
|**revokedAt** | **OffsetDateTime** |  |  [optional] |
|**lastAccessedAt** | **OffsetDateTime** |  |  [optional] |
|**accessCount** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



