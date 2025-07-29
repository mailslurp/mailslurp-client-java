# ConnectorControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnector**](ConnectorControllerApi#createConnector) | **POST** /connectors | Create an inbox connector |
| [**createConnectorImapConnection**](ConnectorControllerApi#createConnectorImapConnection) | **POST** /connectors/{id}/imap | Create an inbox connector IMAP connection |
| [**createConnectorSmtpConnection**](ConnectorControllerApi#createConnectorSmtpConnection) | **POST** /connectors/{id}/smtp | Create an inbox connector SMTP connection |
| [**createConnectorSyncSettings**](ConnectorControllerApi#createConnectorSyncSettings) | **POST** /connectors/{id}/sync-settings | Create an inbox connector sync settings |
| [**createConnectorWithOptions**](ConnectorControllerApi#createConnectorWithOptions) | **POST** /connectors/withOptions | Create an inbox connector with options |
| [**deleteAllConnector**](ConnectorControllerApi#deleteAllConnector) | **DELETE** /connectors | Delete all inbox connectors |
| [**deleteConnector**](ConnectorControllerApi#deleteConnector) | **DELETE** /connectors/{id} | Delete an inbox connector |
| [**deleteConnectorImapConnection**](ConnectorControllerApi#deleteConnectorImapConnection) | **DELETE** /connectors/{id}/imap | Delete an inbox connector IMAP connection |
| [**deleteConnectorSmtpConnection**](ConnectorControllerApi#deleteConnectorSmtpConnection) | **DELETE** /connectors/{id}/smtp | Delete an inbox connector SMTP connection |
| [**deleteConnectorSyncSettings**](ConnectorControllerApi#deleteConnectorSyncSettings) | **DELETE** /connectors/{id}/sync-settings | Create an inbox connector sync settings |
| [**getAllConnectorEvents**](ConnectorControllerApi#getAllConnectorEvents) | **GET** /connectors/events | Get all inbox connector events |
| [**getConnector**](ConnectorControllerApi#getConnector) | **GET** /connectors/{id} | Get an inbox connector |
| [**getConnectorByEmailAddress**](ConnectorControllerApi#getConnectorByEmailAddress) | **GET** /connectors/by-email-address | Get connector by email address |
| [**getConnectorByInboxId**](ConnectorControllerApi#getConnectorByInboxId) | **GET** /connectors/by-inbox-id | Get connector by inbox ID |
| [**getConnectorByName**](ConnectorControllerApi#getConnectorByName) | **GET** /connectors/by-name | Get connector by name |
| [**getConnectorEvent**](ConnectorControllerApi#getConnectorEvent) | **GET** /connectors/events/{id} | Get an inbox connector event |
| [**getConnectorEvents**](ConnectorControllerApi#getConnectorEvents) | **GET** /connectors/{id}/events | Get an inbox connector events |
| [**getConnectorImapConnection**](ConnectorControllerApi#getConnectorImapConnection) | **GET** /connectors/{id}/imap | Get an inbox connector IMAP connection |
| [**getConnectorProviderSettings**](ConnectorControllerApi#getConnectorProviderSettings) | **GET** /connectors/provider-settings | Get SMTP and IMAP connection settings for common mail providers |
| [**getConnectorSmtpConnection**](ConnectorControllerApi#getConnectorSmtpConnection) | **GET** /connectors/{id}/smtp | Get an inbox connector SMTP connection |
| [**getConnectorSyncSettings**](ConnectorControllerApi#getConnectorSyncSettings) | **GET** /connectors/{id}/sync-settings | Get an inbox connector sync settings |
| [**getConnectors**](ConnectorControllerApi#getConnectors) | **GET** /connectors | Get inbox connectors |
| [**sendEmailFromConnector**](ConnectorControllerApi#sendEmailFromConnector) | **POST** /connectors/{id}/send | Send from an inbox connector |
| [**syncConnector**](ConnectorControllerApi#syncConnector) | **POST** /connectors/{id}/sync | Sync an inbox connector |
| [**testConnectorImapConnection**](ConnectorControllerApi#testConnectorImapConnection) | **POST** /connectors/{id}/imap/test | Test an inbox connector IMAP connection |
| [**testConnectorImapConnectionOptions**](ConnectorControllerApi#testConnectorImapConnectionOptions) | **POST** /connectors/connections/imap/test | Test an inbox connector IMAP connection options |
| [**testConnectorSmtpConnection**](ConnectorControllerApi#testConnectorSmtpConnection) | **POST** /connectors/{id}/smtp/test | Test an inbox connector SMTP connection |
| [**testConnectorSmtpConnectionOptions**](ConnectorControllerApi#testConnectorSmtpConnectionOptions) | **POST** /connectors/connections/smtp/test | Test an inbox connector SMTP connection options |
| [**updateConnector**](ConnectorControllerApi#updateConnector) | **PUT** /connectors/{id} | Update an inbox connector |
| [**updateConnectorImapConnection**](ConnectorControllerApi#updateConnectorImapConnection) | **PATCH** /connectors/{id}/imap | Update an inbox connector IMAP connection |
| [**updateConnectorSmtpConnection**](ConnectorControllerApi#updateConnectorSmtpConnection) | **PATCH** /connectors/{id}/smtp | Update an inbox connector SMTP connection |


<a id="createConnector"></a>
# **createConnector**
> ConnectorDto createConnector(createConnectorOptions).inboxId(inboxId).execute();

Create an inbox connector

Sync emails between external mailboxes and MailSlurp inboxes

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    CreateConnectorOptions createConnectorOptions = new CreateConnectorOptions(); // CreateConnectorOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox ID to associate with the connector
    try {
      ConnectorDto result = apiInstance.createConnector(createConnectorOptions)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#createConnector");
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
| **createConnectorOptions** | [**CreateConnectorOptions**](CreateConnectorOptions)|  | |
| **inboxId** | **UUID**| Optional inbox ID to associate with the connector | [optional] |

### Return type

[**ConnectorDto**](ConnectorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createConnectorImapConnection"></a>
# **createConnectorImapConnection**
> ConnectorImapConnectionDto createConnectorImapConnection(id, createConnectorImapConnectionOptions).execute();

Create an inbox connector IMAP connection

Allows the reading of emails in an external mailbox and syncing to a MailSlurp inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorImapConnectionOptions createConnectorImapConnectionOptions = new CreateConnectorImapConnectionOptions(); // CreateConnectorImapConnectionOptions | 
    try {
      ConnectorImapConnectionDto result = apiInstance.createConnectorImapConnection(id, createConnectorImapConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#createConnectorImapConnection");
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
| **createConnectorImapConnectionOptions** | [**CreateConnectorImapConnectionOptions**](CreateConnectorImapConnectionOptions)|  | |

### Return type

[**ConnectorImapConnectionDto**](ConnectorImapConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createConnectorSmtpConnection"></a>
# **createConnectorSmtpConnection**
> ConnectorSmtpConnectionDto createConnectorSmtpConnection(id, createConnectorSmtpConnectionOptions).execute();

Create an inbox connector SMTP connection

Allows sending via connector and email is routed to connected inbox and sent via SMTP

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorSmtpConnectionOptions createConnectorSmtpConnectionOptions = new CreateConnectorSmtpConnectionOptions(); // CreateConnectorSmtpConnectionOptions | 
    try {
      ConnectorSmtpConnectionDto result = apiInstance.createConnectorSmtpConnection(id, createConnectorSmtpConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#createConnectorSmtpConnection");
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
| **createConnectorSmtpConnectionOptions** | [**CreateConnectorSmtpConnectionOptions**](CreateConnectorSmtpConnectionOptions)|  | |

### Return type

[**ConnectorSmtpConnectionDto**](ConnectorSmtpConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createConnectorSyncSettings"></a>
# **createConnectorSyncSettings**
> ConnectorSyncSettingsDto createConnectorSyncSettings(id, createConnectorSyncSettingsOptions).execute();

Create an inbox connector sync settings

Configure automatic pull or emails from external inboxes using an interval or schedule

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorSyncSettingsOptions createConnectorSyncSettingsOptions = new CreateConnectorSyncSettingsOptions(); // CreateConnectorSyncSettingsOptions | 
    try {
      ConnectorSyncSettingsDto result = apiInstance.createConnectorSyncSettings(id, createConnectorSyncSettingsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#createConnectorSyncSettings");
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
| **createConnectorSyncSettingsOptions** | [**CreateConnectorSyncSettingsOptions**](CreateConnectorSyncSettingsOptions)|  | |

### Return type

[**ConnectorSyncSettingsDto**](ConnectorSyncSettingsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="createConnectorWithOptions"></a>
# **createConnectorWithOptions**
> ConnectorDto createConnectorWithOptions(createConnectorWithOptions).inboxId(inboxId).execute();

Create an inbox connector with options

Sync emails between external mailboxes and MailSlurp inboxes

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    CreateConnectorWithOptions createConnectorWithOptions = new CreateConnectorWithOptions(); // CreateConnectorWithOptions | 
    UUID inboxId = UUID.randomUUID(); // UUID | Optional inbox ID to associate with the connector
    try {
      ConnectorDto result = apiInstance.createConnectorWithOptions(createConnectorWithOptions)
            .inboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#createConnectorWithOptions");
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
| **createConnectorWithOptions** | [**CreateConnectorWithOptions**](CreateConnectorWithOptions)|  | |
| **inboxId** | **UUID**| Optional inbox ID to associate with the connector | [optional] |

### Return type

[**ConnectorDto**](ConnectorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |

<a id="deleteAllConnector"></a>
# **deleteAllConnector**
> deleteAllConnector().execute();

Delete all inbox connectors

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    try {
      apiInstance.deleteAllConnector()
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#deleteAllConnector");
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

<a id="deleteConnector"></a>
# **deleteConnector**
> deleteConnector(id).execute();

Delete an inbox connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteConnector(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#deleteConnector");
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

<a id="deleteConnectorImapConnection"></a>
# **deleteConnectorImapConnection**
> deleteConnectorImapConnection(id).execute();

Delete an inbox connector IMAP connection

Delete IMAP connection for external inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteConnectorImapConnection(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#deleteConnectorImapConnection");
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

<a id="deleteConnectorSmtpConnection"></a>
# **deleteConnectorSmtpConnection**
> deleteConnectorSmtpConnection(id).execute();

Delete an inbox connector SMTP connection

Delete SMTP connection for external inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteConnectorSmtpConnection(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#deleteConnectorSmtpConnection");
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

<a id="deleteConnectorSyncSettings"></a>
# **deleteConnectorSyncSettings**
> deleteConnectorSyncSettings(id).execute();

Create an inbox connector sync settings

Configure automatic pull or emails from external inboxes using an interval or schedule

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteConnectorSyncSettings(id)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#deleteConnectorSyncSettings");
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

<a id="getAllConnectorEvents"></a>
# **getAllConnectorEvents**
> PageConnectorEvents getAllConnectorEvents().id(id).page(page).size(size).sort(sort).since(since).before(before).eventType(eventType).execute();

Get all inbox connector events

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Optional connector ID
    Integer page = 0; // Integer | Optional page index in connector list pagination
    Integer size = 20; // Integer | Optional page size in connector list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    String eventType = "SEND"; // String | Filter by event type
    try {
      PageConnectorEvents result = apiInstance.getAllConnectorEvents()
            .id(id)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .eventType(eventType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getAllConnectorEvents");
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
| **id** | **UUID**| Optional connector ID | [optional] |
| **page** | **Integer**| Optional page index in connector list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in connector list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **eventType** | **String**| Filter by event type | [optional] [enum: SEND, SYNC] |

### Return type

[**PageConnectorEvents**](PageConnectorEvents)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnector"></a>
# **getConnector**
> ConnectorDto getConnector(id).execute();

Get an inbox connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ConnectorDto result = apiInstance.getConnector(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnector");
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

[**ConnectorDto**](ConnectorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorByEmailAddress"></a>
# **getConnectorByEmailAddress**
> OptionalConnectorDto getConnectorByEmailAddress(emailAddress).execute();

Get connector by email address

Find an inbox connector by email address

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | Email address to search for connector by
    try {
      OptionalConnectorDto result = apiInstance.getConnectorByEmailAddress(emailAddress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorByEmailAddress");
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
| **emailAddress** | **String**| Email address to search for connector by | |

### Return type

[**OptionalConnectorDto**](OptionalConnectorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorByInboxId"></a>
# **getConnectorByInboxId**
> OptionalConnectorDto getConnectorByInboxId(inboxId).execute();

Get connector by inbox ID

Find an inbox connector by inbox ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID inboxId = UUID.randomUUID(); // UUID | Inbox ID to search for connector by
    try {
      OptionalConnectorDto result = apiInstance.getConnectorByInboxId(inboxId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorByInboxId");
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
| **inboxId** | **UUID**| Inbox ID to search for connector by | |

### Return type

[**OptionalConnectorDto**](OptionalConnectorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorByName"></a>
# **getConnectorByName**
> OptionalConnectorDto getConnectorByName(name).execute();

Get connector by name

Find an inbox connector by name

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    String name = "name_example"; // String | Name to search for connector by
    try {
      OptionalConnectorDto result = apiInstance.getConnectorByName(name)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorByName");
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
| **name** | **String**| Name to search for connector by | |

### Return type

[**OptionalConnectorDto**](OptionalConnectorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorEvent"></a>
# **getConnectorEvent**
> ConnectorEventDto getConnectorEvent(id).execute();

Get an inbox connector event

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ConnectorEventDto result = apiInstance.getConnectorEvent(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorEvent");
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

[**ConnectorEventDto**](ConnectorEventDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorEvents"></a>
# **getConnectorEvents**
> PageConnectorEvents getConnectorEvents(id).page(page).size(size).sort(sort).since(since).before(before).eventType(eventType).execute();

Get an inbox connector events

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in connector list pagination
    Integer size = 20; // Integer | Optional page size in connector list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    String eventType = "SEND"; // String | Filter by event type
    try {
      PageConnectorEvents result = apiInstance.getConnectorEvents(id)
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .eventType(eventType)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorEvents");
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
| **page** | **Integer**| Optional page index in connector list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in connector list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |
| **eventType** | **String**| Filter by event type | [optional] [enum: SEND, SYNC] |

### Return type

[**PageConnectorEvents**](PageConnectorEvents)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorImapConnection"></a>
# **getConnectorImapConnection**
> OptionalConnectorImapConnectionDto getConnectorImapConnection(id).execute();

Get an inbox connector IMAP connection

Get IMAP connection for external inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OptionalConnectorImapConnectionDto result = apiInstance.getConnectorImapConnection(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorImapConnection");
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

[**OptionalConnectorImapConnectionDto**](OptionalConnectorImapConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorProviderSettings"></a>
# **getConnectorProviderSettings**
> ConnectorProviderSettingsDto getConnectorProviderSettings().execute();

Get SMTP and IMAP connection settings for common mail providers

Get common mail provider SMTP and IMAP connection settings

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    try {
      ConnectorProviderSettingsDto result = apiInstance.getConnectorProviderSettings()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorProviderSettings");
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

[**ConnectorProviderSettingsDto**](ConnectorProviderSettingsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorSmtpConnection"></a>
# **getConnectorSmtpConnection**
> OptionalConnectorSmtpConnectionDto getConnectorSmtpConnection(id).execute();

Get an inbox connector SMTP connection

Get SMTP connection for external inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OptionalConnectorSmtpConnectionDto result = apiInstance.getConnectorSmtpConnection(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorSmtpConnection");
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

[**OptionalConnectorSmtpConnectionDto**](OptionalConnectorSmtpConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectorSyncSettings"></a>
# **getConnectorSyncSettings**
> OptionalConnectorSyncSettingsDto getConnectorSyncSettings(id).execute();

Get an inbox connector sync settings

Get sync settings for connection with external inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OptionalConnectorSyncSettingsDto result = apiInstance.getConnectorSyncSettings(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectorSyncSettings");
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

[**OptionalConnectorSyncSettingsDto**](OptionalConnectorSyncSettingsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getConnectors"></a>
# **getConnectors**
> PageConnector getConnectors().page(page).size(size).sort(sort).since(since).before(before).execute();

Get inbox connectors

List inbox connectors that sync external emails to MailSlurp inboxes

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in connector list pagination
    Integer size = 20; // Integer | Optional page size in connector list pagination
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Filter by created at after the given timestamp
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Filter by created at before the given timestamp
    try {
      PageConnector result = apiInstance.getConnectors()
            .page(page)
            .size(size)
            .sort(sort)
            .since(since)
            .before(before)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#getConnectors");
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
| **page** | **Integer**| Optional page index in connector list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size in connector list pagination | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC] |
| **since** | **OffsetDateTime**| Filter by created at after the given timestamp | [optional] |
| **before** | **OffsetDateTime**| Filter by created at before the given timestamp | [optional] |

### Return type

[**PageConnector**](PageConnector)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="sendEmailFromConnector"></a>
# **sendEmailFromConnector**
> SentEmailDto sendEmailFromConnector(id, sendEmailOptions).useFallback(useFallback).execute();

Send from an inbox connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | 
    Boolean useFallback = true; // Boolean | 
    try {
      SentEmailDto result = apiInstance.sendEmailFromConnector(id, sendEmailOptions)
            .useFallback(useFallback)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#sendEmailFromConnector");
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
| **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions)|  | |
| **useFallback** | **Boolean**|  | [optional] |

### Return type

[**SentEmailDto**](SentEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="syncConnector"></a>
# **syncConnector**
> ConnectorSyncRequestResult syncConnector(id).since(since).folder(folder).logging(logging).execute();

Sync an inbox connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Date to request emails since
    String folder = "folder_example"; // String | Which folder to sync emails with
    Boolean logging = true; // Boolean | Enable or disable logging for the sync operation
    try {
      ConnectorSyncRequestResult result = apiInstance.syncConnector(id)
            .since(since)
            .folder(folder)
            .logging(logging)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#syncConnector");
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
| **since** | **OffsetDateTime**| Date to request emails since | [optional] |
| **folder** | **String**| Which folder to sync emails with | [optional] |
| **logging** | **Boolean**| Enable or disable logging for the sync operation | [optional] |

### Return type

[**ConnectorSyncRequestResult**](ConnectorSyncRequestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testConnectorImapConnection"></a>
# **testConnectorImapConnection**
> ConnectorImapConnectionTestResult testConnectorImapConnection(id).createConnectorImapConnectionOptions(createConnectorImapConnectionOptions).execute();

Test an inbox connector IMAP connection

Test the IMAP connection for a connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorImapConnectionOptions createConnectorImapConnectionOptions = new CreateConnectorImapConnectionOptions(); // CreateConnectorImapConnectionOptions | 
    try {
      ConnectorImapConnectionTestResult result = apiInstance.testConnectorImapConnection(id)
            .createConnectorImapConnectionOptions(createConnectorImapConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#testConnectorImapConnection");
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
| **createConnectorImapConnectionOptions** | [**CreateConnectorImapConnectionOptions**](CreateConnectorImapConnectionOptions)|  | [optional] |

### Return type

[**ConnectorImapConnectionTestResult**](ConnectorImapConnectionTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testConnectorImapConnectionOptions"></a>
# **testConnectorImapConnectionOptions**
> ConnectorImapConnectionTestResult testConnectorImapConnectionOptions(createConnectorImapConnectionOptions).execute();

Test an inbox connector IMAP connection options

Test the IMAP connection options for a connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    CreateConnectorImapConnectionOptions createConnectorImapConnectionOptions = new CreateConnectorImapConnectionOptions(); // CreateConnectorImapConnectionOptions | 
    try {
      ConnectorImapConnectionTestResult result = apiInstance.testConnectorImapConnectionOptions(createConnectorImapConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#testConnectorImapConnectionOptions");
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
| **createConnectorImapConnectionOptions** | [**CreateConnectorImapConnectionOptions**](CreateConnectorImapConnectionOptions)|  | |

### Return type

[**ConnectorImapConnectionTestResult**](ConnectorImapConnectionTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testConnectorSmtpConnection"></a>
# **testConnectorSmtpConnection**
> ConnectorSmtpConnectionTestResult testConnectorSmtpConnection(id).createConnectorSmtpConnectionOptions(createConnectorSmtpConnectionOptions).execute();

Test an inbox connector SMTP connection

Test the SMTP connection for a connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorSmtpConnectionOptions createConnectorSmtpConnectionOptions = new CreateConnectorSmtpConnectionOptions(); // CreateConnectorSmtpConnectionOptions | 
    try {
      ConnectorSmtpConnectionTestResult result = apiInstance.testConnectorSmtpConnection(id)
            .createConnectorSmtpConnectionOptions(createConnectorSmtpConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#testConnectorSmtpConnection");
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
| **createConnectorSmtpConnectionOptions** | [**CreateConnectorSmtpConnectionOptions**](CreateConnectorSmtpConnectionOptions)|  | [optional] |

### Return type

[**ConnectorSmtpConnectionTestResult**](ConnectorSmtpConnectionTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testConnectorSmtpConnectionOptions"></a>
# **testConnectorSmtpConnectionOptions**
> ConnectorSmtpConnectionTestResult testConnectorSmtpConnectionOptions(createConnectorSmtpConnectionOptions).execute();

Test an inbox connector SMTP connection options

Test the SMTP connection options for a connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    CreateConnectorSmtpConnectionOptions createConnectorSmtpConnectionOptions = new CreateConnectorSmtpConnectionOptions(); // CreateConnectorSmtpConnectionOptions | 
    try {
      ConnectorSmtpConnectionTestResult result = apiInstance.testConnectorSmtpConnectionOptions(createConnectorSmtpConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#testConnectorSmtpConnectionOptions");
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
| **createConnectorSmtpConnectionOptions** | [**CreateConnectorSmtpConnectionOptions**](CreateConnectorSmtpConnectionOptions)|  | |

### Return type

[**ConnectorSmtpConnectionTestResult**](ConnectorSmtpConnectionTestResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateConnector"></a>
# **updateConnector**
> ConnectorDto updateConnector(id, createConnectorOptions).execute();

Update an inbox connector

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorOptions createConnectorOptions = new CreateConnectorOptions(); // CreateConnectorOptions | 
    try {
      ConnectorDto result = apiInstance.updateConnector(id, createConnectorOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#updateConnector");
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
| **createConnectorOptions** | [**CreateConnectorOptions**](CreateConnectorOptions)|  | |

### Return type

[**ConnectorDto**](ConnectorDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateConnectorImapConnection"></a>
# **updateConnectorImapConnection**
> ConnectorImapConnectionDto updateConnectorImapConnection(id, createConnectorImapConnectionOptions).execute();

Update an inbox connector IMAP connection

Update IMAP connection for external inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorImapConnectionOptions createConnectorImapConnectionOptions = new CreateConnectorImapConnectionOptions(); // CreateConnectorImapConnectionOptions | 
    try {
      ConnectorImapConnectionDto result = apiInstance.updateConnectorImapConnection(id, createConnectorImapConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#updateConnectorImapConnection");
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
| **createConnectorImapConnectionOptions** | [**CreateConnectorImapConnectionOptions**](CreateConnectorImapConnectionOptions)|  | |

### Return type

[**ConnectorImapConnectionDto**](ConnectorImapConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateConnectorSmtpConnection"></a>
# **updateConnectorSmtpConnection**
> ConnectorSmtpConnectionDto updateConnectorSmtpConnection(id, createConnectorSmtpConnectionOptions).execute();

Update an inbox connector SMTP connection

Update SMTP connection for external inbox

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ConnectorControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ConnectorControllerApi apiInstance = new ConnectorControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConnectorSmtpConnectionOptions createConnectorSmtpConnectionOptions = new CreateConnectorSmtpConnectionOptions(); // CreateConnectorSmtpConnectionOptions | 
    try {
      ConnectorSmtpConnectionDto result = apiInstance.updateConnectorSmtpConnection(id, createConnectorSmtpConnectionOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectorControllerApi#updateConnectorSmtpConnection");
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
| **createConnectorSmtpConnectionOptions** | [**CreateConnectorSmtpConnectionOptions**](CreateConnectorSmtpConnectionOptions)|  | |

### Return type

[**ConnectorSmtpConnectionDto**](ConnectorSmtpConnectionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

