# ZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneCreateZone**](ZoneApi.md#zoneCreateZone) | **POST** /zones | Create Zone
[**zoneDeleteZone**](ZoneApi.md#zoneDeleteZone) | **DELETE** /zones/{identifier} | Delete Zone
[**zoneEditZone**](ZoneApi.md#zoneEditZone) | **PATCH** /zones/{identifier} | Edit Zone
[**zoneListZones**](ZoneApi.md#zoneListZones) | **GET** /zones | List Zones
[**zonePurgeFilesByCacheTagsHostOrPrefix**](ZoneApi.md#zonePurgeFilesByCacheTagsHostOrPrefix) | **POST** /zones/{identifier}/purge_cache | Purge Files by Cache-Tags, Host, or Prefix
[**zoneZoneActivationCheck**](ZoneApi.md#zoneZoneActivationCheck) | **PUT** /zones/{identifier}/activation_check | Zone Activation Check
[**zoneZoneDetails**](ZoneApi.md#zoneZoneDetails) | **GET** /zones/{identifier} | Zone Details

<a name="zoneCreateZone"></a>
# **zoneCreateZone**
> ComponentsSchemasResponseSingle zoneCreateZone(body)

Create Zone

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneApi;

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


ZoneApi apiInstance = new ZoneApi();
SchemasCreate body = new SchemasCreate(); // SchemasCreate | 
try {
    ComponentsSchemasResponseSingle result = apiInstance.zoneCreateZone(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zoneCreateZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasCreate**](SchemasCreate.md)|  |

### Return type

[**ComponentsSchemasResponseSingle**](ComponentsSchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneDeleteZone"></a>
# **zoneDeleteZone**
> CloudflareClientAPIApiResponseSingleId zoneDeleteZone(identifier)

Delete Zone

Deletes an existing zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneApi;

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


ZoneApi apiInstance = new ZoneApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.zoneDeleteZone(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zoneDeleteZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneEditZone"></a>
# **zoneEditZone**
> ComponentsSchemasResponseSingle zoneEditZone(body, identifier)

Edit Zone

Editz a zone. Only one zone property can be changed at a time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneApi;

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


ZoneApi apiInstance = new ZoneApi();
ZoneComponentsSchemasPatch body = new ZoneComponentsSchemasPatch(); // ZoneComponentsSchemasPatch | 
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    ComponentsSchemasResponseSingle result = apiInstance.zoneEditZone(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zoneEditZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneComponentsSchemasPatch**](ZoneComponentsSchemasPatch.md)|  |
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**ComponentsSchemasResponseSingle**](ComponentsSchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneListZones"></a>
# **zoneListZones**
> CloudflareClientAPIComponentsSchemasResponseCollection zoneListZones()

List Zones

Lists, searches, sorts, and filters your zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneApi;

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


ZoneApi apiInstance = new ZoneApi();
try {
    CloudflareClientAPIComponentsSchemasResponseCollection result = apiInstance.zoneListZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zoneListZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CloudflareClientAPIComponentsSchemasResponseCollection**](CloudflareClientAPIComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zonePurgeFilesByCacheTagsHostOrPrefix"></a>
# **zonePurgeFilesByCacheTagsHostOrPrefix**
> CloudflareClientAPIApiResponseSingleId zonePurgeFilesByCacheTagsHostOrPrefix(body, identifier)

Purge Files by Cache-Tags, Host, or Prefix

Granularly removes one or more files from Cloudflare&#x27;s cache either by specifying the host, the associated Cache-Tag, or a Prefix.  **NB:** Cache-Tag, host, and prefix purging each have a rate limit of 30,000 purge API calls in every 24 hour period. You may purge up to 30 tags, hosts, or prefixes in one API call. This rate limit can be raised for customers who need to purge at higher volume.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneApi;

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


ZoneApi apiInstance = new ZoneApi();
PurgeByCacheTagsOrHostsOrPrefixes body = new PurgeByCacheTagsOrHostsOrPrefixes(); // PurgeByCacheTagsOrHostsOrPrefixes | 
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.zonePurgeFilesByCacheTagsHostOrPrefix(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zonePurgeFilesByCacheTagsHostOrPrefix");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PurgeByCacheTagsOrHostsOrPrefixes**](PurgeByCacheTagsOrHostsOrPrefixes.md)|  |
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneZoneActivationCheck"></a>
# **zoneZoneActivationCheck**
> CloudflareClientAPIApiResponseSingleId zoneZoneActivationCheck(identifier)

Zone Activation Check

Initiates another zone activation check.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneApi;

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


ZoneApi apiInstance = new ZoneApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    CloudflareClientAPIApiResponseSingleId result = apiInstance.zoneZoneActivationCheck(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zoneZoneActivationCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIApiResponseSingleId**](CloudflareClientAPIApiResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneZoneDetails"></a>
# **zoneZoneDetails**
> ComponentsSchemasResponseSingle zoneZoneDetails(identifier)

Zone Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneApi;

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


ZoneApi apiInstance = new ZoneApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    ComponentsSchemasResponseSingle result = apiInstance.zoneZoneDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneApi#zoneZoneDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**ComponentsSchemasResponseSingle**](ComponentsSchemasResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

