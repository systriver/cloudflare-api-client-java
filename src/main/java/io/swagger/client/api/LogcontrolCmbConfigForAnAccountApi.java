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


import io.swagger.client.model.CmbConfig;
import io.swagger.client.model.CmbConfigResponseSingle;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.InlineResponse4xx80;
import io.swagger.client.model.InlineResponse4xx85;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogcontrolCmbConfigForAnAccountApi {
    private ApiClient apiClient;

    public LogcontrolCmbConfigForAnAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogcontrolCmbConfigForAnAccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteAccountsAccountIdentifierLogsControlCmbConfig
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAccountsAccountIdentifierLogsControlCmbConfigCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/logs/control/cmb/config"
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling deleteAccountsAccountIdentifierLogsControlCmbConfig(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteAccountsAccountIdentifierLogsControlCmbConfigCall(accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete CMB config
     * Deletes CMB config.
     * @param accountIdentifier  (required)
     * @return InlineResponse2004
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2004 deleteAccountsAccountIdentifierLogsControlCmbConfig(String accountIdentifier) throws ApiException {
        ApiResponse<InlineResponse2004> resp = deleteAccountsAccountIdentifierLogsControlCmbConfigWithHttpInfo(accountIdentifier);
        return resp.getData();
    }

    /**
     * Delete CMB config
     * Deletes CMB config.
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;InlineResponse2004&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2004> deleteAccountsAccountIdentifierLogsControlCmbConfigWithHttpInfo(String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete CMB config (asynchronously)
     * Deletes CMB config.
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccountsAccountIdentifierLogsControlCmbConfigAsync(String accountIdentifier, final ApiCallback<InlineResponse2004> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2004>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAccountsAccountIdentifierLogsControlCmbConfig
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccountsAccountIdentifierLogsControlCmbConfigCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/logs/control/cmb/config"
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
    private com.squareup.okhttp.Call getAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling getAccountsAccountIdentifierLogsControlCmbConfig(Async)");
        }
        
        com.squareup.okhttp.Call call = getAccountsAccountIdentifierLogsControlCmbConfigCall(accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get CMB config
     * Gets CMB config.
     * @param accountIdentifier  (required)
     * @return CmbConfigResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CmbConfigResponseSingle getAccountsAccountIdentifierLogsControlCmbConfig(String accountIdentifier) throws ApiException {
        ApiResponse<CmbConfigResponseSingle> resp = getAccountsAccountIdentifierLogsControlCmbConfigWithHttpInfo(accountIdentifier);
        return resp.getData();
    }

    /**
     * Get CMB config
     * Gets CMB config.
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;CmbConfigResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CmbConfigResponseSingle> getAccountsAccountIdentifierLogsControlCmbConfigWithHttpInfo(String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = getAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<CmbConfigResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get CMB config (asynchronously)
     * Gets CMB config.
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountsAccountIdentifierLogsControlCmbConfigAsync(String accountIdentifier, final ApiCallback<CmbConfigResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CmbConfigResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putAccountsAccountIdentifierLogsControlCmbConfig
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putAccountsAccountIdentifierLogsControlCmbConfigCall(CmbConfig body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/logs/control/cmb/config"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call putAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(CmbConfig body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling putAccountsAccountIdentifierLogsControlCmbConfig(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling putAccountsAccountIdentifierLogsControlCmbConfig(Async)");
        }
        
        com.squareup.okhttp.Call call = putAccountsAccountIdentifierLogsControlCmbConfigCall(body, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update CMB config
     * Updates CMB config.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return CmbConfigResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CmbConfigResponseSingle putAccountsAccountIdentifierLogsControlCmbConfig(CmbConfig body, String accountIdentifier) throws ApiException {
        ApiResponse<CmbConfigResponseSingle> resp = putAccountsAccountIdentifierLogsControlCmbConfigWithHttpInfo(body, accountIdentifier);
        return resp.getData();
    }

    /**
     * Update CMB config
     * Updates CMB config.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;CmbConfigResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CmbConfigResponseSingle> putAccountsAccountIdentifierLogsControlCmbConfigWithHttpInfo(CmbConfig body, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = putAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(body, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<CmbConfigResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update CMB config (asynchronously)
     * Updates CMB config.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putAccountsAccountIdentifierLogsControlCmbConfigAsync(CmbConfig body, String accountIdentifier, final ApiCallback<CmbConfigResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putAccountsAccountIdentifierLogsControlCmbConfigValidateBeforeCall(body, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CmbConfigResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
