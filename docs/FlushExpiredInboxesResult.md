

# FlushExpiredInboxesResult

Result from calling expire on any inboxes that have applicable expiration dates given current time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inboxIds** | **List&lt;UUID&gt;** | Inbox IDs affected by expiration |  |
|**expireBefore** | **OffsetDateTime** | DateTime to filter inboxes so that those expiring before this time are expired |  |



