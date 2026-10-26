# ApiSendingConnectionControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSendingConnection**](ApiSendingConnectionControllerApi#createSendingConnection) | **POST** /sending-connections | Create a sending connection |
| [**deleteDeliverySenderSeats**](ApiSendingConnectionControllerApi#deleteDeliverySenderSeats) | **DELETE** /sending-connections/sender-seats | Cancel purchased Delivery Sender seats |
| [**deleteSendingConnection**](ApiSendingConnectionControllerApi#deleteSendingConnection) | **DELETE** /sending-connections/{connectionId} | Disconnect a sending connection |
| [**disableSendingConnection**](ApiSendingConnectionControllerApi#disableSendingConnection) | **DELETE** /sending-connections/{connectionId}/enable | Disable Delivery Sender capacity |
| [**enableSendingConnection**](ApiSendingConnectionControllerApi#enableSendingConnection) | **POST** /sending-connections/{connectionId}/enable | Enable a verified Delivery Sender |
| [**getDeliverySenderCapacity**](ApiSendingConnectionControllerApi#getDeliverySenderCapacity) | **GET** /sending-connections/capacity | Get shared Delivery Sender capacity |
| [**getSendingConnection**](ApiSendingConnectionControllerApi#getSendingConnection) | **GET** /sending-connections/{connectionId} | Get a sending connection |
| [**getSendingConnectionProviders**](ApiSendingConnectionControllerApi#getSendingConnectionProviders) | **GET** /sending-connections/providers | List sending connection providers |
| [**getSendingConnections**](ApiSendingConnectionControllerApi#getSendingConnections) | **GET** /sending-connections | List sending connections |
| [**probeSendingConnectionDelivery**](ApiSendingConnectionControllerApi#probeSendingConnectionDelivery) | **POST** /sending-connections/{connectionId}/delivery-probe | Send an unbilled delivery test to a temporary MailSlurp inbox |
| [**rotateSendingConnectionCredentials**](ApiSendingConnectionControllerApi#rotateSendingConnectionCredentials) | **POST** /sending-connections/{connectionId}/credentials | Rotate sending connection credentials |
| [**updateDeliverySenderSeats**](ApiSendingConnectionControllerApi#updateDeliverySenderSeats) | **PUT** /sending-connections/sender-seats | Update purchased Delivery Sender seats |
| [**updateSendingConnection**](ApiSendingConnectionControllerApi#updateSendingConnection) | **PATCH** /sending-connections/{connectionId} | Update a sending connection |
| [**verifySendingConnection**](ApiSendingConnectionControllerApi#verifySendingConnection) | **POST** /sending-connections/{connectionId}/verify | Verify a sending connection |


<a id="createSendingConnection"></a>
# **createSendingConnection**
> SendingConnectionDto createSendingConnection(createSendingConnectionOptions).execute();

Create a sending connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    CreateSendingConnectionOptions createSendingConnectionOptions = new CreateSendingConnectionOptions(); // CreateSendingConnectionOptions | 
    try {
      SendingConnectionDto result = apiInstance.createSendingConnection(createSendingConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#createSendingConnection");
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
| **createSendingConnectionOptions** | [**CreateSendingConnectionOptions**](CreateSendingConnectionOptions)|  | |

### Return type

[**SendingConnectionDto**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDeliverySenderSeats"></a>
# **deleteDeliverySenderSeats**
> DeliverySenderCapacityDto deleteDeliverySenderSeats().execute();

Cancel purchased Delivery Sender seats

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    try {
      DeliverySenderCapacityDto result = apiInstance.deleteDeliverySenderSeats()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#deleteDeliverySenderSeats");
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

[**DeliverySenderCapacityDto**](DeliverySenderCapacityDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteSendingConnection"></a>
# **deleteSendingConnection**
> deleteSendingConnection(connectionId).execute();

Disconnect a sending connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteSendingConnection(connectionId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#deleteSendingConnection");
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
| **connectionId** | **UUID**|  | |

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

<a id="disableSendingConnection"></a>
# **disableSendingConnection**
> SendingConnectionDto disableSendingConnection(connectionId).execute();

Disable Delivery Sender capacity

Releases this connection&#39;s shared sender allocation while retaining its verified credentials.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      SendingConnectionDto result = apiInstance.disableSendingConnection(connectionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#disableSendingConnection");
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
| **connectionId** | **UUID**|  | |

### Return type

[**SendingConnectionDto**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="enableSendingConnection"></a>
# **enableSendingConnection**
> SendingConnectionDto enableSendingConnection(connectionId).execute();

Enable a verified Delivery Sender

Allocates shared sender capacity. Included capacity is used first and supported additional capacity is added to the existing subscription when possible.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      SendingConnectionDto result = apiInstance.enableSendingConnection(connectionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#enableSendingConnection");
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
| **connectionId** | **UUID**|  | |

### Return type

[**SendingConnectionDto**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDeliverySenderCapacity"></a>
# **getDeliverySenderCapacity**
> DeliverySenderCapacityDto getDeliverySenderCapacity().execute();

Get shared Delivery Sender capacity

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    try {
      DeliverySenderCapacityDto result = apiInstance.getDeliverySenderCapacity()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#getDeliverySenderCapacity");
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

[**DeliverySenderCapacityDto**](DeliverySenderCapacityDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSendingConnection"></a>
# **getSendingConnection**
> SendingConnectionDto getSendingConnection(connectionId).execute();

Get a sending connection

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      SendingConnectionDto result = apiInstance.getSendingConnection(connectionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#getSendingConnection");
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
| **connectionId** | **UUID**|  | |

### Return type

[**SendingConnectionDto**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSendingConnectionProviders"></a>
# **getSendingConnectionProviders**
> List&lt;SendingConnectionProviderDto&gt; getSendingConnectionProviders().execute();

List sending connection providers

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    try {
      List<SendingConnectionProviderDto> result = apiInstance.getSendingConnectionProviders()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#getSendingConnectionProviders");
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

[**List&lt;SendingConnectionProviderDto&gt;**](SendingConnectionProviderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getSendingConnections"></a>
# **getSendingConnections**
> List&lt;SendingConnectionDto&gt; getSendingConnections().execute();

List sending connections

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    try {
      List<SendingConnectionDto> result = apiInstance.getSendingConnections()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#getSendingConnections");
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

[**List&lt;SendingConnectionDto&gt;**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="probeSendingConnectionDelivery"></a>
# **probeSendingConnectionDelivery**
> SendingConnectionDeliveryProbeDto probeSendingConnectionDelivery(connectionId).execute();

Send an unbilled delivery test to a temporary MailSlurp inbox

Uses only the selected customer-owned connection. A successful receipt proves provider acceptance and delivery to MailSlurp, not Gmail or Outlook placement.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      SendingConnectionDeliveryProbeDto result = apiInstance.probeSendingConnectionDelivery(connectionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#probeSendingConnectionDelivery");
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
| **connectionId** | **UUID**|  | |

### Return type

[**SendingConnectionDeliveryProbeDto**](SendingConnectionDeliveryProbeDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rotateSendingConnectionCredentials"></a>
# **rotateSendingConnectionCredentials**
> SendingConnectionDto rotateSendingConnectionCredentials(connectionId, rotateSendingConnectionCredentialsOptions).execute();

Rotate sending connection credentials

Verifies supported replacement credentials before atomically replacing the encrypted credential envelope.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    RotateSendingConnectionCredentialsOptions rotateSendingConnectionCredentialsOptions = new RotateSendingConnectionCredentialsOptions(); // RotateSendingConnectionCredentialsOptions | 
    try {
      SendingConnectionDto result = apiInstance.rotateSendingConnectionCredentials(connectionId, rotateSendingConnectionCredentialsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#rotateSendingConnectionCredentials");
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
| **connectionId** | **UUID**|  | |
| **rotateSendingConnectionCredentialsOptions** | [**RotateSendingConnectionCredentialsOptions**](RotateSendingConnectionCredentialsOptions)|  | |

### Return type

[**SendingConnectionDto**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDeliverySenderSeats"></a>
# **updateDeliverySenderSeats**
> DeliverySenderCapacityDto updateDeliverySenderSeats(updateDeliverySenderSeatsOptions).execute();

Update purchased Delivery Sender seats

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UpdateDeliverySenderSeatsOptions updateDeliverySenderSeatsOptions = new UpdateDeliverySenderSeatsOptions(); // UpdateDeliverySenderSeatsOptions | 
    try {
      DeliverySenderCapacityDto result = apiInstance.updateDeliverySenderSeats(updateDeliverySenderSeatsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#updateDeliverySenderSeats");
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
| **updateDeliverySenderSeatsOptions** | [**UpdateDeliverySenderSeatsOptions**](UpdateDeliverySenderSeatsOptions)|  | |

### Return type

[**DeliverySenderCapacityDto**](DeliverySenderCapacityDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateSendingConnection"></a>
# **updateSendingConnection**
> SendingConnectionDto updateSendingConnection(connectionId, updateSendingConnectionOptions).execute();

Update a sending connection

Updates non-secret connection metadata. Use the credentials endpoint to replace supported SMTP or API-key credentials.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    UpdateSendingConnectionOptions updateSendingConnectionOptions = new UpdateSendingConnectionOptions(); // UpdateSendingConnectionOptions | 
    try {
      SendingConnectionDto result = apiInstance.updateSendingConnection(connectionId, updateSendingConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#updateSendingConnection");
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
| **connectionId** | **UUID**|  | |
| **updateSendingConnectionOptions** | [**UpdateSendingConnectionOptions**](UpdateSendingConnectionOptions)|  | |

### Return type

[**SendingConnectionDto**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="verifySendingConnection"></a>
# **verifySendingConnection**
> SendingConnectionDto verifySendingConnection(connectionId).execute();

Verify a sending connection

Verifies the customer credential without enabling billable sender capacity. A consuming product enables the shared Delivery Sender seat when sending starts.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ApiSendingConnectionControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ApiSendingConnectionControllerApi apiInstance = new ApiSendingConnectionControllerApi(defaultClient);
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      SendingConnectionDto result = apiInstance.verifySendingConnection(connectionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiSendingConnectionControllerApi#verifySendingConnection");
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
| **connectionId** | **UUID**|  | |

### Return type

[**SendingConnectionDto**](SendingConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

