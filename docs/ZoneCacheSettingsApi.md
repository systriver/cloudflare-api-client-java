# ZoneCacheSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneCacheSettingsChangeCacheReserveSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsChangeCacheReserveSetting) | **PATCH** /zones/{zone_identifier}/cache/cache_reserve | Change Cache Reserve setting
[**zoneCacheSettingsChangeVariantsSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsChangeVariantsSetting) | **PATCH** /zones/{zone_identifier}/cache/variants | Change variants setting
[**zoneCacheSettingsDeleteVariantsSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsDeleteVariantsSetting) | **DELETE** /zones/{zone_identifier}/cache/variants | Delete variants setting
[**zoneCacheSettingsGetCacheReserveSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsGetCacheReserveSetting) | **GET** /zones/{zone_identifier}/cache/cache_reserve | Get Cache Reserve setting
[**zoneCacheSettingsGetVariantsSetting**](ZoneCacheSettingsApi.md#zoneCacheSettingsGetVariantsSetting) | **GET** /zones/{zone_identifier}/cache/variants | Get variants setting

<a name="zoneCacheSettingsChangeCacheReserveSetting"></a>
# **zoneCacheSettingsChangeCacheReserveSetting**
> InlineResponse200109 zoneCacheSettingsChangeCacheReserveSetting(body, zoneIdentifier)

Change Cache Reserve setting

Increase cache lifetimes by automatically storing all cacheable files into Cloudflare&#x27;s persistent object storage buckets. Requires Cache Reserve subscription. Note: using Tiered Cache with Cache Reserve is highly recommended to reduce Reserve operations costs. See the [developer docs](https://developers.cloudflare.com/cache/about/cache-reserve) for more information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneCacheSettingsApi;

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


ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi();
CacheCacheReserveBody body = new CacheCacheReserveBody(); // CacheCacheReserveBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200109 result = apiInstance.zoneCacheSettingsChangeCacheReserveSetting(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsChangeCacheReserveSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CacheCacheReserveBody**](CacheCacheReserveBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200109**](InlineResponse200109.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneCacheSettingsChangeVariantsSetting"></a>
# **zoneCacheSettingsChangeVariantsSetting**
> InlineResponse200110 zoneCacheSettingsChangeVariantsSetting(body, zoneIdentifier)

Change variants setting

Variant support enables caching variants of images with certain file extensions in addition to the original. This only applies when the origin server sends the &#x27;Vary: Accept&#x27; response header. If the origin server sends &#x27;Vary: Accept&#x27; but does not serve the variant requested, the response will not be cached. This will be indicated with BYPASS cache status in the response headers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneCacheSettingsApi;

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


ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi();
CacheVariantsBody body = new CacheVariantsBody(); // CacheVariantsBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200110 result = apiInstance.zoneCacheSettingsChangeVariantsSetting(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsChangeVariantsSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CacheVariantsBody**](CacheVariantsBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200110**](InlineResponse200110.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneCacheSettingsDeleteVariantsSetting"></a>
# **zoneCacheSettingsDeleteVariantsSetting**
> InlineResponse200111 zoneCacheSettingsDeleteVariantsSetting(zoneIdentifier)

Delete variants setting

Variant support enables caching variants of images with certain file extensions in addition to the original. This only applies when the origin server sends the &#x27;Vary: Accept&#x27; response header. If the origin server sends &#x27;Vary: Accept&#x27; but does not serve the variant requested, the response will not be cached. This will be indicated with BYPASS cache status in the response headers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneCacheSettingsApi;

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


ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200111 result = apiInstance.zoneCacheSettingsDeleteVariantsSetting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsDeleteVariantsSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200111**](InlineResponse200111.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneCacheSettingsGetCacheReserveSetting"></a>
# **zoneCacheSettingsGetCacheReserveSetting**
> InlineResponse200109 zoneCacheSettingsGetCacheReserveSetting(zoneIdentifier)

Get Cache Reserve setting

Increase cache lifetimes by automatically storing all cacheable files into Cloudflare&#x27;s persistent object storage buckets. Requires Cache Reserve subscription. Note: using Tiered Cache with Cache Reserve is highly recommended to reduce Reserve operations costs. See the [developer docs](https://developers.cloudflare.com/cache/about/cache-reserve) for more information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneCacheSettingsApi;

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


ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200109 result = apiInstance.zoneCacheSettingsGetCacheReserveSetting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsGetCacheReserveSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200109**](InlineResponse200109.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneCacheSettingsGetVariantsSetting"></a>
# **zoneCacheSettingsGetVariantsSetting**
> InlineResponse200110 zoneCacheSettingsGetVariantsSetting(zoneIdentifier)

Get variants setting

Variant support enables caching variants of images with certain file extensions in addition to the original. This only applies when the origin server sends the &#x27;Vary: Accept&#x27; response header. If the origin server sends &#x27;Vary: Accept&#x27; but does not serve the variant requested, the response will not be cached. This will be indicated with BYPASS cache status in the response headers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneCacheSettingsApi;

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


ZoneCacheSettingsApi apiInstance = new ZoneCacheSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200110 result = apiInstance.zoneCacheSettingsGetVariantsSetting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneCacheSettingsApi#zoneCacheSettingsGetVariantsSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200110**](InlineResponse200110.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

