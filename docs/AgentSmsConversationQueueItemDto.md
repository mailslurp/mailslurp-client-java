

# AgentSmsConversationQueueItemDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversationId** | **UUID** |  |  |
|**phoneNumberId** | **UUID** |  |  |
|**phoneNumber** | **String** |  |  [optional] |
|**otherPhoneNumber** | **String** |  |  |
|**lastBody** | **String** |  |  [optional] |
|**latestMessageDirection** | [**LatestMessageDirectionEnum**](#LatestMessageDirectionEnum) |  |  |
|**latestMessageId** | **UUID** |  |  [optional] |
|**latestReceivedSmsId** | **UUID** |  |  [optional] |
|**latestSentSmsId** | **UUID** |  |  [optional] |
|**messageCount** | **Integer** |  |  |
|**unreadCount** | **Integer** |  |  |
|**hasMedia** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**lastMessageAt** | **OffsetDateTime** |  |  |
|**projectedAt** | **OffsetDateTime** |  |  |
|**version** | **Long** |  |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) |  |  |
|**outcome** | [**OutcomeEnum**](#OutcomeEnum) |  |  [optional] |
|**reviewStatus** | [**ReviewStatusEnum**](#ReviewStatusEnum) |  |  |
|**requiresHumanReview** | **Boolean** |  |  |
|**needsOperationalAttention** | **Boolean** |  |  |
|**claim** | [**AgentConversationClaimDto**](AgentConversationClaimDto) |  |  [optional] |



## Enum: LatestMessageDirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;AVAILABLE&quot; |
| CLAIMED | &quot;CLAIMED&quot; |
| WAITING_ON_AGENT | &quot;WAITING_ON_AGENT&quot; |
| WAITING_ON_CUSTOMER | &quot;WAITING_ON_CUSTOMER&quot; |
| REVIEW | &quot;REVIEW&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



## Enum: OutcomeEnum

| Name | Value |
|---- | -----|
| READ | &quot;READ&quot; |
| DRAFTED | &quot;DRAFTED&quot; |
| REPLIED | &quot;REPLIED&quot; |
| REVIEW_REQUESTED | &quot;REVIEW_REQUESTED&quot; |
| FAILED | &quot;FAILED&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



## Enum: ReviewStatusEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| REQUESTED | &quot;REQUESTED&quot; |
| ASSIGNED | &quot;ASSIGNED&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



