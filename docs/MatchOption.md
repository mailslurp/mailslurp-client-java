

# MatchOption

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | The email property to match on. One of SUBJECT, TO, BCC, CC or FROM |  [optional]
**should** | [**ShouldEnum**](#ShouldEnum) | What criteria to apply. CONTAIN or EQUAL. Note CONTAIN is recommended due to some SMTP servers adding new lines |  [optional]
**value** | **String** | The value to compare to the field using EQUAL or CONTAIN |  [optional]



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



