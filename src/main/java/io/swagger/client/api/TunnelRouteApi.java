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


import io.swagger.client.model.InlineResponse4xx164;
import io.swagger.client.model.InlineResponse4xx165;
import io.swagger.client.model.NetworkIpNetworkEncodedBody;
import io.swagger.client.model.NetworkIpNetworkEncodedBody1;
import io.swagger.client.model.NetworkIpNetworkEncodedBody2;
import io.swagger.client.model.RouteResponseCollection;
import io.swagger.client.model.RouteResponseSingle;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TunnelRouteApi {
    private ApiClient apiClient;

    public TunnelRouteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TunnelRouteApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for tunnelRouteCreateATunnelRoute
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteCreateATunnelRouteCall(NetworkIpNetworkEncodedBody body, String ipNetworkEncoded, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/routes/network/{ip_network_encoded}"
            .replaceAll("\\{" + "ip_network_encoded" + "\\}", apiClient.escapeString(ipNetworkEncoded.toString()))
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
    private com.squareup.okhttp.Call tunnelRouteCreateATunnelRouteValidateBeforeCall(NetworkIpNetworkEncodedBody body, String ipNetworkEncoded, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tunnelRouteCreateATunnelRoute(Async)");
        }
        // verify the required parameter 'ipNetworkEncoded' is set
        if (ipNetworkEncoded == null) {
            throw new ApiException("Missing the required parameter 'ipNetworkEncoded' when calling tunnelRouteCreateATunnelRoute(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelRouteCreateATunnelRoute(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelRouteCreateATunnelRouteCall(body, ipNetworkEncoded, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a tunnel route
     * Routes a private network through a Cloudflare Tunnel. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @return RouteResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RouteResponseSingle tunnelRouteCreateATunnelRoute(NetworkIpNetworkEncodedBody body, String ipNetworkEncoded, String accountIdentifier) throws ApiException {
        ApiResponse<RouteResponseSingle> resp = tunnelRouteCreateATunnelRouteWithHttpInfo(body, ipNetworkEncoded, accountIdentifier);
        return resp.getData();
    }

    /**
     * Create a tunnel route
     * Routes a private network through a Cloudflare Tunnel. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;RouteResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RouteResponseSingle> tunnelRouteCreateATunnelRouteWithHttpInfo(NetworkIpNetworkEncodedBody body, String ipNetworkEncoded, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelRouteCreateATunnelRouteValidateBeforeCall(body, ipNetworkEncoded, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a tunnel route (asynchronously)
     * Routes a private network through a Cloudflare Tunnel. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteCreateATunnelRouteAsync(NetworkIpNetworkEncodedBody body, String ipNetworkEncoded, String accountIdentifier, final ApiCallback<RouteResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelRouteCreateATunnelRouteValidateBeforeCall(body, ipNetworkEncoded, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tunnelRouteDeleteATunnelRoute
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteDeleteATunnelRouteCall(NetworkIpNetworkEncodedBody1 body, String ipNetworkEncoded, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/routes/network/{ip_network_encoded}"
            .replaceAll("\\{" + "ip_network_encoded" + "\\}", apiClient.escapeString(ipNetworkEncoded.toString()))
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
    private com.squareup.okhttp.Call tunnelRouteDeleteATunnelRouteValidateBeforeCall(NetworkIpNetworkEncodedBody1 body, String ipNetworkEncoded, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tunnelRouteDeleteATunnelRoute(Async)");
        }
        // verify the required parameter 'ipNetworkEncoded' is set
        if (ipNetworkEncoded == null) {
            throw new ApiException("Missing the required parameter 'ipNetworkEncoded' when calling tunnelRouteDeleteATunnelRoute(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelRouteDeleteATunnelRoute(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelRouteDeleteATunnelRouteCall(body, ipNetworkEncoded, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a tunnel route
     * Deletes a private network route from an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @return RouteResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RouteResponseSingle tunnelRouteDeleteATunnelRoute(NetworkIpNetworkEncodedBody1 body, String ipNetworkEncoded, String accountIdentifier) throws ApiException {
        ApiResponse<RouteResponseSingle> resp = tunnelRouteDeleteATunnelRouteWithHttpInfo(body, ipNetworkEncoded, accountIdentifier);
        return resp.getData();
    }

    /**
     * Delete a tunnel route
     * Deletes a private network route from an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;RouteResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RouteResponseSingle> tunnelRouteDeleteATunnelRouteWithHttpInfo(NetworkIpNetworkEncodedBody1 body, String ipNetworkEncoded, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelRouteDeleteATunnelRouteValidateBeforeCall(body, ipNetworkEncoded, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a tunnel route (asynchronously)
     * Deletes a private network route from an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteDeleteATunnelRouteAsync(NetworkIpNetworkEncodedBody1 body, String ipNetworkEncoded, String accountIdentifier, final ApiCallback<RouteResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelRouteDeleteATunnelRouteValidateBeforeCall(body, ipNetworkEncoded, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tunnelRouteGetTunnelRouteByIp
     * @param ip  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteGetTunnelRouteByIpCall(String ip, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/routes/ip/{ip}"
            .replaceAll("\\{" + "ip" + "\\}", apiClient.escapeString(ip.toString()))
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
    private com.squareup.okhttp.Call tunnelRouteGetTunnelRouteByIpValidateBeforeCall(String ip, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ip' is set
        if (ip == null) {
            throw new ApiException("Missing the required parameter 'ip' when calling tunnelRouteGetTunnelRouteByIp(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelRouteGetTunnelRouteByIp(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelRouteGetTunnelRouteByIpCall(ip, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get tunnel route by IP
     * Fetches routes that contain the given IP address.
     * @param ip  (required)
     * @param accountIdentifier  (required)
     * @return RouteResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RouteResponseSingle tunnelRouteGetTunnelRouteByIp(String ip, String accountIdentifier) throws ApiException {
        ApiResponse<RouteResponseSingle> resp = tunnelRouteGetTunnelRouteByIpWithHttpInfo(ip, accountIdentifier);
        return resp.getData();
    }

    /**
     * Get tunnel route by IP
     * Fetches routes that contain the given IP address.
     * @param ip  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;RouteResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RouteResponseSingle> tunnelRouteGetTunnelRouteByIpWithHttpInfo(String ip, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelRouteGetTunnelRouteByIpValidateBeforeCall(ip, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get tunnel route by IP (asynchronously)
     * Fetches routes that contain the given IP address.
     * @param ip  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteGetTunnelRouteByIpAsync(String ip, String accountIdentifier, final ApiCallback<RouteResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelRouteGetTunnelRouteByIpValidateBeforeCall(ip, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tunnelRouteListTunnelRoutes
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteListTunnelRoutesCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/routes"
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
    private com.squareup.okhttp.Call tunnelRouteListTunnelRoutesValidateBeforeCall(String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelRouteListTunnelRoutes(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelRouteListTunnelRoutesCall(accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List tunnel routes
     * Lists and filters private network routes in an account.
     * @param accountIdentifier  (required)
     * @return RouteResponseCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RouteResponseCollection tunnelRouteListTunnelRoutes(String accountIdentifier) throws ApiException {
        ApiResponse<RouteResponseCollection> resp = tunnelRouteListTunnelRoutesWithHttpInfo(accountIdentifier);
        return resp.getData();
    }

    /**
     * List tunnel routes
     * Lists and filters private network routes in an account.
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;RouteResponseCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RouteResponseCollection> tunnelRouteListTunnelRoutesWithHttpInfo(String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelRouteListTunnelRoutesValidateBeforeCall(accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RouteResponseCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List tunnel routes (asynchronously)
     * Lists and filters private network routes in an account.
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteListTunnelRoutesAsync(String accountIdentifier, final ApiCallback<RouteResponseCollection> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelRouteListTunnelRoutesValidateBeforeCall(accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RouteResponseCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for tunnelRouteUpdateATunnelRoute
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteUpdateATunnelRouteCall(NetworkIpNetworkEncodedBody2 body, String ipNetworkEncoded, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_identifier}/teamnet/routes/network/{ip_network_encoded}"
            .replaceAll("\\{" + "ip_network_encoded" + "\\}", apiClient.escapeString(ipNetworkEncoded.toString()))
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
    private com.squareup.okhttp.Call tunnelRouteUpdateATunnelRouteValidateBeforeCall(NetworkIpNetworkEncodedBody2 body, String ipNetworkEncoded, String accountIdentifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling tunnelRouteUpdateATunnelRoute(Async)");
        }
        // verify the required parameter 'ipNetworkEncoded' is set
        if (ipNetworkEncoded == null) {
            throw new ApiException("Missing the required parameter 'ipNetworkEncoded' when calling tunnelRouteUpdateATunnelRoute(Async)");
        }
        // verify the required parameter 'accountIdentifier' is set
        if (accountIdentifier == null) {
            throw new ApiException("Missing the required parameter 'accountIdentifier' when calling tunnelRouteUpdateATunnelRoute(Async)");
        }
        
        com.squareup.okhttp.Call call = tunnelRouteUpdateATunnelRouteCall(body, ipNetworkEncoded, accountIdentifier, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a tunnel route
     * Updates an existing private network route in an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @return RouteResponseSingle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RouteResponseSingle tunnelRouteUpdateATunnelRoute(NetworkIpNetworkEncodedBody2 body, String ipNetworkEncoded, String accountIdentifier) throws ApiException {
        ApiResponse<RouteResponseSingle> resp = tunnelRouteUpdateATunnelRouteWithHttpInfo(body, ipNetworkEncoded, accountIdentifier);
        return resp.getData();
    }

    /**
     * Update a tunnel route
     * Updates an existing private network route in an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @return ApiResponse&lt;RouteResponseSingle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RouteResponseSingle> tunnelRouteUpdateATunnelRouteWithHttpInfo(NetworkIpNetworkEncodedBody2 body, String ipNetworkEncoded, String accountIdentifier) throws ApiException {
        com.squareup.okhttp.Call call = tunnelRouteUpdateATunnelRouteValidateBeforeCall(body, ipNetworkEncoded, accountIdentifier, null, null);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a tunnel route (asynchronously)
     * Updates an existing private network route in an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.
     * @param body  (required)
     * @param ipNetworkEncoded  (required)
     * @param accountIdentifier  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tunnelRouteUpdateATunnelRouteAsync(NetworkIpNetworkEncodedBody2 body, String ipNetworkEncoded, String accountIdentifier, final ApiCallback<RouteResponseSingle> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = tunnelRouteUpdateATunnelRouteValidateBeforeCall(body, ipNetworkEncoded, accountIdentifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RouteResponseSingle>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
