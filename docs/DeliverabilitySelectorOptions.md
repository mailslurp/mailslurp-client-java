

# DeliverabilitySelectorOptions

How entities are selected for a deliverability test

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Selection mode |  |
|**pattern** | **String** | Wildcard pattern for PATTERN selection. Supports &#39;*&#39; and &#39;?&#39; wildcards. If no wildcard is present the value is treated as a case-insensitive contains match. |  [optional] |
|**phoneCountry** | [**PhoneCountryEnum**](#PhoneCountryEnum) | Optional phone-country filter for PHONE scope selection (e.g. ALL phones in US). Must be null for INBOX scope. |  [optional] |
|**entityIds** | **List&lt;UUID&gt;** | Explicit entity IDs for EXPLICIT selection |  [optional] |
|**excludeEntityIds** | **List&lt;UUID&gt;** | Optional entity IDs to exclude from the resolved selection (applies after ALL/PATTERN/EXPLICIT selection). |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;ALL&quot; |
| PATTERN | &quot;PATTERN&quot; |
| EXPLICIT | &quot;EXPLICIT&quot; |



## Enum: PhoneCountryEnum

| Name | Value |
|---- | -----|
| US | &quot;US&quot; |
| GB | &quot;GB&quot; |
| AU | &quot;AU&quot; |
| CA | &quot;CA&quot; |
| EE | &quot;EE&quot; |
| HK | &quot;HK&quot; |
| PL | &quot;PL&quot; |
| PT | &quot;PT&quot; |
| NL | &quot;NL&quot; |
| IL | &quot;IL&quot; |
| FI | &quot;FI&quot; |
| SE | &quot;SE&quot; |



