# IpAccessRulesForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipAccessRulesForAZoneCreateAnIpAccessRule**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneCreateAnIpAccessRule) | **POST** /zones/{zone_id}/firewall/access_rules/rules | Create an IP Access rule
[**ipAccessRulesForAZoneDeleteAnIpAccessRule**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneDeleteAnIpAccessRule) | **DELETE** /zones/{zone_id}/firewall/access_rules/rules/{identifier} | Delete an IP Access rule
[**ipAccessRulesForAZoneListIpAccessRules**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneListIpAccessRules) | **GET** /zones/{zone_id}/firewall/access_rules/rules | List IP Access rules
[**ipAccessRulesForAZoneUpdateAnIpAccessRule**](IpAccessRulesForAZoneApi.md#ipAccessRulesForAZoneUpdateAnIpAccessRule) | **PATCH** /zones/{zone_id}/firewall/access_rules/rules/{identifier} | Update an IP Access rule

<a name="ipAccessRulesForAZoneCreateAnIpAccessRule"></a>
# **ipAccessRulesForAZoneCreateAnIpAccessRule**
> RuleSingleResponse ipAccessRulesForAZoneCreateAnIpAccessRule(body, zoneId)

Create an IP Access rule

Creates a new IP Access rule for a zone.  Note: To create an IP Access rule that applies to multiple zones, refer to [IP Access rules for a user](#ip-access-rules-for-a-user) or [IP Access rules for an account](#ip-access-rules-for-an-account) as appropriate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAZoneApi;

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


IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi();
AccessRulesRulesBody2 body = new AccessRulesRulesBody2(); // AccessRulesRulesBody2 | 
String zoneId = "zoneId_example"; // String | 
try {
    RuleSingleResponse result = apiInstance.ipAccessRulesForAZoneCreateAnIpAccessRule(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneCreateAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessRulesRulesBody2**](AccessRulesRulesBody2.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RuleSingleResponse**](RuleSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAccessRulesForAZoneDeleteAnIpAccessRule"></a>
# **ipAccessRulesForAZoneDeleteAnIpAccessRule**
> RuleSingleIdResponse ipAccessRulesForAZoneDeleteAnIpAccessRule(body, identifier, zoneId)

Delete an IP Access rule

Deletes an IP Access rule defined at the zone level.  Optionally, you can use the &#x60;cascade&#x60; property to specify that you wish to delete similar rules in other zones managed by the same zone owner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAZoneApi;

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


IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi();
RulesIdentifierBody1 body = new RulesIdentifierBody1(); // RulesIdentifierBody1 | 
String identifier = "identifier_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RuleSingleIdResponse result = apiInstance.ipAccessRulesForAZoneDeleteAnIpAccessRule(body, identifier, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneDeleteAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RulesIdentifierBody1**](RulesIdentifierBody1.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RuleSingleIdResponse**](RuleSingleIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAccessRulesForAZoneListIpAccessRules"></a>
# **ipAccessRulesForAZoneListIpAccessRules**
> RuleCollectionResponse ipAccessRulesForAZoneListIpAccessRules(zoneId)

List IP Access rules

Fetches IP Access rules of a zone. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAZoneApi;

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


IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi();
String zoneId = "zoneId_example"; // String | 
try {
    RuleCollectionResponse result = apiInstance.ipAccessRulesForAZoneListIpAccessRules(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneListIpAccessRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**RuleCollectionResponse**](RuleCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAccessRulesForAZoneUpdateAnIpAccessRule"></a>
# **ipAccessRulesForAZoneUpdateAnIpAccessRule**
> RuleSingleResponse ipAccessRulesForAZoneUpdateAnIpAccessRule(body, identifier, zoneId)

Update an IP Access rule

Updates an IP Access rule defined at the zone level. You can only update the rule action (&#x60;mode&#x60; parameter) and notes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAZoneApi;

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


IpAccessRulesForAZoneApi apiInstance = new IpAccessRulesForAZoneApi();
RulesIdentifierBody2 body = new RulesIdentifierBody2(); // RulesIdentifierBody2 | 
String identifier = "identifier_example"; // String | 
String zoneId = "zoneId_example"; // String | 
try {
    RuleSingleResponse result = apiInstance.ipAccessRulesForAZoneUpdateAnIpAccessRule(body, identifier, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAZoneApi#ipAccessRulesForAZoneUpdateAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RulesIdentifierBody2**](RulesIdentifierBody2.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**RuleSingleResponse**](RuleSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

