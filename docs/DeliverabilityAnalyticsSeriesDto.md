

# DeliverabilityAnalyticsSeriesDto

Deliverability analytics response for time-range comparison

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional] |
|**bucket** | [**BucketEnum**](#BucketEnum) |  |  |
|**summary** | [**DeliverabilityAnalyticsSummaryDto**](DeliverabilityAnalyticsSummaryDto) |  |  |
|**runs** | [**List&lt;DeliverabilityAnalyticsRunDto&gt;**](DeliverabilityAnalyticsRunDto) |  |  |
|**points** | [**List&lt;DeliverabilityAnalyticsSeriesPointDto&gt;**](DeliverabilityAnalyticsSeriesPointDto) |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



## Enum: BucketEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;HOUR&quot; |
| DAY | &quot;DAY&quot; |



