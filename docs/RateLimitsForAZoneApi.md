# RateLimitsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rateLimitsForAZoneCreateARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneCreateARateLimit) | **POST** /zones/{zone_identifier}/rate_limits | Create a rate limit
[**rateLimitsForAZoneDeleteARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneDeleteARateLimit) | **DELETE** /zones/{zone_identifier}/rate_limits/{id} | Delete a rate limit
[**rateLimitsForAZoneGetARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneGetARateLimit) | **GET** /zones/{zone_identifier}/rate_limits/{id} | Get a rate limit
[**rateLimitsForAZoneListRateLimits**](RateLimitsForAZoneApi.md#rateLimitsForAZoneListRateLimits) | **GET** /zones/{zone_identifier}/rate_limits | List rate limits
[**rateLimitsForAZoneUpdateARateLimit**](RateLimitsForAZoneApi.md#rateLimitsForAZoneUpdateARateLimit) | **PUT** /zones/{zone_identifier}/rate_limits/{id} | Update a rate limit

<a name="rateLimitsForAZoneCreateARateLimit"></a>
# **rateLimitsForAZoneCreateARateLimit**
> RatelimitResponseSingle rateLimitsForAZoneCreateARateLimit(body, zoneIdentifier)

Create a rate limit

Creates a new rate limit for a zone. Refer to the object definition for a list of required attributes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RateLimitsForAZoneApi;

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


RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RatelimitResponseSingle result = apiInstance.rateLimitsForAZoneCreateARateLimit(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneCreateARateLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RatelimitResponseSingle**](RatelimitResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rateLimitsForAZoneDeleteARateLimit"></a>
# **rateLimitsForAZoneDeleteARateLimit**
> InlineResponse200118 rateLimitsForAZoneDeleteARateLimit(id, zoneIdentifier)

Delete a rate limit

Deletes an existing rate limit.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RateLimitsForAZoneApi;

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


RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200118 result = apiInstance.rateLimitsForAZoneDeleteARateLimit(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneDeleteARateLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200118**](InlineResponse200118.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rateLimitsForAZoneGetARateLimit"></a>
# **rateLimitsForAZoneGetARateLimit**
> RatelimitResponseSingle rateLimitsForAZoneGetARateLimit(id, zoneIdentifier)

Get a rate limit

Fetches the details of a rate limit.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RateLimitsForAZoneApi;

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


RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RatelimitResponseSingle result = apiInstance.rateLimitsForAZoneGetARateLimit(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneGetARateLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RatelimitResponseSingle**](RatelimitResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rateLimitsForAZoneListRateLimits"></a>
# **rateLimitsForAZoneListRateLimits**
> RatelimitResponseCollection rateLimitsForAZoneListRateLimits(zoneIdentifier)

List rate limits

Fetches the rate limits for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RateLimitsForAZoneApi;

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


RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RatelimitResponseCollection result = apiInstance.rateLimitsForAZoneListRateLimits(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneListRateLimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RatelimitResponseCollection**](RatelimitResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rateLimitsForAZoneUpdateARateLimit"></a>
# **rateLimitsForAZoneUpdateARateLimit**
> RatelimitResponseSingle rateLimitsForAZoneUpdateARateLimit(body, id, zoneIdentifier)

Update a rate limit

Updates an existing rate limit.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RateLimitsForAZoneApi;

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


RateLimitsForAZoneApi apiInstance = new RateLimitsForAZoneApi();
Object body = null; // Object | 
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    RatelimitResponseSingle result = apiInstance.rateLimitsForAZoneUpdateARateLimit(body, id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RateLimitsForAZoneApi#rateLimitsForAZoneUpdateARateLimit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**RatelimitResponseSingle**](RatelimitResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

