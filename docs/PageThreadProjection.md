

# PageThreadProjection

Paginated email projection results. EmailProjections and EmailPreviews are essentially the same but have legacy naming issues. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full email entity use the projection ID with individual method calls. For emails there are several methods for fetching message bodies and attachments.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;ThreadProjection&gt;**](ThreadProjection) |  |  [optional]
**pageable** | [**PageableObject**](PageableObject) |  |  [optional]
**total** | **Long** |  |  [optional]
**last** | **Boolean** |  |  [optional]
**totalPages** | **Integer** |  |  [optional]
**totalElements** | **Long** |  |  [optional]
**size** | **Integer** |  |  [optional]
**number** | **Integer** |  |  [optional]
**sort** | [**Sort**](Sort) |  |  [optional]
**first** | **Boolean** |  |  [optional]
**numberOfElements** | **Integer** |  |  [optional]
**empty** | **Boolean** |  |  [optional]



