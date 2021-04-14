

# PageWebhookProjection

Paginated webhook results. Page index starts at zero. Projection results may omit larger entity fields. For fetching a full inbox entity use the projection ID with individual method calls.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List&lt;WebhookProjection&gt;**](WebhookProjection) |  |  [optional]
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



