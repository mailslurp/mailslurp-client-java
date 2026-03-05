

# CampaignProbeDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**name** | **String** |  |  [optional] |
|**localPart** | **String** |  |  |
|**emailAddress** | **String** |  |  |
|**enabled** | **Boolean** |  |  |
|**intervalSeconds** | **Long** |  |  [optional] |
|**schedulingEnabled** | **Boolean** |  |  |
|**nextRunAt** | **OffsetDateTime** |  |  [optional] |
|**lastRunStatus** | [**LastRunStatusEnum**](#LastRunStatusEnum) |  |  [optional] |
|**lastHealthScore** | **Integer** |  |  [optional] |
|**lastIngestAt** | **OffsetDateTime** |  |  [optional] |
|**totalIngestCount** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: LastRunStatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| WARNING | &quot;WARNING&quot; |
| FAILED | &quot;FAILED&quot; |



