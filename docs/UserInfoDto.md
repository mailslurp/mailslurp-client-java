

# UserInfoDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**emailAddress** | **String** |  | 
**accountState** | [**AccountStateEnum**](#AccountStateEnum) |  | 
**subscriptionType** | [**SubscriptionTypeEnum**](#SubscriptionTypeEnum) |  |  [optional]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



## Enum: AccountStateEnum

Name | Value
---- | -----
FROZEN | &quot;FROZEN&quot;
ACTIVE | &quot;ACTIVE&quot;



## Enum: SubscriptionTypeEnum

Name | Value
---- | -----
PRO_MONTHLY | &quot;PRO_MONTHLY&quot;
STARTER | &quot;STARTER&quot;
TEAM | &quot;TEAM&quot;
ENTERPRISE | &quot;ENTERPRISE&quot;



## Enum: AccountTypeEnum

Name | Value
---- | -----
SOLO | &quot;SOLO&quot;
CHILD_SOLO | &quot;CHILD_SOLO&quot;
CHILD_TEAM | &quot;CHILD_TEAM&quot;



