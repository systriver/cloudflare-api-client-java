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


import io.swagger.client.model.InlineResponse4xx339;
import io.swagger.client.model.SchemasResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArgoAnalyticsForZoneApi {
    private ApiClient apiClient;

    public ArgoAnalyticsForZoneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ArgoAnalyticsForZoneApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for argoAnalyticsForZoneArgoAnalyticsForAZone
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call argoAnalyticsForZoneArgoAnalyticsForAZoneCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/analytics/latency"
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
    private com.squareup.okhttp.Call argoAnalyticsForZoneArgoAnalyticsForAZoneValidateBeforeCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling argoAnalyticsForZoneArgoAnalyticsForAZone(Async)");
        }
        
        com.squareup.okhttp.Call call = argoAnalyticsForZoneArgoAnalyticsForAZoneCall(zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Argo Analytics for a zone
     * 
     * @param zoneIdentifier  (required)
     * @return SchemasResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SchemasResponseSingle argoAnalyticsForZoneArgoAnalyticsForAZone(String zoneIdentifier) throws ApiException {
        ApiResponse<SchemasResponseSingle> resp = argoAnalyticsForZoneArgoAnalyticsForAZoneWithHttpInfo(zoneIdentifier);
        return resp.getData();
    }

    /**
     * Argo Analytics for a zone
     * 
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;SchemasResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SchemasResponseSingle> argoAnalyticsForZoneArgoAnalyticsForAZoneWithHttpInfo(String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = argoAnalyticsForZoneArgoAnalyticsForAZoneValidateBeforeCall(zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SchemasResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Argo Analytics for a zone (asynchronously)
     * 
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call argoAnalyticsForZoneArgoAnalyticsForAZoneAsync(String zoneIdentifier, final ApiCallback<SchemasResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = argoAnalyticsForZoneArgoAnalyticsForAZoneValidateBeforeCall(zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SchemasResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
