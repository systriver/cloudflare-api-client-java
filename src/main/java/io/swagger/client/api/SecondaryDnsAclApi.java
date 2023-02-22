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


import io.swagger.client.model.AclComponentsSchemasIdResponse;
import io.swagger.client.model.AclComponentsSchemasIdentifier;
import io.swagger.client.model.AclComponentsSchemasResponseCollection;
import io.swagger.client.model.AclComponentsSchemasSingleResponse;
import io.swagger.client.model.CloudflareClientAPIAcl;
import io.swagger.client.model.InlineResponse4xx145;
import io.swagger.client.model.InlineResponse4xx146;
import io.swagger.client.model.InlineResponse4xx147;
import io.swagger.client.model.SchemasAccountIdentifier;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondaryDnsAclApi {
    private ApiClient apiClient;

    public SecondaryDnsAclApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecondaryDnsAclApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for secondaryDnsAclAclDetails
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclAclDetailsCall(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/secondary_dns/acls/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
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
    private com.squareup.okhttp.Call secondaryDnsAclAclDetailsValidateBeforeCall(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsAclAclDetails(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling secondaryDnsAclAclDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsAclAclDetailsCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * ACL Details
     * Get ACL.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return AclComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AclComponentsSchemasSingleResponse secondaryDnsAclAclDetails(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        ApiResponse<AclComponentsSchemasSingleResponse> resp = secondaryDnsAclAclDetailsWithHttpInfo(identifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * ACL Details
     * Get ACL.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AclComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AclComponentsSchemasSingleResponse> secondaryDnsAclAclDetailsWithHttpInfo(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsAclAclDetailsValidateBeforeCall(identifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * ACL Details (asynchronously)
     * Get ACL.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclAclDetailsAsync(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ApiCallback<AclComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsAclAclDetailsValidateBeforeCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsAclCreateAcl
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclCreateAclCall(Object body, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/secondary_dns/acls"
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
    private com.squareup.okhttp.Call secondaryDnsAclCreateAclValidateBeforeCall(Object body, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling secondaryDnsAclCreateAcl(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling secondaryDnsAclCreateAcl(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsAclCreateAclCall(body, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create ACL
     * Create ACL.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return AclComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AclComponentsSchemasSingleResponse secondaryDnsAclCreateAcl(Object body, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        ApiResponse<AclComponentsSchemasSingleResponse> resp = secondaryDnsAclCreateAclWithHttpInfo(body, accountIdentifier);
        return resp.getData();
    }

    /**
     * Create ACL
     * Create ACL.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AclComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AclComponentsSchemasSingleResponse> secondaryDnsAclCreateAclWithHttpInfo(Object body, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsAclCreateAclValidateBeforeCall(body, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create ACL (asynchronously)
     * Create ACL.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclCreateAclAsync(Object body, SchemasAccountIdentifier accountIdentifier, final ApiCallback<AclComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsAclCreateAclValidateBeforeCall(body, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsAclDeleteAcl
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclDeleteAclCall(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/secondary_dns/acls/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
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
    private com.squareup.okhttp.Call secondaryDnsAclDeleteAclValidateBeforeCall(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsAclDeleteAcl(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling secondaryDnsAclDeleteAcl(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsAclDeleteAclCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete ACL
     * Delete ACL.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return AclComponentsSchemasIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AclComponentsSchemasIdResponse secondaryDnsAclDeleteAcl(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        ApiResponse<AclComponentsSchemasIdResponse> resp = secondaryDnsAclDeleteAclWithHttpInfo(identifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * Delete ACL
     * Delete ACL.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AclComponentsSchemasIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AclComponentsSchemasIdResponse> secondaryDnsAclDeleteAclWithHttpInfo(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsAclDeleteAclValidateBeforeCall(identifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete ACL (asynchronously)
     * Delete ACL.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclDeleteAclAsync(AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ApiCallback<AclComponentsSchemasIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsAclDeleteAclValidateBeforeCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsAclListAcLs
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclListAcLsCall(SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/secondary_dns/acls"
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
    private com.squareup.okhttp.Call secondaryDnsAclListAcLsValidateBeforeCall(SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling secondaryDnsAclListAcLs(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsAclListAcLsCall(accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List ACLs
     * List ACLs.
     * @param accountIdentifier  (required)
     * @return AclComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AclComponentsSchemasResponseCollection secondaryDnsAclListAcLs(SchemasAccountIdentifier accountIdentifier) throws ApiException {
        ApiResponse<AclComponentsSchemasResponseCollection> resp = secondaryDnsAclListAcLsWithHttpInfo(accountIdentifier);
        return resp.getData();
    }

    /**
     * List ACLs
     * List ACLs.
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AclComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AclComponentsSchemasResponseCollection> secondaryDnsAclListAcLsWithHttpInfo(SchemasAccountIdentifier accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsAclListAcLsValidateBeforeCall(accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List ACLs (asynchronously)
     * List ACLs.
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclListAcLsAsync(SchemasAccountIdentifier accountIdentifier, final ApiCallback<AclComponentsSchemasResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsAclListAcLsValidateBeforeCall(accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for secondaryDnsAclUpdateAcl
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclUpdateAclCall(CloudflareClientAPIAcl body, AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/secondary_dns/acls/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
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
    private com.squareup.okhttp.Call secondaryDnsAclUpdateAclValidateBeforeCall(CloudflareClientAPIAcl body, AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling secondaryDnsAclUpdateAcl(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling secondaryDnsAclUpdateAcl(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling secondaryDnsAclUpdateAcl(Async)");
        }
        
        com.squareup.okhttp.Call call = secondaryDnsAclUpdateAclCall(body, identifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update ACL
     * Modify ACL.
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return AclComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AclComponentsSchemasSingleResponse secondaryDnsAclUpdateAcl(CloudflareClientAPIAcl body, AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        ApiResponse<AclComponentsSchemasSingleResponse> resp = secondaryDnsAclUpdateAclWithHttpInfo(body, identifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * Update ACL
     * Modify ACL.
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;AclComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AclComponentsSchemasSingleResponse> secondaryDnsAclUpdateAclWithHttpInfo(CloudflareClientAPIAcl body, AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = secondaryDnsAclUpdateAclValidateBeforeCall(body, identifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update ACL (asynchronously)
     * Modify ACL.
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call secondaryDnsAclUpdateAclAsync(CloudflareClientAPIAcl body, AclComponentsSchemasIdentifier identifier, SchemasAccountIdentifier accountIdentifier, final ApiCallback<AclComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = secondaryDnsAclUpdateAclValidateBeforeCall(body, identifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AclComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}