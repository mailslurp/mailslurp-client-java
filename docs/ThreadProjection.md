

# ThreadProjection

A thread is a message thread created for a message received by an alias

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of thread |  [optional] |
|**id** | **UUID** | ID of email thread |  |
|**subject** | **String** | Thread subject |  [optional] |
|**inboxId** | **UUID** | Inbox ID |  |
|**userId** | **UUID** | User ID |  |
|**createdAt** | **OffsetDateTime** | Created at DateTime |  |
|**updatedAt** | **OffsetDateTime** | Updated at DateTime |  |
|**to** | **List&lt;String&gt;** | To recipients |  |
|**bcc** | **List&lt;String&gt;** | BCC recipients |  [optional] |
|**cc** | **List&lt;String&gt;** | CC recipients |  [optional] |
|**aliasId** | **UUID** | Alias ID |  |



