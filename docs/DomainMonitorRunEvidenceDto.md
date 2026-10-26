

# DomainMonitorRunEvidenceDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scoreVersion** | **String** |  |  |
|**scoreScope** | [**ScoreScopeEnum**](#ScoreScopeEnum) |  |  |
|**observedMessageReceivedAt** | **OffsetDateTime** |  |  [optional] |
|**outboundIp** | **String** |  |  [optional] |
|**outboundIpSource** | **String** |  |  [optional] |
|**observedDkimSelector** | **String** |  |  [optional] |
|**observedSpfStatus** | [**ObservedSpfStatusEnum**](#ObservedSpfStatusEnum) |  |  [optional] |
|**observedDkimStatus** | [**ObservedDkimStatusEnum**](#ObservedDkimStatusEnum) |  |  [optional] |
|**observedDmarcStatus** | [**ObservedDmarcStatusEnum**](#ObservedDmarcStatusEnum) |  |  [optional] |
|**blacklist** | [**CheckEmailBlacklistResults**](CheckEmailBlacklistResults) |  |  [optional] |



## Enum: ScoreScopeEnum

| Name | Value |
|---- | -----|
| CONFIGURATION_POSTURE | &quot;CONFIGURATION_POSTURE&quot; |
| CONFIGURATION_AND_OBSERVED_MESSAGE | &quot;CONFIGURATION_AND_OBSERVED_MESSAGE&quot; |



## Enum: ObservedSpfStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| WARNING | &quot;WARNING&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



## Enum: ObservedDkimStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| WARNING | &quot;WARNING&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



## Enum: ObservedDmarcStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| WARNING | &quot;WARNING&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



