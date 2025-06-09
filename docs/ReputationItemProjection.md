

# ReputationItemProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**recipient** | **String** |  |  [optional] |
|**reputationType** | [**ReputationTypeEnum**](#ReputationTypeEnum) |  |  |
|**id** | **UUID** |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**source** | **String** |  |  [optional] |



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



