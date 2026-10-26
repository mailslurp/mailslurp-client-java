

# SmsMatchOption

Options for matching SMS messages in a phone number. Each match option object contains a `field`, `should` and `value` property. Together they form logical conditions such as `BODY` should `CONTAIN` value.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**field** | [**FieldEnum**](#FieldEnum) | Fields of an SMS object that can be used to filter results |  |
|**should** | [**ShouldEnum**](#ShouldEnum) | How the value of the email field specified should be compared to the value given in the match options. |  |
|**value** | **String** | The value you wish to compare with the value of the field specified using the &#x60;should&#x60; value passed. For example &#x60;BODY&#x60; should &#x60;CONTAIN&#x60; a value passed. |  |



## Enum: FieldEnum

| Name | Value |
|---- | -----|
| BODY | &quot;BODY&quot; |
| FROM | &quot;FROM&quot; |



## Enum: ShouldEnum

| Name | Value |
|---- | -----|
| MATCH | &quot;MATCH&quot; |
| CONTAIN | &quot;CONTAIN&quot; |
| EQUAL | &quot;EQUAL&quot; |



