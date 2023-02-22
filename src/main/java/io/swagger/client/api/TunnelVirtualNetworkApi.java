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


import io.swagger.client.model.InlineResponse4xx166;
import io.swagger.client.model.InlineResponse4xx167;
import io.swagger.client.model.TeamnetVirtualNetworksBody;
import io.swagger.client.model.VirtualNetworksVnetIdBody;
import io.swagger.client.model.VnetResponseCollection;
import io.swagger.client.model.VnetResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TunnelVirtualNetworkApi {
    private ApiClient apiClient;

    public TunnelVirtualNetworkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TunnelVirtualNetworkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for tunnelVirtualNetworkCreateAVirtualNetwork
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkCreateAVirtualNetworkCall(TeamnetVirtualNetworksBody body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/virtual_networks"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tunnelVirtualNetworkCreateAVirtualNetworkValidateBeforeCall(TeamnetVirtualNetworksBody body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tunnelVirtualNetworkCreateAVirtualNetwork(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelVirtualNetworkCreateAVirtualNetwork(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelVirtualNetworkCreateAVirtualNetworkCall(body, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a virtual network
     * Adds a new virtual network to an account.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return VnetResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VnetResponseSingle tunnelVirtualNetworkCreateAVirtualNetwork(TeamnetVirtualNetworksBody body, String accountIdentifier) throws ApiException {
        ApiResponse<VnetResponseSingle> resp = tunnelVirtualNetworkCreateAVirtualNetworkWithHttpInfo(body, accountIdentifier);
        return resp.getData();
    }

    /**
     * Create a virtual network
     * Adds a new virtual network to an account.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VnetResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VnetResponseSingle> tunnelVirtualNetworkCreateAVirtualNetworkWithHttpInfo(TeamnetVirtualNetworksBody body, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelVirtualNetworkCreateAVirtualNetworkValidateBeforeCall(body, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VnetResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a virtual network (asynchronously)
     * Adds a new virtual network to an account.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkCreateAVirtualNetworkAsync(TeamnetVirtualNetworksBody body, String accountIdentifier, final ApiCallback<VnetResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelVirtualNetworkCreateAVirtualNetworkValidateBeforeCall(body, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VnetResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tunnelVirtualNetworkDeleteAVirtualNetwork
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkDeleteAVirtualNetworkCall(String vnetId, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/virtual_networks/{vnet_id}"
            .replaceAll("\\{" + "vnet_id" + "\\}", apiClient.escapeString(vnetId.toString()))
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call tunnelVirtualNetworkDeleteAVirtualNetworkValidateBeforeCall(String vnetId, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'vnetId' is set
        if (vnetId == null) {
            throw new ApiException("Missing the required parameter 'vnetId' when calling tunnelVirtualNetworkDeleteAVirtualNetwork(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelVirtualNetworkDeleteAVirtualNetwork(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelVirtualNetworkDeleteAVirtualNetworkCall(vnetId, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a virtual network
     * Deletes an existing virtual network.
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @return VnetResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VnetResponseSingle tunnelVirtualNetworkDeleteAVirtualNetwork(String vnetId, String accountIdentifier) throws ApiException {
        ApiResponse<VnetResponseSingle> resp = tunnelVirtualNetworkDeleteAVirtualNetworkWithHttpInfo(vnetId, accountIdentifier);
        return resp.getData();
    }

    /**
     * Delete a virtual network
     * Deletes an existing virtual network.
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VnetResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VnetResponseSingle> tunnelVirtualNetworkDeleteAVirtualNetworkWithHttpInfo(String vnetId, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelVirtualNetworkDeleteAVirtualNetworkValidateBeforeCall(vnetId, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VnetResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a virtual network (asynchronously)
     * Deletes an existing virtual network.
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkDeleteAVirtualNetworkAsync(String vnetId, String accountIdentifier, final ApiCallback<VnetResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelVirtualNetworkDeleteAVirtualNetworkValidateBeforeCall(vnetId, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VnetResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tunnelVirtualNetworkListVirtualNetworks
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkListVirtualNetworksCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/virtual_networks"
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
    private com.squareup.okhttp.Call tunnelVirtualNetworkListVirtualNetworksValidateBeforeCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelVirtualNetworkListVirtualNetworks(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelVirtualNetworkListVirtualNetworksCall(accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List virtual networks
     * Lists and filters virtual networks in an account.
     * @param accountIdentifier  (required)
     * @return VnetResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VnetResponseCollection tunnelVirtualNetworkListVirtualNetworks(String accountIdentifier) throws ApiException {
        ApiResponse<VnetResponseCollection> resp = tunnelVirtualNetworkListVirtualNetworksWithHttpInfo(accountIdentifier);
        return resp.getData();
    }

    /**
     * List virtual networks
     * Lists and filters virtual networks in an account.
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VnetResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VnetResponseCollection> tunnelVirtualNetworkListVirtualNetworksWithHttpInfo(String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelVirtualNetworkListVirtualNetworksValidateBeforeCall(accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VnetResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List virtual networks (asynchronously)
     * Lists and filters virtual networks in an account.
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkListVirtualNetworksAsync(String accountIdentifier, final ApiCallback<VnetResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelVirtualNetworkListVirtualNetworksValidateBeforeCall(accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VnetResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tunnelVirtualNetworkUpdateAVirtualNetwork
     * @param body  (required)
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkUpdateAVirtualNetworkCall(VirtualNetworksVnetIdBody body, String vnetId, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/virtual_networks/{vnet_id}"
            .replaceAll("\\{" + "vnet_id" + "\\}", apiClient.escapeString(vnetId.toString()))
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
    private com.squareup.okhttp.Call tunnelVirtualNetworkUpdateAVirtualNetworkValidateBeforeCall(VirtualNetworksVnetIdBody body, String vnetId, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tunnelVirtualNetworkUpdateAVirtualNetwork(Async)");
        }
        // verify the required parameter 'vnetId' is set
        if (vnetId == null) {
            throw new ApiException("Missing the required parameter 'vnetId' when calling tunnelVirtualNetworkUpdateAVirtualNetwork(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelVirtualNetworkUpdateAVirtualNetwork(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelVirtualNetworkUpdateAVirtualNetworkCall(body, vnetId, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a virtual network
     * Updates an existing virtual network.
     * @param body  (required)
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @return VnetResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VnetResponseSingle tunnelVirtualNetworkUpdateAVirtualNetwork(VirtualNetworksVnetIdBody body, String vnetId, String accountIdentifier) throws ApiException {
        ApiResponse<VnetResponseSingle> resp = tunnelVirtualNetworkUpdateAVirtualNetworkWithHttpInfo(body, vnetId, accountIdentifier);
        return resp.getData();
    }

    /**
     * Update a virtual network
     * Updates an existing virtual network.
     * @param body  (required)
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VnetResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VnetResponseSingle> tunnelVirtualNetworkUpdateAVirtualNetworkWithHttpInfo(VirtualNetworksVnetIdBody body, String vnetId, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelVirtualNetworkUpdateAVirtualNetworkValidateBeforeCall(body, vnetId, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VnetResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a virtual network (asynchronously)
     * Updates an existing virtual network.
     * @param body  (required)
     * @param vnetId  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelVirtualNetworkUpdateAVirtualNetworkAsync(VirtualNetworksVnetIdBody body, String vnetId, String accountIdentifier, final ApiCallback<VnetResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelVirtualNetworkUpdateAVirtualNetworkValidateBeforeCall(body, vnetId, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VnetResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
