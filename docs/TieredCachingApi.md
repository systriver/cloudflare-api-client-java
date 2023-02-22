# TieredCachingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tieredCachingGetTieredCachingSetting**](TieredCachingApi.md#tieredCachingGetTieredCachingSetting) | **GET** /zones/{zone_identifier}/argo/tiered_caching | Get Tiered Caching setting
[**tieredCachingPatchTieredCachingSetting**](TieredCachingApi.md#tieredCachingPatchTieredCachingSetting) | **PATCH** /zones/{zone_identifier}/argo/tiered_caching | Patch Tiered Caching setting

<a name="tieredCachingGetTieredCachingSetting"></a>
# **tieredCachingGetTieredCachingSetting**
> SchemasResponseSingle tieredCachingGetTieredCachingSetting(zoneIdentifier)

Get Tiered Caching setting

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TieredCachingApi;

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


TieredCachingApi apiInstance = new TieredCachingApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.tieredCachingGetTieredCachingSetting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TieredCachingApi#tieredCachingGetTieredCachingSetting");
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

<a name="tieredCachingPatchTieredCachingSetting"></a>
# **tieredCachingPatchTieredCachingSetting**
> SchemasResponseSingle tieredCachingPatchTieredCachingSetting(body, zoneIdentifier)

Patch Tiered Caching setting

Updates enablement of Tiered Caching

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TieredCachingApi;

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


TieredCachingApi apiInstance = new TieredCachingApi();
SchemasPatch body = new SchemasPatch(); // SchemasPatch | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.tieredCachingPatchTieredCachingSetting(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TieredCachingApi#tieredCachingPatchTieredCachingSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasPatch**](SchemasPatch.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

