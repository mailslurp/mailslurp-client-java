

# DevicePreviewNativeTargetAvailabilityDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **String** |  |  |
|**baseTarget** | **String** |  |  |
|**provider** | **String** |  |  [optional] |
|**client** | **String** |  |  |
|**surface** | **String** |  |  |
|**platform** | **String** |  |  |
|**formFactor** | **String** |  |  |
|**engine** | **String** |  |  |
|**appearance** | **String** |  |  |
|**visible** | **Boolean** |  |  |
|**creditCost** | **Long** |  |  |
|**tier** | [**TierEnum**](#TierEnum) |  |  |
|**enabled** | **Boolean** |  |  |
|**requestQueueConfigured** | **Boolean** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**statusReason** | **String** |  |  [optional] |
|**healthyWorkers** | **Integer** |  |  |
|**recentWorkers** | **Integer** |  |  |
|**timeoutSeconds** | **Long** |  |  |
|**availableSlots** | **Integer** |  |  |
|**publicPollingWorkers** | **Integer** |  |  |
|**minimumWorkerReleaseVersion** | **String** |  |  [optional] |
|**desiredWorkerReleaseVersion** | **String** |  |  [optional] |
|**desiredReleaseWorkers** | **Integer** |  |  [optional] |
|**desiredReleasePublicPollingWorkers** | **Integer** |  |  [optional] |
|**releaseVersions** | **Map&lt;String, Integer&gt;** |  |  |
|**desiredLanes** | **Integer** |  |  |
|**matchedLiveLanes** | **Integer** |  |  |
|**identityMismatchLanes** | **Integer** |  |  |
|**servingLanes** | **Integer** |  |  |
|**spareLanes** | **Integer** |  |  |
|**busyLanes** | **Integer** |  |  |
|**degradedLanes** | **Integer** |  |  |
|**quarantinedLanes** | **Integer** |  |  |
|**zeroCapacityLanes** | **Integer** |  |  |



## Enum: TierEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| PREMIUM | &quot;PREMIUM&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| DEGRADED | &quot;DEGRADED&quot; |
| OFFLINE | &quot;OFFLINE&quot; |
| SETUP_REQUIRED | &quot;SETUP_REQUIRED&quot; |
| DISABLED | &quot;DISABLED&quot; |
| NOT_CONFIGURED | &quot;NOT_CONFIGURED&quot; |



