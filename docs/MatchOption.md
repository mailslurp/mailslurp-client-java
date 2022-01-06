

# MatchOption

Options for matching emails in an inbox. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `SUBJECT` should `CONTAIN` value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | Fields of an email object that can be used to filter results |  [optional]
**should** | [**ShouldEnum**](#ShouldEnum) | How the value of the email field specified should be compared to the value given in the match options. |  [optional]
**value** | **String** | The value you wish to compare with the value of the field specified using the &#x60;should&#x60; value passed. For example &#x60;BODY&#x60; should &#x60;CONTAIN&#x60; a value passed. | 



## Enum: FieldEnum

Name | Value
---- | -----
SUBJECT | &quot;SUBJECT&quot;
TO | &quot;TO&quot;
BCC | &quot;BCC&quot;
CC | &quot;CC&quot;
FROM | &quot;FROM&quot;



## Enum: ShouldEnum

Name | Value
---- | -----
CONTAIN | &quot;CONTAIN&quot;
EQUAL | &quot;EQUAL&quot;



