

# InboxForwarderTestOptions

Options for testing an inbox forwarder against a value

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**testValue** | **String** | Simple value to test against the forwarder&#39;s simple field/match rule. Required when emailId is not provided. |  [optional] |
|**emailId** | **UUID** | Optional email ID to evaluate the forwarder using full inbound email content (headers, recipients, and attachments). |  [optional] |



