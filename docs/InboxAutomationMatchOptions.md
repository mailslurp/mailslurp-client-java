

# InboxAutomationMatchOptions

Nested AND/OR match tree for inbox forwarders and repliers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | Boolean operator used to combine inbox automation match rules. |  |
|**matches** | [**List&lt;InboxAutomationMatchOption&gt;**](InboxAutomationMatchOption) | Leaf match rules in this group. |  [optional] |
|**groups** | [**List&lt;InboxAutomationMatchOptions&gt;**](InboxAutomationMatchOptions) | Nested child groups. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



