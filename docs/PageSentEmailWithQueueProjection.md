

# PageSentEmailWithQueueProjection

Paginated sent email results for emails sent with queue. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full sent email entity use the projection ID with individual method calls.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;SendWithQueueResult&gt;**](SendWithQueueResult) | Collection of items | 
**pageable** | [**PageableObject**](PageableObject) |  |  [optional]
**total** | **Long** |  |  [optional]
**size** | **Integer** | Size of page requested | 
**number** | **Integer** | Page number starting at 0 | 
**numberOfElements** | **Integer** | Number of items returned | 
**totalElements** | **Long** | Total number of items available for querying | 
**totalPages** | **Integer** | Total number of pages available | 
**last** | **Boolean** |  |  [optional]
**sort** | [**Sort**](Sort) |  |  [optional]
**first** | **Boolean** |  |  [optional]
**empty** | **Boolean** |  |  [optional]



