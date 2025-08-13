

# AliasThreadProjection

A thread is a message thread created for a message received by an alias

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **UUID** | User ID |  |
|**inboxId** | **UUID** | Inbox ID |  |
|**createdAt** | **OffsetDateTime** | Created at DateTime |  |
|**updatedAt** | **OffsetDateTime** | Updated at DateTime |  |
|**to** | **List&lt;String&gt;** | To recipients |  |
|**cc** | **List&lt;String&gt;** | CC recipients |  [optional] |
|**bcc** | **List&lt;String&gt;** | BCC recipients |  [optional] |
|**aliasId** | **UUID** | Alias ID |  |
|**subject** | **String** | Thread subject |  [optional] |
|**name** | **String** | Name of thread |  [optional] |
|**id** | **UUID** | ID of email thread |  |



