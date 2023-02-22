# RadarEntitiesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetASNId**](RadarEntitiesApi.md#radarGetASNId) | **GET** /radar/entities/asns/{asn} | Get autonomous system information by AS number
[**radarGetASNIp**](RadarEntitiesApi.md#radarGetASNIp) | **GET** /radar/entities/asns/ip | Get autonomous system information by IP address
[**radarGetASNsList**](RadarEntitiesApi.md#radarGetASNsList) | **GET** /radar/entities/asns | Get autonomous systems
[**radarGetLocationsList**](RadarEntitiesApi.md#radarGetLocationsList) | **GET** /radar/entities/locations | Get locations
[**radarGetLocationsOne**](RadarEntitiesApi.md#radarGetLocationsOne) | **GET** /radar/entities/locations/{location} | Get location

<a name="radarGetASNId"></a>
# **radarGetASNId**
> InlineResponse20074 radarGetASNId(asn, format)

Get autonomous system information by AS number

Get the requested autonomous system information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this AS). Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEntitiesApi;

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


RadarEntitiesApi apiInstance = new RadarEntitiesApi();
Integer asn = 56; // Integer | Autonomous System Number (ASN).
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20074 result = apiInstance.radarGetASNId(asn, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEntitiesApi#radarGetASNId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asn** | **Integer**| Autonomous System Number (ASN). |
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetASNIp"></a>
# **radarGetASNIp**
> InlineResponse20073 radarGetASNIp(ip, format)

Get autonomous system information by IP address

Get the requested autonomous system information based on IP address. Population estimates come from APNIC (refer to https://labs.apnic.net/?p&#x3D;526).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEntitiesApi;

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


RadarEntitiesApi apiInstance = new RadarEntitiesApi();
String ip = "ip_example"; // String | IP address.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20073 result = apiInstance.radarGetASNIp(ip, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEntitiesApi#radarGetASNIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ip** | **String**| IP address. |
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetASNsList"></a>
# **radarGetASNsList**
> InlineResponse20072 radarGetASNsList(limit, offset, asn, format)

Get autonomous systems

Gets a list of autonomous systems (AS).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEntitiesApi;

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


RadarEntitiesApi apiInstance = new RadarEntitiesApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
Integer offset = 0; // Integer | Number of objects to skip before grabbing results.
String asn = "asn_example"; // String | Comma separated list of ASNs.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20072 result = apiInstance.radarGetASNsList(limit, offset, asn, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEntitiesApi#radarGetASNsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **offset** | **Integer**| Number of objects to skip before grabbing results. | [optional] [default to 0]
 **asn** | **String**| Comma separated list of ASNs. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20072**](InlineResponse20072.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetLocationsList"></a>
# **radarGetLocationsList**
> InlineResponse20075 radarGetLocationsList(limit, offset, location, format)

Get locations

Get a list of locations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEntitiesApi;

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


RadarEntitiesApi apiInstance = new RadarEntitiesApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
Integer offset = 0; // Integer | Number of objects to skip before grabbing results.
String location = "location_example"; // String | Comma separated list of locations.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20075 result = apiInstance.radarGetLocationsList(limit, offset, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEntitiesApi#radarGetLocationsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **offset** | **Integer**| Number of objects to skip before grabbing results. | [optional] [default to 0]
 **location** | **String**| Comma separated list of locations. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetLocationsOne"></a>
# **radarGetLocationsOne**
> InlineResponse20076 radarGetLocationsOne(location, format)

Get location

Get the requested location information. A confidence level below &#x60;5&#x60; indicates a low level of confidence in the traffic data - normally this happens because Cloudflare has a small amount of traffic from/to this location).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEntitiesApi;

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


RadarEntitiesApi apiInstance = new RadarEntitiesApi();
String location = "location_example"; // String | Alpha-2 country code.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20076 result = apiInstance.radarGetLocationsOne(location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEntitiesApi#radarGetLocationsOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | **String**| Alpha-2 country code. |
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20076**](InlineResponse20076.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

