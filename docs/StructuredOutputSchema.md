

# StructuredOutputSchema

JSON output schema for structured content repsonses. This schema dictates the format that an AI should use when responding to your instructions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anyOf** | [**List&lt;StructuredOutputSchema&gt;**](StructuredOutputSchema) |  |  [optional] |
|**_default** | **Object** |  |  [optional] |
|**description** | **String** | Provide a description of the schema to help the AI understand the schema. |  [optional] |
|**enumValues** | **List&lt;String&gt;** | When using type string and format enum pass a collection of enum values here. |  [optional] |
|**example** | **Object** |  |  [optional] |
|**format** | **String** | Format for string types. Can be null, date-time or enum. |  [optional] |
|**items** | [**StructuredOutputSchema**](StructuredOutputSchema) |  |  [optional] |
|**maxItems** | **Long** |  |  [optional] |
|**minItems** | **Long** |  |  [optional] |
|**maxLength** | **Long** |  |  [optional] |
|**minLength** | **Long** |  |  [optional] |
|**pattern** | **String** | Regex pattern for STRING type |  [optional] |
|**properties** | [**Map&lt;String, StructuredOutputSchema&gt;**](StructuredOutputSchema) | Properties of an OBJECT schema. These are key value pairs where the key is the property name and the value is the schema for that property. |  [optional] |
|**propertyOrdering** | **List&lt;String&gt;** | Pass an array of property names to specify the order of properties in the generated JSON object if required. |  [optional] |
|**required** | **List&lt;String&gt;** | Is field required |  [optional] |
|**maxProperties** | **Long** |  |  [optional] |
|**minProperties** | **Long** |  |  [optional] |
|**maximum** | **BigDecimal** |  |  [optional] |
|**minimum** | **BigDecimal** |  |  [optional] |
|**nullable** | **Boolean** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Primitive JSON schema types with a fallback CUSTOM for unknown values. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| NUMBER | &quot;number&quot; |
| INTEGER | &quot;integer&quot; |
| BOOLEAN | &quot;boolean&quot; |
| OBJECT | &quot;object&quot; |
| ARRAY | &quot;array&quot; |
| NULL | &quot;null&quot; |



