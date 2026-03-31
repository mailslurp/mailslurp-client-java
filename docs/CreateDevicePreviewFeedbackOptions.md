

# CreateDevicePreviewFeedbackOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**category** | [**CategoryEnum**](#CategoryEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**rating** | **Integer** |  |  [optional] |
|**runId** | **UUID** |  |  [optional] |
|**targetId** | **UUID** |  |  [optional] |
|**screenshotId** | **UUID** |  |  [optional] |
|**provider** | [**ProviderEnum**](#ProviderEnum) |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**comment** | **String** |  |  [optional] |
|**internalNote** | **String** |  |  [optional] |
|**sessionId** | **String** |  |  [optional] |
|**liveViewUrl** | **String** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| API_SERVICE | &quot;API_SERVICE&quot; |
| LAB_USER | &quot;LAB_USER&quot; |
| END_USER | &quot;END_USER&quot; |
| SYSTEM | &quot;SYSTEM&quot; |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| GENERAL | &quot;GENERAL&quot; |
| RUN_QUALITY | &quot;RUN_QUALITY&quot; |
| SCREENSHOT_QUALITY | &quot;SCREENSHOT_QUALITY&quot; |
| PROVIDER_ISSUE | &quot;PROVIDER_ISSUE&quot; |
| BUG_REPORT | &quot;BUG_REPORT&quot; |
| FEATURE_REQUEST | &quot;FEATURE_REQUEST&quot; |
| NOTE | &quot;NOTE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| ACKNOWLEDGED | &quot;ACKNOWLEDGED&quot; |
| RESOLVED | &quot;RESOLVED&quot; |
| DISMISSED | &quot;DISMISSED&quot; |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| GMAIL | &quot;GMAIL&quot; |
| OUTLOOK | &quot;OUTLOOK&quot; |
| YAHOO | &quot;YAHOO&quot; |



