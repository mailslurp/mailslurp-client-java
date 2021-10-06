

# InboxRulesetDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) |  | 
**handler** | [**HandlerEnum**](#HandlerEnum) |  | 
**id** | [**UUID**](UUID) |  | 
**inboxId** | [**UUID**](UUID) |  | 
**scope** | [**ScopeEnum**](#ScopeEnum) |  | 
**target** | **String** |  | 



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



## Enum: ScopeEnum

Name | Value
---- | -----
RECEIVING_EMAILS | &quot;RECEIVING_EMAILS&quot;
SENDING_EMAILS | &quot;SENDING_EMAILS&quot;



