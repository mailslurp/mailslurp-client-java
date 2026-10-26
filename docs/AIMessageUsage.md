

# AIMessageUsage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokens** | **Long** | Consumed MailSlurp AI tokens after applying the model multiplier. These are not raw provider tokens. |  |
|**candidatesEvaluated** | **Integer** |  |  |
|**complete** | **Boolean** | False when a timed-out provider invocation is still settling. The reservation remains held and actual usage is settled when it finishes. |  |
|**reservedTokens** | **Long** | AI tokens held for provider attempts with unknown usage. Excluded from tokens; complete remains false until reconciliation. |  |



