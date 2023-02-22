# WorkerFiltersDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerFiltersDeprecatedCreateFilter**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedCreateFilter) | **POST** /zones/{zone_id}/workers/filters | Create Filter
[**workerFiltersDeprecatedDeleteFilter**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedDeleteFilter) | **DELETE** /zones/{zone_id}/workers/filters/{filter_id} | Delete Filter
[**workerFiltersDeprecatedListFilters**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedListFilters) | **GET** /zones/{zone_id}/workers/filters | List Filters
[**workerFiltersDeprecatedUpdateFilter**](WorkerFiltersDeprecatedApi.md#workerFiltersDeprecatedUpdateFilter) | **PUT** /zones/{zone_id}/workers/filters/{filter_id} | Update Filter

<a name="workerFiltersDeprecatedCreateFilter"></a>
# **workerFiltersDeprecatedCreateFilter**
> CloudflareClientAPIApiResponseSingleId workerFiltersDeprecatedCreateFilter(body, zoneId)

Create Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerFiltersDeprecatedApi;

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


WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi();
FilterNoId body = new FilterNoId(); // FilterNoId | 
String zoneId = "zoneId_example"; // String | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.workerFiltersDeprecatedCreateFilter(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedCreateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterNoId**](FilterNoId.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerFiltersDeprecatedDeleteFilter"></a>
# **workerFiltersDeprecatedDeleteFilter**
> CloudflareClientAPIApiResponseSingleId workerFiltersDeprecatedDeleteFilter(filterId, zoneId)

Delete Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerFiltersDeprecatedApi;

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


WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi();
String filterId = "filterId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.workerFiltersDeprecatedDeleteFilter(filterId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedDeleteFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workerFiltersDeprecatedListFilters"></a>
# **workerFiltersDeprecatedListFilters**
> FilterResponseCollection workerFiltersDeprecatedListFilters(zoneId)

List Filters

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerFiltersDeprecatedApi;

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


WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi();
String zoneId = "zoneId_example"; // String | 
try {
    FilterResponseCollection result = apiInstance.workerFiltersDeprecatedListFilters(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedListFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**FilterResponseCollection**](FilterResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="workerFiltersDeprecatedUpdateFilter"></a>
# **workerFiltersDeprecatedUpdateFilter**
> FilterResponseSingle workerFiltersDeprecatedUpdateFilter(body, filterId, zoneId)

Update Filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerFiltersDeprecatedApi;

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


WorkerFiltersDeprecatedApi apiInstance = new WorkerFiltersDeprecatedApi();
FilterNoId body = new FilterNoId(); // FilterNoId | 
String filterId = "filterId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    FilterResponseSingle result = apiInstance.workerFiltersDeprecatedUpdateFilter(body, filterId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerFiltersDeprecatedApi#workerFiltersDeprecatedUpdateFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterNoId**](FilterNoId.md)|  |
 **filterId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**FilterResponseSingle**](FilterResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

