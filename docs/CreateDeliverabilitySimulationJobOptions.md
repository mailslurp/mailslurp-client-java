

# CreateDeliverabilitySimulationJobOptions

Create a simulation job for a deliverability test

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**senderInboxId** | **UUID** | Sender inbox ID for INBOX scope tests |  [optional] |
|**senderPhoneId** | **UUID** | Sender phone ID for PHONE scope tests |  [optional] |
|**email** | [**DeliverabilitySimulationEmailOptions**](DeliverabilitySimulationEmailOptions) |  |  [optional] |
|**sms** | [**DeliverabilitySimulationSmsOptions**](DeliverabilitySimulationSmsOptions) |  |  [optional] |
|**delayMs** | **Long** | Delay between individual sends in milliseconds |  [optional] |
|**batchSize** | **Integer** | Maximum sends processed per scheduler batch |  [optional] |
|**sendsPerTarget** | **Long** | Optional fixed sends per target. If omitted this is derived from test expectations. |  [optional] |



