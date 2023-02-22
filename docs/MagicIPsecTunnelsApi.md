# MagicIPsecTunnelsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**magicIPsecTunnelsCreateIPsecTunnels**](MagicIPsecTunnelsApi.md#magicIPsecTunnelsCreateIPsecTunnels) | **POST** /accounts/{account_identifier}/magic/ipsec_tunnels | Create IPsec tunnels
[**magicIPsecTunnelsDeleteIPsecTunnel**](MagicIPsecTunnelsApi.md#magicIPsecTunnelsDeleteIPsecTunnel) | **DELETE** /accounts/{account_identifier}/magic/ipsec_tunnels/{tunnel_identifier} | Delete IPsec Tunnel
[**magicIPsecTunnelsGeneratePreSharedKeyPskForIPsecTunnels**](MagicIPsecTunnelsApi.md#magicIPsecTunnelsGeneratePreSharedKeyPskForIPsecTunnels) | **POST** /accounts/{account_identifier}/magic/ipsec_tunnels/{tunnel_identifier}/psk_generate | Generate Pre Shared Key (PSK) for IPsec tunnels
[**magicIPsecTunnelsListIPsecTunnelDetails**](MagicIPsecTunnelsApi.md#magicIPsecTunnelsListIPsecTunnelDetails) | **GET** /accounts/{account_identifier}/magic/ipsec_tunnels/{tunnel_identifier} | List IPsec tunnel details
[**magicIPsecTunnelsListIPsecTunnels**](MagicIPsecTunnelsApi.md#magicIPsecTunnelsListIPsecTunnels) | **GET** /accounts/{account_identifier}/magic/ipsec_tunnels | List IPsec tunnels
[**magicIPsecTunnelsUpdateIPsecTunnel**](MagicIPsecTunnelsApi.md#magicIPsecTunnelsUpdateIPsecTunnel) | **PUT** /accounts/{account_identifier}/magic/ipsec_tunnels/{tunnel_identifier} | Update IPsec Tunnel
[**magicIPsecTunnelsUpdateMultipleIPsecTunnels**](MagicIPsecTunnelsApi.md#magicIPsecTunnelsUpdateMultipleIPsecTunnels) | **PUT** /accounts/{account_identifier}/magic/ipsec_tunnels | Update multiple IPsec tunnels

<a name="magicIPsecTunnelsCreateIPsecTunnels"></a>
# **magicIPsecTunnelsCreateIPsecTunnels**
> SchemasTunnelsCollectionResponse magicIPsecTunnelsCreateIPsecTunnels(body, accountIdentifier)

Create IPsec tunnels

Creates new IPsec tunnels associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicIPsecTunnelsApi;

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


MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelsCollectionResponse result = apiInstance.magicIPsecTunnelsCreateIPsecTunnels(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIPsecTunnelsCreateIPsecTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelsCollectionResponse**](SchemasTunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicIPsecTunnelsDeleteIPsecTunnel"></a>
# **magicIPsecTunnelsDeleteIPsecTunnel**
> SchemasTunnelDeletedResponse magicIPsecTunnelsDeleteIPsecTunnel(tunnelIdentifier, accountIdentifier)

Delete IPsec Tunnel

Disables and removes a specific static IPsec Tunnel associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicIPsecTunnelsApi;

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


MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi();
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelDeletedResponse result = apiInstance.magicIPsecTunnelsDeleteIPsecTunnel(tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIPsecTunnelsDeleteIPsecTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelDeletedResponse**](SchemasTunnelDeletedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicIPsecTunnelsGeneratePreSharedKeyPskForIPsecTunnels"></a>
# **magicIPsecTunnelsGeneratePreSharedKeyPskForIPsecTunnels**
> PskGenerationResponse magicIPsecTunnelsGeneratePreSharedKeyPskForIPsecTunnels(tunnelIdentifier, accountIdentifier)

Generate Pre Shared Key (PSK) for IPsec tunnels

Generates a Pre Shared Key for a specific IPsec tunnel used in the IKE session. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes. After a PSK is generated, the PSK is immediately persisted to Cloudflare&#x27;s edge and cannot be retrieved later. Note the PSK in a safe place.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicIPsecTunnelsApi;

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


MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi();
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PskGenerationResponse result = apiInstance.magicIPsecTunnelsGeneratePreSharedKeyPskForIPsecTunnels(tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIPsecTunnelsGeneratePreSharedKeyPskForIPsecTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PskGenerationResponse**](PskGenerationResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicIPsecTunnelsListIPsecTunnelDetails"></a>
# **magicIPsecTunnelsListIPsecTunnelDetails**
> SchemasTunnelSingleResponse magicIPsecTunnelsListIPsecTunnelDetails(tunnelIdentifier, accountIdentifier)

List IPsec tunnel details

Lists details for a specific IPsec tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicIPsecTunnelsApi;

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


MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi();
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelSingleResponse result = apiInstance.magicIPsecTunnelsListIPsecTunnelDetails(tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIPsecTunnelsListIPsecTunnelDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelSingleResponse**](SchemasTunnelSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicIPsecTunnelsListIPsecTunnels"></a>
# **magicIPsecTunnelsListIPsecTunnels**
> SchemasTunnelsCollectionResponse magicIPsecTunnelsListIPsecTunnels(accountIdentifier)

List IPsec tunnels

Lists IPsec tunnels associated with an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicIPsecTunnelsApi;

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


MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelsCollectionResponse result = apiInstance.magicIPsecTunnelsListIPsecTunnels(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIPsecTunnelsListIPsecTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelsCollectionResponse**](SchemasTunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicIPsecTunnelsUpdateIPsecTunnel"></a>
# **magicIPsecTunnelsUpdateIPsecTunnel**
> SchemasTunnelModifiedResponse magicIPsecTunnelsUpdateIPsecTunnel(body, tunnelIdentifier, accountIdentifier)

Update IPsec Tunnel

Updates a specific IPsec tunnel associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicIPsecTunnelsApi;

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


MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi();
SchemasTunnelUpdateRequest body = new SchemasTunnelUpdateRequest(); // SchemasTunnelUpdateRequest | 
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasTunnelModifiedResponse result = apiInstance.magicIPsecTunnelsUpdateIPsecTunnel(body, tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIPsecTunnelsUpdateIPsecTunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasTunnelUpdateRequest**](SchemasTunnelUpdateRequest.md)|  |
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasTunnelModifiedResponse**](SchemasTunnelModifiedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicIPsecTunnelsUpdateMultipleIPsecTunnels"></a>
# **magicIPsecTunnelsUpdateMultipleIPsecTunnels**
> SchemasModifiedTunnelsCollectionResponse magicIPsecTunnelsUpdateMultipleIPsecTunnels(body, accountIdentifier)

Update multiple IPsec tunnels

Update multiple IPsec tunnels associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicIPsecTunnelsApi;

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


MagicIPsecTunnelsApi apiInstance = new MagicIPsecTunnelsApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasModifiedTunnelsCollectionResponse result = apiInstance.magicIPsecTunnelsUpdateMultipleIPsecTunnels(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicIPsecTunnelsApi#magicIPsecTunnelsUpdateMultipleIPsecTunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasModifiedTunnelsCollectionResponse**](SchemasModifiedTunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

