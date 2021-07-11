

# ConditionOption

Options for matching emails in an inbox based on a condition such as `HAS_ATTACHMENTS=TRUE`
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | [**ConditionEnum**](#ConditionEnum) | The condition to evaluate against the email |  [optional]
**value** | [**ValueEnum**](#ValueEnum) | What the condition should evaluate to. A string &#39;TRUE|FALSE&#39; not a boolean. |  [optional]



## Enum: ConditionEnum

Name | Value
---- | -----
HAS_ATTACHMENTS | &quot;HAS_ATTACHMENTS&quot;



## Enum: ValueEnum

Name | Value
---- | -----
TRUE | &quot;TRUE&quot;
FALSE | &quot;FALSE&quot;



