# WafOverridesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wafOverridesCreateAWafOverride**](WafOverridesApi.md#wafOverridesCreateAWafOverride) | **POST** /zones/{zone_identifier}/firewall/waf/overrides | Create a WAF override
[**wafOverridesDeleteAWafOverride**](WafOverridesApi.md#wafOverridesDeleteAWafOverride) | **DELETE** /zones/{zone_identifier}/firewall/waf/overrides/{id} | Delete a WAF override
[**wafOverridesGetAWafOverride**](WafOverridesApi.md#wafOverridesGetAWafOverride) | **GET** /zones/{zone_identifier}/firewall/waf/overrides/{id} | Get a WAF override
[**wafOverridesListWafOverrides**](WafOverridesApi.md#wafOverridesListWafOverrides) | **GET** /zones/{zone_identifier}/firewall/waf/overrides | List WAF overrides
[**wafOverridesUpdateWafOverride**](WafOverridesApi.md#wafOverridesUpdateWafOverride) | **PUT** /zones/{zone_identifier}/firewall/waf/overrides/{id} | Update WAF override

<a name="wafOverridesCreateAWafOverride"></a>
# **wafOverridesCreateAWafOverride**
> OverrideResponseSingle wafOverridesCreateAWafOverride(body, zoneIdentifier)

Create a WAF override

Creates a URI-based WAF override for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafOverridesApi;

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


WafOverridesApi apiInstance = new WafOverridesApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    OverrideResponseSingle result = apiInstance.wafOverridesCreateAWafOverride(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafOverridesApi#wafOverridesCreateAWafOverride");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**OverrideResponseSingle**](OverrideResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="wafOverridesDeleteAWafOverride"></a>
# **wafOverridesDeleteAWafOverride**
> InlineResponse200116 wafOverridesDeleteAWafOverride(id, zoneIdentifier)

Delete a WAF override

Deletes an existing URI-based WAF override.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafOverridesApi;

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


WafOverridesApi apiInstance = new WafOverridesApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200116 result = apiInstance.wafOverridesDeleteAWafOverride(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafOverridesApi#wafOverridesDeleteAWafOverride");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200116**](InlineResponse200116.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="wafOverridesGetAWafOverride"></a>
# **wafOverridesGetAWafOverride**
> OverrideResponseSingle wafOverridesGetAWafOverride(id, zoneIdentifier)

Get a WAF override

Fetches the details of a URI-based WAF override.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafOverridesApi;

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


WafOverridesApi apiInstance = new WafOverridesApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    OverrideResponseSingle result = apiInstance.wafOverridesGetAWafOverride(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafOverridesApi#wafOverridesGetAWafOverride");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**OverrideResponseSingle**](OverrideResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafOverridesListWafOverrides"></a>
# **wafOverridesListWafOverrides**
> OverrideResponseCollection wafOverridesListWafOverrides(zoneIdentifier)

List WAF overrides

Fetches the URI-based WAF overrides in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafOverridesApi;

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


WafOverridesApi apiInstance = new WafOverridesApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    OverrideResponseCollection result = apiInstance.wafOverridesListWafOverrides(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafOverridesApi#wafOverridesListWafOverrides");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**OverrideResponseCollection**](OverrideResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafOverridesUpdateWafOverride"></a>
# **wafOverridesUpdateWafOverride**
> OverrideResponseSingle wafOverridesUpdateWafOverride(body, id, zoneIdentifier)

Update WAF override

Updates an existing URI-based WAF override.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafOverridesApi;

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


WafOverridesApi apiInstance = new WafOverridesApi();
Object body = null; // Object | 
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    OverrideResponseSingle result = apiInstance.wafOverridesUpdateWafOverride(body, id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafOverridesApi#wafOverridesUpdateWafOverride");
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

[**OverrideResponseSingle**](OverrideResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

