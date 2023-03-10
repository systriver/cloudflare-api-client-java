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


import io.swagger.client.model.GatewayProxyEndpointsBody;
import io.swagger.client.model.InlineResponse4xx277;
import io.swagger.client.model.InlineResponse4xx278;
import io.swagger.client.model.InlineResponse4xx279;
import io.swagger.client.model.ProxyEndpointsComponentsSchemasEmptyResponse;
import io.swagger.client.model.ProxyEndpointsComponentsSchemasIdentifier;
import io.swagger.client.model.ProxyEndpointsComponentsSchemasResponseCollection;
import io.swagger.client.model.ProxyEndpointsComponentsSchemasSingleResponse;
import io.swagger.client.model.ProxyEndpointsComponentsSchemasUuid;
import io.swagger.client.model.ProxyEndpointsUuidBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroTrustGatewayProxyEndpointsApi {
    private ApiClient apiClient;

    public ZeroTrustGatewayProxyEndpointsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZeroTrustGatewayProxyEndpointsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for zeroTrustGatewayProxyEndpointsCreateProxyEndpoint
     * @param body  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsCreateProxyEndpointCall(GatewayProxyEndpointsBody body, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/gateway/proxy_endpoints"
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
    private com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsCreateProxyEndpointValidateBeforeCall(GatewayProxyEndpointsBody body, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling zeroTrustGatewayProxyEndpointsCreateProxyEndpoint(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustGatewayProxyEndpointsCreateProxyEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsCreateProxyEndpointCall(body, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Proxy Endpoint
     * Create a new Zero Trust Gateway Proxy Endpoint.
     * @param body  (required)
     * @param identifier  (required)
     * @return ProxyEndpointsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsCreateProxyEndpoint(GatewayProxyEndpointsBody body, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<ProxyEndpointsComponentsSchemasSingleResponse> resp = zeroTrustGatewayProxyEndpointsCreateProxyEndpointWithHttpInfo(body, identifier);
        return resp.getData();
    }

    /**
     * Create Proxy Endpoint
     * Create a new Zero Trust Gateway Proxy Endpoint.
     * @param body  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;ProxyEndpointsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProxyEndpointsComponentsSchemasSingleResponse> zeroTrustGatewayProxyEndpointsCreateProxyEndpointWithHttpInfo(GatewayProxyEndpointsBody body, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsCreateProxyEndpointValidateBeforeCall(body, identifier, null, null);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Proxy Endpoint (asynchronously)
     * Create a new Zero Trust Gateway Proxy Endpoint.
     * @param body  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsCreateProxyEndpointAsync(GatewayProxyEndpointsBody body, ProxyEndpointsComponentsSchemasIdentifier identifier, final ApiCallback<ProxyEndpointsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsCreateProxyEndpointValidateBeforeCall(body, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsDeleteProxyEndpointCall(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/gateway/proxy_endpoints/{uuid}"
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
    private com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsDeleteProxyEndpointValidateBeforeCall(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsDeleteProxyEndpointCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Proxy Endpoint
     * Delete a Zero Trust Gateway Proxy Endpoint.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ProxyEndpointsComponentsSchemasEmptyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProxyEndpointsComponentsSchemasEmptyResponse zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<ProxyEndpointsComponentsSchemasEmptyResponse> resp = zeroTrustGatewayProxyEndpointsDeleteProxyEndpointWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Delete Proxy Endpoint
     * Delete a Zero Trust Gateway Proxy Endpoint.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;ProxyEndpointsComponentsSchemasEmptyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProxyEndpointsComponentsSchemasEmptyResponse> zeroTrustGatewayProxyEndpointsDeleteProxyEndpointWithHttpInfo(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsDeleteProxyEndpointValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasEmptyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Proxy Endpoint (asynchronously)
     * Delete a Zero Trust Gateway Proxy Endpoint.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsDeleteProxyEndpointAsync(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ApiCallback<ProxyEndpointsComponentsSchemasEmptyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsDeleteProxyEndpointValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasEmptyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zeroTrustGatewayProxyEndpointsListProxyEndpoints
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsListProxyEndpointsCall(ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/gateway/proxy_endpoints"
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
    private com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsListProxyEndpointsValidateBeforeCall(ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustGatewayProxyEndpointsListProxyEndpoints(Async)");
        }
        
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsListProxyEndpointsCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Proxy Endpoints
     * Fetch a single Zero Trust Gateway Proxy Endpoint.
     * @param identifier  (required)
     * @return ProxyEndpointsComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProxyEndpointsComponentsSchemasResponseCollection zeroTrustGatewayProxyEndpointsListProxyEndpoints(ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<ProxyEndpointsComponentsSchemasResponseCollection> resp = zeroTrustGatewayProxyEndpointsListProxyEndpointsWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * List Proxy Endpoints
     * Fetch a single Zero Trust Gateway Proxy Endpoint.
     * @param identifier  (required)
     * @return ApiResponse&lt;ProxyEndpointsComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProxyEndpointsComponentsSchemasResponseCollection> zeroTrustGatewayProxyEndpointsListProxyEndpointsWithHttpInfo(ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsListProxyEndpointsValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Proxy Endpoints (asynchronously)
     * Fetch a single Zero Trust Gateway Proxy Endpoint.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsListProxyEndpointsAsync(ProxyEndpointsComponentsSchemasIdentifier identifier, final ApiCallback<ProxyEndpointsComponentsSchemasResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsListProxyEndpointsValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zeroTrustGatewayProxyEndpointsProxyEndpointDetails
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsProxyEndpointDetailsCall(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/gateway/proxy_endpoints/{uuid}"
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
    private com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsProxyEndpointDetailsValidateBeforeCall(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling zeroTrustGatewayProxyEndpointsProxyEndpointDetails(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustGatewayProxyEndpointsProxyEndpointDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsProxyEndpointDetailsCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Proxy Endpoint Details
     * List Zero Trust Gateway Proxy Endpoints for an account.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ProxyEndpointsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsProxyEndpointDetails(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<ProxyEndpointsComponentsSchemasSingleResponse> resp = zeroTrustGatewayProxyEndpointsProxyEndpointDetailsWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Proxy Endpoint Details
     * List Zero Trust Gateway Proxy Endpoints for an account.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;ProxyEndpointsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProxyEndpointsComponentsSchemasSingleResponse> zeroTrustGatewayProxyEndpointsProxyEndpointDetailsWithHttpInfo(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsProxyEndpointDetailsValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Proxy Endpoint Details (asynchronously)
     * List Zero Trust Gateway Proxy Endpoints for an account.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsProxyEndpointDetailsAsync(ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ApiCallback<ProxyEndpointsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsProxyEndpointDetailsValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsUpdateProxyEndpointCall(ProxyEndpointsUuidBody body, ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/gateway/proxy_endpoints/{uuid}"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsUpdateProxyEndpointValidateBeforeCall(ProxyEndpointsUuidBody body, ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(Async)");
        }
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(Async)");
        }
        
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsUpdateProxyEndpointCall(body, uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Proxy Endpoint
     * Update a new Zero Trust Gateway Proxy Endpoint.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ProxyEndpointsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(ProxyEndpointsUuidBody body, ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<ProxyEndpointsComponentsSchemasSingleResponse> resp = zeroTrustGatewayProxyEndpointsUpdateProxyEndpointWithHttpInfo(body, uuid, identifier);
        return resp.getData();
    }

    /**
     * Update Proxy Endpoint
     * Update a new Zero Trust Gateway Proxy Endpoint.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;ProxyEndpointsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ProxyEndpointsComponentsSchemasSingleResponse> zeroTrustGatewayProxyEndpointsUpdateProxyEndpointWithHttpInfo(ProxyEndpointsUuidBody body, ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsUpdateProxyEndpointValidateBeforeCall(body, uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Proxy Endpoint (asynchronously)
     * Update a new Zero Trust Gateway Proxy Endpoint.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call zeroTrustGatewayProxyEndpointsUpdateProxyEndpointAsync(ProxyEndpointsUuidBody body, ProxyEndpointsComponentsSchemasUuid uuid, ProxyEndpointsComponentsSchemasIdentifier identifier, final ApiCallback<ProxyEndpointsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zeroTrustGatewayProxyEndpointsUpdateProxyEndpointValidateBeforeCall(body, uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ProxyEndpointsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
