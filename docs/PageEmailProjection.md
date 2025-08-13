

# PageEmailProjection

Paginated email projection results. EmailProjections and EmailPreviews are essentially the same but have legacy naming issues. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full email entity use the projection ID with individual method calls. For emails there are several methods for fetching message bodies and attachments.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**List&lt;EmailProjection&gt;**](EmailProjection) |  |  [optional] |
|**pageable** | [**PageableObject**](PageableObject) |  |  [optional] |
|**totalElements** | **Long** |  |  |
|**totalPages** | **Integer** |  |  |
|**last** | **Boolean** |  |  [optional] |
|**numberOfElements** | **Integer** |  |  [optional] |
|**sort** | [**SortObject**](SortObject) |  |  [optional] |
|**first** | **Boolean** |  |  [optional] |
|**size** | **Integer** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**empty** | **Boolean** |  |  [optional] |



