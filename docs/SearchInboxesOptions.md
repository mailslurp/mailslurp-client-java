

# SearchInboxesOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pageIndex** | **Integer** | Optional page index in list pagination |  [optional] |
|**pageSize** | **Integer** | Optional page size in list pagination |  [optional] |
|**sortDirection** | [**SortDirectionEnum**](#SortDirectionEnum) | Optional createdAt sort direction ASC or DESC |  [optional] |
|**favourite** | **Boolean** | Optionally filter results for favourites only |  [optional] |
|**search** | **String** | Optionally filter by search words partial matching ID, tags, name, and email address |  [optional] |
|**tag** | **String** | Optionally filter by tags. Will return inboxes that include given tags |  [optional] |
|**since** | **OffsetDateTime** | Optional filter by created after given date time |  [optional] |
|**before** | **OffsetDateTime** | Optional filter by created before given date time |  [optional] |
|**inboxType** | [**InboxTypeEnum**](#InboxTypeEnum) | Type of inbox. HTTP inboxes are faster and better for most cases. SMTP inboxes are more suited for public facing inbound messages (but cannot send). |  [optional] |
|**inboxFunction** | [**InboxFunctionEnum**](#InboxFunctionEnum) | Optional filter by inbox function |  [optional] |
|**domainId** | **UUID** | Optional domain ID filter |  [optional] |



## Enum: SortDirectionEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



## Enum: InboxTypeEnum

| Name | Value |
|---- | -----|
| HTTP_INBOX | &quot;HTTP_INBOX&quot; |
| SMTP_INBOX | &quot;SMTP_INBOX&quot; |



## Enum: InboxFunctionEnum

| Name | Value |
|---- | -----|
| ALIAS | &quot;ALIAS&quot; |
| THREAD | &quot;THREAD&quot; |
| CATCH_ALL | &quot;CATCH_ALL&quot; |
| CONNECTOR | &quot;CONNECTOR&quot; |
| ACCOUNT | &quot;ACCOUNT&quot; |
| GUEST | &quot;GUEST&quot; |
| OAUTH_CONNECTION_GMAIL | &quot;OAUTH_CONNECTION_GMAIL&quot; |



