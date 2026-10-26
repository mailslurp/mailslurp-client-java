

# CreatePublicSpamTestOptions

Create a public spam test using MailSlurp-managed inbox placement seed addresses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fromEmail** | **String** | Optional sender email address. If provided, MailSlurp will also derive senderDomain for compatibility with inbox placement service versions that still expect it. |  [optional] |
|**senderDomain** | **String** | Optional sender domain. If omitted and fromEmail is provided, MailSlurp derives it automatically. |  [optional] |
|**requestedSegment** | [**RequestedSegmentEnum**](#RequestedSegmentEnum) | Requested seed cohort for the placement test. |  |
|**addressFormat** | [**AddressFormatEnum**](#AddressFormatEnum) | Address export format for the returned seed addresses. |  |
|**captchaToken** | **String** | Optional captcha token when captcha protection is enabled. |  [optional] |



## Enum: RequestedSegmentEnum

| Name | Value |
|---- | -----|
| ALL_INBOXES | &quot;ALL_INBOXES&quot; |
| PERSONAL_INBOXES | &quot;PERSONAL_INBOXES&quot; |
| PROFESSIONAL_INBOXES | &quot;PROFESSIONAL_INBOXES&quot; |



## Enum: AddressFormatEnum

| Name | Value |
|---- | -----|
| COMMA | &quot;COMMA&quot; |
| NEWLINE | &quot;NEWLINE&quot; |



