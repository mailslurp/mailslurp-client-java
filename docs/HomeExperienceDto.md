

# HomeExperienceDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** |  |  |
|**homeVariant** | [**HomeVariantEnum**](#HomeVariantEnum) |  |  |
|**primaryPath** | [**PrimaryPathEnum**](#PrimaryPathEnum) |  |  |
|**secondaryPaths** | [**List&lt;SecondaryPathsEnum&gt;**](#List&lt;SecondaryPathsEnum&gt;) |  |  [optional] |
|**persona** | [**PersonaEnum**](#PersonaEnum) |  |  [optional] |
|**teamSize** | [**TeamSizeEnum**](#TeamSizeEnum) |  |  [optional] |
|**checklist** | [**HomeExperienceChecklistDto**](HomeExperienceChecklistDto) |  |  [optional] |
|**firstValue** | [**HomeExperienceFirstValueDto**](HomeExperienceFirstValueDto) |  |  |
|**upgradeContext** | [**HomeExperienceUpgradeContextDto**](HomeExperienceUpgradeContextDto) |  |  [optional] |



## Enum: HomeVariantEnum

| Name | Value |
|---- | -----|
| NEW_USER | &quot;NEW_USER&quot; |
| RETURNING | &quot;RETURNING&quot; |
| CHILD | &quot;CHILD&quot; |



## Enum: PrimaryPathEnum

| Name | Value |
|---- | -----|
| DEVELOPERS | &quot;DEVELOPERS&quot; |
| EMAIL | &quot;EMAIL&quot; |
| TEST | &quot;TEST&quot; |
| PHONE | &quot;PHONE&quot; |
| EXTRACT | &quot;EXTRACT&quot; |
| AUTOMATIONS | &quot;AUTOMATIONS&quot; |
| OBSERVE | &quot;OBSERVE&quot; |
| AUTOMATIONS_AI | &quot;AUTOMATIONS_AI&quot; |
| UNDECIDED | &quot;UNDECIDED&quot; |



## Enum: List&lt;SecondaryPathsEnum&gt;

| Name | Value |
|---- | -----|
| DEVELOPERS | &quot;DEVELOPERS&quot; |
| EMAIL | &quot;EMAIL&quot; |
| TEST | &quot;TEST&quot; |
| PHONE | &quot;PHONE&quot; |
| EXTRACT | &quot;EXTRACT&quot; |
| AUTOMATIONS | &quot;AUTOMATIONS&quot; |
| OBSERVE | &quot;OBSERVE&quot; |
| AUTOMATIONS_AI | &quot;AUTOMATIONS_AI&quot; |
| UNDECIDED | &quot;UNDECIDED&quot; |



## Enum: PersonaEnum

| Name | Value |
|---- | -----|
| DEVELOPER | &quot;DEVELOPER&quot; |
| QA | &quot;QA&quot; |
| MARKETER | &quot;MARKETER&quot; |
| OPS | &quot;OPS&quot; |
| SUPPORT | &quot;SUPPORT&quot; |
| OTHER | &quot;OTHER&quot; |



## Enum: TeamSizeEnum

| Name | Value |
|---- | -----|
| SOLO | &quot;SOLO&quot; |
| TEAM | &quot;TEAM&quot; |
| ENTERPRISE | &quot;ENTERPRISE&quot; |



