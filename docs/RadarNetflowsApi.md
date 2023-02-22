# RadarNetflowsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetNetflowsTopASes**](RadarNetflowsApi.md#radarGetNetflowsTopASes) | **GET** /radar/netflows/top/ases | Get top autonomous systems
[**radarGetNetflowsTopLocations**](RadarNetflowsApi.md#radarGetNetflowsTopLocations) | **GET** /radar/netflows/top/locations | Get top locations
[**radarGetTimeseries**](RadarNetflowsApi.md#radarGetTimeseries) | **GET** /radar/netflows/timeseries | Get NetFlow time series

<a name="radarGetNetflowsTopASes"></a>
# **radarGetNetflowsTopASes**
> InlineResponse20093 radarGetNetflowsTopASes(limit, name, dateRange, dateStart, dateEnd, asn, location, format)

Get top autonomous systems

Get the top autonomous systems (AS) by network traffic. Values are a percentage out of the total network traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarNetflowsApi;

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


RadarNetflowsApi apiInstance = new RadarNetflowsApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20093 result = apiInstance.radarGetNetflowsTopASes(limit, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarNetflowsApi#radarGetNetflowsTopASes");
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
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20093**](InlineResponse20093.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetNetflowsTopLocations"></a>
# **radarGetNetflowsTopLocations**
> InlineResponse20094 radarGetNetflowsTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, format)

Get top locations

Get the top locations by network traffic. Values are a percentage out of the total network traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarNetflowsApi;

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


RadarNetflowsApi apiInstance = new RadarNetflowsApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20094 result = apiInstance.radarGetNetflowsTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarNetflowsApi#radarGetNetflowsTopLocations");
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
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20094**](InlineResponse20094.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseries"></a>
# **radarGetTimeseries**
> InlineResponse20039 radarGetTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, product, asn, location, normalization, format)

Get NetFlow time series

Get network traffic change over time. Values are normalized using min-max by default, with the minimum set to 0. When asking for multiple time series, you can also get the percentage relative change of the first/main series, with respect to the second/control series - for example, to get the relative change of this week from the previous week, the first series would have a date range of &#x60;7d&#x60;, the second, a date range of &#x60;7dControl&#x60;, and the normalization would be set to &#x60;PERCENTAGE_CHANGE&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarNetflowsApi;

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


RadarNetflowsApi apiInstance = new RadarNetflowsApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> product = Arrays.asList("product_example"); // List<String> | Array of network traffic product types.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String normalization = "normalization_example"; // String | Normalization method applied. Refer to [Normalization methods](https://developers.cloudflare.com/radar/concepts/normalization/).
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20039 result = apiInstance.radarGetTimeseries(aggInterval, name, dateRange, dateStart, dateEnd, product, asn, location, normalization, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarNetflowsApi#radarGetTimeseries");
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
 **product** | [**List&lt;String&gt;**](String.md)| Array of network traffic product types. | [optional] [enum: HTTP, ALL]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **normalization** | **String**| Normalization method applied. Refer to [Normalization methods](https://developers.cloudflare.com/radar/concepts/normalization/). | [optional] [enum: PERCENTAGE_CHANGE, MIN0_MAX]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

