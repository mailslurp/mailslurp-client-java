

# PageInboxProjection

Paginated inbox results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;InboxPreview&gt;**](InboxPreview) |  |  [optional]
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



