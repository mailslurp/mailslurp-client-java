

# DomainMonitorEmailVerificationDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**monitorId** | **UUID** |  |  |
|**emailAddress** | **String** |  |  |
|**localPart** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**sampleCount** | **Integer** |  |  |
|**lastSample** | [**DomainMonitorObservedAuthSampleDto**](DomainMonitorObservedAuthSampleDto) |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |



