# MailServerControllerApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**describeMailServerDomain**](MailServerControllerApi#describeMailServerDomain) | **POST** /mail-server/describe/domain | Get DNS Mail Server records for a domain
[**getDnsLookup**](MailServerControllerApi#getDnsLookup) | **POST** /mail-server/describe/dns-lookup | Lookup DNS records for a domain
[**getIpAddress**](MailServerControllerApi#getIpAddress) | **POST** /mail-server/describe/ip-address | Get IP address for a domain
[**verifyEmailAddress**](MailServerControllerApi#verifyEmailAddress) | **POST** /mail-server/verify/email-address | Verify the existence of an email address at a given mail server.


<a name="describeMailServerDomain"></a>
# **describeMailServerDomain**
> DescribeMailServerDomainResult describeMailServerDomain(describeDomainOptions)

Get DNS Mail Server records for a domain

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MailServerControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MailServerControllerApi apiInstance = new MailServerControllerApi(defaultClient);
    DescribeDomainOptions describeDomainOptions = new DescribeDomainOptions(); // DescribeDomainOptions | 
    try {
      DescribeMailServerDomainResult result = apiInstance.describeMailServerDomain(describeDomainOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailServerControllerApi#describeMailServerDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **describeDomainOptions** | [**DescribeDomainOptions**](DescribeDomainOptions)|  |

### Return type

[**DescribeMailServerDomainResult**](DescribeMailServerDomainResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getDnsLookup"></a>
# **getDnsLookup**
> DNSLookupResults getDnsLookup(dnSLookupOptions)

Lookup DNS records for a domain

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MailServerControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MailServerControllerApi apiInstance = new MailServerControllerApi(defaultClient);
    DNSLookupOptions dnSLookupOptions = new DNSLookupOptions(); // DNSLookupOptions | 
    try {
      DNSLookupResults result = apiInstance.getDnsLookup(dnSLookupOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailServerControllerApi#getDnsLookup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dnSLookupOptions** | [**DNSLookupOptions**](DNSLookupOptions)|  |

### Return type

[**DNSLookupResults**](DNSLookupResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="getIpAddress"></a>
# **getIpAddress**
> IPAddressResult getIpAddress(name)

Get IP address for a domain

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MailServerControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MailServerControllerApi apiInstance = new MailServerControllerApi(defaultClient);
    String name = "name_example"; // String | 
    try {
      IPAddressResult result = apiInstance.getIpAddress(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailServerControllerApi#getIpAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**IPAddressResult**](IPAddressResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

<a name="verifyEmailAddress"></a>
# **verifyEmailAddress**
> EmailVerificationResult verifyEmailAddress(verifyEmailAddressOptions)

Verify the existence of an email address at a given mail server.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.MailServerControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    MailServerControllerApi apiInstance = new MailServerControllerApi(defaultClient);
    VerifyEmailAddressOptions verifyEmailAddressOptions = new VerifyEmailAddressOptions(); // VerifyEmailAddressOptions | 
    try {
      EmailVerificationResult result = apiInstance.verifyEmailAddress(verifyEmailAddressOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MailServerControllerApi#verifyEmailAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **verifyEmailAddressOptions** | [**VerifyEmailAddressOptions**](VerifyEmailAddressOptions)|  |

### Return type

[**EmailVerificationResult**](EmailVerificationResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |

