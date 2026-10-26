# ApiAuditLogControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAuditLogByEventId**](ApiAuditLogControllerApi#getAuditLogByEventId) | **GET** /audit-logs/{eventId} |  |
| [**getAuditLogs**](ApiAuditLogControllerApi#getAuditLogs) | **GET** /audit-logs |  |
| [**searchAuditLogs**](ApiAuditLogControllerApi#searchAuditLogs) | **POST** /audit-logs/search |  |


<a id="getAuditLogByEventId"></a>
# **getAuditLogByEventId**
> AuditLogEventDto getAuditLogByEventId(eventId).since(since).before(before).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAuditLogControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAuditLogControllerApi apiInstance = new ApiAuditLogControllerApi(defaultClient);
    String eventId = "eventId_example"; // String | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      AuditLogEventDto result = apiInstance.getAuditLogByEventId(eventId)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAuditLogControllerApi#getAuditLogByEventId");
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
| **eventId** | **String**|  | |
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |

### Return type

[**AuditLogEventDto**](AuditLogEventDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAuditLogs"></a>
# **getAuditLogs**
> AuditLogPageDto getAuditLogs().since(since).before(before).action(action).userId(userId).actorUserId(actorUserId).targetUserId(targetUserId).resourceType(resourceType).resourceId(resourceId).outcome(outcome).requestId(requestId).ipAddress(ipAddress).pageSize(pageSize).cursor(cursor).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAuditLogControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAuditLogControllerApi apiInstance = new ApiAuditLogControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | 
    String action = "action_example"; // String | 
    UUID userId = UUID.randomUUID(); // UUID | 
    UUID actorUserId = UUID.randomUUID(); // UUID | 
    UUID targetUserId = UUID.randomUUID(); // UUID | 
    String resourceType = "resourceType_example"; // String | 
    String resourceId = "resourceId_example"; // String | 
    String outcome = "outcome_example"; // String | 
    String requestId = "requestId_example"; // String | 
    String ipAddress = "ipAddress_example"; // String | 
    Integer pageSize = 56; // Integer | 
    String cursor = "cursor_example"; // String | 
    try {
      AuditLogPageDto result = apiInstance.getAuditLogs()
            .since(since)
            .before(before)
            .action(action)
            .userId(userId)
            .actorUserId(actorUserId)
            .targetUserId(targetUserId)
            .resourceType(resourceType)
            .resourceId(resourceId)
            .outcome(outcome)
            .requestId(requestId)
            .ipAddress(ipAddress)
            .pageSize(pageSize)
            .cursor(cursor)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAuditLogControllerApi#getAuditLogs");
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
| **since** | **OffsetDateTime**|  | [optional] |
| **before** | **OffsetDateTime**|  | [optional] |
| **action** | **String**|  | [optional] |
| **userId** | **UUID**|  | [optional] |
| **actorUserId** | **UUID**|  | [optional] |
| **targetUserId** | **UUID**|  | [optional] |
| **resourceType** | **String**|  | [optional] |
| **resourceId** | **String**|  | [optional] |
| **outcome** | **String**|  | [optional] |
| **requestId** | **String**|  | [optional] |
| **ipAddress** | **String**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |
| **cursor** | **String**|  | [optional] |

### Return type

[**AuditLogPageDto**](AuditLogPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="searchAuditLogs"></a>
# **searchAuditLogs**
> AuditLogPageDto searchAuditLogs(auditLogSearchOptions).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiAuditLogControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiAuditLogControllerApi apiInstance = new ApiAuditLogControllerApi(defaultClient);
    AuditLogSearchOptions auditLogSearchOptions = new AuditLogSearchOptions(); // AuditLogSearchOptions | 
    try {
      AuditLogPageDto result = apiInstance.searchAuditLogs(auditLogSearchOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiAuditLogControllerApi#searchAuditLogs");
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
| **auditLogSearchOptions** | [**AuditLogSearchOptions**](AuditLogSearchOptions)|  | |

### Return type

[**AuditLogPageDto**](AuditLogPageDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

