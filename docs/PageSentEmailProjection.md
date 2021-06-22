

# PageSentEmailProjection

Paginated sent email results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full sent email entity use the projection ID with individual method calls.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;SentEmailProjection&gt;**](SentEmailProjection) | Collection of items |  [optional]
**empty** | **Boolean** |  |  [optional]
**first** | **Boolean** |  |  [optional]
**last** | **Boolean** |  |  [optional]
**number** | **Integer** | Page number starting at 0 |  [optional]
**numberOfElements** | **Integer** | Number of items returned |  [optional]
**pageable** | [**Pageable**](Pageable) |  |  [optional]
**size** | **Integer** | Size of page requested |  [optional]
**sort** | [**Sort**](Sort) |  |  [optional]
**totalElements** | **Long** | Total number of items available for querying |  [optional]
**totalPages** | **Integer** | Total number of pages available |  [optional]



