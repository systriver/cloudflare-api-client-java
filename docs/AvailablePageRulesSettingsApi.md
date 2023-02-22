# AvailablePageRulesSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**availablePageRulesSettingsListAvailablePageRulesSettings**](AvailablePageRulesSettingsApi.md#availablePageRulesSettingsListAvailablePageRulesSettings) | **GET** /zones/{zone_identifier}/pagerules/settings | List available Page Rules settings

<a name="availablePageRulesSettingsListAvailablePageRulesSettings"></a>
# **availablePageRulesSettingsListAvailablePageRulesSettings**
> PageruleSettingsResponseCollection availablePageRulesSettingsListAvailablePageRulesSettings(zoneIdentifier)

List available Page Rules settings

Returns a list of settings (and their details) that Page Rules can apply to matching requests.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvailablePageRulesSettingsApi;

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


AvailablePageRulesSettingsApi apiInstance = new AvailablePageRulesSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    PageruleSettingsResponseCollection result = apiInstance.availablePageRulesSettingsListAvailablePageRulesSettings(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvailablePageRulesSettingsApi#availablePageRulesSettingsListAvailablePageRulesSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**PageruleSettingsResponseCollection**](PageruleSettingsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

