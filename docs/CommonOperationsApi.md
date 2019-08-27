# CommonOperationsApi

All URIs are relative to *https://api.mailslurp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewEmailAddressUsingPOST**](CommonOperationsApi.md#createNewEmailAddressUsingPOST) | **POST** /newEmailAddress | Create new email address
[**fetchLatestEmailUsingGET**](CommonOperationsApi.md#fetchLatestEmailUsingGET) | **GET** /fetchLatestEmail | Fetch inbox&#39;s latest email or if empty wait for email to arrive
[**sendEmailSimpleUsingPOST**](CommonOperationsApi.md#sendEmailSimpleUsingPOST) | **POST** /sendEmail | Send an email from a random email address


<a name="createNewEmailAddressUsingPOST"></a>
# **createNewEmailAddressUsingPOST**
> Inbox createNewEmailAddressUsingPOST()

Create new email address

Returns an Inbox with an &#x60;id&#x60; and an &#x60;emailAddress&#x60;

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
try {
    Inbox result = apiInstance.createNewEmailAddressUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#createNewEmailAddressUsingPOST");
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

<a name="fetchLatestEmailUsingGET"></a>
# **fetchLatestEmailUsingGET**
> Email fetchLatestEmailUsingGET(inboxEmailAddress, inboxId)

Fetch inbox&#39;s latest email or if empty wait for email to arrive

Will return either the last received email or wait for an email to arrive and return that. If you need to wait for an email for a non-empty inbox see the other receive methods.

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
String inboxEmailAddress = "inboxEmailAddress_example"; // String | Email address of the inbox we are fetching emails from
UUID inboxId = new UUID(); // UUID | Id of the inbox we are fetching emails from
try {
    Email result = apiInstance.fetchLatestEmailUsingGET(inboxEmailAddress, inboxId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#fetchLatestEmailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inboxEmailAddress** | **String**| Email address of the inbox we are fetching emails from | [optional]
 **inboxId** | [**UUID**](.md)| Id of the inbox we are fetching emails from | [optional]

### Return type

[**Email**](Email.md)

### Authorization

[API_KEY](../README.md#API_KEY)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendEmailSimpleUsingPOST"></a>
# **sendEmailSimpleUsingPOST**
> sendEmailSimpleUsingPOST(sendEmailOptions)

Send an email from a random email address

To specify an email address first create an inbox and use that with the other send email methods

### Example
```java
// Import classes:
//import mailslurp.ApiClient;
//import mailslurp.ApiException;
//import mailslurp.Configuration;
//import mailslurp.auth.*;
//import api.CommonOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API_KEY
ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
API_KEY.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API_KEY.setApiKeyPrefix("Token");

CommonOperationsApi apiInstance = new CommonOperationsApi();
SendEmailOptions sendEmailOptions = new SendEmailOptions(); // SendEmailOptions | sendEmailOptions
try {
    apiInstance.sendEmailSimpleUsingPOST(sendEmailOptions);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonOperationsApi#sendEmailSimpleUsingPOST");
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

