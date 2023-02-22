# ArgoTunnelApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**argoTunnelCleanUpArgoTunnelConnections**](ArgoTunnelApi.md#argoTunnelCleanUpArgoTunnelConnections) | **DELETE** /accounts/{account_identifier}/tunnels/{tunnel_id}/connections | Clean up Argo Tunnel connections
[**argoTunnelCreateAnArgoTunnel**](ArgoTunnelApi.md#argoTunnelCreateAnArgoTunnel) | **POST** /accounts/{account_identifier}/tunnels | Create an Argo Tunnel
[**argoTunnelDeleteAnArgoTunnel**](ArgoTunnelApi.md#argoTunnelDeleteAnArgoTunnel) | **DELETE** /accounts/{account_identifier}/tunnels/{tunnel_id} | Delete an Argo Tunnel
[**argoTunnelGetAnArgoTunnel**](ArgoTunnelApi.md#argoTunnelGetAnArgoTunnel) | **GET** /accounts/{account_identifier}/tunnels/{tunnel_id} | Get an Argo Tunnel
[**argoTunnelListArgoTunnels**](ArgoTunnelApi.md#argoTunnelListArgoTunnels) | **GET** /accounts/{account_identifier}/tunnels | List Argo Tunnels

<a name="argoTunnelCleanUpArgoTunnelConnections"></a>
# **argoTunnelCleanUpArgoTunnelConnections**
> ArgoTunnelComponentsSchemasEmptyResponse argoTunnelCleanUpArgoTunnelConnections(body, tunnelId, accountIdentifier)

Clean up Argo Tunnel connections

Removes connections that are in a disconnected or pending reconnect state. We recommend running this command after shutting down a tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoTunnelApi;

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


ArgoTunnelApi apiInstance = new ArgoTunnelApi();
Object body = null; // Object | 
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ArgoTunnelComponentsSchemasEmptyResponse result = apiInstance.argoTunnelCleanUpArgoTunnelConnections(body, tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoTunnelApi#argoTunnelCleanUpArgoTunnelConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ArgoTunnelComponentsSchemasEmptyResponse**](ArgoTunnelComponentsSchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="argoTunnelCreateAnArgoTunnel"></a>
# **argoTunnelCreateAnArgoTunnel**
> TunnelResponseSingle argoTunnelCreateAnArgoTunnel(body, accountIdentifier)

Create an Argo Tunnel

Creates a new Argo Tunnel in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoTunnelApi;

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


ArgoTunnelApi apiInstance = new ArgoTunnelApi();
AccountIdentifierTunnelsBody body = new AccountIdentifierTunnelsBody(); // AccountIdentifierTunnelsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelResponseSingle result = apiInstance.argoTunnelCreateAnArgoTunnel(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoTunnelApi#argoTunnelCreateAnArgoTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountIdentifierTunnelsBody**](AccountIdentifierTunnelsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelResponseSingle**](TunnelResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="argoTunnelDeleteAnArgoTunnel"></a>
# **argoTunnelDeleteAnArgoTunnel**
> TunnelResponseSingle argoTunnelDeleteAnArgoTunnel(body, tunnelId, accountIdentifier)

Delete an Argo Tunnel

Deletes an Argo Tunnel from an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoTunnelApi;

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


ArgoTunnelApi apiInstance = new ArgoTunnelApi();
Object body = null; // Object | 
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelResponseSingle result = apiInstance.argoTunnelDeleteAnArgoTunnel(body, tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoTunnelApi#argoTunnelDeleteAnArgoTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelResponseSingle**](TunnelResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="argoTunnelGetAnArgoTunnel"></a>
# **argoTunnelGetAnArgoTunnel**
> TunnelResponseSingle argoTunnelGetAnArgoTunnel(tunnelId, accountIdentifier)

Get an Argo Tunnel

Fetches a single Argo Tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoTunnelApi;

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


ArgoTunnelApi apiInstance = new ArgoTunnelApi();
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelResponseSingle result = apiInstance.argoTunnelGetAnArgoTunnel(tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoTunnelApi#argoTunnelGetAnArgoTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelResponseSingle**](TunnelResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="argoTunnelListArgoTunnels"></a>
# **argoTunnelListArgoTunnels**
> TunnelResponseCollection argoTunnelListArgoTunnels(accountIdentifier)

List Argo Tunnels

Lists and filters Argo Tunnels in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoTunnelApi;

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


ArgoTunnelApi apiInstance = new ArgoTunnelApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelResponseCollection result = apiInstance.argoTunnelListArgoTunnels(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoTunnelApi#argoTunnelListArgoTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelResponseCollection**](TunnelResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

