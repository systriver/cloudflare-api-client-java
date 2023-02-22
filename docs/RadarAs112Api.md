# RadarAs112Api

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetAS112DNSSECSummary**](RadarAs112Api.md#radarGetAS112DNSSECSummary) | **GET** /radar/as112/summary/dnssec | Get a summary of DNSSEC
[**radarGetAS112DNSSECTimeseriesGroup**](RadarAs112Api.md#radarGetAS112DNSSECTimeseriesGroup) | **GET** /radar/as112/timeseries/dnssec | Get a time series of DNSSEC
[**radarGetAS112EDNSSummary**](RadarAs112Api.md#radarGetAS112EDNSSummary) | **GET** /radar/as112/summary/edns | Get a summary of EDNS
[**radarGetAS112EDNSTimeseriesGroup**](RadarAs112Api.md#radarGetAS112EDNSTimeseriesGroup) | **GET** /radar/as112/timeseries/edns | Get a time series of EDNS
[**radarGetAS112IPVersionSummary**](RadarAs112Api.md#radarGetAS112IPVersionSummary) | **GET** /radar/as112/summary/ip_version | Get a summary of IP Version
[**radarGetAS112IPVersionTimeseriesGroup**](RadarAs112Api.md#radarGetAS112IPVersionTimeseriesGroup) | **GET** /radar/as112/timeseries/ip_version | Get a time series of IP Version
[**radarGetAS112ProtocolSummary**](RadarAs112Api.md#radarGetAS112ProtocolSummary) | **GET** /radar/as112/summary/protocol | Get a summary of Protocol
[**radarGetAS112ProtocolTimeseriesGroup**](RadarAs112Api.md#radarGetAS112ProtocolTimeseriesGroup) | **GET** /radar/as112/timeseries/protocol | Get a time series of Protocol
[**radarGetAS112QueryTypeSummary**](RadarAs112Api.md#radarGetAS112QueryTypeSummary) | **GET** /radar/as112/summary/query_type | Get a summary of Query Type
[**radarGetAS112QueryTypeTimeseriesGroup**](RadarAs112Api.md#radarGetAS112QueryTypeTimeseriesGroup) | **GET** /radar/as112/timeseries/query_type | Get a time series of Query Type
[**radarGetAS112ResponseCodesSummary**](RadarAs112Api.md#radarGetAS112ResponseCodesSummary) | **GET** /radar/as112/summary/response_codes | Get a summary of Response Codes
[**radarGetAS112ResponseCodesTimeseriesGroup**](RadarAs112Api.md#radarGetAS112ResponseCodesTimeseriesGroup) | **GET** /radar/as112/timeseries/response_codes | Get a time series of Response Codes
[**radarGetAS112Timeseries**](RadarAs112Api.md#radarGetAS112Timeseries) | **GET** /radar/as112/timeseries | Get AS112 time series
[**radarGetAS112TopLocations**](RadarAs112Api.md#radarGetAS112TopLocations) | **GET** /radar/as112/top/locations | Get top autonomous systems by HTTP requests
[**radarGetAS112TopLocationsByDnssec**](RadarAs112Api.md#radarGetAS112TopLocationsByDnssec) | **GET** /radar/as112/top/locations/dnssec/{dnssec} | Get top locations by DNSSEC validations
[**radarGetAS112TopLocationsByEdns**](RadarAs112Api.md#radarGetAS112TopLocationsByEdns) | **GET** /radar/as112/top/locations/edns/{edns} | Get top locations by EDNS validations
[**radarGetAS112TopLocationsByIpVersion**](RadarAs112Api.md#radarGetAS112TopLocationsByIpVersion) | **GET** /radar/as112/top/locations/ip_version/{ip_version} | Get top locations by IP version

<a name="radarGetAS112DNSSECSummary"></a>
# **radarGetAS112DNSSECSummary**
> InlineResponse20033 radarGetAS112DNSSECSummary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of DNSSEC

Percentage distribution of dns requests classified per DNSSEC.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20033 result = apiInstance.radarGetAS112DNSSECSummary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112DNSSECSummary");
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

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112DNSSECTimeseriesGroup"></a>
# **radarGetAS112DNSSECTimeseriesGroup**
> InlineResponse20040 radarGetAS112DNSSECTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get a time series of DNSSEC

Percentage distribution of dns requests classified per DNSSEC over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20040 result = apiInstance.radarGetAS112DNSSECTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112DNSSECTimeseriesGroup");
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

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112EDNSSummary"></a>
# **radarGetAS112EDNSSummary**
> InlineResponse20034 radarGetAS112EDNSSummary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of EDNS

Percentage distribution of dns requests classified per EDNS.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20034 result = apiInstance.radarGetAS112EDNSSummary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112EDNSSummary");
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

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112EDNSTimeseriesGroup"></a>
# **radarGetAS112EDNSTimeseriesGroup**
> InlineResponse20041 radarGetAS112EDNSTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get a time series of EDNS

Percentage distribution of dns requests classified per EDNS over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20041 result = apiInstance.radarGetAS112EDNSTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112EDNSTimeseriesGroup");
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

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112IPVersionSummary"></a>
# **radarGetAS112IPVersionSummary**
> InlineResponse20035 radarGetAS112IPVersionSummary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of IP Version

Percentage distribution of dns requests classified per IP Version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20035 result = apiInstance.radarGetAS112IPVersionSummary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112IPVersionSummary");
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

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112IPVersionTimeseriesGroup"></a>
# **radarGetAS112IPVersionTimeseriesGroup**
> InlineResponse20042 radarGetAS112IPVersionTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get a time series of IP Version

Percentage distribution of dns requests classified per IP Version over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20042 result = apiInstance.radarGetAS112IPVersionTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112IPVersionTimeseriesGroup");
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

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112ProtocolSummary"></a>
# **radarGetAS112ProtocolSummary**
> InlineResponse20036 radarGetAS112ProtocolSummary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of Protocol

Percentage distribution of dns requests classified per Protocol.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20036 result = apiInstance.radarGetAS112ProtocolSummary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112ProtocolSummary");
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

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112ProtocolTimeseriesGroup"></a>
# **radarGetAS112ProtocolTimeseriesGroup**
> InlineResponse20043 radarGetAS112ProtocolTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get a time series of Protocol

Percentage distribution of dns requests classified per Protocol over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20043 result = apiInstance.radarGetAS112ProtocolTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112ProtocolTimeseriesGroup");
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

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112QueryTypeSummary"></a>
# **radarGetAS112QueryTypeSummary**
> InlineResponse20037 radarGetAS112QueryTypeSummary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of Query Type

Percentage distribution of dns requests classified per Query Type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20037 result = apiInstance.radarGetAS112QueryTypeSummary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112QueryTypeSummary");
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

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112QueryTypeTimeseriesGroup"></a>
# **radarGetAS112QueryTypeTimeseriesGroup**
> InlineResponse20044 radarGetAS112QueryTypeTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get a time series of Query Type

Percentage distribution of dns requests classified per Query Type over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20044 result = apiInstance.radarGetAS112QueryTypeTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112QueryTypeTimeseriesGroup");
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

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112ResponseCodesSummary"></a>
# **radarGetAS112ResponseCodesSummary**
> InlineResponse20038 radarGetAS112ResponseCodesSummary(name, dateRange, dateStart, dateEnd, asn, location, format)

Get a summary of Response Codes

Percentage distribution of dns requests classified per Response Codes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20038 result = apiInstance.radarGetAS112ResponseCodesSummary(name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112ResponseCodesSummary");
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

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112ResponseCodesTimeseriesGroup"></a>
# **radarGetAS112ResponseCodesTimeseriesGroup**
> InlineResponse20045 radarGetAS112ResponseCodesTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get a time series of Response Codes

Percentage distribution of dns requests classified per Response Codes over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20045 result = apiInstance.radarGetAS112ResponseCodesTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112ResponseCodesTimeseriesGroup");
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

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112Timeseries"></a>
# **radarGetAS112Timeseries**
> InlineResponse20039 radarGetAS112Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format)

Get AS112 time series

Get AS112 queries change over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20039 result = apiInstance.radarGetAS112Timeseries(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112Timeseries");
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

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112TopLocations"></a>
# **radarGetAS112TopLocations**
> InlineResponse20046 radarGetAS112TopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, format)

Get top autonomous systems by HTTP requests

Get the top locations by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetAS112TopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112TopLocations");
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

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112TopLocationsByDnssec"></a>
# **radarGetAS112TopLocationsByDnssec**
> InlineResponse20046 radarGetAS112TopLocationsByDnssec(dnssec, limit, name, dateRange, dateStart, dateEnd, asn, location, format)

Get top locations by DNSSEC validations

Get the locations, by AS112 queries, of DNSSEC validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String dnssec = "dnssec_example"; // String | DNSSEC.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetAS112TopLocationsByDnssec(dnssec, limit, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112TopLocationsByDnssec");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dnssec** | **String**| DNSSEC. | [enum: SUPPORTED, NOT_SUPPORTED]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112TopLocationsByEdns"></a>
# **radarGetAS112TopLocationsByEdns**
> InlineResponse20046 radarGetAS112TopLocationsByEdns(edns, limit, name, dateRange, dateStart, dateEnd, asn, location, format)

Get top locations by EDNS validations

Get the locations, by AS112 queries, of EDNS validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String edns = "edns_example"; // String | EDNS.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetAS112TopLocationsByEdns(edns, limit, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112TopLocationsByEdns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **edns** | **String**| EDNS. | [enum: SUPPORTED, NOT_SUPPORTED]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAS112TopLocationsByIpVersion"></a>
# **radarGetAS112TopLocationsByIpVersion**
> InlineResponse20046 radarGetAS112TopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, format)

Get top locations by IP version

Get the locations, by AS112 queries, of IP version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAs112Api;

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


RadarAs112Api apiInstance = new RadarAs112Api();
String ipVersion = "ipVersion_example"; // String | IP Version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetAS112TopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAs112Api#radarGetAS112TopLocationsByIpVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipVersion** | **String**| IP Version. | [enum: IPv4, IPv6]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

