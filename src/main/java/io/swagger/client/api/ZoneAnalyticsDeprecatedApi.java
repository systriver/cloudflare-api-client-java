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


import io.swagger.client.model.ColoResponse;
import io.swagger.client.model.DashboardResponse;
import io.swagger.client.model.InlineResponse4xx337;
import io.swagger.client.model.InlineResponse4xx338;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZoneAnalyticsDeprecatedApi {
    private ApiClient apiClient;

    public ZoneAnalyticsDeprecatedApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZoneAnalyticsDeprecatedApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for zoneAnalyticsDeprecatedGetAnalyticsByCoLocations
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/analytics/colos"
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
    private com.squareup.okhttp.Call zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsValidateBeforeCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling zoneAnalyticsDeprecatedGetAnalyticsByCoLocations(Async)");
        }
        
        com.squareup.okhttp.Call call = zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsCall(zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get analytics by Co-locations
     * This view provides a breakdown of analytics data by datacenter. Note: This is available to Enterprise customers only.
     * @param zoneIdentifier  (required)
     * @return ColoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ColoResponse zoneAnalyticsDeprecatedGetAnalyticsByCoLocations(String zoneIdentifier) throws ApiException {
        ApiResponse<ColoResponse> resp = zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsWithHttpInfo(zoneIdentifier);
        return resp.getData();
    }

    /**
     * Get analytics by Co-locations
     * This view provides a breakdown of analytics data by datacenter. Note: This is available to Enterprise customers only.
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;ColoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ColoResponse> zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsWithHttpInfo(String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsValidateBeforeCall(zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<ColoResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get analytics by Co-locations (asynchronously)
     * This view provides a breakdown of analytics data by datacenter. Note: This is available to Enterprise customers only.
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsAsync(String zoneIdentifier, final ApiCallback<ColoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zoneAnalyticsDeprecatedGetAnalyticsByCoLocationsValidateBeforeCall(zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ColoResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zoneAnalyticsDeprecatedGetDashboard
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zoneAnalyticsDeprecatedGetDashboardCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/analytics/dashboard"
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
    private com.squareup.okhttp.Call zoneAnalyticsDeprecatedGetDashboardValidateBeforeCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling zoneAnalyticsDeprecatedGetDashboard(Async)");
        }
        
        com.squareup.okhttp.Call call = zoneAnalyticsDeprecatedGetDashboardCall(zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get dashboard
     * The dashboard view provides both totals and timeseries data for the given zone and time period across the entire Cloudflare network.
     * @param zoneIdentifier  (required)
     * @return DashboardResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DashboardResponse zoneAnalyticsDeprecatedGetDashboard(String zoneIdentifier) throws ApiException {
        ApiResponse<DashboardResponse> resp = zoneAnalyticsDeprecatedGetDashboardWithHttpInfo(zoneIdentifier);
        return resp.getData();
    }

    /**
     * Get dashboard
     * The dashboard view provides both totals and timeseries data for the given zone and time period across the entire Cloudflare network.
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;DashboardResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DashboardResponse> zoneAnalyticsDeprecatedGetDashboardWithHttpInfo(String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = zoneAnalyticsDeprecatedGetDashboardValidateBeforeCall(zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<DashboardResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get dashboard (asynchronously)
     * The dashboard view provides both totals and timeseries data for the given zone and time period across the entire Cloudflare network.
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call zoneAnalyticsDeprecatedGetDashboardAsync(String zoneIdentifier, final ApiCallback<DashboardResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zoneAnalyticsDeprecatedGetDashboardValidateBeforeCall(zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DashboardResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
