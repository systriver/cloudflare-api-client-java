# CloudflareTunnelConfigurationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudflareTunnelConfigurationGetConfiguration**](CloudflareTunnelConfigurationApi.md#cloudflareTunnelConfigurationGetConfiguration) | **GET** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id}/configurations | Get configuration
[**cloudflareTunnelConfigurationPutConfiguration**](CloudflareTunnelConfigurationApi.md#cloudflareTunnelConfigurationPutConfiguration) | **PUT** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id}/configurations | Put configuration

<a name="cloudflareTunnelConfigurationGetConfiguration"></a>
# **cloudflareTunnelConfigurationGetConfiguration**
> ConfigResponseSingle cloudflareTunnelConfigurationGetConfiguration(tunnelId, accountIdentifier)

Get configuration

Gets the configuration for a remotely-managed tunnel

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelConfigurationApi;

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


CloudflareTunnelConfigurationApi apiInstance = new CloudflareTunnelConfigurationApi();
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ConfigResponseSingle result = apiInstance.cloudflareTunnelConfigurationGetConfiguration(tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelConfigurationApi#cloudflareTunnelConfigurationGetConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ConfigResponseSingle**](ConfigResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareTunnelConfigurationPutConfiguration"></a>
# **cloudflareTunnelConfigurationPutConfiguration**
> ConfigResponseSingle cloudflareTunnelConfigurationPutConfiguration(body, tunnelId, accountIdentifier)

Put configuration

Adds or updates the configuration for a remotely-managed tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelConfigurationApi;

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


CloudflareTunnelConfigurationApi apiInstance = new CloudflareTunnelConfigurationApi();
TunnelIdConfigurationsBody body = new TunnelIdConfigurationsBody(); // TunnelIdConfigurationsBody | 
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ConfigResponseSingle result = apiInstance.cloudflareTunnelConfigurationPutConfiguration(body, tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelConfigurationApi#cloudflareTunnelConfigurationPutConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TunnelIdConfigurationsBody**](TunnelIdConfigurationsBody.md)|  |
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ConfigResponseSingle**](ConfigResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

