

# InboxPlacementAnalyticsRunDto

Recent inbox placement run row for analytics tables

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**remoteTestId** | **UUID** |  |  |
|**senderDomain** | **String** |  |  [optional] |
|**fromEmail** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**reportStatus** | **String** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**completedAt** | **OffsetDateTime** |  |  [optional] |
|**totalTargets** | **Integer** |  |  |
|**matchedTargets** | **Integer** |  |  |
|**deliveredTargets** | **Integer** |  |  |
|**inboxTargets** | **Integer** |  |  |
|**spamTargets** | **Integer** |  |  |
|**promotionTargets** | **Integer** |  |  |
|**socialTargets** | **Integer** |  |  |
|**updateTargets** | **Integer** |  |  |
|**forumTargets** | **Integer** |  |  |
|**otherFolderTargets** | **Integer** |  |  |
|**notReceivedTargets** | **Integer** |  |  |
|**deliveredRatePercentage** | **Double** |  |  |
|**inboxRatePercentage** | **Double** |  |  |
|**spamRatePercentage** | **Double** |  |  |
|**promotionRatePercentage** | **Double** |  |  |
|**notReceivedRatePercentage** | **Double** |  |  |



