

# InboxPlacementAnalyticsBreakdownDto

Breakdown response for folders, providers, and sender groupings

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**senderDomain** | **String** |  |  [optional] |
|**fromEmail** | **String** |  |  [optional] |
|**summary** | [**InboxPlacementAnalyticsSummaryDto**](InboxPlacementAnalyticsSummaryDto) |  |  |
|**folders** | [**List&lt;InboxPlacementFolderBreakdownDto&gt;**](InboxPlacementFolderBreakdownDto) |  |  |
|**providers** | [**List&lt;InboxPlacementProviderBreakdownDto&gt;**](InboxPlacementProviderBreakdownDto) |  |  |
|**senderDomains** | [**List&lt;InboxPlacementSenderBreakdownDto&gt;**](InboxPlacementSenderBreakdownDto) |  |  |
|**fromEmails** | [**List&lt;InboxPlacementSenderBreakdownDto&gt;**](InboxPlacementSenderBreakdownDto) |  |  |



