/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails and SMS from dynamically allocated email addresses and phone numbers. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.apis;

import com.mailslurp.clients.ApiCallback;
import com.mailslurp.clients.ApiClient;
import com.mailslurp.clients.ApiException;
import com.mailslurp.clients.ApiResponse;
import com.mailslurp.clients.Configuration;
import com.mailslurp.clients.Pair;
import com.mailslurp.clients.ProgressRequestBody;
import com.mailslurp.clients.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.mailslurp.models.OptInConsentOptions;
import com.mailslurp.models.OptInConsentSendResult;
import com.mailslurp.models.OptInSendingConsentDto;
import com.mailslurp.models.PageOptInIdentityProjection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsentControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConsentControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConsentControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call checkSendingConsentForEmailAddressCall(@javax.annotation.Nonnull String emailAddress, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/consent/opt-in/sending-consent";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (emailAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("emailAddress", emailAddress));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call checkSendingConsentForEmailAddressValidateBeforeCall(@javax.annotation.Nonnull String emailAddress, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'emailAddress' is set
        if (emailAddress == null) {
            throw new ApiException("Missing the required parameter 'emailAddress' when calling checkSendingConsentForEmailAddress(Async)");
        }

        return checkSendingConsentForEmailAddressCall(emailAddress, _callback);

    }


    private ApiResponse<OptInSendingConsentDto> checkSendingConsentForEmailAddressWithHttpInfo(@javax.annotation.Nonnull String emailAddress) throws ApiException {
        okhttp3.Call localVarCall = checkSendingConsentForEmailAddressValidateBeforeCall(emailAddress, null);
        Type localVarReturnType = new TypeToken<OptInSendingConsentDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call checkSendingConsentForEmailAddressAsync(@javax.annotation.Nonnull String emailAddress, final ApiCallback<OptInSendingConsentDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = checkSendingConsentForEmailAddressValidateBeforeCall(emailAddress, _callback);
        Type localVarReturnType = new TypeToken<OptInSendingConsentDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcheckSendingConsentForEmailAddressRequest {
        @javax.annotation.Nonnull
        private final String emailAddress;

        private APIcheckSendingConsentForEmailAddressRequest(@javax.annotation.Nonnull String emailAddress) {
            this.emailAddress = emailAddress;
        }

        /**
         * Build call for checkSendingConsentForEmailAddress
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return checkSendingConsentForEmailAddressCall(emailAddress, _callback);
        }

        /**
         * Execute checkSendingConsentForEmailAddress request
         * @return OptInSendingConsentDto
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public OptInSendingConsentDto execute() throws ApiException {
            ApiResponse<OptInSendingConsentDto> localVarResp = checkSendingConsentForEmailAddressWithHttpInfo(emailAddress);
            return localVarResp.getData();
        }

        /**
         * Execute checkSendingConsentForEmailAddress request with HTTP info returned
         * @return ApiResponse&lt;OptInSendingConsentDto&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OptInSendingConsentDto> executeWithHttpInfo() throws ApiException {
            return checkSendingConsentForEmailAddressWithHttpInfo(emailAddress);
        }

        /**
         * Execute checkSendingConsentForEmailAddress request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OptInSendingConsentDto> _callback) throws ApiException {
            return checkSendingConsentForEmailAddressAsync(emailAddress, _callback);
        }
    }

    /**
     * 
     * 
     * @param emailAddress Email address to check consent for (required)
     * @return APIcheckSendingConsentForEmailAddressRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIcheckSendingConsentForEmailAddressRequest checkSendingConsentForEmailAddress(@javax.annotation.Nonnull String emailAddress) {
        return new APIcheckSendingConsentForEmailAddressRequest(emailAddress);
    }
    private okhttp3.Call getOptInIdentitiesCall(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/consent/opt-in";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOptInIdentitiesValidateBeforeCall(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort, final ApiCallback _callback) throws ApiException {
        return getOptInIdentitiesCall(page, size, sort, _callback);

    }


    private ApiResponse<PageOptInIdentityProjection> getOptInIdentitiesWithHttpInfo(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort) throws ApiException {
        okhttp3.Call localVarCall = getOptInIdentitiesValidateBeforeCall(page, size, sort, null);
        Type localVarReturnType = new TypeToken<PageOptInIdentityProjection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getOptInIdentitiesAsync(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort, final ApiCallback<PageOptInIdentityProjection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOptInIdentitiesValidateBeforeCall(page, size, sort, _callback);
        Type localVarReturnType = new TypeToken<PageOptInIdentityProjection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetOptInIdentitiesRequest {
        @javax.annotation.Nullable
        private Integer page;
        @javax.annotation.Nullable
        private Integer size;
        @javax.annotation.Nullable
        private String sort;

        private APIgetOptInIdentitiesRequest() {
        }

        /**
         * Set page
         * @param page Optional page index in list pagination (optional, default to 0)
         * @return APIgetOptInIdentitiesRequest
         */
        public APIgetOptInIdentitiesRequest page(@javax.annotation.Nullable Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set size
         * @param size Optional page size in list pagination (optional, default to 20)
         * @return APIgetOptInIdentitiesRequest
         */
        public APIgetOptInIdentitiesRequest size(@javax.annotation.Nullable Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Set sort
         * @param sort Optional createdAt sort direction ASC or DESC (optional, default to ASC)
         * @return APIgetOptInIdentitiesRequest
         */
        public APIgetOptInIdentitiesRequest sort(@javax.annotation.Nullable String sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Build call for getOptInIdentities
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getOptInIdentitiesCall(page, size, sort, _callback);
        }

        /**
         * Execute getOptInIdentities request
         * @return PageOptInIdentityProjection
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PageOptInIdentityProjection execute() throws ApiException {
            ApiResponse<PageOptInIdentityProjection> localVarResp = getOptInIdentitiesWithHttpInfo(page, size, sort);
            return localVarResp.getData();
        }

        /**
         * Execute getOptInIdentities request with HTTP info returned
         * @return ApiResponse&lt;PageOptInIdentityProjection&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PageOptInIdentityProjection> executeWithHttpInfo() throws ApiException {
            return getOptInIdentitiesWithHttpInfo(page, size, sort);
        }

        /**
         * Execute getOptInIdentities request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PageOptInIdentityProjection> _callback) throws ApiException {
            return getOptInIdentitiesAsync(page, size, sort, _callback);
        }
    }

    /**
     * 
     * 
     * @return APIgetOptInIdentitiesRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIgetOptInIdentitiesRequest getOptInIdentities() {
        return new APIgetOptInIdentitiesRequest();
    }
    private okhttp3.Call revokeOptInConsentForEmailAddressCall(@javax.annotation.Nonnull String emailAddress, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/consent/opt-in";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (emailAddress != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("emailAddress", emailAddress));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call revokeOptInConsentForEmailAddressValidateBeforeCall(@javax.annotation.Nonnull String emailAddress, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'emailAddress' is set
        if (emailAddress == null) {
            throw new ApiException("Missing the required parameter 'emailAddress' when calling revokeOptInConsentForEmailAddress(Async)");
        }

        return revokeOptInConsentForEmailAddressCall(emailAddress, _callback);

    }


    private ApiResponse<OptInSendingConsentDto> revokeOptInConsentForEmailAddressWithHttpInfo(@javax.annotation.Nonnull String emailAddress) throws ApiException {
        okhttp3.Call localVarCall = revokeOptInConsentForEmailAddressValidateBeforeCall(emailAddress, null);
        Type localVarReturnType = new TypeToken<OptInSendingConsentDto>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call revokeOptInConsentForEmailAddressAsync(@javax.annotation.Nonnull String emailAddress, final ApiCallback<OptInSendingConsentDto> _callback) throws ApiException {

        okhttp3.Call localVarCall = revokeOptInConsentForEmailAddressValidateBeforeCall(emailAddress, _callback);
        Type localVarReturnType = new TypeToken<OptInSendingConsentDto>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIrevokeOptInConsentForEmailAddressRequest {
        @javax.annotation.Nonnull
        private final String emailAddress;

        private APIrevokeOptInConsentForEmailAddressRequest(@javax.annotation.Nonnull String emailAddress) {
            this.emailAddress = emailAddress;
        }

        /**
         * Build call for revokeOptInConsentForEmailAddress
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return revokeOptInConsentForEmailAddressCall(emailAddress, _callback);
        }

        /**
         * Execute revokeOptInConsentForEmailAddress request
         * @return OptInSendingConsentDto
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public OptInSendingConsentDto execute() throws ApiException {
            ApiResponse<OptInSendingConsentDto> localVarResp = revokeOptInConsentForEmailAddressWithHttpInfo(emailAddress);
            return localVarResp.getData();
        }

        /**
         * Execute revokeOptInConsentForEmailAddress request with HTTP info returned
         * @return ApiResponse&lt;OptInSendingConsentDto&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OptInSendingConsentDto> executeWithHttpInfo() throws ApiException {
            return revokeOptInConsentForEmailAddressWithHttpInfo(emailAddress);
        }

        /**
         * Execute revokeOptInConsentForEmailAddress request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OptInSendingConsentDto> _callback) throws ApiException {
            return revokeOptInConsentForEmailAddressAsync(emailAddress, _callback);
        }
    }

    /**
     * 
     * 
     * @param emailAddress Email address to revoke consent for (required)
     * @return APIrevokeOptInConsentForEmailAddressRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIrevokeOptInConsentForEmailAddressRequest revokeOptInConsentForEmailAddress(@javax.annotation.Nonnull String emailAddress) {
        return new APIrevokeOptInConsentForEmailAddressRequest(emailAddress);
    }
    private okhttp3.Call sendOptInConsentForEmailAddressCall(@javax.annotation.Nonnull OptInConsentOptions optInConsentOptions, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = optInConsentOptions;

        // create path and map variables
        String localVarPath = "/consent/opt-in/send";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "API_KEY" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendOptInConsentForEmailAddressValidateBeforeCall(@javax.annotation.Nonnull OptInConsentOptions optInConsentOptions, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'optInConsentOptions' is set
        if (optInConsentOptions == null) {
            throw new ApiException("Missing the required parameter 'optInConsentOptions' when calling sendOptInConsentForEmailAddress(Async)");
        }

        return sendOptInConsentForEmailAddressCall(optInConsentOptions, _callback);

    }


    private ApiResponse<OptInConsentSendResult> sendOptInConsentForEmailAddressWithHttpInfo(@javax.annotation.Nonnull OptInConsentOptions optInConsentOptions) throws ApiException {
        okhttp3.Call localVarCall = sendOptInConsentForEmailAddressValidateBeforeCall(optInConsentOptions, null);
        Type localVarReturnType = new TypeToken<OptInConsentSendResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call sendOptInConsentForEmailAddressAsync(@javax.annotation.Nonnull OptInConsentOptions optInConsentOptions, final ApiCallback<OptInConsentSendResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendOptInConsentForEmailAddressValidateBeforeCall(optInConsentOptions, _callback);
        Type localVarReturnType = new TypeToken<OptInConsentSendResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIsendOptInConsentForEmailAddressRequest {
        @javax.annotation.Nonnull
        private final OptInConsentOptions optInConsentOptions;

        private APIsendOptInConsentForEmailAddressRequest(@javax.annotation.Nonnull OptInConsentOptions optInConsentOptions) {
            this.optInConsentOptions = optInConsentOptions;
        }

        /**
         * Build call for sendOptInConsentForEmailAddress
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return sendOptInConsentForEmailAddressCall(optInConsentOptions, _callback);
        }

        /**
         * Execute sendOptInConsentForEmailAddress request
         * @return OptInConsentSendResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public OptInConsentSendResult execute() throws ApiException {
            ApiResponse<OptInConsentSendResult> localVarResp = sendOptInConsentForEmailAddressWithHttpInfo(optInConsentOptions);
            return localVarResp.getData();
        }

        /**
         * Execute sendOptInConsentForEmailAddress request with HTTP info returned
         * @return ApiResponse&lt;OptInConsentSendResult&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OptInConsentSendResult> executeWithHttpInfo() throws ApiException {
            return sendOptInConsentForEmailAddressWithHttpInfo(optInConsentOptions);
        }

        /**
         * Execute sendOptInConsentForEmailAddress request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OptInConsentSendResult> _callback) throws ApiException {
            return sendOptInConsentForEmailAddressAsync(optInConsentOptions, _callback);
        }
    }

    /**
     * Send a verification code to a user once they have explicitly submitted their email address
     * Send double-opt in consent for an email address
     * @param optInConsentOptions  (required)
     * @return APIsendOptInConsentForEmailAddressRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIsendOptInConsentForEmailAddressRequest sendOptInConsentForEmailAddress(@javax.annotation.Nonnull OptInConsentOptions optInConsentOptions) {
        return new APIsendOptInConsentForEmailAddressRequest(optInConsentOptions);
    }
}
