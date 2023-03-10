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


import io.swagger.client.model.CloudflareClientAPIDnsSecondarySecondaryZone;
import io.swagger.client.model.CloudflareClientAPIIdResponse;
import io.swagger.client.model.CloudflareClientAPISingleResponseIncoming;
import io.swagger.client.model.DnsSecondarySecondaryZoneComponentsSchemasIdentifier;
import io.swagger.client.model.ForceResponse;
import io.swagger.client.model.InlineResponse4xx326;
import io.swagger.client.model.InlineResponse4xx327;
import io.swagger.client.model.InlineResponse4xx328;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondaryDnsSecondaryZoneApi {
    private ApiClient apiClient;

    public SecondaryDnsSecondaryZoneApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecondaryDnsSecondaryZoneApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration
     * @param body  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationCall(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/secondary_dns/incoming"
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
    private com.squareup.okhttp.Call secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationValidateBeforeCall(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationCall(body, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Secondary Zone Configuration
     * Create secondary zone configuration for incoming zone transfers.
     * @param body  (required)
     * @param identifier  (required)
     * @return CloudflareClientAPISingleResponseIncoming
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPISingleResponseIncoming secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<CloudflareClientAPISingleResponseIncoming> resp = secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationWithHttpInfo(body, identifier);
        return resp.getData();
    }

    /**
     * Create Secondary Zone Configuration
     * Create secondary zone configuration for incoming zone transfers.
     * @param body  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;CloudflareClientAPISingleResponseIncoming&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPISingleResponseIncoming> secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationWithHttpInfo(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationValidateBeforeCall(body, identifier, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPISingleResponseIncoming>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Secondary Zone Configuration (asynchronously)
     * Create secondary zone configuration for incoming zone transfers.
     * @param body  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationAsync(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ApiCallback<CloudflareClientAPISingleResponseIncoming> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneCreateSecondaryZoneConfigurationValidateBeforeCall(body, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPISingleResponseIncoming>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationCall(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/secondary_dns/incoming"
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
    private com.squareup.okhttp.Call secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationValidateBeforeCall(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Secondary Zone Configuration
     * Delete secondary zone configuration for incoming zone transfers.
     * @param identifier  (required)
     * @return CloudflareClientAPIIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPIIdResponse secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<CloudflareClientAPIIdResponse> resp = secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Delete Secondary Zone Configuration
     * Delete secondary zone configuration for incoming zone transfers.
     * @param identifier  (required)
     * @return ApiResponse&lt;CloudflareClientAPIIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPIIdResponse> secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationWithHttpInfo(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete Secondary Zone Configuration (asynchronously)
     * Delete secondary zone configuration for incoming zone transfers.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationAsync(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ApiCallback<CloudflareClientAPIIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneDeleteSecondaryZoneConfigurationValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneForceAxfr
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneForceAxfrCall(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/secondary_dns/force_axfr"
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
    private com.squareup.okhttp.Call secondaryDnsSecondaryZoneForceAxfrValidateBeforeCall(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsSecondaryZoneForceAxfr(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneForceAxfrCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Force AXFR
     * Sends AXFR zone transfer request to primary nameserver(s).
     * @param identifier  (required)
     * @return ForceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ForceResponse secondaryDnsSecondaryZoneForceAxfr(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<ForceResponse> resp = secondaryDnsSecondaryZoneForceAxfrWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Force AXFR
     * Sends AXFR zone transfer request to primary nameserver(s).
     * @param identifier  (required)
     * @return ApiResponse&lt;ForceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ForceResponse> secondaryDnsSecondaryZoneForceAxfrWithHttpInfo(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneForceAxfrValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<ForceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Force AXFR (asynchronously)
     * Sends AXFR zone transfer request to primary nameserver(s).
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneForceAxfrAsync(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ApiCallback<ForceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneForceAxfrValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ForceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsCall(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/secondary_dns/incoming"
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
    private com.squareup.okhttp.Call secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsValidateBeforeCall(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Secondary Zone Configuration Details
     * Get secondary zone configuration for incoming zone transfers.
     * @param identifier  (required)
     * @return CloudflareClientAPISingleResponseIncoming
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPISingleResponseIncoming secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<CloudflareClientAPISingleResponseIncoming> resp = secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Secondary Zone Configuration Details
     * Get secondary zone configuration for incoming zone transfers.
     * @param identifier  (required)
     * @return ApiResponse&lt;CloudflareClientAPISingleResponseIncoming&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPISingleResponseIncoming> secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsWithHttpInfo(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPISingleResponseIncoming>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Secondary Zone Configuration Details (asynchronously)
     * Get secondary zone configuration for incoming zone transfers.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsAsync(DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ApiCallback<CloudflareClientAPISingleResponseIncoming> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetailsValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPISingleResponseIncoming>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration
     * @param body  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationCall(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/secondary_dns/incoming"
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
    private com.squareup.okhttp.Call secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationValidateBeforeCall(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationCall(body, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Secondary Zone Configuration
     * Update secondary zone configuration for incoming zone transfers.
     * @param body  (required)
     * @param identifier  (required)
     * @return CloudflareClientAPISingleResponseIncoming
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPISingleResponseIncoming secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        ApiResponse<CloudflareClientAPISingleResponseIncoming> resp = secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationWithHttpInfo(body, identifier);
        return resp.getData();
    }

    /**
     * Update Secondary Zone Configuration
     * Update secondary zone configuration for incoming zone transfers.
     * @param body  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;CloudflareClientAPISingleResponseIncoming&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPISingleResponseIncoming> secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationWithHttpInfo(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationValidateBeforeCall(body, identifier, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPISingleResponseIncoming>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Secondary Zone Configuration (asynchronously)
     * Update secondary zone configuration for incoming zone transfers.
     * @param body  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationAsync(CloudflareClientAPIDnsSecondarySecondaryZone body, DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier, final ApiCallback<CloudflareClientAPISingleResponseIncoming> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsSecondaryZoneUpdateSecondaryZoneConfigurationValidateBeforeCall(body, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPISingleResponseIncoming>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
