# TunnelVirtualNetworkApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tunnelVirtualNetworkCreateAVirtualNetwork**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkCreateAVirtualNetwork) | **POST** /accounts/{account_identifier}/teamnet/virtual_networks | Create a virtual network
[**tunnelVirtualNetworkDeleteAVirtualNetwork**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkDeleteAVirtualNetwork) | **DELETE** /accounts/{account_identifier}/teamnet/virtual_networks/{vnet_id} | Delete a virtual network
[**tunnelVirtualNetworkListVirtualNetworks**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkListVirtualNetworks) | **GET** /accounts/{account_identifier}/teamnet/virtual_networks | List virtual networks
[**tunnelVirtualNetworkUpdateAVirtualNetwork**](TunnelVirtualNetworkApi.md#tunnelVirtualNetworkUpdateAVirtualNetwork) | **PATCH** /accounts/{account_identifier}/teamnet/virtual_networks/{vnet_id} | Update a virtual network

<a name="tunnelVirtualNetworkCreateAVirtualNetwork"></a>
# **tunnelVirtualNetworkCreateAVirtualNetwork**
> VnetResponseSingle tunnelVirtualNetworkCreateAVirtualNetwork(body, accountIdentifier)

Create a virtual network

Adds a new virtual network to an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelVirtualNetworkApi;

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


TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi();
TeamnetVirtualNetworksBody body = new TeamnetVirtualNetworksBody(); // TeamnetVirtualNetworksBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VnetResponseSingle result = apiInstance.tunnelVirtualNetworkCreateAVirtualNetwork(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkCreateAVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TeamnetVirtualNetworksBody**](TeamnetVirtualNetworksBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VnetResponseSingle**](VnetResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tunnelVirtualNetworkDeleteAVirtualNetwork"></a>
# **tunnelVirtualNetworkDeleteAVirtualNetwork**
> VnetResponseSingle tunnelVirtualNetworkDeleteAVirtualNetwork(vnetId, accountIdentifier)

Delete a virtual network

Deletes an existing virtual network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelVirtualNetworkApi;

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


TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi();
String vnetId = "vnetId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VnetResponseSingle result = apiInstance.tunnelVirtualNetworkDeleteAVirtualNetwork(vnetId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkDeleteAVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vnetId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VnetResponseSingle**](VnetResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tunnelVirtualNetworkListVirtualNetworks"></a>
# **tunnelVirtualNetworkListVirtualNetworks**
> VnetResponseCollection tunnelVirtualNetworkListVirtualNetworks(accountIdentifier)

List virtual networks

Lists and filters virtual networks in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelVirtualNetworkApi;

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


TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VnetResponseCollection result = apiInstance.tunnelVirtualNetworkListVirtualNetworks(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkListVirtualNetworks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VnetResponseCollection**](VnetResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tunnelVirtualNetworkUpdateAVirtualNetwork"></a>
# **tunnelVirtualNetworkUpdateAVirtualNetwork**
> VnetResponseSingle tunnelVirtualNetworkUpdateAVirtualNetwork(body, vnetId, accountIdentifier)

Update a virtual network

Updates an existing virtual network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelVirtualNetworkApi;

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


TunnelVirtualNetworkApi apiInstance = new TunnelVirtualNetworkApi();
VirtualNetworksVnetIdBody body = new VirtualNetworksVnetIdBody(); // VirtualNetworksVnetIdBody | 
String vnetId = "vnetId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VnetResponseSingle result = apiInstance.tunnelVirtualNetworkUpdateAVirtualNetwork(body, vnetId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelVirtualNetworkApi#tunnelVirtualNetworkUpdateAVirtualNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VirtualNetworksVnetIdBody**](VirtualNetworksVnetIdBody.md)|  |
 **vnetId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VnetResponseSingle**](VnetResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

