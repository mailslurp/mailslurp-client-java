

# InboxPlacementDomainMonitorSummaryDto

Domain-monitor style sender-domain summary for an inbox placement run

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**state** | [**StateEnum**](#StateEnum) | Sender-domain monitor state derived while analyzing an inbox placement run |  |
|**domain** | **String** |  |  [optional] |
|**providerManaged** | **Boolean** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) | Source for an inbox-placement domain monitor summary |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**healthScore** | **Integer** |  |  [optional] |
|**totalChecks** | **Integer** |  |  [optional] |
|**passingChecks** | **Integer** |  |  [optional] |
|**failingChecks** | **Integer** |  |  [optional] |
|**spfOk** | **Boolean** |  |  [optional] |
|**dmarcOk** | **Boolean** |  |  [optional] |
|**dmarcEnforced** | **Boolean** |  |  [optional] |
|**mxOk** | **Boolean** |  |  [optional] |
|**dkimOk** | **Boolean** |  |  [optional] |
|**bimiOk** | **Boolean** |  |  [optional] |
|**mtaStsOk** | **Boolean** |  |  [optional] |
|**tlsReportingOk** | **Boolean** |  |  [optional] |
|**blacklistChecked** | **Boolean** |  |  |
|**blacklistOk** | **Boolean** |  |  |
|**blacklistListed** | **Boolean** |  |  |
|**blacklistStatus** | [**BlacklistStatusEnum**](#BlacklistStatusEnum) |  |  |
|**observedSendingIp** | **String** |  |  [optional] |
|**scoreVersion** | **String** |  |  |
|**scoreScope** | **String** |  |  |
|**insights** | **List&lt;String&gt;** |  |  |
|**errorMessage** | **String** |  |  [optional] |
|**monitorId** | **UUID** |  |  [optional] |
|**runId** | **UUID** |  |  [optional] |
|**checkedAt** | **OffsetDateTime** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| QUICK_CHECK_READY | &quot;QUICK_CHECK_READY&quot; |
| PROVIDER_MANAGED | &quot;PROVIDER_MANAGED&quot; |
| ERROR | &quot;ERROR&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| QUICK_CHECK | &quot;QUICK_CHECK&quot; |
| OBSERVED_MESSAGE | &quot;OBSERVED_MESSAGE&quot; |
| PERSISTENT_MONITOR | &quot;PERSISTENT_MONITOR&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| DEGRADED | &quot;DEGRADED&quot; |
| CRITICAL | &quot;CRITICAL&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: BlacklistStatusEnum

| Name | Value |
|---- | -----|
| LISTED | &quot;LISTED&quot; |
| NOT_LISTED | &quot;NOT_LISTED&quot; |
| ERROR | &quot;ERROR&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



