

# SendingConnectionSmtpDefaults


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** |  |  [optional] |
|**hostOptions** | [**List&lt;SendingConnectionSmtpHostOption&gt;**](SendingConnectionSmtpHostOption) |  |  |
|**ports** | **List&lt;Integer&gt;** |  |  |
|**recommendedPort** | **Integer** |  |  [optional] |
|**recommendedSecurity** | [**RecommendedSecurityEnum**](#RecommendedSecurityEnum) |  |  [optional] |
|**defaultUsername** | **String** |  |  [optional] |
|**usernameHint** | **String** |  |  [optional] |
|**passwordHint** | **String** |  |  [optional] |



## Enum: RecommendedSecurityEnum

| Name | Value |
|---- | -----|
| START_TLS | &quot;START_TLS&quot; |
| TLS | &quot;TLS&quot; |



