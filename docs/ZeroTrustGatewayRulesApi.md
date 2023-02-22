# ZeroTrustGatewayRulesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustGatewayRulesCreateZeroTrustGatewayRule**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesCreateZeroTrustGatewayRule) | **POST** /accounts/{identifier}/gateway/rules | Create Zero Trust Gateway Rule
[**zeroTrustGatewayRulesDeleteZeroTrustGatewayRule**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesDeleteZeroTrustGatewayRule) | **DELETE** /accounts/{identifier}/gateway/rules/{uuid} | Delete Zero Trust Gateway Rule
[**zeroTrustGatewayRulesListZeroTrustGatewayRules**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesListZeroTrustGatewayRules) | **GET** /accounts/{identifier}/gateway/rules | List Zero Trust Gateway Rules
[**zeroTrustGatewayRulesUpdateZeroTrustGatewayRule**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesUpdateZeroTrustGatewayRule) | **PUT** /accounts/{identifier}/gateway/rules/{uuid} | Update Zero Trust Gateway Rule
[**zeroTrustGatewayRulesZeroTrustGatewayRuleDetails**](ZeroTrustGatewayRulesApi.md#zeroTrustGatewayRulesZeroTrustGatewayRuleDetails) | **GET** /accounts/{identifier}/gateway/rules/{uuid} | Zero Trust Gateway Rule Details

<a name="zeroTrustGatewayRulesCreateZeroTrustGatewayRule"></a>
# **zeroTrustGatewayRulesCreateZeroTrustGatewayRule**
> RulesComponentsSchemasSingleResponse zeroTrustGatewayRulesCreateZeroTrustGatewayRule(body, identifier)

Create Zero Trust Gateway Rule

Create a new Zero Trust Gateway Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayRulesApi;

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


ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi();
GatewayRulesBody body = new GatewayRulesBody(); // GatewayRulesBody | 
RulesComponentsSchemasIdentifier identifier = new RulesComponentsSchemasIdentifier(); // RulesComponentsSchemasIdentifier | 
try {
    RulesComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayRulesCreateZeroTrustGatewayRule(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesCreateZeroTrustGatewayRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayRulesBody**](GatewayRulesBody.md)|  |
 **identifier** | [**RulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**RulesComponentsSchemasSingleResponse**](RulesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayRulesDeleteZeroTrustGatewayRule"></a>
# **zeroTrustGatewayRulesDeleteZeroTrustGatewayRule**
> RulesComponentsSchemasEmptyResponse zeroTrustGatewayRulesDeleteZeroTrustGatewayRule(uuid, identifier)

Delete Zero Trust Gateway Rule

Delete a Zero Trust Gateway Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayRulesApi;

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


ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi();
String uuid = "uuid_example"; // String | 
RulesComponentsSchemasIdentifier identifier = new RulesComponentsSchemasIdentifier(); // RulesComponentsSchemasIdentifier | 
try {
    RulesComponentsSchemasEmptyResponse result = apiInstance.zeroTrustGatewayRulesDeleteZeroTrustGatewayRule(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesDeleteZeroTrustGatewayRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**RulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**RulesComponentsSchemasEmptyResponse**](RulesComponentsSchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayRulesListZeroTrustGatewayRules"></a>
# **zeroTrustGatewayRulesListZeroTrustGatewayRules**
> RulesComponentsSchemasResponseCollection zeroTrustGatewayRulesListZeroTrustGatewayRules(identifier)

List Zero Trust Gateway Rules

List Zero Trust Gateway Rules for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayRulesApi;

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


ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi();
RulesComponentsSchemasIdentifier identifier = new RulesComponentsSchemasIdentifier(); // RulesComponentsSchemasIdentifier | 
try {
    RulesComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayRulesListZeroTrustGatewayRules(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesListZeroTrustGatewayRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**RulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**RulesComponentsSchemasResponseCollection**](RulesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustGatewayRulesUpdateZeroTrustGatewayRule"></a>
# **zeroTrustGatewayRulesUpdateZeroTrustGatewayRule**
> RulesComponentsSchemasSingleResponse zeroTrustGatewayRulesUpdateZeroTrustGatewayRule(body, uuid, identifier)

Update Zero Trust Gateway Rule

Update a configured Zero Trust Gateway Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayRulesApi;

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


ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi();
RulesUuidBody body = new RulesUuidBody(); // RulesUuidBody | 
String uuid = "uuid_example"; // String | 
RulesComponentsSchemasIdentifier identifier = new RulesComponentsSchemasIdentifier(); // RulesComponentsSchemasIdentifier | 
try {
    RulesComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayRulesUpdateZeroTrustGatewayRule(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesUpdateZeroTrustGatewayRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RulesUuidBody**](RulesUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**RulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**RulesComponentsSchemasSingleResponse**](RulesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayRulesZeroTrustGatewayRuleDetails"></a>
# **zeroTrustGatewayRulesZeroTrustGatewayRuleDetails**
> RulesComponentsSchemasSingleResponse zeroTrustGatewayRulesZeroTrustGatewayRuleDetails(uuid, identifier)

Zero Trust Gateway Rule Details

Fetch a single Zero Trust Gateway Rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayRulesApi;

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


ZeroTrustGatewayRulesApi apiInstance = new ZeroTrustGatewayRulesApi();
String uuid = "uuid_example"; // String | 
RulesComponentsSchemasIdentifier identifier = new RulesComponentsSchemasIdentifier(); // RulesComponentsSchemasIdentifier | 
try {
    RulesComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayRulesZeroTrustGatewayRuleDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayRulesApi#zeroTrustGatewayRulesZeroTrustGatewayRuleDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**RulesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**RulesComponentsSchemasSingleResponse**](RulesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

