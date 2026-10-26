

# RerunDevicePreviewTargetsOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**targetIds** | **List&lt;UUID&gt;** | Device preview target IDs to rerun within the existing run. Use target IDs from DevicePreviewRunResultsDto.targets. |  |
|**failedOnly** | **Boolean** | When true, only selected targets in failed terminal states are rerun. Set false to rerun any selected target; a target that already completed successfully uses its credit cost again. Defaults to true. |  |



