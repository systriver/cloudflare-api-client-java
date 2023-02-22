# ZoneLockdownApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLockdownCreateAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownCreateAZoneLockdownRule) | **POST** /zones/{zone_identifier}/firewall/lockdowns | Create a Zone Lockdown rule
[**zoneLockdownDeleteAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownDeleteAZoneLockdownRule) | **DELETE** /zones/{zone_identifier}/firewall/lockdowns/{id} | Delete a Zone Lockdown rule
[**zoneLockdownGetAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownGetAZoneLockdownRule) | **GET** /zones/{zone_identifier}/firewall/lockdowns/{id} | Get a Zone Lockdown rule
[**zoneLockdownListZoneLockdownRules**](ZoneLockdownApi.md#zoneLockdownListZoneLockdownRules) | **GET** /zones/{zone_identifier}/firewall/lockdowns | List Zone Lockdown rules
[**zoneLockdownUpdateAZoneLockdownRule**](ZoneLockdownApi.md#zoneLockdownUpdateAZoneLockdownRule) | **PUT** /zones/{zone_identifier}/firewall/lockdowns/{id} | Update a Zone Lockdown rule

<a name="zoneLockdownCreateAZoneLockdownRule"></a>
# **zoneLockdownCreateAZoneLockdownRule**
> ZonelockdownResponseSingle zoneLockdownCreateAZoneLockdownRule(body, zoneIdentifier)

Create a Zone Lockdown rule

Creates a new Zone Lockdown rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLockdownApi;

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


ZoneLockdownApi apiInstance = new ZoneLockdownApi();
Object body = null; // Object | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ZonelockdownResponseSingle result = apiInstance.zoneLockdownCreateAZoneLockdownRule(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownCreateAZoneLockdownRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ZonelockdownResponseSingle**](ZonelockdownResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLockdownDeleteAZoneLockdownRule"></a>
# **zoneLockdownDeleteAZoneLockdownRule**
> InlineResponse200114 zoneLockdownDeleteAZoneLockdownRule(id, zoneIdentifier)

Delete a Zone Lockdown rule

Deletes an existing Zone Lockdown rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLockdownApi;

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


ZoneLockdownApi apiInstance = new ZoneLockdownApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200114 result = apiInstance.zoneLockdownDeleteAZoneLockdownRule(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownDeleteAZoneLockdownRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200114**](InlineResponse200114.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLockdownGetAZoneLockdownRule"></a>
# **zoneLockdownGetAZoneLockdownRule**
> ZonelockdownResponseSingle zoneLockdownGetAZoneLockdownRule(id, zoneIdentifier)

Get a Zone Lockdown rule

Fetches the details of a Zone Lockdown rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLockdownApi;

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


ZoneLockdownApi apiInstance = new ZoneLockdownApi();
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ZonelockdownResponseSingle result = apiInstance.zoneLockdownGetAZoneLockdownRule(id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownGetAZoneLockdownRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ZonelockdownResponseSingle**](ZonelockdownResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneLockdownListZoneLockdownRules"></a>
# **zoneLockdownListZoneLockdownRules**
> ZonelockdownResponseCollection zoneLockdownListZoneLockdownRules(zoneIdentifier)

List Zone Lockdown rules

Fetches Zone Lockdown rules. You can filter the results using several optional parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLockdownApi;

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


ZoneLockdownApi apiInstance = new ZoneLockdownApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ZonelockdownResponseCollection result = apiInstance.zoneLockdownListZoneLockdownRules(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownListZoneLockdownRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ZonelockdownResponseCollection**](ZonelockdownResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneLockdownUpdateAZoneLockdownRule"></a>
# **zoneLockdownUpdateAZoneLockdownRule**
> ZonelockdownResponseSingle zoneLockdownUpdateAZoneLockdownRule(body, id, zoneIdentifier)

Update a Zone Lockdown rule

Updates an existing Zone Lockdown rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLockdownApi;

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


ZoneLockdownApi apiInstance = new ZoneLockdownApi();
Object body = null; // Object | 
String id = "id_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ZonelockdownResponseSingle result = apiInstance.zoneLockdownUpdateAZoneLockdownRule(body, id, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLockdownApi#zoneLockdownUpdateAZoneLockdownRule");
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

[**ZonelockdownResponseSingle**](ZonelockdownResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

