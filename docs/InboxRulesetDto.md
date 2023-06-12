

# InboxRulesetDto

Rules for inbox
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) |  | 
**action** | [**ActionEnum**](#ActionEnum) |  | 
**target** | **String** |  | 
**handler** | [**HandlerEnum**](#HandlerEnum) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 



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



