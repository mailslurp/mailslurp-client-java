

# EmailPreviewHtmlDto

Deprecated server-normalized HTML representation. It can alter malformed email layout and should not be used for fidelity-sensitive rendering.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** | Email subject when available |  [optional] |
|**html** | **String** | Server-normalized preview HTML with active content removed |  |
|**linkBehavior** | [**LinkBehaviorEnum**](#LinkBehaviorEnum) | Controls navigation for links in hardened email HTML previews. Original email HTML endpoints are unaffected. |  |



## Enum: LinkBehaviorEnum

| Name | Value |
|---- | -----|
| PRESERVE | &quot;PRESERVE&quot; |
| NEW_TAB | &quot;NEW_TAB&quot; |
| DISABLED | &quot;DISABLED&quot; |



