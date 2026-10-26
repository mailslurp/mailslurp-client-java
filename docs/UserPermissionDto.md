

# UserPermissionDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  |
|**userId** | **UUID** |  |  [optional] |
|**organizationId** | **UUID** |  |  [optional] |
|**roleId** | **UUID** |  |  [optional] |
|**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: PermissionTypeEnum

| Name | Value |
|---- | -----|
| CREATE_INBOX | &quot;CREATE_INBOX&quot; |
| DELETE_INBOX | &quot;DELETE_INBOX&quot; |
| DELETE_EMAIL | &quot;DELETE_EMAIL&quot; |
| DELETE_ATTACHMENT | &quot;DELETE_ATTACHMENT&quot; |
| DELETE_SMS | &quot;DELETE_SMS&quot; |
| UPDATE_INBOX | &quot;UPDATE_INBOX&quot; |
| READ_EMAIL | &quot;READ_EMAIL&quot; |
| READ_EMAIL_DRAFT | &quot;READ_EMAIL_DRAFT&quot; |
| READ_SMS | &quot;READ_SMS&quot; |
| REPLY_EMAIL | &quot;REPLY_EMAIL&quot; |
| CREATE_EMAIL_DRAFT | &quot;CREATE_EMAIL_DRAFT&quot; |
| UPDATE_EMAIL_DRAFT | &quot;UPDATE_EMAIL_DRAFT&quot; |
| DELETE_EMAIL_DRAFT | &quot;DELETE_EMAIL_DRAFT&quot; |
| SEND_EMAIL_DRAFT | &quot;SEND_EMAIL_DRAFT&quot; |
| AGENT_READ_EMAIL | &quot;AGENT_READ_EMAIL&quot; |
| AGENT_REPLY_EMAIL | &quot;AGENT_REPLY_EMAIL&quot; |
| AGENT_READ_EMAIL_DRAFT | &quot;AGENT_READ_EMAIL_DRAFT&quot; |
| AGENT_CREATE_EMAIL_DRAFT | &quot;AGENT_CREATE_EMAIL_DRAFT&quot; |
| AGENT_UPDATE_EMAIL_DRAFT | &quot;AGENT_UPDATE_EMAIL_DRAFT&quot; |
| AGENT_DELETE_EMAIL_DRAFT | &quot;AGENT_DELETE_EMAIL_DRAFT&quot; |
| AGENT_SEND_EMAIL_DRAFT | &quot;AGENT_SEND_EMAIL_DRAFT&quot; |
| AGENT_CREATE_INBOX | &quot;AGENT_CREATE_INBOX&quot; |
| AGENT_UPDATE_INBOX | &quot;AGENT_UPDATE_INBOX&quot; |
| AGENT_READ_TOTP_DEVICE | &quot;AGENT_READ_TOTP_DEVICE&quot; |
| AGENT_CREATE_TOTP_DEVICE | &quot;AGENT_CREATE_TOTP_DEVICE&quot; |
| AGENT_UPDATE_TOTP_DEVICE | &quot;AGENT_UPDATE_TOTP_DEVICE&quot; |
| AGENT_DELETE_TOTP_DEVICE | &quot;AGENT_DELETE_TOTP_DEVICE&quot; |
| AGENT_GENERATE_TOTP_CODE | &quot;AGENT_GENERATE_TOTP_CODE&quot; |
| AGENT_READ_SMS | &quot;AGENT_READ_SMS&quot; |
| AGENT_SEND_SMS | &quot;AGENT_SEND_SMS&quot; |
| REPLY_SMS | &quot;REPLY_SMS&quot; |
| ACCESS_EMAIL | &quot;ACCESS_EMAIL&quot; |
| ACCESS_SMS | &quot;ACCESS_SMS&quot; |
| ACCESS_EMAIL_SMS | &quot;ACCESS_EMAIL_SMS&quot; |
| CREATE_TEAM_USER | &quot;CREATE_TEAM_USER&quot; |
| READ_TEAM_USER | &quot;READ_TEAM_USER&quot; |
| DELETE_TEAM_USER | &quot;DELETE_TEAM_USER&quot; |
| UPDATE_TEAM_USER | &quot;UPDATE_TEAM_USER&quot; |
| MANAGE_ORGANIZATION | &quot;MANAGE_ORGANIZATION&quot; |
| MANAGE_ORGANIZATION_SETTINGS | &quot;MANAGE_ORGANIZATION_SETTINGS&quot; |
| MANAGE_ORGANIZATION_SAML | &quot;MANAGE_ORGANIZATION_SAML&quot; |
| MANAGE_ACCOUNT_SETTINGS | &quot;MANAGE_ACCOUNT_SETTINGS&quot; |
| MANAGE_BILLING | &quot;MANAGE_BILLING&quot; |
| MANAGE_API_KEYS | &quot;MANAGE_API_KEYS&quot; |
| MANAGE_EXPORTS | &quot;MANAGE_EXPORTS&quot; |
| MANAGE_NOTIFICATIONS | &quot;MANAGE_NOTIFICATIONS&quot; |



