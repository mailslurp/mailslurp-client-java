

# EmailWarmupSendSlotDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**programId** | **UUID** |  |  |
|**slotDate** | **LocalDate** |  |  |
|**rampDay** | **Integer** |  |  |
|**sequence** | **Integer** |  |  |
|**scheduledFor** | **OffsetDateTime** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**targetClass** | [**TargetClassEnum**](#TargetClassEnum) |  |  |
|**contentHash** | **String** |  |  |
|**attemptCount** | **Integer** |  |  |
|**maxAttempts** | **Integer** |  |  |
|**acceptedAt** | **OffsetDateTime** |  |  [optional] |
|**observedAt** | **OffsetDateTime** |  |  [optional] |
|**outcomeClass** | [**OutcomeClassEnum**](#OutcomeClassEnum) |  |  [optional] |
|**failureCode** | **String** |  |  [optional] |
|**reconciliationRequired** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLANNED | &quot;PLANNED&quot; |
| CLAIMED | &quot;CLAIMED&quot; |
| RETRYABLE | &quot;RETRYABLE&quot; |
| ACCEPTED | &quot;ACCEPTED&quot; |
| AMBIGUOUS | &quot;AMBIGUOUS&quot; |
| FAILED | &quot;FAILED&quot; |
| SKIPPED | &quot;SKIPPED&quot; |



## Enum: TargetClassEnum

| Name | Value |
|---- | -----|
| MS2_CONTROLLED_MX | &quot;MS2_CONTROLLED_MX&quot; |
| PROVIDER_SEED_PASSIVE | &quot;PROVIDER_SEED_PASSIVE&quot; |



## Enum: OutcomeClassEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;ACCEPTED&quot; |
| AMBIGUOUS | &quot;AMBIGUOUS&quot; |
| RETRYABLE | &quot;RETRYABLE&quot; |
| PERMANENT | &quot;PERMANENT&quot; |
| SKIPPED | &quot;SKIPPED&quot; |



