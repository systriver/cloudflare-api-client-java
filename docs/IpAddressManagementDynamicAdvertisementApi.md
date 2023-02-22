# IpAddressManagementDynamicAdvertisementApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipAddressManagementDynamicAdvertisementGetAdvertisementStatus**](IpAddressManagementDynamicAdvertisementApi.md#ipAddressManagementDynamicAdvertisementGetAdvertisementStatus) | **GET** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier}/bgp/status | Get Advertisement Status
[**ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus**](IpAddressManagementDynamicAdvertisementApi.md#ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus) | **PATCH** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier}/bgp/status | Update Prefix Dynamic Advertisement Status

<a name="ipAddressManagementDynamicAdvertisementGetAdvertisementStatus"></a>
# **ipAddressManagementDynamicAdvertisementGetAdvertisementStatus**
> AdvertisedResponse ipAddressManagementDynamicAdvertisementGetAdvertisementStatus(prefixIdentifier, accountIdentifier)

Get Advertisement Status

List the current advertisement state for a prefix.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementDynamicAdvertisementApi;

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


IpAddressManagementDynamicAdvertisementApi apiInstance = new IpAddressManagementDynamicAdvertisementApi();
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AdvertisedResponse result = apiInstance.ipAddressManagementDynamicAdvertisementGetAdvertisementStatus(prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementDynamicAdvertisementApi#ipAddressManagementDynamicAdvertisementGetAdvertisementStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AdvertisedResponse**](AdvertisedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus"></a>
# **ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus**
> AdvertisedResponse ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(body, prefixIdentifier, accountIdentifier)

Update Prefix Dynamic Advertisement Status

Advertise or withdraw BGP route for a prefix.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementDynamicAdvertisementApi;

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


IpAddressManagementDynamicAdvertisementApi apiInstance = new IpAddressManagementDynamicAdvertisementApi();
BgpStatusBody body = new BgpStatusBody(); // BgpStatusBody | 
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AdvertisedResponse result = apiInstance.ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus(body, prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementDynamicAdvertisementApi#ipAddressManagementDynamicAdvertisementUpdatePrefixDynamicAdvertisementStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BgpStatusBody**](BgpStatusBody.md)|  |
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AdvertisedResponse**](AdvertisedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

