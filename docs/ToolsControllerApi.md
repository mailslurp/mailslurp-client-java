# ToolsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyzeDmarcReport**](ToolsControllerApi#analyzeDmarcReport) | **POST** /tools/analyze-dmarc-report | Parse and summarize a DMARC aggregate XML report |
| [**analyzeEmailHeaders**](ToolsControllerApi#analyzeEmailHeaders) | **POST** /tools/analyze-email-headers | Analyze email headers for auth results and delivery path |
| [**checkCampaignProbe**](ToolsControllerApi#checkCampaignProbe) | **POST** /tools/check-campaign-probe | Run a one-shot free campaign probe preflight check |
| [**checkDnsPropagation**](ToolsControllerApi#checkDnsPropagation) | **POST** /tools/check-dns-propagation | Check DNS propagation for a host and record type across configured resolvers |
| [**checkDomainMonitor**](ToolsControllerApi#checkDomainMonitor) | **POST** /tools/check-domain-monitor | Run a one-shot free domain monitor posture check |
| [**checkEmailAudit**](ToolsControllerApi#checkEmailAudit) | **POST** /tools/check-email-audit | Run a one-shot free email audit across links, images, HTML, and client support |
| [**checkEmailAuthStack**](ToolsControllerApi#checkEmailAuthStack) | **POST** /tools/check-email-auth-stack | Run a one-shot combined SPF, DKIM, DMARC, BIMI, MX, MTA-STS, and TLS-RPT check |
| [**checkEmailBlacklist**](ToolsControllerApi#checkEmailBlacklist) | **POST** /tools/check-email-blacklists | Check whether a domain or IP appears on configured DNS blacklists |
| [**checkEmailFeaturesClientSupport**](ToolsControllerApi#checkEmailFeaturesClientSupport) | **POST** /tools/check-email-features-client-support | Check email client support for email HTML and CSS features |
| [**createNewFakeEmailAddress**](ToolsControllerApi#createNewFakeEmailAddress) | **POST** /tools/fake-email | Create a new email address using the fake email domains |
| [**deleteNewFakeEmailAddress**](ToolsControllerApi#deleteNewFakeEmailAddress) | **DELETE** /tools/fake-email | Delete a fake email address using the fake email domains |
| [**generateBimiRecord**](ToolsControllerApi#generateBimiRecord) | **POST** /tools/generate-bimi-record | Create a BIMI record policy |
| [**generateDmarcRecord**](ToolsControllerApi#generateDmarcRecord) | **POST** /tools/generate-dmarc-record | Create a DMARC record policy |
| [**generateMtaStsRecord**](ToolsControllerApi#generateMtaStsRecord) | **POST** /tools/generate-mta-sts-record | Create a TLS reporting record policy |
| [**generateSpfRecord**](ToolsControllerApi#generateSpfRecord) | **POST** /tools/generate-spf-record | Create an SPF record |
| [**generateTlsReportingRecord**](ToolsControllerApi#generateTlsReportingRecord) | **POST** /tools/generate-tls-reporting-record | Create a TLS reporting record policy |
| [**getFakeEmailByEmailAddress**](ToolsControllerApi#getFakeEmailByEmailAddress) | **GET** /tools/fake-email/byEmailAddress |  |
| [**getFakeEmailById**](ToolsControllerApi#getFakeEmailById) | **GET** /tools/fake-email | Get a fake email by its ID |
| [**getFakeEmailRaw**](ToolsControllerApi#getFakeEmailRaw) | **GET** /tools/fake-email/html | Get raw fake email content |
| [**getFakeEmailsForAddress**](ToolsControllerApi#getFakeEmailsForAddress) | **GET** /tools/fake-emails | Get fake emails for an address |
| [**lookupBimiDomain**](ToolsControllerApi#lookupBimiDomain) | **POST** /tools/lookup-bimi-domain | Lookup a BIMI record policy |
| [**lookupDkimDomain**](ToolsControllerApi#lookupDkimDomain) | **POST** /tools/lookup-dkim-domain | Lookup and validate a DKIM record |
| [**lookupDmarcDomain**](ToolsControllerApi#lookupDmarcDomain) | **POST** /tools/lookup-dmarc-domain | Lookup a DMARC record policy |
| [**lookupMtaStsDomain**](ToolsControllerApi#lookupMtaStsDomain) | **POST** /tools/lookup-mta-sts-domain | Lookup a MTA-STS domain policy |
| [**lookupMxRecord**](ToolsControllerApi#lookupMxRecord) | **POST** /tools/lookup-mx-records | Lookup a MX records for a domain |
| [**lookupPtr**](ToolsControllerApi#lookupPtr) | **POST** /tools/lookup-ptr | Lookup PTR records for an IP address |
| [**lookupSpfDomain**](ToolsControllerApi#lookupSpfDomain) | **POST** /tools/lookup-spf-domain | Lookup and validate an SPF record |
| [**lookupTlsReportingDomain**](ToolsControllerApi#lookupTlsReportingDomain) | **POST** /tools/lookup-tls-reporting-domain | Lookup a TLS reporting domain policy |
| [**testSmtpServer**](ToolsControllerApi#testSmtpServer) | **POST** /tools/test-smtp-server | Run a conservative SMTP connectivity, TLS, and AUTH diagnostic |


<a id="analyzeDmarcReport"></a>
# **analyzeDmarcReport**
> AnalyzeDmarcReportResults analyzeDmarcReport(analyzeDmarcReportOptions).execute();

Parse and summarize a DMARC aggregate XML report

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    AnalyzeDmarcReportOptions analyzeDmarcReportOptions = new AnalyzeDmarcReportOptions(); // AnalyzeDmarcReportOptions | 
    try {
      AnalyzeDmarcReportResults result = apiInstance.analyzeDmarcReport(analyzeDmarcReportOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#analyzeDmarcReport");
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
| **analyzeDmarcReportOptions** | [**AnalyzeDmarcReportOptions**](AnalyzeDmarcReportOptions)|  | |

### Return type

[**AnalyzeDmarcReportResults**](AnalyzeDmarcReportResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="analyzeEmailHeaders"></a>
# **analyzeEmailHeaders**
> AnalyzeEmailHeadersResults analyzeEmailHeaders(analyzeEmailHeadersOptions).execute();

Analyze email headers for auth results and delivery path

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    AnalyzeEmailHeadersOptions analyzeEmailHeadersOptions = new AnalyzeEmailHeadersOptions(); // AnalyzeEmailHeadersOptions | 
    try {
      AnalyzeEmailHeadersResults result = apiInstance.analyzeEmailHeaders(analyzeEmailHeadersOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#analyzeEmailHeaders");
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
| **analyzeEmailHeadersOptions** | [**AnalyzeEmailHeadersOptions**](AnalyzeEmailHeadersOptions)|  | |

### Return type

[**AnalyzeEmailHeadersResults**](AnalyzeEmailHeadersResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkCampaignProbe"></a>
# **checkCampaignProbe**
> CheckCampaignProbeResults checkCampaignProbe(checkCampaignProbeOptions).execute();

Run a one-shot free campaign probe preflight check

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    CheckCampaignProbeOptions checkCampaignProbeOptions = new CheckCampaignProbeOptions(); // CheckCampaignProbeOptions | 
    try {
      CheckCampaignProbeResults result = apiInstance.checkCampaignProbe(checkCampaignProbeOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#checkCampaignProbe");
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
| **checkCampaignProbeOptions** | [**CheckCampaignProbeOptions**](CheckCampaignProbeOptions)|  | |

### Return type

[**CheckCampaignProbeResults**](CheckCampaignProbeResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkDnsPropagation"></a>
# **checkDnsPropagation**
> CheckDnsPropagationResults checkDnsPropagation(checkDnsPropagationOptions).execute();

Check DNS propagation for a host and record type across configured resolvers

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    CheckDnsPropagationOptions checkDnsPropagationOptions = new CheckDnsPropagationOptions(); // CheckDnsPropagationOptions | 
    try {
      CheckDnsPropagationResults result = apiInstance.checkDnsPropagation(checkDnsPropagationOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#checkDnsPropagation");
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
| **checkDnsPropagationOptions** | [**CheckDnsPropagationOptions**](CheckDnsPropagationOptions)|  | |

### Return type

[**CheckDnsPropagationResults**](CheckDnsPropagationResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkDomainMonitor"></a>
# **checkDomainMonitor**
> CheckDomainMonitorResults checkDomainMonitor(checkDomainMonitorOptions).execute();

Run a one-shot free domain monitor posture check

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    CheckDomainMonitorOptions checkDomainMonitorOptions = new CheckDomainMonitorOptions(); // CheckDomainMonitorOptions | 
    try {
      CheckDomainMonitorResults result = apiInstance.checkDomainMonitor(checkDomainMonitorOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#checkDomainMonitor");
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
| **checkDomainMonitorOptions** | [**CheckDomainMonitorOptions**](CheckDomainMonitorOptions)|  | |

### Return type

[**CheckDomainMonitorResults**](CheckDomainMonitorResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEmailAudit"></a>
# **checkEmailAudit**
> EmailAuditAnalysisResult checkEmailAudit(checkEmailAuditOptions).execute();

Run a one-shot free email audit across links, images, HTML, and client support

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    CheckEmailAuditOptions checkEmailAuditOptions = new CheckEmailAuditOptions(); // CheckEmailAuditOptions | 
    try {
      EmailAuditAnalysisResult result = apiInstance.checkEmailAudit(checkEmailAuditOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#checkEmailAudit");
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
| **checkEmailAuditOptions** | [**CheckEmailAuditOptions**](CheckEmailAuditOptions)|  | |

### Return type

[**EmailAuditAnalysisResult**](EmailAuditAnalysisResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEmailAuthStack"></a>
# **checkEmailAuthStack**
> CheckEmailAuthStackResults checkEmailAuthStack(checkEmailAuthStackOptions).execute();

Run a one-shot combined SPF, DKIM, DMARC, BIMI, MX, MTA-STS, and TLS-RPT check

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    CheckEmailAuthStackOptions checkEmailAuthStackOptions = new CheckEmailAuthStackOptions(); // CheckEmailAuthStackOptions | 
    try {
      CheckEmailAuthStackResults result = apiInstance.checkEmailAuthStack(checkEmailAuthStackOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#checkEmailAuthStack");
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
| **checkEmailAuthStackOptions** | [**CheckEmailAuthStackOptions**](CheckEmailAuthStackOptions)|  | |

### Return type

[**CheckEmailAuthStackResults**](CheckEmailAuthStackResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEmailBlacklist"></a>
# **checkEmailBlacklist**
> CheckEmailBlacklistResults checkEmailBlacklist(checkEmailBlacklistOptions).execute();

Check whether a domain or IP appears on configured DNS blacklists

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    CheckEmailBlacklistOptions checkEmailBlacklistOptions = new CheckEmailBlacklistOptions(); // CheckEmailBlacklistOptions | 
    try {
      CheckEmailBlacklistResults result = apiInstance.checkEmailBlacklist(checkEmailBlacklistOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#checkEmailBlacklist");
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
| **checkEmailBlacklistOptions** | [**CheckEmailBlacklistOptions**](CheckEmailBlacklistOptions)|  | |

### Return type

[**CheckEmailBlacklistResults**](CheckEmailBlacklistResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="checkEmailFeaturesClientSupport"></a>
# **checkEmailFeaturesClientSupport**
> CheckEmailFeaturesClientSupportResults checkEmailFeaturesClientSupport(checkEmailFeaturesClientSupportOptions).execute();

Check email client support for email HTML and CSS features

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    CheckEmailFeaturesClientSupportOptions checkEmailFeaturesClientSupportOptions = new CheckEmailFeaturesClientSupportOptions(); // CheckEmailFeaturesClientSupportOptions | 
    try {
      CheckEmailFeaturesClientSupportResults result = apiInstance.checkEmailFeaturesClientSupport(checkEmailFeaturesClientSupportOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#checkEmailFeaturesClientSupport");
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
| **checkEmailFeaturesClientSupportOptions** | [**CheckEmailFeaturesClientSupportOptions**](CheckEmailFeaturesClientSupportOptions)|  | |

### Return type

[**CheckEmailFeaturesClientSupportResults**](CheckEmailFeaturesClientSupportResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createNewFakeEmailAddress"></a>
# **createNewFakeEmailAddress**
> NewFakeEmailAddressResult createNewFakeEmailAddress().execute();

Create a new email address using the fake email domains

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    try {
      NewFakeEmailAddressResult result = apiInstance.createNewFakeEmailAddress()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#createNewFakeEmailAddress");
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

[**NewFakeEmailAddressResult**](NewFakeEmailAddressResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteNewFakeEmailAddress"></a>
# **deleteNewFakeEmailAddress**
> deleteNewFakeEmailAddress(emailAddress).execute();

Delete a fake email address using the fake email domains

Delete a fake email address using the fake email domains

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    try {
      apiInstance.deleteNewFakeEmailAddress(emailAddress)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#deleteNewFakeEmailAddress");
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
| **emailAddress** | **String**|  | |

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

<a id="generateBimiRecord"></a>
# **generateBimiRecord**
> GenerateBimiRecordResults generateBimiRecord(generateBimiRecordOptions).execute();

Create a BIMI record policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    GenerateBimiRecordOptions generateBimiRecordOptions = new GenerateBimiRecordOptions(); // GenerateBimiRecordOptions | 
    try {
      GenerateBimiRecordResults result = apiInstance.generateBimiRecord(generateBimiRecordOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#generateBimiRecord");
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
| **generateBimiRecordOptions** | [**GenerateBimiRecordOptions**](GenerateBimiRecordOptions)|  | |

### Return type

[**GenerateBimiRecordResults**](GenerateBimiRecordResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateDmarcRecord"></a>
# **generateDmarcRecord**
> GenerateDmarcRecordResults generateDmarcRecord(generateDmarcRecordOptions).execute();

Create a DMARC record policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    GenerateDmarcRecordOptions generateDmarcRecordOptions = new GenerateDmarcRecordOptions(); // GenerateDmarcRecordOptions | 
    try {
      GenerateDmarcRecordResults result = apiInstance.generateDmarcRecord(generateDmarcRecordOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#generateDmarcRecord");
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
| **generateDmarcRecordOptions** | [**GenerateDmarcRecordOptions**](GenerateDmarcRecordOptions)|  | |

### Return type

[**GenerateDmarcRecordResults**](GenerateDmarcRecordResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateMtaStsRecord"></a>
# **generateMtaStsRecord**
> GenerateMtaStsRecordResults generateMtaStsRecord(generateMtaStsRecordOptions).execute();

Create a TLS reporting record policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    GenerateMtaStsRecordOptions generateMtaStsRecordOptions = new GenerateMtaStsRecordOptions(); // GenerateMtaStsRecordOptions | 
    try {
      GenerateMtaStsRecordResults result = apiInstance.generateMtaStsRecord(generateMtaStsRecordOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#generateMtaStsRecord");
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
| **generateMtaStsRecordOptions** | [**GenerateMtaStsRecordOptions**](GenerateMtaStsRecordOptions)|  | |

### Return type

[**GenerateMtaStsRecordResults**](GenerateMtaStsRecordResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateSpfRecord"></a>
# **generateSpfRecord**
> GenerateSpfRecordResults generateSpfRecord(generateSpfRecordOptions).execute();

Create an SPF record

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    GenerateSpfRecordOptions generateSpfRecordOptions = new GenerateSpfRecordOptions(); // GenerateSpfRecordOptions | 
    try {
      GenerateSpfRecordResults result = apiInstance.generateSpfRecord(generateSpfRecordOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#generateSpfRecord");
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
| **generateSpfRecordOptions** | [**GenerateSpfRecordOptions**](GenerateSpfRecordOptions)|  | |

### Return type

[**GenerateSpfRecordResults**](GenerateSpfRecordResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="generateTlsReportingRecord"></a>
# **generateTlsReportingRecord**
> GenerateTlsReportingRecordResults generateTlsReportingRecord(generateTlsReportingRecordOptions).execute();

Create a TLS reporting record policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    GenerateTlsReportingRecordOptions generateTlsReportingRecordOptions = new GenerateTlsReportingRecordOptions(); // GenerateTlsReportingRecordOptions | 
    try {
      GenerateTlsReportingRecordResults result = apiInstance.generateTlsReportingRecord(generateTlsReportingRecordOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#generateTlsReportingRecord");
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
| **generateTlsReportingRecordOptions** | [**GenerateTlsReportingRecordOptions**](GenerateTlsReportingRecordOptions)|  | |

### Return type

[**GenerateTlsReportingRecordResults**](GenerateTlsReportingRecordResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFakeEmailByEmailAddress"></a>
# **getFakeEmailByEmailAddress**
> FakeEmailResult getFakeEmailByEmailAddress(emailAddress).execute();



### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    try {
      FakeEmailResult result = apiInstance.getFakeEmailByEmailAddress(emailAddress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#getFakeEmailByEmailAddress");
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
| **emailAddress** | **String**|  | |

### Return type

[**FakeEmailResult**](FakeEmailResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFakeEmailById"></a>
# **getFakeEmailById**
> FakeEmailResult getFakeEmailById(id).execute();

Get a fake email by its ID

Get a fake email by its ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      FakeEmailResult result = apiInstance.getFakeEmailById(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#getFakeEmailById");
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

[**FakeEmailResult**](FakeEmailResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFakeEmailRaw"></a>
# **getFakeEmailRaw**
> String getFakeEmailRaw(id).execute();

Get raw fake email content

Retrieve the raw content of a fake email by its ID

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      String result = apiInstance.getFakeEmailRaw(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#getFakeEmailRaw");
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

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain;charset=utf-8, text/html;charset=utf-8, text/plain; charset=utf-8, text/html; charset=utf-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getFakeEmailsForAddress"></a>
# **getFakeEmailsForAddress**
> List&lt;FakeEmailPreview&gt; getFakeEmailsForAddress(emailAddress).page(page).execute();

Get fake emails for an address

Get fake emails for an address

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    String emailAddress = "emailAddress_example"; // String | 
    Integer page = 56; // Integer | 
    try {
      List<FakeEmailPreview> result = apiInstance.getFakeEmailsForAddress(emailAddress)
            .page(page)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#getFakeEmailsForAddress");
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
| **emailAddress** | **String**|  | |
| **page** | **Integer**|  | [optional] |

### Return type

[**List&lt;FakeEmailPreview&gt;**](FakeEmailPreview)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupBimiDomain"></a>
# **lookupBimiDomain**
> LookupBimiDomainResults lookupBimiDomain(lookupBimiDomainOptions).execute();

Lookup a BIMI record policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupBimiDomainOptions lookupBimiDomainOptions = new LookupBimiDomainOptions(); // LookupBimiDomainOptions | 
    try {
      LookupBimiDomainResults result = apiInstance.lookupBimiDomain(lookupBimiDomainOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupBimiDomain");
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
| **lookupBimiDomainOptions** | [**LookupBimiDomainOptions**](LookupBimiDomainOptions)|  | |

### Return type

[**LookupBimiDomainResults**](LookupBimiDomainResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupDkimDomain"></a>
# **lookupDkimDomain**
> LookupDkimDomainResults lookupDkimDomain(lookupDkimDomainOptions).execute();

Lookup and validate a DKIM record

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupDkimDomainOptions lookupDkimDomainOptions = new LookupDkimDomainOptions(); // LookupDkimDomainOptions | 
    try {
      LookupDkimDomainResults result = apiInstance.lookupDkimDomain(lookupDkimDomainOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupDkimDomain");
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
| **lookupDkimDomainOptions** | [**LookupDkimDomainOptions**](LookupDkimDomainOptions)|  | |

### Return type

[**LookupDkimDomainResults**](LookupDkimDomainResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupDmarcDomain"></a>
# **lookupDmarcDomain**
> LookupDmarcDomainResults lookupDmarcDomain(lookupDmarcDomainOptions).execute();

Lookup a DMARC record policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupDmarcDomainOptions lookupDmarcDomainOptions = new LookupDmarcDomainOptions(); // LookupDmarcDomainOptions | 
    try {
      LookupDmarcDomainResults result = apiInstance.lookupDmarcDomain(lookupDmarcDomainOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupDmarcDomain");
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
| **lookupDmarcDomainOptions** | [**LookupDmarcDomainOptions**](LookupDmarcDomainOptions)|  | |

### Return type

[**LookupDmarcDomainResults**](LookupDmarcDomainResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupMtaStsDomain"></a>
# **lookupMtaStsDomain**
> LookupMtaStsDomainResults lookupMtaStsDomain(lookupMtaStsDomainOptions).execute();

Lookup a MTA-STS domain policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupMtaStsDomainOptions lookupMtaStsDomainOptions = new LookupMtaStsDomainOptions(); // LookupMtaStsDomainOptions | 
    try {
      LookupMtaStsDomainResults result = apiInstance.lookupMtaStsDomain(lookupMtaStsDomainOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupMtaStsDomain");
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
| **lookupMtaStsDomainOptions** | [**LookupMtaStsDomainOptions**](LookupMtaStsDomainOptions)|  | |

### Return type

[**LookupMtaStsDomainResults**](LookupMtaStsDomainResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupMxRecord"></a>
# **lookupMxRecord**
> LookupMxRecordsResults lookupMxRecord(lookupMxRecordsOptions).execute();

Lookup a MX records for a domain

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupMxRecordsOptions lookupMxRecordsOptions = new LookupMxRecordsOptions(); // LookupMxRecordsOptions | 
    try {
      LookupMxRecordsResults result = apiInstance.lookupMxRecord(lookupMxRecordsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupMxRecord");
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
| **lookupMxRecordsOptions** | [**LookupMxRecordsOptions**](LookupMxRecordsOptions)|  | |

### Return type

[**LookupMxRecordsResults**](LookupMxRecordsResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupPtr"></a>
# **lookupPtr**
> LookupPtrResults lookupPtr(lookupPtrOptions).execute();

Lookup PTR records for an IP address

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupPtrOptions lookupPtrOptions = new LookupPtrOptions(); // LookupPtrOptions | 
    try {
      LookupPtrResults result = apiInstance.lookupPtr(lookupPtrOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupPtr");
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
| **lookupPtrOptions** | [**LookupPtrOptions**](LookupPtrOptions)|  | |

### Return type

[**LookupPtrResults**](LookupPtrResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupSpfDomain"></a>
# **lookupSpfDomain**
> LookupSpfDomainResults lookupSpfDomain(lookupSpfDomainOptions).execute();

Lookup and validate an SPF record

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupSpfDomainOptions lookupSpfDomainOptions = new LookupSpfDomainOptions(); // LookupSpfDomainOptions | 
    try {
      LookupSpfDomainResults result = apiInstance.lookupSpfDomain(lookupSpfDomainOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupSpfDomain");
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
| **lookupSpfDomainOptions** | [**LookupSpfDomainOptions**](LookupSpfDomainOptions)|  | |

### Return type

[**LookupSpfDomainResults**](LookupSpfDomainResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="lookupTlsReportingDomain"></a>
# **lookupTlsReportingDomain**
> LookupTlsReportingDomainResults lookupTlsReportingDomain(lookupTlsReportingDomainOptions).execute();

Lookup a TLS reporting domain policy

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    LookupTlsReportingDomainOptions lookupTlsReportingDomainOptions = new LookupTlsReportingDomainOptions(); // LookupTlsReportingDomainOptions | 
    try {
      LookupTlsReportingDomainResults result = apiInstance.lookupTlsReportingDomain(lookupTlsReportingDomainOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#lookupTlsReportingDomain");
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
| **lookupTlsReportingDomainOptions** | [**LookupTlsReportingDomainOptions**](LookupTlsReportingDomainOptions)|  | |

### Return type

[**LookupTlsReportingDomainResults**](LookupTlsReportingDomainResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="testSmtpServer"></a>
# **testSmtpServer**
> TestSmtpServerResults testSmtpServer(testSmtpServerOptions).execute();

Run a conservative SMTP connectivity, TLS, and AUTH diagnostic

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.ToolsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    ToolsControllerApi apiInstance = new ToolsControllerApi(defaultClient);
    TestSmtpServerOptions testSmtpServerOptions = new TestSmtpServerOptions(); // TestSmtpServerOptions | 
    try {
      TestSmtpServerResults result = apiInstance.testSmtpServer(testSmtpServerOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolsControllerApi#testSmtpServer");
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
| **testSmtpServerOptions** | [**TestSmtpServerOptions**](TestSmtpServerOptions)|  | |

### Return type

[**TestSmtpServerResults**](TestSmtpServerResults)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

