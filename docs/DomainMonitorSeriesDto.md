

# DomainMonitorSeriesDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**monitorId** | **UUID** |  |  |
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**bucket** | [**BucketEnum**](#BucketEnum) |  |  |
|**points** | [**List&lt;DomainMonitorSeriesPointDto&gt;**](DomainMonitorSeriesPointDto) |  |  |



## Enum: BucketEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| DAY | &quot;DAY&quot; |



