

# SearchEmailsOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inboxIds** | **List&lt;UUID&gt;** | Optional inbox ids to filter by. Can be repeated. By default will use all inboxes belonging to your account. |  [optional] |
|**pageIndex** | **Integer** | Optional page index in email list pagination |  [optional] |
|**pageSize** | **Integer** | Optional page size in email list pagination. Maximum size is 100. Use page index and sort to page through larger results |  [optional] |
|**sortDirection** | [**SortDirectionEnum**](#SortDirectionEnum) | Optional createdAt sort direction ASC or DESC |  [optional] |
|**unreadOnly** | **Boolean** | Optional filter for unread emails only. All emails are considered unread until they are viewed in the dashboard or requested directly |  [optional] |
|**searchFilter** | **String** | Optional search filter. Searches email recipients, sender, subject, email address and ID. Does not search email body |  [optional] |
|**since** | **OffsetDateTime** | Optional filter emails received after given date time |  [optional] |
|**before** | **OffsetDateTime** | Optional filter emails received before given date time |  [optional] |



## Enum: SortDirectionEnum

| Name | Value |
|---- | -----|
| ASC | &quot;ASC&quot; |
| DESC | &quot;DESC&quot; |



