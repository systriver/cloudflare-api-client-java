# DnsFirewallAnalyticsLegacyApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnsFirewallAnalyticsLegacyByTime**](DnsFirewallAnalyticsLegacyApi.md#dnsFirewallAnalyticsLegacyByTime) | **GET** /accounts/{account_identifier}/virtual_dns/{identifier}/dns_analytics/report/bytime | By Time
[**dnsFirewallAnalyticsLegacyTable**](DnsFirewallAnalyticsLegacyApi.md#dnsFirewallAnalyticsLegacyTable) | **GET** /accounts/{account_identifier}/virtual_dns/{identifier}/dns_analytics/report | Table

<a name="dnsFirewallAnalyticsLegacyByTime"></a>
# **dnsFirewallAnalyticsLegacyByTime**
> InlineResponse2001 dnsFirewallAnalyticsLegacyByTime(identifier, accountIdentifier)

By Time

Retrieves a list of aggregate metrics grouped by time interval.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallAnalyticsLegacyApi;

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


DnsFirewallAnalyticsLegacyApi apiInstance = new DnsFirewallAnalyticsLegacyApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.dnsFirewallAnalyticsLegacyByTime(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallAnalyticsLegacyApi#dnsFirewallAnalyticsLegacyByTime");
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

<a name="dnsFirewallAnalyticsLegacyTable"></a>
# **dnsFirewallAnalyticsLegacyTable**
> InlineResponse2001 dnsFirewallAnalyticsLegacyTable(identifier, accountIdentifier)

Table

Retrieves a list of summarised aggregate metrics over a given time period.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnsFirewallAnalyticsLegacyApi;

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


DnsFirewallAnalyticsLegacyApi apiInstance = new DnsFirewallAnalyticsLegacyApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.dnsFirewallAnalyticsLegacyTable(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnsFirewallAnalyticsLegacyApi#dnsFirewallAnalyticsLegacyTable");
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

