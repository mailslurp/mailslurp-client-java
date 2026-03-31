

# AITransformMappingProjection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  |
|**aiTransformId** | **UUID** |  |  |
|**entityId** | **UUID** |  |  [optional] |
|**contentSelector** | [**ContentSelectorEnum**](#ContentSelectorEnum) |  |  [optional] |
|**triggerSelector** | [**TriggerSelectorEnum**](#TriggerSelectorEnum) |  |  [optional] |



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



