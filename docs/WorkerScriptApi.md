# WorkerScriptApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerScriptDeleteWorker**](WorkerScriptApi.md#workerScriptDeleteWorker) | **DELETE** /accounts/{account_identifier}/workers/scripts/{script_name} | Delete Worker
[**workerScriptDownloadWorker**](WorkerScriptApi.md#workerScriptDownloadWorker) | **GET** /accounts/{account_identifier}/workers/scripts/{script_name} | Download Worker
[**workerScriptFetchUsageModel**](WorkerScriptApi.md#workerScriptFetchUsageModel) | **GET** /accounts/{account_identifier}/workers/scripts/{script_name}/usage-model | Fetch Usage Model
[**workerScriptListWorkers**](WorkerScriptApi.md#workerScriptListWorkers) | **GET** /accounts/{account_identifier}/workers/scripts | List Workers
[**workerScriptUpdateUsageModel**](WorkerScriptApi.md#workerScriptUpdateUsageModel) | **PUT** /accounts/{account_identifier}/workers/scripts/{script_name}/usage-model | Update Usage Model
[**workerScriptUploadWorkerModule**](WorkerScriptApi.md#workerScriptUploadWorkerModule) | **PUT** /accounts/{account_identifier}/workers/scripts/{script_name} | Upload Worker Module

<a name="workerScriptDeleteWorker"></a>
# **workerScriptDeleteWorker**
> workerScriptDeleteWorker(scriptName, accountIdentifier)

Delete Worker

Delete your worker. This call has no response body on a successful delete.  **Query paramaters**:  1.  &#x60;force&#x60;: boolean;   If set to true, delete will not be stopped by associated service binding, durable object, or other binding. Any of these associated bindings/durable objects will be deleted along with the script.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptApi;

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


WorkerScriptApi apiInstance = new WorkerScriptApi();
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.workerScriptDeleteWorker(scriptName, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptApi#workerScriptDeleteWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerScriptDownloadWorker"></a>
# **workerScriptDownloadWorker**
> Object workerScriptDownloadWorker(scriptName, accountIdentifier)

Download Worker

Fetch raw script content for your worker. Note this is the original script content, not JSON encoded.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptApi;

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


WorkerScriptApi apiInstance = new WorkerScriptApi();
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    Object result = apiInstance.workerScriptDownloadWorker(scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptApi#workerScriptDownloadWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: undefined

<a name="workerScriptFetchUsageModel"></a>
# **workerScriptFetchUsageModel**
> UsageModelResponse workerScriptFetchUsageModel(scriptName, accountIdentifier)

Fetch Usage Model

Fetches the Usage Model for a given Worker.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptApi;

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


WorkerScriptApi apiInstance = new WorkerScriptApi();
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    UsageModelResponse result = apiInstance.workerScriptFetchUsageModel(scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptApi#workerScriptFetchUsageModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**UsageModelResponse**](UsageModelResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerScriptListWorkers"></a>
# **workerScriptListWorkers**
> ScriptResponseCollection workerScriptListWorkers(accountIdentifier)

List Workers

Fetch a list of uploaded workers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptApi;

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


WorkerScriptApi apiInstance = new WorkerScriptApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ScriptResponseCollection result = apiInstance.workerScriptListWorkers(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptApi#workerScriptListWorkers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ScriptResponseCollection**](ScriptResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerScriptUpdateUsageModel"></a>
# **workerScriptUpdateUsageModel**
> UsageModelResponse workerScriptUpdateUsageModel(body, scriptName, accountIdentifier)

Update Usage Model

Updates the Usage Model for a given Worker. Requires a Workers Paid subscription.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptApi;

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


WorkerScriptApi apiInstance = new WorkerScriptApi();
Object body = null; // Object | 
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    UsageModelResponse result = apiInstance.workerScriptUpdateUsageModel(body, scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptApi#workerScriptUpdateUsageModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**UsageModelResponse**](UsageModelResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerScriptUploadWorkerModule"></a>
# **workerScriptUploadWorkerModule**
> Object workerScriptUploadWorkerModule(secondFileJs, workerJs, metadata, scriptName, accountIdentifier)

Upload Worker Module

Upload a worker module.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerScriptApi;

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


WorkerScriptApi apiInstance = new WorkerScriptApi();
String secondFileJs = "secondFileJs_example"; // String | 
String workerJs = "workerJs_example"; // String | 
String metadata = "metadata_example"; // String | 
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    Object result = apiInstance.workerScriptUploadWorkerModule(secondFileJs, workerJs, metadata, scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerScriptApi#workerScriptUploadWorkerModule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **secondFileJs** | **String**|  |
 **workerJs** | **String**|  |
 **metadata** | **String**|  |
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

