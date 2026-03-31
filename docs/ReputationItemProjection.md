

# ReputationItemProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**source** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**recipient** | **String** |  |  [optional] |
|**reputationType** | [**ReputationTypeEnum**](#ReputationTypeEnum) |  |  |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;INFO&quot; |
| WARNING | &quot;WARNING&quot; |
| DANGER | &quot;DANGER&quot; |



## Enum: ReputationTypeEnum

| Name | Value |
|---- | -----|
| COMPLAINT | &quot;COMPLAINT&quot; |
| BOUNCE | &quot;BOUNCE&quot; |



