

# EmailAuditAnalysisResult

Combined email audit analysis across validation, client support, links, and images

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contentReview** | [**List&lt;EmailAuditCheck&gt;**](EmailAuditCheck) | Versioned static accessibility, unresolved template, and compliance review checks. Null on historical audits that did not run these checks. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Health status for a one-shot email audit |  |
|**healthScore** | **Integer** |  |  |
|**totalChecks** | **Integer** |  |  |
|**passingChecks** | **Integer** |  |  |
|**failingChecks** | **Integer** |  |  |
|**detectedLinks** | **Integer** |  |  |
|**checkedLinks** | **Integer** |  |  |
|**detectedImages** | **Integer** |  |  |
|**checkedImages** | **Integer** |  |  |
|**linkIssueCount** | **Integer** |  |  |
|**imageIssueCount** | **Integer** |  |  |
|**spellingIssueCount** | **Integer** |  |  |
|**brokenLinks** | [**List&lt;EmailAuditUrlIssue&gt;**](EmailAuditUrlIssue) |  |  |
|**brokenImages** | [**List&lt;EmailAuditUrlIssue&gt;**](EmailAuditUrlIssue) |  |  |
|**spellingIssues** | [**List&lt;EmailAuditSpellingIssue&gt;**](EmailAuditSpellingIssue) |  |  |
|**compatibilityWarningCount** | **Integer** |  |  |
|**compatibilityNotSupportedCount** | **Integer** |  |  |
|**compatibilityUnknownCount** | **Integer** |  |  |
|**featureSupport** | [**EmailFeatureSupportResult**](EmailFeatureSupportResult) |  |  [optional] |
|**htmlErrorCount** | **Integer** |  |  |
|**htmlWarningCount** | **Integer** |  |  |
|**htmlInfoCount** | **Integer** |  |  |
|**htmlValidation** | [**HTMLValidationResult**](HTMLValidationResult) |  |  [optional] |
|**reputationFailureCount** | **Integer** |  |  |
|**attachmentMentionIssueCount** | **Integer** |  |  |
|**externalCheckSkippedCount** | **Integer** |  |  |
|**insights** | **List&lt;String&gt;** |  |  |
|**errorMessage** | **String** |  |  [optional] |
|**spamVerdict** | **String** | Spam verdict supplied by the source mail receiver |  [optional] |
|**virusVerdict** | **String** | Virus verdict supplied by the source mail receiver |  [optional] |
|**spfVerdict** | **String** | SPF verdict supplied by the source mail receiver |  [optional] |
|**dkimVerdict** | **String** | DKIM verdict supplied by the source mail receiver |  [optional] |
|**dmarcVerdict** | **String** | DMARC verdict supplied by the source mail receiver |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| HEALTHY | &quot;HEALTHY&quot; |
| WARNING | &quot;WARNING&quot; |
| FAILED | &quot;FAILED&quot; |



