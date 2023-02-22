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


import io.swagger.client.model.CloudflareClientAPIApiResponseSingleId;
import io.swagger.client.model.FilterNoId;
import io.swagger.client.model.FilterResponseCollection;
import io.swagger.client.model.FilterResponseSingle;
import io.swagger.client.model.InlineResponse4xx44;
import io.swagger.client.model.InlineResponse4xx514;
import io.swagger.client.model.InlineResponse4xx515;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerFiltersDeprecatedApi {
    private ApiClient apiClient;

    public WorkerFiltersDeprecatedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerFiltersDeprecatedApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for workerFiltersDeprecatedCreateFilter
     * @param body  (required)
     * @param zoneId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedCreateFilterCall(FilterNoId body, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/filters"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call workerFiltersDeprecatedCreateFilterValidateBeforeCall(FilterNoId body, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling workerFiltersDeprecatedCreateFilter(Async)");
        }
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedCreateFilter(Async)");
        }
        
        com.squareup.okhttp.Call call = workerFiltersDeprecatedCreateFilterCall(body, zoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Filter
     * 
     * @param body  (required)
     * @param zoneId  (required)
     * @return CloudflareClientAPIApiResponseSingleId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPIApiResponseSingleId workerFiltersDeprecatedCreateFilter(FilterNoId body, String zoneId) throws ApiException {
        ApiResponse<CloudflareClientAPIApiResponseSingleId> resp = workerFiltersDeprecatedCreateFilterWithHttpInfo(body, zoneId);
        return resp.getData();
    }

    /**
     * Create Filter
     * 
     * @param body  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;CloudflareClientAPIApiResponseSingleId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPIApiResponseSingleId> workerFiltersDeprecatedCreateFilterWithHttpInfo(FilterNoId body, String zoneId) throws ApiException {
        com.squareup.okhttp.Call call = workerFiltersDeprecatedCreateFilterValidateBeforeCall(body, zoneId, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIApiResponseSingleId>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Filter (asynchronously)
     * 
     * @param body  (required)
     * @param zoneId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedCreateFilterAsync(FilterNoId body, String zoneId, final ApiCallback<CloudflareClientAPIApiResponseSingleId> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workerFiltersDeprecatedCreateFilterValidateBeforeCall(body, zoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIApiResponseSingleId>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for workerFiltersDeprecatedDeleteFilter
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedDeleteFilterCall(String filterId, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/filters/{filter_id}"
            .replaceAll("\\{" + "filter_id" + "\\}", apiClient.escapeString(filterId.toString()))
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call workerFiltersDeprecatedDeleteFilterValidateBeforeCall(String filterId, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new ApiException("Missing the required parameter 'filterId' when calling workerFiltersDeprecatedDeleteFilter(Async)");
        }
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedDeleteFilter(Async)");
        }
        
        com.squareup.okhttp.Call call = workerFiltersDeprecatedDeleteFilterCall(filterId, zoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Filter
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @return CloudflareClientAPIApiResponseSingleId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPIApiResponseSingleId workerFiltersDeprecatedDeleteFilter(String filterId, String zoneId) throws ApiException {
        ApiResponse<CloudflareClientAPIApiResponseSingleId> resp = workerFiltersDeprecatedDeleteFilterWithHttpInfo(filterId, zoneId);
        return resp.getData();
    }

    /**
     * Delete Filter
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;CloudflareClientAPIApiResponseSingleId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPIApiResponseSingleId> workerFiltersDeprecatedDeleteFilterWithHttpInfo(String filterId, String zoneId) throws ApiException {
        com.squareup.okhttp.Call call = workerFiltersDeprecatedDeleteFilterValidateBeforeCall(filterId, zoneId, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIApiResponseSingleId>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Filter (asynchronously)
     * 
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedDeleteFilterAsync(String filterId, String zoneId, final ApiCallback<CloudflareClientAPIApiResponseSingleId> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workerFiltersDeprecatedDeleteFilterValidateBeforeCall(filterId, zoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIApiResponseSingleId>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for workerFiltersDeprecatedListFilters
     * @param zoneId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedListFiltersCall(String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/filters"
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
    private com.squareup.okhttp.Call workerFiltersDeprecatedListFiltersValidateBeforeCall(String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedListFilters(Async)");
        }
        
        com.squareup.okhttp.Call call = workerFiltersDeprecatedListFiltersCall(zoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Filters
     * 
     * @param zoneId  (required)
     * @return FilterResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilterResponseCollection workerFiltersDeprecatedListFilters(String zoneId) throws ApiException {
        ApiResponse<FilterResponseCollection> resp = workerFiltersDeprecatedListFiltersWithHttpInfo(zoneId);
        return resp.getData();
    }

    /**
     * List Filters
     * 
     * @param zoneId  (required)
     * @return ApiResponse&lt;FilterResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilterResponseCollection> workerFiltersDeprecatedListFiltersWithHttpInfo(String zoneId) throws ApiException {
        com.squareup.okhttp.Call call = workerFiltersDeprecatedListFiltersValidateBeforeCall(zoneId, null, null);
        Type localVarReturnType = new TypeToken<FilterResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Filters (asynchronously)
     * 
     * @param zoneId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedListFiltersAsync(String zoneId, final ApiCallback<FilterResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workerFiltersDeprecatedListFiltersValidateBeforeCall(zoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilterResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for workerFiltersDeprecatedUpdateFilter
     * @param body  (required)
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedUpdateFilterCall(FilterNoId body, String filterId, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_id}/workers/filters/{filter_id}"
            .replaceAll("\\{" + "filter_id" + "\\}", apiClient.escapeString(filterId.toString()))
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
    private com.squareup.okhttp.Call workerFiltersDeprecatedUpdateFilterValidateBeforeCall(FilterNoId body, String filterId, String zoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling workerFiltersDeprecatedUpdateFilter(Async)");
        }
        // verify the required parameter 'filterId' is set
        if (filterId == null) {
            throw new ApiException("Missing the required parameter 'filterId' when calling workerFiltersDeprecatedUpdateFilter(Async)");
        }
        // verify the required parameter 'zoneId' is set
        if (zoneId == null) {
            throw new ApiException("Missing the required parameter 'zoneId' when calling workerFiltersDeprecatedUpdateFilter(Async)");
        }
        
        com.squareup.okhttp.Call call = workerFiltersDeprecatedUpdateFilterCall(body, filterId, zoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Filter
     * 
     * @param body  (required)
     * @param filterId  (required)
     * @param zoneId  (required)
     * @return FilterResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilterResponseSingle workerFiltersDeprecatedUpdateFilter(FilterNoId body, String filterId, String zoneId) throws ApiException {
        ApiResponse<FilterResponseSingle> resp = workerFiltersDeprecatedUpdateFilterWithHttpInfo(body, filterId, zoneId);
        return resp.getData();
    }

    /**
     * Update Filter
     * 
     * @param body  (required)
     * @param filterId  (required)
     * @param zoneId  (required)
     * @return ApiResponse&lt;FilterResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilterResponseSingle> workerFiltersDeprecatedUpdateFilterWithHttpInfo(FilterNoId body, String filterId, String zoneId) throws ApiException {
        com.squareup.okhttp.Call call = workerFiltersDeprecatedUpdateFilterValidateBeforeCall(body, filterId, zoneId, null, null);
        Type localVarReturnType = new TypeToken<FilterResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Filter (asynchronously)
     * 
     * @param body  (required)
     * @param filterId  (required)
     * @param zoneId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workerFiltersDeprecatedUpdateFilterAsync(FilterNoId body, String filterId, String zoneId, final ApiCallback<FilterResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workerFiltersDeprecatedUpdateFilterValidateBeforeCall(body, filterId, zoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilterResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}