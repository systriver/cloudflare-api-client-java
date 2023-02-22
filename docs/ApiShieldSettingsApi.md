# ApiShieldSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties**](ApiShieldSettingsApi.md#apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties) | **GET** /zones/{zone_id}/api_gateway/configuration | Retrieve information about specific configuration properties
[**apiShieldSettingsSetConfigurationProperties**](ApiShieldSettingsApi.md#apiShieldSettingsSetConfigurationProperties) | **PUT** /zones/{zone_id}/api_gateway/configuration | Set configuration properties

<a name="apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties"></a>
# **apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties**
> CloudflareClientAPISingleResponse apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties(zoneId)

Retrieve information about specific configuration properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldSettingsApi;

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


ApiShieldSettingsApi apiInstance = new ApiShieldSettingsApi();
String zoneId = "zoneId_example"; // String | 
try {
    CloudflareClientAPISingleResponse result = apiInstance.apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldSettingsApi#apiShieldSettingsRetrieveInformationAboutSpecificConfigurationProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPISingleResponse**](CloudflareClientAPISingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiShieldSettingsSetConfigurationProperties"></a>
# **apiShieldSettingsSetConfigurationProperties**
> DefaultResponse apiShieldSettingsSetConfigurationProperties(body, zoneId)

Set configuration properties

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApiShieldSettingsApi;

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


ApiShieldSettingsApi apiInstance = new ApiShieldSettingsApi();
ModelConfiguration body = new ModelConfiguration(); // ModelConfiguration | 
String zoneId = "zoneId_example"; // String | 
try {
    DefaultResponse result = apiInstance.apiShieldSettingsSetConfigurationProperties(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiShieldSettingsApi#apiShieldSettingsSetConfigurationProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ModelConfiguration**](ModelConfiguration.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**DefaultResponse**](DefaultResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

