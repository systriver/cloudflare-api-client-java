# UserAgentBlockingRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userAgentBlockingRulesCreateAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesCreateAUserAgentBlockingRule) | **POST** /zones/{zone_identifier}/firewall/ua_rules | Create a User Agent Blocking rule
[**userAgentBlockingRulesDeleteAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesDeleteAUserAgentBlockingRule) | **DELETE** /zones/{zone_identifier}/firewall/ua_rules/{id} | Delete a User Agent Blocking rule
[**userAgentBlockingRulesGetAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesGetAUserAgentBlockingRule) | **GET** /zones/{zone_identifier}/firewall/ua_rules/{id} | Get a User Agent Blocking rule
[**userAgentBlockingRulesListUserAgentBlockingRules**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesListUserAgentBlockingRules) | **GET** /zones/{zone_identifier}/firewall/ua_rules | List User Agent Blocking rules
[**userAgentBlockingRulesUpdateAUserAgentBlockingRule**](UserAgentBlockingRulesApi.md#userAgentBlockingRulesUpdateAUserAgentBlockingRule) | **PUT** /zones/{zone_identifier}/firewall/ua_rules/{id} | Update a User Agent Blocking rule

<a name="userAgentBlockingRulesCreateAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesCreateAUserAgentBlockingRule**
> FirewalluablockResponseSingle userAgentBlockingRulesCreateAUserAgentBlockingRule(body, zoneIdentifier)

Create a User Agent Blocking rule

Creates a new User Agent Blocking rule in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserAgentBlockingRulesApi;

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


UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FirewalluablockResponseSingle result = apiInstance.userAgentBlockingRulesCreateAUserAgentBlockingRule(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesCreateAUserAgentBlockingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FirewalluablockResponseSingle**](FirewalluablockResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userAgentBlockingRulesDeleteAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesDeleteAUserAgentBlockingRule**
> InlineResponse200115 userAgentBlockingRulesDeleteAUserAgentBlockingRule(id, zoneIdentifier)

Delete a User Agent Blocking rule

Deletes an existing User Agent Blocking rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserAgentBlockingRulesApi;

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


UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200115 result = apiInstance.userAgentBlockingRulesDeleteAUserAgentBlockingRule(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesDeleteAUserAgentBlockingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200115**](InlineResponse200115.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userAgentBlockingRulesGetAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesGetAUserAgentBlockingRule**
> FirewalluablockResponseSingle userAgentBlockingRulesGetAUserAgentBlockingRule(id, zoneIdentifier)

Get a User Agent Blocking rule

Fetches the details of a User Agent Blocking rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserAgentBlockingRulesApi;

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


UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FirewalluablockResponseSingle result = apiInstance.userAgentBlockingRulesGetAUserAgentBlockingRule(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesGetAUserAgentBlockingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FirewalluablockResponseSingle**](FirewalluablockResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userAgentBlockingRulesListUserAgentBlockingRules"></a>
# **userAgentBlockingRulesListUserAgentBlockingRules**
> FirewalluablockResponseCollection userAgentBlockingRulesListUserAgentBlockingRules(zoneIdentifier)

List User Agent Blocking rules

Fetches User Agent Blocking rules in a zone. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserAgentBlockingRulesApi;

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


UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FirewalluablockResponseCollection result = apiInstance.userAgentBlockingRulesListUserAgentBlockingRules(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesListUserAgentBlockingRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FirewalluablockResponseCollection**](FirewalluablockResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userAgentBlockingRulesUpdateAUserAgentBlockingRule"></a>
# **userAgentBlockingRulesUpdateAUserAgentBlockingRule**
> FirewalluablockResponseSingle userAgentBlockingRulesUpdateAUserAgentBlockingRule(body, id, zoneIdentifier)

Update a User Agent Blocking rule

Updates an existing User Agent Blocking rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserAgentBlockingRulesApi;

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


UserAgentBlockingRulesApi apiInstance = new UserAgentBlockingRulesApi();
Object body = null; // Object | 
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FirewalluablockResponseSingle result = apiInstance.userAgentBlockingRulesUpdateAUserAgentBlockingRule(body, id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAgentBlockingRulesApi#userAgentBlockingRulesUpdateAUserAgentBlockingRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FirewalluablockResponseSingle**](FirewalluablockResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

