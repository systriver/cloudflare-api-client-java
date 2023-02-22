# SmartTieredCacheApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**smartTieredCacheDeleteSmartTieredCacheSetting**](SmartTieredCacheApi.md#smartTieredCacheDeleteSmartTieredCacheSetting) | **DELETE** /zones/{zone_identifier}/cache/tiered_cache_smart_topology_enable | Delete Smart Tiered Cache setting
[**smartTieredCacheGetSmartTieredCacheSetting**](SmartTieredCacheApi.md#smartTieredCacheGetSmartTieredCacheSetting) | **GET** /zones/{zone_identifier}/cache/tiered_cache_smart_topology_enable | Get Smart Tiered Cache setting
[**smartTieredCachePatchSmartTieredCacheSetting**](SmartTieredCacheApi.md#smartTieredCachePatchSmartTieredCacheSetting) | **PATCH** /zones/{zone_identifier}/cache/tiered_cache_smart_topology_enable | Patch Smart Tiered Cache setting

<a name="smartTieredCacheDeleteSmartTieredCacheSetting"></a>
# **smartTieredCacheDeleteSmartTieredCacheSetting**
> SchemasResponseSingle smartTieredCacheDeleteSmartTieredCacheSetting(zoneIdentifier)

Delete Smart Tiered Cache setting

Remvoves enablement of Smart Tiered Cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmartTieredCacheApi;

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


SmartTieredCacheApi apiInstance = new SmartTieredCacheApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.smartTieredCacheDeleteSmartTieredCacheSetting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTieredCacheApi#smartTieredCacheDeleteSmartTieredCacheSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smartTieredCacheGetSmartTieredCacheSetting"></a>
# **smartTieredCacheGetSmartTieredCacheSetting**
> SchemasResponseSingle smartTieredCacheGetSmartTieredCacheSetting(zoneIdentifier)

Get Smart Tiered Cache setting

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmartTieredCacheApi;

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


SmartTieredCacheApi apiInstance = new SmartTieredCacheApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.smartTieredCacheGetSmartTieredCacheSetting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTieredCacheApi#smartTieredCacheGetSmartTieredCacheSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smartTieredCachePatchSmartTieredCacheSetting"></a>
# **smartTieredCachePatchSmartTieredCacheSetting**
> SchemasResponseSingle smartTieredCachePatchSmartTieredCacheSetting(body, zoneIdentifier)

Patch Smart Tiered Cache setting

Updates enablement of Tiered Cache

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmartTieredCacheApi;

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


SmartTieredCacheApi apiInstance = new SmartTieredCacheApi();
ComponentsSchemasPatch body = new ComponentsSchemasPatch(); // ComponentsSchemasPatch | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.smartTieredCachePatchSmartTieredCacheSetting(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmartTieredCacheApi#smartTieredCachePatchSmartTieredCacheSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComponentsSchemasPatch**](ComponentsSchemasPatch.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

