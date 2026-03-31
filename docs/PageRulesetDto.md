

# PageRulesetDto

Paginated ruleset results to deny or permit inbound or outbound SMS and email. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**List&lt;RulesetDto&gt;**](RulesetDto) |  |  [optional] |
|**pageable** | [**PageableObject**](PageableObject) |  |  [optional] |
|**totalPages** | **Integer** |  |  |
|**totalElements** | **Long** |  |  |
|**last** | **Boolean** |  |  [optional] |
|**size** | **Integer** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**numberOfElements** | **Integer** |  |  [optional] |
|**sort** | [**SortObject**](SortObject) |  |  [optional] |
|**first** | **Boolean** |  |  [optional] |
|**empty** | **Boolean** |  |  [optional] |



