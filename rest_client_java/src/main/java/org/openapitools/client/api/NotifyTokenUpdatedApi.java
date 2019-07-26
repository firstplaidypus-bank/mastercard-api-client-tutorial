/*
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously.  
 *
 * The version of the OpenAPI document: 1.2.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ErrorsResponse;
import org.openapitools.client.model.NotifyTokenUpdatedRequestSchema;
import org.openapitools.client.model.NotifyTokenUpdatedResponseSchema;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotifyTokenUpdatedApi {
    private ApiClient localVarApiClient;

    public NotifyTokenUpdatedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotifyTokenUpdatedApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for notifyTokenUpdateForTokenStateChange
     * @param notifyTokenUpdatedRequestSchema Contains the details of the request message.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notifyTokenUpdateForTokenStateChangeCall(NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = notifyTokenUpdatedRequestSchema;

        // create path and map variables
        String localVarPath = "/digitization/static/1/0/notifyTokenUpdated";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call notifyTokenUpdateForTokenStateChangeValidateBeforeCall(NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = notifyTokenUpdateForTokenStateChangeCall(notifyTokenUpdatedRequestSchema, _callback);
        return localVarCall;

    }

    /**
     * Outbound API used by MDES to notify the Token Requestor of significant Token updates, such as when the Token is activated, suspended, unsuspended or deleted; or when information about the Token or its product configuration has changed.
     * This API is used by MDES to notify the Token Requestor of significant Token updates. Typical notification scenarios include  &lt;br&gt; &lt;br&gt;  1. Informing the merchant a token is active 2. Informing the merchant a token has been suspended by the Issuer 3. Informing the merchant a token has been unsuspended by the Issuer 4. Informing the merchant a token has been deleted by the Issuer 5. Informing the merchant of a product configuration change (such as a change in Card Art) 6. Informing the merchant of underlying changes to the FPAN metadata associated to the token&lt;br&gt;   __Connection Security__&lt;br&gt; Mastercard will connect via TLS protocol and verify the server certificate before establishing a connection to the client endpoint. During this handshake, the client server can request TLS client authentication. Mastercard will present a client certificate which identifies as �ws.mastercard.com� This client certificate is issued by the Entrust L1K certificate and should be available in most trust stores.  &lt;br&gt;&lt;br&gt; __Conditional Objects__&lt;br&gt; The contents of the notifyTokenUpdated API will vary depending which of the above scneraios triggered the notification. &lt;br&gt;   1. *productConfig* - Provided when Product Configuration has changed (e.g. such as card art).      2. *tokenInfo* - Provided when either the details of the token or associated FPAN have changed (such as token or PAN expiry).      The optional objects will always contain a minimum set of data which be returned regardless of whether or not updates have been made. These fields are denoted as required fields.&lt;br&gt;     
     * @param notifyTokenUpdatedRequestSchema Contains the details of the request message.  (optional)
     * @return NotifyTokenUpdatedResponseSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public NotifyTokenUpdatedResponseSchema notifyTokenUpdateForTokenStateChange(NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema) throws ApiException {
        ApiResponse<NotifyTokenUpdatedResponseSchema> localVarResp = notifyTokenUpdateForTokenStateChangeWithHttpInfo(notifyTokenUpdatedRequestSchema);
        return localVarResp.getData();
    }

    /**
     * Outbound API used by MDES to notify the Token Requestor of significant Token updates, such as when the Token is activated, suspended, unsuspended or deleted; or when information about the Token or its product configuration has changed.
     * This API is used by MDES to notify the Token Requestor of significant Token updates. Typical notification scenarios include  &lt;br&gt; &lt;br&gt;  1. Informing the merchant a token is active 2. Informing the merchant a token has been suspended by the Issuer 3. Informing the merchant a token has been unsuspended by the Issuer 4. Informing the merchant a token has been deleted by the Issuer 5. Informing the merchant of a product configuration change (such as a change in Card Art) 6. Informing the merchant of underlying changes to the FPAN metadata associated to the token&lt;br&gt;   __Connection Security__&lt;br&gt; Mastercard will connect via TLS protocol and verify the server certificate before establishing a connection to the client endpoint. During this handshake, the client server can request TLS client authentication. Mastercard will present a client certificate which identifies as �ws.mastercard.com� This client certificate is issued by the Entrust L1K certificate and should be available in most trust stores.  &lt;br&gt;&lt;br&gt; __Conditional Objects__&lt;br&gt; The contents of the notifyTokenUpdated API will vary depending which of the above scneraios triggered the notification. &lt;br&gt;   1. *productConfig* - Provided when Product Configuration has changed (e.g. such as card art).      2. *tokenInfo* - Provided when either the details of the token or associated FPAN have changed (such as token or PAN expiry).      The optional objects will always contain a minimum set of data which be returned regardless of whether or not updates have been made. These fields are denoted as required fields.&lt;br&gt;     
     * @param notifyTokenUpdatedRequestSchema Contains the details of the request message.  (optional)
     * @return ApiResponse&lt;NotifyTokenUpdatedResponseSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NotifyTokenUpdatedResponseSchema> notifyTokenUpdateForTokenStateChangeWithHttpInfo(NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema) throws ApiException {
        okhttp3.Call localVarCall = notifyTokenUpdateForTokenStateChangeValidateBeforeCall(notifyTokenUpdatedRequestSchema, null);
        Type localVarReturnType = new TypeToken<NotifyTokenUpdatedResponseSchema>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Outbound API used by MDES to notify the Token Requestor of significant Token updates, such as when the Token is activated, suspended, unsuspended or deleted; or when information about the Token or its product configuration has changed. (asynchronously)
     * This API is used by MDES to notify the Token Requestor of significant Token updates. Typical notification scenarios include  &lt;br&gt; &lt;br&gt;  1. Informing the merchant a token is active 2. Informing the merchant a token has been suspended by the Issuer 3. Informing the merchant a token has been unsuspended by the Issuer 4. Informing the merchant a token has been deleted by the Issuer 5. Informing the merchant of a product configuration change (such as a change in Card Art) 6. Informing the merchant of underlying changes to the FPAN metadata associated to the token&lt;br&gt;   __Connection Security__&lt;br&gt; Mastercard will connect via TLS protocol and verify the server certificate before establishing a connection to the client endpoint. During this handshake, the client server can request TLS client authentication. Mastercard will present a client certificate which identifies as �ws.mastercard.com� This client certificate is issued by the Entrust L1K certificate and should be available in most trust stores.  &lt;br&gt;&lt;br&gt; __Conditional Objects__&lt;br&gt; The contents of the notifyTokenUpdated API will vary depending which of the above scneraios triggered the notification. &lt;br&gt;   1. *productConfig* - Provided when Product Configuration has changed (e.g. such as card art).      2. *tokenInfo* - Provided when either the details of the token or associated FPAN have changed (such as token or PAN expiry).      The optional objects will always contain a minimum set of data which be returned regardless of whether or not updates have been made. These fields are denoted as required fields.&lt;br&gt;     
     * @param notifyTokenUpdatedRequestSchema Contains the details of the request message.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Contains the details of the response message.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> unexpected error  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call notifyTokenUpdateForTokenStateChangeAsync(NotifyTokenUpdatedRequestSchema notifyTokenUpdatedRequestSchema, final ApiCallback<NotifyTokenUpdatedResponseSchema> _callback) throws ApiException {

        okhttp3.Call localVarCall = notifyTokenUpdateForTokenStateChangeValidateBeforeCall(notifyTokenUpdatedRequestSchema, _callback);
        Type localVarReturnType = new TypeToken<NotifyTokenUpdatedResponseSchema>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}