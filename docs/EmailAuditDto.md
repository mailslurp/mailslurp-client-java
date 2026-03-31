

# EmailAuditDto

Persisted email audit result

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**emailId** | **UUID** |  |  [optional] |
|**fromAddress** | **String** |  |  [optional] |
|**recipient** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**analysis** | [**EmailAuditAnalysisResult**](EmailAuditAnalysisResult) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



