

# EmailWarmupProgramDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**connectionId** | **UUID** |  |  |
|**senderEmail** | **String** |  |  |
|**name** | **String** |  |  |
|**customerIntent** | [**CustomerIntentEnum**](#CustomerIntentEnum) |  |  |
|**executionPolicy** | [**ExecutionPolicyEnum**](#ExecutionPolicyEnum) |  |  |
|**programMode** | [**ProgramModeEnum**](#ProgramModeEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**blockers** | [**Set&lt;BlockersEnum&gt;**](#Set&lt;BlockersEnum&gt;) |  |  |
|**currentDailyVolume** | **Integer** |  |  |
|**goalDailyVolume** | **Integer** |  |  |
|**schedulePreset** | [**SchedulePresetEnum**](#SchedulePresetEnum) |  |  |
|**rampDurationDays** | **Integer** |  |  |
|**maintenanceEnabled** | **Boolean** |  |  |
|**maintenanceDailyVolume** | **Integer** |  |  |
|**sendWindowStart** | **String** |  |  |
|**sendWindowEnd** | **String** |  |  |
|**timeZone** | **String** |  |  |
|**requestedCoverage** | [**RequestedCoverageEnum**](#RequestedCoverageEnum) |  |  |
|**resolvedCoverage** | [**ResolvedCoverageEnum**](#ResolvedCoverageEnum) |  |  |
|**baselineTestId** | **UUID** |  |  [optional] |
|**baselineSource** | [**BaselineSourceEnum**](#BaselineSourceEnum) |  |  |
|**contentSource** | [**ContentSourceEnum**](#ContentSourceEnum) |  |  |
|**content** | [**EmailWarmupContentOptions**](EmailWarmupContentOptions) |  |  |
|**contentHash** | **String** |  |  |
|**senderOwnershipAttestedAt** | **OffsetDateTime** |  |  |
|**permissionBasedSendingAttestedAt** | **OffsetDateTime** |  |  |
|**attestationPolicyVersion** | **String** |  |  |
|**policyVersion** | **String** |  |  |
|**contentPolicyVersion** | **String** |  |  |
|**recipientPolicyVersion** | **String** |  |  |
|**nextActionAt** | **OffsetDateTime** |  |  [optional] |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**completionCode** | **String** |  |  [optional] |
|**version** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: CustomerIntentEnum

| Name | Value |
|---- | -----|
| NEW_SENDER_WARMUP | &quot;NEW_SENDER_WARMUP&quot; |
| EXISTING_SENDER_REPAIR | &quot;EXISTING_SENDER_REPAIR&quot; |



## Enum: ExecutionPolicyEnum

| Name | Value |
|---- | -----|
| LOW_VOLUME_MAILBOX_RAMP | &quot;LOW_VOLUME_MAILBOX_RAMP&quot; |
| HIGH_VOLUME_INFRASTRUCTURE_RAMP | &quot;HIGH_VOLUME_INFRASTRUCTURE_RAMP&quot; |
| ASSISTED_CAMPAIGN_RAMP | &quot;ASSISTED_CAMPAIGN_RAMP&quot; |



## Enum: ProgramModeEnum

| Name | Value |
|---- | -----|
| ASSISTED | &quot;ASSISTED&quot; |
| NATIVE_SEND | &quot;NATIVE_SEND&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DRAFT | &quot;DRAFT&quot; |
| ESTABLISHING_BASELINE | &quot;ESTABLISHING_BASELINE&quot; |
| READY | &quot;READY&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| VERIFYING | &quot;VERIFYING&quot; |
| PAUSED_CUSTOMER | &quot;PAUSED_CUSTOMER&quot; |
| PAUSED_CONNECTION | &quot;PAUSED_CONNECTION&quot; |
| PAUSED_SAFETY | &quot;PAUSED_SAFETY&quot; |
| PAUSED_BILLING | &quot;PAUSED_BILLING&quot; |
| PAUSED_CAPACITY | &quot;PAUSED_CAPACITY&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| MONITORING | &quot;MONITORING&quot; |
| STOPPED | &quot;STOPPED&quot; |



## Enum: Set&lt;BlockersEnum&gt;

| Name | Value |
|---- | -----|
| API_DISABLED | &quot;API_DISABLED&quot; |
| PROVIDER_DISABLED | &quot;PROVIDER_DISABLED&quot; |
| CONNECTION_NOT_VERIFIED | &quot;CONNECTION_NOT_VERIFIED&quot; |
| CONNECTION_VERIFICATION_STALE | &quot;CONNECTION_VERIFICATION_STALE&quot; |
| SENDER_IDENTITY_CHANGED | &quot;SENDER_IDENTITY_CHANGED&quot; |
| CONTROLLED_MX_UNAVAILABLE | &quot;CONTROLLED_MX_UNAVAILABLE&quot; |
| CHECKPOINTS_DISABLED | &quot;CHECKPOINTS_DISABLED&quot; |
| PREMIUM_COVERAGE_REQUIRED | &quot;PREMIUM_COVERAGE_REQUIRED&quot; |
| EXECUTION_DISABLED | &quot;EXECUTION_DISABLED&quot; |
| BILLING_NOT_READY | &quot;BILLING_NOT_READY&quot; |



## Enum: SchedulePresetEnum

| Name | Value |
|---- | -----|
| GENTLE | &quot;GENTLE&quot; |
| STANDARD | &quot;STANDARD&quot; |
| REPAIR | &quot;REPAIR&quot; |
| CUSTOM | &quot;CUSTOM&quot; |



## Enum: RequestedCoverageEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| CONTROLLED | &quot;CONTROLLED&quot; |
| CORE | &quot;CORE&quot; |
| EXPANDED | &quot;EXPANDED&quot; |



## Enum: ResolvedCoverageEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;AUTO&quot; |
| CONTROLLED | &quot;CONTROLLED&quot; |
| CORE | &quot;CORE&quot; |
| EXPANDED | &quot;EXPANDED&quot; |



## Enum: BaselineSourceEnum

| Name | Value |
|---- | -----|
| SUPPLIED | &quot;SUPPLIED&quot; |
| PROGRAM_CHECKPOINT | &quot;PROGRAM_CHECKPOINT&quot; |
| NONE | &quot;NONE&quot; |



## Enum: ContentSourceEnum

| Name | Value |
|---- | -----|
| MANAGED_CONTROL | &quot;MANAGED_CONTROL&quot; |
| CUSTOM_TEMPLATE | &quot;CUSTOM_TEMPLATE&quot; |
| AI_ASSISTED_TEMPLATE | &quot;AI_ASSISTED_TEMPLATE&quot; |



