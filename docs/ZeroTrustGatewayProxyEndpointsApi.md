# ZeroTrustGatewayProxyEndpointsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustGatewayProxyEndpointsCreateProxyEndpoint**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsCreateProxyEndpoint) | **POST** /accounts/{identifier}/gateway/proxy_endpoints | Create Proxy Endpoint
[**zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint) | **DELETE** /accounts/{identifier}/gateway/proxy_endpoints/{uuid} | Delete Proxy Endpoint
[**zeroTrustGatewayProxyEndpointsListProxyEndpoints**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsListProxyEndpoints) | **GET** /accounts/{identifier}/gateway/proxy_endpoints | List Proxy Endpoints
[**zeroTrustGatewayProxyEndpointsProxyEndpointDetails**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsProxyEndpointDetails) | **GET** /accounts/{identifier}/gateway/proxy_endpoints/{uuid} | Proxy Endpoint Details
[**zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint**](ZeroTrustGatewayProxyEndpointsApi.md#zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint) | **PATCH** /accounts/{identifier}/gateway/proxy_endpoints/{uuid} | Update Proxy Endpoint

<a name="zeroTrustGatewayProxyEndpointsCreateProxyEndpoint"></a>
# **zeroTrustGatewayProxyEndpointsCreateProxyEndpoint**
> ProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsCreateProxyEndpoint(body, identifier)

Create Proxy Endpoint

Create a new Zero Trust Gateway Proxy Endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayProxyEndpointsApi;

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


ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi();
GatewayProxyEndpointsBody body = new GatewayProxyEndpointsBody(); // GatewayProxyEndpointsBody | 
ProxyEndpointsComponentsSchemasIdentifier identifier = new ProxyEndpointsComponentsSchemasIdentifier(); // ProxyEndpointsComponentsSchemasIdentifier | 
try {
    ProxyEndpointsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayProxyEndpointsCreateProxyEndpoint(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsCreateProxyEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayProxyEndpointsBody**](GatewayProxyEndpointsBody.md)|  |
 **identifier** | [**ProxyEndpointsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ProxyEndpointsComponentsSchemasSingleResponse**](ProxyEndpointsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint"></a>
# **zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint**
> ProxyEndpointsComponentsSchemasEmptyResponse zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint(uuid, identifier)

Delete Proxy Endpoint

Delete a Zero Trust Gateway Proxy Endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayProxyEndpointsApi;

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


ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi();
ProxyEndpointsComponentsSchemasUuid uuid = new ProxyEndpointsComponentsSchemasUuid(); // ProxyEndpointsComponentsSchemasUuid | 
ProxyEndpointsComponentsSchemasIdentifier identifier = new ProxyEndpointsComponentsSchemasIdentifier(); // ProxyEndpointsComponentsSchemasIdentifier | 
try {
    ProxyEndpointsComponentsSchemasEmptyResponse result = apiInstance.zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsDeleteProxyEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**ProxyEndpointsComponentsSchemasUuid**](.md)|  |
 **identifier** | [**ProxyEndpointsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ProxyEndpointsComponentsSchemasEmptyResponse**](ProxyEndpointsComponentsSchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayProxyEndpointsListProxyEndpoints"></a>
# **zeroTrustGatewayProxyEndpointsListProxyEndpoints**
> ProxyEndpointsComponentsSchemasResponseCollection zeroTrustGatewayProxyEndpointsListProxyEndpoints(identifier)

List Proxy Endpoints

Fetch a single Zero Trust Gateway Proxy Endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayProxyEndpointsApi;

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


ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi();
ProxyEndpointsComponentsSchemasIdentifier identifier = new ProxyEndpointsComponentsSchemasIdentifier(); // ProxyEndpointsComponentsSchemasIdentifier | 
try {
    ProxyEndpointsComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayProxyEndpointsListProxyEndpoints(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsListProxyEndpoints");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**ProxyEndpointsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ProxyEndpointsComponentsSchemasResponseCollection**](ProxyEndpointsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustGatewayProxyEndpointsProxyEndpointDetails"></a>
# **zeroTrustGatewayProxyEndpointsProxyEndpointDetails**
> ProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsProxyEndpointDetails(uuid, identifier)

Proxy Endpoint Details

List Zero Trust Gateway Proxy Endpoints for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayProxyEndpointsApi;

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


ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi();
ProxyEndpointsComponentsSchemasUuid uuid = new ProxyEndpointsComponentsSchemasUuid(); // ProxyEndpointsComponentsSchemasUuid | 
ProxyEndpointsComponentsSchemasIdentifier identifier = new ProxyEndpointsComponentsSchemasIdentifier(); // ProxyEndpointsComponentsSchemasIdentifier | 
try {
    ProxyEndpointsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayProxyEndpointsProxyEndpointDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsProxyEndpointDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**ProxyEndpointsComponentsSchemasUuid**](.md)|  |
 **identifier** | [**ProxyEndpointsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ProxyEndpointsComponentsSchemasSingleResponse**](ProxyEndpointsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint"></a>
# **zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint**
> ProxyEndpointsComponentsSchemasSingleResponse zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(body, uuid, identifier)

Update Proxy Endpoint

Update a new Zero Trust Gateway Proxy Endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayProxyEndpointsApi;

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


ZeroTrustGatewayProxyEndpointsApi apiInstance = new ZeroTrustGatewayProxyEndpointsApi();
ProxyEndpointsUuidBody body = new ProxyEndpointsUuidBody(); // ProxyEndpointsUuidBody | 
ProxyEndpointsComponentsSchemasUuid uuid = new ProxyEndpointsComponentsSchemasUuid(); // ProxyEndpointsComponentsSchemasUuid | 
ProxyEndpointsComponentsSchemasIdentifier identifier = new ProxyEndpointsComponentsSchemasIdentifier(); // ProxyEndpointsComponentsSchemasIdentifier | 
try {
    ProxyEndpointsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayProxyEndpointsApi#zeroTrustGatewayProxyEndpointsUpdateProxyEndpoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProxyEndpointsUuidBody**](ProxyEndpointsUuidBody.md)|  |
 **uuid** | [**ProxyEndpointsComponentsSchemasUuid**](.md)|  |
 **identifier** | [**ProxyEndpointsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ProxyEndpointsComponentsSchemasSingleResponse**](ProxyEndpointsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

