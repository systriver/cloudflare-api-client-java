# TunnelRouteApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tunnelRouteCreateATunnelRoute**](TunnelRouteApi.md#tunnelRouteCreateATunnelRoute) | **POST** /accounts/{account_identifier}/teamnet/routes/network/{ip_network_encoded} | Create a tunnel route
[**tunnelRouteDeleteATunnelRoute**](TunnelRouteApi.md#tunnelRouteDeleteATunnelRoute) | **DELETE** /accounts/{account_identifier}/teamnet/routes/network/{ip_network_encoded} | Delete a tunnel route
[**tunnelRouteGetTunnelRouteByIp**](TunnelRouteApi.md#tunnelRouteGetTunnelRouteByIp) | **GET** /accounts/{account_identifier}/teamnet/routes/ip/{ip} | Get tunnel route by IP
[**tunnelRouteListTunnelRoutes**](TunnelRouteApi.md#tunnelRouteListTunnelRoutes) | **GET** /accounts/{account_identifier}/teamnet/routes | List tunnel routes
[**tunnelRouteUpdateATunnelRoute**](TunnelRouteApi.md#tunnelRouteUpdateATunnelRoute) | **PATCH** /accounts/{account_identifier}/teamnet/routes/network/{ip_network_encoded} | Update a tunnel route

<a name="tunnelRouteCreateATunnelRoute"></a>
# **tunnelRouteCreateATunnelRoute**
> RouteResponseSingle tunnelRouteCreateATunnelRoute(body, ipNetworkEncoded, accountIdentifier)

Create a tunnel route

Routes a private network through a Cloudflare Tunnel. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelRouteApi;

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


TunnelRouteApi apiInstance = new TunnelRouteApi();
NetworkIpNetworkEncodedBody body = new NetworkIpNetworkEncodedBody(); // NetworkIpNetworkEncodedBody | 
String ipNetworkEncoded = "ipNetworkEncoded_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteResponseSingle result = apiInstance.tunnelRouteCreateATunnelRoute(body, ipNetworkEncoded, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelRouteApi#tunnelRouteCreateATunnelRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetworkIpNetworkEncodedBody**](NetworkIpNetworkEncodedBody.md)|  |
 **ipNetworkEncoded** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteResponseSingle**](RouteResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tunnelRouteDeleteATunnelRoute"></a>
# **tunnelRouteDeleteATunnelRoute**
> RouteResponseSingle tunnelRouteDeleteATunnelRoute(body, ipNetworkEncoded, accountIdentifier)

Delete a tunnel route

Deletes a private network route from an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelRouteApi;

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


TunnelRouteApi apiInstance = new TunnelRouteApi();
NetworkIpNetworkEncodedBody1 body = new NetworkIpNetworkEncodedBody1(); // NetworkIpNetworkEncodedBody1 | 
String ipNetworkEncoded = "ipNetworkEncoded_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteResponseSingle result = apiInstance.tunnelRouteDeleteATunnelRoute(body, ipNetworkEncoded, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelRouteApi#tunnelRouteDeleteATunnelRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetworkIpNetworkEncodedBody1**](NetworkIpNetworkEncodedBody1.md)|  |
 **ipNetworkEncoded** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteResponseSingle**](RouteResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tunnelRouteGetTunnelRouteByIp"></a>
# **tunnelRouteGetTunnelRouteByIp**
> RouteResponseSingle tunnelRouteGetTunnelRouteByIp(ip, accountIdentifier)

Get tunnel route by IP

Fetches routes that contain the given IP address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelRouteApi;

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


TunnelRouteApi apiInstance = new TunnelRouteApi();
String ip = "ip_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteResponseSingle result = apiInstance.tunnelRouteGetTunnelRouteByIp(ip, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelRouteApi#tunnelRouteGetTunnelRouteByIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteResponseSingle**](RouteResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tunnelRouteListTunnelRoutes"></a>
# **tunnelRouteListTunnelRoutes**
> RouteResponseCollection tunnelRouteListTunnelRoutes(accountIdentifier)

List tunnel routes

Lists and filters private network routes in an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelRouteApi;

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


TunnelRouteApi apiInstance = new TunnelRouteApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteResponseCollection result = apiInstance.tunnelRouteListTunnelRoutes(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelRouteApi#tunnelRouteListTunnelRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteResponseCollection**](RouteResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="tunnelRouteUpdateATunnelRoute"></a>
# **tunnelRouteUpdateATunnelRoute**
> RouteResponseSingle tunnelRouteUpdateATunnelRoute(body, ipNetworkEncoded, accountIdentifier)

Update a tunnel route

Updates an existing private network route in an account. The CIDR in &#x60;ip_network_encoded&#x60; must be written in URL-encoded format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TunnelRouteApi;

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


TunnelRouteApi apiInstance = new TunnelRouteApi();
NetworkIpNetworkEncodedBody2 body = new NetworkIpNetworkEncodedBody2(); // NetworkIpNetworkEncodedBody2 | 
String ipNetworkEncoded = "ipNetworkEncoded_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RouteResponseSingle result = apiInstance.tunnelRouteUpdateATunnelRoute(body, ipNetworkEncoded, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TunnelRouteApi#tunnelRouteUpdateATunnelRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NetworkIpNetworkEncodedBody2**](NetworkIpNetworkEncodedBody2.md)|  |
 **ipNetworkEncoded** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RouteResponseSingle**](RouteResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

