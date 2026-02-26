

# ExportTransformerOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiTransformId** | **UUID** |  |  [optional] |
|**aiMappingId** | **UUID** |  |  [optional] |
|**flattenArrays** | **Boolean** |  |  |
|**since** | **OffsetDateTime** |  |  [optional] |
|**before** | **OffsetDateTime** |  |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**phoneId** | **UUID** |  |  [optional] |
|**emailId** | **UUID** |  |  [optional] |
|**smsId** | **UUID** |  |  [optional] |
|**attachmentId** | **String** |  |  [optional] |
|**includeMetaData** | **Boolean** |  |  |
|**delimiter** | **String** |  |  [optional] |
|**arraySeparator** | **String** |  |  [optional] |
|**includeMetaDataColumns** | **List&lt;String&gt;** |  |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;CSV&quot; |
| EXCEL | &quot;EXCEL&quot; |
| XML | &quot;XML&quot; |
| JSON | &quot;JSON&quot; |



