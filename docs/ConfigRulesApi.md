# ConfigRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configRulesListConfigRules**](ConfigRulesApi.md#configRulesListConfigRules) | **GET** /zones/{zone_id}/rulesets/phases/http_config_settings/entrypoint | List Config Rules
[**configRulesUpdateConfigRules**](ConfigRulesApi.md#configRulesUpdateConfigRules) | **PUT** /zones/{zone_id}/rulesets/phases/http_config_settings/entrypoint | Update Config Rules

<a name="configRulesListConfigRules"></a>
# **configRulesListConfigRules**
> ConfigRulesComponentsSchemasRuleset configRulesListConfigRules(zoneId)

List Config Rules

Fetches all Config Rules in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConfigRulesApi;

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


ConfigRulesApi apiInstance = new ConfigRulesApi();
String zoneId = "zoneId_example"; // String | 
try {
    ConfigRulesComponentsSchemasRuleset result = apiInstance.configRulesListConfigRules(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigRulesApi#configRulesListConfigRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**ConfigRulesComponentsSchemasRuleset**](ConfigRulesComponentsSchemasRuleset.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="configRulesUpdateConfigRules"></a>
# **configRulesUpdateConfigRules**
> ApiResponseSingle configRulesUpdateConfigRules(body, zoneId)

Update Config Rules

Updates the Config Rules of a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConfigRulesApi;

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


ConfigRulesApi apiInstance = new ConfigRulesApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String zoneId = "zoneId_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.configRulesUpdateConfigRules(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigRulesApi#configRulesUpdateConfigRules");
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

