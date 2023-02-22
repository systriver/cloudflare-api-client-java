# WorkerRoutesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerRoutesCreateRoute**](WorkerRoutesApi.md#workerRoutesCreateRoute) | **POST** /zones/{zone_id}/workers/routes | Create Route
[**workerRoutesDeleteRoute**](WorkerRoutesApi.md#workerRoutesDeleteRoute) | **DELETE** /zones/{zone_id}/workers/routes/{route_id} | Delete Route
[**workerRoutesGetRoute**](WorkerRoutesApi.md#workerRoutesGetRoute) | **GET** /zones/{zone_id}/workers/routes/{route_id} | Get Route
[**workerRoutesListRoutes**](WorkerRoutesApi.md#workerRoutesListRoutes) | **GET** /zones/{zone_id}/workers/routes | List Routes
[**workerRoutesUpdateRoute**](WorkerRoutesApi.md#workerRoutesUpdateRoute) | **PUT** /zones/{zone_id}/workers/routes/{route_id} | Update Route

<a name="workerRoutesCreateRoute"></a>
# **workerRoutesCreateRoute**
> CloudflareClientAPIApiResponseSingleId workerRoutesCreateRoute(body, zoneId)

Create Route

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerRoutesApi;

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


WorkerRoutesApi apiInstance = new WorkerRoutesApi();
RouteNoId body = new RouteNoId(); // RouteNoId | 
String zoneId = "zoneId_example"; // String | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.workerRoutesCreateRoute(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerRoutesApi#workerRoutesCreateRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteNoId**](RouteNoId.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerRoutesDeleteRoute"></a>
# **workerRoutesDeleteRoute**
> CloudflareClientAPIApiResponseSingleId workerRoutesDeleteRoute(routeId, zoneId)

Delete Route

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerRoutesApi;

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


WorkerRoutesApi apiInstance = new WorkerRoutesApi();
String routeId = "routeId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.workerRoutesDeleteRoute(routeId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerRoutesApi#workerRoutesDeleteRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerRoutesGetRoute"></a>
# **workerRoutesGetRoute**
> RouteResponseSingle workerRoutesGetRoute(routeId, zoneId)

Get Route

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerRoutesApi;

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


WorkerRoutesApi apiInstance = new WorkerRoutesApi();
String routeId = "routeId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RouteResponseSingle result = apiInstance.workerRoutesGetRoute(routeId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerRoutesApi#workerRoutesGetRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routeId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RouteResponseSingle**](RouteResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerRoutesListRoutes"></a>
# **workerRoutesListRoutes**
> RouteResponseCollection workerRoutesListRoutes(zoneId)

List Routes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerRoutesApi;

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


WorkerRoutesApi apiInstance = new WorkerRoutesApi();
String zoneId = "zoneId_example"; // String | 
try {
    RouteResponseCollection result = apiInstance.workerRoutesListRoutes(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerRoutesApi#workerRoutesListRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**RouteResponseCollection**](RouteResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerRoutesUpdateRoute"></a>
# **workerRoutesUpdateRoute**
> RouteResponseSingle workerRoutesUpdateRoute(body, routeId, zoneId)

Update Route

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerRoutesApi;

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


WorkerRoutesApi apiInstance = new WorkerRoutesApi();
RouteNoId body = new RouteNoId(); // RouteNoId | 
String routeId = "routeId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RouteResponseSingle result = apiInstance.workerRoutesUpdateRoute(body, routeId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerRoutesApi#workerRoutesUpdateRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RouteNoId**](RouteNoId.md)|  |
 **routeId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RouteResponseSingle**](RouteResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

