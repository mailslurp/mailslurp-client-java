

# MatchOption

Options for matching emails in an inbox. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `SUBJECT` should `CONTAIN` value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | The email property to match on. One of SUBJECT, TO, BCC, CC or FROM |  [optional]
**should** | [**ShouldEnum**](#ShouldEnum) | What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines to fields and body content. |  [optional]
**value** | **String** | The value you wish to compare with the value of the field specified using the &#x60;should&#x60; value passed. For example &#x60;BODY&#x60; should &#x60;CONTAIN&#x60; a value passed. |  [optional]



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



