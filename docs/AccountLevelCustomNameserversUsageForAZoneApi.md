# AccountLevelCustomNameserversUsageForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata**](AccountLevelCustomNameserversUsageForAZoneApi.md#accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata) | **GET** /zones/{zone_identifier}/custom_ns | Get Account Custom Nameserver Related Zone Metadata
[**accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata**](AccountLevelCustomNameserversUsageForAZoneApi.md#accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata) | **PUT** /zones/{zone_identifier}/custom_ns | Set Account Custom Nameserver Related Zone Metadata

<a name="accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata"></a>
# **accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata**
> GetResponse accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata(zoneIdentifier)

Get Account Custom Nameserver Related Zone Metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLevelCustomNameserversUsageForAZoneApi;

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


AccountLevelCustomNameserversUsageForAZoneApi apiInstance = new AccountLevelCustomNameserversUsageForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    GetResponse result = apiInstance.accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLevelCustomNameserversUsageForAZoneApi#accountLevelCustomNameserversUsageForAZoneGetAccountCustomNameserverRelatedZoneMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**GetResponse**](GetResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata"></a>
# **accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata**
> CloudflareClientAPIEmptyResponse accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata(body, zoneIdentifier)

Set Account Custom Nameserver Related Zone Metadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLevelCustomNameserversUsageForAZoneApi;

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


AccountLevelCustomNameserversUsageForAZoneApi apiInstance = new AccountLevelCustomNameserversUsageForAZoneApi();
ZoneMetadata body = new ZoneMetadata(); // ZoneMetadata | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CloudflareClientAPIEmptyResponse result = apiInstance.accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLevelCustomNameserversUsageForAZoneApi#accountLevelCustomNameserversUsageForAZoneSetAccountCustomNameserverRelatedZoneMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneMetadata**](ZoneMetadata.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIEmptyResponse**](CloudflareClientAPIEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

