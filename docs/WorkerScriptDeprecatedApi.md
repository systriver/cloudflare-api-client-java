# WorkerScriptDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerScriptDeprecatedDeleteWorker**](WorkerScriptDeprecatedApi.md#workerScriptDeprecatedDeleteWorker) | **DELETE** /zones/{zone_identifier}/workers/script | Delete Worker
[**workerScriptDeprecatedDownloadWorker**](WorkerScriptDeprecatedApi.md#workerScriptDeprecatedDownloadWorker) | **GET** /zones/{zone_identifier}/workers/script | Download Worker
[**workerScriptDeprecatedUploadWorker**](WorkerScriptDeprecatedApi.md#workerScriptDeprecatedUploadWorker) | **PUT** /zones/{zone_identifier}/workers/script | Upload Worker

<a name="workerScriptDeprecatedDeleteWorker"></a>
# **workerScriptDeprecatedDeleteWorker**
> workerScriptDeprecatedDeleteWorker(zoneIdentifier)

Delete Worker

Delete your worker. This call has no response body on a successful delete.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptDeprecatedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


WorkerScriptDeprecatedApi apiInstance = new WorkerScriptDeprecatedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    apiInstance.workerScriptDeprecatedDeleteWorker(zoneIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptDeprecatedApi#workerScriptDeprecatedDeleteWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerScriptDeprecatedDownloadWorker"></a>
# **workerScriptDeprecatedDownloadWorker**
> Object workerScriptDeprecatedDownloadWorker(zoneIdentifier)

Download Worker

Fetch raw script content for your worker. Note this is the original script content, not JSON encoded.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptDeprecatedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


WorkerScriptDeprecatedApi apiInstance = new WorkerScriptDeprecatedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    Object result = apiInstance.workerScriptDeprecatedDownloadWorker(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptDeprecatedApi#workerScriptDeprecatedDownloadWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: undefined

<a name="workerScriptDeprecatedUploadWorker"></a>
# **workerScriptDeprecatedUploadWorker**
> ScriptResponseSingle workerScriptDeprecatedUploadWorker(body, zoneIdentifier)

Upload Worker

Upload a worker, or a new version of a worker.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptDeprecatedApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_email
ApiKeyAuth api_email = (ApiKeyAuth) defaultClient.getAuthentication("api_email");
api_email.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_email.setApiKeyPrefix("Token");

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");


WorkerScriptDeprecatedApi apiInstance = new WorkerScriptDeprecatedApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ScriptResponseSingle result = apiInstance.workerScriptDeprecatedUploadWorker(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptDeprecatedApi#workerScriptDeprecatedUploadWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ScriptResponseSingle**](ScriptResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/javascript
 - **Accept**: application/json

