# WorkerTailLogsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerTailLogsDeleteTail**](WorkerTailLogsApi.md#workerTailLogsDeleteTail) | **DELETE** /accounts/{account_identifier}/workers/scripts/{script_name}/tails/{id} | Delete Tail
[**workerTailLogsListTails**](WorkerTailLogsApi.md#workerTailLogsListTails) | **GET** /accounts/{account_identifier}/workers/scripts/{script_name}/tails | List Tails
[**workerTailLogsStartTail**](WorkerTailLogsApi.md#workerTailLogsStartTail) | **POST** /accounts/{account_identifier}/workers/scripts/{script_name}/tails | Start Tail

<a name="workerTailLogsDeleteTail"></a>
# **workerTailLogsDeleteTail**
> ApiResponseCommon workerTailLogsDeleteTail(id, scriptName, accountIdentifier)

Delete Tail

Deletes a tail from a Worker.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerTailLogsApi;

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


WorkerTailLogsApi apiInstance = new WorkerTailLogsApi();
String id = "id_example"; // String | 
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseCommon result = apiInstance.workerTailLogsDeleteTail(id, scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerTailLogsApi#workerTailLogsDeleteTail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseCommon**](ApiResponseCommon.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerTailLogsListTails"></a>
# **workerTailLogsListTails**
> TailResponse workerTailLogsListTails(scriptName, accountIdentifier)

List Tails

Get list of tails currently deployed on a worker.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerTailLogsApi;

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


WorkerTailLogsApi apiInstance = new WorkerTailLogsApi();
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TailResponse result = apiInstance.workerTailLogsListTails(scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerTailLogsApi#workerTailLogsListTails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TailResponse**](TailResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerTailLogsStartTail"></a>
# **workerTailLogsStartTail**
> TailResponse workerTailLogsStartTail(scriptName, accountIdentifier)

Start Tail

Starts a tail that receives logs and exception from a Worker.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerTailLogsApi;

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


WorkerTailLogsApi apiInstance = new WorkerTailLogsApi();
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TailResponse result = apiInstance.workerTailLogsStartTail(scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerTailLogsApi#workerTailLogsStartTail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TailResponse**](TailResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

