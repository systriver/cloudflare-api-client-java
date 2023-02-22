# RailgunApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**railgunCreateRailgun**](RailgunApi.md#railgunCreateRailgun) | **POST** /railguns | Create Railgun
[**railgunDeleteARailgun**](RailgunApi.md#railgunDeleteARailgun) | **DELETE** /railguns/{identifier} | Delete a Railgun
[**railgunEnableOrDisableARailgun**](RailgunApi.md#railgunEnableOrDisableARailgun) | **PATCH** /railguns/{identifier} | Enable or disable a Railgun
[**railgunListRailgunZones**](RailgunApi.md#railgunListRailgunZones) | **GET** /railguns/{identifier}/zones | List Railgun zones
[**railgunListRailguns**](RailgunApi.md#railgunListRailguns) | **GET** /railguns | List Railguns
[**railgunRailgunDetails**](RailgunApi.md#railgunRailgunDetails) | **GET** /railguns/{identifier} | Railgun details

<a name="railgunCreateRailgun"></a>
# **railgunCreateRailgun**
> RailgunResponseSingle railgunCreateRailgun(body)

Create Railgun

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunApi;

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


RailgunApi apiInstance = new RailgunApi();
RailgunsBody body = new RailgunsBody(); // RailgunsBody | 
try {
    RailgunResponseSingle result = apiInstance.railgunCreateRailgun(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunApi#railgunCreateRailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RailgunsBody**](RailgunsBody.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="railgunDeleteARailgun"></a>
# **railgunDeleteARailgun**
> RailgunResponseSingleId railgunDeleteARailgun(identifier)

Delete a Railgun

Disable and delete a Railgun. This will immediately disable that Railgun for any connected zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunApi;

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


RailgunApi apiInstance = new RailgunApi();
String identifier = "identifier_example"; // String | 
try {
    RailgunResponseSingleId result = apiInstance.railgunDeleteARailgun(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunApi#railgunDeleteARailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingleId**](RailgunResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="railgunEnableOrDisableARailgun"></a>
# **railgunEnableOrDisableARailgun**
> RailgunResponseSingle railgunEnableOrDisableARailgun(body, identifier)

Enable or disable a Railgun

Enable or disable a Railgun for all zones connected to it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunApi;

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


RailgunApi apiInstance = new RailgunApi();
RailgunsIdentifierBody1 body = new RailgunsIdentifierBody1(); // RailgunsIdentifierBody1 | 
String identifier = "identifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.railgunEnableOrDisableARailgun(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunApi#railgunEnableOrDisableARailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RailgunsIdentifierBody1**](RailgunsIdentifierBody1.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="railgunListRailgunZones"></a>
# **railgunListRailgunZones**
> InlineResponse20030 railgunListRailgunZones(identifier)

List Railgun zones

List the zones that are currently using this Railgun.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunApi;

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


RailgunApi apiInstance = new RailgunApi();
String identifier = "identifier_example"; // String | 
try {
    InlineResponse20030 result = apiInstance.railgunListRailgunZones(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunApi#railgunListRailgunZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railgunListRailguns"></a>
# **railgunListRailguns**
> RailgunResponseCollection railgunListRailguns()

List Railguns

List, search, sort and filter your Railguns.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunApi;

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


RailgunApi apiInstance = new RailgunApi();
try {
    RailgunResponseCollection result = apiInstance.railgunListRailguns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunApi#railgunListRailguns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RailgunResponseCollection**](RailgunResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railgunRailgunDetails"></a>
# **railgunRailgunDetails**
> RailgunResponseSingle railgunRailgunDetails(identifier)

Railgun details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunApi;

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


RailgunApi apiInstance = new RailgunApi();
String identifier = "identifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.railgunRailgunDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunApi#railgunRailgunDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

