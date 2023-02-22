# EmailRoutingRoutingRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailRoutingRoutingRulesCreateRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesCreateRoutingRule) | **POST** /zones/{zone_identifier}/email/routing/rules | Create routing rule
[**emailRoutingRoutingRulesDeleteRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesDeleteRoutingRule) | **DELETE** /zones/{zone_identifier}/email/routing/rules/{rule_identifier} | Delete routing rule
[**emailRoutingRoutingRulesGetCatchAllRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesGetCatchAllRule) | **GET** /zones/{zone_identifier}/email/routing/rules/catch_all | Get catch-all rule
[**emailRoutingRoutingRulesGetRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesGetRoutingRule) | **GET** /zones/{zone_identifier}/email/routing/rules/{rule_identifier} | Get routing rule
[**emailRoutingRoutingRulesListRoutingRules**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesListRoutingRules) | **GET** /zones/{zone_identifier}/email/routing/rules | List routing rules
[**emailRoutingRoutingRulesUpdateCatchAllRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesUpdateCatchAllRule) | **PUT** /zones/{zone_identifier}/email/routing/rules/catch_all | Update catch-all rule
[**emailRoutingRoutingRulesUpdateRoutingRule**](EmailRoutingRoutingRulesApi.md#emailRoutingRoutingRulesUpdateRoutingRule) | **PUT** /zones/{zone_identifier}/email/routing/rules/{rule_identifier} | Update routing rule

<a name="emailRoutingRoutingRulesCreateRoutingRule"></a>
# **emailRoutingRoutingRulesCreateRoutingRule**
> RuleResponseSingle emailRoutingRoutingRulesCreateRoutingRule(body, zoneIdentifier)

Create routing rule

Rules consist of a set of criteria for matching emails (such as an email being sent to a specific custom email address) plus a set of actions to take on the email (like forwarding it to a specific destination address).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingRoutingRulesApi;

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


EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi();
CreateRuleProperties body = new CreateRuleProperties(); // CreateRuleProperties | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RuleResponseSingle result = apiInstance.emailRoutingRoutingRulesCreateRoutingRule(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesCreateRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRuleProperties**](CreateRuleProperties.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RuleResponseSingle**](RuleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailRoutingRoutingRulesDeleteRoutingRule"></a>
# **emailRoutingRoutingRulesDeleteRoutingRule**
> RuleResponseSingle emailRoutingRoutingRulesDeleteRoutingRule(ruleIdentifier, zoneIdentifier)

Delete routing rule

Delete a specific routing rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingRoutingRulesApi;

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


EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi();
String ruleIdentifier = "ruleIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RuleResponseSingle result = apiInstance.emailRoutingRoutingRulesDeleteRoutingRule(ruleIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesDeleteRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RuleResponseSingle**](RuleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailRoutingRoutingRulesGetCatchAllRule"></a>
# **emailRoutingRoutingRulesGetCatchAllRule**
> CatchAllRuleResponseSingle emailRoutingRoutingRulesGetCatchAllRule(zoneIdentifier)

Get catch-all rule

Get information on the default catch-all routing rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingRoutingRulesApi;

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


EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CatchAllRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesGetCatchAllRule(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesGetCatchAllRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CatchAllRuleResponseSingle**](CatchAllRuleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emailRoutingRoutingRulesGetRoutingRule"></a>
# **emailRoutingRoutingRulesGetRoutingRule**
> RuleResponseSingle emailRoutingRoutingRulesGetRoutingRule(ruleIdentifier, zoneIdentifier)

Get routing rule

Get information for a specific routing rule already created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingRoutingRulesApi;

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


EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi();
String ruleIdentifier = "ruleIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RuleResponseSingle result = apiInstance.emailRoutingRoutingRulesGetRoutingRule(ruleIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesGetRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RuleResponseSingle**](RuleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emailRoutingRoutingRulesListRoutingRules"></a>
# **emailRoutingRoutingRulesListRoutingRules**
> CloudflareClientAPIRulesResponseCollection emailRoutingRoutingRulesListRoutingRules(zoneIdentifier)

List routing rules

Lists existing routing rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingRoutingRulesApi;

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


EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CloudflareClientAPIRulesResponseCollection result = apiInstance.emailRoutingRoutingRulesListRoutingRules(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesListRoutingRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIRulesResponseCollection**](CloudflareClientAPIRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emailRoutingRoutingRulesUpdateCatchAllRule"></a>
# **emailRoutingRoutingRulesUpdateCatchAllRule**
> CatchAllRuleResponseSingle emailRoutingRoutingRulesUpdateCatchAllRule(body, zoneIdentifier)

Update catch-all rule

Enable or disable catch-all routing rule, or change action to forward to specific destination address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingRoutingRulesApi;

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


EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi();
UpdateCatchAllRuleProperties body = new UpdateCatchAllRuleProperties(); // UpdateCatchAllRuleProperties | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CatchAllRuleResponseSingle result = apiInstance.emailRoutingRoutingRulesUpdateCatchAllRule(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesUpdateCatchAllRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCatchAllRuleProperties**](UpdateCatchAllRuleProperties.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CatchAllRuleResponseSingle**](CatchAllRuleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailRoutingRoutingRulesUpdateRoutingRule"></a>
# **emailRoutingRoutingRulesUpdateRoutingRule**
> RuleResponseSingle emailRoutingRoutingRulesUpdateRoutingRule(body, ruleIdentifier, zoneIdentifier)

Update routing rule

Update actions and matches, or enable/disable specific routing rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingRoutingRulesApi;

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


EmailRoutingRoutingRulesApi apiInstance = new EmailRoutingRoutingRulesApi();
UpdateRuleProperties body = new UpdateRuleProperties(); // UpdateRuleProperties | 
String ruleIdentifier = "ruleIdentifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RuleResponseSingle result = apiInstance.emailRoutingRoutingRulesUpdateRoutingRule(body, ruleIdentifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingRoutingRulesApi#emailRoutingRoutingRulesUpdateRoutingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleProperties**](UpdateRuleProperties.md)|  |
 **ruleIdentifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RuleResponseSingle**](RuleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

