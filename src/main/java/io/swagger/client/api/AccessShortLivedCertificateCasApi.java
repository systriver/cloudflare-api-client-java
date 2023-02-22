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


import io.swagger.client.model.CaComponentsSchemasIdResponse;
import io.swagger.client.model.CaComponentsSchemasSingleResponse;
import io.swagger.client.model.CloudflareClientAPICaComponentsSchemasResponseCollection;
import io.swagger.client.model.InlineResponse4xx200;
import io.swagger.client.model.InlineResponse4xx207;
import io.swagger.client.model.InlineResponse4xx208;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessShortLivedCertificateCasApi {
    private ApiClient apiClient;

    public AccessShortLivedCertificateCasApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessShortLivedCertificateCasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for accessShortLivedCertificateCAsCreateAShortLivedCertificateCa
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsCreateAShortLivedCertificateCaCall(String uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/apps/{uuid}/ca"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call accessShortLivedCertificateCAsCreateAShortLivedCertificateCaValidateBeforeCall(String uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessShortLivedCertificateCAsCreateAShortLivedCertificateCa(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessShortLivedCertificateCAsCreateAShortLivedCertificateCa(Async)");
        }
        
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsCreateAShortLivedCertificateCaCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a short-lived certificate CA
     * Generates a new short-lived certificate CA and public key.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return CaComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CaComponentsSchemasSingleResponse accessShortLivedCertificateCAsCreateAShortLivedCertificateCa(String uuid, String identifier) throws ApiException {
        ApiResponse<CaComponentsSchemasSingleResponse> resp = accessShortLivedCertificateCAsCreateAShortLivedCertificateCaWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Create a short-lived certificate CA
     * Generates a new short-lived certificate CA and public key.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;CaComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CaComponentsSchemasSingleResponse> accessShortLivedCertificateCAsCreateAShortLivedCertificateCaWithHttpInfo(String uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsCreateAShortLivedCertificateCaValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<CaComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a short-lived certificate CA (asynchronously)
     * Generates a new short-lived certificate CA and public key.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsCreateAShortLivedCertificateCaAsync(String uuid, String identifier, final ApiCallback<CaComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsCreateAShortLivedCertificateCaValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CaComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaCall(String uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/apps/{uuid}/ca"
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
    private com.squareup.okhttp.Call accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaValidateBeforeCall(String uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(Async)");
        }
        
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a short-lived certificate CA
     * Deletes a short-lived certificate CA.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return CaComponentsSchemasIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CaComponentsSchemasIdResponse accessShortLivedCertificateCAsDeleteAShortLivedCertificateCa(String uuid, String identifier) throws ApiException {
        ApiResponse<CaComponentsSchemasIdResponse> resp = accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Delete a short-lived certificate CA
     * Deletes a short-lived certificate CA.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;CaComponentsSchemasIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CaComponentsSchemasIdResponse> accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaWithHttpInfo(String uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<CaComponentsSchemasIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a short-lived certificate CA (asynchronously)
     * Deletes a short-lived certificate CA.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaAsync(String uuid, String identifier, final ApiCallback<CaComponentsSchemasIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsDeleteAShortLivedCertificateCaValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CaComponentsSchemasIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessShortLivedCertificateCAsGetAShortLivedCertificateCa
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsGetAShortLivedCertificateCaCall(String uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/apps/{uuid}/ca"
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
    private com.squareup.okhttp.Call accessShortLivedCertificateCAsGetAShortLivedCertificateCaValidateBeforeCall(String uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessShortLivedCertificateCAsGetAShortLivedCertificateCa(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessShortLivedCertificateCAsGetAShortLivedCertificateCa(Async)");
        }
        
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsGetAShortLivedCertificateCaCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a short-lived certificate CA
     * Fetches a short-lived certificate CA and its public key.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return CaComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CaComponentsSchemasSingleResponse accessShortLivedCertificateCAsGetAShortLivedCertificateCa(String uuid, String identifier) throws ApiException {
        ApiResponse<CaComponentsSchemasSingleResponse> resp = accessShortLivedCertificateCAsGetAShortLivedCertificateCaWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Get a short-lived certificate CA
     * Fetches a short-lived certificate CA and its public key.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;CaComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CaComponentsSchemasSingleResponse> accessShortLivedCertificateCAsGetAShortLivedCertificateCaWithHttpInfo(String uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsGetAShortLivedCertificateCaValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<CaComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a short-lived certificate CA (asynchronously)
     * Fetches a short-lived certificate CA and its public key.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsGetAShortLivedCertificateCaAsync(String uuid, String identifier, final ApiCallback<CaComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsGetAShortLivedCertificateCaValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CaComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessShortLivedCertificateCAsListShortLivedCertificateCAs
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsListShortLivedCertificateCAsCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/apps/ca"
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
    private com.squareup.okhttp.Call accessShortLivedCertificateCAsListShortLivedCertificateCAsValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessShortLivedCertificateCAsListShortLivedCertificateCAs(Async)");
        }
        
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsListShortLivedCertificateCAsCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List short-lived certificate CAs
     * Lists short-lived certificate CAs and their public keys.
     * @param identifier  (required)
     * @return CloudflareClientAPICaComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPICaComponentsSchemasResponseCollection accessShortLivedCertificateCAsListShortLivedCertificateCAs(String identifier) throws ApiException {
        ApiResponse<CloudflareClientAPICaComponentsSchemasResponseCollection> resp = accessShortLivedCertificateCAsListShortLivedCertificateCAsWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * List short-lived certificate CAs
     * Lists short-lived certificate CAs and their public keys.
     * @param identifier  (required)
     * @return ApiResponse&lt;CloudflareClientAPICaComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPICaComponentsSchemasResponseCollection> accessShortLivedCertificateCAsListShortLivedCertificateCAsWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsListShortLivedCertificateCAsValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPICaComponentsSchemasResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List short-lived certificate CAs (asynchronously)
     * Lists short-lived certificate CAs and their public keys.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessShortLivedCertificateCAsListShortLivedCertificateCAsAsync(String identifier, final ApiCallback<CloudflareClientAPICaComponentsSchemasResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessShortLivedCertificateCAsListShortLivedCertificateCAsValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPICaComponentsSchemasResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
