# TotalTlsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**totalTlsEnableOrDisableTotalTls**](TotalTlsApi.md#totalTlsEnableOrDisableTotalTls) | **POST** /zones/{zone_identifier}/acm/total_tls | Enable or Disable Total TLS
[**totalTlsTotalTlsSettingsDetails**](TotalTlsApi.md#totalTlsTotalTlsSettingsDetails) | **GET** /zones/{zone_identifier}/acm/total_tls | Total TLS Settings Details

<a name="totalTlsEnableOrDisableTotalTls"></a>
# **totalTlsEnableOrDisableTotalTls**
> TotalTlsSettingsResponse totalTlsEnableOrDisableTotalTls(body, zoneIdentifier)

Enable or Disable Total TLS

Set Total TLS Settings or disable the feature for a Zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TotalTlsApi;

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


TotalTlsApi apiInstance = new TotalTlsApi();
AcmTotalTlsBody body = new AcmTotalTlsBody(); // AcmTotalTlsBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    TotalTlsSettingsResponse result = apiInstance.totalTlsEnableOrDisableTotalTls(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TotalTlsApi#totalTlsEnableOrDisableTotalTls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AcmTotalTlsBody**](AcmTotalTlsBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**TotalTlsSettingsResponse**](TotalTlsSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="totalTlsTotalTlsSettingsDetails"></a>
# **totalTlsTotalTlsSettingsDetails**
> TotalTlsSettingsResponse totalTlsTotalTlsSettingsDetails(zoneIdentifier)

Total TLS Settings Details

Get Total TLS Settings for a Zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TotalTlsApi;

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


TotalTlsApi apiInstance = new TotalTlsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    TotalTlsSettingsResponse result = apiInstance.totalTlsTotalTlsSettingsDetails(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TotalTlsApi#totalTlsTotalTlsSettingsDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**TotalTlsSettingsResponse**](TotalTlsSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

