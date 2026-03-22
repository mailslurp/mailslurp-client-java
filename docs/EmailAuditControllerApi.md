# EmailAuditControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**compareEmailAudits**](EmailAuditControllerApi#compareEmailAudits) | **GET** /email-audits/{auditId}/compare/{otherAuditId} | Compare two email audits |
| [**createEmailAudit**](EmailAuditControllerApi#createEmailAudit) | **POST** /email-audits | Create email audit |
| [**deleteEmailAudit**](EmailAuditControllerApi#deleteEmailAudit) | **DELETE** /email-audits/{auditId} | Delete email audit |
| [**getEmailAudit**](EmailAuditControllerApi#getEmailAudit) | **GET** /email-audits/{auditId} | Get email audit |
| [**getEmailAudits**](EmailAuditControllerApi#getEmailAudits) | **GET** /email-audits | List email audits |


<a id="compareEmailAudits"></a>
# **compareEmailAudits**
> EmailAuditComparisonDto compareEmailAudits(auditId, otherAuditId).execute();

Compare two email audits

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailAuditControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailAuditControllerApi apiInstance = new EmailAuditControllerApi(defaultClient);
    UUID auditId = UUID.randomUUID(); // UUID | 
    UUID otherAuditId = UUID.randomUUID(); // UUID | 
    try {
      EmailAuditComparisonDto result = apiInstance.compareEmailAudits(auditId, otherAuditId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAuditControllerApi#compareEmailAudits");
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
| **auditId** | **UUID**|  | |
| **otherAuditId** | **UUID**|  | |

### Return type

[**EmailAuditComparisonDto**](EmailAuditComparisonDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createEmailAudit"></a>
# **createEmailAudit**
> EmailAuditDto createEmailAudit(createEmailAuditOptions).execute();

Create email audit

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailAuditControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailAuditControllerApi apiInstance = new EmailAuditControllerApi(defaultClient);
    CreateEmailAuditOptions createEmailAuditOptions = new CreateEmailAuditOptions(); // CreateEmailAuditOptions | 
    try {
      EmailAuditDto result = apiInstance.createEmailAudit(createEmailAuditOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAuditControllerApi#createEmailAudit");
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
| **createEmailAuditOptions** | [**CreateEmailAuditOptions**](CreateEmailAuditOptions)|  | |

### Return type

[**EmailAuditDto**](EmailAuditDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteEmailAudit"></a>
# **deleteEmailAudit**
> deleteEmailAudit(auditId).execute();

Delete email audit

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailAuditControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailAuditControllerApi apiInstance = new EmailAuditControllerApi(defaultClient);
    UUID auditId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteEmailAudit(auditId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAuditControllerApi#deleteEmailAudit");
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
| **auditId** | **UUID**|  | |

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

<a id="getEmailAudit"></a>
# **getEmailAudit**
> EmailAuditDto getEmailAudit(auditId).execute();

Get email audit

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailAuditControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailAuditControllerApi apiInstance = new EmailAuditControllerApi(defaultClient);
    UUID auditId = UUID.randomUUID(); // UUID | 
    try {
      EmailAuditDto result = apiInstance.getEmailAudit(auditId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAuditControllerApi#getEmailAudit");
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
| **auditId** | **UUID**|  | |

### Return type

[**EmailAuditDto**](EmailAuditDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getEmailAudits"></a>
# **getEmailAudits**
> List&lt;EmailAuditDto&gt; getEmailAudits().emailId(emailId).since(since).before(before).limit(limit).execute();

List email audits

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.EmailAuditControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    EmailAuditControllerApi apiInstance = new EmailAuditControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    Integer limit = 56; // Integer | 
    try {
      List<EmailAuditDto> result = apiInstance.getEmailAudits()
            .emailId(emailId)
            .since(since)
            .before(before)
            .limit(limit)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailAuditControllerApi#getEmailAudits");
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
| **emailId** | **UUID**|  | [optional] |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**List&lt;EmailAuditDto&gt;**](EmailAuditDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

