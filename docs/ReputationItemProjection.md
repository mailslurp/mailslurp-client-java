

# ReputationItemProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reputationType** | [**ReputationTypeEnum**](#ReputationTypeEnum) |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**id** | **UUID** |  |  |
|**source** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**recipient** | **String** |  |  [optional] |



## Enum: ReputationTypeEnum

| Name | Value |
|---- | -----|
| COMPLAINT | &quot;COMPLAINT&quot; |
| BOUNCE | &quot;BOUNCE&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;INFO&quot; |
| WARNING | &quot;WARNING&quot; |
| DANGER | &quot;DANGER&quot; |



