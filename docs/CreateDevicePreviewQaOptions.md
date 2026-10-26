

# CreateDevicePreviewQaOptions

Optional QA checks to run after render creation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAudit** | **Boolean** | Run and persist an email content audit alongside the device preview run. |  [optional] |
|**domainMonitor** | **Boolean** | Create or reuse a manual domain monitor for the sender domain and run it alongside the device preview run. |  [optional] |
|**senderDomain** | **String** | Sender domain to use for domain monitor QA when the source email does not include a real From domain, such as HTML imports. |  [optional] |



