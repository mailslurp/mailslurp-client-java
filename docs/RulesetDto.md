

# RulesetDto

Rules for an inbox or phone number. Rulesets can be used to block, allow, filter, or bounce emails or SMS when sending or receiving.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**inboxId** | **UUID** |  |  [optional] |
|**phoneId** | **UUID** |  |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**action** | [**ActionEnum**](#ActionEnum) |  |  |
|**target** | **String** |  |  |
|**handler** | [**HandlerEnum**](#HandlerEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| RECEIVING_EMAILS | &quot;RECEIVING_EMAILS&quot; |
| SENDING_EMAILS | &quot;SENDING_EMAILS&quot; |
| RECEIVING_SMS | &quot;RECEIVING_SMS&quot; |
| SENDING_SMS | &quot;SENDING_SMS&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| BLOCK | &quot;BLOCK&quot; |
| ALLOW | &quot;ALLOW&quot; |
| FILTER_REMOVE | &quot;FILTER_REMOVE&quot; |
| BOUNCE_SOFT | &quot;BOUNCE_SOFT&quot; |
| BOUNCE_HARD | &quot;BOUNCE_HARD&quot; |



## Enum: HandlerEnum

| Name | Value |
|---- | -----|
| EXCEPTION | &quot;EXCEPTION&quot; |



