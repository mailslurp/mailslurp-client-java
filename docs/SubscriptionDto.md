

# SubscriptionDto

Subscription and limits

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**userId** | **UUID** |  |  |
|**customerId** | **String** |  |  [optional] |
|**subscriptionId** | **String** |  |  [optional] |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  [optional] |
|**cost** | **Integer** |  |  [optional] |
|**isDecimalLess** | **Boolean** |  |  |
|**subscriptionType** | [**SubscriptionTypeEnum**](#SubscriptionTypeEnum) |  |  |
|**subscriptionSchedule** | [**SubscriptionScheduleEnum**](#SubscriptionScheduleEnum) |  |  |
|**monthlyInboxes** | **Integer** |  |  |
|**monthlyReceive** | **Integer** |  |  |
|**oauthConnections** | **Integer** |  |  |
|**storageBytes** | **Long** |  |  |
|**totalInboxes** | **Integer** |  |  |
|**phoneNumbers** | **Integer** |  |  |
|**phoneProvisionRequestLimit** | **Integer** |  |  |
|**monthlySend** | **Integer** |  |  |
|**domains** | **Integer** |  |  |
|**members** | **Integer** |  |  |
|**aliases** | **Integer** |  |  |
|**threads** | **Integer** |  |  |
|**recipients** | **Integer** |  |  |
|**attachments** | **Boolean** |  |  |
|**bulk** | **Boolean** |  |  |
|**permanentInbox** | **Boolean** |  |  |
|**contacts** | **Boolean** |  |  |
|**webhooks** | **Boolean** |  |  |
|**password** | **Boolean** |  |  |
|**inboxRulesets** | **Boolean** |  |  |
|**zapier** | **Boolean** |  |  |
|**trackingPixels** | **Boolean** |  |  |
|**inboxForwarders** | **Boolean** |  |  |
|**inboxRepliers** | **Boolean** |  |  |
|**attachmentAutomations** | **Boolean** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |
|**monthlyGetMailServerRecords** | **Integer** |  |  |
|**monthlyVerifyEmailAddress** | **Integer** |  |  |
|**metered** | **Boolean** |  |  |
|**maxUniqueRecipients** | **Integer** |  |  |
|**externalPlanId** | **String** |  |  [optional] |
|**externalValidationPlanId** | **String** | Use validation entity |  [optional] |
|**externalValidationSubscriptionItemId** | **String** | Use validation entity |  [optional] |
|**sendWithQueue** | **Boolean** |  |  [optional] |
|**trialDays** | **Integer** |  |  [optional] |
|**cancelAt** | **OffsetDateTime** |  |  [optional] |
|**trialEnd** | **OffsetDateTime** |  |  [optional] |
|**trialStart** | **OffsetDateTime** |  |  [optional] |
|**trialAdjustmentReason** | **String** |  |  [optional] |
|**trialAdjustedAt** | **OffsetDateTime** |  |  [optional] |
|**samlSSO** | **Boolean** |  |  [optional] |
|**oidcSSO** | **Boolean** |  |  [optional] |
|**scimProvisioning** | **Boolean** |  |  [optional] |
|**demoDaysRemaining** | **Integer** |  |  [optional] |
|**organizations** | **Integer** |  |  [optional] |
|**emailFeatureCheck** | **Boolean** |  |  [optional] |
|**backup** | **Boolean** |  |  [optional] |
|**screenshots** | **Boolean** |  |  [optional] |
|**devicePreviews** | **Boolean** |  |  [optional] |
|**userPermissions** | **Boolean** |  |  [optional] |
|**environments** | **Boolean** |  |  [optional] |
|**importExport** | **Boolean** |  |  [optional] |
|**auditLogs** | **Boolean** |  |  [optional] |
|**deliverabilityTest** | **Boolean** |  |  [optional] |
|**emailAudit** | **Boolean** |  |  [optional] |
|**inboxWarmUp** | **Boolean** |  |  [optional] |
|**warmupPremiumSeedAccess** | **Boolean** |  |  [optional] |
|**domainMonitor** | **Boolean** |  |  [optional] |
|**campaignProbe** | **Boolean** |  |  [optional] |
|**virtualTotpDevices** | **Boolean** |  |  [optional] |
|**currentPeriodEnd** | **OffsetDateTime** |  |  |
|**currentPeriodStart** | **OffsetDateTime** |  |  |
|**subscriptionStatus** | [**SubscriptionStatusEnum**](#SubscriptionStatusEnum) |  |  [optional] |
|**subscriptionStatusIsBad** | **Boolean** |  |  |
|**dailyReceive** | **Integer** |  |  |
|**dailySend** | **Integer** |  |  |
|**maxEmailSizeMb** | **Integer** |  |  |
|**aiTransformers** | **Boolean** |  |  |
|**gmailInboxConnection** | **Boolean** |  |  |
|**aiDestinationSheets** | **Boolean** |  |  |
|**gmailInboxConnectionLimit** | **Integer** |  |  |
|**permitsExternalSend** | **Boolean** |  |  [optional] |
|**totalPermanentInboxes** | **Integer** |  |  [optional] |
|**monthlyTemporaryInboxes** | **Integer** |  |  [optional] |
|**agents** | **Integer** | Maximum active API or MCP agent connections. Null identifies a legacy unlimited subscription. |  [optional] |
|**maxInboxPlacementSeedAddressesPerTest** | **Integer** | Maximum seed inbox addresses assigned to one inbox placement test. |  |
|**maxAutomatedInboxPlacementSchedules** | **Integer** | Maximum non-deleted automated inbox placement schedules. Paused schedules count; deleted schedules release capacity. |  |
|**includedWarmupSenderSeats** | **Integer** | Warmup sender seats included by the base subscription before paid add-ons. |  |
|**includedMonthlyWarmupCreditsPerSender** | **Integer** |  |  |
|**warmupControlledRecipientCreditWeight** | **Integer** |  |  |
|**warmupPremiumRecipientCreditWeight** | **Integer** |  |  |
|**loadTest** | **Boolean** |  |  [optional] |
|**costMajor** | **BigDecimal** | Subscription cost in major currency units for analytics and conversion value reporting. |  [optional] |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| EUR | &quot;EUR&quot; |
| USD | &quot;USD&quot; |
| JPY | &quot;JPY&quot; |
| GBP | &quot;GBP&quot; |
| AUD | &quot;AUD&quot; |
| CAD | &quot;CAD&quot; |
| CHF | &quot;CHF&quot; |
| CNY | &quot;CNY&quot; |
| INR | &quot;INR&quot; |
| NZD | &quot;NZD&quot; |



## Enum: SubscriptionTypeEnum

| Name | Value |
|---- | -----|
| PRO_MONTHLY | &quot;PRO_MONTHLY&quot; |
| STARTER | &quot;STARTER&quot; |
| PRO | &quot;PRO&quot; |
| TEAM | &quot;TEAM&quot; |
| ENTERPRISE | &quot;ENTERPRISE&quot; |



## Enum: SubscriptionScheduleEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| YEARLY | &quot;YEARLY&quot; |



## Enum: SubscriptionStatusEnum

| Name | Value |
|---- | -----|
| INCOMPLETE_EXPIRED | &quot;incomplete_expired&quot; |
| PAST_DUE | &quot;past_due&quot; |
| CANCELED | &quot;canceled&quot; |
| UNPAID | &quot;unpaid&quot; |
| PAUSED | &quot;paused&quot; |
| INCOMPLETE | &quot;incomplete&quot; |
| TRIALING | &quot;trialing&quot; |
| ACTIVE | &quot;active&quot; |



