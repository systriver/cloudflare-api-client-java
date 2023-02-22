# WorkerSubdomainApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerSubdomainCreateSubdomain**](WorkerSubdomainApi.md#workerSubdomainCreateSubdomain) | **PUT** /accounts/{account_identifier}/workers/subdomain | Create Subdomain
[**workerSubdomainGetSubdomain**](WorkerSubdomainApi.md#workerSubdomainGetSubdomain) | **GET** /accounts/{account_identifier}/workers/subdomain | Get Subdomain

<a name="workerSubdomainCreateSubdomain"></a>
# **workerSubdomainCreateSubdomain**
> SubdomainResponse workerSubdomainCreateSubdomain(body, accountIdentifier)

Create Subdomain

Creates a Workers subdomain for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerSubdomainApi;

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


WorkerSubdomainApi apiInstance = new WorkerSubdomainApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SubdomainResponse result = apiInstance.workerSubdomainCreateSubdomain(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerSubdomainApi#workerSubdomainCreateSubdomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SubdomainResponse**](SubdomainResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerSubdomainGetSubdomain"></a>
# **workerSubdomainGetSubdomain**
> SubdomainResponse workerSubdomainGetSubdomain(accountIdentifier)

Get Subdomain

Returns a Workers subdomain for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerSubdomainApi;

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


WorkerSubdomainApi apiInstance = new WorkerSubdomainApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SubdomainResponse result = apiInstance.workerSubdomainGetSubdomain(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerSubdomainApi#workerSubdomainGetSubdomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SubdomainResponse**](SubdomainResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

