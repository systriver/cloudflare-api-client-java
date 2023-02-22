/*
 * Cloudflare API
 * Interact with Cloudflare's products and services via the Cloudflare API. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AdvertisedResponse;
import io.swagger.client.model.BgpStatusBody;
import io.swagger.client.model.InlineResponse4xx9;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IpAddressManagementDynamicAdvertisementApi {
    private ApiClient apiClient;

    public IpAddressManagementDynamicAdvertisementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IpAddressManagementDynamicAdvertisementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for ipAddressManagementDynamicAdvertisementGetAdvertisementStatus
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ipAddressManagementDynamicAdvertisementGetAdvertisementStatusCall(String prefixIdentifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/addressing/prefixes/{prefix_identifier}/bgp/status"
            .replaceAll("\\{" + "prefix_identifier" + "\\}", apiClient.escapeString(prefixIdentifier.toString()))
            .replaceAll("\\{" + "account_identifier" + "\\}", apiClient.escapeString(accountIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_email", "api_key", "api_token" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ipAddressManagementDynamicAdvertisementGetAdvertisementStatusValidateBeforeCall(String prefixIdentifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'prefixIdentifier' is set
        if (prefixIdentifier == null) {
            throw new ApiException("Missing the required parameter 'prefixIdentifier' when calling ipAddressManagementDynamicAdvertisementGetAdvertisementStatus(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling ipAddressManagementDynamicAdvertisementGetAdvertisementStatus(Async)");
        }
        
        com.squareup.okhttp.Call call = ipAddressManagementDynamicAdvertisementGetAdvertisementStatusCall(prefixIdentifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Advertisement Status
     * List the current advertisement state for a prefix.
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @return AdvertisedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertisedResponse ipAddressManagementDynamicAdvertisementGetAdvertisementStatus(String prefixIdentifier, String accountIdentifier) throws ApiException {
        ApiResponse<AdvertisedResponse> resp = ipAddressManagementDynamicAdvertisementGetAdvertisementStatusWithHttpInfo(prefixIdentifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * Get Advertisement Status
     * List the current advertisement state for a prefix.
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AdvertisedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertisedResponse> ipAddressManagementDynamicAdvertisementGetAdvertisementStatusWithHttpInfo(String prefixIdentifier, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = ipAddressManagementDynamicAdvertisementGetAdvertisementStatusValidateBeforeCall(prefixIdentifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AdvertisedResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Advertisement Status (asynchronously)
     * List the current advertisement state for a prefix.
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ipAddressManagementDynamicAdvertisementGetAdvertisementStatusAsync(String prefixIdentifier, String accountIdentifier, final ApiCallback<AdvertisedResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = ipAddressManagementDynamicAdvertisementGetAdvertisementStatusValidateBeforeCall(prefixIdentifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertisedResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus
     * @param body  (required)
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusCall(BgpStatusBody body, String prefixIdentifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/addressing/prefixes/{prefix_identifier}/bgp/status"
            .replaceAll("\\{" + "prefix_identifier" + "\\}", apiClient.escapeString(prefixIdentifier.toString()))
            .replaceAll("\\{" + "account_identifier" + "\\}", apiClient.escapeString(accountIdentifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_email", "api_key", "api_token" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusValidateBeforeCall(BgpStatusBody body, String prefixIdentifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(Async)");
        }
        // verify the required parameter 'prefixIdentifier' is set
        if (prefixIdentifier == null) {
            throw new ApiException("Missing the required parameter 'prefixIdentifier' when calling ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(Async)");
        }
        
        com.squareup.okhttp.Call call = ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusCall(body, prefixIdentifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Prefix Dynamic Advertisement Status
     * Advertise or withdraw BGP route for a prefix.
     * @param body  (required)
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @return AdvertisedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertisedResponse ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(BgpStatusBody body, String prefixIdentifier, String accountIdentifier) throws ApiException {
        ApiResponse<AdvertisedResponse> resp = ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusWithHttpInfo(body, prefixIdentifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * Update Prefix Dynamic Advertisement Status
     * Advertise or withdraw BGP route for a prefix.
     * @param body  (required)
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AdvertisedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertisedResponse> ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusWithHttpInfo(BgpStatusBody body, String prefixIdentifier, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusValidateBeforeCall(body, prefixIdentifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AdvertisedResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Prefix Dynamic Advertisement Status (asynchronously)
     * Advertise or withdraw BGP route for a prefix.
     * @param body  (required)
     * @param prefixIdentifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusAsync(BgpStatusBody body, String prefixIdentifier, String accountIdentifier, final ApiCallback<AdvertisedResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatusValidateBeforeCall(body, prefixIdentifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertisedResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
