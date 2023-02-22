# UniversalSslSettingsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**universalSslSettingsForAZoneEditUniversalSslSettings**](UniversalSslSettingsForAZoneApi.md#universalSslSettingsForAZoneEditUniversalSslSettings) | **PATCH** /zones/{zone_identifier}/ssl/universal/settings | Edit Universal SSL Settings
[**universalSslSettingsForAZoneUniversalSslSettingsDetails**](UniversalSslSettingsForAZoneApi.md#universalSslSettingsForAZoneUniversalSslSettingsDetails) | **GET** /zones/{zone_identifier}/ssl/universal/settings | Universal SSL Settings Details

<a name="universalSslSettingsForAZoneEditUniversalSslSettings"></a>
# **universalSslSettingsForAZoneEditUniversalSslSettings**
> SslUniversalSettingsResponse universalSslSettingsForAZoneEditUniversalSslSettings(body, zoneIdentifier)

Edit Universal SSL Settings

Patch Universal SSL Settings for a Zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UniversalSslSettingsForAZoneApi;

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


UniversalSslSettingsForAZoneApi apiInstance = new UniversalSslSettingsForAZoneApi();
Universal body = new Universal(); // Universal | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SslUniversalSettingsResponse result = apiInstance.universalSslSettingsForAZoneEditUniversalSslSettings(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniversalSslSettingsForAZoneApi#universalSslSettingsForAZoneEditUniversalSslSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Universal**](Universal.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SslUniversalSettingsResponse**](SslUniversalSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="universalSslSettingsForAZoneUniversalSslSettingsDetails"></a>
# **universalSslSettingsForAZoneUniversalSslSettingsDetails**
> SslUniversalSettingsResponse universalSslSettingsForAZoneUniversalSslSettingsDetails(zoneIdentifier)

Universal SSL Settings Details

Get Universal SSL Settings for a Zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UniversalSslSettingsForAZoneApi;

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


UniversalSslSettingsForAZoneApi apiInstance = new UniversalSslSettingsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SslUniversalSettingsResponse result = apiInstance.universalSslSettingsForAZoneUniversalSslSettingsDetails(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniversalSslSettingsForAZoneApi#universalSslSettingsForAZoneUniversalSslSettingsDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SslUniversalSettingsResponse**](SslUniversalSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

