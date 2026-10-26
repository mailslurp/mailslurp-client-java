

# AccountDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**user** | [**UserDto**](UserDto) |  |  |
|**subscription** | [**SubscriptionDto**](SubscriptionDto) |  |  [optional] |
|**addons** | [**List&lt;AddonsEnum&gt;**](#List&lt;AddonsEnum&gt;) |  |  [optional] |
|**intercomHash** | **String** | disabled |  [optional] |
|**churnkeyHash** | **String** | disabled |  [optional] |
|**currentPeriod** | [**CurrentPeriodDto**](CurrentPeriodDto) |  |  |
|**requiresVerification** | **Boolean** |  |  |
|**requiredVerificationTypes** | [**List&lt;RequiredVerificationTypesEnum&gt;**](#List&lt;RequiredVerificationTypesEnum&gt;) |  |  [optional] |
|**defaultCurrency** | [**DefaultCurrencyEnum**](#DefaultCurrencyEnum) |  |  |
|**defaultSchedule** | [**DefaultScheduleEnum**](#DefaultScheduleEnum) |  |  |
|**hasBadSubscriptionItemStatuses** | **Boolean** |  |  [optional] |
|**trialsEnabled** | **Boolean** |  |  |
|**hasAnyActiveTrialSubscription** | **Boolean** |  |  |
|**canEndTrial** | **Boolean** |  |  |
|**freeAccountExpiresInDays** | **Integer** |  |  [optional] |
|**freeAccountExpired** | **Boolean** |  |  |
|**freeAccountEvaluationDenied** | **Boolean** |  |  |
|**freeAccountEvaluationDeniedReason** | [**FreeAccountEvaluationDeniedReasonEnum**](#FreeAccountEvaluationDeniedReasonEnum) |  |  [optional] |
|**freeAccountEvaluationDeniedAllowTrial** | **Boolean** |  |  |
|**freeAccountMode** | [**FreeAccountModeEnum**](#FreeAccountModeEnum) |  |  |
|**requiresTermsAndConditionsAgreement** | **Boolean** |  |  [optional] |
|**enforceSendingAgreement** | **Boolean** |  |  |
|**adminSendPause** | [**AdminSendPauseDto**](AdminSendPauseDto) |  |  [optional] |
|**organizationName** | **String** |  |  [optional] |
|**organizationSlug** | **String** |  |  [optional] |
|**organizationBrandColor** | **String** |  |  [optional] |
|**organizationLogoUrl** | **String** |  |  [optional] |
|**userPermissionRole** | **String** |  |  [optional] |
|**environmentAccounts** | [**EnvironmentAccountsDto**](EnvironmentAccountsDto) |  |  [optional] |
|**domainPlanQuantity** | **Integer** |  |  |
|**assignedDomainCount** | **Integer** |  |  |
|**effectiveDomainLimit** | **Integer** |  |  [optional] |
|**requiresDashboardOnboardingV2** | **Boolean** |  |  |



## Enum: List&lt;AddonsEnum&gt;

| Name | Value |
|---- | -----|
| STORAGE | &quot;STORAGE&quot; |
| INBOXES | &quot;INBOXES&quot; |
| CONNECTORS | &quot;CONNECTORS&quot; |
| DOMAIN_MONITOR | &quot;DOMAIN_MONITOR&quot; |
| DEVICE_RENDER | &quot;DEVICE_RENDER&quot; |
| INBOX_PLACEMENT_TESTS | &quot;INBOX_PLACEMENT_TESTS&quot; |
| WARMUP_SENDERS | &quot;WARMUP_SENDERS&quot; |
| WARMUP_USAGE | &quot;WARMUP_USAGE&quot; |
| EMAILS | &quot;EMAILS&quot; |
| AI | &quot;AI&quot; |
| VALIDATION | &quot;VALIDATION&quot; |
| GUEST | &quot;GUEST&quot; |



## Enum: List&lt;RequiredVerificationTypesEnum&gt;

| Name | Value |
|---- | -----|
| EMAIL_ADDRESS | &quot;EMAIL_ADDRESS&quot; |
| PHONE_NUMBER | &quot;PHONE_NUMBER&quot; |



## Enum: DefaultCurrencyEnum

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



## Enum: DefaultScheduleEnum

| Name | Value |
|---- | -----|
| MONTHLY | &quot;MONTHLY&quot; |
| YEARLY | &quot;YEARLY&quot; |



## Enum: FreeAccountEvaluationDeniedReasonEnum

| Name | Value |
|---- | -----|
| COUNTRY | &quot;COUNTRY&quot; |
| DOMAIN | &quot;DOMAIN&quot; |
| FREE_EMAIL_PROVIDER | &quot;FREE_EMAIL_PROVIDER&quot; |



## Enum: FreeAccountModeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| LEGACY_EVALUATION | &quot;LEGACY_EVALUATION&quot; |
| PERMANENT_SANDBOX | &quot;PERMANENT_SANDBOX&quot; |



