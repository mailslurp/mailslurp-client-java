

# EmailAuditCheck

An evidence-backed static email check. Checks do not certify accessibility or legal compliance.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Email audit check category |  |
|**status** | [**StatusEnum**](#StatusEnum) | Outcome of an automated email check; REVIEW requires human verification and is not a compliance verdict |  |
|**title** | **String** |  |  |
|**message** | **String** |  |  |
|**recommendation** | **String** |  |  |
|**evidence** | **List&lt;String&gt;** |  |  |
|**referenceUrl** | **String** |  |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ACCESSIBILITY | &quot;ACCESSIBILITY&quot; |
| TEMPLATE | &quot;TEMPLATE&quot; |
| COMPLIANCE | &quot;COMPLIANCE&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| WARN | &quot;WARN&quot; |
| FAIL | &quot;FAIL&quot; |
| REVIEW | &quot;REVIEW&quot; |
| NOT_APPLICABLE | &quot;NOT_APPLICABLE&quot; |



