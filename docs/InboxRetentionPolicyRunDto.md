

# InboxRetentionPolicyRunDto

Persisted retention-policy run state. Poll this after starting a run to track progress without blocking on mailbox cleanup.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**matchedPolicies** | **Integer** |  |  |
|**appliedPolicies** | **Integer** |  |  |
|**errorMessage** | **String** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUBMITTED | &quot;SUBMITTED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| USER_API | &quot;USER_API&quot; |



