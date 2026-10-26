# DevicePreviewsControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDevicePreviewRun**](DevicePreviewsControllerApi#cancelDevicePreviewRun) | **POST** /emails/device-previews/{runId}/cancel | Cancel a running device preview run |
| [**createDevicePreviewFeedback**](DevicePreviewsControllerApi#createDevicePreviewFeedback) | **POST** /emails/device-previews/feedback | Create device preview feedback |
| [**createDevicePreviewFolder**](DevicePreviewsControllerApi#createDevicePreviewFolder) | **POST** /emails/device-previews/folders | Create a device preview folder |
| [**createDevicePreviewImportAddress**](DevicePreviewsControllerApi#createDevicePreviewImportAddress) | **POST** /emails/device-previews/import-addresses | Create a temporary email address for device preview import |
| [**createDevicePreviewProfile**](DevicePreviewsControllerApi#createDevicePreviewProfile) | **POST** /emails/device-previews/profiles | Create a device preview profile |
| [**createDevicePreviewRun**](DevicePreviewsControllerApi#createDevicePreviewRun) | **POST** /emails/{emailId}/device-previews | Create a new device preview run for an email |
| [**createDevicePreviewRunFromFile**](DevicePreviewsControllerApi#createDevicePreviewRunFromFile) | **POST** /emails/device-previews/import/file | Create a device preview run from an HTML, EML, or ZIP file |
| [**createDevicePreviewRunFromHtmlImport**](DevicePreviewsControllerApi#createDevicePreviewRunFromHtmlImport) | **POST** /emails/device-previews/import/html | Create a device preview run from HTML |
| [**createDevicePreviewRunFromImport**](DevicePreviewsControllerApi#createDevicePreviewRunFromImport) | **POST** /emails/device-previews/import | Create a device preview run from imported raw MIME |
| [**createDevicePreviewRunFromMultipartImport**](DevicePreviewsControllerApi#createDevicePreviewRunFromMultipartImport) | **POST** /emails/device-previews/import/multipart | Create a device preview run from multipart EML upload |
| [**createDevicePreviewRunFromRawImport**](DevicePreviewsControllerApi#createDevicePreviewRunFromRawImport) | **POST** /emails/device-previews/import/raw | Create a device preview run from raw MIME bytes |
| [**createDevicePreviewShareLink**](DevicePreviewsControllerApi#createDevicePreviewShareLink) | **POST** /emails/device-previews/{runId}/share-links | Create a share link for a device preview run |
| [**deleteDevicePreviewFolder**](DevicePreviewsControllerApi#deleteDevicePreviewFolder) | **DELETE** /emails/device-previews/folders/{folderId} | Delete a folder, preserving renders and child folders |
| [**deleteDevicePreviewProfile**](DevicePreviewsControllerApi#deleteDevicePreviewProfile) | **DELETE** /emails/device-previews/profiles/{profileId} | Delete a device preview profile |
| [**deleteDevicePreviewRun**](DevicePreviewsControllerApi#deleteDevicePreviewRun) | **DELETE** /emails/device-previews/{runId} | Delete local device preview run data |
| [**deleteDevicePreviewShareLink**](DevicePreviewsControllerApi#deleteDevicePreviewShareLink) | **DELETE** /emails/device-previews/share-links/{shareLinkId} | Revoke a device preview share link |
| [**downloadDevicePreviewEmailSubmissionSourceEmail**](DevicePreviewsControllerApi#downloadDevicePreviewEmailSubmissionSourceEmail) | **GET** /emails/device-previews/email-submissions/{submissionId}/source-email/raw | Download the original RFC822 email for a device preview submission |
| [**downloadDevicePreviewRunSourceEmail**](DevicePreviewsControllerApi#downloadDevicePreviewRunSourceEmail) | **GET** /emails/device-previews/{runId}/source-email/raw | Download the original RFC822 email for a device preview run |
| [**ensureDevicePreviewRun**](DevicePreviewsControllerApi#ensureDevicePreviewRun) | **PUT** /emails/{emailId}/device-previews/latest | Return active run for email or create one when none exists |
| [**getDevicePreviewEmailDomainOrCreate**](DevicePreviewsControllerApi#getDevicePreviewEmailDomainOrCreate) | **PUT** /emails/device-previews/email-domain | Return account device preview email domain setup or create one |
| [**getDevicePreviewEmailRuns**](DevicePreviewsControllerApi#getDevicePreviewEmailRuns) | **GET** /emails/device-previews/email-runs | List device preview runs created from account email domains |
| [**getDevicePreviewEmailSubmissionSourceEmail**](DevicePreviewsControllerApi#getDevicePreviewEmailSubmissionSourceEmail) | **GET** /emails/device-previews/email-submissions/{submissionId}/source-email | Get the original email content for a device preview submission |
| [**getDevicePreviewEmailSubmissions**](DevicePreviewsControllerApi#getDevicePreviewEmailSubmissions) | **GET** /emails/device-previews/email-submissions | List received device preview email submissions |
| [**getDevicePreviewFeedback**](DevicePreviewsControllerApi#getDevicePreviewFeedback) | **GET** /emails/device-previews/feedback/{feedbackId} | Get a single device preview feedback item |
| [**getDevicePreviewFeedbackItems**](DevicePreviewsControllerApi#getDevicePreviewFeedbackItems) | **GET** /emails/device-previews/feedback | List device preview feedback |
| [**getDevicePreviewFolder**](DevicePreviewsControllerApi#getDevicePreviewFolder) | **GET** /emails/device-previews/folders/{folderId} | Get a device preview folder |
| [**getDevicePreviewFolders**](DevicePreviewsControllerApi#getDevicePreviewFolders) | **GET** /emails/device-previews/folders | List device preview folders |
| [**getDevicePreviewImportAddress**](DevicePreviewsControllerApi#getDevicePreviewImportAddress) | **GET** /emails/device-previews/import-addresses/{sessionId} | Get temporary device preview import address status |
| [**getDevicePreviewNativeTargetAvailability**](DevicePreviewsControllerApi#getDevicePreviewNativeTargetAvailability) | **GET** /emails/device-previews/native-targets/availability | Get native device preview target availability |
| [**getDevicePreviewProfile**](DevicePreviewsControllerApi#getDevicePreviewProfile) | **GET** /emails/device-previews/profiles/{profileId} | Get a device preview profile |
| [**getDevicePreviewProfiles**](DevicePreviewsControllerApi#getDevicePreviewProfiles) | **GET** /emails/device-previews/profiles | List device preview profiles |
| [**getDevicePreviewRun**](DevicePreviewsControllerApi#getDevicePreviewRun) | **GET** /emails/device-previews/{runId} | Get device preview run status |
| [**getDevicePreviewRunProviderProgress**](DevicePreviewsControllerApi#getDevicePreviewRunProviderProgress) | **GET** /emails/device-previews/{runId}/providers/{provider} | Get provider-level progress for a device preview run |
| [**getDevicePreviewRunResults**](DevicePreviewsControllerApi#getDevicePreviewRunResults) | **GET** /emails/device-previews/{runId}/results | Get device preview run results |
| [**getDevicePreviewRunScreenshot**](DevicePreviewsControllerApi#getDevicePreviewRunScreenshot) | **GET** /emails/device-previews/{runId}/screenshots/{screenshotId}/image | Get a device preview screenshot image |
| [**getDevicePreviewRunSourceEmail**](DevicePreviewsControllerApi#getDevicePreviewRunSourceEmail) | **GET** /emails/device-previews/{runId}/source-email | Get the original email content for a device preview run |
| [**getDevicePreviewRuns**](DevicePreviewsControllerApi#getDevicePreviewRuns) | **GET** /emails/{emailId}/device-previews | List previous device preview runs for an email |
| [**getDevicePreviewRunsForAccount**](DevicePreviewsControllerApi#getDevicePreviewRunsForAccount) | **GET** /emails/device-previews | List previous device preview runs for account |
| [**getDevicePreviewRunsForAccountOffsetPaginated**](DevicePreviewsControllerApi#getDevicePreviewRunsForAccountOffsetPaginated) | **GET** /emails/device-previews/offset-paginated | List previous device preview runs for account in paginated form |
| [**getDevicePreviewRunsOffsetPaginated**](DevicePreviewsControllerApi#getDevicePreviewRunsOffsetPaginated) | **GET** /emails/{emailId}/device-previews/offset-paginated | List previous device preview runs for an email in paginated form |
| [**getDevicePreviewShareLinks**](DevicePreviewsControllerApi#getDevicePreviewShareLinks) | **GET** /emails/device-previews/{runId}/share-links | List share links for a device preview run |
| [**getDevicePreviewSharedResult**](DevicePreviewsControllerApi#getDevicePreviewSharedResult) | **GET** /emails/device-previews/share/{shareToken} | Get a public shared device preview result |
| [**getDevicePreviewSharedResultScreenshot**](DevicePreviewsControllerApi#getDevicePreviewSharedResultScreenshot) | **GET** /emails/device-previews/share/{shareToken}/screenshots/{screenshotId}/image | Get a public shared device preview screenshot image |
| [**getDevicePreviewTargets**](DevicePreviewsControllerApi#getDevicePreviewTargets) | **GET** /device-preview-targets | List device preview targets |
| [**moveDevicePreviewRuns**](DevicePreviewsControllerApi#moveDevicePreviewRuns) | **PUT** /emails/device-previews/folders/runs | Move device preview runs to a folder or Unfiled |
| [**rerunDevicePreviewTargets**](DevicePreviewsControllerApi#rerunDevicePreviewTargets) | **POST** /emails/device-previews/{runId}/targets/rerun | Rerun selected device preview targets in the same run |
| [**updateDevicePreviewEmailDomainSubdomain**](DevicePreviewsControllerApi#updateDevicePreviewEmailDomainSubdomain) | **PUT** /emails/device-previews/email-domain/subdomain | Update account device preview email subdomain |
| [**updateDevicePreviewFeedback**](DevicePreviewsControllerApi#updateDevicePreviewFeedback) | **PUT** /emails/device-previews/feedback/{feedbackId} | Update device preview feedback |
| [**updateDevicePreviewFolder**](DevicePreviewsControllerApi#updateDevicePreviewFolder) | **PUT** /emails/device-previews/folders/{folderId} | Rename or move a device preview folder |
| [**updateDevicePreviewProfile**](DevicePreviewsControllerApi#updateDevicePreviewProfile) | **PUT** /emails/device-previews/profiles/{profileId} | Update a device preview profile |
| [**waitForDevicePreviewEmailRuns**](DevicePreviewsControllerApi#waitForDevicePreviewEmailRuns) | **GET** /emails/device-previews/email-runs/wait | Wait for device preview runs created from account email domains |
| [**waitForDevicePreviewEmailSubmissions**](DevicePreviewsControllerApi#waitForDevicePreviewEmailSubmissions) | **GET** /emails/device-previews/email-submissions/wait | Wait for received device preview email submissions |
| [**waitForDevicePreviewRun**](DevicePreviewsControllerApi#waitForDevicePreviewRun) | **GET** /emails/device-previews/{runId}/wait | Wait for device preview run to complete |


<a id="cancelDevicePreviewRun"></a>
# **cancelDevicePreviewRun**
> CancelDevicePreviewRunResult cancelDevicePreviewRun(runId).cancelDevicePreviewRunOptions(cancelDevicePreviewRunOptions).execute();

Cancel a running device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    CancelDevicePreviewRunOptions cancelDevicePreviewRunOptions = new CancelDevicePreviewRunOptions(); // CancelDevicePreviewRunOptions | 
    try {
      CancelDevicePreviewRunResult result = apiInstance.cancelDevicePreviewRun(runId)
            .cancelDevicePreviewRunOptions(cancelDevicePreviewRunOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#cancelDevicePreviewRun");
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
| **runId** | **UUID**|  | |
| **cancelDevicePreviewRunOptions** | [**CancelDevicePreviewRunOptions**](CancelDevicePreviewRunOptions)|  | [optional] |

### Return type

[**CancelDevicePreviewRunResult**](CancelDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewFeedback"></a>
# **createDevicePreviewFeedback**
> DevicePreviewFeedbackDto createDevicePreviewFeedback(createDevicePreviewFeedbackOptions).execute();

Create device preview feedback

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    CreateDevicePreviewFeedbackOptions createDevicePreviewFeedbackOptions = new CreateDevicePreviewFeedbackOptions(); // CreateDevicePreviewFeedbackOptions | 
    try {
      DevicePreviewFeedbackDto result = apiInstance.createDevicePreviewFeedback(createDevicePreviewFeedbackOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewFeedback");
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
| **createDevicePreviewFeedbackOptions** | [**CreateDevicePreviewFeedbackOptions**](CreateDevicePreviewFeedbackOptions)|  | |

### Return type

[**DevicePreviewFeedbackDto**](DevicePreviewFeedbackDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewFolder"></a>
# **createDevicePreviewFolder**
> DevicePreviewFolderDto createDevicePreviewFolder(createDevicePreviewFolderOptions).execute();

Create a device preview folder

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    CreateDevicePreviewFolderOptions createDevicePreviewFolderOptions = new CreateDevicePreviewFolderOptions(); // CreateDevicePreviewFolderOptions | 
    try {
      DevicePreviewFolderDto result = apiInstance.createDevicePreviewFolder(createDevicePreviewFolderOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewFolder");
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
| **createDevicePreviewFolderOptions** | [**CreateDevicePreviewFolderOptions**](CreateDevicePreviewFolderOptions)|  | |

### Return type

[**DevicePreviewFolderDto**](DevicePreviewFolderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewImportAddress"></a>
# **createDevicePreviewImportAddress**
> DevicePreviewIngestAddressDto createDevicePreviewImportAddress().createDevicePreviewIngestAddressOptions(createDevicePreviewIngestAddressOptions).execute();

Create a temporary email address for device preview import

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    CreateDevicePreviewIngestAddressOptions createDevicePreviewIngestAddressOptions = new CreateDevicePreviewIngestAddressOptions(); // CreateDevicePreviewIngestAddressOptions | 
    try {
      DevicePreviewIngestAddressDto result = apiInstance.createDevicePreviewImportAddress()
            .createDevicePreviewIngestAddressOptions(createDevicePreviewIngestAddressOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewImportAddress");
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
| **createDevicePreviewIngestAddressOptions** | [**CreateDevicePreviewIngestAddressOptions**](CreateDevicePreviewIngestAddressOptions)|  | [optional] |

### Return type

[**DevicePreviewIngestAddressDto**](DevicePreviewIngestAddressDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewProfile"></a>
# **createDevicePreviewProfile**
> DevicePreviewProfileDto createDevicePreviewProfile(createDevicePreviewProfileOptions).execute();

Create a device preview profile

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    CreateDevicePreviewProfileOptions createDevicePreviewProfileOptions = new CreateDevicePreviewProfileOptions(); // CreateDevicePreviewProfileOptions | 
    try {
      DevicePreviewProfileDto result = apiInstance.createDevicePreviewProfile(createDevicePreviewProfileOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewProfile");
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
| **createDevicePreviewProfileOptions** | [**CreateDevicePreviewProfileOptions**](CreateDevicePreviewProfileOptions)|  | |

### Return type

[**DevicePreviewProfileDto**](DevicePreviewProfileDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewRun"></a>
# **createDevicePreviewRun**
> CreateDevicePreviewRunResult createDevicePreviewRun(emailId).createDevicePreviewOptions(createDevicePreviewOptions).execute();

Create a new device preview run for an email

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    CreateDevicePreviewOptions createDevicePreviewOptions = new CreateDevicePreviewOptions(); // CreateDevicePreviewOptions | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.createDevicePreviewRun(emailId)
            .createDevicePreviewOptions(createDevicePreviewOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewRun");
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
| **emailId** | **UUID**|  | |
| **createDevicePreviewOptions** | [**CreateDevicePreviewOptions**](CreateDevicePreviewOptions)|  | [optional] |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewRunFromFile"></a>
# **createDevicePreviewRunFromFile**
> CreateDevicePreviewRunResult createDevicePreviewRunFromFile(_file).subject(subject).from(from).to(to).sourceAlias(sourceAlias).externalId(externalId).providers(providers).allTargets(allTargets).targets(targets).emailAudit(emailAudit).domainMonitor(domainMonitor).senderDomain(senderDomain).folderId(folderId).execute();

Create a device preview run from an HTML, EML, or ZIP file

Uploads an HTML or RFC822 EML file, or a ZIP archive containing exactly one HTML or EML file. ZIP uploads are bounded by entry count, expanded size, and compression ratio.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    File _file = new File("/path/to/file"); // File | An .html, .htm, or .eml file, or a .zip archive containing exactly one supported file.
    String subject = "subject_example"; // String | 
    String from = "from_example"; // String | 
    String to = "to_example"; // String | 
    String sourceAlias = "sourceAlias_example"; // String | 
    String externalId = "externalId_example"; // String | 
    List<String> providers = Arrays.asList(); // List<String> | Legacy web-provider keys to render.
    Boolean allTargets = true; // Boolean | Render every currently configured target.
    List<String> targets = Arrays.asList(); // List<String> | Device preview target keys to render.
    Boolean emailAudit = true; // Boolean | 
    Boolean domainMonitor = true; // Boolean | 
    String senderDomain = "senderDomain_example"; // String | 
    UUID folderId = UUID.randomUUID(); // UUID | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.createDevicePreviewRunFromFile(_file)
            .subject(subject)
            .from(from)
            .to(to)
            .sourceAlias(sourceAlias)
            .externalId(externalId)
            .providers(providers)
            .allTargets(allTargets)
            .targets(targets)
            .emailAudit(emailAudit)
            .domainMonitor(domainMonitor)
            .senderDomain(senderDomain)
            .folderId(folderId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewRunFromFile");
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
| **_file** | **File**| An .html, .htm, or .eml file, or a .zip archive containing exactly one supported file. | |
| **subject** | **String**|  | [optional] |
| **from** | **String**|  | [optional] |
| **to** | **String**|  | [optional] |
| **sourceAlias** | **String**|  | [optional] |
| **externalId** | **String**|  | [optional] |
| **providers** | [**List&lt;String&gt;**](String)| Legacy web-provider keys to render. | [optional] |
| **allTargets** | **Boolean**| Render every currently configured target. | [optional] |
| **targets** | [**List&lt;String&gt;**](String)| Device preview target keys to render. | [optional] |
| **emailAudit** | **Boolean**|  | [optional] |
| **domainMonitor** | **Boolean**|  | [optional] |
| **senderDomain** | **String**|  | [optional] |
| **folderId** | **UUID**|  | [optional] |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewRunFromHtmlImport"></a>
# **createDevicePreviewRunFromHtmlImport**
> CreateDevicePreviewRunResult createDevicePreviewRunFromHtmlImport(createDevicePreviewHtmlImportOptions).execute();

Create a device preview run from HTML

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    CreateDevicePreviewHtmlImportOptions createDevicePreviewHtmlImportOptions = new CreateDevicePreviewHtmlImportOptions(); // CreateDevicePreviewHtmlImportOptions | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.createDevicePreviewRunFromHtmlImport(createDevicePreviewHtmlImportOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewRunFromHtmlImport");
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
| **createDevicePreviewHtmlImportOptions** | [**CreateDevicePreviewHtmlImportOptions**](CreateDevicePreviewHtmlImportOptions)|  | |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewRunFromImport"></a>
# **createDevicePreviewRunFromImport**
> CreateDevicePreviewRunResult createDevicePreviewRunFromImport(createDevicePreviewImportOptions).execute();

Create a device preview run from imported raw MIME

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    CreateDevicePreviewImportOptions createDevicePreviewImportOptions = new CreateDevicePreviewImportOptions(); // CreateDevicePreviewImportOptions | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.createDevicePreviewRunFromImport(createDevicePreviewImportOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewRunFromImport");
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
| **createDevicePreviewImportOptions** | [**CreateDevicePreviewImportOptions**](CreateDevicePreviewImportOptions)|  | |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewRunFromMultipartImport"></a>
# **createDevicePreviewRunFromMultipartImport**
> CreateDevicePreviewRunResult createDevicePreviewRunFromMultipartImport(_file).sourceAlias(sourceAlias).externalId(externalId).allTargets(allTargets).targets(targets).folderId(folderId).execute();

Create a device preview run from multipart EML upload

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String sourceAlias = "sourceAlias_example"; // String | 
    String externalId = "externalId_example"; // String | 
    Boolean allTargets = true; // Boolean | Render every currently configured target.
    List<String> targets = Arrays.asList(); // List<String> | Device preview target keys to render.
    UUID folderId = UUID.randomUUID(); // UUID | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.createDevicePreviewRunFromMultipartImport(_file)
            .sourceAlias(sourceAlias)
            .externalId(externalId)
            .allTargets(allTargets)
            .targets(targets)
            .folderId(folderId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewRunFromMultipartImport");
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
| **_file** | **File**|  | |
| **sourceAlias** | **String**|  | [optional] |
| **externalId** | **String**|  | [optional] |
| **allTargets** | **Boolean**| Render every currently configured target. | [optional] |
| **targets** | [**List&lt;String&gt;**](String)| Device preview target keys to render. | [optional] |
| **folderId** | **UUID**|  | [optional] |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewRunFromRawImport"></a>
# **createDevicePreviewRunFromRawImport**
> CreateDevicePreviewRunResult createDevicePreviewRunFromRawImport().sourceAlias(sourceAlias).externalId(externalId).allTargets(allTargets).targets(targets).folderId(folderId).execute();

Create a device preview run from raw MIME bytes

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    String sourceAlias = "sourceAlias_example"; // String | 
    String externalId = "externalId_example"; // String | 
    Boolean allTargets = true; // Boolean | Render every currently configured target.
    List<String> targets = Arrays.asList(); // List<String> | Device preview target keys to render.
    UUID folderId = UUID.randomUUID(); // UUID | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.createDevicePreviewRunFromRawImport()
            .sourceAlias(sourceAlias)
            .externalId(externalId)
            .allTargets(allTargets)
            .targets(targets)
            .folderId(folderId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewRunFromRawImport");
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
| **sourceAlias** | **String**|  | [optional] |
| **externalId** | **String**|  | [optional] |
| **allTargets** | **Boolean**| Render every currently configured target. | [optional] |
| **targets** | [**List&lt;String&gt;**](String)| Device preview target keys to render. | [optional] |
| **folderId** | **UUID**|  | [optional] |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createDevicePreviewShareLink"></a>
# **createDevicePreviewShareLink**
> DevicePreviewShareLinkDto createDevicePreviewShareLink(runId).createDevicePreviewShareLinkOptions(createDevicePreviewShareLinkOptions).execute();

Create a share link for a device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    CreateDevicePreviewShareLinkOptions createDevicePreviewShareLinkOptions = new CreateDevicePreviewShareLinkOptions(); // CreateDevicePreviewShareLinkOptions | 
    try {
      DevicePreviewShareLinkDto result = apiInstance.createDevicePreviewShareLink(runId)
            .createDevicePreviewShareLinkOptions(createDevicePreviewShareLinkOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#createDevicePreviewShareLink");
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
| **runId** | **UUID**|  | |
| **createDevicePreviewShareLinkOptions** | [**CreateDevicePreviewShareLinkOptions**](CreateDevicePreviewShareLinkOptions)|  | [optional] |

### Return type

[**DevicePreviewShareLinkDto**](DevicePreviewShareLinkDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDevicePreviewFolder"></a>
# **deleteDevicePreviewFolder**
> DeleteDevicePreviewFolderResult deleteDevicePreviewFolder(folderId).execute();

Delete a folder, preserving renders and child folders

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID folderId = UUID.randomUUID(); // UUID | 
    try {
      DeleteDevicePreviewFolderResult result = apiInstance.deleteDevicePreviewFolder(folderId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#deleteDevicePreviewFolder");
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
| **folderId** | **UUID**|  | |

### Return type

[**DeleteDevicePreviewFolderResult**](DeleteDevicePreviewFolderResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDevicePreviewProfile"></a>
# **deleteDevicePreviewProfile**
> DeleteDevicePreviewProfileResult deleteDevicePreviewProfile(profileId).execute();

Delete a device preview profile

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID profileId = UUID.randomUUID(); // UUID | 
    try {
      DeleteDevicePreviewProfileResult result = apiInstance.deleteDevicePreviewProfile(profileId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#deleteDevicePreviewProfile");
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
| **profileId** | **UUID**|  | |

### Return type

[**DeleteDevicePreviewProfileResult**](DeleteDevicePreviewProfileResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDevicePreviewRun"></a>
# **deleteDevicePreviewRun**
> DeleteDevicePreviewRunResult deleteDevicePreviewRun(runId).execute();

Delete local device preview run data

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      DeleteDevicePreviewRunResult result = apiInstance.deleteDevicePreviewRun(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#deleteDevicePreviewRun");
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
| **runId** | **UUID**|  | |

### Return type

[**DeleteDevicePreviewRunResult**](DeleteDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteDevicePreviewShareLink"></a>
# **deleteDevicePreviewShareLink**
> DeleteDevicePreviewShareLinkResult deleteDevicePreviewShareLink(shareLinkId).execute();

Revoke a device preview share link

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID shareLinkId = UUID.randomUUID(); // UUID | 
    try {
      DeleteDevicePreviewShareLinkResult result = apiInstance.deleteDevicePreviewShareLink(shareLinkId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#deleteDevicePreviewShareLink");
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
| **shareLinkId** | **UUID**|  | |

### Return type

[**DeleteDevicePreviewShareLinkResult**](DeleteDevicePreviewShareLinkResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadDevicePreviewEmailSubmissionSourceEmail"></a>
# **downloadDevicePreviewEmailSubmissionSourceEmail**
> File downloadDevicePreviewEmailSubmissionSourceEmail(submissionId).execute();

Download the original RFC822 email for a device preview submission

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID submissionId = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.downloadDevicePreviewEmailSubmissionSourceEmail(submissionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#downloadDevicePreviewEmailSubmissionSourceEmail");
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
| **submissionId** | **UUID**|  | |

### Return type

[**File**](File)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: message/rfc822

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="downloadDevicePreviewRunSourceEmail"></a>
# **downloadDevicePreviewRunSourceEmail**
> File downloadDevicePreviewRunSourceEmail(runId).execute();

Download the original RFC822 email for a device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.downloadDevicePreviewRunSourceEmail(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#downloadDevicePreviewRunSourceEmail");
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
| **runId** | **UUID**|  | |

### Return type

[**File**](File)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: message/rfc822

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ensureDevicePreviewRun"></a>
# **ensureDevicePreviewRun**
> CreateDevicePreviewRunResult ensureDevicePreviewRun(emailId).createDevicePreviewOptions(createDevicePreviewOptions).execute();

Return active run for email or create one when none exists

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    CreateDevicePreviewOptions createDevicePreviewOptions = new CreateDevicePreviewOptions(); // CreateDevicePreviewOptions | 
    try {
      CreateDevicePreviewRunResult result = apiInstance.ensureDevicePreviewRun(emailId)
            .createDevicePreviewOptions(createDevicePreviewOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#ensureDevicePreviewRun");
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
| **emailId** | **UUID**|  | |
| **createDevicePreviewOptions** | [**CreateDevicePreviewOptions**](CreateDevicePreviewOptions)|  | [optional] |

### Return type

[**CreateDevicePreviewRunResult**](CreateDevicePreviewRunResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewEmailDomainOrCreate"></a>
# **getDevicePreviewEmailDomainOrCreate**
> DevicePreviewAccountSettingsDto getDevicePreviewEmailDomainOrCreate().execute();

Return account device preview email domain setup or create one

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    try {
      DevicePreviewAccountSettingsDto result = apiInstance.getDevicePreviewEmailDomainOrCreate()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewEmailDomainOrCreate");
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

[**DevicePreviewAccountSettingsDto**](DevicePreviewAccountSettingsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewEmailRuns"></a>
# **getDevicePreviewEmailRuns**
> List&lt;DevicePreviewRunDto&gt; getDevicePreviewEmailRuns(since).emailDomainId(emailDomainId).profileId(profileId).localPart(localPart).limit(limit).hydrateThumbnail(hydrateThumbnail).execute();

List device preview runs created from account email domains

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    UUID emailDomainId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    String localPart = "localPart_example"; // String | 
    Integer limit = 20; // Integer | 
    Boolean hydrateThumbnail = false; // Boolean | Hydrate each returned run with a nullable primary screenshot thumbnail URL.
    try {
      List<DevicePreviewRunDto> result = apiInstance.getDevicePreviewEmailRuns(since)
            .emailDomainId(emailDomainId)
            .profileId(profileId)
            .localPart(localPart)
            .limit(limit)
            .hydrateThumbnail(hydrateThumbnail)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewEmailRuns");
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
| **since** | **OffsetDateTime**|  | |
| **emailDomainId** | **UUID**|  | [optional] |
| **profileId** | **UUID**|  | [optional] |
| **localPart** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **hydrateThumbnail** | **Boolean**| Hydrate each returned run with a nullable primary screenshot thumbnail URL. | [optional] [default to false] |

### Return type

[**List&lt;DevicePreviewRunDto&gt;**](DevicePreviewRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewEmailSubmissionSourceEmail"></a>
# **getDevicePreviewEmailSubmissionSourceEmail**
> DevicePreviewSourceEmailDto getDevicePreviewEmailSubmissionSourceEmail(submissionId).execute();

Get the original email content for a device preview submission

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID submissionId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewSourceEmailDto result = apiInstance.getDevicePreviewEmailSubmissionSourceEmail(submissionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewEmailSubmissionSourceEmail");
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
| **submissionId** | **UUID**|  | |

### Return type

[**DevicePreviewSourceEmailDto**](DevicePreviewSourceEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewEmailSubmissions"></a>
# **getDevicePreviewEmailSubmissions**
> List&lt;DevicePreviewEmailSubmissionDto&gt; getDevicePreviewEmailSubmissions(since).emailDomainId(emailDomainId).profileId(profileId).localPart(localPart).limit(limit).recipientEmailAddress(recipientEmailAddress).execute();

List received device preview email submissions

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    UUID emailDomainId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    String localPart = "localPart_example"; // String | 
    Integer limit = 20; // Integer | 
    String recipientEmailAddress = "recipientEmailAddress_example"; // String | 
    try {
      List<DevicePreviewEmailSubmissionDto> result = apiInstance.getDevicePreviewEmailSubmissions(since)
            .emailDomainId(emailDomainId)
            .profileId(profileId)
            .localPart(localPart)
            .limit(limit)
            .recipientEmailAddress(recipientEmailAddress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewEmailSubmissions");
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
| **since** | **OffsetDateTime**|  | |
| **emailDomainId** | **UUID**|  | [optional] |
| **profileId** | **UUID**|  | [optional] |
| **localPart** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **recipientEmailAddress** | **String**|  | [optional] |

### Return type

[**List&lt;DevicePreviewEmailSubmissionDto&gt;**](DevicePreviewEmailSubmissionDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewFeedback"></a>
# **getDevicePreviewFeedback**
> DevicePreviewFeedbackDto getDevicePreviewFeedback(feedbackId).execute();

Get a single device preview feedback item

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID feedbackId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewFeedbackDto result = apiInstance.getDevicePreviewFeedback(feedbackId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewFeedback");
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
| **feedbackId** | **UUID**|  | |

### Return type

[**DevicePreviewFeedbackDto**](DevicePreviewFeedbackDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewFeedbackItems"></a>
# **getDevicePreviewFeedbackItems**
> DevicePreviewFeedbackListDto getDevicePreviewFeedbackItems().page(page).size(size).source(source).runId(runId).status(status).provider(provider).category(category).search(search).execute();

List device preview feedback

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    Integer page = 56; // Integer | 
    Integer size = 56; // Integer | 
    String source = "API_SERVICE"; // String | 
    UUID runId = UUID.randomUUID(); // UUID | 
    String status = "OPEN"; // String | 
    String provider = "GMAIL"; // String | 
    String category = "GENERAL"; // String | 
    String search = "search_example"; // String | 
    try {
      DevicePreviewFeedbackListDto result = apiInstance.getDevicePreviewFeedbackItems()
            .page(page)
            .size(size)
            .source(source)
            .runId(runId)
            .status(status)
            .provider(provider)
            .category(category)
            .search(search)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewFeedbackItems");
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
| **page** | **Integer**|  | [optional] |
| **size** | **Integer**|  | [optional] |
| **source** | **String**|  | [optional] [enum: API_SERVICE, LAB_USER, END_USER, SYSTEM] |
| **runId** | **UUID**|  | [optional] |
| **status** | **String**|  | [optional] [enum: OPEN, ACKNOWLEDGED, RESOLVED, DISMISSED] |
| **provider** | **String**|  | [optional] [enum: GMAIL, OUTLOOK, YAHOO] |
| **category** | **String**|  | [optional] [enum: GENERAL, RUN_QUALITY, SCREENSHOT_QUALITY, PROVIDER_ISSUE, BUG_REPORT, FEATURE_REQUEST, NOTE] |
| **search** | **String**|  | [optional] |

### Return type

[**DevicePreviewFeedbackListDto**](DevicePreviewFeedbackListDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewFolder"></a>
# **getDevicePreviewFolder**
> DevicePreviewFolderDto getDevicePreviewFolder(folderId).execute();

Get a device preview folder

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID folderId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewFolderDto result = apiInstance.getDevicePreviewFolder(folderId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewFolder");
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
| **folderId** | **UUID**|  | |

### Return type

[**DevicePreviewFolderDto**](DevicePreviewFolderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewFolders"></a>
# **getDevicePreviewFolders**
> List&lt;DevicePreviewFolderDto&gt; getDevicePreviewFolders().execute();

List device preview folders

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    try {
      List<DevicePreviewFolderDto> result = apiInstance.getDevicePreviewFolders()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewFolders");
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

[**List&lt;DevicePreviewFolderDto&gt;**](DevicePreviewFolderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewImportAddress"></a>
# **getDevicePreviewImportAddress**
> DevicePreviewIngestAddressDto getDevicePreviewImportAddress(sessionId).execute();

Get temporary device preview import address status

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID sessionId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewIngestAddressDto result = apiInstance.getDevicePreviewImportAddress(sessionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewImportAddress");
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
| **sessionId** | **UUID**|  | |

### Return type

[**DevicePreviewIngestAddressDto**](DevicePreviewIngestAddressDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewNativeTargetAvailability"></a>
# **getDevicePreviewNativeTargetAvailability**
> DevicePreviewNativeTargetAvailabilityListDto getDevicePreviewNativeTargetAvailability().execute();

Get native device preview target availability

Returns live native device preview target availability for authenticated API clients, including worker health, queue, timeout, and status fields. Use &#x60;/device-preview-targets&#x60; when you need the stable catalog without transient availability data.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    try {
      DevicePreviewNativeTargetAvailabilityListDto result = apiInstance.getDevicePreviewNativeTargetAvailability()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewNativeTargetAvailability");
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

[**DevicePreviewNativeTargetAvailabilityListDto**](DevicePreviewNativeTargetAvailabilityListDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewProfile"></a>
# **getDevicePreviewProfile**
> DevicePreviewProfileDto getDevicePreviewProfile(profileId).execute();

Get a device preview profile

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID profileId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewProfileDto result = apiInstance.getDevicePreviewProfile(profileId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewProfile");
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
| **profileId** | **UUID**|  | |

### Return type

[**DevicePreviewProfileDto**](DevicePreviewProfileDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewProfiles"></a>
# **getDevicePreviewProfiles**
> List&lt;DevicePreviewProfileDto&gt; getDevicePreviewProfiles().execute();

List device preview profiles

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    try {
      List<DevicePreviewProfileDto> result = apiInstance.getDevicePreviewProfiles()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewProfiles");
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

[**List&lt;DevicePreviewProfileDto&gt;**](DevicePreviewProfileDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRun"></a>
# **getDevicePreviewRun**
> DevicePreviewRunDto getDevicePreviewRun(runId).execute();

Get device preview run status

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewRunDto result = apiInstance.getDevicePreviewRun(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRun");
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
| **runId** | **UUID**|  | |

### Return type

[**DevicePreviewRunDto**](DevicePreviewRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunProviderProgress"></a>
# **getDevicePreviewRunProviderProgress**
> DevicePreviewProviderProgressDto getDevicePreviewRunProviderProgress(runId, provider).execute();

Get provider-level progress for a device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    String provider = "GMAIL"; // String | 
    try {
      DevicePreviewProviderProgressDto result = apiInstance.getDevicePreviewRunProviderProgress(runId, provider)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunProviderProgress");
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
| **runId** | **UUID**|  | |
| **provider** | **String**|  | [enum: GMAIL, OUTLOOK, YAHOO] |

### Return type

[**DevicePreviewProviderProgressDto**](DevicePreviewProviderProgressDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunResults"></a>
# **getDevicePreviewRunResults**
> DevicePreviewRunResultsDto getDevicePreviewRunResults(runId).execute();

Get device preview run results

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewRunResultsDto result = apiInstance.getDevicePreviewRunResults(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunResults");
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
| **runId** | **UUID**|  | |

### Return type

[**DevicePreviewRunResultsDto**](DevicePreviewRunResultsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunScreenshot"></a>
# **getDevicePreviewRunScreenshot**
> byte[] getDevicePreviewRunScreenshot(runId, screenshotId).execute();

Get a device preview screenshot image

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    UUID screenshotId = UUID.randomUUID(); // UUID | 
    try {
      byte[] result = apiInstance.getDevicePreviewRunScreenshot(runId, screenshotId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunScreenshot");
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
| **runId** | **UUID**|  | |
| **screenshotId** | **UUID**|  | |

### Return type

**byte[]**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunSourceEmail"></a>
# **getDevicePreviewRunSourceEmail**
> DevicePreviewSourceEmailDto getDevicePreviewRunSourceEmail(runId).execute();

Get the original email content for a device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      DevicePreviewSourceEmailDto result = apiInstance.getDevicePreviewRunSourceEmail(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunSourceEmail");
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
| **runId** | **UUID**|  | |

### Return type

[**DevicePreviewSourceEmailDto**](DevicePreviewSourceEmailDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRuns"></a>
# **getDevicePreviewRuns**
> List&lt;DevicePreviewRunDto&gt; getDevicePreviewRuns(emailId).limit(limit).hydrateThumbnail(hydrateThumbnail).execute();

List previous device preview runs for an email

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Integer limit = 50; // Integer | 
    Boolean hydrateThumbnail = false; // Boolean | Hydrate each returned run with a nullable primary screenshot thumbnail URL.
    try {
      List<DevicePreviewRunDto> result = apiInstance.getDevicePreviewRuns(emailId)
            .limit(limit)
            .hydrateThumbnail(hydrateThumbnail)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRuns");
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
| **emailId** | **UUID**|  | |
| **limit** | **Integer**|  | [optional] [default to 50] |
| **hydrateThumbnail** | **Boolean**| Hydrate each returned run with a nullable primary screenshot thumbnail URL. | [optional] [default to false] |

### Return type

[**List&lt;DevicePreviewRunDto&gt;**](DevicePreviewRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunsForAccount"></a>
# **getDevicePreviewRunsForAccount**
> List&lt;DevicePreviewRunDto&gt; getDevicePreviewRunsForAccount().limit(limit).hydrateThumbnail(hydrateThumbnail).execute();

List previous device preview runs for account

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    Integer limit = 50; // Integer | 
    Boolean hydrateThumbnail = false; // Boolean | Hydrate each returned run with a nullable primary screenshot thumbnail URL.
    try {
      List<DevicePreviewRunDto> result = apiInstance.getDevicePreviewRunsForAccount()
            .limit(limit)
            .hydrateThumbnail(hydrateThumbnail)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunsForAccount");
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
| **limit** | **Integer**|  | [optional] [default to 50] |
| **hydrateThumbnail** | **Boolean**| Hydrate each returned run with a nullable primary screenshot thumbnail URL. | [optional] [default to false] |

### Return type

[**List&lt;DevicePreviewRunDto&gt;**](DevicePreviewRunDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunsForAccountOffsetPaginated"></a>
# **getDevicePreviewRunsForAccountOffsetPaginated**
> PageDevicePreviewRunProjection getDevicePreviewRunsForAccountOffsetPaginated().page(page).size(size).sort(sort).hydrateThumbnail(hydrateThumbnail).folderId(folderId).unfiledOnly(unfiledOnly).emailId(emailId).execute();

List previous device preview runs for account in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size for paginated result list.
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean hydrateThumbnail = false; // Boolean | Hydrate each returned run with a nullable primary screenshot thumbnail URL.
    UUID folderId = UUID.randomUUID(); // UUID | 
    Boolean unfiledOnly = false; // Boolean | 
    UUID emailId = UUID.randomUUID(); // UUID | 
    try {
      PageDevicePreviewRunProjection result = apiInstance.getDevicePreviewRunsForAccountOffsetPaginated()
            .page(page)
            .size(size)
            .sort(sort)
            .hydrateThumbnail(hydrateThumbnail)
            .folderId(folderId)
            .unfiledOnly(unfiledOnly)
            .emailId(emailId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunsForAccountOffsetPaginated");
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
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size for paginated result list. | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |
| **hydrateThumbnail** | **Boolean**| Hydrate each returned run with a nullable primary screenshot thumbnail URL. | [optional] [default to false] |
| **folderId** | **UUID**|  | [optional] |
| **unfiledOnly** | **Boolean**|  | [optional] [default to false] |
| **emailId** | **UUID**|  | [optional] |

### Return type

[**PageDevicePreviewRunProjection**](PageDevicePreviewRunProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewRunsOffsetPaginated"></a>
# **getDevicePreviewRunsOffsetPaginated**
> PageDevicePreviewRunProjection getDevicePreviewRunsOffsetPaginated(emailId).page(page).size(size).sort(sort).hydrateThumbnail(hydrateThumbnail).execute();

List previous device preview runs for an email in paginated form

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID emailId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | Optional page index in list pagination
    Integer size = 20; // Integer | Optional page size for paginated result list.
    String sort = "ASC"; // String | Optional createdAt sort direction ASC or DESC
    Boolean hydrateThumbnail = false; // Boolean | Hydrate each returned run with a nullable primary screenshot thumbnail URL.
    try {
      PageDevicePreviewRunProjection result = apiInstance.getDevicePreviewRunsOffsetPaginated(emailId)
            .page(page)
            .size(size)
            .sort(sort)
            .hydrateThumbnail(hydrateThumbnail)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewRunsOffsetPaginated");
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
| **emailId** | **UUID**|  | |
| **page** | **Integer**| Optional page index in list pagination | [optional] [default to 0] |
| **size** | **Integer**| Optional page size for paginated result list. | [optional] [default to 20] |
| **sort** | **String**| Optional createdAt sort direction ASC or DESC | [optional] [default to DESC] [enum: ASC, DESC] |
| **hydrateThumbnail** | **Boolean**| Hydrate each returned run with a nullable primary screenshot thumbnail URL. | [optional] [default to false] |

### Return type

[**PageDevicePreviewRunProjection**](PageDevicePreviewRunProjection)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewShareLinks"></a>
# **getDevicePreviewShareLinks**
> List&lt;DevicePreviewShareLinkDto&gt; getDevicePreviewShareLinks(runId).execute();

List share links for a device preview run

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      List<DevicePreviewShareLinkDto> result = apiInstance.getDevicePreviewShareLinks(runId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewShareLinks");
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
| **runId** | **UUID**|  | |

### Return type

[**List&lt;DevicePreviewShareLinkDto&gt;**](DevicePreviewShareLinkDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewSharedResult"></a>
# **getDevicePreviewSharedResult**
> DevicePreviewSharedResultDto getDevicePreviewSharedResult(shareToken).execute();

Get a public shared device preview result

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    String shareToken = "shareToken_example"; // String | 
    try {
      DevicePreviewSharedResultDto result = apiInstance.getDevicePreviewSharedResult(shareToken)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewSharedResult");
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
| **shareToken** | **String**|  | |

### Return type

[**DevicePreviewSharedResultDto**](DevicePreviewSharedResultDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewSharedResultScreenshot"></a>
# **getDevicePreviewSharedResultScreenshot**
> byte[] getDevicePreviewSharedResultScreenshot(shareToken, screenshotId).execute();

Get a public shared device preview screenshot image

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    String shareToken = "shareToken_example"; // String | 
    UUID screenshotId = UUID.randomUUID(); // UUID | 
    try {
      byte[] result = apiInstance.getDevicePreviewSharedResultScreenshot(shareToken, screenshotId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewSharedResultScreenshot");
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
| **shareToken** | **String**|  | |
| **screenshotId** | **UUID**|  | |

### Return type

**byte[]**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getDevicePreviewTargets"></a>
# **getDevicePreviewTargets**
> DevicePreviewNativeTargetListDto getDevicePreviewTargets().execute();

List device preview targets

Returns visible native device preview target metadata without worker availability, queue, or health fields.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    try {
      DevicePreviewNativeTargetListDto result = apiInstance.getDevicePreviewTargets()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#getDevicePreviewTargets");
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

[**DevicePreviewNativeTargetListDto**](DevicePreviewNativeTargetListDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="moveDevicePreviewRuns"></a>
# **moveDevicePreviewRuns**
> MoveDevicePreviewRunsResult moveDevicePreviewRuns(moveDevicePreviewRunsOptions).execute();

Move device preview runs to a folder or Unfiled

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    MoveDevicePreviewRunsOptions moveDevicePreviewRunsOptions = new MoveDevicePreviewRunsOptions(); // MoveDevicePreviewRunsOptions | 
    try {
      MoveDevicePreviewRunsResult result = apiInstance.moveDevicePreviewRuns(moveDevicePreviewRunsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#moveDevicePreviewRuns");
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
| **moveDevicePreviewRunsOptions** | [**MoveDevicePreviewRunsOptions**](MoveDevicePreviewRunsOptions)|  | |

### Return type

[**MoveDevicePreviewRunsResult**](MoveDevicePreviewRunsResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rerunDevicePreviewTargets"></a>
# **rerunDevicePreviewTargets**
> RerunDevicePreviewTargetsResult rerunDevicePreviewTargets(runId, rerunDevicePreviewTargetsOptions).execute();

Rerun selected device preview targets in the same run

Set failedOnly&#x3D;false to rerun a successful target. Successful targets consume their configured credit cost again.

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    RerunDevicePreviewTargetsOptions rerunDevicePreviewTargetsOptions = new RerunDevicePreviewTargetsOptions(); // RerunDevicePreviewTargetsOptions | 
    try {
      RerunDevicePreviewTargetsResult result = apiInstance.rerunDevicePreviewTargets(runId, rerunDevicePreviewTargetsOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#rerunDevicePreviewTargets");
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
| **runId** | **UUID**|  | |
| **rerunDevicePreviewTargetsOptions** | [**RerunDevicePreviewTargetsOptions**](RerunDevicePreviewTargetsOptions)|  | |

### Return type

[**RerunDevicePreviewTargetsResult**](RerunDevicePreviewTargetsResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDevicePreviewEmailDomainSubdomain"></a>
# **updateDevicePreviewEmailDomainSubdomain**
> DevicePreviewAccountSettingsDto updateDevicePreviewEmailDomainSubdomain(updateDevicePreviewIngestDomainOptions).execute();

Update account device preview email subdomain

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UpdateDevicePreviewIngestDomainOptions updateDevicePreviewIngestDomainOptions = new UpdateDevicePreviewIngestDomainOptions(); // UpdateDevicePreviewIngestDomainOptions | 
    try {
      DevicePreviewAccountSettingsDto result = apiInstance.updateDevicePreviewEmailDomainSubdomain(updateDevicePreviewIngestDomainOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#updateDevicePreviewEmailDomainSubdomain");
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
| **updateDevicePreviewIngestDomainOptions** | [**UpdateDevicePreviewIngestDomainOptions**](UpdateDevicePreviewIngestDomainOptions)|  | |

### Return type

[**DevicePreviewAccountSettingsDto**](DevicePreviewAccountSettingsDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDevicePreviewFeedback"></a>
# **updateDevicePreviewFeedback**
> DevicePreviewFeedbackDto updateDevicePreviewFeedback(feedbackId, updateDevicePreviewFeedbackOptions).execute();

Update device preview feedback

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID feedbackId = UUID.randomUUID(); // UUID | 
    UpdateDevicePreviewFeedbackOptions updateDevicePreviewFeedbackOptions = new UpdateDevicePreviewFeedbackOptions(); // UpdateDevicePreviewFeedbackOptions | 
    try {
      DevicePreviewFeedbackDto result = apiInstance.updateDevicePreviewFeedback(feedbackId, updateDevicePreviewFeedbackOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#updateDevicePreviewFeedback");
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
| **feedbackId** | **UUID**|  | |
| **updateDevicePreviewFeedbackOptions** | [**UpdateDevicePreviewFeedbackOptions**](UpdateDevicePreviewFeedbackOptions)|  | |

### Return type

[**DevicePreviewFeedbackDto**](DevicePreviewFeedbackDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDevicePreviewFolder"></a>
# **updateDevicePreviewFolder**
> DevicePreviewFolderDto updateDevicePreviewFolder(folderId, updateDevicePreviewFolderOptions).execute();

Rename or move a device preview folder

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID folderId = UUID.randomUUID(); // UUID | 
    UpdateDevicePreviewFolderOptions updateDevicePreviewFolderOptions = new UpdateDevicePreviewFolderOptions(); // UpdateDevicePreviewFolderOptions | 
    try {
      DevicePreviewFolderDto result = apiInstance.updateDevicePreviewFolder(folderId, updateDevicePreviewFolderOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#updateDevicePreviewFolder");
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
| **folderId** | **UUID**|  | |
| **updateDevicePreviewFolderOptions** | [**UpdateDevicePreviewFolderOptions**](UpdateDevicePreviewFolderOptions)|  | |

### Return type

[**DevicePreviewFolderDto**](DevicePreviewFolderDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateDevicePreviewProfile"></a>
# **updateDevicePreviewProfile**
> DevicePreviewProfileDto updateDevicePreviewProfile(profileId, updateDevicePreviewProfileOptions).execute();

Update a device preview profile

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID profileId = UUID.randomUUID(); // UUID | 
    UpdateDevicePreviewProfileOptions updateDevicePreviewProfileOptions = new UpdateDevicePreviewProfileOptions(); // UpdateDevicePreviewProfileOptions | 
    try {
      DevicePreviewProfileDto result = apiInstance.updateDevicePreviewProfile(profileId, updateDevicePreviewProfileOptions)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#updateDevicePreviewProfile");
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
| **profileId** | **UUID**|  | |
| **updateDevicePreviewProfileOptions** | [**UpdateDevicePreviewProfileOptions**](UpdateDevicePreviewProfileOptions)|  | |

### Return type

[**DevicePreviewProfileDto**](DevicePreviewProfileDto)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForDevicePreviewEmailRuns"></a>
# **waitForDevicePreviewEmailRuns**
> DevicePreviewIngestRunWaitResult waitForDevicePreviewEmailRuns(since).emailDomainId(emailDomainId).profileId(profileId).localPart(localPart).limit(limit).timeoutMillis(timeoutMillis).pollIntervalMillis(pollIntervalMillis).hydrateThumbnail(hydrateThumbnail).execute();

Wait for device preview runs created from account email domains

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    UUID emailDomainId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    String localPart = "localPart_example"; // String | 
    Integer limit = 20; // Integer | 
    Long timeoutMillis = 25000L; // Long | 
    Long pollIntervalMillis = 1000L; // Long | 
    Boolean hydrateThumbnail = false; // Boolean | Hydrate each returned run with a nullable primary screenshot thumbnail URL.
    try {
      DevicePreviewIngestRunWaitResult result = apiInstance.waitForDevicePreviewEmailRuns(since)
            .emailDomainId(emailDomainId)
            .profileId(profileId)
            .localPart(localPart)
            .limit(limit)
            .timeoutMillis(timeoutMillis)
            .pollIntervalMillis(pollIntervalMillis)
            .hydrateThumbnail(hydrateThumbnail)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#waitForDevicePreviewEmailRuns");
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
| **since** | **OffsetDateTime**|  | |
| **emailDomainId** | **UUID**|  | [optional] |
| **profileId** | **UUID**|  | [optional] |
| **localPart** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **timeoutMillis** | **Long**|  | [optional] [default to 25000] |
| **pollIntervalMillis** | **Long**|  | [optional] [default to 1000] |
| **hydrateThumbnail** | **Boolean**| Hydrate each returned run with a nullable primary screenshot thumbnail URL. | [optional] [default to false] |

### Return type

[**DevicePreviewIngestRunWaitResult**](DevicePreviewIngestRunWaitResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForDevicePreviewEmailSubmissions"></a>
# **waitForDevicePreviewEmailSubmissions**
> DevicePreviewEmailSubmissionWaitResult waitForDevicePreviewEmailSubmissions(since).emailDomainId(emailDomainId).profileId(profileId).localPart(localPart).limit(limit).timeoutMillis(timeoutMillis).pollIntervalMillis(pollIntervalMillis).recipientEmailAddress(recipientEmailAddress).execute();

Wait for received device preview email submissions

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    UUID emailDomainId = UUID.randomUUID(); // UUID | 
    UUID profileId = UUID.randomUUID(); // UUID | 
    String localPart = "localPart_example"; // String | 
    Integer limit = 20; // Integer | 
    Long timeoutMillis = 25000L; // Long | 
    Long pollIntervalMillis = 1000L; // Long | 
    String recipientEmailAddress = "recipientEmailAddress_example"; // String | 
    try {
      DevicePreviewEmailSubmissionWaitResult result = apiInstance.waitForDevicePreviewEmailSubmissions(since)
            .emailDomainId(emailDomainId)
            .profileId(profileId)
            .localPart(localPart)
            .limit(limit)
            .timeoutMillis(timeoutMillis)
            .pollIntervalMillis(pollIntervalMillis)
            .recipientEmailAddress(recipientEmailAddress)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#waitForDevicePreviewEmailSubmissions");
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
| **since** | **OffsetDateTime**|  | |
| **emailDomainId** | **UUID**|  | [optional] |
| **profileId** | **UUID**|  | [optional] |
| **localPart** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **timeoutMillis** | **Long**|  | [optional] [default to 25000] |
| **pollIntervalMillis** | **Long**|  | [optional] [default to 1000] |
| **recipientEmailAddress** | **String**|  | [optional] |

### Return type

[**DevicePreviewEmailSubmissionWaitResult**](DevicePreviewEmailSubmissionWaitResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="waitForDevicePreviewRun"></a>
# **waitForDevicePreviewRun**
> DevicePreviewRunWaitResult waitForDevicePreviewRun(runId).timeoutMillis(timeoutMillis).pollIntervalMillis(pollIntervalMillis).execute();

Wait for device preview run to complete

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.DevicePreviewsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    DevicePreviewsControllerApi apiInstance = new DevicePreviewsControllerApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    Long timeoutMillis = 25000L; // Long | 
    Long pollIntervalMillis = 1000L; // Long | 
    try {
      DevicePreviewRunWaitResult result = apiInstance.waitForDevicePreviewRun(runId)
            .timeoutMillis(timeoutMillis)
            .pollIntervalMillis(pollIntervalMillis)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicePreviewsControllerApi#waitForDevicePreviewRun");
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
| **runId** | **UUID**|  | |
| **timeoutMillis** | **Long**|  | [optional] [default to 25000] |
| **pollIntervalMillis** | **Long**|  | [optional] [default to 1000] |

### Return type

[**DevicePreviewRunWaitResult**](DevicePreviewRunWaitResult)

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

