# DlpPayloadLogSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dlpPayloadLogSettingsGetSettings**](DlpPayloadLogSettingsApi.md#dlpPayloadLogSettingsGetSettings) | **GET** /accounts/{account_identifier}/dlp/payload_log | Get settings
[**dlpPayloadLogSettingsUpdateSettings**](DlpPayloadLogSettingsApi.md#dlpPayloadLogSettingsUpdateSettings) | **PUT** /accounts/{account_identifier}/dlp/payload_log | Update settings

<a name="dlpPayloadLogSettingsGetSettings"></a>
# **dlpPayloadLogSettingsGetSettings**
> GetSettingsResponse dlpPayloadLogSettingsGetSettings(accountIdentifier)

Get settings

Gets the current DLP payload log settings for this account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpPayloadLogSettingsApi;

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


DlpPayloadLogSettingsApi apiInstance = new DlpPayloadLogSettingsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    GetSettingsResponse result = apiInstance.dlpPayloadLogSettingsGetSettings(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpPayloadLogSettingsApi#dlpPayloadLogSettingsGetSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**GetSettingsResponse**](GetSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dlpPayloadLogSettingsUpdateSettings"></a>
# **dlpPayloadLogSettingsUpdateSettings**
> UpdateSettingsResponse dlpPayloadLogSettingsUpdateSettings(body, accountIdentifier)

Update settings

Updates the DLP payload log settings for this account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpPayloadLogSettingsApi;

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


DlpPayloadLogSettingsApi apiInstance = new DlpPayloadLogSettingsApi();
UpdateSettings body = new UpdateSettings(); // UpdateSettings | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    UpdateSettingsResponse result = apiInstance.dlpPayloadLogSettingsUpdateSettings(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpPayloadLogSettingsApi#dlpPayloadLogSettingsUpdateSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateSettings**](UpdateSettings.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**UpdateSettingsResponse**](UpdateSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

