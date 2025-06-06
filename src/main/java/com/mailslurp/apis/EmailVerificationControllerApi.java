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


import java.time.OffsetDateTime;
import com.mailslurp.models.PageEmailValidationRequest;
import java.util.UUID;
import com.mailslurp.models.ValidateEmailAddressListOptions;
import com.mailslurp.models.ValidateEmailAddressListResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailVerificationControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmailVerificationControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmailVerificationControllerApi(ApiClient apiClient) {
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

    private okhttp3.Call deleteAllValidationRequestsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/email-verification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
    private okhttp3.Call deleteAllValidationRequestsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return deleteAllValidationRequestsCall(_callback);

    }


    private ApiResponse<Void> deleteAllValidationRequestsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = deleteAllValidationRequestsValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteAllValidationRequestsAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteAllValidationRequestsValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIdeleteAllValidationRequestsRequest {

        private APIdeleteAllValidationRequestsRequest() {
        }

        /**
         * Build call for deleteAllValidationRequests
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteAllValidationRequestsCall(_callback);
        }

        /**
         * Execute deleteAllValidationRequests request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteAllValidationRequestsWithHttpInfo();
        }

        /**
         * Execute deleteAllValidationRequests request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteAllValidationRequestsWithHttpInfo();
        }

        /**
         * Execute deleteAllValidationRequests request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteAllValidationRequestsAsync(_callback);
        }
    }

    /**
     * Delete all validation requests
     * Remove validation requests
     * @return APIdeleteAllValidationRequestsRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteAllValidationRequestsRequest deleteAllValidationRequests() {
        return new APIdeleteAllValidationRequestsRequest();
    }
    private okhttp3.Call deleteValidationRequestCall(@javax.annotation.Nonnull UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/email-verification/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
    private okhttp3.Call deleteValidationRequestValidateBeforeCall(@javax.annotation.Nonnull UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteValidationRequest(Async)");
        }

        return deleteValidationRequestCall(id, _callback);

    }


    private ApiResponse<Void> deleteValidationRequestWithHttpInfo(@javax.annotation.Nonnull UUID id) throws ApiException {
        okhttp3.Call localVarCall = deleteValidationRequestValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call deleteValidationRequestAsync(@javax.annotation.Nonnull UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidationRequestValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIdeleteValidationRequestRequest {
        @javax.annotation.Nonnull
        private final UUID id;

        private APIdeleteValidationRequestRequest(@javax.annotation.Nonnull UUID id) {
            this.id = id;
        }

        /**
         * Build call for deleteValidationRequest
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteValidationRequestCall(id, _callback);
        }

        /**
         * Execute deleteValidationRequest request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            deleteValidationRequestWithHttpInfo(id);
        }

        /**
         * Execute deleteValidationRequest request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return deleteValidationRequestWithHttpInfo(id);
        }

        /**
         * Execute deleteValidationRequest request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return deleteValidationRequestAsync(id, _callback);
        }
    }

    /**
     * Delete a validation record
     * Delete a validation record
     * @param id  (required)
     * @return APIdeleteValidationRequestRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteValidationRequestRequest deleteValidationRequest(@javax.annotation.Nonnull UUID id) {
        return new APIdeleteValidationRequestRequest(id);
    }
    private okhttp3.Call getValidationRequestsCall(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort, @javax.annotation.Nullable String searchFilter, @javax.annotation.Nullable OffsetDateTime since, @javax.annotation.Nullable OffsetDateTime before, @javax.annotation.Nullable Boolean isValid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/email-verification/validation-requests";

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

        if (searchFilter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchFilter", searchFilter));
        }

        if (since != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("since", since));
        }

        if (before != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("before", before));
        }

        if (isValid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("isValid", isValid));
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
    private okhttp3.Call getValidationRequestsValidateBeforeCall(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort, @javax.annotation.Nullable String searchFilter, @javax.annotation.Nullable OffsetDateTime since, @javax.annotation.Nullable OffsetDateTime before, @javax.annotation.Nullable Boolean isValid, final ApiCallback _callback) throws ApiException {
        return getValidationRequestsCall(page, size, sort, searchFilter, since, before, isValid, _callback);

    }


    private ApiResponse<PageEmailValidationRequest> getValidationRequestsWithHttpInfo(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort, @javax.annotation.Nullable String searchFilter, @javax.annotation.Nullable OffsetDateTime since, @javax.annotation.Nullable OffsetDateTime before, @javax.annotation.Nullable Boolean isValid) throws ApiException {
        okhttp3.Call localVarCall = getValidationRequestsValidateBeforeCall(page, size, sort, searchFilter, since, before, isValid, null);
        Type localVarReturnType = new TypeToken<PageEmailValidationRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getValidationRequestsAsync(@javax.annotation.Nullable Integer page, @javax.annotation.Nullable Integer size, @javax.annotation.Nullable String sort, @javax.annotation.Nullable String searchFilter, @javax.annotation.Nullable OffsetDateTime since, @javax.annotation.Nullable OffsetDateTime before, @javax.annotation.Nullable Boolean isValid, final ApiCallback<PageEmailValidationRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = getValidationRequestsValidateBeforeCall(page, size, sort, searchFilter, since, before, isValid, _callback);
        Type localVarReturnType = new TypeToken<PageEmailValidationRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetValidationRequestsRequest {
        @javax.annotation.Nullable
        private Integer page;
        @javax.annotation.Nullable
        private Integer size;
        @javax.annotation.Nullable
        private String sort;
        @javax.annotation.Nullable
        private String searchFilter;
        @javax.annotation.Nullable
        private OffsetDateTime since;
        @javax.annotation.Nullable
        private OffsetDateTime before;
        @javax.annotation.Nullable
        private Boolean isValid;

        private APIgetValidationRequestsRequest() {
        }

        /**
         * Set page
         * @param page Optional page index in list pagination (optional, default to 0)
         * @return APIgetValidationRequestsRequest
         */
        public APIgetValidationRequestsRequest page(@javax.annotation.Nullable Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Set size
         * @param size Optional page size for paginated result list. (optional, default to 20)
         * @return APIgetValidationRequestsRequest
         */
        public APIgetValidationRequestsRequest size(@javax.annotation.Nullable Integer size) {
            this.size = size;
            return this;
        }

        /**
         * Set sort
         * @param sort Optional createdAt sort direction ASC or DESC (optional, default to DESC)
         * @return APIgetValidationRequestsRequest
         */
        public APIgetValidationRequestsRequest sort(@javax.annotation.Nullable String sort) {
            this.sort = sort;
            return this;
        }

        /**
         * Set searchFilter
         * @param searchFilter Optional search filter (optional)
         * @return APIgetValidationRequestsRequest
         */
        public APIgetValidationRequestsRequest searchFilter(@javax.annotation.Nullable String searchFilter) {
            this.searchFilter = searchFilter;
            return this;
        }

        /**
         * Set since
         * @param since Filter by created at after the given timestamp (optional)
         * @return APIgetValidationRequestsRequest
         */
        public APIgetValidationRequestsRequest since(@javax.annotation.Nullable OffsetDateTime since) {
            this.since = since;
            return this;
        }

        /**
         * Set before
         * @param before Filter by created at before the given timestamp (optional)
         * @return APIgetValidationRequestsRequest
         */
        public APIgetValidationRequestsRequest before(@javax.annotation.Nullable OffsetDateTime before) {
            this.before = before;
            return this;
        }

        /**
         * Set isValid
         * @param isValid Filter where email is valid is true or false (optional)
         * @return APIgetValidationRequestsRequest
         */
        public APIgetValidationRequestsRequest isValid(@javax.annotation.Nullable Boolean isValid) {
            this.isValid = isValid;
            return this;
        }

        /**
         * Build call for getValidationRequests
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
            return getValidationRequestsCall(page, size, sort, searchFilter, since, before, isValid, _callback);
        }

        /**
         * Execute getValidationRequests request
         * @return PageEmailValidationRequest
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public PageEmailValidationRequest execute() throws ApiException {
            ApiResponse<PageEmailValidationRequest> localVarResp = getValidationRequestsWithHttpInfo(page, size, sort, searchFilter, since, before, isValid);
            return localVarResp.getData();
        }

        /**
         * Execute getValidationRequests request with HTTP info returned
         * @return ApiResponse&lt;PageEmailValidationRequest&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PageEmailValidationRequest> executeWithHttpInfo() throws ApiException {
            return getValidationRequestsWithHttpInfo(page, size, sort, searchFilter, since, before, isValid);
        }

        /**
         * Execute getValidationRequests request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<PageEmailValidationRequest> _callback) throws ApiException {
            return getValidationRequestsAsync(page, size, sort, searchFilter, since, before, isValid, _callback);
        }
    }

    /**
     * Validate a list of email addresses. Per unit billing. See your plan for pricing.
     * List email verification requests
     * @return APIgetValidationRequestsRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIgetValidationRequestsRequest getValidationRequests() {
        return new APIgetValidationRequestsRequest();
    }
    private okhttp3.Call validateEmailAddressListCall(@javax.annotation.Nonnull ValidateEmailAddressListOptions validateEmailAddressListOptions, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = validateEmailAddressListOptions;

        // create path and map variables
        String localVarPath = "/email-verification/email-address-list";

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
    private okhttp3.Call validateEmailAddressListValidateBeforeCall(@javax.annotation.Nonnull ValidateEmailAddressListOptions validateEmailAddressListOptions, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'validateEmailAddressListOptions' is set
        if (validateEmailAddressListOptions == null) {
            throw new ApiException("Missing the required parameter 'validateEmailAddressListOptions' when calling validateEmailAddressList(Async)");
        }

        return validateEmailAddressListCall(validateEmailAddressListOptions, _callback);

    }


    private ApiResponse<ValidateEmailAddressListResult> validateEmailAddressListWithHttpInfo(@javax.annotation.Nonnull ValidateEmailAddressListOptions validateEmailAddressListOptions) throws ApiException {
        okhttp3.Call localVarCall = validateEmailAddressListValidateBeforeCall(validateEmailAddressListOptions, null);
        Type localVarReturnType = new TypeToken<ValidateEmailAddressListResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call validateEmailAddressListAsync(@javax.annotation.Nonnull ValidateEmailAddressListOptions validateEmailAddressListOptions, final ApiCallback<ValidateEmailAddressListResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = validateEmailAddressListValidateBeforeCall(validateEmailAddressListOptions, _callback);
        Type localVarReturnType = new TypeToken<ValidateEmailAddressListResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIvalidateEmailAddressListRequest {
        @javax.annotation.Nonnull
        private final ValidateEmailAddressListOptions validateEmailAddressListOptions;

        private APIvalidateEmailAddressListRequest(@javax.annotation.Nonnull ValidateEmailAddressListOptions validateEmailAddressListOptions) {
            this.validateEmailAddressListOptions = validateEmailAddressListOptions;
        }

        /**
         * Build call for validateEmailAddressList
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
            return validateEmailAddressListCall(validateEmailAddressListOptions, _callback);
        }

        /**
         * Execute validateEmailAddressList request
         * @return ValidateEmailAddressListResult
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ValidateEmailAddressListResult execute() throws ApiException {
            ApiResponse<ValidateEmailAddressListResult> localVarResp = validateEmailAddressListWithHttpInfo(validateEmailAddressListOptions);
            return localVarResp.getData();
        }

        /**
         * Execute validateEmailAddressList request with HTTP info returned
         * @return ApiResponse&lt;ValidateEmailAddressListResult&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ValidateEmailAddressListResult> executeWithHttpInfo() throws ApiException {
            return validateEmailAddressListWithHttpInfo(validateEmailAddressListOptions);
        }

        /**
         * Execute validateEmailAddressList request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<ValidateEmailAddressListResult> _callback) throws ApiException {
            return validateEmailAddressListAsync(validateEmailAddressListOptions, _callback);
        }
    }

    /**
     * Validate a list of email addresses. Per unit billing. See your plan for pricing.
     * Verify a list of email addresses is valid and can be contacted.
     * @param validateEmailAddressListOptions  (required)
     * @return APIvalidateEmailAddressListRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public APIvalidateEmailAddressListRequest validateEmailAddressList(@javax.annotation.Nonnull ValidateEmailAddressListOptions validateEmailAddressListOptions) {
        return new APIvalidateEmailAddressListRequest(validateEmailAddressListOptions);
    }
}
