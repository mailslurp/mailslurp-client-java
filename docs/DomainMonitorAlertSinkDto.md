

# DomainMonitorAlertSinkDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**monitorId** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**target** | **String** |  |  |
|**severityThreshold** | [**SeverityThresholdEnum**](#SeverityThresholdEnum) |  |  |
|**enabled** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;EMAIL&quot; |
| WEBHOOK | &quot;WEBHOOK&quot; |
| SLACK | &quot;SLACK&quot; |
| TEAMS | &quot;TEAMS&quot; |



## Enum: SeverityThresholdEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |
| CRITICAL | &quot;CRITICAL&quot; |



