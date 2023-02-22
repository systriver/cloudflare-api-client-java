# OriginRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**originRulesListOriginRules**](OriginRulesApi.md#originRulesListOriginRules) | **GET** /zones/{zone_id}/rulesets/phases/http_request_origin/entrypoint | List Origin Rules
[**originRulesUpdateOriginRules**](OriginRulesApi.md#originRulesUpdateOriginRules) | **PUT** /zones/{zone_id}/rulesets/phases/http_request_origin/entrypoint | Update Origin Rules

<a name="originRulesListOriginRules"></a>
# **originRulesListOriginRules**
> SchemasRuleset originRulesListOriginRules(zoneId)

List Origin Rules

Fetches all Origin Rules in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OriginRulesApi;

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


OriginRulesApi apiInstance = new OriginRulesApi();
String zoneId = "zoneId_example"; // String | 
try {
    SchemasRuleset result = apiInstance.originRulesListOriginRules(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginRulesApi#originRulesListOriginRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**SchemasRuleset**](SchemasRuleset.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="originRulesUpdateOriginRules"></a>
# **originRulesUpdateOriginRules**
> ApiResponseSingle originRulesUpdateOriginRules(body, zoneId)

Update Origin Rules

Updates the Origin Rules of a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OriginRulesApi;

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


OriginRulesApi apiInstance = new OriginRulesApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String zoneId = "zoneId_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.originRulesUpdateOriginRules(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginRulesApi#originRulesUpdateOriginRules");
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

