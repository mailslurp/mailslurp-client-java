

# PhoneMessageThreadItemProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**body** | **String** |  |  |
|**created** | **OffsetDateTime** |  |  |
|**phoneNumberId** | **UUID** |  |  |
|**messageDirection** | [**MessageDirectionEnum**](#MessageDirectionEnum) |  |  |
|**fromPhoneNumber** | **String** |  |  |
|**toPhoneNumber** | **String** |  |  |



## Enum: MessageDirectionEnum

| Name | Value |
|---- | -----|
| OUTBOUND | &quot;OUTBOUND&quot; |
| INBOUND | &quot;INBOUND&quot; |



