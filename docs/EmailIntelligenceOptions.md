

# EmailIntelligenceOptions

Request options for running email intelligence checks on one or more inputs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targets** | **List&lt;String&gt;** | Email addresses or domains to score. |  |
|**page** | **Integer** | Zero-based page index for processing a subset of the target list. |  [optional] |
|**size** | **Integer** | Page size for processing a subset of the target list. |  [optional] |
|**ignoreCache** | **Boolean** | Ignore cached intelligence values and force recomputation. |  [optional] |
|**includeEmailValidation** | **Boolean** | Also run mailbox safety verification using the existing verification client for email inputs. |  [optional] |
|**tests** | [**EmailIntelligenceTestsOptions**](EmailIntelligenceTestsOptions) |  |  [optional] |



