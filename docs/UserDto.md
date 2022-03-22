

# UserDto

Representation a user's account
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**apiKey** | **String** |  | 
**emailAddress** | **String** |  | 
**emailAddressMd5** | **String** |  | 
**created** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**userType** | [**UserTypeEnum**](#UserTypeEnum) |  |  [optional]
**organization** | [**UUID**](UUID) | Does user belong to an organization |  [optional]
**verified** | [**VerifiedEnum**](#VerifiedEnum) | Has user accepted an organization invite |  [optional]
**hasPassword** | **Boolean** |  | 
**isFrozen** | **Boolean** |  | 
**addNewContacts** | **Boolean** |  |  [optional]
**ssoProvider** | **String** |  |  [optional]
**customerId** | **String** |  |  [optional]
**hasOnboarded** | **Boolean** |  |  [optional]
**imapUsername** | **String** |  |  [optional]
**imapPassword** | **String** |  |  [optional]
**smtpUsername** | **String** |  |  [optional]
**smtpPassword** | **String** |  |  [optional]



## Enum: UserTypeEnum

Name | Value
---- | -----
SOLO | &quot;SOLO&quot;
CHILD_SOLO | &quot;CHILD_SOLO&quot;
CHILD_TEAM | &quot;CHILD_TEAM&quot;



## Enum: VerifiedEnum

Name | Value
---- | -----
VERIFIED | &quot;VERIFIED&quot;
PENDING | &quot;PENDING&quot;



