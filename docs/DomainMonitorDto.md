

# DomainMonitorDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**domain** | **String** |  |  |
|**name** | **String** |  |  [optional] |
|**intervalSeconds** | **Long** |  |  [optional] |
|**enabled** | **Boolean** |  |  |
|**schedulingEnabled** | **Boolean** |  |  |
|**lastStatus** | [**LastStatusEnum**](#LastStatusEnum) |  |  [optional] |
|**healthScore** | **Integer** |  |  [optional] |
|**lastRunAt** | **OffsetDateTime** |  |  [optional] |
|**nextRunAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: LastStatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| DEGRADED | &quot;DEGRADED&quot; |
| CRITICAL | &quot;CRITICAL&quot; |
| FAILED | &quot;FAILED&quot; |



