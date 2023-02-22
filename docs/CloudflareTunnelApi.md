# CloudflareTunnelApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudflareTunnelCleanUpCloudflareTunnelConnections**](CloudflareTunnelApi.md#cloudflareTunnelCleanUpCloudflareTunnelConnections) | **DELETE** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id}/connections | Clean up Cloudflare Tunnel connections
[**cloudflareTunnelCreateACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelCreateACloudflareTunnel) | **POST** /accounts/{account_identifier}/cfd_tunnel | Create a Cloudflare Tunnel
[**cloudflareTunnelDeleteACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelDeleteACloudflareTunnel) | **DELETE** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id} | Delete a Cloudflare Tunnel
[**cloudflareTunnelGetACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelGetACloudflareTunnel) | **GET** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id} | Get a Cloudflare Tunnel
[**cloudflareTunnelGetACloudflareTunnelToken**](CloudflareTunnelApi.md#cloudflareTunnelGetACloudflareTunnelToken) | **GET** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id}/token | Get a Cloudflare Tunnel token
[**cloudflareTunnelListCloudflareTunnelConnections**](CloudflareTunnelApi.md#cloudflareTunnelListCloudflareTunnelConnections) | **GET** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id}/connections | List Cloudflare Tunnel connections
[**cloudflareTunnelListCloudflareTunnels**](CloudflareTunnelApi.md#cloudflareTunnelListCloudflareTunnels) | **GET** /accounts/{account_identifier}/cfd_tunnel | List Cloudflare Tunnels
[**cloudflareTunnelUpdateACloudflareTunnel**](CloudflareTunnelApi.md#cloudflareTunnelUpdateACloudflareTunnel) | **PATCH** /accounts/{account_identifier}/cfd_tunnel/{tunnel_id} | Update a Cloudflare Tunnel

<a name="cloudflareTunnelCleanUpCloudflareTunnelConnections"></a>
# **cloudflareTunnelCleanUpCloudflareTunnelConnections**
> CloudflareTunnelComponentsSchemasEmptyResponse cloudflareTunnelCleanUpCloudflareTunnelConnections(body, tunnelId, accountIdentifier)

Clean up Cloudflare Tunnel connections

Removes connections that are in a disconnected or pending reconnect state. We recommend running this command after shutting down a tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
Object body = null; // Object | 
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CloudflareTunnelComponentsSchemasEmptyResponse result = apiInstance.cloudflareTunnelCleanUpCloudflareTunnelConnections(body, tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelCleanUpCloudflareTunnelConnections");
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

[**CloudflareTunnelComponentsSchemasEmptyResponse**](CloudflareTunnelComponentsSchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareTunnelCreateACloudflareTunnel"></a>
# **cloudflareTunnelCreateACloudflareTunnel**
> SchemasTunnelResponseSingle cloudflareTunnelCreateACloudflareTunnel(body, accountIdentifier)

Create a Cloudflare Tunnel

Creates a new Cloudflare Tunnel in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
AccountIdentifierCfdTunnelBody body = new AccountIdentifierCfdTunnelBody(); // AccountIdentifierCfdTunnelBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelResponseSingle result = apiInstance.cloudflareTunnelCreateACloudflareTunnel(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelCreateACloudflareTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountIdentifierCfdTunnelBody**](AccountIdentifierCfdTunnelBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelResponseSingle**](SchemasTunnelResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareTunnelDeleteACloudflareTunnel"></a>
# **cloudflareTunnelDeleteACloudflareTunnel**
> SchemasTunnelResponseSingle cloudflareTunnelDeleteACloudflareTunnel(body, tunnelId, accountIdentifier)

Delete a Cloudflare Tunnel

Deletes a Cloudflare Tunnel from an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
Object body = null; // Object | 
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelResponseSingle result = apiInstance.cloudflareTunnelDeleteACloudflareTunnel(body, tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelDeleteACloudflareTunnel");
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

[**SchemasTunnelResponseSingle**](SchemasTunnelResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareTunnelGetACloudflareTunnel"></a>
# **cloudflareTunnelGetACloudflareTunnel**
> SchemasTunnelResponseSingle cloudflareTunnelGetACloudflareTunnel(tunnelId, accountIdentifier)

Get a Cloudflare Tunnel

Fetches a single Cloudflare Tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelResponseSingle result = apiInstance.cloudflareTunnelGetACloudflareTunnel(tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetACloudflareTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelResponseSingle**](SchemasTunnelResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareTunnelGetACloudflareTunnelToken"></a>
# **cloudflareTunnelGetACloudflareTunnelToken**
> TunnelResponseToken cloudflareTunnelGetACloudflareTunnelToken(tunnelId, accountIdentifier)

Get a Cloudflare Tunnel token

Gets the token used to associate cloudflared with a specific tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelResponseToken result = apiInstance.cloudflareTunnelGetACloudflareTunnelToken(tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelGetACloudflareTunnelToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelResponseToken**](TunnelResponseToken.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareTunnelListCloudflareTunnelConnections"></a>
# **cloudflareTunnelListCloudflareTunnelConnections**
> TunnelConnectionsResponse cloudflareTunnelListCloudflareTunnelConnections(tunnelId, accountIdentifier)

List Cloudflare Tunnel connections

Fetches connection details for a Cloudflare Tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    TunnelConnectionsResponse result = apiInstance.cloudflareTunnelListCloudflareTunnelConnections(tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelListCloudflareTunnelConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**TunnelConnectionsResponse**](TunnelConnectionsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareTunnelListCloudflareTunnels"></a>
# **cloudflareTunnelListCloudflareTunnels**
> SchemasTunnelResponseCollection cloudflareTunnelListCloudflareTunnels(accountIdentifier)

List Cloudflare Tunnels

Lists and filters Cloudflare Tunnels in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelResponseCollection result = apiInstance.cloudflareTunnelListCloudflareTunnels(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelListCloudflareTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelResponseCollection**](SchemasTunnelResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareTunnelUpdateACloudflareTunnel"></a>
# **cloudflareTunnelUpdateACloudflareTunnel**
> SchemasTunnelResponseSingle cloudflareTunnelUpdateACloudflareTunnel(body, tunnelId, accountIdentifier)

Update a Cloudflare Tunnel

Updates an existing Cloudflare Tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareTunnelApi;

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


CloudflareTunnelApi apiInstance = new CloudflareTunnelApi();
CfdTunnelTunnelIdBody body = new CfdTunnelTunnelIdBody(); // CfdTunnelTunnelIdBody | 
String tunnelId = "tunnelId_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelResponseSingle result = apiInstance.cloudflareTunnelUpdateACloudflareTunnel(body, tunnelId, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareTunnelApi#cloudflareTunnelUpdateACloudflareTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CfdTunnelTunnelIdBody**](CfdTunnelTunnelIdBody.md)|  |
 **tunnelId** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelResponseSingle**](SchemasTunnelResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

