# DnsAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnsAnalyticsByTime**](DnsAnalyticsApi.md#dnsAnalyticsByTime) | **GET** /zones/{identifier}/dns_analytics/report/bytime | By Time
[**dnsAnalyticsTable**](DnsAnalyticsApi.md#dnsAnalyticsTable) | **GET** /zones/{identifier}/dns_analytics/report | Table

<a name="dnsAnalyticsByTime"></a>
# **dnsAnalyticsByTime**
> InlineResponse2001 dnsAnalyticsByTime(identifier)

By Time

Retrieves a list of aggregate metrics grouped by time interval.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsAnalyticsApi;

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


DnsAnalyticsApi apiInstance = new DnsAnalyticsApi();
String identifier = "identifier_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.dnsAnalyticsByTime(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsAnalyticsApi#dnsAnalyticsByTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsAnalyticsTable"></a>
# **dnsAnalyticsTable**
> InlineResponse2001 dnsAnalyticsTable(identifier)

Table

Retrieves a list of summarised aggregate metrics over a given time period.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsAnalyticsApi;

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


DnsAnalyticsApi apiInstance = new DnsAnalyticsApi();
String identifier = "identifier_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.dnsAnalyticsTable(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsAnalyticsApi#dnsAnalyticsTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

