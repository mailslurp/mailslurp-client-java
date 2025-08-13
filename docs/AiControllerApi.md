# AiControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransformer**](AiControllerApi#createTransformer) | **POST** /ai/transformer | Create a transformer for reuse in automations |
| [**createTransformerMappings**](AiControllerApi#createTransformerMappings) | **POST** /ai/transformer/mappings | Create transformer mapping |
| [**deleteAllTransformerMappings**](AiControllerApi#deleteAllTransformerMappings) | **DELETE** /ai/transformer/mappings | Delete all transformer mapping |
| [**deleteTransformer**](AiControllerApi#deleteTransformer) | **DELETE** /ai/transformer/{id} | Delete a transformer |
| [**deleteTransformerMapping**](AiControllerApi#deleteTransformerMapping) | **DELETE** /ai/transformer/mappings/{id} | Delete transformer mapping |
| [**deleteTransformers**](AiControllerApi#deleteTransformers) | **DELETE** /ai/transformer | Delete all transformers |
| [**generateStructuredContentFromAttachment**](AiControllerApi#generateStructuredContentFromAttachment) | **POST** /ai/structured-content/attachment | Generate structured content for an attachment |
| [**generateStructuredContentFromEmail**](AiControllerApi#generateStructuredContentFromEmail) | **POST** /ai/structured-content/email | Generate structured content for an email |
| [**generateStructuredContentFromSms**](AiControllerApi#generateStructuredContentFromSms) | **POST** /ai/structured-content/sms | Generate structured content for a TXT message |
| [**getTransformer**](AiControllerApi#getTransformer) | **GET** /ai/transformer/{id} | Get a transformer |
| [**getTransformerMapping**](AiControllerApi#getTransformerMapping) | **GET** /ai/transformer/mappings/{id} | Get transformer mapping |
| [**getTransformerMappings**](AiControllerApi#getTransformerMappings) | **GET** /ai/transformer/mappings | Get transformer mappings |
| [**getTransformerResult**](AiControllerApi#getTransformerResult) | **GET** /ai/transformer/results/{id} | Get transformer result |
| [**getTransformerResults**](AiControllerApi#getTransformerResults) | **GET** /ai/transformer/results | Get transformer results |
| [**getTransformers**](AiControllerApi#getTransformers) | **GET** /ai/transformer | List transformers |
| [**invokeTransformer**](AiControllerApi#invokeTransformer) | **POST** /ai/transformer/invoke | Invoke a transformer |
| [**validateStructuredOutputSchema**](AiControllerApi#validateStructuredOutputSchema) | **POST** /ai/structured-content/validate | Validate structured content schema |


<a id="createTransformer"></a>
# **createTransformer**
> AITransformDto createTransformer(aiTransformCreateOptions).execute();

Create a transformer for reuse in automations

Save an AI transform instructions and schema for use with webhooks and automations

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    AITransformCreateOptions aiTransformCreateOptions = new AITransformCreateOptions(); // AITransformCreateOptions | 
    try {
      AITransformDto result = apiInstance.createTransformer(aiTransformCreateOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#createTransformer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiTransformCreateOptions** | [**AITransformCreateOptions**](AITransformCreateOptions)|  | |

### Return type

[**AITransformDto**](AITransformDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createTransformerMappings"></a>
# **createTransformerMappings**
> AITransformMappingDto createTransformerMappings(createAITransformerMappingOptions).execute();

Create transformer mapping

Create AI transformer mappings to other entities

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    CreateAITransformerMappingOptions createAITransformerMappingOptions = new CreateAITransformerMappingOptions(); // CreateAITransformerMappingOptions | 
    try {
      AITransformMappingDto result = apiInstance.createTransformerMappings(createAITransformerMappingOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#createTransformerMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAITransformerMappingOptions** | [**CreateAITransformerMappingOptions**](CreateAITransformerMappingOptions)|  | |

### Return type

[**AITransformMappingDto**](AITransformMappingDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteAllTransformerMappings"></a>
# **deleteAllTransformerMappings**
> deleteAllTransformerMappings().execute();

Delete all transformer mapping

Delete all AI transformer mappings

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    try {
      apiInstance.deleteAllTransformerMappings()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#deleteAllTransformerMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteTransformer"></a>
# **deleteTransformer**
> deleteTransformer(id).execute();

Delete a transformer

Delete an AI transformer and schemas by ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteTransformer(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#deleteTransformer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteTransformerMapping"></a>
# **deleteTransformerMapping**
> deleteTransformerMapping(id).execute();

Delete transformer mapping

Delete an AI transformer mapping

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of transform mapping
    try {
      apiInstance.deleteTransformerMapping(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#deleteTransformerMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| ID of transform mapping | |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="deleteTransformers"></a>
# **deleteTransformers**
> deleteTransformers().execute();

Delete all transformers

Delete all AI transformers and schemas

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    try {
      apiInstance.deleteTransformers()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#deleteTransformers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="generateStructuredContentFromAttachment"></a>
# **generateStructuredContentFromAttachment**
> StructuredContentResultDto generateStructuredContentFromAttachment(generateStructuredContentAttachmentOptions).execute();

Generate structured content for an attachment

Use output schemas to extract data from an attachment using AI

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    GenerateStructuredContentAttachmentOptions generateStructuredContentAttachmentOptions = new GenerateStructuredContentAttachmentOptions(); // GenerateStructuredContentAttachmentOptions | 
    try {
      StructuredContentResultDto result = apiInstance.generateStructuredContentFromAttachment(generateStructuredContentAttachmentOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#generateStructuredContentFromAttachment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateStructuredContentAttachmentOptions** | [**GenerateStructuredContentAttachmentOptions**](GenerateStructuredContentAttachmentOptions)|  | |

### Return type

[**StructuredContentResultDto**](StructuredContentResultDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateStructuredContentFromEmail"></a>
# **generateStructuredContentFromEmail**
> StructuredContentResultDto generateStructuredContentFromEmail(generateStructuredContentEmailOptions).execute();

Generate structured content for an email

Use output schemas to extract data from an email using AI

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    GenerateStructuredContentEmailOptions generateStructuredContentEmailOptions = new GenerateStructuredContentEmailOptions(); // GenerateStructuredContentEmailOptions | 
    try {
      StructuredContentResultDto result = apiInstance.generateStructuredContentFromEmail(generateStructuredContentEmailOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#generateStructuredContentFromEmail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateStructuredContentEmailOptions** | [**GenerateStructuredContentEmailOptions**](GenerateStructuredContentEmailOptions)|  | |

### Return type

[**StructuredContentResultDto**](StructuredContentResultDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateStructuredContentFromSms"></a>
# **generateStructuredContentFromSms**
> StructuredContentResultDto generateStructuredContentFromSms(generateStructuredContentSmsOptions).execute();

Generate structured content for a TXT message

Use output schemas to extract data from an SMS using AI

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    GenerateStructuredContentSmsOptions generateStructuredContentSmsOptions = new GenerateStructuredContentSmsOptions(); // GenerateStructuredContentSmsOptions | 
    try {
      StructuredContentResultDto result = apiInstance.generateStructuredContentFromSms(generateStructuredContentSmsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#generateStructuredContentFromSms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **generateStructuredContentSmsOptions** | [**GenerateStructuredContentSmsOptions**](GenerateStructuredContentSmsOptions)|  | |

### Return type

[**StructuredContentResultDto**](StructuredContentResultDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransformer"></a>
# **getTransformer**
> AITransformDto getTransformer(id).execute();

Get a transformer

Get AI transformer and schemas by ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      AITransformDto result = apiInstance.getTransformer(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#getTransformer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**AITransformDto**](AITransformDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransformerMapping"></a>
# **getTransformerMapping**
> AITransformMappingDto getTransformerMapping(id).execute();

Get transformer mapping

Get an AI transformer mapping

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of transform mapping
    try {
      AITransformMappingDto result = apiInstance.getTransformerMapping(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#getTransformerMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| ID of transform mapping | |

### Return type

[**AITransformMappingDto**](AITransformMappingDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransformerMappings"></a>
# **getTransformerMappings**
> PageAITransformMappingProjection getTransformerMappings().aiTransformId(aiTransformId).entityId(entityId).entityType(entityType).page(page).size(size).sort(sort).execute();

Get transformer mappings

Get AI transformer mappings to other entities

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    UUID aiTransformId = UUID.randomUUID(); // UUID | 
    UUID entityId = UUID.randomUUID(); // UUID | 
    String entityType = "INBOX"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | Optional page size. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageAITransformMappingProjection result = apiInstance.getTransformerMappings()
            .aiTransformId(aiTransformId)
            .entityId(entityId)
            .entityType(entityType)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#getTransformerMappings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiTransformId** | **UUID**|  | [optional] |
| **entityId** | **UUID**|  | [optional] |
| **entityType** | **String**|  | [optional] [enum: INBOX, PHONE] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**| Optional page size. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageAITransformMappingProjection**](PageAITransformMappingProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransformerResult"></a>
# **getTransformerResult**
> AITransformResultDto getTransformerResult(id).execute();

Get transformer result

Get AI transformer result

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of transform result
    try {
      AITransformResultDto result = apiInstance.getTransformerResult(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#getTransformerResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| ID of transform result | |

### Return type

[**AITransformResultDto**](AITransformResultDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransformerResults"></a>
# **getTransformerResults**
> PageAITransformResultProjection getTransformerResults().aiTransformId(aiTransformId).aiTransformMappingId(aiTransformMappingId).entityId(entityId).entityType(entityType).page(page).size(size).sort(sort).execute();

Get transformer results

Get AI transformer results

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    UUID aiTransformId = UUID.randomUUID(); // UUID | 
    UUID aiTransformMappingId = UUID.randomUUID(); // UUID | 
    UUID entityId = UUID.randomUUID(); // UUID | 
    String entityType = "INBOX"; // String | 
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | Optional page size. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    try {
      PageAITransformResultProjection result = apiInstance.getTransformerResults()
            .aiTransformId(aiTransformId)
            .aiTransformMappingId(aiTransformMappingId)
            .entityId(entityId)
            .entityType(entityType)
            .page(page)
            .size(size)
            .sort(sort)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#getTransformerResults");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **aiTransformId** | **UUID**|  | [optional] |
| **aiTransformMappingId** | **UUID**|  | [optional] |
| **entityId** | **UUID**|  | [optional] |
| **entityType** | **String**|  | [optional] [enum: INBOX, PHONE] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**| Optional page size. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**PageAITransformResultProjection**](PageAITransformResultProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransformers"></a>
# **getTransformers**
> PageAITransformProjection getTransformers().page(page).size(size).sort(sort).include(include).execute();

List transformers

List all AI transforms

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer size = 20; // Integer | Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    List<UUID> include = Arrays.asList(); // List<UUID> | Optional list of IDs to include in result
    try {
      PageAITransformProjection result = apiInstance.getTransformers()
            .page(page)
            .size(size)
            .sort(sort)
            .include(include)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#getTransformers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**|  | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in SMS list pagination. Maximum size is 100. Use page index and sort to page through larger results | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **include** | [**List&lt;UUID&gt;**](UUID)| Optional list of IDs to include in result | [optional] |

### Return type

[**PageAITransformProjection**](PageAITransformProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="invokeTransformer"></a>
# **invokeTransformer**
> ConditionalStructuredContentResult invokeTransformer(invokeTransformerOptions).execute();

Invoke a transformer

Execute an AI transformer to generate structured content

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    InvokeTransformerOptions invokeTransformerOptions = new InvokeTransformerOptions(); // InvokeTransformerOptions | 
    try {
      ConditionalStructuredContentResult result = apiInstance.invokeTransformer(invokeTransformerOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#invokeTransformer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **invokeTransformerOptions** | [**InvokeTransformerOptions**](InvokeTransformerOptions)|  | |

### Return type

[**ConditionalStructuredContentResult**](ConditionalStructuredContentResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="validateStructuredOutputSchema"></a>
# **validateStructuredOutputSchema**
> StructuredOutputSchemaValidation validateStructuredOutputSchema(structuredOutputSchema).execute();

Validate structured content schema

Check if a schema is valid and can be used to extract data using AI

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.AiControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    AiControllerApi apiInstance = new AiControllerApi(defaultClient);
    StructuredOutputSchema structuredOutputSchema = new StructuredOutputSchema(); // StructuredOutputSchema | 
    try {
      StructuredOutputSchemaValidation result = apiInstance.validateStructuredOutputSchema(structuredOutputSchema)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiControllerApi#validateStructuredOutputSchema");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **structuredOutputSchema** | [**StructuredOutputSchema**](StructuredOutputSchema)|  | |

### Return type

[**StructuredOutputSchemaValidation**](StructuredOutputSchemaValidation)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

