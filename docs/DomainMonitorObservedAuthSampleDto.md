

# DomainMonitorObservedAuthSampleDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**monitorId** | **UUID** |  |  |
|**domain** | **String** |  |  |
|**recipientAddress** | **String** |  |  |
|**sourceMessageId** | **String** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**fromAddress** | **String** |  |  [optional] |
|**fromDomain** | **String** |  |  [optional] |
|**returnPath** | **String** |  |  [optional] |
|**returnPathDomain** | **String** |  |  [optional] |
|**spfStatus** | [**SpfStatusEnum**](#SpfStatusEnum) |  |  |
|**spfEvaluatedDomain** | **String** |  |  [optional] |
|**spfSourceIp** | **String** |  |  [optional] |
|**dkimStatus** | [**DkimStatusEnum**](#DkimStatusEnum) |  |  |
|**dkimSignatures** | [**List&lt;DomainMonitorDkimSignatureDto&gt;**](DomainMonitorDkimSignatureDto) |  |  |
|**dmarcStatus** | [**DmarcStatusEnum**](#DmarcStatusEnum) |  |  |
|**dmarcAlignedIdentifier** | **String** |  |  [optional] |
|**trustedAuthenticationResultsSource** | **String** |  |  [optional] |
|**providerHints** | **List&lt;String&gt;** |  |  |
|**accepted** | **Boolean** |  |  |
|**validationError** | **String** |  |  [optional] |
|**receivedAt** | **OffsetDateTime** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: SpfStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| WARNING | &quot;WARNING&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



## Enum: DkimStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| WARNING | &quot;WARNING&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



## Enum: DmarcStatusEnum

| Name | Value |
|---- | -----|
| PASS | &quot;PASS&quot; |
| FAIL | &quot;FAIL&quot; |
| WARNING | &quot;WARNING&quot; |
| NOT_CHECKED | &quot;NOT_CHECKED&quot; |



