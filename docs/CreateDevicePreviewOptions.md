

# CreateDevicePreviewOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targets** | **List&lt;String&gt;** | Optional device preview target keys to request for rendering. Null leaves target selection to service configuration. Values are forwarded to ESP so newly deployed targets can be used before this API&#39;s enum list is updated. |  [optional] |
|**allTargets** | **Boolean** | When true, ask the renderer to include every currently configured target. Cannot be combined with targets. |  [optional] |
|**qa** | [**CreateDevicePreviewQaOptions**](CreateDevicePreviewQaOptions) |  |  [optional] |
|**folderId** | **UUID** | Optional folder for organizing the render. Missing folders leave the render unfiled. |  [optional] |



