# WorkerCronTriggerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerCronTriggerGetCronTriggers**](WorkerCronTriggerApi.md#workerCronTriggerGetCronTriggers) | **GET** /accounts/{account_identifier}/workers/scripts/{script_name}/schedules | Get Cron Triggers
[**workerCronTriggerUpdateCronTriggers**](WorkerCronTriggerApi.md#workerCronTriggerUpdateCronTriggers) | **PUT** /accounts/{account_identifier}/workers/scripts/{script_name}/schedules | Update Cron Triggers

<a name="workerCronTriggerGetCronTriggers"></a>
# **workerCronTriggerGetCronTriggers**
> CronTriggerResponseCollection workerCronTriggerGetCronTriggers(scriptName, accountIdentifier)

Get Cron Triggers

Fetches Cron Triggers for a Worker.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerCronTriggerApi;

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


WorkerCronTriggerApi apiInstance = new WorkerCronTriggerApi();
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CronTriggerResponseCollection result = apiInstance.workerCronTriggerGetCronTriggers(scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerCronTriggerApi#workerCronTriggerGetCronTriggers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CronTriggerResponseCollection**](CronTriggerResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerCronTriggerUpdateCronTriggers"></a>
# **workerCronTriggerUpdateCronTriggers**
> CronTriggerResponseCollection workerCronTriggerUpdateCronTriggers(body, scriptName, accountIdentifier)

Update Cron Triggers

Updates Cron Triggers for a Worker.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerCronTriggerApi;

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


WorkerCronTriggerApi apiInstance = new WorkerCronTriggerApi();
Object body = null; // Object | 
String scriptName = "scriptName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CronTriggerResponseCollection result = apiInstance.workerCronTriggerUpdateCronTriggers(body, scriptName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerCronTriggerApi#workerCronTriggerUpdateCronTriggers");
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

[**CronTriggerResponseCollection**](CronTriggerResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

