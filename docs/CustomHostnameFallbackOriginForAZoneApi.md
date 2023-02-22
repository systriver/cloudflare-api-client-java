# CustomHostnameFallbackOriginForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames**](CustomHostnameFallbackOriginForAZoneApi.md#customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames) | **DELETE** /zones/{zone_identifier}/custom_hostnames/fallback_origin | Delete Fallback Origin for Custom Hostnames
[**customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames**](CustomHostnameFallbackOriginForAZoneApi.md#customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames) | **GET** /zones/{zone_identifier}/custom_hostnames/fallback_origin | Get Fallback Origin for Custom Hostnames
[**customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames**](CustomHostnameFallbackOriginForAZoneApi.md#customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames) | **PUT** /zones/{zone_identifier}/custom_hostnames/fallback_origin | Update Fallback Origin for Custom Hostnames

<a name="customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames"></a>
# **customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames**
> FallbackOriginResponse customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames(zoneIdentifier)

Delete Fallback Origin for Custom Hostnames

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameFallbackOriginForAZoneApi;

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


CustomHostnameFallbackOriginForAZoneApi apiInstance = new CustomHostnameFallbackOriginForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FallbackOriginResponse result = apiInstance.customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameFallbackOriginForAZoneApi#customHostnameFallbackOriginForAZoneDeleteFallbackOriginForCustomHostnames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FallbackOriginResponse**](FallbackOriginResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames"></a>
# **customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames**
> FallbackOriginResponse customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames(zoneIdentifier)

Get Fallback Origin for Custom Hostnames

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameFallbackOriginForAZoneApi;

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


CustomHostnameFallbackOriginForAZoneApi apiInstance = new CustomHostnameFallbackOriginForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FallbackOriginResponse result = apiInstance.customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameFallbackOriginForAZoneApi#customHostnameFallbackOriginForAZoneGetFallbackOriginForCustomHostnames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FallbackOriginResponse**](FallbackOriginResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames"></a>
# **customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames**
> FallbackOriginResponse customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames(body, zoneIdentifier)

Update Fallback Origin for Custom Hostnames

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameFallbackOriginForAZoneApi;

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


CustomHostnameFallbackOriginForAZoneApi apiInstance = new CustomHostnameFallbackOriginForAZoneApi();
CustomHostnamesFallbackOriginBody body = new CustomHostnamesFallbackOriginBody(); // CustomHostnamesFallbackOriginBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    FallbackOriginResponse result = apiInstance.customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameFallbackOriginForAZoneApi#customHostnameFallbackOriginForAZoneUpdateFallbackOriginForCustomHostnames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomHostnamesFallbackOriginBody**](CustomHostnamesFallbackOriginBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**FallbackOriginResponse**](FallbackOriginResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

