# ZoneAnalyticsDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneAnalyticsDeprecatedGetAnalyticsByCoLocations**](ZoneAnalyticsDeprecatedApi.md#zoneAnalyticsDeprecatedGetAnalyticsByCoLocations) | **GET** /zones/{zone_identifier}/analytics/colos | Get analytics by Co-locations
[**zoneAnalyticsDeprecatedGetDashboard**](ZoneAnalyticsDeprecatedApi.md#zoneAnalyticsDeprecatedGetDashboard) | **GET** /zones/{zone_identifier}/analytics/dashboard | Get dashboard

<a name="zoneAnalyticsDeprecatedGetAnalyticsByCoLocations"></a>
# **zoneAnalyticsDeprecatedGetAnalyticsByCoLocations**
> ColoResponse zoneAnalyticsDeprecatedGetAnalyticsByCoLocations(zoneIdentifier)

Get analytics by Co-locations

This view provides a breakdown of analytics data by datacenter. Note: This is available to Enterprise customers only.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneAnalyticsDeprecatedApi;

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


ZoneAnalyticsDeprecatedApi apiInstance = new ZoneAnalyticsDeprecatedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ColoResponse result = apiInstance.zoneAnalyticsDeprecatedGetAnalyticsByCoLocations(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneAnalyticsDeprecatedApi#zoneAnalyticsDeprecatedGetAnalyticsByCoLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ColoResponse**](ColoResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneAnalyticsDeprecatedGetDashboard"></a>
# **zoneAnalyticsDeprecatedGetDashboard**
> DashboardResponse zoneAnalyticsDeprecatedGetDashboard(zoneIdentifier)

Get dashboard

The dashboard view provides both totals and timeseries data for the given zone and time period across the entire Cloudflare network.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneAnalyticsDeprecatedApi;

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


ZoneAnalyticsDeprecatedApi apiInstance = new ZoneAnalyticsDeprecatedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DashboardResponse result = apiInstance.zoneAnalyticsDeprecatedGetDashboard(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneAnalyticsDeprecatedApi#zoneAnalyticsDeprecatedGetDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DashboardResponse**](DashboardResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

