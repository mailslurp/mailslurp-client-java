

# AgentCapabilitiesDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionId** | **UUID** |  |  |
|**accountId** | **UUID** |  |  |
|**name** | **String** |  |  |
|**role** | [**RoleEnum**](#RoleEnum) |  |  |
|**permissions** | **Set&lt;String&gt;** |  |  |
|**scope** | [**AgentCapabilityScopeDto**](AgentCapabilityScopeDto) |  |  |
|**features** | [**AgentCapabilityFeaturesDto**](AgentCapabilityFeaturesDto) |  |  |
|**limits** | [**AgentCapabilityLimitsDto**](AgentCapabilityLimitsDto) |  |  |
|**apiVersion** | **String** |  |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| AGENT_READ_ONLY | &quot;AGENT_READ_ONLY&quot; |
| AGENT_DRAFT_ONLY | &quot;AGENT_DRAFT_ONLY&quot; |
| AGENT_RESPONDER | &quot;AGENT_RESPONDER&quot; |
| AGENT_INBOX_MANAGER | &quot;AGENT_INBOX_MANAGER&quot; |
| AGENT_SUPPORT | &quot;AGENT_SUPPORT&quot; |
| AGENT_TOTP_MANAGER | &quot;AGENT_TOTP_MANAGER&quot; |



