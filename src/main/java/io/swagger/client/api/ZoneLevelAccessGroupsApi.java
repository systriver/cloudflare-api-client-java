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


import io.swagger.client.model.AccessGroupsBody1;
import io.swagger.client.model.GroupsComponentsSchemasIdResponse;
import io.swagger.client.model.GroupsComponentsSchemasResponseCollection;
import io.swagger.client.model.GroupsComponentsSchemasSingleResponse;
import io.swagger.client.model.GroupsUuidBody1;
import io.swagger.client.model.InlineResponse4xx216;
import io.swagger.client.model.InlineResponse4xx217;
import io.swagger.client.model.InlineResponse4xx218;
import io.swagger.client.model.SchemasUuid;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZoneLevelAccessGroupsApi {
    private ApiClient apiClient;

    public ZoneLevelAccessGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ZoneLevelAccessGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for zoneLevelAccessGroupsCreateAnAccessGroup
     * @param body  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zoneLevelAccessGroupsCreateAnAccessGroupCall(AccessGroupsBody1 body, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/access/groups"
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
    private com.squareup.okhttp.Call zoneLevelAccessGroupsCreateAnAccessGroupValidateBeforeCall(AccessGroupsBody1 body, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling zoneLevelAccessGroupsCreateAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelAccessGroupsCreateAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsCreateAnAccessGroupCall(body, identifier, progressListener, progressRequestListener);
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
    public GroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsCreateAnAccessGroup(AccessGroupsBody1 body, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasSingleResponse> resp = zoneLevelAccessGroupsCreateAnAccessGroupWithHttpInfo(body, identifier);
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
    public ApiResponse<GroupsComponentsSchemasSingleResponse> zoneLevelAccessGroupsCreateAnAccessGroupWithHttpInfo(AccessGroupsBody1 body, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsCreateAnAccessGroupValidateBeforeCall(body, identifier, null, null);
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
    public com.squareup.okhttp.Call zoneLevelAccessGroupsCreateAnAccessGroupAsync(AccessGroupsBody1 body, String identifier, final ApiCallback<GroupsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zoneLevelAccessGroupsCreateAnAccessGroupValidateBeforeCall(body, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zoneLevelAccessGroupsDeleteAnAccessGroup
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zoneLevelAccessGroupsDeleteAnAccessGroupCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/access/groups/{uuid}"
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
    private com.squareup.okhttp.Call zoneLevelAccessGroupsDeleteAnAccessGroupValidateBeforeCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling zoneLevelAccessGroupsDeleteAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelAccessGroupsDeleteAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsDeleteAnAccessGroupCall(uuid, identifier, progressListener, progressRequestListener);
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
    public GroupsComponentsSchemasIdResponse zoneLevelAccessGroupsDeleteAnAccessGroup(SchemasUuid uuid, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasIdResponse> resp = zoneLevelAccessGroupsDeleteAnAccessGroupWithHttpInfo(uuid, identifier);
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
    public ApiResponse<GroupsComponentsSchemasIdResponse> zoneLevelAccessGroupsDeleteAnAccessGroupWithHttpInfo(SchemasUuid uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsDeleteAnAccessGroupValidateBeforeCall(uuid, identifier, null, null);
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
    public com.squareup.okhttp.Call zoneLevelAccessGroupsDeleteAnAccessGroupAsync(SchemasUuid uuid, String identifier, final ApiCallback<GroupsComponentsSchemasIdResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zoneLevelAccessGroupsDeleteAnAccessGroupValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasIdResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zoneLevelAccessGroupsGetAnAccessGroup
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zoneLevelAccessGroupsGetAnAccessGroupCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/access/groups/{uuid}"
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
    private com.squareup.okhttp.Call zoneLevelAccessGroupsGetAnAccessGroupValidateBeforeCall(SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling zoneLevelAccessGroupsGetAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelAccessGroupsGetAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsGetAnAccessGroupCall(uuid, identifier, progressListener, progressRequestListener);
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
    public GroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsGetAnAccessGroup(SchemasUuid uuid, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasSingleResponse> resp = zoneLevelAccessGroupsGetAnAccessGroupWithHttpInfo(uuid, identifier);
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
    public ApiResponse<GroupsComponentsSchemasSingleResponse> zoneLevelAccessGroupsGetAnAccessGroupWithHttpInfo(SchemasUuid uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsGetAnAccessGroupValidateBeforeCall(uuid, identifier, null, null);
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
    public com.squareup.okhttp.Call zoneLevelAccessGroupsGetAnAccessGroupAsync(SchemasUuid uuid, String identifier, final ApiCallback<GroupsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zoneLevelAccessGroupsGetAnAccessGroupValidateBeforeCall(uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zoneLevelAccessGroupsListAccessGroups
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zoneLevelAccessGroupsListAccessGroupsCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/access/groups"
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
    private com.squareup.okhttp.Call zoneLevelAccessGroupsListAccessGroupsValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelAccessGroupsListAccessGroups(Async)");
        }
        
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsListAccessGroupsCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Access groups
     * Lists all Access groups.
     * @param identifier  (required)
     * @return GroupsComponentsSchemasResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GroupsComponentsSchemasResponseCollection zoneLevelAccessGroupsListAccessGroups(String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasResponseCollection> resp = zoneLevelAccessGroupsListAccessGroupsWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * List Access groups
     * Lists all Access groups.
     * @param identifier  (required)
     * @return ApiResponse&lt;GroupsComponentsSchemasResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GroupsComponentsSchemasResponseCollection> zoneLevelAccessGroupsListAccessGroupsWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsListAccessGroupsValidateBeforeCall(identifier, null, null);
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
    public com.squareup.okhttp.Call zoneLevelAccessGroupsListAccessGroupsAsync(String identifier, final ApiCallback<GroupsComponentsSchemasResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zoneLevelAccessGroupsListAccessGroupsValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for zoneLevelAccessGroupsUpdateAnAccessGroup
     * @param body  (required)
     * @param uuid  (required)
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call zoneLevelAccessGroupsUpdateAnAccessGroupCall(GroupsUuidBody1 body, SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{identifier}/access/groups/{uuid}"
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
    private com.squareup.okhttp.Call zoneLevelAccessGroupsUpdateAnAccessGroupValidateBeforeCall(GroupsUuidBody1 body, SchemasUuid uuid, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling zoneLevelAccessGroupsUpdateAnAccessGroup(Async)");
        }
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling zoneLevelAccessGroupsUpdateAnAccessGroup(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling zoneLevelAccessGroupsUpdateAnAccessGroup(Async)");
        }
        
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsUpdateAnAccessGroupCall(body, uuid, identifier, progressListener, progressRequestListener);
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
    public GroupsComponentsSchemasSingleResponse zoneLevelAccessGroupsUpdateAnAccessGroup(GroupsUuidBody1 body, SchemasUuid uuid, String identifier) throws ApiException {
        ApiResponse<GroupsComponentsSchemasSingleResponse> resp = zoneLevelAccessGroupsUpdateAnAccessGroupWithHttpInfo(body, uuid, identifier);
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
    public ApiResponse<GroupsComponentsSchemasSingleResponse> zoneLevelAccessGroupsUpdateAnAccessGroupWithHttpInfo(GroupsUuidBody1 body, SchemasUuid uuid, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = zoneLevelAccessGroupsUpdateAnAccessGroupValidateBeforeCall(body, uuid, identifier, null, null);
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
    public com.squareup.okhttp.Call zoneLevelAccessGroupsUpdateAnAccessGroupAsync(GroupsUuidBody1 body, SchemasUuid uuid, String identifier, final ApiCallback<GroupsComponentsSchemasSingleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = zoneLevelAccessGroupsUpdateAnAccessGroupValidateBeforeCall(body, uuid, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GroupsComponentsSchemasSingleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
