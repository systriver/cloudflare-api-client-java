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


import io.swagger.client.model.AccessGroupsBody;
import io.swagger.client.model.GroupsComponentsSchemasIdResponse;
import io.swagger.client.model.GroupsComponentsSchemasResponseCollection;
import io.swagger.client.model.GroupsComponentsSchemasSingleResponse;
import io.swagger.client.model.GroupsUuidBody;
import io.swagger.client.model.InlineResponse4xx216;
import io.swagger.client.model.InlineResponse4xx217;
import io.swagger.client.model.InlineResponse4xx218;
import io.swagger.client.model.SchemasUuid;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessGroupsApi {
    private ApiClient apiClient;

    public AccessGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for accessGroupsCreateAnAccessGroup
     * @param body  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessGroupsCreateAnAccessGroupCall(AccessGroupsBody body, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups"
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
    private com.squareup.okhttp.Call accessGroupsCreateAnAccessGroupValidateBeforeCall(AccessGroupsBody body, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling accessGroupsCreateAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsCreateAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = accessGroupsCreateAnAccessGroupCall(body, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create an Access group
     * Creates a new Access group.
     * @param body  (required)
     * @param identifier  (required)
     * @return GroupsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupsComponentsSchemasSingleResponse accessGroupsCreateAnAccessGroup(AccessGroupsBody body, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasSingleResponse> resp = accessGroupsCreateAnAccessGroupWithHttpInfo(body, identifier);
        return resp.getData();
    }

    /**
     * Create an Access group
     * Creates a new Access group.
     * @param body  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;GroupsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupsComponentsSchemasSingleResponse> accessGroupsCreateAnAccessGroupWithHttpInfo(AccessGroupsBody body, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessGroupsCreateAnAccessGroupValidateBeforeCall(body, identifier, null, null);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an Access group (asynchronously)
     * Creates a new Access group.
     * @param body  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessGroupsCreateAnAccessGroupAsync(AccessGroupsBody body, String identifier, final ApiCallback<GroupsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessGroupsCreateAnAccessGroupValidateBeforeCall(body, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessGroupsDeleteAnAccessGroup
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessGroupsDeleteAnAccessGroupCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
    private com.squareup.okhttp.Call accessGroupsDeleteAnAccessGroupValidateBeforeCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessGroupsDeleteAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsDeleteAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = accessGroupsDeleteAnAccessGroupCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete an Access group
     * Deletes an Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return GroupsComponentsSchemasIdResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupsComponentsSchemasIdResponse accessGroupsDeleteAnAccessGroup(SchemasUuid uuid, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasIdResponse> resp = accessGroupsDeleteAnAccessGroupWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Delete an Access group
     * Deletes an Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;GroupsComponentsSchemasIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupsComponentsSchemasIdResponse> accessGroupsDeleteAnAccessGroupWithHttpInfo(SchemasUuid uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessGroupsDeleteAnAccessGroupValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasIdResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an Access group (asynchronously)
     * Deletes an Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessGroupsDeleteAnAccessGroupAsync(SchemasUuid uuid, String identifier, final ApiCallback<GroupsComponentsSchemasIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessGroupsDeleteAnAccessGroupValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessGroupsGetAnAccessGroup
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessGroupsGetAnAccessGroupCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
    private com.squareup.okhttp.Call accessGroupsGetAnAccessGroupValidateBeforeCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessGroupsGetAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsGetAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = accessGroupsGetAnAccessGroupCall(uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get an Access group
     * Fetches a single Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return GroupsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupsComponentsSchemasSingleResponse accessGroupsGetAnAccessGroup(SchemasUuid uuid, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasSingleResponse> resp = accessGroupsGetAnAccessGroupWithHttpInfo(uuid, identifier);
        return resp.getData();
    }

    /**
     * Get an Access group
     * Fetches a single Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;GroupsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupsComponentsSchemasSingleResponse> accessGroupsGetAnAccessGroupWithHttpInfo(SchemasUuid uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessGroupsGetAnAccessGroupValidateBeforeCall(uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an Access group (asynchronously)
     * Fetches a single Access group.
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessGroupsGetAnAccessGroupAsync(SchemasUuid uuid, String identifier, final ApiCallback<GroupsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessGroupsGetAnAccessGroupValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessGroupsListAccessGroups
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessGroupsListAccessGroupsCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups"
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
    private com.squareup.okhttp.Call accessGroupsListAccessGroupsValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsListAccessGroups(Async)");
        }
        
        com.squareup.okhttp.Call call = accessGroupsListAccessGroupsCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Access groups
     * Lists all Access groups.
     * @param identifier  (required)
     * @return GroupsComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupsComponentsSchemasResponseCollection accessGroupsListAccessGroups(String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasResponseCollection> resp = accessGroupsListAccessGroupsWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * List Access groups
     * Lists all Access groups.
     * @param identifier  (required)
     * @return ApiResponse&lt;GroupsComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupsComponentsSchemasResponseCollection> accessGroupsListAccessGroupsWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessGroupsListAccessGroupsValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Access groups (asynchronously)
     * Lists all Access groups.
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessGroupsListAccessGroupsAsync(String identifier, final ApiCallback<GroupsComponentsSchemasResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessGroupsListAccessGroupsValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for accessGroupsUpdateAnAccessGroup
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call accessGroupsUpdateAnAccessGroupCall(GroupsUuidBody body, SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{identifier}/access/groups/{uuid}"
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
    private com.squareup.okhttp.Call accessGroupsUpdateAnAccessGroupValidateBeforeCall(GroupsUuidBody body, SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling accessGroupsUpdateAnAccessGroup(Async)");
        }
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling accessGroupsUpdateAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling accessGroupsUpdateAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = accessGroupsUpdateAnAccessGroupCall(body, uuid, identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update an Access group
     * Updates a configured Access group.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @return GroupsComponentsSchemasSingleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupsComponentsSchemasSingleResponse accessGroupsUpdateAnAccessGroup(GroupsUuidBody body, SchemasUuid uuid, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasSingleResponse> resp = accessGroupsUpdateAnAccessGroupWithHttpInfo(body, uuid, identifier);
        return resp.getData();
    }

    /**
     * Update an Access group
     * Updates a configured Access group.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @return ApiResponse&lt;GroupsComponentsSchemasSingleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupsComponentsSchemasSingleResponse> accessGroupsUpdateAnAccessGroupWithHttpInfo(GroupsUuidBody body, SchemasUuid uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = accessGroupsUpdateAnAccessGroupValidateBeforeCall(body, uuid, identifier, null, null);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update an Access group (asynchronously)
     * Updates a configured Access group.
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call accessGroupsUpdateAnAccessGroupAsync(GroupsUuidBody body, SchemasUuid uuid, String identifier, final ApiCallback<GroupsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = accessGroupsUpdateAnAccessGroupValidateBeforeCall(body, uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
