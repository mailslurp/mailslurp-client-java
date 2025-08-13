

# PageSentEmailWithQueueProjection

Paginated sent email results for emails sent with queue. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full sent email entity use the projection ID with individual method calls.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**List&lt;SendWithQueueResult&gt;**](SendWithQueueResult) |  |  [optional] |
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



