

# ThreadProjection

A thread is a message thread created for a message received by an alias
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of thread |  [optional]
**id** | [**UUID**](UUID) | ID of email thread | 
**subject** | **String** | Thread subject |  [optional]
**inboxId** | [**UUID**](UUID) | Inbox ID | 
**userId** | [**UUID**](UUID) | User ID | 
**to** | **List&lt;String&gt;** | To recipients | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime) | Created at DateTime | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime) | Updated at DateTime | 
**bcc** | **List&lt;String&gt;** | BCC recipients |  [optional]
**cc** | **List&lt;String&gt;** | CC recipients |  [optional]
**aliasId** | [**UUID**](UUID) | Alias ID | 



