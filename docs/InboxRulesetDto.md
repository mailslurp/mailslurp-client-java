

# InboxRulesetDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  |  [optional]
**inboxId** | [**UUID**](UUID) |  |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**target** | **String** |  |  [optional]
**handler** | [**HandlerEnum**](#HandlerEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  |  [optional]



## Enum: ScopeEnum

Name | Value
---- | -----
RECEIVING_EMAILS | &quot;RECEIVING_EMAILS&quot;
SENDING_EMAILS | &quot;SENDING_EMAILS&quot;



## Enum: ActionEnum

Name | Value
---- | -----
BLOCK | &quot;BLOCK&quot;
ALLOW | &quot;ALLOW&quot;
FILTER_REMOVE | &quot;FILTER_REMOVE&quot;



## Enum: HandlerEnum

Name | Value
---- | -----
EXCEPTION | &quot;EXCEPTION&quot;



