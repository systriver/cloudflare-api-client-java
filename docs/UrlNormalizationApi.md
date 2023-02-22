# UrlNormalizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**urlNormalizationGetUrlNormalizationSettings**](UrlNormalizationApi.md#urlNormalizationGetUrlNormalizationSettings) | **GET** /zones/{zone_id}/url_normalization | Get URL normalization settings
[**urlNormalizationUpdateUrlNormalizationSettings**](UrlNormalizationApi.md#urlNormalizationUpdateUrlNormalizationSettings) | **PUT** /zones/{zone_id}/url_normalization | Update URL normalization settings

<a name="urlNormalizationGetUrlNormalizationSettings"></a>
# **urlNormalizationGetUrlNormalizationSettings**
> SchemasResponseModel urlNormalizationGetUrlNormalizationSettings(zoneId)

Get URL normalization settings

Fetches the current URL normalization settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UrlNormalizationApi;

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


UrlNormalizationApi apiInstance = new UrlNormalizationApi();
String zoneId = "zoneId_example"; // String | 
try {
    SchemasResponseModel result = apiInstance.urlNormalizationGetUrlNormalizationSettings(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UrlNormalizationApi#urlNormalizationGetUrlNormalizationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**SchemasResponseModel**](SchemasResponseModel.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="urlNormalizationUpdateUrlNormalizationSettings"></a>
# **urlNormalizationUpdateUrlNormalizationSettings**
> SchemasResponseModel urlNormalizationUpdateUrlNormalizationSettings(body, zoneId)

Update URL normalization settings

Updates the URL normalization settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UrlNormalizationApi;

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


UrlNormalizationApi apiInstance = new UrlNormalizationApi();
SchemasRequestModel body = new SchemasRequestModel(); // SchemasRequestModel | 
String zoneId = "zoneId_example"; // String | 
try {
    SchemasResponseModel result = apiInstance.urlNormalizationUpdateUrlNormalizationSettings(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UrlNormalizationApi#urlNormalizationUpdateUrlNormalizationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasRequestModel**](SchemasRequestModel.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**SchemasResponseModel**](SchemasResponseModel.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

