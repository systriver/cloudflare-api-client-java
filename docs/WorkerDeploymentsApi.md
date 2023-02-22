# WorkerDeploymentsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerDeploymentsGetDeploymentDetail**](WorkerDeploymentsApi.md#workerDeploymentsGetDeploymentDetail) | **GET** /accounts/{account_identifier}/workers/deployments/by-script/{script_identifier}/detail/{deployment_identifier} | Get Deployment Detail
[**workerDeploymentsListDeployments**](WorkerDeploymentsApi.md#workerDeploymentsListDeployments) | **GET** /accounts/{account_identifier}/workers/deployments/by-script/{script_identifier} | List Deployments

<a name="workerDeploymentsGetDeploymentDetail"></a>
# **workerDeploymentsGetDeploymentDetail**
> DeploymentsSingleResponse workerDeploymentsGetDeploymentDetail(deploymentIdentifier, scriptIdentifier, accountIdentifier)

Get Deployment Detail

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerDeploymentsApi;

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


WorkerDeploymentsApi apiInstance = new WorkerDeploymentsApi();
String deploymentIdentifier = "deploymentIdentifier_example"; // String | 
String scriptIdentifier = "scriptIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentsSingleResponse result = apiInstance.workerDeploymentsGetDeploymentDetail(deploymentIdentifier, scriptIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerDeploymentsApi#workerDeploymentsGetDeploymentDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentIdentifier** | [**String**](.md)|  |
 **scriptIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentsSingleResponse**](DeploymentsSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerDeploymentsListDeployments"></a>
# **workerDeploymentsListDeployments**
> DeploymentsListResponse workerDeploymentsListDeployments(scriptIdentifier, accountIdentifier)

List Deployments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerDeploymentsApi;

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


WorkerDeploymentsApi apiInstance = new WorkerDeploymentsApi();
String scriptIdentifier = "scriptIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentsListResponse result = apiInstance.workerDeploymentsListDeployments(scriptIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerDeploymentsApi#workerDeploymentsListDeployments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scriptIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentsListResponse**](DeploymentsListResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

