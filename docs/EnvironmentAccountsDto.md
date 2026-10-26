

# EnvironmentAccountsDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountGroupId** | **UUID** |  |  [optional] |
|**ownerUserId** | **UUID** |  |  |
|**callerUserId** | **UUID** |  |  |
|**callerRole** | [**CallerRoleEnum**](#CallerRoleEnum) |  |  |
|**activeEnvironmentUserId** | **UUID** |  |  |
|**activeEnvironmentLabel** | **String** |  |  [optional] |
|**links** | [**List&lt;EnvironmentAccountLinkDto&gt;**](EnvironmentAccountLinkDto) |  |  |



## Enum: CallerRoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;OWNER&quot; |
| ADMIN | &quot;ADMIN&quot; |
| MEMBER | &quot;MEMBER&quot; |



