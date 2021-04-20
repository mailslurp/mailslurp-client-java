

# PageThreadProjection

Paginated email projection results. EmailProjections and EmailPreviews are essentially the same but have legacy naming issues. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full email entity use the projection ID with individual method calls. For emails there are several methods for fetching message bodies and attachments.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;ThreadProjection&gt;**](ThreadProjection) |  |  [optional]
**empty** | **Boolean** |  |  [optional]
**first** | **Boolean** |  |  [optional]
**last** | **Boolean** |  |  [optional]
**number** | **Integer** |  |  [optional]
**numberOfElements** | **Integer** |  |  [optional]
**pageable** | [**Pageable**](Pageable) |  |  [optional]
**size** | **Integer** |  |  [optional]
**sort** | [**Sort**](Sort) |  |  [optional]
**totalElements** | **Long** |  |  [optional]
**totalPages** | **Integer** |  |  [optional]



