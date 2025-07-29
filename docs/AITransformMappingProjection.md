

# AITransformMappingProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **UUID** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**aiTransformId** | **UUID** |  |  |
|**entityId** | **UUID** |  |  [optional] |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  |
|**contentSelector** | [**ContentSelectorEnum**](#ContentSelectorEnum) |  |  [optional] |
|**triggerSelector** | [**TriggerSelectorEnum**](#TriggerSelectorEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |



## Enum: EntityTypeEnum

| Name | Value |
|---- | -----|
| INBOX | &quot;INBOX&quot; |
| PHONE | &quot;PHONE&quot; |



## Enum: ContentSelectorEnum

| Name | Value |
|---- | -----|
| RAW | &quot;RAW&quot; |
| BODY | &quot;BODY&quot; |
| BODY_ATTACHMENTS | &quot;BODY_ATTACHMENTS&quot; |



## Enum: TriggerSelectorEnum

| Name | Value |
|---- | -----|
| PER_MESSAGE | &quot;PER_MESSAGE&quot; |
| PER_ATTACHMENT | &quot;PER_ATTACHMENT&quot; |



