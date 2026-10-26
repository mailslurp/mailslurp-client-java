

# EmailBlacklistListingResult

Blacklist lookup result for a single zone

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**zone** | **String** |  |  |
|**listed** | **Boolean** |  |  |
|**responseCodes** | **List&lt;String&gt;** |  |  |
|**responseMessages** | **List&lt;String&gt;** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**errorMessage** | **String** |  |  [optional] |
|**provider** | **String** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| LISTED | &quot;LISTED&quot; |
| NOT_LISTED | &quot;NOT_LISTED&quot; |
| ERROR | &quot;ERROR&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



