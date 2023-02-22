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


import io.swagger.client.model.AccessKeysBody;
import io.swagger.client.model.InlineResponse4xx221;
import io.swagger.client.model.KeysComponentsSchemasIdentifier;
import io.swagger.client.model.KeysComponentsSchemasSingleResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessKeyConfigurationApi {
    private ApiClient apiClient;

    public AccessKeyConfigurationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessKeyConfigurationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for accessKeyConfigurationGetTheAccessKeyConfiguration
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessKeyConfigurationGetTheAccessKeyConfigurationCall(KeysComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/keys"
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
    private com.squareup.okhttp.Call accessKeyConfigurationGetTheAccessKeyConfigurationValidateBeforeCall(KeysComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessKeyConfigurationGetTheAccessKeyConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = accessKeyConfigurationGetTheAccessKeyConfigurationCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the Access key configuration
     * Gets the Access key rotation settings for an account.
     * @param identifier  (required)
     * @return KeysComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeysComponentsSchemasSingleResponse accessKeyConfigurationGetTheAccessKeyConfiguration(KeysComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<KeysComponentsSchemasSingleResponse> resp = accessKeyConfigurationGetTheAccessKeyConfigurationWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get the Access key configuration
     * Gets the Access key rotation settings for an account.
     * @param identifier  (required)
     * @return ApiResponse&lt;KeysComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeysComponentsSchemasSingleResponse> accessKeyConfigurationGetTheAccessKeyConfigurationWithHttpInfo(KeysComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessKeyConfigurationGetTheAccessKeyConfigurationValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<KeysComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the Access key configuration (asynchronously)
     * Gets the Access key rotation settings for an account.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessKeyConfigurationGetTheAccessKeyConfigurationAsync(KeysComponentsSchemasIdentifier identifier, final ApiCallback<KeysComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessKeyConfigurationGetTheAccessKeyConfigurationValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeysComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessKeyConfigurationRotateAccessKeys
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessKeyConfigurationRotateAccessKeysCall(KeysComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/keys/rotate"
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
    private com.squareup.okhttp.Call accessKeyConfigurationRotateAccessKeysValidateBeforeCall(KeysComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessKeyConfigurationRotateAccessKeys(Async)");
        }
        
        com.squareup.okhttp.Call call = accessKeyConfigurationRotateAccessKeysCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Rotate Access keys
     * Perfoms a key rotation for an account.
     * @param identifier  (required)
     * @return KeysComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeysComponentsSchemasSingleResponse accessKeyConfigurationRotateAccessKeys(KeysComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<KeysComponentsSchemasSingleResponse> resp = accessKeyConfigurationRotateAccessKeysWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Rotate Access keys
     * Perfoms a key rotation for an account.
     * @param identifier  (required)
     * @return ApiResponse&lt;KeysComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeysComponentsSchemasSingleResponse> accessKeyConfigurationRotateAccessKeysWithHttpInfo(KeysComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessKeyConfigurationRotateAccessKeysValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<KeysComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotate Access keys (asynchronously)
     * Perfoms a key rotation for an account.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessKeyConfigurationRotateAccessKeysAsync(KeysComponentsSchemasIdentifier identifier, final ApiCallback<KeysComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessKeyConfigurationRotateAccessKeysValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeysComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessKeyConfigurationUpdateTheAccessKeyConfiguration
     * @param body  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessKeyConfigurationUpdateTheAccessKeyConfigurationCall(AccessKeysBody body, KeysComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/keys"
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
    private com.squareup.okhttp.Call accessKeyConfigurationUpdateTheAccessKeyConfigurationValidateBeforeCall(AccessKeysBody body, KeysComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling accessKeyConfigurationUpdateTheAccessKeyConfiguration(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessKeyConfigurationUpdateTheAccessKeyConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = accessKeyConfigurationUpdateTheAccessKeyConfigurationCall(body, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update the Access key configuration
     * Updates the Access key rotation settings for an account.
     * @param body  (required)
     * @param identifier  (required)
     * @return KeysComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public KeysComponentsSchemasSingleResponse accessKeyConfigurationUpdateTheAccessKeyConfiguration(AccessKeysBody body, KeysComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<KeysComponentsSchemasSingleResponse> resp = accessKeyConfigurationUpdateTheAccessKeyConfigurationWithHttpInfo(body, identifier);
        return resp.getData();
    }

    /**
     * Update the Access key configuration
     * Updates the Access key rotation settings for an account.
     * @param body  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;KeysComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<KeysComponentsSchemasSingleResponse> accessKeyConfigurationUpdateTheAccessKeyConfigurationWithHttpInfo(AccessKeysBody body, KeysComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessKeyConfigurationUpdateTheAccessKeyConfigurationValidateBeforeCall(body, identifier, null, null);
        Type localVarReturnType = new TypeToken<KeysComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update the Access key configuration (asynchronously)
     * Updates the Access key rotation settings for an account.
     * @param body  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessKeyConfigurationUpdateTheAccessKeyConfigurationAsync(AccessKeysBody body, KeysComponentsSchemasIdentifier identifier, final ApiCallback<KeysComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessKeyConfigurationUpdateTheAccessKeyConfigurationValidateBeforeCall(body, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<KeysComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
