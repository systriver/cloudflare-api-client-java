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


import io.swagger.client.model.InlineResponse200118;
import io.swagger.client.model.InlineResponse4xx409;
import io.swagger.client.model.InlineResponse4xx410;
import io.swagger.client.model.InlineResponse4xx411;
import io.swagger.client.model.RatelimitResponseCollection;
import io.swagger.client.model.RatelimitResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RateLimitsForAZoneApi {
    private ApiClient apiClient;

    public RateLimitsForAZoneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RateLimitsForAZoneApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for rateLimitsForAZoneCreateARateLimit
     * @param body  (required)
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneCreateARateLimitCall(Object body, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/rate_limits"
            .replaceAll("\\{" + "zone_identifier" + "\\}", apiClient.escapeString(zoneIdentifier.toString()));

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
    private com.squareup.okhttp.Call rateLimitsForAZoneCreateARateLimitValidateBeforeCall(Object body, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling rateLimitsForAZoneCreateARateLimit(Async)");
        }
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling rateLimitsForAZoneCreateARateLimit(Async)");
        }
        
        com.squareup.okhttp.Call call = rateLimitsForAZoneCreateARateLimitCall(body, zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a rate limit
     * Creates a new rate limit for a zone. Refer to the object definition for a list of required attributes.
     * @param body  (required)
     * @param zoneIdentifier  (required)
     * @return RatelimitResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatelimitResponseSingle rateLimitsForAZoneCreateARateLimit(Object body, String zoneIdentifier) throws ApiException {
        ApiResponse<RatelimitResponseSingle> resp = rateLimitsForAZoneCreateARateLimitWithHttpInfo(body, zoneIdentifier);
        return resp.getData();
    }

    /**
     * Create a rate limit
     * Creates a new rate limit for a zone. Refer to the object definition for a list of required attributes.
     * @param body  (required)
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;RatelimitResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatelimitResponseSingle> rateLimitsForAZoneCreateARateLimitWithHttpInfo(Object body, String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = rateLimitsForAZoneCreateARateLimitValidateBeforeCall(body, zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RatelimitResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a rate limit (asynchronously)
     * Creates a new rate limit for a zone. Refer to the object definition for a list of required attributes.
     * @param body  (required)
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneCreateARateLimitAsync(Object body, String zoneIdentifier, final ApiCallback<RatelimitResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rateLimitsForAZoneCreateARateLimitValidateBeforeCall(body, zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatelimitResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rateLimitsForAZoneDeleteARateLimit
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneDeleteARateLimitCall(String id, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/rate_limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "zone_identifier" + "\\}", apiClient.escapeString(zoneIdentifier.toString()));

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
    private com.squareup.okhttp.Call rateLimitsForAZoneDeleteARateLimitValidateBeforeCall(String id, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling rateLimitsForAZoneDeleteARateLimit(Async)");
        }
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling rateLimitsForAZoneDeleteARateLimit(Async)");
        }
        
        com.squareup.okhttp.Call call = rateLimitsForAZoneDeleteARateLimitCall(id, zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a rate limit
     * Deletes an existing rate limit.
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @return InlineResponse200118
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse200118 rateLimitsForAZoneDeleteARateLimit(String id, String zoneIdentifier) throws ApiException {
        ApiResponse<InlineResponse200118> resp = rateLimitsForAZoneDeleteARateLimitWithHttpInfo(id, zoneIdentifier);
        return resp.getData();
    }

    /**
     * Delete a rate limit
     * Deletes an existing rate limit.
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;InlineResponse200118&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse200118> rateLimitsForAZoneDeleteARateLimitWithHttpInfo(String id, String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = rateLimitsForAZoneDeleteARateLimitValidateBeforeCall(id, zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse200118>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a rate limit (asynchronously)
     * Deletes an existing rate limit.
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneDeleteARateLimitAsync(String id, String zoneIdentifier, final ApiCallback<InlineResponse200118> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rateLimitsForAZoneDeleteARateLimitValidateBeforeCall(id, zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse200118>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rateLimitsForAZoneGetARateLimit
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneGetARateLimitCall(String id, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/rate_limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "zone_identifier" + "\\}", apiClient.escapeString(zoneIdentifier.toString()));

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
    private com.squareup.okhttp.Call rateLimitsForAZoneGetARateLimitValidateBeforeCall(String id, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling rateLimitsForAZoneGetARateLimit(Async)");
        }
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling rateLimitsForAZoneGetARateLimit(Async)");
        }
        
        com.squareup.okhttp.Call call = rateLimitsForAZoneGetARateLimitCall(id, zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a rate limit
     * Fetches the details of a rate limit.
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @return RatelimitResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatelimitResponseSingle rateLimitsForAZoneGetARateLimit(String id, String zoneIdentifier) throws ApiException {
        ApiResponse<RatelimitResponseSingle> resp = rateLimitsForAZoneGetARateLimitWithHttpInfo(id, zoneIdentifier);
        return resp.getData();
    }

    /**
     * Get a rate limit
     * Fetches the details of a rate limit.
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;RatelimitResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatelimitResponseSingle> rateLimitsForAZoneGetARateLimitWithHttpInfo(String id, String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = rateLimitsForAZoneGetARateLimitValidateBeforeCall(id, zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RatelimitResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a rate limit (asynchronously)
     * Fetches the details of a rate limit.
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneGetARateLimitAsync(String id, String zoneIdentifier, final ApiCallback<RatelimitResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rateLimitsForAZoneGetARateLimitValidateBeforeCall(id, zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatelimitResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rateLimitsForAZoneListRateLimits
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneListRateLimitsCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/rate_limits"
            .replaceAll("\\{" + "zone_identifier" + "\\}", apiClient.escapeString(zoneIdentifier.toString()));

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
    private com.squareup.okhttp.Call rateLimitsForAZoneListRateLimitsValidateBeforeCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling rateLimitsForAZoneListRateLimits(Async)");
        }
        
        com.squareup.okhttp.Call call = rateLimitsForAZoneListRateLimitsCall(zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List rate limits
     * Fetches the rate limits for a zone.
     * @param zoneIdentifier  (required)
     * @return RatelimitResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatelimitResponseCollection rateLimitsForAZoneListRateLimits(String zoneIdentifier) throws ApiException {
        ApiResponse<RatelimitResponseCollection> resp = rateLimitsForAZoneListRateLimitsWithHttpInfo(zoneIdentifier);
        return resp.getData();
    }

    /**
     * List rate limits
     * Fetches the rate limits for a zone.
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;RatelimitResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatelimitResponseCollection> rateLimitsForAZoneListRateLimitsWithHttpInfo(String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = rateLimitsForAZoneListRateLimitsValidateBeforeCall(zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RatelimitResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List rate limits (asynchronously)
     * Fetches the rate limits for a zone.
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneListRateLimitsAsync(String zoneIdentifier, final ApiCallback<RatelimitResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rateLimitsForAZoneListRateLimitsValidateBeforeCall(zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatelimitResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rateLimitsForAZoneUpdateARateLimit
     * @param body  (required)
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneUpdateARateLimitCall(Object body, String id, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/rate_limits/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "zone_identifier" + "\\}", apiClient.escapeString(zoneIdentifier.toString()));

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
    private com.squareup.okhttp.Call rateLimitsForAZoneUpdateARateLimitValidateBeforeCall(Object body, String id, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling rateLimitsForAZoneUpdateARateLimit(Async)");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling rateLimitsForAZoneUpdateARateLimit(Async)");
        }
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling rateLimitsForAZoneUpdateARateLimit(Async)");
        }
        
        com.squareup.okhttp.Call call = rateLimitsForAZoneUpdateARateLimitCall(body, id, zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a rate limit
     * Updates an existing rate limit.
     * @param body  (required)
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @return RatelimitResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RatelimitResponseSingle rateLimitsForAZoneUpdateARateLimit(Object body, String id, String zoneIdentifier) throws ApiException {
        ApiResponse<RatelimitResponseSingle> resp = rateLimitsForAZoneUpdateARateLimitWithHttpInfo(body, id, zoneIdentifier);
        return resp.getData();
    }

    /**
     * Update a rate limit
     * Updates an existing rate limit.
     * @param body  (required)
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;RatelimitResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RatelimitResponseSingle> rateLimitsForAZoneUpdateARateLimitWithHttpInfo(Object body, String id, String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = rateLimitsForAZoneUpdateARateLimitValidateBeforeCall(body, id, zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RatelimitResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a rate limit (asynchronously)
     * Updates an existing rate limit.
     * @param body  (required)
     * @param id  (required)
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rateLimitsForAZoneUpdateARateLimitAsync(Object body, String id, String zoneIdentifier, final ApiCallback<RatelimitResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = rateLimitsForAZoneUpdateARateLimitValidateBeforeCall(body, id, zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RatelimitResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}