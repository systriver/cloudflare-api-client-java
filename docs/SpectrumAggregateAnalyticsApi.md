# SpectrumAggregateAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics**](SpectrumAggregateAnalyticsApi.md#spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics) | **GET** /zones/{zone}/spectrum/analytics/aggregate/current | Get current aggregated analytics

<a name="spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics"></a>
# **spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics**
> AnalyticsAggregateComponentsSchemasResponseCollection spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics(zone)

Get current aggregated analytics

Retrieves analytics aggregated from the last minute of usage on Spectrum applications underneath a given zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpectrumAggregateAnalyticsApi;

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


SpectrumAggregateAnalyticsApi apiInstance = new SpectrumAggregateAnalyticsApi();
String zone = "zone_example"; // String | 
try {
    AnalyticsAggregateComponentsSchemasResponseCollection result = apiInstance.spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpectrumAggregateAnalyticsApi#spectrumAggregateAnalyticsGetCurrentAggregatedAnalytics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | [**String**](.md)|  |

### Return type

[**AnalyticsAggregateComponentsSchemasResponseCollection**](AnalyticsAggregateComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

