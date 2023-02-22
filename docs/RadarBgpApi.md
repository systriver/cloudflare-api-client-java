# RadarBgpApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetBGPRouteLeakEvents**](RadarBgpApi.md#radarGetBGPRouteLeakEvents) | **GET** /radar/bgp/leaks/events | Get BGP route leak events
[**radarGetBGPTopASes**](RadarBgpApi.md#radarGetBGPTopASes) | **GET** /radar/bgp/top/ases | Get top autonomous systems
[**radarGetBGPTopPrefixes**](RadarBgpApi.md#radarGetBGPTopPrefixes) | **GET** /radar/bgp/top/prefixes | Get top prefixes
[**radarGetBgpTimeseries**](RadarBgpApi.md#radarGetBgpTimeseries) | **GET** /radar/bgp/timeseries | Get BGP time series

<a name="radarGetBGPRouteLeakEvents"></a>
# **radarGetBGPRouteLeakEvents**
> InlineResponse20056 radarGetBGPRouteLeakEvents(page, perPage, leakAsn, involvedAsn, dateRange, dateStart, dateEnd, sortBy, sortOrder, format)

Get BGP route leak events

Get the BGP route leak events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarBgpApi;

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


RadarBgpApi apiInstance = new RadarBgpApi();
Integer page = 1; // Integer | Current page number, starting from 1
Integer perPage = 50; // Integer | Number of entries per page
Integer leakAsn = 56; // Integer | The leaking AS of a route leak event
Integer involvedAsn = 56; // Integer | ASN that is causing or affected by a route leak event
String dateRange = "dateRange_example"; // String | Shorthand date ranges for the last X days - use when you don't need specific start and end dates.
OffsetDateTime dateStart = new OffsetDateTime(); // OffsetDateTime | Start of the date range (inclusive).
OffsetDateTime dateEnd = new OffsetDateTime(); // OffsetDateTime | End of the date range (inclusive).
String sortBy = "sortBy_example"; // String | Sort events by field
String sortOrder = "sortOrder_example"; // String | Sort order
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20056 result = apiInstance.radarGetBGPRouteLeakEvents(page, perPage, leakAsn, involvedAsn, dateRange, dateStart, dateEnd, sortBy, sortOrder, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarBgpApi#radarGetBGPRouteLeakEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Current page number, starting from 1 | [optional] [default to 1]
 **perPage** | **Integer**| Number of entries per page | [optional] [default to 50]
 **leakAsn** | **Integer**| The leaking AS of a route leak event | [optional]
 **involvedAsn** | **Integer**| ASN that is causing or affected by a route leak event | [optional]
 **dateRange** | **String**| Shorthand date ranges for the last X days - use when you don&#x27;t need specific start and end dates. | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | **OffsetDateTime**| Start of the date range (inclusive). | [optional]
 **dateEnd** | **OffsetDateTime**| End of the date range (inclusive). | [optional]
 **sortBy** | **String**| Sort events by field | [optional] [enum: ID, LEAKS, PEERS, PREFIXES, ORIGINS, TIME]
 **sortOrder** | **String**| Sort order | [optional] [enum: ASC, DESC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetBGPTopASes"></a>
# **radarGetBGPTopASes**
> InlineResponse20057 radarGetBGPTopASes(limit, name, dateRange, dateStart, dateEnd, asn, prefix, updateType, format)

Get top autonomous systems

Get the top autonomous systems (AS) by BGP updates (announcements only). Values are a percentage out of the total updates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarBgpApi;

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


RadarBgpApi apiInstance = new RadarBgpApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> prefix = Arrays.asList("prefix_example"); // List<String> | Array of BGP network prefixes.
List<String> updateType = Arrays.asList("updateType_example"); // List<String> | Array of BGP update types.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20057 result = apiInstance.radarGetBGPTopASes(limit, name, dateRange, dateStart, dateEnd, asn, prefix, updateType, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarBgpApi#radarGetBGPTopASes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **prefix** | [**List&lt;String&gt;**](String.md)| Array of BGP network prefixes. | [optional]
 **updateType** | [**List&lt;String&gt;**](String.md)| Array of BGP update types. | [optional] [enum: ANNOUNCEMENT, WITHDRAWAL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetBGPTopPrefixes"></a>
# **radarGetBGPTopPrefixes**
> InlineResponse20058 radarGetBGPTopPrefixes(limit, name, dateRange, dateStart, dateEnd, asn, updateType, format)

Get top prefixes

Get the top network prefixes by BGP updates. Values are a percentage out of the total BGP updates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarBgpApi;

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


RadarBgpApi apiInstance = new RadarBgpApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> updateType = Arrays.asList("updateType_example"); // List<String> | Array of BGP update types.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20058 result = apiInstance.radarGetBGPTopPrefixes(limit, name, dateRange, dateStart, dateEnd, asn, updateType, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarBgpApi#radarGetBGPTopPrefixes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **updateType** | [**List&lt;String&gt;**](String.md)| Array of BGP update types. | [optional] [enum: ANNOUNCEMENT, WITHDRAWAL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetBgpTimeseries"></a>
# **radarGetBgpTimeseries**
> InlineResponse20039 radarGetBgpTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, prefix, updateType, asn, format)

Get BGP time series

Gets BGP updates change over time. Raw values are returned. When requesting updates of an autonomous system (AS), only BGP updates of type announcement are returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarBgpApi;

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


RadarBgpApi apiInstance = new RadarBgpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
String prefix = "prefix_example"; // String | Network prefix, IPv4 or IPv6.
List<String> updateType = Arrays.asList("updateType_example"); // List<String> | Array of BGP update types.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20039 result = apiInstance.radarGetBgpTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, prefix, updateType, asn, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarBgpApi#radarGetBgpTimeseries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aggInterval** | **String**| Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/). | [optional] [enum: 15m, 1h, 1d, 1w]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **prefix** | **String**| Network prefix, IPv4 or IPv6. | [optional]
 **updateType** | [**List&lt;String&gt;**](String.md)| Array of BGP update types. | [optional] [enum: ANNOUNCEMENT, WITHDRAWAL]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

