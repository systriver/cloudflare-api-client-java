# ZeroTrustGatewayLocationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation) | **POST** /accounts/{identifier}/gateway/locations | Create Zero Trust Gateway Location
[**zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation) | **DELETE** /accounts/{identifier}/gateway/locations/{uuid} | Delete Zero Trust Gateway Location
[**zeroTrustGatewayLocationsListZeroTrustGatewayLocations**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsListZeroTrustGatewayLocations) | **GET** /accounts/{identifier}/gateway/locations | List Zero Trust Gateway Locations
[**zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation) | **PUT** /accounts/{identifier}/gateway/locations/{uuid} | Update Zero Trust Gateway Location
[**zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails**](ZeroTrustGatewayLocationsApi.md#zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails) | **GET** /accounts/{identifier}/gateway/locations/{uuid} | Zero Trust Gateway Location Details

<a name="zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation"></a>
# **zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation**
> LocationsComponentsSchemasSingleResponse zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation(body, identifier)

Create Zero Trust Gateway Location

Create a new Zero Trust Gateway Location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayLocationsApi;

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


ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi();
GatewayLocationsBody body = new GatewayLocationsBody(); // GatewayLocationsBody | 
LocationsComponentsSchemasIdentifier identifier = new LocationsComponentsSchemasIdentifier(); // LocationsComponentsSchemasIdentifier | 
try {
    LocationsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsCreateZeroTrustGatewayLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayLocationsBody**](GatewayLocationsBody.md)|  |
 **identifier** | [**LocationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LocationsComponentsSchemasSingleResponse**](LocationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation"></a>
# **zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation**
> LocationsComponentsSchemasEmptyResponse zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation(uuid, identifier)

Delete Zero Trust Gateway Location

Delete a Zero Trust Gateway Location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayLocationsApi;

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


ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi();
LocationsComponentsSchemasUuid uuid = new LocationsComponentsSchemasUuid(); // LocationsComponentsSchemasUuid | 
LocationsComponentsSchemasIdentifier identifier = new LocationsComponentsSchemasIdentifier(); // LocationsComponentsSchemasIdentifier | 
try {
    LocationsComponentsSchemasEmptyResponse result = apiInstance.zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsDeleteZeroTrustGatewayLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**LocationsComponentsSchemasUuid**](.md)|  |
 **identifier** | [**LocationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LocationsComponentsSchemasEmptyResponse**](LocationsComponentsSchemasEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayLocationsListZeroTrustGatewayLocations"></a>
# **zeroTrustGatewayLocationsListZeroTrustGatewayLocations**
> LocationsComponentsSchemasResponseCollection zeroTrustGatewayLocationsListZeroTrustGatewayLocations(identifier)

List Zero Trust Gateway Locations

List Zero Trust Gateway Locations for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayLocationsApi;

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


ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi();
LocationsComponentsSchemasIdentifier identifier = new LocationsComponentsSchemasIdentifier(); // LocationsComponentsSchemasIdentifier | 
try {
    LocationsComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayLocationsListZeroTrustGatewayLocations(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsListZeroTrustGatewayLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**LocationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LocationsComponentsSchemasResponseCollection**](LocationsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation"></a>
# **zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation**
> LocationsComponentsSchemasSingleResponse zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation(body, uuid, identifier)

Update Zero Trust Gateway Location

Update a configured Zero Trust Gateway Location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayLocationsApi;

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


ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi();
LocationsUuidBody body = new LocationsUuidBody(); // LocationsUuidBody | 
LocationsComponentsSchemasUuid uuid = new LocationsComponentsSchemasUuid(); // LocationsComponentsSchemasUuid | 
LocationsComponentsSchemasIdentifier identifier = new LocationsComponentsSchemasIdentifier(); // LocationsComponentsSchemasIdentifier | 
try {
    LocationsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsUpdateZeroTrustGatewayLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LocationsUuidBody**](LocationsUuidBody.md)|  |
 **uuid** | [**LocationsComponentsSchemasUuid**](.md)|  |
 **identifier** | [**LocationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LocationsComponentsSchemasSingleResponse**](LocationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails"></a>
# **zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails**
> LocationsComponentsSchemasSingleResponse zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails(uuid, identifier)

Zero Trust Gateway Location Details

Fetch a single Zero Trust Gateway Location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayLocationsApi;

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


ZeroTrustGatewayLocationsApi apiInstance = new ZeroTrustGatewayLocationsApi();
LocationsComponentsSchemasUuid uuid = new LocationsComponentsSchemasUuid(); // LocationsComponentsSchemasUuid | 
LocationsComponentsSchemasIdentifier identifier = new LocationsComponentsSchemasIdentifier(); // LocationsComponentsSchemasIdentifier | 
try {
    LocationsComponentsSchemasSingleResponse result = apiInstance.zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayLocationsApi#zeroTrustGatewayLocationsZeroTrustGatewayLocationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**LocationsComponentsSchemasUuid**](.md)|  |
 **identifier** | [**LocationsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**LocationsComponentsSchemasSingleResponse**](LocationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

