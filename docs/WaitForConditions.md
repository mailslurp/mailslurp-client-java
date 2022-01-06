

# WaitForConditions

Conditions to apply to emails that you are waiting for
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inboxId** | [**UUID**](UUID) |  |  [optional]
**count** | **Integer** | Number of results that should match conditions. Either exactly or at least this amount based on the &#x60;countType&#x60;. If count condition is not met and the timeout has not been reached the &#x60;waitFor&#x60; method will retry the operation. |  [optional]
**delayTimeout** | **Long** | Max time in milliseconds to wait between retries if a &#x60;timeout&#x60; is specified. |  [optional]
**timeout** | **Long** | Max time in milliseconds to retry the &#x60;waitFor&#x60; operation until conditions are met. | 
**unreadOnly** | **Boolean** | Apply conditions only to **unread** emails. All emails begin with &#x60;read&#x3D;false&#x60;. An email is marked &#x60;read&#x3D;true&#x60; when an &#x60;EmailDto&#x60; representation of it has been returned to the user at least once. For example you have called &#x60;getEmail&#x60; or &#x60;waitForLatestEmail&#x60; etc., or you have viewed the email in the dashboard. |  [optional]
**countType** | [**CountTypeEnum**](#CountTypeEnum) | How result size should be compared with the expected size. Exactly or at-least matching result? |  [optional]
**matches** | [**List&lt;MatchOption&gt;**](MatchOption) |  |  [optional]
**sortDirection** | [**SortDirectionEnum**](#SortDirectionEnum) |  |  [optional]
**since** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]
**before** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]



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



