# DnssecApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dnssecDeleteDnssecRecords**](DnssecApi.md#dnssecDeleteDnssecRecords) | **DELETE** /zones/{zone_identifier}/dnssec | Delete DNSSEC records
[**dnssecDnssecDetails**](DnssecApi.md#dnssecDnssecDetails) | **GET** /zones/{zone_identifier}/dnssec | DNSSEC Details
[**dnssecEditDnssecStatus**](DnssecApi.md#dnssecEditDnssecStatus) | **PATCH** /zones/{zone_identifier}/dnssec | Edit DNSSEC Status

<a name="dnssecDeleteDnssecRecords"></a>
# **dnssecDeleteDnssecRecords**
> DeleteDnssecResponseSingle dnssecDeleteDnssecRecords(zoneIdentifier)

Delete DNSSEC records

Delete DNSSEC.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnssecApi;

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


DnssecApi apiInstance = new DnssecApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DeleteDnssecResponseSingle result = apiInstance.dnssecDeleteDnssecRecords(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnssecApi#dnssecDeleteDnssecRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DeleteDnssecResponseSingle**](DeleteDnssecResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dnssecDnssecDetails"></a>
# **dnssecDnssecDetails**
> DnssecResponseSingle dnssecDnssecDetails(zoneIdentifier)

DNSSEC Details

Details about DNSSEC status and configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnssecApi;

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


DnssecApi apiInstance = new DnssecApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnssecResponseSingle result = apiInstance.dnssecDnssecDetails(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnssecApi#dnssecDnssecDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnssecResponseSingle**](DnssecResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dnssecEditDnssecStatus"></a>
# **dnssecEditDnssecStatus**
> DnssecResponseSingle dnssecEditDnssecStatus(body, zoneIdentifier)

Edit DNSSEC Status

Enable or disable DNSSEC.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DnssecApi;

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


DnssecApi apiInstance = new DnssecApi();
ZoneIdentifierDnssecBody body = new ZoneIdentifierDnssecBody(); // ZoneIdentifierDnssecBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnssecResponseSingle result = apiInstance.dnssecEditDnssecStatus(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DnssecApi#dnssecEditDnssecStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdentifierDnssecBody**](ZoneIdentifierDnssecBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnssecResponseSingle**](DnssecResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

