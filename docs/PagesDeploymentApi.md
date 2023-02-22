# PagesDeploymentApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagesDeploymentCreateDeployment**](PagesDeploymentApi.md#pagesDeploymentCreateDeployment) | **POST** /accounts/{account_identifier}/pages/projects/{project_name}/deployments | Create deployment
[**pagesDeploymentDeleteDeployment**](PagesDeploymentApi.md#pagesDeploymentDeleteDeployment) | **DELETE** /accounts/{account_identifier}/pages/projects/{project_name}/deployments/{deployment_identifier} | Delete deployment
[**pagesDeploymentGetDeploymentInfo**](PagesDeploymentApi.md#pagesDeploymentGetDeploymentInfo) | **GET** /accounts/{account_identifier}/pages/projects/{project_name}/deployments/{deployment_identifier} | Get deployment info
[**pagesDeploymentGetDeploymentLogs**](PagesDeploymentApi.md#pagesDeploymentGetDeploymentLogs) | **GET** /accounts/{account_identifier}/pages/projects/{project_name}/deployments/{deployment_identifier}/history/logs | Get deployment logs
[**pagesDeploymentGetDeployments**](PagesDeploymentApi.md#pagesDeploymentGetDeployments) | **GET** /accounts/{account_identifier}/pages/projects/{project_name}/deployments | Get deployments
[**pagesDeploymentRetryDeployment**](PagesDeploymentApi.md#pagesDeploymentRetryDeployment) | **POST** /accounts/{account_identifier}/pages/projects/{project_name}/deployments/{deployment_identifier}/retry | Retry deployment
[**pagesDeploymentRollbackDeployment**](PagesDeploymentApi.md#pagesDeploymentRollbackDeployment) | **POST** /accounts/{account_identifier}/pages/projects/{project_name}/deployments/{deployment_identifier}/rollback | Rollback deployment

<a name="pagesDeploymentCreateDeployment"></a>
# **pagesDeploymentCreateDeployment**
> DeploymentNewDeployment pagesDeploymentCreateDeployment(branch, projectName, accountIdentifier)

Create deployment

Start a new deployment from production. The repo/account must have been authorized through the Pages UI dash before.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDeploymentApi;

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


PagesDeploymentApi apiInstance = new PagesDeploymentApi();
String branch = "branch_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentNewDeployment result = apiInstance.pagesDeploymentCreateDeployment(branch, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentCreateDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **branch** | **String**|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentNewDeployment**](DeploymentNewDeployment.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="pagesDeploymentDeleteDeployment"></a>
# **pagesDeploymentDeleteDeployment**
> Object pagesDeploymentDeleteDeployment(deploymentIdentifier, projectName, accountIdentifier)

Delete deployment

Destroy a deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDeploymentApi;

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


PagesDeploymentApi apiInstance = new PagesDeploymentApi();
String deploymentIdentifier = "deploymentIdentifier_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    Object result = apiInstance.pagesDeploymentDeleteDeployment(deploymentIdentifier, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentDeleteDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentIdentifier** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pagesDeploymentGetDeploymentInfo"></a>
# **pagesDeploymentGetDeploymentInfo**
> DeploymentResponseDetails pagesDeploymentGetDeploymentInfo(deploymentIdentifier, projectName, accountIdentifier)

Get deployment info

Fetch a deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDeploymentApi;

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


PagesDeploymentApi apiInstance = new PagesDeploymentApi();
String deploymentIdentifier = "deploymentIdentifier_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentResponseDetails result = apiInstance.pagesDeploymentGetDeploymentInfo(deploymentIdentifier, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentGetDeploymentInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentIdentifier** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentResponseDetails**](DeploymentResponseDetails.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pagesDeploymentGetDeploymentLogs"></a>
# **pagesDeploymentGetDeploymentLogs**
> DeploymentResponseLogs pagesDeploymentGetDeploymentLogs(deploymentIdentifier, projectName, accountIdentifier)

Get deployment logs

Fetch deploy logs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDeploymentApi;

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


PagesDeploymentApi apiInstance = new PagesDeploymentApi();
String deploymentIdentifier = "deploymentIdentifier_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentResponseLogs result = apiInstance.pagesDeploymentGetDeploymentLogs(deploymentIdentifier, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentGetDeploymentLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentIdentifier** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentResponseLogs**](DeploymentResponseLogs.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pagesDeploymentGetDeployments"></a>
# **pagesDeploymentGetDeployments**
> DeploymentListResponse pagesDeploymentGetDeployments(projectName, accountIdentifier)

Get deployments

Fetch a list of deployments from a project.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDeploymentApi;

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


PagesDeploymentApi apiInstance = new PagesDeploymentApi();
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentListResponse result = apiInstance.pagesDeploymentGetDeployments(projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentGetDeployments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentListResponse**](DeploymentListResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pagesDeploymentRetryDeployment"></a>
# **pagesDeploymentRetryDeployment**
> DeploymentNewDeployment pagesDeploymentRetryDeployment(deploymentIdentifier, projectName, accountIdentifier)

Retry deployment

Retry a previous deployment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDeploymentApi;

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


PagesDeploymentApi apiInstance = new PagesDeploymentApi();
String deploymentIdentifier = "deploymentIdentifier_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentNewDeployment result = apiInstance.pagesDeploymentRetryDeployment(deploymentIdentifier, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentRetryDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentIdentifier** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentNewDeployment**](DeploymentNewDeployment.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pagesDeploymentRollbackDeployment"></a>
# **pagesDeploymentRollbackDeployment**
> DeploymentResponseDetails pagesDeploymentRollbackDeployment(deploymentIdentifier, projectName, accountIdentifier)

Rollback deployment

Rollback the production deployment to a previous deploy. You can only rollback to succesful builds on production.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagesDeploymentApi;

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


PagesDeploymentApi apiInstance = new PagesDeploymentApi();
String deploymentIdentifier = "deploymentIdentifier_example"; // String | 
String projectName = "projectName_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeploymentResponseDetails result = apiInstance.pagesDeploymentRollbackDeployment(deploymentIdentifier, projectName, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesDeploymentApi#pagesDeploymentRollbackDeployment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentIdentifier** | [**String**](.md)|  |
 **projectName** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeploymentResponseDetails**](DeploymentResponseDetails.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

