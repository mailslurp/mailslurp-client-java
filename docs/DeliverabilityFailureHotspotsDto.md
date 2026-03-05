

# DeliverabilityFailureHotspotsDto

Deliverability failure hotspot response for range comparisons

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**since** | **OffsetDateTime** |  |  |
|**before** | **OffsetDateTime** |  |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional] |
|**entityHotspots** | [**List&lt;DeliverabilityFailureEntityHotspotDto&gt;**](DeliverabilityFailureEntityHotspotDto) |  |  |
|**phoneDimensionHotspots** | [**List&lt;DeliverabilityFailurePhoneDimensionHotspotDto&gt;**](DeliverabilityFailurePhoneDimensionHotspotDto) |  |  |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



