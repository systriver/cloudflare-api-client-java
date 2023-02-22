# FirewallRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**firewallRulesCreateFirewallRules**](FirewallRulesApi.md#firewallRulesCreateFirewallRules) | **POST** /zones/{zone_identifier}/firewall/rules | Create firewall rules
[**firewallRulesDeleteAFirewallRule**](FirewallRulesApi.md#firewallRulesDeleteAFirewallRule) | **DELETE** /zones/{zone_identifier}/firewall/rules/{id} | Delete a firewall rule
[**firewallRulesDeleteFirewallRules**](FirewallRulesApi.md#firewallRulesDeleteFirewallRules) | **DELETE** /zones/{zone_identifier}/firewall/rules | Delete firewall rules
[**firewallRulesGetAFirewallRule**](FirewallRulesApi.md#firewallRulesGetAFirewallRule) | **GET** /zones/{zone_identifier}/firewall/rules/{id} | Get a firewall rule
[**firewallRulesListFirewallRules**](FirewallRulesApi.md#firewallRulesListFirewallRules) | **GET** /zones/{zone_identifier}/firewall/rules | List firewall rules
[**firewallRulesUpdateAFirewallRule**](FirewallRulesApi.md#firewallRulesUpdateAFirewallRule) | **PUT** /zones/{zone_identifier}/firewall/rules/{id} | Update a firewall rule
[**firewallRulesUpdateFirewallRules**](FirewallRulesApi.md#firewallRulesUpdateFirewallRules) | **PUT** /zones/{zone_identifier}/firewall/rules | Update firewall rules
[**firewallRulesUpdatePriorityOfAFirewallRule**](FirewallRulesApi.md#firewallRulesUpdatePriorityOfAFirewallRule) | **PATCH** /zones/{zone_identifier}/firewall/rules/{id} | Update priority of a firewall rule
[**firewallRulesUpdatePriorityOfFirewallRules**](FirewallRulesApi.md#firewallRulesUpdatePriorityOfFirewallRules) | **PATCH** /zones/{zone_identifier}/firewall/rules | Update priority of firewall rules

<a name="firewallRulesCreateFirewallRules"></a>
# **firewallRulesCreateFirewallRules**
> FilterRulesResponseCollection firewallRulesCreateFirewallRules(body, zoneIdentifier)

Create firewall rules

Create one or more firewall rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesResponseCollection result = apiInstance.firewallRulesCreateFirewallRules(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesCreateFirewallRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FilterRulesResponseCollection**](FilterRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="firewallRulesDeleteAFirewallRule"></a>
# **firewallRulesDeleteAFirewallRule**
> FilterRulesSingleResponseDelete firewallRulesDeleteAFirewallRule(body, id, zoneIdentifier)

Delete a firewall rule

Deletes an existing firewall rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
RulesIdBody body = new RulesIdBody(); // RulesIdBody | 
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesSingleResponseDelete result = apiInstance.firewallRulesDeleteAFirewallRule(body, id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesDeleteAFirewallRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RulesIdBody**](RulesIdBody.md)|  |
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FilterRulesSingleResponseDelete**](FilterRulesSingleResponseDelete.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="firewallRulesDeleteFirewallRules"></a>
# **firewallRulesDeleteFirewallRules**
> FilterRulesResponseCollectionDelete firewallRulesDeleteFirewallRules(body, zoneIdentifier)

Delete firewall rules

Deletes existing firewall rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
FirewallRulesBody body = new FirewallRulesBody(); // FirewallRulesBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesResponseCollectionDelete result = apiInstance.firewallRulesDeleteFirewallRules(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesDeleteFirewallRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FirewallRulesBody**](FirewallRulesBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FilterRulesResponseCollectionDelete**](FilterRulesResponseCollectionDelete.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="firewallRulesGetAFirewallRule"></a>
# **firewallRulesGetAFirewallRule**
> FilterRulesSingleResponse firewallRulesGetAFirewallRule(id, zoneIdentifier)

Get a firewall rule

Fetches the details of a firewall rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesSingleResponse result = apiInstance.firewallRulesGetAFirewallRule(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesGetAFirewallRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FilterRulesSingleResponse**](FilterRulesSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="firewallRulesListFirewallRules"></a>
# **firewallRulesListFirewallRules**
> FilterRulesResponseCollection firewallRulesListFirewallRules(zoneIdentifier)

List firewall rules

Fetches firewall rules in a zone. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesResponseCollection result = apiInstance.firewallRulesListFirewallRules(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesListFirewallRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FilterRulesResponseCollection**](FilterRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="firewallRulesUpdateAFirewallRule"></a>
# **firewallRulesUpdateAFirewallRule**
> FilterRulesSingleResponse firewallRulesUpdateAFirewallRule(body, id, zoneIdentifier)

Update a firewall rule

Updates an existing firewall rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
Object body = null; // Object | 
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesSingleResponse result = apiInstance.firewallRulesUpdateAFirewallRule(body, id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdateAFirewallRule");
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

[**FilterRulesSingleResponse**](FilterRulesSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="firewallRulesUpdateFirewallRules"></a>
# **firewallRulesUpdateFirewallRules**
> FilterRulesResponseCollection firewallRulesUpdateFirewallRules(body, zoneIdentifier)

Update firewall rules

Updates one or more existing firewall rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesResponseCollection result = apiInstance.firewallRulesUpdateFirewallRules(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdateFirewallRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FilterRulesResponseCollection**](FilterRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="firewallRulesUpdatePriorityOfAFirewallRule"></a>
# **firewallRulesUpdatePriorityOfAFirewallRule**
> FilterRulesResponseCollection firewallRulesUpdatePriorityOfAFirewallRule(body, id, zoneIdentifier)

Update priority of a firewall rule

Updates the priority of an existing firewall rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
Object body = null; // Object | 
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesResponseCollection result = apiInstance.firewallRulesUpdatePriorityOfAFirewallRule(body, id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdatePriorityOfAFirewallRule");
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

[**FilterRulesResponseCollection**](FilterRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="firewallRulesUpdatePriorityOfFirewallRules"></a>
# **firewallRulesUpdatePriorityOfFirewallRules**
> FilterRulesResponseCollection firewallRulesUpdatePriorityOfFirewallRules(body, zoneIdentifier)

Update priority of firewall rules

Updates the priority of existing firewall rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FirewallRulesApi;

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


FirewallRulesApi apiInstance = new FirewallRulesApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FilterRulesResponseCollection result = apiInstance.firewallRulesUpdatePriorityOfFirewallRules(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FirewallRulesApi#firewallRulesUpdatePriorityOfFirewallRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FilterRulesResponseCollection**](FilterRulesResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

