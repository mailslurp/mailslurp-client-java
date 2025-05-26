# AiControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateStructuredContentFromAttachment**](AiControllerApi#generateStructuredContentFromAttachment) | **POST** /ai/structured-content/attachment | Generate structured content for an attachment |
| [**generateStructuredContentFromEmail**](AiControllerApi#generateStructuredContentFromEmail) | **POST** /ai/structured-content/email | Generate structured content for an email |
| [**validateStructuredOutputSchema**](AiControllerApi#validateStructuredOutputSchema) | **POST** /ai/structured-content/validate | Validate structured content schema |


<a id="generateStructuredContentFromAttachment"></a>
# **generateStructuredContentFromAttachment**
> StructuredContentResult generateStructuredContentFromAttachment(generateStructuredContentAttachmentOptions).execute();

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
      StructuredContentResult result = apiInstance.generateStructuredContentFromAttachment(generateStructuredContentAttachmentOptions)
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

[**StructuredContentResult**](StructuredContentResult)

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
> StructuredContentResult generateStructuredContentFromEmail(generateStructuredContentEmailOptions).execute();

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
      StructuredContentResult result = apiInstance.generateStructuredContentFromEmail(generateStructuredContentEmailOptions)
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

[**StructuredContentResult**](StructuredContentResult)

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

