# RadarHttpApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetHttpTopASes**](RadarHttpApi.md#radarGetHttpTopASes) | **GET** /radar/http/top/ases | Get top autonomous systems by HTTP requests
[**radarGetHttpTopASesByBotClass**](RadarHttpApi.md#radarGetHttpTopASesByBotClass) | **GET** /radar/http/top/ases/bot_class/{bot_class} | Get top autonomous systems by bot class
[**radarGetHttpTopASesByDeviceType**](RadarHttpApi.md#radarGetHttpTopASesByDeviceType) | **GET** /radar/http/top/ases/device_type/{device_type} | Get top autonomous systems by device type
[**radarGetHttpTopASesByHTTPProtocol**](RadarHttpApi.md#radarGetHttpTopASesByHTTPProtocol) | **GET** /radar/http/top/ases/http_protocol/{http_protocol} | Get top autonomous systems by HTTP protocol
[**radarGetHttpTopASesByHTTPVersion**](RadarHttpApi.md#radarGetHttpTopASesByHTTPVersion) | **GET** /radar/http/top/ases/http_version/{http_version} | Get top autonomous systems by HTTP version
[**radarGetHttpTopASesByIpVersion**](RadarHttpApi.md#radarGetHttpTopASesByIpVersion) | **GET** /radar/http/top/ases/ip_version/{ip_version} | Get top autonomous systems by IP version
[**radarGetHttpTopASesByOS**](RadarHttpApi.md#radarGetHttpTopASesByOS) | **GET** /radar/http/top/ases/os/{os} | Get top autonomous systems by operating system
[**radarGetHttpTopASesByTLSVersion**](RadarHttpApi.md#radarGetHttpTopASesByTLSVersion) | **GET** /radar/http/top/ases/tls_version/{tls_version} | Get top autonomous systems by TLS version
[**radarGetHttpTopBrowserFamilies**](RadarHttpApi.md#radarGetHttpTopBrowserFamilies) | **GET** /radar/http/top/browser_families | Get top user agents aggregated in families by HTTP requests
[**radarGetHttpTopBrowsers**](RadarHttpApi.md#radarGetHttpTopBrowsers) | **GET** /radar/http/top/browsers | Get top user agents by HTTP requests
[**radarGetHttpTopLocations**](RadarHttpApi.md#radarGetHttpTopLocations) | **GET** /radar/http/top/locations | Get top autonomous systems by HTTP requests
[**radarGetHttpTopLocationsByBotClass**](RadarHttpApi.md#radarGetHttpTopLocationsByBotClass) | **GET** /radar/http/top/locations/bot_class/{bot_class} | Get top locations by bot class
[**radarGetHttpTopLocationsByDeviceType**](RadarHttpApi.md#radarGetHttpTopLocationsByDeviceType) | **GET** /radar/http/top/locations/device_type/{device_type} | Get top locations by device type
[**radarGetHttpTopLocationsByHTTPProtocol**](RadarHttpApi.md#radarGetHttpTopLocationsByHTTPProtocol) | **GET** /radar/http/top/locations/http_protocol/{http_protocol} | Get top locations by HTTP protocol
[**radarGetHttpTopLocationsByHTTPVersion**](RadarHttpApi.md#radarGetHttpTopLocationsByHTTPVersion) | **GET** /radar/http/top/locations/http_version/{http_version} | Get top locations by HTTP version
[**radarGetHttpTopLocationsByIpVersion**](RadarHttpApi.md#radarGetHttpTopLocationsByIpVersion) | **GET** /radar/http/top/locations/ip_version/{ip_version} | Get top locations by IP version
[**radarGetHttpTopLocationsByOS**](RadarHttpApi.md#radarGetHttpTopLocationsByOS) | **GET** /radar/http/top/locations/os/{os} | Get top locations by operating system
[**radarGetHttpTopLocationsByTLSVersion**](RadarHttpApi.md#radarGetHttpTopLocationsByTLSVersion) | **GET** /radar/http/top/locations/tls_version/{tls_version} | Get top locations by TLS version
[**radarGetSummaryBotClass**](RadarHttpApi.md#radarGetSummaryBotClass) | **GET** /radar/http/summary/bot_class | Get a summary of bot classes
[**radarGetSummaryDeviceType**](RadarHttpApi.md#radarGetSummaryDeviceType) | **GET** /radar/http/summary/device_type | Get a summary of device types
[**radarGetSummaryHttpProtocol**](RadarHttpApi.md#radarGetSummaryHttpProtocol) | **GET** /radar/http/summary/http_protocol | Get a summary of HTTP protocols
[**radarGetSummaryHttpVersion**](RadarHttpApi.md#radarGetSummaryHttpVersion) | **GET** /radar/http/summary/http_version | Get a summary of HTTP versions
[**radarGetSummaryIpVersion**](RadarHttpApi.md#radarGetSummaryIpVersion) | **GET** /radar/http/summary/ip_version | Get a summary of IP versions
[**radarGetSummaryOS**](RadarHttpApi.md#radarGetSummaryOS) | **GET** /radar/http/summary/os | Get a summary of operating systems
[**radarGetSummaryTLSVersion**](RadarHttpApi.md#radarGetSummaryTLSVersion) | **GET** /radar/http/summary/tls_version | Get a summary of TLS versions
[**radarGetTimeseriesBotClass**](RadarHttpApi.md#radarGetTimeseriesBotClass) | **GET** /radar/http/timeseries/bot_class | Get time series of bot classes
[**radarGetTimeseriesBrowserFamilies**](RadarHttpApi.md#radarGetTimeseriesBrowserFamilies) | **GET** /radar/http/timeseries/browser_family | Get time series of user agents aggregated in families
[**radarGetTimeseriesBrowsers**](RadarHttpApi.md#radarGetTimeseriesBrowsers) | **GET** /radar/http/timeseries/browser | Get time series of user agents
[**radarGetTimeseriesDeviceType**](RadarHttpApi.md#radarGetTimeseriesDeviceType) | **GET** /radar/http/timeseries/device_type | Get time series of device types
[**radarGetTimeseriesHttpProtocol**](RadarHttpApi.md#radarGetTimeseriesHttpProtocol) | **GET** /radar/http/timeseries/http_protocol | Get time series of HTTP protocols
[**radarGetTimeseriesHttpVersion**](RadarHttpApi.md#radarGetTimeseriesHttpVersion) | **GET** /radar/http/timeseries/http_version | Get time series of HTTP versions
[**radarGetTimeseriesIpVersion**](RadarHttpApi.md#radarGetTimeseriesIpVersion) | **GET** /radar/http/timeseries/ip_version | Get time series of IP versions
[**radarGetTimeseriesOS**](RadarHttpApi.md#radarGetTimeseriesOS) | **GET** /radar/http/timeseries/os | Get time series of operating systems
[**radarGetTimeseriesTLSVersion**](RadarHttpApi.md#radarGetTimeseriesTLSVersion) | **GET** /radar/http/timeseries/tls_version | Get time series of TLS versions

<a name="radarGetHttpTopASes"></a>
# **radarGetHttpTopASes**
> InlineResponse20071 radarGetHttpTopASes(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top autonomous systems by HTTP requests

Get the top autonomous systems (AS) by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASes(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASes");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopASesByBotClass"></a>
# **radarGetHttpTopASesByBotClass**
> InlineResponse20071 radarGetHttpTopASesByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top autonomous systems by bot class

Get the top autonomous systems (AS), by HTTP traffic, of the requested bot class. These two categories use Cloudflare&#x27;s bot score - refer to [Bot Scores](https://developers.cloudflare.com/bots/concepts/bot-score) for more information. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String botClass = "botClass_example"; // String | Bot class.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASesByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASesByBotClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botClass** | **String**| Bot class. | [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopASesByDeviceType"></a>
# **radarGetHttpTopASesByDeviceType**
> InlineResponse20071 radarGetHttpTopASesByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top autonomous systems by device type

Get the top autonomous systems (AS), by HTTP traffic, of the requested device type. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String deviceType = "deviceType_example"; // String | Device type.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASesByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASesByDeviceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceType** | **String**| Device type. | [enum: DESKTOP, MOBILE, OTHER]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopASesByHTTPProtocol"></a>
# **radarGetHttpTopASesByHTTPProtocol**
> InlineResponse20071 radarGetHttpTopASesByHTTPProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get top autonomous systems by HTTP protocol

Get the top autonomous systems (AS), by HTTP traffic, of the requested HTTP protocol. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String httpProtocol = "httpProtocol_example"; // String | HTTP Protocol.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASesByHTTPProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASesByHTTPProtocol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **httpProtocol** | **String**| HTTP Protocol. | [enum: HTTP, HTTPS]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopASesByHTTPVersion"></a>
# **radarGetHttpTopASesByHTTPVersion**
> InlineResponse20071 radarGetHttpTopASesByHTTPVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get top autonomous systems by HTTP version

Get the top autonomous systems (AS), by HTTP traffic, of the requested HTTP protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String httpVersion = "httpVersion_example"; // String | HTTP version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASesByHTTPVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASesByHTTPVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **httpVersion** | **String**| HTTP version. | [enum: HTTPv1, HTTPv2, HTTPv3]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopASesByIpVersion"></a>
# **radarGetHttpTopASesByIpVersion**
> InlineResponse20071 radarGetHttpTopASesByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get top autonomous systems by IP version

Get the top autonomous systems, by HTTP traffic, of the requested IP protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String ipVersion = "ipVersion_example"; // String | IP version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASesByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASesByIpVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipVersion** | **String**| IP version. | [enum: IPv4, IPv6]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopASesByOS"></a>
# **radarGetHttpTopASesByOS**
> InlineResponse20071 radarGetHttpTopASesByOS(os, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format)

Get top autonomous systems by operating system

Get the top autonomous systems, by HTTP traffic, of the requested operating systems. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String os = "os_example"; // String | IP version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASesByOS(os, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASesByOS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **os** | **String**| IP version. | [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopASesByTLSVersion"></a>
# **radarGetHttpTopASesByTLSVersion**
> InlineResponse20071 radarGetHttpTopASesByTLSVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get top autonomous systems by TLS version

Get the top autonomous systems (AS), by HTTP traffic, of the requested TLS protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String tlsVersion = "tlsVersion_example"; // String | TLS version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetHttpTopASesByTLSVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopASesByTLSVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tlsVersion** | **String**| TLS version. | [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopBrowserFamilies"></a>
# **radarGetHttpTopBrowserFamilies**
> InlineResponse20092 radarGetHttpTopBrowserFamilies(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top user agents aggregated in families by HTTP requests

Get the top user agents aggregated in families by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20092 result = apiInstance.radarGetHttpTopBrowserFamilies(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopBrowserFamilies");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20092**](InlineResponse20092.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopBrowsers"></a>
# **radarGetHttpTopBrowsers**
> InlineResponse20092 radarGetHttpTopBrowsers(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top user agents by HTTP requests

Get the top user agents by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20092 result = apiInstance.radarGetHttpTopBrowsers(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopBrowsers");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20092**](InlineResponse20092.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocations"></a>
# **radarGetHttpTopLocations**
> InlineResponse20046 radarGetHttpTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top autonomous systems by HTTP requests

Get the top locations by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocations");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocationsByBotClass"></a>
# **radarGetHttpTopLocationsByBotClass**
> InlineResponse20046 radarGetHttpTopLocationsByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top locations by bot class

Get the top locations, by HTTP traffic, of the requested bot class. These two categories use Cloudflare&#x27;s bot score - refer to [Bot scores])https://developers.cloudflare.com/bots/concepts/bot-score). Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String botClass = "botClass_example"; // String | Bot class.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocationsByBotClass(botClass, limit, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByBotClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botClass** | **String**| Bot class. | [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocationsByDeviceType"></a>
# **radarGetHttpTopLocationsByDeviceType**
> InlineResponse20046 radarGetHttpTopLocationsByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get top locations by device type

Get the top locations, by HTTP traffic, of the requested device type. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String deviceType = "deviceType_example"; // String | Device type.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocationsByDeviceType(deviceType, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByDeviceType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceType** | **String**| Device type. | [enum: DESKTOP, MOBILE, OTHER]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocationsByHTTPProtocol"></a>
# **radarGetHttpTopLocationsByHTTPProtocol**
> InlineResponse20046 radarGetHttpTopLocationsByHTTPProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get top locations by HTTP protocol

Get the top locations, by HTTP traffic, of the requested HTTP protocol. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String httpProtocol = "httpProtocol_example"; // String | HTTP Protocol.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocationsByHTTPProtocol(httpProtocol, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByHTTPProtocol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **httpProtocol** | **String**| HTTP Protocol. | [enum: HTTP, HTTPS]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocationsByHTTPVersion"></a>
# **radarGetHttpTopLocationsByHTTPVersion**
> InlineResponse20046 radarGetHttpTopLocationsByHTTPVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get top locations by HTTP version

Get the top locations, by HTTP traffic, of the requested HTTP protocol. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String httpVersion = "httpVersion_example"; // String | HTTP version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocationsByHTTPVersion(httpVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByHTTPVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **httpVersion** | **String**| HTTP version. | [enum: HTTPv1, HTTPv2, HTTPv3]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocationsByIpVersion"></a>
# **radarGetHttpTopLocationsByIpVersion**
> InlineResponse20046 radarGetHttpTopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get top locations by IP version

Get the top locations, by HTTP traffic, of the requested IP protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String ipVersion = "ipVersion_example"; // String | IP version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocationsByIpVersion(ipVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByIpVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipVersion** | **String**| IP version. | [enum: IPv4, IPv6]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocationsByOS"></a>
# **radarGetHttpTopLocationsByOS**
> InlineResponse20046 radarGetHttpTopLocationsByOS(os, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format)

Get top locations by operating system

Get the top locations, by HTTP traffic, of the requested operating systems. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String os = "os_example"; // String | IP version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocationsByOS(os, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByOS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **os** | **String**| IP version. | [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetHttpTopLocationsByTLSVersion"></a>
# **radarGetHttpTopLocationsByTLSVersion**
> InlineResponse20046 radarGetHttpTopLocationsByTLSVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get top locations by TLS version

Get the top locations, by HTTP traffic, of the requested TLS protocol version. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String tlsVersion = "tlsVersion_example"; // String | TLS version.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetHttpTopLocationsByTLSVersion(tlsVersion, limit, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetHttpTopLocationsByTLSVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tlsVersion** | **String**| TLS version. | [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSummaryBotClass"></a>
# **radarGetSummaryBotClass**
> InlineResponse20077 radarGetSummaryBotClass(name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get a summary of bot classes

Percentage distribution of traffic classified as automated or human.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20077 result = apiInstance.radarGetSummaryBotClass(name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetSummaryBotClass");
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
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20077**](InlineResponse20077.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSummaryDeviceType"></a>
# **radarGetSummaryDeviceType**
> InlineResponse20078 radarGetSummaryDeviceType(name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get a summary of device types

Percentage distribution of traffic per device type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20078 result = apiInstance.radarGetSummaryDeviceType(name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetSummaryDeviceType");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20078**](InlineResponse20078.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSummaryHttpProtocol"></a>
# **radarGetSummaryHttpProtocol**
> InlineResponse20079 radarGetSummaryHttpProtocol(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format)

Get a summary of HTTP protocols

Percentage distribution of traffic per HTTP protocol.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20079 result = apiInstance.radarGetSummaryHttpProtocol(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetSummaryHttpProtocol");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20079**](InlineResponse20079.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSummaryHttpVersion"></a>
# **radarGetSummaryHttpVersion**
> InlineResponse20080 radarGetSummaryHttpVersion(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get a summary of HTTP versions

Percentage distribution of traffic per HTTP protocol version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20080 result = apiInstance.radarGetSummaryHttpVersion(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetSummaryHttpVersion");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20080**](InlineResponse20080.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSummaryIpVersion"></a>
# **radarGetSummaryIpVersion**
> InlineResponse20081 radarGetSummaryIpVersion(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get a summary of IP versions

Percentage distribution of traffic per IP protocol version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20081 result = apiInstance.radarGetSummaryIpVersion(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetSummaryIpVersion");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20081**](InlineResponse20081.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSummaryOS"></a>
# **radarGetSummaryOS**
> InlineResponse20082 radarGetSummaryOS(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format)

Get a summary of operating systems

Percentage distribution of traffic per operating system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20082 result = apiInstance.radarGetSummaryOS(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetSummaryOS");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20082**](InlineResponse20082.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetSummaryTLSVersion"></a>
# **radarGetSummaryTLSVersion**
> InlineResponse20083 radarGetSummaryTLSVersion(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get a summary of TLS versions

Percentage distribution of traffic per TLS protocol version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20083 result = apiInstance.radarGetSummaryTLSVersion(name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetSummaryTLSVersion");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20083**](InlineResponse20083.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesBotClass"></a>
# **radarGetTimeseriesBotClass**
> InlineResponse20084 radarGetTimeseriesBotClass(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get time series of bot classes

Percentage distribution of traffic classified as automated or human over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20084 result = apiInstance.radarGetTimeseriesBotClass(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesBotClass");
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
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20084**](InlineResponse20084.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesBrowserFamilies"></a>
# **radarGetTimeseriesBrowserFamilies**
> InlineResponse20085 radarGetTimeseriesBrowserFamilies(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get time series of user agents aggregated in families

Percentage distribution of traffic of the top user agents aggregated in families in the selected time range, over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20085 result = apiInstance.radarGetTimeseriesBrowserFamilies(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesBrowserFamilies");
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
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20085**](InlineResponse20085.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesBrowsers"></a>
# **radarGetTimeseriesBrowsers**
> InlineResponse20085 radarGetTimeseriesBrowsers(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, limitPerGroup, format)

Get time series of user agents

Percentage distribution of traffic of the top user agents in the selected time range, over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
Integer limitPerGroup = 56; // Integer | Limit the number of objects (eg browsers) to the top items over the time range.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20085 result = apiInstance.radarGetTimeseriesBrowsers(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, deviceType, httpProtocol, httpVersion, ipVersion, os, tlsVersion, limitPerGroup, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesBrowsers");
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
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **limitPerGroup** | **Integer**| Limit the number of objects (eg browsers) to the top items over the time range. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20085**](InlineResponse20085.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesDeviceType"></a>
# **radarGetTimeseriesDeviceType**
> InlineResponse20086 radarGetTimeseriesDeviceType(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format)

Get time series of device types

Percentage distribution of traffic per device type over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20086 result = apiInstance.radarGetTimeseriesDeviceType(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, httpProtocol, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesDeviceType");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20086**](InlineResponse20086.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesHttpProtocol"></a>
# **radarGetTimeseriesHttpProtocol**
> InlineResponse20087 radarGetTimeseriesHttpProtocol(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format)

Get time series of HTTP protocols

Percentage distribution of traffic per HTTP protocol over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20087 result = apiInstance.radarGetTimeseriesHttpProtocol(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpVersion, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesHttpProtocol");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20087**](InlineResponse20087.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesHttpVersion"></a>
# **radarGetTimeseriesHttpVersion**
> InlineResponse20088 radarGetTimeseriesHttpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format)

Get time series of HTTP versions

Percentage distribution of traffic per HTTP protocol version over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20088 result = apiInstance.radarGetTimeseriesHttpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, ipVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesHttpVersion");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20088**](InlineResponse20088.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesIpVersion"></a>
# **radarGetTimeseriesIpVersion**
> InlineResponse20089 radarGetTimeseriesIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format)

Get time series of IP versions

Percentage distribution of traffic per IP protocol version over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20089 result = apiInstance.radarGetTimeseriesIpVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, os, tlsVersion, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesIpVersion");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20089**](InlineResponse20089.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesOS"></a>
# **radarGetTimeseriesOS**
> InlineResponse20090 radarGetTimeseriesOS(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, limitPerGroup, format)

Get time series of operating systems

Percentage distribution of traffic of the top operating systems in the selected time range, over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> tlsVersion = Arrays.asList("tlsVersion_example"); // List<String> | Filter for tls version.
Integer limitPerGroup = 56; // Integer | Limit the number of objects (eg browsers) to the top items over the time range.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20090 result = apiInstance.radarGetTimeseriesOS(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, tlsVersion, limitPerGroup, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesOS");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **tlsVersion** | [**List&lt;String&gt;**](String.md)| Filter for tls version. | [optional] [enum: TLSv1_0, TLSv1_1, TLSv1_2, TLSv1_3, TLSvQUIC]
 **limitPerGroup** | **Integer**| Limit the number of objects (eg browsers) to the top items over the time range. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20090**](InlineResponse20090.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetTimeseriesTLSVersion"></a>
# **radarGetTimeseriesTLSVersion**
> InlineResponse20091 radarGetTimeseriesTLSVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format)

Get time series of TLS versions

Percentage distribution of traffic per TLS protocol version over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarHttpApi;

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


RadarHttpApi apiInstance = new RadarHttpApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> botClass = Arrays.asList("botClass_example"); // List<String> | Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/).
List<String> deviceType = Arrays.asList("deviceType_example"); // List<String> | Filter for device type.
List<String> httpProtocol = Arrays.asList("httpProtocol_example"); // List<String> | Filter for http protocol.
List<String> httpVersion = Arrays.asList("httpVersion_example"); // List<String> | Filter for http version.
List<String> ipVersion = Arrays.asList("ipVersion_example"); // List<String> | Filter for ip version.
List<String> os = Arrays.asList("os_example"); // List<String> | Filter for os name.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20091 result = apiInstance.radarGetTimeseriesTLSVersion(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, botClass, deviceType, httpProtocol, httpVersion, ipVersion, os, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarHttpApi#radarGetTimeseriesTLSVersion");
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
 **botClass** | [**List&lt;String&gt;**](String.md)| Filter for bot class. Refer to [Bot classes](https://developers.cloudflare.com/radar/concepts/bot-classes/). | [optional] [enum: LIKELY_AUTOMATED, LIKELY_HUMAN]
 **deviceType** | [**List&lt;String&gt;**](String.md)| Filter for device type. | [optional] [enum: DESKTOP, MOBILE, OTHER]
 **httpProtocol** | [**List&lt;String&gt;**](String.md)| Filter for http protocol. | [optional] [enum: HTTP, HTTPS]
 **httpVersion** | [**List&lt;String&gt;**](String.md)| Filter for http version. | [optional] [enum: HTTPv1, HTTPv2, HTTPv3]
 **ipVersion** | [**List&lt;String&gt;**](String.md)| Filter for ip version. | [optional] [enum: IPv4, IPv6]
 **os** | [**List&lt;String&gt;**](String.md)| Filter for os name. | [optional] [enum: WINDOWS, MACOSX, ANDROID, CHROMEOS, LINUX, SMART_TV]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20091**](InlineResponse20091.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

