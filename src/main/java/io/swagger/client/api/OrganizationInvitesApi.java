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


import io.swagger.client.model.CollectionInviteResponse;
import io.swagger.client.model.InlineResponse20028;
import io.swagger.client.model.InlineResponse4xx291;
import io.swagger.client.model.InlineResponse4xx292;
import io.swagger.client.model.InlineResponse4xx293;
import io.swagger.client.model.InvitesIdentifierBody;
import io.swagger.client.model.OrganizationIdentifierInvitesBody;
import io.swagger.client.model.SingleInviteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizationInvitesApi {
    private ApiClient apiClient;

    public OrganizationInvitesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrganizationInvitesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for organizationInvitesCancelInvitation
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesCancelInvitationCall(String identifier, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/organizations/{organization_identifier}/invites/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "organization_identifier" + "\\}", apiClient.escapeString(organizationIdentifier.toString()));

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
    private com.squareup.okhttp.Call organizationInvitesCancelInvitationValidateBeforeCall(String identifier, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling organizationInvitesCancelInvitation(Async)");
        }
        // verify the required parameter 'organizationIdentifier' is set
        if (organizationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'organizationIdentifier' when calling organizationInvitesCancelInvitation(Async)");
        }
        
        com.squareup.okhttp.Call call = organizationInvitesCancelInvitationCall(identifier, organizationIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancel Invitation
     * Cancel an existing invitation.
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @return InlineResponse20028
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20028 organizationInvitesCancelInvitation(String identifier, String organizationIdentifier) throws ApiException {
        ApiResponse<InlineResponse20028> resp = organizationInvitesCancelInvitationWithHttpInfo(identifier, organizationIdentifier);
        return resp.getData();
    }

    /**
     * Cancel Invitation
     * Cancel an existing invitation.
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @return ApiResponse&lt;InlineResponse20028&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20028> organizationInvitesCancelInvitationWithHttpInfo(String identifier, String organizationIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = organizationInvitesCancelInvitationValidateBeforeCall(identifier, organizationIdentifier, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20028>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel Invitation (asynchronously)
     * Cancel an existing invitation.
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesCancelInvitationAsync(String identifier, String organizationIdentifier, final ApiCallback<InlineResponse20028> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = organizationInvitesCancelInvitationValidateBeforeCall(identifier, organizationIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20028>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for organizationInvitesCreateInvitation
     * @param body  (required)
     * @param organizationIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesCreateInvitationCall(OrganizationIdentifierInvitesBody body, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/organizations/{organization_identifier}/invites"
            .replaceAll("\\{" + "organization_identifier" + "\\}", apiClient.escapeString(organizationIdentifier.toString()));

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
    private com.squareup.okhttp.Call organizationInvitesCreateInvitationValidateBeforeCall(OrganizationIdentifierInvitesBody body, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling organizationInvitesCreateInvitation(Async)");
        }
        // verify the required parameter 'organizationIdentifier' is set
        if (organizationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'organizationIdentifier' when calling organizationInvitesCreateInvitation(Async)");
        }
        
        com.squareup.okhttp.Call call = organizationInvitesCreateInvitationCall(body, organizationIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Invitation
     * Invite a User to become a Member of an Organization.
     * @param body  (required)
     * @param organizationIdentifier  (required)
     * @return SingleInviteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleInviteResponse organizationInvitesCreateInvitation(OrganizationIdentifierInvitesBody body, String organizationIdentifier) throws ApiException {
        ApiResponse<SingleInviteResponse> resp = organizationInvitesCreateInvitationWithHttpInfo(body, organizationIdentifier);
        return resp.getData();
    }

    /**
     * Create Invitation
     * Invite a User to become a Member of an Organization.
     * @param body  (required)
     * @param organizationIdentifier  (required)
     * @return ApiResponse&lt;SingleInviteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleInviteResponse> organizationInvitesCreateInvitationWithHttpInfo(OrganizationIdentifierInvitesBody body, String organizationIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = organizationInvitesCreateInvitationValidateBeforeCall(body, organizationIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SingleInviteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Invitation (asynchronously)
     * Invite a User to become a Member of an Organization.
     * @param body  (required)
     * @param organizationIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesCreateInvitationAsync(OrganizationIdentifierInvitesBody body, String organizationIdentifier, final ApiCallback<SingleInviteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = organizationInvitesCreateInvitationValidateBeforeCall(body, organizationIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleInviteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for organizationInvitesEditInvitationRoles
     * @param body  (required)
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesEditInvitationRolesCall(InvitesIdentifierBody body, String identifier, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/organizations/{organization_identifier}/invites/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "organization_identifier" + "\\}", apiClient.escapeString(organizationIdentifier.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call organizationInvitesEditInvitationRolesValidateBeforeCall(InvitesIdentifierBody body, String identifier, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling organizationInvitesEditInvitationRoles(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling organizationInvitesEditInvitationRoles(Async)");
        }
        // verify the required parameter 'organizationIdentifier' is set
        if (organizationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'organizationIdentifier' when calling organizationInvitesEditInvitationRoles(Async)");
        }
        
        com.squareup.okhttp.Call call = organizationInvitesEditInvitationRolesCall(body, identifier, organizationIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit Invitation Roles
     * Change the Roles of a Pending Invite.
     * @param body  (required)
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @return SingleInviteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleInviteResponse organizationInvitesEditInvitationRoles(InvitesIdentifierBody body, String identifier, String organizationIdentifier) throws ApiException {
        ApiResponse<SingleInviteResponse> resp = organizationInvitesEditInvitationRolesWithHttpInfo(body, identifier, organizationIdentifier);
        return resp.getData();
    }

    /**
     * Edit Invitation Roles
     * Change the Roles of a Pending Invite.
     * @param body  (required)
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @return ApiResponse&lt;SingleInviteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleInviteResponse> organizationInvitesEditInvitationRolesWithHttpInfo(InvitesIdentifierBody body, String identifier, String organizationIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = organizationInvitesEditInvitationRolesValidateBeforeCall(body, identifier, organizationIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SingleInviteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit Invitation Roles (asynchronously)
     * Change the Roles of a Pending Invite.
     * @param body  (required)
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesEditInvitationRolesAsync(InvitesIdentifierBody body, String identifier, String organizationIdentifier, final ApiCallback<SingleInviteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = organizationInvitesEditInvitationRolesValidateBeforeCall(body, identifier, organizationIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleInviteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for organizationInvitesInvitationDetails
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesInvitationDetailsCall(String identifier, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/organizations/{organization_identifier}/invites/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
            .replaceAll("\\{" + "organization_identifier" + "\\}", apiClient.escapeString(organizationIdentifier.toString()));

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
    private com.squareup.okhttp.Call organizationInvitesInvitationDetailsValidateBeforeCall(String identifier, String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling organizationInvitesInvitationDetails(Async)");
        }
        // verify the required parameter 'organizationIdentifier' is set
        if (organizationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'organizationIdentifier' when calling organizationInvitesInvitationDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = organizationInvitesInvitationDetailsCall(identifier, organizationIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Invitation Details
     * Get the details of an invitation.
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @return SingleInviteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleInviteResponse organizationInvitesInvitationDetails(String identifier, String organizationIdentifier) throws ApiException {
        ApiResponse<SingleInviteResponse> resp = organizationInvitesInvitationDetailsWithHttpInfo(identifier, organizationIdentifier);
        return resp.getData();
    }

    /**
     * Invitation Details
     * Get the details of an invitation.
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @return ApiResponse&lt;SingleInviteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleInviteResponse> organizationInvitesInvitationDetailsWithHttpInfo(String identifier, String organizationIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = organizationInvitesInvitationDetailsValidateBeforeCall(identifier, organizationIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SingleInviteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Invitation Details (asynchronously)
     * Get the details of an invitation.
     * @param identifier  (required)
     * @param organizationIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesInvitationDetailsAsync(String identifier, String organizationIdentifier, final ApiCallback<SingleInviteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = organizationInvitesInvitationDetailsValidateBeforeCall(identifier, organizationIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleInviteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for organizationInvitesListInvitations
     * @param organizationIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesListInvitationsCall(String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/organizations/{organization_identifier}/invites"
            .replaceAll("\\{" + "organization_identifier" + "\\}", apiClient.escapeString(organizationIdentifier.toString()));

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
    private com.squareup.okhttp.Call organizationInvitesListInvitationsValidateBeforeCall(String organizationIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'organizationIdentifier' is set
        if (organizationIdentifier == null) {
            throw new ApiException("Missing the required parameter 'organizationIdentifier' when calling organizationInvitesListInvitations(Async)");
        }
        
        com.squareup.okhttp.Call call = organizationInvitesListInvitationsCall(organizationIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Invitations
     * List all invitations associated with an organization.
     * @param organizationIdentifier  (required)
     * @return CollectionInviteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CollectionInviteResponse organizationInvitesListInvitations(String organizationIdentifier) throws ApiException {
        ApiResponse<CollectionInviteResponse> resp = organizationInvitesListInvitationsWithHttpInfo(organizationIdentifier);
        return resp.getData();
    }

    /**
     * List Invitations
     * List all invitations associated with an organization.
     * @param organizationIdentifier  (required)
     * @return ApiResponse&lt;CollectionInviteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CollectionInviteResponse> organizationInvitesListInvitationsWithHttpInfo(String organizationIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = organizationInvitesListInvitationsValidateBeforeCall(organizationIdentifier, null, null);
        Type localVarReturnType = new TypeToken<CollectionInviteResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Invitations (asynchronously)
     * List all invitations associated with an organization.
     * @param organizationIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call organizationInvitesListInvitationsAsync(String organizationIdentifier, final ApiCallback<CollectionInviteResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = organizationInvitesListInvitationsValidateBeforeCall(organizationIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CollectionInviteResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
