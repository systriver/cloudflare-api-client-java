# IpAccessRulesForAUserApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipAccessRulesForAUserCreateAnIpAccessRule**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserCreateAnIpAccessRule) | **POST** /user/firewall/access_rules/rules | Create an IP Access rule
[**ipAccessRulesForAUserDeleteAnIpAccessRule**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserDeleteAnIpAccessRule) | **DELETE** /user/firewall/access_rules/rules/{identifier} | Delete an IP Access rule
[**ipAccessRulesForAUserListIpAccessRules**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserListIpAccessRules) | **GET** /user/firewall/access_rules/rules | List IP Access rules
[**ipAccessRulesForAUserUpdateAnIpAccessRule**](IpAccessRulesForAUserApi.md#ipAccessRulesForAUserUpdateAnIpAccessRule) | **PATCH** /user/firewall/access_rules/rules/{identifier} | Update an IP Access rule

<a name="ipAccessRulesForAUserCreateAnIpAccessRule"></a>
# **ipAccessRulesForAUserCreateAnIpAccessRule**
> RuleSingleResponse ipAccessRulesForAUserCreateAnIpAccessRule(body)

Create an IP Access rule

Creates a new IP Access rule for all zones owned by the current user.  Note: To create an IP Access rule that applies to a specific zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAUserApi;

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


IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi();
AccessRulesRulesBody1 body = new AccessRulesRulesBody1(); // AccessRulesRulesBody1 | 
try {
    RuleSingleResponse result = apiInstance.ipAccessRulesForAUserCreateAnIpAccessRule(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserCreateAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessRulesRulesBody1**](AccessRulesRulesBody1.md)|  |

### Return type

[**RuleSingleResponse**](RuleSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAccessRulesForAUserDeleteAnIpAccessRule"></a>
# **ipAccessRulesForAUserDeleteAnIpAccessRule**
> RuleSingleIdResponse ipAccessRulesForAUserDeleteAnIpAccessRule(identifier)

Delete an IP Access rule

Deletes an IP Access rule at the user level.  Note: Deleting a user-level rule will affect all zones owned by the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAUserApi;

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


IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi();
String identifier = "identifier_example"; // String | 
try {
    RuleSingleIdResponse result = apiInstance.ipAccessRulesForAUserDeleteAnIpAccessRule(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserDeleteAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**RuleSingleIdResponse**](RuleSingleIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAccessRulesForAUserListIpAccessRules"></a>
# **ipAccessRulesForAUserListIpAccessRules**
> RuleCollectionResponse ipAccessRulesForAUserListIpAccessRules()

List IP Access rules

Fetches IP Access rules of the user. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAUserApi;

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


IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi();
try {
    RuleCollectionResponse result = apiInstance.ipAccessRulesForAUserListIpAccessRules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserListIpAccessRules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RuleCollectionResponse**](RuleCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAccessRulesForAUserUpdateAnIpAccessRule"></a>
# **ipAccessRulesForAUserUpdateAnIpAccessRule**
> RuleSingleResponse ipAccessRulesForAUserUpdateAnIpAccessRule(body, identifier)

Update an IP Access rule

Updates an IP Access rule defined at the user level. You can only update the rule action (&#x60;mode&#x60; parameter) and notes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAUserApi;

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


IpAccessRulesForAUserApi apiInstance = new IpAccessRulesForAUserApi();
RulesIdentifierBody body = new RulesIdentifierBody(); // RulesIdentifierBody | 
String identifier = "identifier_example"; // String | 
try {
    RuleSingleResponse result = apiInstance.ipAccessRulesForAUserUpdateAnIpAccessRule(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAUserApi#ipAccessRulesForAUserUpdateAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RulesIdentifierBody**](RulesIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**RuleSingleResponse**](RuleSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

