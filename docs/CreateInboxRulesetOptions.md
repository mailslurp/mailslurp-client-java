

# CreateInboxRulesetOptions

Options for creating inbox rulesets. Inbox rulesets can be used to block, allow, filter, or forward emails when sending or receiving using the inbox.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scope** | [**ScopeEnum**](#ScopeEnum) | What type of emails actions to apply ruleset to. Either &#x60;SENDING_EMAILS&#x60; or &#x60;RECEIVING_EMAILS&#x60; will apply action and target to any sending or receiving of emails respectively. |  |
|**action** | [**ActionEnum**](#ActionEnum) | Action to be taken when the ruleset matches an email for the given scope. For example: &#x60;BLOCK&#x60; action with target &#x60;*&#x60; and scope &#x60;SENDING_EMAILS&#x60; blocks sending to all recipients. Note &#x60;ALLOW&#x60; takes precedent over &#x60;BLOCK&#x60;. &#x60;FILTER_REMOVE&#x60; is like block but will remove offending email addresses during a send or receive event instead of blocking the action. |  |
|**target** | **String** | Target to match emails with. Can be a wild-card type pattern or a valid email address. For instance &#x60;*@gmail.com&#x60; matches all gmail addresses while &#x60;test@gmail.com&#x60; matches one address exactly. The target is applied to every recipient field email address when &#x60;SENDING_EMAILS&#x60; is the scope and is applied to sender of email when &#x60;RECEIVING_EMAILS&#x60;. |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| RECEIVING_EMAILS | &quot;RECEIVING_EMAILS&quot; |
| SENDING_EMAILS | &quot;SENDING_EMAILS&quot; |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| BLOCK | &quot;BLOCK&quot; |
| ALLOW | &quot;ALLOW&quot; |
| FILTER_REMOVE | &quot;FILTER_REMOVE&quot; |
| BOUNCE_SOFT | &quot;BOUNCE_SOFT&quot; |
| BOUNCE_HARD | &quot;BOUNCE_HARD&quot; |



