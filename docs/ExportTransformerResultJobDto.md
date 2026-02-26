

# ExportTransformerResultJobDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**format** | [**FormatEnum**](#FormatEnum) |  |  |
|**fileName** | **String** |  |  [optional] |
|**downloadUrl** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| ERROR | &quot;ERROR&quot; |
| SUCCESS | &quot;SUCCESS&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;CSV&quot; |
| EXCEL | &quot;EXCEL&quot; |
| XML | &quot;XML&quot; |
| JSON | &quot;JSON&quot; |



