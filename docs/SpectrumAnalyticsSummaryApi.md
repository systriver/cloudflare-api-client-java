# SpectrumAnalyticsSummaryApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**spectrumAnalyticsSummaryGetAnalyticsSummary**](SpectrumAnalyticsSummaryApi.md#spectrumAnalyticsSummaryGetAnalyticsSummary) | **GET** /zones/{zone}/spectrum/analytics/events/summary | Get analytics summary

<a name="spectrumAnalyticsSummaryGetAnalyticsSummary"></a>
# **spectrumAnalyticsSummaryGetAnalyticsSummary**
> ApiResponseSingle spectrumAnalyticsSummaryGetAnalyticsSummary(zone)

Get analytics summary

Retrieves a list of summarised aggregate metrics over a given time period.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SpectrumAnalyticsSummaryApi;

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


SpectrumAnalyticsSummaryApi apiInstance = new SpectrumAnalyticsSummaryApi();
String zone = "zone_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.spectrumAnalyticsSummaryGetAnalyticsSummary(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpectrumAnalyticsSummaryApi#spectrumAnalyticsSummaryGetAnalyticsSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

