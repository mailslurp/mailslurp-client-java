

# SmsMatchOptions

Optional filter for matching SMS based on fields. For instance filter results to only include emails whose `BODY` value does `CONTAIN` given match value. An example payload would be `{ matches: [{ field: 'BODY', should: 'CONTAIN', value: 'Welcome' }] }`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matches** | [**List&lt;SmsMatchOption&gt;**](SmsMatchOption) | Zero or more match options such as &#x60;{ field: &#39;BODY&#39;, should: &#39;CONTAIN&#39;, value: &#39;Welcome&#39; }&#x60;. Options are additive so if one does not match the SMS is excluded from results |  [optional] |
|**ai** | [**AIMessageMatchOptions**](AIMessageMatchOptions) |  |  [optional] |



