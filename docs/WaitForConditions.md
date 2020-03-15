

# WaitForConditions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Integer** | Number of results that should match conditions |  [optional]
**countType** | [**CountTypeEnum**](#CountTypeEnum) | Should exactly count number of results be returned or at least that many. |  [optional]
**inboxId** | [**UUID**](UUID.md) | Inbox to search within |  [optional]
**matches** | [**List&lt;MatchOption&gt;**](MatchOption.md) | Conditions that should be matched |  [optional]
**sortDirection** | [**SortDirectionEnum**](#SortDirectionEnum) | Direction to sort matching emails by created time |  [optional]
**timeout** | **Long** | Max time in milliseconds to wait until conditions are met |  [optional]
**unreadOnly** | **Boolean** | Apply only to unread emails |  [optional]



## Enum: CountTypeEnum

Name | Value
---- | -----
EXACTLY | &quot;EXACTLY&quot;
ATLEAST | &quot;ATLEAST&quot;



## Enum: SortDirectionEnum

Name | Value
---- | -----
ASC | &quot;ASC&quot;
DESC | &quot;DESC&quot;



