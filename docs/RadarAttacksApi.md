# RadarAttacksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetAttacksLayer3Summary**](RadarAttacksApi.md#radarGetAttacksLayer3Summary) | **GET** /radar/attacks/layer3/summary | Get a summary of layer 3 attacks
[**radarGetAttacksLayer3Timeseries**](RadarAttacksApi.md#radarGetAttacksLayer3Timeseries) | **GET** /radar/attacks/layer3/timeseries | Get layer 3 attacks time series
[**radarGetAttacksLayer3TimeseriesGroups**](RadarAttacksApi.md#radarGetAttacksLayer3TimeseriesGroups) | **GET** /radar/attacks/layer3/timeseries_groups | Get layer 3 attacks by network protocol, over time
[**radarGetAttacksLayer7Summary**](RadarAttacksApi.md#radarGetAttacksLayer7Summary) | **GET** /radar/attacks/layer7/summary | Get a summary of layer 7 attacks
[**radarGetAttacksLayer7Timeseries**](RadarAttacksApi.md#radarGetAttacksLayer7Timeseries) | **GET** /radar/attacks/layer7/timeseries | Get attacks layer 7 time series
[**radarGetAttacksLayer7TimeseriesGroups**](RadarAttacksApi.md#radarGetAttacksLayer7TimeseriesGroups) | **GET** /radar/attacks/layer7/timeseries_groups | Get layer 7 attacks by mitigation technique, over time
[**radarGetAttacksLayer7TopAttacks**](RadarAttacksApi.md#radarGetAttacksLayer7TopAttacks) | **GET** /radar/attacks/layer7/top/attacks | Get layer 7 top attack pairs (origin and target locations)
[**radarGetAttacksLayer7TopOriginASes**](RadarAttacksApi.md#radarGetAttacksLayer7TopOriginASes) | **GET** /radar/attacks/layer7/top/ases/origin | Get layer 7 top origin ASes
[**radarGetAttacksLayer7TopOriginLocations**](RadarAttacksApi.md#radarGetAttacksLayer7TopOriginLocations) | **GET** /radar/attacks/layer7/top/locations/origin | Get layer 7 top origin locations
[**radarGetAttacksLayer7TopTargetLocations**](RadarAttacksApi.md#radarGetAttacksLayer7TopTargetLocations) | **GET** /radar/attacks/layer7/top/locations/target | Get layer 7 top target locations

<a name="radarGetAttacksLayer3Summary"></a>
# **radarGetAttacksLayer3Summary**
> InlineResponse20047 radarGetAttacksLayer3Summary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of layer 3 attacks

Percentage distribution of network protocols in layer 3/4 attacks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20047 result = apiInstance.radarGetAttacksLayer3Summary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3Summary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer3Timeseries"></a>
# **radarGetAttacksLayer3Timeseries**
> InlineResponse20048 radarGetAttacksLayer3Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, normalization, format)

Get layer 3 attacks time series

Get layer 3/4 attacks change over time. Values are normalized using min-max by default, with the minimum set to 0. When asking for multiple time series, you can also get the percentual relative change of the 1st/main series, with respect to the 2nd/control series - for example, to get the relative change of this week from the previous week, the 1st series would have a date range of 7d, the 2nd, a date range of 7dControl, and the normalization would be set to PERCENTAGE_CHANGE.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> attack = Arrays.asList("attack_example"); // List<String> | Array of L3/4 attack types.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String normalization = "normalization_example"; // String | Normalization method applied. Refer to [Normalization methods](https://developers.cloudflare.com/radar/concepts/normalization/).
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20048 result = apiInstance.radarGetAttacksLayer3Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, normalization, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3Timeseries");
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
 **attack** | [**List&lt;String&gt;**](String.md)| Array of L3/4 attack types. | [optional] [enum: UDP, TCP, ICMP, GRE]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **normalization** | **String**| Normalization method applied. Refer to [Normalization methods](https://developers.cloudflare.com/radar/concepts/normalization/). | [optional] [enum: PERCENTAGE_CHANGE, MIN0_MAX]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer3TimeseriesGroups"></a>
# **radarGetAttacksLayer3TimeseriesGroups**
> InlineResponse20049 radarGetAttacksLayer3TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get layer 3 attacks by network protocol, over time

Get percentage of what type of network protocols are used in layer 3/4 attacks, over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20049 result = apiInstance.radarGetAttacksLayer3TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer3TimeseriesGroups");
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
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer7Summary"></a>
# **radarGetAttacksLayer7Summary**
> InlineResponse20050 radarGetAttacksLayer7Summary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of layer 7 attacks

Percentage distribution of mitigation techniques in layer 7 attacks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20050 result = apiInstance.radarGetAttacksLayer7Summary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7Summary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer7Timeseries"></a>
# **radarGetAttacksLayer7Timeseries**
> InlineResponse20039 radarGetAttacksLayer7Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, normalization, format)

Get attacks layer 7 time series

Get layer 7 attacks change over time. Values are normalized using min-max by default, with the minimum set to 0. When asking for multiple time series, you can also get the percentage relative change of the first/main series, with respect to the second/control series - for example, to get the relative change of this week from the previous week, the first series would have a date range of &#x60;7d&#x60;, the second, a date range of &#x60;7dControl&#x60;, and the normalization would be set to &#x60;PERCENTAGE_CHANGE&#x60;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> attack = Arrays.asList("attack_example"); // List<String> | Array of L7 attack types.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String normalization = "normalization_example"; // String | Normalization method applied. Refer to [Normalization methods](https://developers.cloudflare.com/radar/concepts/normalization/).
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20039 result = apiInstance.radarGetAttacksLayer7Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, attack, asn, location, normalization, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7Timeseries");
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
 **attack** | [**List&lt;String&gt;**](String.md)| Array of L7 attack types. | [optional] [enum: DDOS, WAF, BOT_MANAGEMENT, ACCESS_RULES, IP_REPUTATION, API_SHIELD, DATA_LOSS_PREVENTION]
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

<a name="radarGetAttacksLayer7TimeseriesGroups"></a>
# **radarGetAttacksLayer7TimeseriesGroups**
> InlineResponse20051 radarGetAttacksLayer7TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get layer 7 attacks by mitigation technique, over time

Get percentage of what type of mitigation techniques are used to block layer 7 attacks, over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20051 result = apiInstance.radarGetAttacksLayer7TimeseriesGroups(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TimeseriesGroups");
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
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer7TopAttacks"></a>
# **radarGetAttacksLayer7TopAttacks**
> InlineResponse20053 radarGetAttacksLayer7TopAttacks(limit, name, dateRange, dateStart, dateEnd, location, magnitude, limitDirection, limitPerLocation, format)

Get layer 7 top attack pairs (origin and target locations)

Get the top attacks from origin to target location. Values are a percentage out of the total layer 7 attacks (with billing country). The attack magnitude can be defined by the number of mitigated requests or by the number of zones affected. You can optionally limit the number of attacks per origin/target location (useful if all the top attacks are from or to the same location).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String magnitude = "magnitude_example"; // String | Attack magnitude can be defined by total requests mitigated or by total zones attacked.
String limitDirection = "limitDirection_example"; // String | Array of attack origin/target location attack limits. Together with `limitPerLocation`, limits how many objects will be fetched per origin/target location.
Integer limitPerLocation = 10; // Integer | Limit the number of attacks per origin/target (refer to `limitDirection` parameter) location.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20053 result = apiInstance.radarGetAttacksLayer7TopAttacks(limit, name, dateRange, dateStart, dateEnd, location, magnitude, limitDirection, limitPerLocation, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopAttacks");
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
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **magnitude** | **String**| Attack magnitude can be defined by total requests mitigated or by total zones attacked. | [optional] [enum: AFFECTED_ZONES, MITIGATED_REQUESTS]
 **limitDirection** | **String**| Array of attack origin/target location attack limits. Together with &#x60;limitPerLocation&#x60;, limits how many objects will be fetched per origin/target location. | [optional] [enum: ORIGIN, TARGET]
 **limitPerLocation** | **Integer**| Limit the number of attacks per origin/target (refer to &#x60;limitDirection&#x60; parameter) location. | [optional] [default to 10]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer7TopOriginASes"></a>
# **radarGetAttacksLayer7TopOriginASes**
> InlineResponse20052 radarGetAttacksLayer7TopOriginASes(limit, name, dateRange, dateStart, dateEnd, location, format)

Get layer 7 top origin ASes

Get the top origin ASes by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The origin location is determined by the client IP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of locations (alpha-2 country codes).
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20052 result = apiInstance.radarGetAttacksLayer7TopOriginASes(limit, name, dateRange, dateStart, dateEnd, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopOriginASes");
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
 **location** | [**List&lt;String&gt;**](String.md)| Array of locations (alpha-2 country codes). | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer7TopOriginLocations"></a>
# **radarGetAttacksLayer7TopOriginLocations**
> InlineResponse20054 radarGetAttacksLayer7TopOriginLocations(limit, name, dateRange, dateStart, dateEnd, asn, format)

Get layer 7 top origin locations

Get the top origin locations of and by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The origin location is determined by the client IP.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20054 result = apiInstance.radarGetAttacksLayer7TopOriginLocations(limit, name, dateRange, dateStart, dateEnd, asn, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopOriginLocations");
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
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAttacksLayer7TopTargetLocations"></a>
# **radarGetAttacksLayer7TopTargetLocations**
> InlineResponse20055 radarGetAttacksLayer7TopTargetLocations(limit, name, dateRange, dateStart, dateEnd, format)

Get layer 7 top target locations

Get the top target locations of and by layer 7 attacks. Values are a percentage out of the total layer 7 attacks. The target location is determined by the attacked zone&#x27;s billing country, when available.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAttacksApi;

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


RadarAttacksApi apiInstance = new RadarAttacksApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20055 result = apiInstance.radarGetAttacksLayer7TopTargetLocations(limit, name, dateRange, dateStart, dateEnd, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAttacksApi#radarGetAttacksLayer7TopTargetLocations");
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
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

