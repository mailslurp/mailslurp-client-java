

# DeliverabilityExpectation

Single expectation to evaluate against each selected entity

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Optional label for this expectation |  [optional] |
|**minCount** | **Long** | Minimum number of matching messages required for this expectation to pass |  |
|**from** | **String** | Optional sender filter. Matching is case-insensitive contains against inbound sender/from values. |  [optional] |
|**to** | **String** | Optional recipient filter. Matching is case-insensitive contains against recipient/to values. |  [optional] |
|**subject** | **String** | Optional subject filter for INBOX scope tests. Ignored for PHONE scope tests. |  [optional] |



