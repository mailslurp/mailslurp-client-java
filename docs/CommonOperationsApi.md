# CommonOperationsApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewEmailAddress**](CommonOperationsApi.md#createNewEmailAddress) | **POST** /newEmailAddress | Create new email address
[**deleteEmail**](CommonOperationsApi.md#deleteEmail) | **DELETE** /deleteEmail | Delete an email
[**deleteEmailAddress**](CommonOperationsApi.md#deleteEmailAddress) | **DELETE** /deleteEmailAddress | Delete email address and its emails
[**emptyInbox**](CommonOperationsApi.md#emptyInbox) | **DELETE** /emptyInbox | Delete all emails in an inbox
[**sendEmailSimple**](CommonOperationsApi.md#sendEmailSimple) | **POST** /sendEmail | Send an email from a random email address
[**waitForEmailCount**](CommonOperationsApi.md#waitForEmailCount) | **GET** /waitForEmailCount | Wait for and return count number of emails 
[**waitForLatestEmail**](CommonOperationsApi.md#waitForLatestEmail) | **GET** /waitForLatestEmail | Fetch inbox&#39;s latest email or if empty wait for email to arrive
[**waitForMatchingEmail**](CommonOperationsApi.md#waitForMatchingEmail) | **POST** /waitForMatchingEmails | Wait or return list of emails that match simple matching patterns
[**waitForNthEmail**](CommonOperationsApi.md#waitForNthEmail) | **GET** /waitForNthEmail | Wait for or fetch the email with a given index in the inbox specified


<a name="createNewEmailAddress"></a>
# **createNewEmailAddress**
> Inbox createNewEmailAddress()

Create new email address

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
try {
    Inbox result = apiInstance.createNewEmailAddress();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#createNewEmailAddress");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Inbox**](Inbox.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteEmail"></a>
# **deleteEmail**
> deleteEmail(emailId)

Delete an email

Deletes an email

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
UUID emailId = new UUID(); // UUID | emailId
try {
    apiInstance.deleteEmail(emailId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#deleteEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emailId** | [**UUID**](.md)| emailId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteEmailAddress"></a>
# **deleteEmailAddress**
> deleteEmailAddress(inboxId)

Delete email address and its emails

Deletes an inbox

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    apiInstance.deleteEmailAddress(inboxId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#deleteEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="emptyInbox"></a>
# **emptyInbox**
> emptyInbox(inboxId)

Delete all emails in an inbox

Deletes all emails

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
UUID inboxId = new UUID(); // UUID | inboxId
try {
    apiInstance.emptyInbox(inboxId);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#emptyInbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| inboxId |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sendEmailSimple"></a>
# **sendEmailSimple**
> sendEmailSimple(sendEmailOptions)

Send an email from a random email address

To specify an email address first create an inbox and use that with the other send email methods

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | sendEmailOptions
try {
    apiInstance.sendEmailSimple(sendEmailOptions);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#sendEmailSimple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sendEmailOptions** | [**SendEmailOptions**](SendEmailOptions.md)| sendEmailOptions |

### Return type

null (empty response body)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="waitForEmailCount"></a>
# **waitForEmailCount**
> List&lt;EmailPreview&gt; waitForEmailCount(count, inboxId, timeout)

Wait for and return count number of emails 

Will only wait if count is greater that the found emails in given inbox.If you need to wait for an email for a non-empty inbox see the other receive methods.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
Integer count = 56; // Integer | Number of emails to wait for. Must be greater that 1
UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
Long timeout = 56L; // Long | Max milliseconds to wait
try {
    List<EmailPreview> result = apiInstance.waitForEmailCount(count, inboxId, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#waitForEmailCount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Integer**| Number of emails to wait for. Must be greater that 1 | [optional]
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitForLatestEmail"></a>
# **waitForLatestEmail**
> Email waitForLatestEmail(inboxId, timeout)

Fetch inbox&#39;s latest email or if empty wait for email to arrive

Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox see the other receive methods.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
Long timeout = 56L; // Long | Max milliseconds to wait
try {
    Email result = apiInstance.waitForLatestEmail(inboxId, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#waitForLatestEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]

### Return type

[**Email**](Email.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="waitForMatchingEmail"></a>
# **waitForMatchingEmail**
> List&lt;EmailPreview&gt; waitForMatchingEmail(matchOptions, count, inboxId, timeout)

Wait or return list of emails that match simple matching patterns

Results must also meet provided count. Match options allow simple CONTAINS or EQUALS filtering on SUBJECT, TO, BCC, CC, and FROM.

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
MatchOptions matchOptions = new MatchOptions(); // MatchOptions | matchOptions
Integer count = 56; // Integer | Number of emails to wait for. Must be greater that 1
UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
Long timeout = 56L; // Long | Max milliseconds to wait
try {
    List<EmailPreview> result = apiInstance.waitForMatchingEmail(matchOptions, count, inboxId, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#waitForMatchingEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **matchOptions** | [**MatchOptions**](MatchOptions.md)| matchOptions |
 **count** | **Integer**| Number of emails to wait for. Must be greater that 1 | [optional]
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]

### Return type

[**List&lt;EmailPreview&gt;**](EmailPreview.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="waitForNthEmail"></a>
# **waitForNthEmail**
> Email waitForNthEmail(inboxId, index, timeout)

Wait for or fetch the email with a given index in the inbox specified

### Example
```java
// Import classes:
//import com.mailslurp.client.ApiClient;
//import com.mailslurp.client.ApiException;
//import com.mailslurp.client.Configuration;
//import com.mailslurp.client.auth.*;
//import com.mailslurp.api.api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
Integer index = 56; // Integer | Zero based index of the email to wait for
Long timeout = 56L; // Long | Max milliseconds to wait
try {
    Email result = apiInstance.waitForNthEmail(inboxId, index, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#waitForNthEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]
 **index** | **Integer**| Zero based index of the email to wait for | [optional]
 **timeout** | **Long**| Max milliseconds to wait | [optional]

### Return type

[**Email**](Email.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

