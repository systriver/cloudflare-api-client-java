# SecondaryDnsSecondaryZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration) | **POST** /zones/{identifier}/secondary_dns/incoming | Create Secondary Zone Configuration
[**secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration) | **DELETE** /zones/{identifier}/secondary_dns/incoming | Delete Secondary Zone Configuration
[**secondaryDnsSecondaryZoneForceAxfr**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneForceAxfr) | **POST** /zones/{identifier}/secondary_dns/force_axfr | Force AXFR
[**secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails) | **GET** /zones/{identifier}/secondary_dns/incoming | Secondary Zone Configuration Details
[**secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration**](SecondaryDnsSecondaryZoneApi.md#secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration) | **PUT** /zones/{identifier}/secondary_dns/incoming | Update Secondary Zone Configuration

<a name="secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration"></a>
# **secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration**
> CloudflareClientAPISingleResponseIncoming secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(body, identifier)

Create Secondary Zone Configuration

Create secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsSecondaryZoneApi;

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


SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi();
CloudflareClientAPIDnsSecondarySecondaryZone body = new CloudflareClientAPIDnsSecondarySecondaryZone(); // CloudflareClientAPIDnsSecondarySecondaryZone | 
DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier = new DnsSecondarySecondaryZoneComponentsSchemasIdentifier(); // DnsSecondarySecondaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISingleResponseIncoming result = apiInstance.secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneCreateSecondaryZoneConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIDnsSecondarySecondaryZone**](CloudflareClientAPIDnsSecondarySecondaryZone.md)|  |
 **identifier** | [**DnsSecondarySecondaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISingleResponseIncoming**](CloudflareClientAPISingleResponseIncoming.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration"></a>
# **secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration**
> CloudflareClientAPIIdResponse secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(identifier)

Delete Secondary Zone Configuration

Delete secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsSecondaryZoneApi;

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


SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi();
DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier = new DnsSecondarySecondaryZoneComponentsSchemasIdentifier(); // DnsSecondarySecondaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIIdResponse result = apiInstance.secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneDeleteSecondaryZoneConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondarySecondaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIIdResponse**](CloudflareClientAPIIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsSecondaryZoneForceAxfr"></a>
# **secondaryDnsSecondaryZoneForceAxfr**
> ForceResponse secondaryDnsSecondaryZoneForceAxfr(identifier)

Force AXFR

Sends AXFR zone transfer request to primary nameserver(s).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsSecondaryZoneApi;

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


SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi();
DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier = new DnsSecondarySecondaryZoneComponentsSchemasIdentifier(); // DnsSecondarySecondaryZoneComponentsSchemasIdentifier | 
try {
    ForceResponse result = apiInstance.secondaryDnsSecondaryZoneForceAxfr(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneForceAxfr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondarySecondaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ForceResponse**](ForceResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails"></a>
# **secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails**
> CloudflareClientAPISingleResponseIncoming secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(identifier)

Secondary Zone Configuration Details

Get secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsSecondaryZoneApi;

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


SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi();
DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier = new DnsSecondarySecondaryZoneComponentsSchemasIdentifier(); // DnsSecondarySecondaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISingleResponseIncoming result = apiInstance.secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneSecondaryZoneConfigurationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondarySecondaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISingleResponseIncoming**](CloudflareClientAPISingleResponseIncoming.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration"></a>
# **secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration**
> CloudflareClientAPISingleResponseIncoming secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(body, identifier)

Update Secondary Zone Configuration

Update secondary zone configuration for incoming zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsSecondaryZoneApi;

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


SecondaryDnsSecondaryZoneApi apiInstance = new SecondaryDnsSecondaryZoneApi();
CloudflareClientAPIDnsSecondarySecondaryZone body = new CloudflareClientAPIDnsSecondarySecondaryZone(); // CloudflareClientAPIDnsSecondarySecondaryZone | 
DnsSecondarySecondaryZoneComponentsSchemasIdentifier identifier = new DnsSecondarySecondaryZoneComponentsSchemasIdentifier(); // DnsSecondarySecondaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISingleResponseIncoming result = apiInstance.secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsSecondaryZoneApi#secondaryDnsSecondaryZoneUpdateSecondaryZoneConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPIDnsSecondarySecondaryZone**](CloudflareClientAPIDnsSecondarySecondaryZone.md)|  |
 **identifier** | [**DnsSecondarySecondaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISingleResponseIncoming**](CloudflareClientAPISingleResponseIncoming.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

