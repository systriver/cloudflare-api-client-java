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


import io.swagger.client.model.ApiResponseSingle;
import io.swagger.client.model.CacheRulesComponentsSchemasRuleset;
import io.swagger.client.model.InlineResponse4xx33;
import io.swagger.client.model.InlineResponse4xx509;
import io.swagger.client.model.UpdateRuleset;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheRulesApi {
    private ApiClient apiClient;

    public CacheRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CacheRulesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cacheRulesListCacheRules
     * @param zoneId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cacheRulesListCacheRulesCall(String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_id}/rulesets/phases/http_request_cache_settings/entrypoint"
            .replaceAll("\\{" + "zone_id" + "\\}", apiClient.escapeString(zoneId.toString()));

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
    private com.squareup.okhttp.Call cacheRulesListCacheRulesValidateBeforeCall(String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling cacheRulesListCacheRules(Async)");
        }
        
        com.squareup.okhttp.Call call = cacheRulesListCacheRulesCall(zoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Cache Rules
     * Fetches all Cache Rules in a zone.
     * @param zoneId  (required)
     * @return CacheRulesComponentsSchemasRuleset
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CacheRulesComponentsSchemasRuleset cacheRulesListCacheRules(String zoneId) throws ApiException {
        ApiResponse<CacheRulesComponentsSchemasRuleset> resp = cacheRulesListCacheRulesWithHttpInfo(zoneId);
        return resp.getData();
    }

    /**
     * List Cache Rules
     * Fetches all Cache Rules in a zone.
     * @param zoneId  (required)
     * @return ApiResponse&lt;CacheRulesComponentsSchemasRuleset&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CacheRulesComponentsSchemasRuleset> cacheRulesListCacheRulesWithHttpInfo(String zoneId) throws ApiException {
        com.squareup.okhttp.Call call = cacheRulesListCacheRulesValidateBeforeCall(zoneId, null, null);
        Type localVarReturnType = new TypeToken<CacheRulesComponentsSchemasRuleset>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Cache Rules (asynchronously)
     * Fetches all Cache Rules in a zone.
     * @param zoneId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cacheRulesListCacheRulesAsync(String zoneId, final ApiCallback<CacheRulesComponentsSchemasRuleset> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cacheRulesListCacheRulesValidateBeforeCall(zoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CacheRulesComponentsSchemasRuleset>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cacheRulesUpdateCacheRules
     * @param body  (required)
     * @param zoneId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cacheRulesUpdateCacheRulesCall(UpdateRuleset body, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_id}/rulesets/phases/http_request_cache_settings/entrypoint"
            .replaceAll("\\{" + "zone_id" + "\\}", apiClient.escapeString(zoneId.toString()));

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
    private com.squareup.okhttp.Call cacheRulesUpdateCacheRulesValidateBeforeCall(UpdateRuleset body, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling cacheRulesUpdateCacheRules(Async)");
        }
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling cacheRulesUpdateCacheRules(Async)");
        }
        
        com.squareup.okhttp.Call call = cacheRulesUpdateCacheRulesCall(body, zoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Cache Rules
     * Updates the Cache Rules of a zone.
     * @param body  (required)
     * @param zoneId  (required)
     * @return ApiResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponseSingle cacheRulesUpdateCacheRules(UpdateRuleset body, String zoneId) throws ApiException {
        ApiResponse<ApiResponseSingle> resp = cacheRulesUpdateCacheRulesWithHttpInfo(body, zoneId);
        return resp.getData();
    }

    /**
     * Update Cache Rules
     * Updates the Cache Rules of a zone.
     * @param body  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;ApiResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiResponseSingle> cacheRulesUpdateCacheRulesWithHttpInfo(UpdateRuleset body, String zoneId) throws ApiException {
        com.squareup.okhttp.Call call = cacheRulesUpdateCacheRulesValidateBeforeCall(body, zoneId, null, null);
        Type localVarReturnType = new TypeToken<ApiResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Cache Rules (asynchronously)
     * Updates the Cache Rules of a zone.
     * @param body  (required)
     * @param zoneId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cacheRulesUpdateCacheRulesAsync(UpdateRuleset body, String zoneId, final ApiCallback<ApiResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cacheRulesUpdateCacheRulesValidateBeforeCall(body, zoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApiResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}