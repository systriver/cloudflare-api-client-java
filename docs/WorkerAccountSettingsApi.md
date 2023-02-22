# WorkerAccountSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerAccountSettingsCreateWorkerAccountSettings**](WorkerAccountSettingsApi.md#workerAccountSettingsCreateWorkerAccountSettings) | **PUT** /accounts/{account_identifier}/workers/account-settings | Create Worker Account Settings
[**workerAccountSettingsFetchWorkerAccountSettings**](WorkerAccountSettingsApi.md#workerAccountSettingsFetchWorkerAccountSettings) | **GET** /accounts/{account_identifier}/workers/account-settings | Fetch Worker Account Settings

<a name="workerAccountSettingsCreateWorkerAccountSettings"></a>
# **workerAccountSettingsCreateWorkerAccountSettings**
> AccountSettingsResponse workerAccountSettingsCreateWorkerAccountSettings(body, accountIdentifier)

Create Worker Account Settings

Creates Worker Account Settings for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerAccountSettingsApi;

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


WorkerAccountSettingsApi apiInstance = new WorkerAccountSettingsApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AccountSettingsResponse result = apiInstance.workerAccountSettingsCreateWorkerAccountSettings(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerAccountSettingsApi#workerAccountSettingsCreateWorkerAccountSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AccountSettingsResponse**](AccountSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerAccountSettingsFetchWorkerAccountSettings"></a>
# **workerAccountSettingsFetchWorkerAccountSettings**
> AccountSettingsResponse workerAccountSettingsFetchWorkerAccountSettings(accountIdentifier)

Fetch Worker Account Settings

Fetches Worker Account Settings for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerAccountSettingsApi;

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


WorkerAccountSettingsApi apiInstance = new WorkerAccountSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AccountSettingsResponse result = apiInstance.workerAccountSettingsFetchWorkerAccountSettings(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerAccountSettingsApi#workerAccountSettingsFetchWorkerAccountSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AccountSettingsResponse**](AccountSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

