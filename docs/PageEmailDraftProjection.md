

# PageEmailDraftProjection

Paginated email draft results. Page index starts at zero. Projection results omit full send options; fetch a draft by ID to retrieve and edit the full send options.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**List&lt;EmailDraftProjection&gt;**](EmailDraftProjection) |  |  [optional] |
|**pageable** | [**PageableObject**](PageableObject) |  |  [optional] |
|**totalPages** | **Integer** |  |  |
|**totalElements** | **Long** |  |  |
|**last** | **Boolean** |  |  [optional] |
|**first** | **Boolean** |  |  [optional] |
|**size** | **Integer** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**sort** | [**SortObject**](SortObject) |  |  [optional] |
|**numberOfElements** | **Integer** |  |  [optional] |
|**empty** | **Boolean** |  |  [optional] |



