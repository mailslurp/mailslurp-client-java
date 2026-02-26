

# GenerateDmarcRecordOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** |  |  |
|**version** | [**VersionEnum**](#VersionEnum) |  |  |
|**policy** | [**PolicyEnum**](#PolicyEnum) |  |  |
|**subdomainPolicy** | [**SubdomainPolicyEnum**](#SubdomainPolicyEnum) |  |  [optional] |
|**reportEmailAddress** | **List&lt;String&gt;** |  |  [optional] |
|**forensicEmailAddress** | **List&lt;String&gt;** |  |  [optional] |
|**percentage** | **Integer** |  |  [optional] |
|**reportFormat** | [**ReportFormatEnum**](#ReportFormatEnum) |  |  [optional] |
|**secondsBetweenReports** | **Integer** |  |  [optional] |
|**adkim** | [**AdkimEnum**](#AdkimEnum) |  |  [optional] |
|**aspf** | [**AspfEnum**](#AspfEnum) |  |  [optional] |
|**fo** | [**FoEnum**](#FoEnum) |  |  [optional] |



## Enum: VersionEnum

| Name | Value |
|---- | -----|
| DMARC1 | &quot;DMARC1&quot; |



## Enum: PolicyEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| QUARANTINE | &quot;QUARANTINE&quot; |
| REJECT | &quot;REJECT&quot; |



## Enum: SubdomainPolicyEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| QUARANTINE | &quot;QUARANTINE&quot; |
| REJECT | &quot;REJECT&quot; |



## Enum: ReportFormatEnum

| Name | Value |
|---- | -----|
| AFRF | &quot;AFRF&quot; |



## Enum: AdkimEnum

| Name | Value |
|---- | -----|
| STRICT | &quot;STRICT&quot; |
| RELAXED | &quot;RELAXED&quot; |



## Enum: AspfEnum

| Name | Value |
|---- | -----|
| STRICT | &quot;STRICT&quot; |
| RELAXED | &quot;RELAXED&quot; |



## Enum: FoEnum

| Name | Value |
|---- | -----|
| FO_0 | &quot;FO_0&quot; |
| FO_1 | &quot;FO_1&quot; |
| FO_D | &quot;FO_D&quot; |
| FO_S | &quot;FO_S&quot; |



