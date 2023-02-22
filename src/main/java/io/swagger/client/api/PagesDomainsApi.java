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


import io.swagger.client.model.DomainResponseCollection;
import io.swagger.client.model.DomainResponseSingle;
import io.swagger.client.model.InlineResponse4xx118;
import io.swagger.client.model.InlineResponse4xx123;
import io.swagger.client.model.InlineResponse4xx124;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagesDomainsApi {
    private ApiClient apiClient;

    public PagesDomainsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PagesDomainsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for pagesDomainsAddDomain
     * @param body  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsAddDomainCall(Object body, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/pages/projects/{project_name}/domains"
            .replaceAll("\\{" + "project_name" + "\\}", apiClient.escapeString(projectName.toString()))
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
    private com.squareup.okhttp.Call pagesDomainsAddDomainValidateBeforeCall(Object body, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling pagesDomainsAddDomain(Async)");
        }
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsAddDomain(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling pagesDomainsAddDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = pagesDomainsAddDomainCall(body, projectName, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add domain
     * Add a new domain for the Pages project.
     * @param body  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return DomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DomainResponseSingle pagesDomainsAddDomain(Object body, String projectName, String accountIdentifier) throws ApiException {
        ApiResponse<DomainResponseSingle> resp = pagesDomainsAddDomainWithHttpInfo(body, projectName, accountIdentifier);
        return resp.getData();
    }

    /**
     * Add domain
     * Add a new domain for the Pages project.
     * @param body  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;DomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DomainResponseSingle> pagesDomainsAddDomainWithHttpInfo(Object body, String projectName, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = pagesDomainsAddDomainValidateBeforeCall(body, projectName, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<DomainResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add domain (asynchronously)
     * Add a new domain for the Pages project.
     * @param body  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsAddDomainAsync(Object body, String projectName, String accountIdentifier, final ApiCallback<DomainResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = pagesDomainsAddDomainValidateBeforeCall(body, projectName, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DomainResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for pagesDomainsDeleteDomain
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsDeleteDomainCall(String domainName, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/pages/projects/{project_name}/domains/{domain_name}"
            .replaceAll("\\{" + "domain_name" + "\\}", apiClient.escapeString(domainName.toString()))
            .replaceAll("\\{" + "project_name" + "\\}", apiClient.escapeString(projectName.toString()))
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
    private com.squareup.okhttp.Call pagesDomainsDeleteDomainValidateBeforeCall(String domainName, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling pagesDomainsDeleteDomain(Async)");
        }
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsDeleteDomain(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling pagesDomainsDeleteDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = pagesDomainsDeleteDomainCall(domainName, projectName, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete domain
     * Delete a domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object pagesDomainsDeleteDomain(String domainName, String projectName, String accountIdentifier) throws ApiException {
        ApiResponse<Object> resp = pagesDomainsDeleteDomainWithHttpInfo(domainName, projectName, accountIdentifier);
        return resp.getData();
    }

    /**
     * Delete domain
     * Delete a domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> pagesDomainsDeleteDomainWithHttpInfo(String domainName, String projectName, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = pagesDomainsDeleteDomainValidateBeforeCall(domainName, projectName, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete domain (asynchronously)
     * Delete a domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsDeleteDomainAsync(String domainName, String projectName, String accountIdentifier, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = pagesDomainsDeleteDomainValidateBeforeCall(domainName, projectName, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for pagesDomainsGetDomain
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsGetDomainCall(String domainName, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/pages/projects/{project_name}/domains/{domain_name}"
            .replaceAll("\\{" + "domain_name" + "\\}", apiClient.escapeString(domainName.toString()))
            .replaceAll("\\{" + "project_name" + "\\}", apiClient.escapeString(projectName.toString()))
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
    private com.squareup.okhttp.Call pagesDomainsGetDomainValidateBeforeCall(String domainName, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling pagesDomainsGetDomain(Async)");
        }
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsGetDomain(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling pagesDomainsGetDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = pagesDomainsGetDomainCall(domainName, projectName, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get domain
     * Fetch a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return DomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DomainResponseSingle pagesDomainsGetDomain(String domainName, String projectName, String accountIdentifier) throws ApiException {
        ApiResponse<DomainResponseSingle> resp = pagesDomainsGetDomainWithHttpInfo(domainName, projectName, accountIdentifier);
        return resp.getData();
    }

    /**
     * Get domain
     * Fetch a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;DomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DomainResponseSingle> pagesDomainsGetDomainWithHttpInfo(String domainName, String projectName, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = pagesDomainsGetDomainValidateBeforeCall(domainName, projectName, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<DomainResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get domain (asynchronously)
     * Fetch a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsGetDomainAsync(String domainName, String projectName, String accountIdentifier, final ApiCallback<DomainResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = pagesDomainsGetDomainValidateBeforeCall(domainName, projectName, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DomainResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for pagesDomainsGetDomains
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsGetDomainsCall(String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/pages/projects/{project_name}/domains"
            .replaceAll("\\{" + "project_name" + "\\}", apiClient.escapeString(projectName.toString()))
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
    private com.squareup.okhttp.Call pagesDomainsGetDomainsValidateBeforeCall(String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsGetDomains(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling pagesDomainsGetDomains(Async)");
        }
        
        com.squareup.okhttp.Call call = pagesDomainsGetDomainsCall(projectName, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get domains
     * Fetch a list of all domains.
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return DomainResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DomainResponseCollection pagesDomainsGetDomains(String projectName, String accountIdentifier) throws ApiException {
        ApiResponse<DomainResponseCollection> resp = pagesDomainsGetDomainsWithHttpInfo(projectName, accountIdentifier);
        return resp.getData();
    }

    /**
     * Get domains
     * Fetch a list of all domains.
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;DomainResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DomainResponseCollection> pagesDomainsGetDomainsWithHttpInfo(String projectName, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = pagesDomainsGetDomainsValidateBeforeCall(projectName, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<DomainResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get domains (asynchronously)
     * Fetch a list of all domains.
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsGetDomainsAsync(String projectName, String accountIdentifier, final ApiCallback<DomainResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = pagesDomainsGetDomainsValidateBeforeCall(projectName, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DomainResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for pagesDomainsPatchDomain
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsPatchDomainCall(String domainName, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/pages/projects/{project_name}/domains/{domain_name}"
            .replaceAll("\\{" + "domain_name" + "\\}", apiClient.escapeString(domainName.toString()))
            .replaceAll("\\{" + "project_name" + "\\}", apiClient.escapeString(projectName.toString()))
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
    private com.squareup.okhttp.Call pagesDomainsPatchDomainValidateBeforeCall(String domainName, String projectName, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'domainName' is set
        if (domainName == null) {
            throw new ApiException("Missing the required parameter 'domainName' when calling pagesDomainsPatchDomain(Async)");
        }
        // verify the required parameter 'projectName' is set
        if (projectName == null) {
            throw new ApiException("Missing the required parameter 'projectName' when calling pagesDomainsPatchDomain(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling pagesDomainsPatchDomain(Async)");
        }
        
        com.squareup.okhttp.Call call = pagesDomainsPatchDomainCall(domainName, projectName, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Patch domain
     * Retry the validation status of a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return DomainResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DomainResponseSingle pagesDomainsPatchDomain(String domainName, String projectName, String accountIdentifier) throws ApiException {
        ApiResponse<DomainResponseSingle> resp = pagesDomainsPatchDomainWithHttpInfo(domainName, projectName, accountIdentifier);
        return resp.getData();
    }

    /**
     * Patch domain
     * Retry the validation status of a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;DomainResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DomainResponseSingle> pagesDomainsPatchDomainWithHttpInfo(String domainName, String projectName, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = pagesDomainsPatchDomainValidateBeforeCall(domainName, projectName, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<DomainResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Patch domain (asynchronously)
     * Retry the validation status of a single domain.
     * @param domainName  (required)
     * @param projectName  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call pagesDomainsPatchDomainAsync(String domainName, String projectName, String accountIdentifier, final ApiCallback<DomainResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = pagesDomainsPatchDomainValidateBeforeCall(domainName, projectName, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DomainResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
