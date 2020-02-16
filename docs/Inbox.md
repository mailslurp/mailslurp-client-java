

# Inbox

Representation of an inbox with an email address. Emails can be sent to or from this email address.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | When was the inbox created |  [optional]
**description** | **String** | Optional description of an inbox for labelling purposes |  [optional]
**emailAddress** | **String** | The inbox&#39;s email address. Send an email to this address and the inbox will receive and store it for you. To retrieve the email use the Inbox and Email Controller endpoints. |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When, if ever, will the inbox expire and be deleted. If null then this inbox is permanent and the emails in it won&#39;t be deleted. |  [optional]
**favourite** | **Boolean** | Is the inbox favourited |  [optional]
**id** | [**UUID**](UUID.md) | ID of the inbox |  [optional]
**name** | **String** | Optional name of the inbox. Displayed in the dashboard for easier search |  [optional]
**tags** | **List&lt;String&gt;** | Tags that inbox has been tagged with |  [optional]
**userId** | [**UUID**](UUID.md) | ID of user that inbox belongs to |  [optional]



