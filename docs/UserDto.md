

# UserDto

Representation a user's account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**apiKey** | **String** | Deprecate api key use entity instead |  |
|**emailAddress** | **String** |  |  |
|**emailAddressMd5** | **String** |  |  |
|**created** | **OffsetDateTime** |  |  [optional] |
|**userType** | [**UserTypeEnum**](#UserTypeEnum) |  |  [optional] |
|**organization** | **UUID** | Does user belong to an organization |  [optional] |
|**verified** | [**VerifiedEnum**](#VerifiedEnum) | Has user accepted an organization invite |  [optional] |
|**hasPassword** | **Boolean** |  |  |
|**isFrozen** | **Boolean** |  |  |
|**frozenMessage** | **String** |  |  [optional] |
|**addNewContacts** | **Boolean** |  |  [optional] |
|**ssoProvider** | **String** |  |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**hasOnboarded** | **Boolean** |  |  [optional] |
|**imapUsername** | **String** |  |  [optional] |
|**imapPassword** | **String** |  |  [optional] |
|**smtpUsername** | **String** |  |  [optional] |
|**smtpPassword** | **String** |  |  [optional] |
|**chargePending** | **Boolean** |  |  [optional] |
|**enableSms** | **Boolean** |  |  [optional] |
|**vendorEmailAddress** | **String** |  |  [optional] |
|**unsubscribed** | **Boolean** |  |  [optional] |
|**apiAccessToken** | [**TemporaryAccessKeyDto**](TemporaryAccessKeyDto) |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**verifiedPhone** | [**VerifiedPhoneEnum**](#VerifiedPhoneEnum) | Has user accepted an organization invite |  [optional] |
|**accountRegion** | [**AccountRegionEnum**](#AccountRegionEnum) | Default account region |  [optional] |
|**name** | **String** | User display name |  [optional] |
|**accessLinkSendResult** | [**AccessLinkSendResultDto**](AccessLinkSendResultDto) |  |  [optional] |



## Enum: UserTypeEnum

| Name | Value |
|---- | -----|
| SOLO | &quot;SOLO&quot; |
| CHILD_SOLO | &quot;CHILD_SOLO&quot; |
| CHILD_TEAM | &quot;CHILD_TEAM&quot; |
| CHILD_ADMIN | &quot;CHILD_ADMIN&quot; |



## Enum: VerifiedEnum

| Name | Value |
|---- | -----|
| VERIFIED | &quot;VERIFIED&quot; |
| PENDING | &quot;PENDING&quot; |



## Enum: VerifiedPhoneEnum

| Name | Value |
|---- | -----|
| VERIFIED | &quot;VERIFIED&quot; |
| PENDING | &quot;PENDING&quot; |



## Enum: AccountRegionEnum

| Name | Value |
|---- | -----|
| US_WEST_2_ACCOUNT_STAGING | &quot;US_WEST_2_ACCOUNT_STAGING&quot; |
| US_EAST_1_ACCOUNT_STAGING | &quot;US_EAST_1_ACCOUNT_STAGING&quot; |
| EU_WEST_1_ACCOUNT_STAGING | &quot;EU_WEST_1_ACCOUNT_STAGING&quot; |
| US_WEST_2_ACCOUNT_SES_1 | &quot;US_WEST_2_ACCOUNT_SES_1&quot; |
| US_EAST_1_ACCOUNT_SES_1 | &quot;US_EAST_1_ACCOUNT_SES_1&quot; |
| EU_WEST_1_ACCOUNT_SES_1 | &quot;EU_WEST_1_ACCOUNT_SES_1&quot; |
| US_WEST_2_ACCOUNT_SES_2 | &quot;US_WEST_2_ACCOUNT_SES_2&quot; |
| EU_WEST_1_ACCOUNT_SES_2 | &quot;EU_WEST_1_ACCOUNT_SES_2&quot; |
| US_WEST_2_ACCOUNT_SES_3 | &quot;US_WEST_2_ACCOUNT_SES_3&quot; |
| US_WEST_2_ACCOUNT_BYTEWISE | &quot;US_WEST_2_ACCOUNT_BYTEWISE&quot; |
| EU_WEST_1_ACCOUNT_BYTEWISE | &quot;EU_WEST_1_ACCOUNT_BYTEWISE&quot; |
| US_WEST_2 | &quot;US_WEST_2&quot; |
| EU_WEST_1 | &quot;EU_WEST_1&quot; |
| US_EAST_1 | &quot;US_EAST_1&quot; |



