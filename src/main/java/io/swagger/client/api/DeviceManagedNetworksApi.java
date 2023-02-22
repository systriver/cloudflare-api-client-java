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


import io.swagger.client.model.DeviceManagedNetworksComponentsSchemasIdentifier;
import io.swagger.client.model.DeviceManagedNetworksComponentsSchemasResponseCollection;
import io.swagger.client.model.DeviceManagedNetworksComponentsSchemasSingleResponse;
import io.swagger.client.model.DevicesNetworksBody;
import io.swagger.client.model.InlineResponse4xx248;
import io.swagger.client.model.InlineResponse4xx249;
import io.swagger.client.model.NetworksUuidBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceManagedNetworksApi {
    private ApiClient apiClient;

    public DeviceManagedNetworksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeviceManagedNetworksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deviceManagedNetworksCreateDeviceManagedNetwork
     * @param body  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksCreateDeviceManagedNetworkCall(DevicesNetworksBody body, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/devices/networks"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call deviceManagedNetworksCreateDeviceManagedNetworkValidateBeforeCall(DevicesNetworksBody body, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deviceManagedNetworksCreateDeviceManagedNetwork(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deviceManagedNetworksCreateDeviceManagedNetwork(Async)");
        }
        
        com.squareup.okhttp.Call call = deviceManagedNetworksCreateDeviceManagedNetworkCall(body, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Device Managed Network
     * Create a new Device Managed Network.
     * @param body  (required)
     * @param identifier  (required)
     * @return DeviceManagedNetworksComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceManagedNetworksComponentsSchemasSingleResponse deviceManagedNetworksCreateDeviceManagedNetwork(DevicesNetworksBody body, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<DeviceManagedNetworksComponentsSchemasSingleResponse> resp = deviceManagedNetworksCreateDeviceManagedNetworkWithHttpInfo(body, identifier);
        return resp.getData();
    }

    /**
     * Create Device Managed Network
     * Create a new Device Managed Network.
     * @param body  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;DeviceManagedNetworksComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceManagedNetworksComponentsSchemasSingleResponse> deviceManagedNetworksCreateDeviceManagedNetworkWithHttpInfo(DevicesNetworksBody body, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = deviceManagedNetworksCreateDeviceManagedNetworkValidateBeforeCall(body, identifier, null, null);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Device Managed Network (asynchronously)
     * Create a new Device Managed Network.
     * @param body  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksCreateDeviceManagedNetworkAsync(DevicesNetworksBody body, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ApiCallback<DeviceManagedNetworksComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deviceManagedNetworksCreateDeviceManagedNetworkValidateBeforeCall(body, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deviceManagedNetworksDeleteDeviceManagedNetwork
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksDeleteDeviceManagedNetworkCall(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/devices/networks/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call deviceManagedNetworksDeleteDeviceManagedNetworkValidateBeforeCall(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deviceManagedNetworksDeleteDeviceManagedNetwork(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deviceManagedNetworksDeleteDeviceManagedNetwork(Async)");
        }
        
        com.squareup.okhttp.Call call = deviceManagedNetworksDeleteDeviceManagedNetworkCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Device Managed Network
     * Delete a Device Managed Network. Returns the remaining device managed networks for the account.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return DeviceManagedNetworksComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceManagedNetworksComponentsSchemasResponseCollection deviceManagedNetworksDeleteDeviceManagedNetwork(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<DeviceManagedNetworksComponentsSchemasResponseCollection> resp = deviceManagedNetworksDeleteDeviceManagedNetworkWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Delete Device Managed Network
     * Delete a Device Managed Network. Returns the remaining device managed networks for the account.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;DeviceManagedNetworksComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceManagedNetworksComponentsSchemasResponseCollection> deviceManagedNetworksDeleteDeviceManagedNetworkWithHttpInfo(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = deviceManagedNetworksDeleteDeviceManagedNetworkValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Device Managed Network (asynchronously)
     * Delete a Device Managed Network. Returns the remaining device managed networks for the account.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksDeleteDeviceManagedNetworkAsync(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ApiCallback<DeviceManagedNetworksComponentsSchemasResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deviceManagedNetworksDeleteDeviceManagedNetworkValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deviceManagedNetworksDeviceManagedNetworkDetails
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksDeviceManagedNetworkDetailsCall(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/devices/networks/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call deviceManagedNetworksDeviceManagedNetworkDetailsValidateBeforeCall(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deviceManagedNetworksDeviceManagedNetworkDetails(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deviceManagedNetworksDeviceManagedNetworkDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = deviceManagedNetworksDeviceManagedNetworkDetailsCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Device Managed Network Details
     * Fetch a single Managed Network.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return DeviceManagedNetworksComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceManagedNetworksComponentsSchemasSingleResponse deviceManagedNetworksDeviceManagedNetworkDetails(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<DeviceManagedNetworksComponentsSchemasSingleResponse> resp = deviceManagedNetworksDeviceManagedNetworkDetailsWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Device Managed Network Details
     * Fetch a single Managed Network.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;DeviceManagedNetworksComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceManagedNetworksComponentsSchemasSingleResponse> deviceManagedNetworksDeviceManagedNetworkDetailsWithHttpInfo(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = deviceManagedNetworksDeviceManagedNetworkDetailsValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Device Managed Network Details (asynchronously)
     * Fetch a single Managed Network.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksDeviceManagedNetworkDetailsAsync(String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ApiCallback<DeviceManagedNetworksComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deviceManagedNetworksDeviceManagedNetworkDetailsValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deviceManagedNetworksListDeviceManagedNetworks
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksListDeviceManagedNetworksCall(DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/devices/networks"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call deviceManagedNetworksListDeviceManagedNetworksValidateBeforeCall(DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deviceManagedNetworksListDeviceManagedNetworks(Async)");
        }
        
        com.squareup.okhttp.Call call = deviceManagedNetworksListDeviceManagedNetworksCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Device Managed Networks
     * List Managed Networks for an account.
     * @param identifier  (required)
     * @return DeviceManagedNetworksComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceManagedNetworksComponentsSchemasResponseCollection deviceManagedNetworksListDeviceManagedNetworks(DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<DeviceManagedNetworksComponentsSchemasResponseCollection> resp = deviceManagedNetworksListDeviceManagedNetworksWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * List Device Managed Networks
     * List Managed Networks for an account.
     * @param identifier  (required)
     * @return ApiResponse&lt;DeviceManagedNetworksComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceManagedNetworksComponentsSchemasResponseCollection> deviceManagedNetworksListDeviceManagedNetworksWithHttpInfo(DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = deviceManagedNetworksListDeviceManagedNetworksValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Device Managed Networks (asynchronously)
     * List Managed Networks for an account.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksListDeviceManagedNetworksAsync(DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ApiCallback<DeviceManagedNetworksComponentsSchemasResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deviceManagedNetworksListDeviceManagedNetworksValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deviceManagedNetworksUpdateDeviceManagedNetwork
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksUpdateDeviceManagedNetworkCall(NetworksUuidBody body, String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/devices/networks/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deviceManagedNetworksUpdateDeviceManagedNetworkValidateBeforeCall(NetworksUuidBody body, String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deviceManagedNetworksUpdateDeviceManagedNetwork(Async)");
        }
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deviceManagedNetworksUpdateDeviceManagedNetwork(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deviceManagedNetworksUpdateDeviceManagedNetwork(Async)");
        }
        
        com.squareup.okhttp.Call call = deviceManagedNetworksUpdateDeviceManagedNetworkCall(body, uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Device Managed Network
     * Update a Device Managed Network.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @return DeviceManagedNetworksComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeviceManagedNetworksComponentsSchemasSingleResponse deviceManagedNetworksUpdateDeviceManagedNetwork(NetworksUuidBody body, String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<DeviceManagedNetworksComponentsSchemasSingleResponse> resp = deviceManagedNetworksUpdateDeviceManagedNetworkWithHttpInfo(body, uuid, identifier);
        return resp.getData();
    }

    /**
     * Update Device Managed Network
     * Update a Device Managed Network.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;DeviceManagedNetworksComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeviceManagedNetworksComponentsSchemasSingleResponse> deviceManagedNetworksUpdateDeviceManagedNetworkWithHttpInfo(NetworksUuidBody body, String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = deviceManagedNetworksUpdateDeviceManagedNetworkValidateBeforeCall(body, uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Device Managed Network (asynchronously)
     * Update a Device Managed Network.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deviceManagedNetworksUpdateDeviceManagedNetworkAsync(NetworksUuidBody body, String uuid, DeviceManagedNetworksComponentsSchemasIdentifier identifier, final ApiCallback<DeviceManagedNetworksComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deviceManagedNetworksUpdateDeviceManagedNetworkValidateBeforeCall(body, uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeviceManagedNetworksComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
