

# PageEmailProjection

Paginated email projection results. EmailProjections and EmailPreviews are essentially the same but have legacy naming issues. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full email entity use the projection ID with individual method calls. For emails there are several methods for fetching message bodies and attachments.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;EmailProjection&gt;**](EmailProjection) |  |  [optional]
**pageable** | [**Pageable**](Pageable) |  |  [optional]
**totalElements** | **Long** |  |  [optional]
**totalPages** | **Integer** |  |  [optional]
**last** | **Boolean** |  |  [optional]
**size** | **Integer** |  |  [optional]
**number** | **Integer** |  |  [optional]
**sort** | [**Sort**](Sort) |  |  [optional]
**numberOfElements** | **Integer** |  |  [optional]
**first** | **Boolean** |  |  [optional]
**empty** | **Boolean** |  |  [optional]



