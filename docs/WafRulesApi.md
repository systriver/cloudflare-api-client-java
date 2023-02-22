# WafRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wafRulesGetAWafRule**](WafRulesApi.md#wafRulesGetAWafRule) | **GET** /zones/{zone_id}/firewall/waf/packages/{package_id}/rules/{identifier} | Get a WAF rule
[**wafRulesListWafRules**](WafRulesApi.md#wafRulesListWafRules) | **GET** /zones/{zone_id}/firewall/waf/packages/{package_id}/rules | List WAF rules
[**wafRulesUpdateAWafRule**](WafRulesApi.md#wafRulesUpdateAWafRule) | **PATCH** /zones/{zone_id}/firewall/waf/packages/{package_id}/rules/{identifier} | Update a WAF rule

<a name="wafRulesGetAWafRule"></a>
# **wafRulesGetAWafRule**
> RuleResponseSingle wafRulesGetAWafRule(identifier, packageId, zoneId)

Get a WAF rule

Fetches the details of a WAF rule in a WAF package.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafRulesApi;

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


WafRulesApi apiInstance = new WafRulesApi();
String identifier = "identifier_example"; // String | 
String packageId = "packageId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RuleResponseSingle result = apiInstance.wafRulesGetAWafRule(identifier, packageId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafRulesApi#wafRulesGetAWafRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **packageId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RuleResponseSingle**](RuleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafRulesListWafRules"></a>
# **wafRulesListWafRules**
> RuleResponseCollection wafRulesListWafRules(packageId, zoneId)

List WAF rules

Fetches WAF rules in a WAF package.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafRulesApi;

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


WafRulesApi apiInstance = new WafRulesApi();
String packageId = "packageId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RuleResponseCollection result = apiInstance.wafRulesListWafRules(packageId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafRulesApi#wafRulesListWafRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RuleResponseCollection**](RuleResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafRulesUpdateAWafRule"></a>
# **wafRulesUpdateAWafRule**
> InlineResponse200173 wafRulesUpdateAWafRule(body, identifier, packageId, zoneId)

Update a WAF rule

Updates a WAF rule. You can only update the mode/action of the rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafRulesApi;

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


WafRulesApi apiInstance = new WafRulesApi();
RulesIdentifierBody3 body = new RulesIdentifierBody3(); // RulesIdentifierBody3 | 
String identifier = "identifier_example"; // String | 
String packageId = "packageId_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    InlineResponse200173 result = apiInstance.wafRulesUpdateAWafRule(body, identifier, packageId, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafRulesApi#wafRulesUpdateAWafRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RulesIdentifierBody3**](RulesIdentifierBody3.md)|  |
 **identifier** | [**String**](.md)|  |
 **packageId** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**InlineResponse200173**](InlineResponse200173.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

