# RadarSpecialEventsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetSpecialEventsGet**](RadarSpecialEventsApi.md#radarGetSpecialEventsGet) | **GET** /radar/specialevents/{eventAlias} | Get a Single Special Events
[**radarGetSpecialEventsList**](RadarSpecialEventsApi.md#radarGetSpecialEventsList) | **GET** /radar/specialevents | List Special Events
[**radarGetTimeseriesSpecialEvents**](RadarSpecialEventsApi.md#radarGetTimeseriesSpecialEvents) | **GET** /radar/specialevents/{eventAlias}/{categoryAlias} | Get Special Events time series

<a name="radarGetSpecialEventsGet"></a>
# **radarGetSpecialEventsGet**
> InlineResponse200100 radarGetSpecialEventsGet(eventAlias, format)

Get a Single Special Events

Get a single Special Event.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarSpecialEventsApi;

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


RadarSpecialEventsApi apiInstance = new RadarSpecialEventsApi();
String eventAlias = "eventAlias_example"; // String | Special Event alias
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse200100 result = apiInstance.radarGetSpecialEventsGet(eventAlias, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarSpecialEventsApi#radarGetSpecialEventsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventAlias** | **String**| Special Event alias |
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse200100**](InlineResponse200100.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSpecialEventsList"></a>
# **radarGetSpecialEventsList**
> InlineResponse20099 radarGetSpecialEventsList(limit, offset, format)

List Special Events

Get a list of Special Events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarSpecialEventsApi;

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


RadarSpecialEventsApi apiInstance = new RadarSpecialEventsApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
Integer offset = 0; // Integer | Number of objects to skip before grabbing results.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20099 result = apiInstance.radarGetSpecialEventsList(limit, offset, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarSpecialEventsApi#radarGetSpecialEventsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **offset** | **Integer**| Number of objects to skip before grabbing results. | [optional] [default to 0]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20099**](InlineResponse20099.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesSpecialEvents"></a>
# **radarGetTimeseriesSpecialEvents**
> InlineResponse200101 radarGetTimeseriesSpecialEvents(eventAlias, categoryAlias, aggInterval, name, dateStart, dateEnd, location, format)

Get Special Events time series

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarSpecialEventsApi;

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


RadarSpecialEventsApi apiInstance = new RadarSpecialEventsApi();
String eventAlias = "eventAlias_example"; // String | Special Event alias
String categoryAlias = "categoryAlias_example"; // String | Special Event Category alias
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
String name = "name_example"; // String | Name that will be used to name the series in response.
OffsetDateTime dateStart = new OffsetDateTime(); // OffsetDateTime | Start of the date range (inclusive).
OffsetDateTime dateEnd = new OffsetDateTime(); // OffsetDateTime | End of the date range (inclusive).
String location = "location_example"; // String | Location Alpha2 code.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse200101 result = apiInstance.radarGetTimeseriesSpecialEvents(eventAlias, categoryAlias, aggInterval, name, dateStart, dateEnd, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarSpecialEventsApi#radarGetTimeseriesSpecialEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventAlias** | **String**| Special Event alias |
 **categoryAlias** | **String**| Special Event Category alias |
 **aggInterval** | **String**| Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/). | [optional] [enum: 15m, 1h, 1d, 1w]
 **name** | **String**| Name that will be used to name the series in response. | [optional]
 **dateStart** | **OffsetDateTime**| Start of the date range (inclusive). | [optional]
 **dateEnd** | **OffsetDateTime**| End of the date range (inclusive). | [optional]
 **location** | **String**| Location Alpha2 code. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse200101**](InlineResponse200101.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

