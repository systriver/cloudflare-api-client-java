# WafRuleGroupsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wafRuleGroupsGetAWafRuleGroup**](WafRuleGroupsApi.md#wafRuleGroupsGetAWafRuleGroup) | **GET** /zones/{zone_identifier}/firewall/waf/packages/{package_identifier}/groups/{identifier} | Get a WAF rule group
[**wafRuleGroupsListWafRuleGroups**](WafRuleGroupsApi.md#wafRuleGroupsListWafRuleGroups) | **GET** /zones/{zone_identifier}/firewall/waf/packages/{package_identifier}/groups | List WAF rule groups
[**wafRuleGroupsUpdateAWafRuleGroup**](WafRuleGroupsApi.md#wafRuleGroupsUpdateAWafRuleGroup) | **PATCH** /zones/{zone_identifier}/firewall/waf/packages/{package_identifier}/groups/{identifier} | Update a WAF rule group

<a name="wafRuleGroupsGetAWafRuleGroup"></a>
# **wafRuleGroupsGetAWafRuleGroup**
> RuleGroupResponseSingle wafRuleGroupsGetAWafRuleGroup(identifier, packageIdentifier, zoneIdentifier)

Get a WAF rule group

Fetches the details of a WAF rule group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafRuleGroupsApi;

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


WafRuleGroupsApi apiInstance = new WafRuleGroupsApi();
String identifier = "identifier_example"; // String | 
String packageIdentifier = "packageIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RuleGroupResponseSingle result = apiInstance.wafRuleGroupsGetAWafRuleGroup(identifier, packageIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafRuleGroupsApi#wafRuleGroupsGetAWafRuleGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **packageIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RuleGroupResponseSingle**](RuleGroupResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafRuleGroupsListWafRuleGroups"></a>
# **wafRuleGroupsListWafRuleGroups**
> RuleGroupResponseCollection wafRuleGroupsListWafRuleGroups(packageIdentifier, zoneIdentifier)

List WAF rule groups

Fetches the WAF rule groups in a WAF package.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafRuleGroupsApi;

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


WafRuleGroupsApi apiInstance = new WafRuleGroupsApi();
String packageIdentifier = "packageIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RuleGroupResponseCollection result = apiInstance.wafRuleGroupsListWafRuleGroups(packageIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafRuleGroupsApi#wafRuleGroupsListWafRuleGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RuleGroupResponseCollection**](RuleGroupResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafRuleGroupsUpdateAWafRuleGroup"></a>
# **wafRuleGroupsUpdateAWafRuleGroup**
> RuleGroupResponseSingle wafRuleGroupsUpdateAWafRuleGroup(body, identifier, packageIdentifier, zoneIdentifier)

Update a WAF rule group

Updates a WAF rule group. You can update the state (&#x60;mode&#x60; parameter) of a rule group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafRuleGroupsApi;

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


WafRuleGroupsApi apiInstance = new WafRuleGroupsApi();
GroupsIdentifierBody body = new GroupsIdentifierBody(); // GroupsIdentifierBody | 
String identifier = "identifier_example"; // String | 
String packageIdentifier = "packageIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RuleGroupResponseSingle result = apiInstance.wafRuleGroupsUpdateAWafRuleGroup(body, identifier, packageIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafRuleGroupsApi#wafRuleGroupsUpdateAWafRuleGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GroupsIdentifierBody**](GroupsIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **packageIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RuleGroupResponseSingle**](RuleGroupResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

