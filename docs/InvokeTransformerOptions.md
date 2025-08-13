

# InvokeTransformerOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiTransformId** | **UUID** |  |  [optional] |
|**aiTransformMappingId** | **UUID** |  |  [optional] |
|**rawInput** | **String** |  |  [optional] |
|**entityId** | **String** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional] |
|**rawConditions** | **List&lt;String&gt;** |  |  [optional] |
|**rawInstructions** | **List&lt;String&gt;** |  |  [optional] |
|**rawOutputSchema** | [**StructuredOutputSchema**](StructuredOutputSchema) |  |  [optional] |
|**contentSelector** | [**ContentSelectorEnum**](#ContentSelectorEnum) |  |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;EMAIL&quot; |
| SMS | &quot;SMS&quot; |
| ATTACHMENT | &quot;ATTACHMENT&quot; |



## Enum: ContentSelectorEnum

| Name | Value |
|---- | -----|
| RAW | &quot;RAW&quot; |
| BODY | &quot;BODY&quot; |
| BODY_ATTACHMENTS | &quot;BODY_ATTACHMENTS&quot; |



