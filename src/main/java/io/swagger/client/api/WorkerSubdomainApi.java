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


import io.swagger.client.model.InlineResponse4xx194;
import io.swagger.client.model.SubdomainResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerSubdomainApi {
    private ApiClient apiClient;

    public WorkerSubdomainApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkerSubdomainApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for workerSubdomainCreateSubdomain
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workerSubdomainCreateSubdomainCall(Object body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/workers/subdomain"
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
    private com.squareup.okhttp.Call workerSubdomainCreateSubdomainValidateBeforeCall(Object body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling workerSubdomainCreateSubdomain(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling workerSubdomainCreateSubdomain(Async)");
        }
        
        com.squareup.okhttp.Call call = workerSubdomainCreateSubdomainCall(body, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Subdomain
     * Creates a Workers subdomain for an account.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return SubdomainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubdomainResponse workerSubdomainCreateSubdomain(Object body, String accountIdentifier) throws ApiException {
        ApiResponse<SubdomainResponse> resp = workerSubdomainCreateSubdomainWithHttpInfo(body, accountIdentifier);
        return resp.getData();
    }

    /**
     * Create Subdomain
     * Creates a Workers subdomain for an account.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;SubdomainResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubdomainResponse> workerSubdomainCreateSubdomainWithHttpInfo(Object body, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = workerSubdomainCreateSubdomainValidateBeforeCall(body, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SubdomainResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Subdomain (asynchronously)
     * Creates a Workers subdomain for an account.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workerSubdomainCreateSubdomainAsync(Object body, String accountIdentifier, final ApiCallback<SubdomainResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workerSubdomainCreateSubdomainValidateBeforeCall(body, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubdomainResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for workerSubdomainGetSubdomain
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call workerSubdomainGetSubdomainCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/workers/subdomain"
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
    private com.squareup.okhttp.Call workerSubdomainGetSubdomainValidateBeforeCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling workerSubdomainGetSubdomain(Async)");
        }
        
        com.squareup.okhttp.Call call = workerSubdomainGetSubdomainCall(accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Subdomain
     * Returns a Workers subdomain for an account.
     * @param accountIdentifier  (required)
     * @return SubdomainResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SubdomainResponse workerSubdomainGetSubdomain(String accountIdentifier) throws ApiException {
        ApiResponse<SubdomainResponse> resp = workerSubdomainGetSubdomainWithHttpInfo(accountIdentifier);
        return resp.getData();
    }

    /**
     * Get Subdomain
     * Returns a Workers subdomain for an account.
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;SubdomainResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SubdomainResponse> workerSubdomainGetSubdomainWithHttpInfo(String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = workerSubdomainGetSubdomainValidateBeforeCall(accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SubdomainResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Subdomain (asynchronously)
     * Returns a Workers subdomain for an account.
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call workerSubdomainGetSubdomainAsync(String accountIdentifier, final ApiCallback<SubdomainResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = workerSubdomainGetSubdomainValidateBeforeCall(accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SubdomainResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
