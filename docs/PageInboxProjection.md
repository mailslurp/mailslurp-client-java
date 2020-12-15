

# PageInboxProjection

Paginated inbox results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full inbox entity use the projection ID with individual method calls.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;InboxProjection&gt;**](InboxProjection.md) |  |  [optional]
**empty** | **Boolean** |  |  [optional]
**first** | **Boolean** |  |  [optional]
**last** | **Boolean** |  |  [optional]
**number** | **Integer** |  |  [optional]
**numberOfElements** | **Integer** |  |  [optional]
**pageable** | [**Pageable**](Pageable.md) |  |  [optional]
**size** | **Integer** |  |  [optional]
**sort** | [**Sort**](Sort.md) |  |  [optional]
**totalElements** | **Long** |  |  [optional]
**totalPages** | **Integer** |  |  [optional]



