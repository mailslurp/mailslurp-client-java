

# GenerateStructuredContentEmailOptions

Options for generating structured content output from an email

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailId** | **UUID** | Email ID to read and pass to AI |  |
|**contentSelector** | [**ContentSelectorEnum**](#ContentSelectorEnum) | Content selector to select part of email to operate on |  [optional] |
|**instructions** | **String** | Optional instructions for the AI to follow. Try to be precise and clear. You can include examples and hints. |  [optional] |
|**outputSchema** | [**StructuredOutputSchema**](StructuredOutputSchema) |  |  |



## Enum: ContentSelectorEnum

| Name | Value |
|---- | -----|
| RAW | &quot;RAW&quot; |
| BODY | &quot;BODY&quot; |



