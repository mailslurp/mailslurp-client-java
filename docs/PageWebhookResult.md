

# PageWebhookResult

Paginated webhook results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full entity use the projection ID with individual method calls.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | [**List&lt;WebhookResultDto&gt;**](WebhookResultDto) |  |  [optional] |
|**pageable** | [**PageableObject**](PageableObject) |  |  [optional] |
|**totalElements** | **Long** |  |  |
|**totalPages** | **Integer** |  |  |
|**last** | **Boolean** |  |  [optional] |
|**numberOfElements** | **Integer** |  |  [optional] |
|**first** | **Boolean** |  |  [optional] |
|**size** | **Integer** |  |  [optional] |
|**number** | **Integer** |  |  [optional] |
|**sort** | [**SortObject**](SortObject) |  |  [optional] |
|**empty** | **Boolean** |  |  [optional] |



