

# EntityFavouriteItemProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**id** | **UUID** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  |
|**description** | **String** |  |  [optional] |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| EMAIL | &quot;EMAIL&quot; |
| ATTACHMENT | &quot;ATTACHMENT&quot; |
| PHONE | &quot;PHONE&quot; |
| SMS | &quot;SMS&quot; |



