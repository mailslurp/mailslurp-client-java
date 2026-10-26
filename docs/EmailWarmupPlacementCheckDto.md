

# EmailWarmupPlacementCheckDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**programId** | **UUID** |  |  |
|**checkpointDay** | **Integer** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**scheduledFor** | **OffsetDateTime** |  |  |
|**inboxPlacementRunId** | **UUID** |  |  [optional] |
|**targetCount** | **Integer** |  |  |
|**acceptedCount** | **Integer** |  |  |
|**inboxCount** | **Integer** |  |  |
|**spamCount** | **Integer** |  |  |
|**notReceivedCount** | **Integer** |  |  |
|**inboxPercent** | **Integer** |  |  |
|**providerResults** | [**List&lt;EmailWarmupProviderPlacementDto&gt;**](EmailWarmupProviderPlacementDto) |  |  |
|**failureCode** | **String** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BASELINE | &quot;BASELINE&quot; |
| WEEKLY | &quot;WEEKLY&quot; |
| FINAL | &quot;FINAL&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;PLANNED&quot; |
| SENDING | &quot;SENDING&quot; |
| WAITING_RESULTS | &quot;WAITING_RESULTS&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| PARTIAL | &quot;PARTIAL&quot; |
| FAILED | &quot;FAILED&quot; |



