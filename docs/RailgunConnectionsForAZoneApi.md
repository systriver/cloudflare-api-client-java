# RailgunConnectionsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**railgunConnectionsForAZoneConnectOrDisconnectARailgun**](RailgunConnectionsForAZoneApi.md#railgunConnectionsForAZoneConnectOrDisconnectARailgun) | **PATCH** /zones/{zone_identifier}/railguns/{identifier} | Connect or disconnect a Railgun
[**railgunConnectionsForAZoneListAvailableRailguns**](RailgunConnectionsForAZoneApi.md#railgunConnectionsForAZoneListAvailableRailguns) | **GET** /zones/{zone_identifier}/railguns | List available Railguns
[**railgunConnectionsForAZoneRailgunDetails**](RailgunConnectionsForAZoneApi.md#railgunConnectionsForAZoneRailgunDetails) | **GET** /zones/{zone_identifier}/railguns/{identifier} | Railgun details
[**railgunConnectionsForAZoneTestRailgunConnection**](RailgunConnectionsForAZoneApi.md#railgunConnectionsForAZoneTestRailgunConnection) | **GET** /zones/{zone_identifier}/railguns/{identifier}/diagnose | Test Railgun connection

<a name="railgunConnectionsForAZoneConnectOrDisconnectARailgun"></a>
# **railgunConnectionsForAZoneConnectOrDisconnectARailgun**
> RailgunResponseSingle railgunConnectionsForAZoneConnectOrDisconnectARailgun(body, identifier, zoneIdentifier)

Connect or disconnect a Railgun

Connect or disconnect a Railgun.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsForAZoneApi;

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


RailgunConnectionsForAZoneApi apiInstance = new RailgunConnectionsForAZoneApi();
RailgunsIdentifierBody2 body = new RailgunsIdentifierBody2(); // RailgunsIdentifierBody2 | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.railgunConnectionsForAZoneConnectOrDisconnectARailgun(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsForAZoneApi#railgunConnectionsForAZoneConnectOrDisconnectARailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RailgunsIdentifierBody2**](RailgunsIdentifierBody2.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="railgunConnectionsForAZoneListAvailableRailguns"></a>
# **railgunConnectionsForAZoneListAvailableRailguns**
> SchemasRailgunResponseCollection railgunConnectionsForAZoneListAvailableRailguns(zoneIdentifier)

List available Railguns

A list of available Railguns the zone can use.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsForAZoneApi;

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


RailgunConnectionsForAZoneApi apiInstance = new RailgunConnectionsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasRailgunResponseCollection result = apiInstance.railgunConnectionsForAZoneListAvailableRailguns(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsForAZoneApi#railgunConnectionsForAZoneListAvailableRailguns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasRailgunResponseCollection**](SchemasRailgunResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railgunConnectionsForAZoneRailgunDetails"></a>
# **railgunConnectionsForAZoneRailgunDetails**
> RailgunResponseSingle railgunConnectionsForAZoneRailgunDetails(identifier, zoneIdentifier)

Railgun details

Lists details about a specific Railgun.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsForAZoneApi;

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


RailgunConnectionsForAZoneApi apiInstance = new RailgunConnectionsForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.railgunConnectionsForAZoneRailgunDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsForAZoneApi#railgunConnectionsForAZoneRailgunDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="railgunConnectionsForAZoneTestRailgunConnection"></a>
# **railgunConnectionsForAZoneTestRailgunConnection**
> TestConnectionResponse railgunConnectionsForAZoneTestRailgunConnection(identifier, zoneIdentifier)

Test Railgun connection

Tests the Railgun connection to the zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RailgunConnectionsForAZoneApi;

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


RailgunConnectionsForAZoneApi apiInstance = new RailgunConnectionsForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    TestConnectionResponse result = apiInstance.railgunConnectionsForAZoneTestRailgunConnection(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RailgunConnectionsForAZoneApi#railgunConnectionsForAZoneTestRailgunConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**TestConnectionResponse**](TestConnectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

