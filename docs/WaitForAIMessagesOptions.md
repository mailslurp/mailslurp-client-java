

# WaitForAIMessagesOptions

Wait for every named delivery expectation across inboxes and phones using one shared timeout and token budget. A message cannot satisfy multiple expectations unless allowSharedMessages is true.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expectations** | [**List&lt;AIMessageExpectation&gt;**](AIMessageExpectation) |  |  |
|**since** | **OffsetDateTime** |  |  |
|**timeout** | **Long** |  |  |
|**before** | **OffsetDateTime** |  |  [optional] |
|**allowSharedMessages** | **Boolean** |  |  |
|**aiOptions** | [**AIMessageAIOptions**](AIMessageAIOptions) |  |  |



