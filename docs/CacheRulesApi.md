# CacheRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cacheRulesListCacheRules**](CacheRulesApi.md#cacheRulesListCacheRules) | **GET** /zones/{zone_id}/rulesets/phases/http_request_cache_settings/entrypoint | List Cache Rules
[**cacheRulesUpdateCacheRules**](CacheRulesApi.md#cacheRulesUpdateCacheRules) | **PUT** /zones/{zone_id}/rulesets/phases/http_request_cache_settings/entrypoint | Update Cache Rules

<a name="cacheRulesListCacheRules"></a>
# **cacheRulesListCacheRules**
> CacheRulesComponentsSchemasRuleset cacheRulesListCacheRules(zoneId)

List Cache Rules

Fetches all Cache Rules in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CacheRulesApi;

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


CacheRulesApi apiInstance = new CacheRulesApi();
String zoneId = "zoneId_example"; // String | 
try {
    CacheRulesComponentsSchemasRuleset result = apiInstance.cacheRulesListCacheRules(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CacheRulesApi#cacheRulesListCacheRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**CacheRulesComponentsSchemasRuleset**](CacheRulesComponentsSchemasRuleset.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cacheRulesUpdateCacheRules"></a>
# **cacheRulesUpdateCacheRules**
> ApiResponseSingle cacheRulesUpdateCacheRules(body, zoneId)

Update Cache Rules

Updates the Cache Rules of a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CacheRulesApi;

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


CacheRulesApi apiInstance = new CacheRulesApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String zoneId = "zoneId_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.cacheRulesUpdateCacheRules(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CacheRulesApi#cacheRulesUpdateCacheRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleset**](UpdateRuleset.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

