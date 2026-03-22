

# DevicePreviewRunDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**runId** | **UUID** |  |  |
|**emailId** | **UUID** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**primaryScreenshotId** | **UUID** |  |  [optional] |
|**requestedProviders** | [**List&lt;RequestedProvidersEnum&gt;**](#List&lt;RequestedProvidersEnum&gt;) |  |  [optional] |
|**importedProviders** | [**List&lt;ImportedProvidersEnum&gt;**](#List&lt;ImportedProvidersEnum&gt;) |  |  [optional] |
|**warnings** | **List&lt;String&gt;** |  |  [optional] |
|**providerMessageIds** | **Map&lt;String, String&gt;** |  |  [optional] |
|**targetCount** | **Long** |  |  |
|**screenshotCount** | **Long** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;CREATED&quot; |
| AWAITING_ARRIVAL | &quot;AWAITING_ARRIVAL&quot; |
| CAPTURING | &quot;CAPTURING&quot; |
| PARTIAL_COMPLETE | &quot;PARTIAL_COMPLETE&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: List&lt;RequestedProvidersEnum&gt;

| Name | Value |
|---- | -----|
| GMAIL | &quot;GMAIL&quot; |
| OUTLOOK | &quot;OUTLOOK&quot; |
| YAHOO | &quot;YAHOO&quot; |



## Enum: List&lt;ImportedProvidersEnum&gt;

| Name | Value |
|---- | -----|
| GMAIL | &quot;GMAIL&quot; |
| OUTLOOK | &quot;OUTLOOK&quot; |
| YAHOO | &quot;YAHOO&quot; |



