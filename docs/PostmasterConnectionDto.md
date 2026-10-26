

# PostmasterConnectionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**connectedEmail** | **String** |  |  [optional] |
|**scope** | **String** |  |  [optional] |
|**expiresAt** | **OffsetDateTime** |  |  |
|**lastSyncedAt** | **OffsetDateTime** |  |  [optional] |
|**lastError** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONNECTED | &quot;CONNECTED&quot; |
| DISCONNECTED | &quot;DISCONNECTED&quot; |
| ERROR | &quot;ERROR&quot; |



