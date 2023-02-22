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


import io.swagger.client.model.AsnComponentsSchemasAsn;
import io.swagger.client.model.AsnComponentsSchemasResponse;
import io.swagger.client.model.InlineResponse2002;
import io.swagger.client.model.InlineResponse4xx54;
import io.swagger.client.model.InlineResponse4xx55;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AsnIntelligenceApi {
    private ApiClient apiClient;

    public AsnIntelligenceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AsnIntelligenceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for asnIntelligenceGetAsnOverview
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call asnIntelligenceGetAsnOverviewCall(AsnComponentsSchemasAsn asn, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/intel/asn/{asn}"
            .replaceAll("\\{" + "asn" + "\\}", apiClient.escapeString(asn.toString()))
            .replaceAll("\\{" + "account_identifier" + "\\}", apiClient.escapeString(accountIdentifier.toString()));

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
    private com.squareup.okhttp.Call asnIntelligenceGetAsnOverviewValidateBeforeCall(AsnComponentsSchemasAsn asn, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'asn' is set
        if (asn == null) {
            throw new ApiException("Missing the required parameter 'asn' when calling asnIntelligenceGetAsnOverview(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling asnIntelligenceGetAsnOverview(Async)");
        }
        
        com.squareup.okhttp.Call call = asnIntelligenceGetAsnOverviewCall(asn, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get ASN Overview
     * 
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @return AsnComponentsSchemasResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AsnComponentsSchemasResponse asnIntelligenceGetAsnOverview(AsnComponentsSchemasAsn asn, String accountIdentifier) throws ApiException {
        ApiResponse<AsnComponentsSchemasResponse> resp = asnIntelligenceGetAsnOverviewWithHttpInfo(asn, accountIdentifier);
        return resp.getData();
    }

    /**
     * Get ASN Overview
     * 
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AsnComponentsSchemasResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AsnComponentsSchemasResponse> asnIntelligenceGetAsnOverviewWithHttpInfo(AsnComponentsSchemasAsn asn, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = asnIntelligenceGetAsnOverviewValidateBeforeCall(asn, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AsnComponentsSchemasResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get ASN Overview (asynchronously)
     * 
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call asnIntelligenceGetAsnOverviewAsync(AsnComponentsSchemasAsn asn, String accountIdentifier, final ApiCallback<AsnComponentsSchemasResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = asnIntelligenceGetAsnOverviewValidateBeforeCall(asn, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AsnComponentsSchemasResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for asnIntelligenceGetAsnSubnets
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call asnIntelligenceGetAsnSubnetsCall(AsnComponentsSchemasAsn asn, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/intel/asn/{asn}/subnets"
            .replaceAll("\\{" + "asn" + "\\}", apiClient.escapeString(asn.toString()))
            .replaceAll("\\{" + "account_identifier" + "\\}", apiClient.escapeString(accountIdentifier.toString()));

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
    private com.squareup.okhttp.Call asnIntelligenceGetAsnSubnetsValidateBeforeCall(AsnComponentsSchemasAsn asn, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'asn' is set
        if (asn == null) {
            throw new ApiException("Missing the required parameter 'asn' when calling asnIntelligenceGetAsnSubnets(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling asnIntelligenceGetAsnSubnets(Async)");
        }
        
        com.squareup.okhttp.Call call = asnIntelligenceGetAsnSubnetsCall(asn, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get ASN Subnets
     * 
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @return InlineResponse2002
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2002 asnIntelligenceGetAsnSubnets(AsnComponentsSchemasAsn asn, String accountIdentifier) throws ApiException {
        ApiResponse<InlineResponse2002> resp = asnIntelligenceGetAsnSubnetsWithHttpInfo(asn, accountIdentifier);
        return resp.getData();
    }

    /**
     * Get ASN Subnets
     * 
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;InlineResponse2002&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2002> asnIntelligenceGetAsnSubnetsWithHttpInfo(AsnComponentsSchemasAsn asn, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = asnIntelligenceGetAsnSubnetsValidateBeforeCall(asn, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get ASN Subnets (asynchronously)
     * 
     * @param asn  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call asnIntelligenceGetAsnSubnetsAsync(AsnComponentsSchemasAsn asn, String accountIdentifier, final ApiCallback<InlineResponse2002> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = asnIntelligenceGetAsnSubnetsValidateBeforeCall(asn, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2002>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
