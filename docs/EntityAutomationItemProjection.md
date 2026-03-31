

# EntityAutomationItemProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**phoneId** | **UUID** |  |  [optional] |
|**action** | **String** |  |  [optional] |
|**automationType** | [**AutomationTypeEnum**](#AutomationTypeEnum) |  |  |



## Enum: AutomationTypeEnum

| Name | Value |
|---- | -----|
| INBOX_FORWARDER | &quot;INBOX_FORWARDER&quot; |
| INBOX_REPLIER | &quot;INBOX_REPLIER&quot; |
| INBOX_RULESET | &quot;INBOX_RULESET&quot; |



