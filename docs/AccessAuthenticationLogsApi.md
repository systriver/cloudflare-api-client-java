# AccessAuthenticationLogsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessAuthenticationLogsGetAccessAuthenticationLogs**](AccessAuthenticationLogsApi.md#accessAuthenticationLogsGetAccessAuthenticationLogs) | **GET** /accounts/{identifier}/access/logs/access_requests | Get Access authentication logs

<a name="accessAuthenticationLogsGetAccessAuthenticationLogs"></a>
# **accessAuthenticationLogsGetAccessAuthenticationLogs**
> AccessRequestsComponentsSchemasResponseCollection accessAuthenticationLogsGetAccessAuthenticationLogs(identifier)

Get Access authentication logs

Gets a list of Access authentication audit logs for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessAuthenticationLogsApi;

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


AccessAuthenticationLogsApi apiInstance = new AccessAuthenticationLogsApi();
AccessRequestsComponentsSchemasIdentifier identifier = new AccessRequestsComponentsSchemasIdentifier(); // AccessRequestsComponentsSchemasIdentifier | 
try {
    AccessRequestsComponentsSchemasResponseCollection result = apiInstance.accessAuthenticationLogsGetAccessAuthenticationLogs(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessAuthenticationLogsApi#accessAuthenticationLogsGetAccessAuthenticationLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AccessRequestsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**AccessRequestsComponentsSchemasResponseCollection**](AccessRequestsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

