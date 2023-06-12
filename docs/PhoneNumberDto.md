

# PhoneNumberDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**userId** | [**UUID**](UUID) |  | 
**complianceAddress** | [**UUID**](UUID) |  |  [optional]
**emergencyAddress** | [**UUID**](UUID) |  |  [optional]
**phoneNumber** | **String** |  | 
**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) |  | 
**phonePlan** | [**UUID**](UUID) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



## Enum: PhoneCountryEnum

Name | Value
---- | -----
US | &quot;US&quot;
GB | &quot;GB&quot;
AU | &quot;AU&quot;



