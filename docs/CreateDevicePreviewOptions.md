

# CreateDevicePreviewOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**providers** | [**List&lt;ProvidersEnum&gt;**](#List&lt;ProvidersEnum&gt;) | Optional providers to request for rendering. Defaults to ESP_DEFAULT_PROVIDERS when set, otherwise GMAIL and OUTLOOK. |  [optional] |
|**includeAllConfiguredProviders** | **Boolean** | Optional flag to request all configured providers in ESP. Defaults to false when omitted |  [optional] |



## Enum: List&lt;ProvidersEnum&gt;

| Name | Value |
|---- | -----|
| GMAIL | &quot;GMAIL&quot; |
| OUTLOOK | &quot;OUTLOOK&quot; |
| YAHOO | &quot;YAHOO&quot; |



