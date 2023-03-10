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


import io.swagger.client.model.CertificateResponseSingleId;
import io.swagger.client.model.CertificatesBody;
import io.swagger.client.model.InlineResponse4xx283;
import io.swagger.client.model.InlineResponse4xx284;
import io.swagger.client.model.InlineResponse4xx285;
import io.swagger.client.model.SchemasCertificateResponseCollection;
import io.swagger.client.model.SchemasCertificateResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OriginCaApi {
    private ApiClient apiClient;

    public OriginCaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OriginCaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for originCaCreateCertificate
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call originCaCreateCertificateCall(CertificatesBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/certificates";

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

        String[] localVarAuthNames = new String[] { "api_token", "user_service_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call originCaCreateCertificateValidateBeforeCall(CertificatesBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling originCaCreateCertificate(Async)");
        }
        
        com.squareup.okhttp.Call call = originCaCreateCertificateCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Certificate
     * Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param body  (required)
     * @return SchemasCertificateResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SchemasCertificateResponseSingle originCaCreateCertificate(CertificatesBody body) throws ApiException {
        ApiResponse<SchemasCertificateResponseSingle> resp = originCaCreateCertificateWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Certificate
     * Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param body  (required)
     * @return ApiResponse&lt;SchemasCertificateResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SchemasCertificateResponseSingle> originCaCreateCertificateWithHttpInfo(CertificatesBody body) throws ApiException {
        com.squareup.okhttp.Call call = originCaCreateCertificateValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<SchemasCertificateResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Certificate (asynchronously)
     * Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call originCaCreateCertificateAsync(CertificatesBody body, final ApiCallback<SchemasCertificateResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = originCaCreateCertificateValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SchemasCertificateResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for originCaGetCertificate
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call originCaGetCertificateCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/certificates/{identifier}"
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

        String[] localVarAuthNames = new String[] { "api_token", "user_service_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call originCaGetCertificateValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling originCaGetCertificate(Async)");
        }
        
        com.squareup.okhttp.Call call = originCaGetCertificateCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Certificate
     * Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (required)
     * @return SchemasCertificateResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SchemasCertificateResponseSingle originCaGetCertificate(String identifier) throws ApiException {
        ApiResponse<SchemasCertificateResponseSingle> resp = originCaGetCertificateWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Get Certificate
     * Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (required)
     * @return ApiResponse&lt;SchemasCertificateResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SchemasCertificateResponseSingle> originCaGetCertificateWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = originCaGetCertificateValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<SchemasCertificateResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Certificate (asynchronously)
     * Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call originCaGetCertificateAsync(String identifier, final ApiCallback<SchemasCertificateResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = originCaGetCertificateValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SchemasCertificateResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for originCaListCertificates
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call originCaListCertificatesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/certificates";

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

        String[] localVarAuthNames = new String[] { "api_token", "user_service_key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call originCaListCertificatesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = originCaListCertificatesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Certificates
     * List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @return SchemasCertificateResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SchemasCertificateResponseCollection originCaListCertificates() throws ApiException {
        ApiResponse<SchemasCertificateResponseCollection> resp = originCaListCertificatesWithHttpInfo();
        return resp.getData();
    }

    /**
     * List Certificates
     * List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @return ApiResponse&lt;SchemasCertificateResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SchemasCertificateResponseCollection> originCaListCertificatesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = originCaListCertificatesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<SchemasCertificateResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Certificates (asynchronously)
     * List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call originCaListCertificatesAsync(final ApiCallback<SchemasCertificateResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = originCaListCertificatesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SchemasCertificateResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for originCaRevokeCertificate
     * @param identifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call originCaRevokeCertificateCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/certificates/{identifier}"
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

        String[] localVarAuthNames = new String[] { "api_token", "user_service_key" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call originCaRevokeCertificateValidateBeforeCall(String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling originCaRevokeCertificate(Async)");
        }
        
        com.squareup.okhttp.Call call = originCaRevokeCertificateCall(identifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Revoke Certificate
     * Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (required)
     * @return CertificateResponseSingleId
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CertificateResponseSingleId originCaRevokeCertificate(String identifier) throws ApiException {
        ApiResponse<CertificateResponseSingleId> resp = originCaRevokeCertificateWithHttpInfo(identifier);
        return resp.getData();
    }

    /**
     * Revoke Certificate
     * Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (required)
     * @return ApiResponse&lt;CertificateResponseSingleId&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CertificateResponseSingleId> originCaRevokeCertificateWithHttpInfo(String identifier) throws ApiException {
        com.squareup.okhttp.Call call = originCaRevokeCertificateValidateBeforeCall(identifier, null, null);
        Type localVarReturnType = new TypeToken<CertificateResponseSingleId>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Revoke Certificate (asynchronously)
     * Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).
     * @param identifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call originCaRevokeCertificateAsync(String identifier, final ApiCallback<CertificateResponseSingleId> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = originCaRevokeCertificateValidateBeforeCall(identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CertificateResponseSingleId>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
