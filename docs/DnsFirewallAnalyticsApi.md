# DnsFirewallAnalyticsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnsFirewallAnalyticsByTime**](DnsFirewallAnalyticsApi.md#dnsFirewallAnalyticsByTime) | **GET** /accounts/{account_identifier}/dns_firewall/{identifier}/dns_analytics/report/bytime | By Time
[**dnsFirewallAnalyticsTable**](DnsFirewallAnalyticsApi.md#dnsFirewallAnalyticsTable) | **GET** /accounts/{account_identifier}/dns_firewall/{identifier}/dns_analytics/report | Table

<a name="dnsFirewallAnalyticsByTime"></a>
# **dnsFirewallAnalyticsByTime**
> InlineResponse2001 dnsFirewallAnalyticsByTime(identifier, accountIdentifier)

By Time

Retrieves a list of aggregate metrics grouped by time interval.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallAnalyticsApi;

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


DnsFirewallAnalyticsApi apiInstance = new DnsFirewallAnalyticsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.dnsFirewallAnalyticsByTime(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallAnalyticsApi#dnsFirewallAnalyticsByTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnsFirewallAnalyticsTable"></a>
# **dnsFirewallAnalyticsTable**
> InlineResponse2001 dnsFirewallAnalyticsTable(identifier, accountIdentifier)

Table

Retrieves a list of summarised aggregate metrics over a given time period.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallAnalyticsApi;

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


DnsFirewallAnalyticsApi apiInstance = new DnsFirewallAnalyticsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.dnsFirewallAnalyticsTable(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallAnalyticsApi#dnsFirewallAnalyticsTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

