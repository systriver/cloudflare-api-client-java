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


import io.swagger.client.model.CloudflareClientAPIDeletedResponse;
import io.swagger.client.model.InlineResponse4xx49;
import io.swagger.client.model.InlineResponse4xx50;
import io.swagger.client.model.InlineResponse4xx51;
import io.swagger.client.model.VariantGenerationRequest;
import io.swagger.client.model.VariantListResponse;
import io.swagger.client.model.VariantPatchRequest;
import io.swagger.client.model.VariantSimpleResponse;
import io.swagger.client.model.VariantsComponentsSchemasIdentifier;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloudflareImagesVariantsApi {
    private ApiClient apiClient;

    public CloudflareImagesVariantsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CloudflareImagesVariantsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for cloudflareImagesVariantsCreateAVariant
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsCreateAVariantCall(VariantGenerationRequest body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/images/v1/variants"
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
    private com.squareup.okhttp.Call cloudflareImagesVariantsCreateAVariantValidateBeforeCall(VariantGenerationRequest body, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling cloudflareImagesVariantsCreateAVariant(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling cloudflareImagesVariantsCreateAVariant(Async)");
        }
        
        com.squareup.okhttp.Call call = cloudflareImagesVariantsCreateAVariantCall(body, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a variant
     * Specify variants that allow you to resize images for different use cases.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return VariantSimpleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantSimpleResponse cloudflareImagesVariantsCreateAVariant(VariantGenerationRequest body, String accountIdentifier) throws ApiException {
        ApiResponse<VariantSimpleResponse> resp = cloudflareImagesVariantsCreateAVariantWithHttpInfo(body, accountIdentifier);
        return resp.getData();
    }

    /**
     * Create a variant
     * Specify variants that allow you to resize images for different use cases.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VariantSimpleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantSimpleResponse> cloudflareImagesVariantsCreateAVariantWithHttpInfo(VariantGenerationRequest body, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = cloudflareImagesVariantsCreateAVariantValidateBeforeCall(body, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VariantSimpleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a variant (asynchronously)
     * Specify variants that allow you to resize images for different use cases.
     * @param body  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsCreateAVariantAsync(VariantGenerationRequest body, String accountIdentifier, final ApiCallback<VariantSimpleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloudflareImagesVariantsCreateAVariantValidateBeforeCall(body, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantSimpleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cloudflareImagesVariantsDeleteAVariant
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsDeleteAVariantCall(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/images/v1/variants/{identifier}"
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
    private com.squareup.okhttp.Call cloudflareImagesVariantsDeleteAVariantValidateBeforeCall(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling cloudflareImagesVariantsDeleteAVariant(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling cloudflareImagesVariantsDeleteAVariant(Async)");
        }
        
        com.squareup.okhttp.Call call = cloudflareImagesVariantsDeleteAVariantCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a variant
     * Deleting a variant purges the cache for all images associated with the variant.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return CloudflareClientAPIDeletedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudflareClientAPIDeletedResponse cloudflareImagesVariantsDeleteAVariant(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier) throws ApiException {
        ApiResponse<CloudflareClientAPIDeletedResponse> resp = cloudflareImagesVariantsDeleteAVariantWithHttpInfo(identifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * Delete a variant
     * Deleting a variant purges the cache for all images associated with the variant.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;CloudflareClientAPIDeletedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudflareClientAPIDeletedResponse> cloudflareImagesVariantsDeleteAVariantWithHttpInfo(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = cloudflareImagesVariantsDeleteAVariantValidateBeforeCall(identifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIDeletedResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a variant (asynchronously)
     * Deleting a variant purges the cache for all images associated with the variant.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsDeleteAVariantAsync(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ApiCallback<CloudflareClientAPIDeletedResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloudflareImagesVariantsDeleteAVariantValidateBeforeCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudflareClientAPIDeletedResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cloudflareImagesVariantsListVariants
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsListVariantsCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/images/v1/variants"
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
    private com.squareup.okhttp.Call cloudflareImagesVariantsListVariantsValidateBeforeCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling cloudflareImagesVariantsListVariants(Async)");
        }
        
        com.squareup.okhttp.Call call = cloudflareImagesVariantsListVariantsCall(accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List variants
     * Lists existing variants.
     * @param accountIdentifier  (required)
     * @return VariantListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantListResponse cloudflareImagesVariantsListVariants(String accountIdentifier) throws ApiException {
        ApiResponse<VariantListResponse> resp = cloudflareImagesVariantsListVariantsWithHttpInfo(accountIdentifier);
        return resp.getData();
    }

    /**
     * List variants
     * Lists existing variants.
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VariantListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantListResponse> cloudflareImagesVariantsListVariantsWithHttpInfo(String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = cloudflareImagesVariantsListVariantsValidateBeforeCall(accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VariantListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List variants (asynchronously)
     * Lists existing variants.
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsListVariantsAsync(String accountIdentifier, final ApiCallback<VariantListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloudflareImagesVariantsListVariantsValidateBeforeCall(accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cloudflareImagesVariantsUpdateAVariant
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsUpdateAVariantCall(VariantPatchRequest body, VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/images/v1/variants/{identifier}"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cloudflareImagesVariantsUpdateAVariantValidateBeforeCall(VariantPatchRequest body, VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling cloudflareImagesVariantsUpdateAVariant(Async)");
        }
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling cloudflareImagesVariantsUpdateAVariant(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling cloudflareImagesVariantsUpdateAVariant(Async)");
        }
        
        com.squareup.okhttp.Call call = cloudflareImagesVariantsUpdateAVariantCall(body, identifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a variant
     * Updating a variant purges the cache for all images associated with the variant.
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return VariantSimpleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantSimpleResponse cloudflareImagesVariantsUpdateAVariant(VariantPatchRequest body, VariantsComponentsSchemasIdentifier identifier, String accountIdentifier) throws ApiException {
        ApiResponse<VariantSimpleResponse> resp = cloudflareImagesVariantsUpdateAVariantWithHttpInfo(body, identifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * Update a variant
     * Updating a variant purges the cache for all images associated with the variant.
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VariantSimpleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantSimpleResponse> cloudflareImagesVariantsUpdateAVariantWithHttpInfo(VariantPatchRequest body, VariantsComponentsSchemasIdentifier identifier, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = cloudflareImagesVariantsUpdateAVariantValidateBeforeCall(body, identifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VariantSimpleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a variant (asynchronously)
     * Updating a variant purges the cache for all images associated with the variant.
     * @param body  (required)
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsUpdateAVariantAsync(VariantPatchRequest body, VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ApiCallback<VariantSimpleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloudflareImagesVariantsUpdateAVariantValidateBeforeCall(body, identifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantSimpleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cloudflareImagesVariantsVariantDetails
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsVariantDetailsCall(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/images/v1/variants/{identifier}"
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
    private com.squareup.okhttp.Call cloudflareImagesVariantsVariantDetailsValidateBeforeCall(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling cloudflareImagesVariantsVariantDetails(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling cloudflareImagesVariantsVariantDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = cloudflareImagesVariantsVariantDetailsCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Variant details
     * Fetch details for a single variant.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return VariantSimpleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VariantSimpleResponse cloudflareImagesVariantsVariantDetails(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier) throws ApiException {
        ApiResponse<VariantSimpleResponse> resp = cloudflareImagesVariantsVariantDetailsWithHttpInfo(identifier, accountIdentifier);
        return resp.getData();
    }

    /**
     * Variant details
     * Fetch details for a single variant.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;VariantSimpleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VariantSimpleResponse> cloudflareImagesVariantsVariantDetailsWithHttpInfo(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = cloudflareImagesVariantsVariantDetailsValidateBeforeCall(identifier, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<VariantSimpleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Variant details (asynchronously)
     * Fetch details for a single variant.
     * @param identifier  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cloudflareImagesVariantsVariantDetailsAsync(VariantsComponentsSchemasIdentifier identifier, String accountIdentifier, final ApiCallback<VariantSimpleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = cloudflareImagesVariantsVariantDetailsValidateBeforeCall(identifier, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VariantSimpleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
