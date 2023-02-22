# WafPackagesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**wafPackagesGetAWafPackage**](WafPackagesApi.md#wafPackagesGetAWafPackage) | **GET** /zones/{zone_identifier}/firewall/waf/packages/{identifier} | Get a WAF package
[**wafPackagesListWafPackages**](WafPackagesApi.md#wafPackagesListWafPackages) | **GET** /zones/{zone_identifier}/firewall/waf/packages | List WAF packages
[**wafPackagesUpdateAWafPackage**](WafPackagesApi.md#wafPackagesUpdateAWafPackage) | **PATCH** /zones/{zone_identifier}/firewall/waf/packages/{identifier} | Update a WAF package

<a name="wafPackagesGetAWafPackage"></a>
# **wafPackagesGetAWafPackage**
> PackageResponseSingle wafPackagesGetAWafPackage(identifier, zoneIdentifier)

Get a WAF package

Fetches the details of a WAF package.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafPackagesApi;

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


WafPackagesApi apiInstance = new WafPackagesApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PackageResponseSingle result = apiInstance.wafPackagesGetAWafPackage(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafPackagesApi#wafPackagesGetAWafPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PackageResponseSingle**](PackageResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafPackagesListWafPackages"></a>
# **wafPackagesListWafPackages**
> PackageResponseCollection wafPackagesListWafPackages(zoneIdentifier)

List WAF packages

Fetches WAF packages for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafPackagesApi;

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


WafPackagesApi apiInstance = new WafPackagesApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PackageResponseCollection result = apiInstance.wafPackagesListWafPackages(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafPackagesApi#wafPackagesListWafPackages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PackageResponseCollection**](PackageResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="wafPackagesUpdateAWafPackage"></a>
# **wafPackagesUpdateAWafPackage**
> InlineResponse200117 wafPackagesUpdateAWafPackage(body, identifier, zoneIdentifier)

Update a WAF package

Updates a WAF package. You can update the sensitivity and the action of an anomaly detection WAF package.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WafPackagesApi;

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


WafPackagesApi apiInstance = new WafPackagesApi();
PackagesIdentifierBody body = new PackagesIdentifierBody(); // PackagesIdentifierBody | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200117 result = apiInstance.wafPackagesUpdateAWafPackage(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WafPackagesApi#wafPackagesUpdateAWafPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PackagesIdentifierBody**](PackagesIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200117**](InlineResponse200117.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

