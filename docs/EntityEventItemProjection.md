

# EntityEventItemProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneId** | **UUID** |  |  [optional] |
|**inboxId** | **UUID** |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  |  |
|**id** | **UUID** |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| WEBHOOK_EVENT | &quot;WEBHOOK_EVENT&quot; |
| INBOX_FORWARDER_EVENT | &quot;INBOX_FORWARDER_EVENT&quot; |
| INBOX_REPLIER_EVENT | &quot;INBOX_REPLIER_EVENT&quot; |
| INBOX_RULESET_EVENT | &quot;INBOX_RULESET_EVENT&quot; |
| ALIAS_EVENT | &quot;ALIAS_EVENT&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| INFO | &quot;INFO&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| WARNING | &quot;WARNING&quot; |
| DANGER | &quot;DANGER&quot; |



