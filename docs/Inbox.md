

# Inbox

Representation of an inbox with an email address. Emails can be sent to or from this email address.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**description** | **String** | Description of inbox |  [optional]
**emailAddress** | **String** | The inbox&#39;s email address. Send an email to this address and the inbox will receive it |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When if ever will the inbox expire |  [optional]
**favourite** | **Boolean** | Is the inbox favourited |  [optional]
**id** | [**UUID**](UUID.md) |  | 
**name** | **String** | Name of inbox |  [optional]
**tags** | **List&lt;String&gt;** | Tags that inbox has been tagged with |  [optional]
**userId** | [**UUID**](UUID.md) |  |  [optional]



