

# PageAITransformResultProjection

Paginated AI Transform result entities. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**List&lt;AITransformResultProjectionDto&gt;**](AITransformResultProjectionDto) |  |  [optional] |
|**pageable** | [**PageableObject**](PageableObject) |  |  [optional] |
|**columns** | **List&lt;String&gt;** |  |  |
|**totalElements** | **Long** |  |  |
|**totalPages** | **Integer** |  |  |
|**last** | **Boolean** |  |  [optional] |
|**size** | **Integer** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**numberOfElements** | **Integer** |  |  [optional] |
|**sort** | [**SortObject**](SortObject) |  |  [optional] |
|**first** | **Boolean** |  |  [optional] |
|**empty** | **Boolean** |  |  [optional] |



