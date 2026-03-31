

# CheckCampaignProbeResults

One-shot public campaign probe preflight results

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
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
|**attachmentMentionIssueCount** | **Integer** |  |  |
|**insights** | **List&lt;String&gt;** |  |  |
|**errorMessage** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| WARNING | &quot;WARNING&quot; |
| FAILED | &quot;FAILED&quot; |



