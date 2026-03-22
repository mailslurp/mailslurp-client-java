

# CampaignProbeRunDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**probeId** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |
|**healthScore** | **Integer** |  |  |
|**totalChecks** | **Integer** |  |  |
|**passingChecks** | **Integer** |  |  |
|**failingChecks** | **Integer** |  |  |
|**checkedLinks** | **Integer** |  |  |
|**checkedImages** | **Integer** |  |  |
|**linkIssueCount** | **Integer** |  |  |
|**imageIssueCount** | **Integer** |  |  |
|**compatibilityWarningCount** | **Integer** |  |  |
|**compatibilityNotSupportedCount** | **Integer** |  |  |
|**compatibilityUnknownCount** | **Integer** |  |  |
|**htmlErrorCount** | **Integer** |  |  |
|**htmlWarningCount** | **Integer** |  |  |
|**htmlInfoCount** | **Integer** |  |  |
|**reputationFailureCount** | **Integer** |  |  |
|**attachmentMentionIssueCount** | **Integer** |  |  |
|**insights** | **List&lt;String&gt;** |  |  |
|**errorMessage** | **String** |  |  [optional] |
|**fromAddress** | **String** |  |  [optional] |
|**recipient** | **String** |  |  [optional] |
|**subject** | **String** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**sourceMessageId** | **String** |  |  [optional] |
|**processingMs** | **Long** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| WARNING | &quot;WARNING&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| DIRECT_API | &quot;DIRECT_API&quot; |
| SES_MONITOR | &quot;SES_MONITOR&quot; |
| USER_SCHEDULE | &quot;USER_SCHEDULE&quot; |
| CRON | &quot;CRON&quot; |
| SCHEDULER | &quot;SCHEDULER&quot; |



