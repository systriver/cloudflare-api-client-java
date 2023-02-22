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


import io.swagger.client.model.CustomPagesComponentsSchemasIdentifier;
import io.swagger.client.model.CustomPagesIdentifierBody1;
import io.swagger.client.model.CustomPagesResponseCollection;
import io.swagger.client.model.CustomPagesResponseSingle;
import io.swagger.client.model.InlineResponse4xx23;
import io.swagger.client.model.InlineResponse4xx24;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomPagesForAZoneApi {
    private ApiClient apiClient;

    public CustomPagesForAZoneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomPagesForAZoneApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for customPagesForAZoneGetACustomPage
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call customPagesForAZoneGetACustomPageCall(CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/custom_pages/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
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
    private com.squareup.okhttp.Call customPagesForAZoneGetACustomPageValidateBeforeCall(CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling customPagesForAZoneGetACustomPage(Async)");
        }
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling customPagesForAZoneGetACustomPage(Async)");
        }
        
        com.squareup.okhttp.Call call = customPagesForAZoneGetACustomPageCall(identifier, zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a custom page
     * Fetches the details of a custom page.
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @return CustomPagesResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomPagesResponseSingle customPagesForAZoneGetACustomPage(CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier) throws ApiException {
        ApiResponse<CustomPagesResponseSingle> resp = customPagesForAZoneGetACustomPageWithHttpInfo(identifier, zoneIdentifier);
        return resp.getData();
    }

    /**
     * Get a custom page
     * Fetches the details of a custom page.
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;CustomPagesResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomPagesResponseSingle> customPagesForAZoneGetACustomPageWithHttpInfo(CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = customPagesForAZoneGetACustomPageValidateBeforeCall(identifier, zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<CustomPagesResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a custom page (asynchronously)
     * Fetches the details of a custom page.
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customPagesForAZoneGetACustomPageAsync(CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier, final ApiCallback<CustomPagesResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = customPagesForAZoneGetACustomPageValidateBeforeCall(identifier, zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomPagesResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for customPagesForAZoneListCustomPages
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call customPagesForAZoneListCustomPagesCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/custom_pages"
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
    private com.squareup.okhttp.Call customPagesForAZoneListCustomPagesValidateBeforeCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling customPagesForAZoneListCustomPages(Async)");
        }
        
        com.squareup.okhttp.Call call = customPagesForAZoneListCustomPagesCall(zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List custom pages
     * Fetches all the custom pages at the zone level.
     * @param zoneIdentifier  (required)
     * @return CustomPagesResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomPagesResponseCollection customPagesForAZoneListCustomPages(String zoneIdentifier) throws ApiException {
        ApiResponse<CustomPagesResponseCollection> resp = customPagesForAZoneListCustomPagesWithHttpInfo(zoneIdentifier);
        return resp.getData();
    }

    /**
     * List custom pages
     * Fetches all the custom pages at the zone level.
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;CustomPagesResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomPagesResponseCollection> customPagesForAZoneListCustomPagesWithHttpInfo(String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = customPagesForAZoneListCustomPagesValidateBeforeCall(zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<CustomPagesResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List custom pages (asynchronously)
     * Fetches all the custom pages at the zone level.
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customPagesForAZoneListCustomPagesAsync(String zoneIdentifier, final ApiCallback<CustomPagesResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = customPagesForAZoneListCustomPagesValidateBeforeCall(zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomPagesResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for customPagesForAZoneUpdateACustomPage
     * @param body  (required)
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call customPagesForAZoneUpdateACustomPageCall(CustomPagesIdentifierBody1 body, CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/custom_pages/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
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
    private com.squareup.okhttp.Call customPagesForAZoneUpdateACustomPageValidateBeforeCall(CustomPagesIdentifierBody1 body, CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling customPagesForAZoneUpdateACustomPage(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling customPagesForAZoneUpdateACustomPage(Async)");
        }
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling customPagesForAZoneUpdateACustomPage(Async)");
        }
        
        com.squareup.okhttp.Call call = customPagesForAZoneUpdateACustomPageCall(body, identifier, zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a custom page
     * Updates the configuration of an existing custom page.
     * @param body  (required)
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @return CustomPagesResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomPagesResponseSingle customPagesForAZoneUpdateACustomPage(CustomPagesIdentifierBody1 body, CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier) throws ApiException {
        ApiResponse<CustomPagesResponseSingle> resp = customPagesForAZoneUpdateACustomPageWithHttpInfo(body, identifier, zoneIdentifier);
        return resp.getData();
    }

    /**
     * Update a custom page
     * Updates the configuration of an existing custom page.
     * @param body  (required)
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;CustomPagesResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomPagesResponseSingle> customPagesForAZoneUpdateACustomPageWithHttpInfo(CustomPagesIdentifierBody1 body, CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = customPagesForAZoneUpdateACustomPageValidateBeforeCall(body, identifier, zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<CustomPagesResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a custom page (asynchronously)
     * Updates the configuration of an existing custom page.
     * @param body  (required)
     * @param identifier  (required)
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call customPagesForAZoneUpdateACustomPageAsync(CustomPagesIdentifierBody1 body, CustomPagesComponentsSchemasIdentifier identifier, String zoneIdentifier, final ApiCallback<CustomPagesResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = customPagesForAZoneUpdateACustomPageValidateBeforeCall(body, identifier, zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomPagesResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}