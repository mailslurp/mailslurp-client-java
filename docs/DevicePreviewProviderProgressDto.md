

# DevicePreviewProviderProgressDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**run** | [**DevicePreviewRunDto**](DevicePreviewRunDto) |  |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**targetCount** | **Long** |  |  |
|**readyCount** | **Long** |  |  |
|**failedCount** | **Long** |  |  |
|**capturingCount** | **Long** |  |  |
|**pendingCount** | **Long** |  |  |
|**targets** | [**List&lt;DevicePreviewTargetDto&gt;**](DevicePreviewTargetDto) |  |  |
|**screenshots** | [**List&lt;DevicePreviewScreenshotDto&gt;**](DevicePreviewScreenshotDto) |  |  |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| GMAIL | &quot;GMAIL&quot; |
| OUTLOOK | &quot;OUTLOOK&quot; |
| YAHOO | &quot;YAHOO&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CAPTURING | &quot;CAPTURING&quot; |
| PARTIAL_COMPLETE | &quot;PARTIAL_COMPLETE&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |



