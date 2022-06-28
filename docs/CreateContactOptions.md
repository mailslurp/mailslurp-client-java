

# CreateContactOptions

Options for creating an email contact in address book
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**firstName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**emailAddresses** | **List&lt;String&gt;** | Set of email addresses belonging to the contact |  [optional]
**tags** | **List&lt;String&gt;** | Tags that can be used to search and group contacts |  [optional]
**metaData** | [**Object**]() |  |  [optional]
**optOut** | **Boolean** | Has the user explicitly or implicitly opted out of being contacted? If so MailSlurp will ignore them in all actions. |  [optional]
**groupId** | [**UUID**](UUID) | Group IDs that contact belongs to |  [optional]



