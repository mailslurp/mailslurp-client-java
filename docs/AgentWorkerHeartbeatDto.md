

# AgentWorkerHeartbeatDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**connectionId** | **UUID** |  |  |
|**workerId** | **String** |  |  |
|**instanceId** | **String** |  |  |
|**release** | **String** |  |  [optional] |
|**firstSeenAt** | **OffsetDateTime** |  |  |
|**lastSeenAt** | **OffsetDateTime** |  |  |
|**staleAfter** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ONLINE | &quot;ONLINE&quot; |
| STALE | &quot;STALE&quot; |



