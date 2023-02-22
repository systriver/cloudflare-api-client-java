# PageRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pageRulesCreateAPageRule**](PageRulesApi.md#pageRulesCreateAPageRule) | **POST** /zones/{zone_identifier}/pagerules | Create a Page Rule
[**pageRulesDeleteAPageRule**](PageRulesApi.md#pageRulesDeleteAPageRule) | **DELETE** /zones/{zone_identifier}/pagerules/{identifier} | Delete a Page Rule
[**pageRulesEditAPageRule**](PageRulesApi.md#pageRulesEditAPageRule) | **PATCH** /zones/{zone_identifier}/pagerules/{identifier} | Edit a Page Rule
[**pageRulesGetAPageRule**](PageRulesApi.md#pageRulesGetAPageRule) | **GET** /zones/{zone_identifier}/pagerules/{identifier} | Get a Page Rule
[**pageRulesListPageRules**](PageRulesApi.md#pageRulesListPageRules) | **GET** /zones/{zone_identifier}/pagerules | List Page Rules
[**pageRulesUpdateAPageRule**](PageRulesApi.md#pageRulesUpdateAPageRule) | **PUT** /zones/{zone_identifier}/pagerules/{identifier} | Update a Page Rule

<a name="pageRulesCreateAPageRule"></a>
# **pageRulesCreateAPageRule**
> PageruleResponseSingle pageRulesCreateAPageRule(body, zoneIdentifier)

Create a Page Rule

Creates a new Page Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageRulesApi;

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


PageRulesApi apiInstance = new PageRulesApi();
ZoneIdentifierPagerulesBody body = new ZoneIdentifierPagerulesBody(); // ZoneIdentifierPagerulesBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PageruleResponseSingle result = apiInstance.pageRulesCreateAPageRule(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageRulesApi#pageRulesCreateAPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdentifierPagerulesBody**](ZoneIdentifierPagerulesBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PageruleResponseSingle**](PageruleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pageRulesDeleteAPageRule"></a>
# **pageRulesDeleteAPageRule**
> CloudflareClientAPIApiResponseSingleId pageRulesDeleteAPageRule(identifier, zoneIdentifier)

Delete a Page Rule

Deletes an existing Page Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageRulesApi;

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


PageRulesApi apiInstance = new PageRulesApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.pageRulesDeleteAPageRule(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageRulesApi#pageRulesDeleteAPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pageRulesEditAPageRule"></a>
# **pageRulesEditAPageRule**
> PageruleResponseSingle pageRulesEditAPageRule(body, identifier, zoneIdentifier)

Edit a Page Rule

Updates one or more fields of an existing Page Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageRulesApi;

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


PageRulesApi apiInstance = new PageRulesApi();
PagerulesIdentifierBody1 body = new PagerulesIdentifierBody1(); // PagerulesIdentifierBody1 | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PageruleResponseSingle result = apiInstance.pageRulesEditAPageRule(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageRulesApi#pageRulesEditAPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PagerulesIdentifierBody1**](PagerulesIdentifierBody1.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PageruleResponseSingle**](PageruleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pageRulesGetAPageRule"></a>
# **pageRulesGetAPageRule**
> PageruleResponseSingle pageRulesGetAPageRule(identifier, zoneIdentifier)

Get a Page Rule

Fetches the details of a Page Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageRulesApi;

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


PageRulesApi apiInstance = new PageRulesApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PageruleResponseSingle result = apiInstance.pageRulesGetAPageRule(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageRulesApi#pageRulesGetAPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PageruleResponseSingle**](PageruleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pageRulesListPageRules"></a>
# **pageRulesListPageRules**
> PageruleResponseCollection pageRulesListPageRules(zoneIdentifier)

List Page Rules

Fetches Page Rules in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageRulesApi;

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


PageRulesApi apiInstance = new PageRulesApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PageruleResponseCollection result = apiInstance.pageRulesListPageRules(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageRulesApi#pageRulesListPageRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PageruleResponseCollection**](PageruleResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pageRulesUpdateAPageRule"></a>
# **pageRulesUpdateAPageRule**
> PageruleResponseSingle pageRulesUpdateAPageRule(body, identifier, zoneIdentifier)

Update a Page Rule

Replaces the configuration of an existing Page Rule. The configuration of the updated Page Rule will exactly match the data passed in the API request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PageRulesApi;

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


PageRulesApi apiInstance = new PageRulesApi();
PagerulesIdentifierBody body = new PagerulesIdentifierBody(); // PagerulesIdentifierBody | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PageruleResponseSingle result = apiInstance.pageRulesUpdateAPageRule(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PageRulesApi#pageRulesUpdateAPageRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PagerulesIdentifierBody**](PagerulesIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PageruleResponseSingle**](PageruleResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

