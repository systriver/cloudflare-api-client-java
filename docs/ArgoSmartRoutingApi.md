# ArgoSmartRoutingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**argoSmartRoutingGetArgoSmartRoutingSetting**](ArgoSmartRoutingApi.md#argoSmartRoutingGetArgoSmartRoutingSetting) | **GET** /zones/{zone_identifier}/argo/smart_routing | Get Argo Smart Routing setting
[**argoSmartRoutingPatchArgoSmartRoutingSetting**](ArgoSmartRoutingApi.md#argoSmartRoutingPatchArgoSmartRoutingSetting) | **PATCH** /zones/{zone_identifier}/argo/smart_routing | Patch Argo Smart Routing setting

<a name="argoSmartRoutingGetArgoSmartRoutingSetting"></a>
# **argoSmartRoutingGetArgoSmartRoutingSetting**
> SchemasResponseSingle argoSmartRoutingGetArgoSmartRoutingSetting(zoneIdentifier)

Get Argo Smart Routing setting

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoSmartRoutingApi;

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


ArgoSmartRoutingApi apiInstance = new ArgoSmartRoutingApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.argoSmartRoutingGetArgoSmartRoutingSetting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoSmartRoutingApi#argoSmartRoutingGetArgoSmartRoutingSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="argoSmartRoutingPatchArgoSmartRoutingSetting"></a>
# **argoSmartRoutingPatchArgoSmartRoutingSetting**
> SchemasResponseSingle argoSmartRoutingPatchArgoSmartRoutingSetting(body, zoneIdentifier)

Patch Argo Smart Routing setting

Updates enablement of Argo Smart Routing.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoSmartRoutingApi;

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


ArgoSmartRoutingApi apiInstance = new ArgoSmartRoutingApi();
Patch body = new Patch(); // Patch | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.argoSmartRoutingPatchArgoSmartRoutingSetting(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoSmartRoutingApi#argoSmartRoutingPatchArgoSmartRoutingSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Patch**](Patch.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

