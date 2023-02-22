# TransformRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transformRulesListTransformRules**](TransformRulesApi.md#transformRulesListTransformRules) | **GET** /zones/{zone_id}/rulesets/phases/{phase}/entrypoint | List Transform Rules
[**transformRulesUpdateTransformRules**](TransformRulesApi.md#transformRulesUpdateTransformRules) | **PUT** /zones/{zone_id}/rulesets/phases/{phase}/entrypoint | Update Transform Rules

<a name="transformRulesListTransformRules"></a>
# **transformRulesListTransformRules**
> TransformRulesComponentsSchemasRuleset transformRulesListTransformRules(phase, zoneId)

List Transform Rules

Fetches all Transform Rules in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransformRulesApi;

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


TransformRulesApi apiInstance = new TransformRulesApi();
SchemasPhase phase = new SchemasPhase(); // SchemasPhase | 
String zoneId = "zoneId_example"; // String | 
try {
    TransformRulesComponentsSchemasRuleset result = apiInstance.transformRulesListTransformRules(phase, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformRulesApi#transformRulesListTransformRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phase** | [**SchemasPhase**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**TransformRulesComponentsSchemasRuleset**](TransformRulesComponentsSchemasRuleset.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transformRulesUpdateTransformRules"></a>
# **transformRulesUpdateTransformRules**
> ApiResponseSingle transformRulesUpdateTransformRules(body, phase, zoneId)

Update Transform Rules

Updates the Transform Rules of a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransformRulesApi;

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


TransformRulesApi apiInstance = new TransformRulesApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
SchemasPhase phase = new SchemasPhase(); // SchemasPhase | 
String zoneId = "zoneId_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.transformRulesUpdateTransformRules(body, phase, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformRulesApi#transformRulesUpdateTransformRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleset**](UpdateRuleset.md)|  |
 **phase** | [**SchemasPhase**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

