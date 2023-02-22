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


import io.swagger.client.model.ComponentsSchemasValidationMethod;
import io.swagger.client.model.InlineResponse4xx471;
import io.swagger.client.model.InlineResponse4xx472;
import io.swagger.client.model.SslValidationMethodResponseCollection;
import io.swagger.client.model.SslVerificationResponseCollection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SslVerificationApi {
    private ApiClient apiClient;

    public SslVerificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SslVerificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for sslVerificationEditSslCertificatePackValidationMethod
     * @param body  (required)
     * @param certPackUuid  (required)
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sslVerificationEditSslCertificatePackValidationMethodCall(ComponentsSchemasValidationMethod body, String certPackUuid, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/ssl/verification/{cert_pack_uuid}"
            .replaceAll("\\{" + "cert_pack_uuid" + "\\}", apiClient.escapeString(certPackUuid.toString()))
            .replaceAll("\\{" + "zone_identifier" + "\\}", apiClient.escapeString(zoneIdentifier.toString()));

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
    private com.squareup.okhttp.Call sslVerificationEditSslCertificatePackValidationMethodValidateBeforeCall(ComponentsSchemasValidationMethod body, String certPackUuid, String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling sslVerificationEditSslCertificatePackValidationMethod(Async)");
        }
        // verify the required parameter 'certPackUuid' is set
        if (certPackUuid == null) {
            throw new ApiException("Missing the required parameter 'certPackUuid' when calling sslVerificationEditSslCertificatePackValidationMethod(Async)");
        }
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling sslVerificationEditSslCertificatePackValidationMethod(Async)");
        }
        
        com.squareup.okhttp.Call call = sslVerificationEditSslCertificatePackValidationMethodCall(body, certPackUuid, zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit SSL Certificate Pack Validation Method
     * Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.
     * @param body  (required)
     * @param certPackUuid  (required)
     * @param zoneIdentifier  (required)
     * @return SslValidationMethodResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SslValidationMethodResponseCollection sslVerificationEditSslCertificatePackValidationMethod(ComponentsSchemasValidationMethod body, String certPackUuid, String zoneIdentifier) throws ApiException {
        ApiResponse<SslValidationMethodResponseCollection> resp = sslVerificationEditSslCertificatePackValidationMethodWithHttpInfo(body, certPackUuid, zoneIdentifier);
        return resp.getData();
    }

    /**
     * Edit SSL Certificate Pack Validation Method
     * Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.
     * @param body  (required)
     * @param certPackUuid  (required)
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;SslValidationMethodResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SslValidationMethodResponseCollection> sslVerificationEditSslCertificatePackValidationMethodWithHttpInfo(ComponentsSchemasValidationMethod body, String certPackUuid, String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = sslVerificationEditSslCertificatePackValidationMethodValidateBeforeCall(body, certPackUuid, zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SslValidationMethodResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit SSL Certificate Pack Validation Method (asynchronously)
     * Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.
     * @param body  (required)
     * @param certPackUuid  (required)
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sslVerificationEditSslCertificatePackValidationMethodAsync(ComponentsSchemasValidationMethod body, String certPackUuid, String zoneIdentifier, final ApiCallback<SslValidationMethodResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sslVerificationEditSslCertificatePackValidationMethodValidateBeforeCall(body, certPackUuid, zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SslValidationMethodResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for sslVerificationSslVerificationDetails
     * @param zoneIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sslVerificationSslVerificationDetailsCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/zones/{zone_identifier}/ssl/verification"
            .replaceAll("\\{" + "zone_identifier" + "\\}", apiClient.escapeString(zoneIdentifier.toString()));

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
    private com.squareup.okhttp.Call sslVerificationSslVerificationDetailsValidateBeforeCall(String zoneIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'zoneIdentifier' is set
        if (zoneIdentifier == null) {
            throw new ApiException("Missing the required parameter 'zoneIdentifier' when calling sslVerificationSslVerificationDetails(Async)");
        }
        
        com.squareup.okhttp.Call call = sslVerificationSslVerificationDetailsCall(zoneIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * SSL Verification Details
     * Get SSL Verification Info for a Zone.
     * @param zoneIdentifier  (required)
     * @return SslVerificationResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SslVerificationResponseCollection sslVerificationSslVerificationDetails(String zoneIdentifier) throws ApiException {
        ApiResponse<SslVerificationResponseCollection> resp = sslVerificationSslVerificationDetailsWithHttpInfo(zoneIdentifier);
        return resp.getData();
    }

    /**
     * SSL Verification Details
     * Get SSL Verification Info for a Zone.
     * @param zoneIdentifier  (required)
     * @return ApiResponse&lt;SslVerificationResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SslVerificationResponseCollection> sslVerificationSslVerificationDetailsWithHttpInfo(String zoneIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = sslVerificationSslVerificationDetailsValidateBeforeCall(zoneIdentifier, null, null);
        Type localVarReturnType = new TypeToken<SslVerificationResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * SSL Verification Details (asynchronously)
     * Get SSL Verification Info for a Zone.
     * @param zoneIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sslVerificationSslVerificationDetailsAsync(String zoneIdentifier, final ApiCallback<SslVerificationResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sslVerificationSslVerificationDetailsValidateBeforeCall(zoneIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SslVerificationResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}