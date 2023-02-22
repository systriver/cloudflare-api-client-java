# SecondaryDnsPrimaryZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration) | **POST** /zones/{identifier}/secondary_dns/outgoing | Create Primary Zone Configuration
[**secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration) | **DELETE** /zones/{identifier}/secondary_dns/outgoing | Delete Primary Zone Configuration
[**secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers) | **POST** /zones/{identifier}/secondary_dns/outgoing/disable | Disable Outgoing Zone Transfers
[**secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers) | **POST** /zones/{identifier}/secondary_dns/outgoing/enable | Enable Outgoing Zone Transfers
[**secondaryDnsPrimaryZoneForceDnsNotify**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneForceDnsNotify) | **POST** /zones/{identifier}/secondary_dns/outgoing/force_notify | Force DNS NOTIFY
[**secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus) | **GET** /zones/{identifier}/secondary_dns/outgoing/status | Get Outgoing Zone Transfer Status
[**secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails) | **GET** /zones/{identifier}/secondary_dns/outgoing | Primary Zone Configuration Details
[**secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration**](SecondaryDnsPrimaryZoneApi.md#secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration) | **PUT** /zones/{identifier}/secondary_dns/outgoing | Update Primary Zone Configuration

<a name="secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration"></a>
# **secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration**
> CloudflareClientAPISingleResponseOutgoing secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration(body, identifier)

Create Primary Zone Configuration

Create primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
CloudflareClientAPISingleRequestOutgoing body = new CloudflareClientAPISingleRequestOutgoing(); // CloudflareClientAPISingleRequestOutgoing | 
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISingleResponseOutgoing result = apiInstance.secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneCreatePrimaryZoneConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPISingleRequestOutgoing**](CloudflareClientAPISingleRequestOutgoing.md)|  |
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISingleResponseOutgoing**](CloudflareClientAPISingleResponseOutgoing.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration"></a>
# **secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration**
> CloudflareClientAPISchemasIdResponse secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration(identifier)

Delete Primary Zone Configuration

Delete primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISchemasIdResponse result = apiInstance.secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneDeletePrimaryZoneConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISchemasIdResponse**](CloudflareClientAPISchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers"></a>
# **secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers**
> DisableTransferResponse secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers(identifier)

Disable Outgoing Zone Transfers

Disable outgoing zone transfers for primary zone and clears IXFR backlog of primary zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    DisableTransferResponse result = apiInstance.secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneDisableOutgoingZoneTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DisableTransferResponse**](DisableTransferResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers"></a>
# **secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers**
> EnableTransferResponse secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers(identifier)

Enable Outgoing Zone Transfers

Enable outgoing zone transfers for primary zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    EnableTransferResponse result = apiInstance.secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneEnableOutgoingZoneTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**EnableTransferResponse**](EnableTransferResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsPrimaryZoneForceDnsNotify"></a>
# **secondaryDnsPrimaryZoneForceDnsNotify**
> SchemasForceResponse secondaryDnsPrimaryZoneForceDnsNotify(identifier)

Force DNS NOTIFY

Notifies the secondary nameserver(s) and clears IXFR backlog of primary zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    SchemasForceResponse result = apiInstance.secondaryDnsPrimaryZoneForceDnsNotify(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneForceDnsNotify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SchemasForceResponse**](SchemasForceResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus"></a>
# **secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus**
> EnableTransferResponse secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus(identifier)

Get Outgoing Zone Transfer Status

Get primary zone transfer status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    EnableTransferResponse result = apiInstance.secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneGetOutgoingZoneTransferStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**EnableTransferResponse**](EnableTransferResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails"></a>
# **secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails**
> CloudflareClientAPISingleResponseOutgoing secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails(identifier)

Primary Zone Configuration Details

Get primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISingleResponseOutgoing result = apiInstance.secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZonePrimaryZoneConfigurationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISingleResponseOutgoing**](CloudflareClientAPISingleResponseOutgoing.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration"></a>
# **secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration**
> CloudflareClientAPISingleResponseOutgoing secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration(body, identifier)

Update Primary Zone Configuration

Update primary zone configuration for outgoing zone transfers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SecondaryDnsPrimaryZoneApi;

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


SecondaryDnsPrimaryZoneApi apiInstance = new SecondaryDnsPrimaryZoneApi();
CloudflareClientAPISingleRequestOutgoing body = new CloudflareClientAPISingleRequestOutgoing(); // CloudflareClientAPISingleRequestOutgoing | 
DnsSecondaryPrimaryZoneComponentsSchemasIdentifier identifier = new DnsSecondaryPrimaryZoneComponentsSchemasIdentifier(); // DnsSecondaryPrimaryZoneComponentsSchemasIdentifier | 
try {
    CloudflareClientAPISingleResponseOutgoing result = apiInstance.secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecondaryDnsPrimaryZoneApi#secondaryDnsPrimaryZoneUpdatePrimaryZoneConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CloudflareClientAPISingleRequestOutgoing**](CloudflareClientAPISingleRequestOutgoing.md)|  |
 **identifier** | [**DnsSecondaryPrimaryZoneComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPISingleResponseOutgoing**](CloudflareClientAPISingleResponseOutgoing.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

