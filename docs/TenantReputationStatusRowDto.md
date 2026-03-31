

# TenantReputationStatusRowDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountRegion** | [**AccountRegionEnum**](#AccountRegionEnum) |  |  |
|**tenantName** | **String** |  |  |
|**tenantArn** | **String** |  |  [optional] |
|**sendingStatus** | **String** |  |  [optional] |
|**reputationStatus** | **String** |  |  [optional] |
|**reputationPolicy** | **String** |  |  [optional] |
|**customerManagedSendingStatus** | **String** |  |  [optional] |
|**awsManagedSendingStatus** | **String** |  |  [optional] |
|**findingCount** | **Integer** |  |  |
|**bounceRate** | **Double** |  |  [optional] |
|**complaintRate** | **Double** |  |  [optional] |
|**sendLastHour** | **Double** |  |  [optional] |
|**metricTimestamp** | **OffsetDateTime** |  |  [optional] |
|**error** | **String** |  |  [optional] |



## Enum: AccountRegionEnum

| Name | Value |
|---- | -----|
| US_WEST_2_ACCOUNT_STAGING | &quot;US_WEST_2_ACCOUNT_STAGING&quot; |
| US_EAST_1_ACCOUNT_STAGING | &quot;US_EAST_1_ACCOUNT_STAGING&quot; |
| EU_WEST_1_ACCOUNT_STAGING | &quot;EU_WEST_1_ACCOUNT_STAGING&quot; |
| US_WEST_2_ACCOUNT_SES_1 | &quot;US_WEST_2_ACCOUNT_SES_1&quot; |
| EU_WEST_1_ACCOUNT_SES_1 | &quot;EU_WEST_1_ACCOUNT_SES_1&quot; |
| US_WEST_2_ACCOUNT_SES_2 | &quot;US_WEST_2_ACCOUNT_SES_2&quot; |
| EU_WEST_1_ACCOUNT_SES_2 | &quot;EU_WEST_1_ACCOUNT_SES_2&quot; |
| US_WEST_2_ACCOUNT_BYTEWISE | &quot;US_WEST_2_ACCOUNT_BYTEWISE&quot; |
| EU_WEST_1_ACCOUNT_BYTEWISE | &quot;EU_WEST_1_ACCOUNT_BYTEWISE&quot; |
| US_WEST_2 | &quot;US_WEST_2&quot; |
| EU_WEST_1 | &quot;EU_WEST_1&quot; |
| US_EAST_1 | &quot;US_EAST_1&quot; |



