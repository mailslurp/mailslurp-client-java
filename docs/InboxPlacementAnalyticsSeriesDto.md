

# InboxPlacementAnalyticsSeriesDto

Inbox placement analytics response for charting over time

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**bucket** | [**BucketEnum**](#BucketEnum) |  |  |
|**groupBy** | [**GroupByEnum**](#GroupByEnum) |  |  |
|**senderDomain** | **String** |  |  [optional] |
|**fromEmail** | **String** |  |  [optional] |
|**summary** | [**InboxPlacementAnalyticsSummaryDto**](InboxPlacementAnalyticsSummaryDto) |  |  |
|**runs** | [**List&lt;InboxPlacementAnalyticsRunDto&gt;**](InboxPlacementAnalyticsRunDto) |  |  |
|**points** | [**List&lt;InboxPlacementAnalyticsSeriesPointDto&gt;**](InboxPlacementAnalyticsSeriesPointDto) |  |  |
|**groups** | [**List&lt;InboxPlacementAnalyticsGroupSeriesDto&gt;**](InboxPlacementAnalyticsGroupSeriesDto) |  |  |



## Enum: BucketEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| DAY | &quot;DAY&quot; |



## Enum: GroupByEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| SENDER_DOMAIN | &quot;SENDER_DOMAIN&quot; |
| FROM_EMAIL | &quot;FROM_EMAIL&quot; |



