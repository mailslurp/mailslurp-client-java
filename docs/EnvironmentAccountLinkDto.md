

# EnvironmentAccountLinkDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**accountGroupId** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**emailAddress** | **String** |  |  |
|**name** | **String** |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) |  |  |
|**environmentLabel** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;OWNER&quot; |
| ADMIN | &quot;ADMIN&quot; |
| MEMBER | &quot;MEMBER&quot; |



