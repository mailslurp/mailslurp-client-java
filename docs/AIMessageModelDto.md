

# AIMessageModelDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | [**ModelEnum**](#ModelEnum) |  |  |
|**providerModel** | **String** |  |  |
|**evaluatorVersion** | **String** |  |  |
|**movingAlias** | **Boolean** |  |  |
|**tokenMultiplier** | **Double** |  |  |
|**supportedMessageTypes** | [**List&lt;SupportedMessageTypesEnum&gt;**](#List&lt;SupportedMessageTypesEnum&gt;) |  |  |
|**pricingVersion** | **String** |  |  |



## Enum: ModelEnum

| Name | Value |
|---- | -----|
| BALANCED_V1 | &quot;BALANCED_V1&quot; |
| FLASH_LATEST | &quot;FLASH_LATEST&quot; |
| QUALITY_V1 | &quot;QUALITY_V1&quot; |



## Enum: List&lt;SupportedMessageTypesEnum&gt;

| Name | Value |
|---- | -----|
| EMAIL | &quot;EMAIL&quot; |
| SMS | &quot;SMS&quot; |



