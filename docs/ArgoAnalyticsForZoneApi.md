# ArgoAnalyticsForZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**argoAnalyticsForZoneArgoAnalyticsForAZone**](ArgoAnalyticsForZoneApi.md#argoAnalyticsForZoneArgoAnalyticsForAZone) | **GET** /zones/{zone_identifier}/analytics/latency | Argo Analytics for a zone

<a name="argoAnalyticsForZoneArgoAnalyticsForAZone"></a>
# **argoAnalyticsForZoneArgoAnalyticsForAZone**
> SchemasResponseSingle argoAnalyticsForZoneArgoAnalyticsForAZone(zoneIdentifier)

Argo Analytics for a zone

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArgoAnalyticsForZoneApi;

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


ArgoAnalyticsForZoneApi apiInstance = new ArgoAnalyticsForZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SchemasResponseSingle result = apiInstance.argoAnalyticsForZoneArgoAnalyticsForAZone(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArgoAnalyticsForZoneApi#argoAnalyticsForZoneArgoAnalyticsForAZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasResponseSingle**](SchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

