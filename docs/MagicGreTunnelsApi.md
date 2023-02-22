# MagicGreTunnelsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**magicGreTunnelsCreateGreTunnels**](MagicGreTunnelsApi.md#magicGreTunnelsCreateGreTunnels) | **POST** /accounts/{account_identifier}/magic/gre_tunnels | Create GRE tunnels
[**magicGreTunnelsDeleteGreTunnel**](MagicGreTunnelsApi.md#magicGreTunnelsDeleteGreTunnel) | **DELETE** /accounts/{account_identifier}/magic/gre_tunnels/{tunnel_identifier} | Delete GRE Tunnel
[**magicGreTunnelsListGreTunnelDetails**](MagicGreTunnelsApi.md#magicGreTunnelsListGreTunnelDetails) | **GET** /accounts/{account_identifier}/magic/gre_tunnels/{tunnel_identifier} | List GRE Tunnel Details
[**magicGreTunnelsListGreTunnels**](MagicGreTunnelsApi.md#magicGreTunnelsListGreTunnels) | **GET** /accounts/{account_identifier}/magic/gre_tunnels | List GRE tunnels
[**magicGreTunnelsUpdateGreTunnel**](MagicGreTunnelsApi.md#magicGreTunnelsUpdateGreTunnel) | **PUT** /accounts/{account_identifier}/magic/gre_tunnels/{tunnel_identifier} | Update GRE Tunnel
[**magicGreTunnelsUpdateMultipleGreTunnels**](MagicGreTunnelsApi.md#magicGreTunnelsUpdateMultipleGreTunnels) | **PUT** /accounts/{account_identifier}/magic/gre_tunnels | Update multiple GRE tunnels

<a name="magicGreTunnelsCreateGreTunnels"></a>
# **magicGreTunnelsCreateGreTunnels**
> TunnelsCollectionResponse magicGreTunnelsCreateGreTunnels(body, accountIdentifier)

Create GRE tunnels

Creates new GRE tunnels. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicGreTunnelsApi;

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


MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelsCollectionResponse result = apiInstance.magicGreTunnelsCreateGreTunnels(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsCreateGreTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelsCollectionResponse**](TunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicGreTunnelsDeleteGreTunnel"></a>
# **magicGreTunnelsDeleteGreTunnel**
> TunnelDeletedResponse magicGreTunnelsDeleteGreTunnel(tunnelIdentifier, accountIdentifier)

Delete GRE Tunnel

Disables and removes a specific static GRE tunnel. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicGreTunnelsApi;

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


MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi();
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelDeletedResponse result = apiInstance.magicGreTunnelsDeleteGreTunnel(tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsDeleteGreTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelDeletedResponse**](TunnelDeletedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicGreTunnelsListGreTunnelDetails"></a>
# **magicGreTunnelsListGreTunnelDetails**
> TunnelSingleResponse magicGreTunnelsListGreTunnelDetails(tunnelIdentifier, accountIdentifier)

List GRE Tunnel Details

Lists informtion for a specific GRE tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicGreTunnelsApi;

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


MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi();
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelSingleResponse result = apiInstance.magicGreTunnelsListGreTunnelDetails(tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsListGreTunnelDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelSingleResponse**](TunnelSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicGreTunnelsListGreTunnels"></a>
# **magicGreTunnelsListGreTunnels**
> TunnelsCollectionResponse magicGreTunnelsListGreTunnels(accountIdentifier)

List GRE tunnels

Lists GRE tunnels associated with an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicGreTunnelsApi;

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


MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelsCollectionResponse result = apiInstance.magicGreTunnelsListGreTunnels(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsListGreTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelsCollectionResponse**](TunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicGreTunnelsUpdateGreTunnel"></a>
# **magicGreTunnelsUpdateGreTunnel**
> TunnelModifiedResponse magicGreTunnelsUpdateGreTunnel(body, tunnelIdentifier, accountIdentifier)

Update GRE Tunnel

Updates a specific GRE tunnel. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicGreTunnelsApi;

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


MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi();
TunnelUpdateRequest body = new TunnelUpdateRequest(); // TunnelUpdateRequest | 
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelModifiedResponse result = apiInstance.magicGreTunnelsUpdateGreTunnel(body, tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsUpdateGreTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TunnelUpdateRequest**](TunnelUpdateRequest.md)|  |
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelModifiedResponse**](TunnelModifiedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicGreTunnelsUpdateMultipleGreTunnels"></a>
# **magicGreTunnelsUpdateMultipleGreTunnels**
> ModifiedTunnelsCollectionResponse magicGreTunnelsUpdateMultipleGreTunnels(body, accountIdentifier)

Update multiple GRE tunnels

Updates multiple GRE tunnels. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicGreTunnelsApi;

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


MagicGreTunnelsApi apiInstance = new MagicGreTunnelsApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ModifiedTunnelsCollectionResponse result = apiInstance.magicGreTunnelsUpdateMultipleGreTunnels(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicGreTunnelsApi#magicGreTunnelsUpdateMultipleGreTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ModifiedTunnelsCollectionResponse**](ModifiedTunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

