

# DevicePreviewQaBundleDto

Optional QA bundle linked to this render run.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**runId** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**requestedEmailAudit** | **Boolean** |  |  |
|**requestedDomainMonitor** | **Boolean** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**emailAuditStatus** | [**EmailAuditStatusEnum**](#EmailAuditStatusEnum) |  |  |
|**domainMonitorStatus** | [**DomainMonitorStatusEnum**](#DomainMonitorStatusEnum) |  |  |
|**emailAuditId** | **UUID** |  |  [optional] |
|**domainMonitorId** | **UUID** |  |  [optional] |
|**domainMonitorRunId** | **UUID** |  |  [optional] |
|**senderDomain** | **String** |  |  [optional] |
|**emailAuditMessage** | **String** |  |  [optional] |
|**domainMonitorMessage** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| COMPLETE_WITH_SKIPS | &quot;COMPLETE_WITH_SKIPS&quot; |
| COMPLETE_WITH_ERRORS | &quot;COMPLETE_WITH_ERRORS&quot; |



## Enum: EmailAuditStatusEnum

| Name | Value |
|---- | -----|
| NOT_REQUESTED | &quot;NOT_REQUESTED&quot; |
| PENDING | &quot;PENDING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: DomainMonitorStatusEnum

| Name | Value |
|---- | -----|
| NOT_REQUESTED | &quot;NOT_REQUESTED&quot; |
| PENDING | &quot;PENDING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| SKIPPED | &quot;SKIPPED&quot; |
| FAILED | &quot;FAILED&quot; |



