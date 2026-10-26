

# EmailThreadDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | ID of email thread |  |
|**userId** | **UUID** | User ID |  |
|**inboxId** | **UUID** | Inbox ID |  [optional] |
|**from** | **String** | From sender |  [optional] |
|**to** | **List&lt;String&gt;** | To recipients |  |
|**cc** | **List&lt;String&gt;** | CC recipients |  [optional] |
|**bcc** | **List&lt;String&gt;** | BCC recipients |  [optional] |
|**sender** | [**Sender**](Sender) |  |  [optional] |
|**recipients** | [**EmailRecipients**](EmailRecipients) |  |  [optional] |
|**subject** | **String** | Thread topic subject |  [optional] |
|**createdAt** | **OffsetDateTime** | Created at DateTime |  |
|**updatedAt** | **OffsetDateTime** | Updated at DateTime |  |



