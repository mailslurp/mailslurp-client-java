

# AITransformResultDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**aiTransformId** | **UUID** |  |  |
|**aiTransformMappingId** | **UUID** |  |  [optional] |
|**value** | **Object** |  |  [optional] |
|**entityId** | **UUID** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional] |
|**columns** | **List&lt;String&gt;** |  |  |
|**emailId** | **UUID** |  |  [optional] |
|**smsId** | **UUID** |  |  [optional] |
|**attachmentId** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



