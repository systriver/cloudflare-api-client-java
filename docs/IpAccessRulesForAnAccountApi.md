# IpAccessRulesForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipAccessRulesForAnAccountCreateAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountCreateAnIpAccessRule) | **POST** /accounts/{account_identifier}/firewall/access_rules/rules | Create an IP Access rule
[**ipAccessRulesForAnAccountDeleteAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountDeleteAnIpAccessRule) | **DELETE** /accounts/{account_identifier}/firewall/access_rules/rules/{identifier} | Delete an IP Access rule
[**ipAccessRulesForAnAccountGetAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountGetAnIpAccessRule) | **GET** /accounts/{account_identifier}/firewall/access_rules/rules/{identifier} | Get an IP Access rule
[**ipAccessRulesForAnAccountListIpAccessRules**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountListIpAccessRules) | **GET** /accounts/{account_identifier}/firewall/access_rules/rules | List IP Access rules
[**ipAccessRulesForAnAccountUpdateAnIpAccessRule**](IpAccessRulesForAnAccountApi.md#ipAccessRulesForAnAccountUpdateAnIpAccessRule) | **PATCH** /accounts/{account_identifier}/firewall/access_rules/rules/{identifier} | Update an IP Access rule

<a name="ipAccessRulesForAnAccountCreateAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountCreateAnIpAccessRule**
> ResponseSingle ipAccessRulesForAnAccountCreateAnIpAccessRule(body, accountIdentifier)

Create an IP Access rule

Creates a new IP Access rule for an account. The rule will apply to all zones in the account.  Note: To create an IP Access rule that applies to a single zone, refer to the [IP Access rules for a zone](#ip-access-rules-for-a-zone) endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAnAccountApi;

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


IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi();
AccessRulesRulesBody body = new AccessRulesRulesBody(); // AccessRulesRulesBody | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    ResponseSingle result = apiInstance.ipAccessRulesForAnAccountCreateAnIpAccessRule(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountCreateAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessRulesRulesBody**](AccessRulesRulesBody.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAccessRulesForAnAccountDeleteAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountDeleteAnIpAccessRule**
> CloudflareClientAPIApiResponseSingleId ipAccessRulesForAnAccountDeleteAnIpAccessRule(identifier, accountIdentifier)

Delete an IP Access rule

Deletes an existing IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAnAccountApi;

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


IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.ipAccessRulesForAnAccountDeleteAnIpAccessRule(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountDeleteAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAccessRulesForAnAccountGetAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountGetAnIpAccessRule**
> ResponseSingle ipAccessRulesForAnAccountGetAnIpAccessRule(identifier, accountIdentifier)

Get an IP Access rule

Fetches the details of an IP Access rule defined at the account level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAnAccountApi;

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


IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    ResponseSingle result = apiInstance.ipAccessRulesForAnAccountGetAnIpAccessRule(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountGetAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAccessRulesForAnAccountListIpAccessRules"></a>
# **ipAccessRulesForAnAccountListIpAccessRules**
> CloudflareClientAPIResponseCollection ipAccessRulesForAnAccountListIpAccessRules(accountIdentifier)

List IP Access rules

Fetches IP Access rules of an account. These rules apply to all the zones in the account. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAnAccountApi;

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


IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi();
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    CloudflareClientAPIResponseCollection result = apiInstance.ipAccessRulesForAnAccountListIpAccessRules(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountListIpAccessRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIResponseCollection**](CloudflareClientAPIResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAccessRulesForAnAccountUpdateAnIpAccessRule"></a>
# **ipAccessRulesForAnAccountUpdateAnIpAccessRule**
> ResponseSingle ipAccessRulesForAnAccountUpdateAnIpAccessRule(body, identifier, accountIdentifier)

Update an IP Access rule

Updates an IP Access rule defined at the account level.  Note: This operation will affect all zones in the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAccessRulesForAnAccountApi;

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


IpAccessRulesForAnAccountApi apiInstance = new IpAccessRulesForAnAccountApi();
SchemasRule body = new SchemasRule(); // SchemasRule | 
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    ResponseSingle result = apiInstance.ipAccessRulesForAnAccountUpdateAnIpAccessRule(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAccessRulesForAnAccountApi#ipAccessRulesForAnAccountUpdateAnIpAccessRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasRule**](SchemasRule.md)|  |
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

