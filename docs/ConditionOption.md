

# ConditionOption

Options for matching emails in an inbox based on a condition such as `HAS_ATTACHMENTS=TRUE`
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | [**ConditionEnum**](#ConditionEnum) | Condition of an email object that can be used to filter results |  [optional]
**value** | [**ValueEnum**](#ValueEnum) | Expected condition value |  [optional]



## Enum: ConditionEnum

Name | Value
---- | -----
HAS_ATTACHMENTS | &quot;HAS_ATTACHMENTS&quot;



## Enum: ValueEnum

Name | Value
---- | -----
TRUE | &quot;TRUE&quot;
FALSE | &quot;FALSE&quot;



