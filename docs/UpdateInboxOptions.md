

# UpdateInboxOptions

Options for updating inbox properties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Optional description of an inbox for labelling purposes |  [optional]
**expiresAt** | [**OffsetDateTime**](OffsetDateTime.md) | When, if ever, will the inbox expire and be deleted. If null then this inbox is permanent and the emails in it won&#39;t be deleted. |  [optional]
**favourite** | **Boolean** | Is the inbox favourited |  [optional]
**name** | **String** | Optional name of the inbox. Displayed in the dashboard for easier search |  [optional]
**tags** | **List&lt;String&gt;** | Tags that inbox has been tagged with |  [optional]



