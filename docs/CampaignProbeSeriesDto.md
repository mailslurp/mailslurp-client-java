

# CampaignProbeSeriesDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**probeId** | **UUID** |  |  |
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**bucket** | [**BucketEnum**](#BucketEnum) |  |  |
|**points** | [**List&lt;CampaignProbeSeriesPointDto&gt;**](CampaignProbeSeriesPointDto) |  |  |



## Enum: BucketEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| DAY | &quot;DAY&quot; |



