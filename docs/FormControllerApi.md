# FormControllerApi

All URIs are relative to *https://java.api.mailslurp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**submitForm**](FormControllerApi#submitForm) | **POST** /forms | Submit a form to be parsed and sent as an email to an address determined by the form fields |


<a id="submitForm"></a>
# **submitForm**
> String submitForm().to(to).subject(subject).emailAddress(emailAddress).successMessage(successMessage).spamCheck(spamCheck).otherParameters(otherParameters).execute();

Submit a form to be parsed and sent as an email to an address determined by the form fields

This endpoint allows you to submit HTML forms and receive the field values and files via email.   #### Parameters The endpoint looks for special meta parameters in the form fields OR in the URL request parameters. The meta parameters can be used to specify the behaviour of the email.   You must provide at-least a &#x60;_to&#x60; email address to tell the endpoint where the form should be emailed. These can be submitted as hidden HTML input fields with the corresponding &#x60;name&#x60; attributes or as URL query parameters such as &#x60;?_to&#x3D;test@example.com&#x60;  The endpoint takes all other form fields that are named and includes them in the message body of the email. Files are sent as attachments.  #### Submitting This endpoint accepts form submission via POST method. It accepts &#x60;application/x-www-form-urlencoded&#x60;, and &#x60;multipart/form-data&#x60; content-types.  #### HTML Example &#x60;&#x60;&#x60;html &lt;form    action&#x3D;\&quot;https://java.api.mailslurp.com/forms\&quot;   method&#x3D;\&quot;post\&quot; &gt;   &lt;input name&#x3D;\&quot;_to\&quot; type&#x3D;\&quot;hidden\&quot; value&#x3D;\&quot;test@example.com\&quot;/&gt;   &lt;textarea name&#x3D;\&quot;feedback\&quot;&gt;&lt;/textarea&gt;   &lt;button type&#x3D;\&quot;submit\&quot;&gt;Submit&lt;/button&gt; &lt;/form&gt; &#x60;&#x60;&#x60;  #### URL Example &#x60;&#x60;&#x60;html &lt;form    action&#x3D;\&quot;https://java.api.mailslurp.com/forms?_to&#x3D;test@example.com\&quot;   method&#x3D;\&quot;post\&quot; &gt;   &lt;textarea name&#x3D;\&quot;feedback\&quot;&gt;&lt;/textarea&gt;   &lt;button type&#x3D;\&quot;submit\&quot;&gt;Submit&lt;/button&gt; &lt;/form&gt; &#x60;&#x60;&#x60;    The email address is specified by a &#x60;_to&#x60; field OR is extracted from an email alias specified by a &#x60;_toAlias&#x60; field (see the alias controller for more information).  Endpoint accepts .  You can specify a content type in HTML forms using the &#x60;enctype&#x60; attribute, for instance: &#x60;&lt;form enctype&#x3D;\&quot;multipart/form-data\&quot;&gt;&#x60;.  

### Example
```java
// Import classes:
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.auth.*;
import com.mailslurp.clients.models.*;
import com.mailslurp.apis.FormControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://java.api.mailslurp.com");
    
    // Configure API key authorization: API_KEY
    ApiKeyAuth API_KEY = (ApiKeyAuth) defaultClient.getAuthentication("API_KEY");
    API_KEY.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API_KEY.setApiKeyPrefix("Token");

    FormControllerApi apiInstance = new FormControllerApi(defaultClient);
    String to = "to_example"; // String | The email address that submitted form should be sent to.
    String subject = "subject_example"; // String | Optional subject of the email that will be sent.
    String emailAddress = "emailAddress_example"; // String | Email address of the submitting user. Include this if you wish to record the submitters email address and reply to it later.
    String successMessage = "successMessage_example"; // String | Optional success message to display if no _redirectTo present.
    String spamCheck = "spamCheck_example"; // String | Optional but recommended field that catches spammers out. Include as a hidden form field but LEAVE EMPTY. Spam-bots will usually fill every field. If the _spamCheck field is filled the form submission will be ignored.
    String otherParameters = "otherParameters_example"; // String | All other parameters or fields will be accepted and attached to the sent email. This includes files and any HTML form field with a name. These fields will become the body of the email that is sent.
    try {
      String result = apiInstance.submitForm()
            .to(to)
            .subject(subject)
            .emailAddress(emailAddress)
            .successMessage(successMessage)
            .spamCheck(spamCheck)
            .otherParameters(otherParameters)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormControllerApi#submitForm");
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
| **to** | **String**| The email address that submitted form should be sent to. | [optional] |
| **subject** | **String**| Optional subject of the email that will be sent. | [optional] |
| **emailAddress** | **String**| Email address of the submitting user. Include this if you wish to record the submitters email address and reply to it later. | [optional] |
| **successMessage** | **String**| Optional success message to display if no _redirectTo present. | [optional] |
| **spamCheck** | **String**| Optional but recommended field that catches spammers out. Include as a hidden form field but LEAVE EMPTY. Spam-bots will usually fill every field. If the _spamCheck field is filled the form submission will be ignored. | [optional] |
| **otherParameters** | **String**| All other parameters or fields will be accepted and attached to the sent email. This includes files and any HTML form field with a name. These fields will become the body of the email that is sent. | [optional] |

### Return type

**String**

### Authorization

[API_KEY](../README#API_KEY)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

