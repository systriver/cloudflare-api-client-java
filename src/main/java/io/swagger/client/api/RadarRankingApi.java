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


import io.swagger.client.model.InlineResponse20095;
import io.swagger.client.model.InlineResponse20096;
import io.swagger.client.model.InlineResponse20097;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadarRankingApi {
    private ApiClient apiClient;

    public RadarRankingApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RadarRankingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for radarGetRankingDetails
     * @param domain  (required)
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call radarGetRankingDetailsCall(String domain, Integer limit, List<String> name, List<LocalDate> date, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/radar/ranking/domain/{domain}"
            .replaceAll("\\{" + "domain" + "\\}", apiClient.escapeString(domain.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (name != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "name", name));
        if (date != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "date", date));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));

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
    private com.squareup.okhttp.Call radarGetRankingDetailsValidateBeforeCall(String domain, Integer limit, List<String> name, List<LocalDate> date, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling radarGetRankingDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = radarGetRankingDetailsCall(domain, limit, name, date, format, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Domains Rank details
     * Gets Domains Rank details.
     * @param domain  (required)
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @return InlineResponse20095
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20095 radarGetRankingDetails(String domain, Integer limit, List<String> name, List<LocalDate> date, String format) throws ApiException {
        ApiResponse<InlineResponse20095> resp = radarGetRankingDetailsWithHttpInfo(domain, limit, name, date, format);
        return resp.getData();
    }

    /**
     * Get Domains Rank details
     * Gets Domains Rank details.
     * @param domain  (required)
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @return ApiResponse&lt;InlineResponse20095&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20095> radarGetRankingDetailsWithHttpInfo(String domain, Integer limit, List<String> name, List<LocalDate> date, String format) throws ApiException {
        com.squareup.okhttp.Call call = radarGetRankingDetailsValidateBeforeCall(domain, limit, name, date, format, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20095>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Domains Rank details (asynchronously)
     * Gets Domains Rank details.
     * @param domain  (required)
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call radarGetRankingDetailsAsync(String domain, Integer limit, List<String> name, List<LocalDate> date, String format, final ApiCallback<InlineResponse20095> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = radarGetRankingDetailsValidateBeforeCall(domain, limit, name, date, format, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20095>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for radarGetRankingTimeseries
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param domains Array of comma separated list of domains names. (optional)
     * @param dateRange For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). (optional)
     * @param dateStart Array of datetimes to filter the start of a series. (optional)
     * @param dateEnd Array of datetimes to filter the end of a series. (optional)
     * @param format Format results are returned in. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call radarGetRankingTimeseriesCall(Integer limit, List<String> name, List<String> location, List<String> domains, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/radar/ranking/timeseries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (name != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "name", name));
        if (location != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "location", location));
        if (domains != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "domains", domains));
        if (dateRange != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "dateRange", dateRange));
        if (dateStart != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "dateStart", dateStart));
        if (dateEnd != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "dateEnd", dateEnd));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));

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
    private com.squareup.okhttp.Call radarGetRankingTimeseriesValidateBeforeCall(Integer limit, List<String> name, List<String> location, List<String> domains, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = radarGetRankingTimeseriesCall(limit, name, location, domains, dateRange, dateStart, dateEnd, format, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Domains Rank time series
     * Gets Domains Rank updates change over time. Raw values are returned.
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param domains Array of comma separated list of domains names. (optional)
     * @param dateRange For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). (optional)
     * @param dateStart Array of datetimes to filter the start of a series. (optional)
     * @param dateEnd Array of datetimes to filter the end of a series. (optional)
     * @param format Format results are returned in. (optional)
     * @return InlineResponse20096
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20096 radarGetRankingTimeseries(Integer limit, List<String> name, List<String> location, List<String> domains, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, String format) throws ApiException {
        ApiResponse<InlineResponse20096> resp = radarGetRankingTimeseriesWithHttpInfo(limit, name, location, domains, dateRange, dateStart, dateEnd, format);
        return resp.getData();
    }

    /**
     * Get Domains Rank time series
     * Gets Domains Rank updates change over time. Raw values are returned.
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param domains Array of comma separated list of domains names. (optional)
     * @param dateRange For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). (optional)
     * @param dateStart Array of datetimes to filter the start of a series. (optional)
     * @param dateEnd Array of datetimes to filter the end of a series. (optional)
     * @param format Format results are returned in. (optional)
     * @return ApiResponse&lt;InlineResponse20096&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20096> radarGetRankingTimeseriesWithHttpInfo(Integer limit, List<String> name, List<String> location, List<String> domains, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, String format) throws ApiException {
        com.squareup.okhttp.Call call = radarGetRankingTimeseriesValidateBeforeCall(limit, name, location, domains, dateRange, dateStart, dateEnd, format, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20096>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Domains Rank time series (asynchronously)
     * Gets Domains Rank updates change over time. Raw values are returned.
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param domains Array of comma separated list of domains names. (optional)
     * @param dateRange For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). (optional)
     * @param dateStart Array of datetimes to filter the start of a series. (optional)
     * @param dateEnd Array of datetimes to filter the end of a series. (optional)
     * @param format Format results are returned in. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call radarGetRankingTimeseriesAsync(Integer limit, List<String> name, List<String> location, List<String> domains, List<String> dateRange, List<OffsetDateTime> dateStart, List<OffsetDateTime> dateEnd, String format, final ApiCallback<InlineResponse20096> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = radarGetRankingTimeseriesValidateBeforeCall(limit, name, location, domains, dateRange, dateStart, dateEnd, format, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20096>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for radarGetRankingTop
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call radarGetRankingTopCall(Integer limit, List<String> name, List<String> location, List<LocalDate> date, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/radar/ranking/top";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (name != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "name", name));
        if (location != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "location", location));
        if (date != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "date", date));
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));

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
    private com.squareup.okhttp.Call radarGetRankingTopValidateBeforeCall(Integer limit, List<String> name, List<String> location, List<LocalDate> date, String format, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = radarGetRankingTopCall(limit, name, location, date, format, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Domains Rank top
     * Gets Top Domains Rank globally or by country.
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @return InlineResponse20097
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20097 radarGetRankingTop(Integer limit, List<String> name, List<String> location, List<LocalDate> date, String format) throws ApiException {
        ApiResponse<InlineResponse20097> resp = radarGetRankingTopWithHttpInfo(limit, name, location, date, format);
        return resp.getData();
    }

    /**
     * Get Domains Rank top
     * Gets Top Domains Rank globally or by country.
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @return ApiResponse&lt;InlineResponse20097&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20097> radarGetRankingTopWithHttpInfo(Integer limit, List<String> name, List<String> location, List<LocalDate> date, String format) throws ApiException {
        com.squareup.okhttp.Call call = radarGetRankingTopValidateBeforeCall(limit, name, location, date, format, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20097>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Domains Rank top (asynchronously)
     * Gets Top Domains Rank globally or by country.
     * @param limit Limit the number of objects in the response. (optional, default to 5)
     * @param name Array of names that will be used to name the series in responses. (optional)
     * @param location Array of locations (alpha-2 country codes). (optional)
     * @param date Array of dates to filter the ranking. (optional)
     * @param format Format results are returned in. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call radarGetRankingTopAsync(Integer limit, List<String> name, List<String> location, List<LocalDate> date, String format, final ApiCallback<InlineResponse20097> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = radarGetRankingTopValidateBeforeCall(limit, name, location, date, format, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20097>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
