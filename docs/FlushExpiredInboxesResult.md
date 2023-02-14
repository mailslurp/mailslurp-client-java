

# FlushExpiredInboxesResult

Result from calling expire on any inboxes that have applicable expiration dates given current time.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inboxIds** | [**List&lt;UUID&gt;**](UUID) | Inbox IDs affected by expiration | 
**expireBefore** | [**OffsetDateTime**](OffsetDateTime) | DateTime to filter inboxes so that those expiring before this time are expired | 



