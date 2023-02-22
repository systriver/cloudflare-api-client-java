# RadarEmailApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetEmailSecurityArcSummary**](RadarEmailApi.md#radarGetEmailSecurityArcSummary) | **GET** /radar/email/summary/arc | Get a summary of ARC validations
[**radarGetEmailSecurityArcTimeseriesGroup**](RadarEmailApi.md#radarGetEmailSecurityArcTimeseriesGroup) | **GET** /radar/email/timeseries/arc | Get a time series of ARC validations
[**radarGetEmailSecurityDkimSummary**](RadarEmailApi.md#radarGetEmailSecurityDkimSummary) | **GET** /radar/email/summary/dkim | Get a summary of DKIM validations
[**radarGetEmailSecurityDkimTimeseriesGroup**](RadarEmailApi.md#radarGetEmailSecurityDkimTimeseriesGroup) | **GET** /radar/email/timeseries/dkim | Get a time series of DKIM validations validations
[**radarGetEmailSecurityDmarcSummary**](RadarEmailApi.md#radarGetEmailSecurityDmarcSummary) | **GET** /radar/email/summary/dmarc | Get a summary of DMARC validations
[**radarGetEmailSecurityDmarcTimeseriesGroup**](RadarEmailApi.md#radarGetEmailSecurityDmarcTimeseriesGroup) | **GET** /radar/email/timeseries/dmarc | Get a time series of DMARC validations
[**radarGetEmailSecurityMaliciousSummary**](RadarEmailApi.md#radarGetEmailSecurityMaliciousSummary) | **GET** /radar/email/summary/malicious | Get a summary of MALICIOUS validations
[**radarGetEmailSecurityMaliciousTimeseriesGroup**](RadarEmailApi.md#radarGetEmailSecurityMaliciousTimeseriesGroup) | **GET** /radar/email/timeseries/malicious | Get a time series of MALICIOUS validations
[**radarGetEmailSecuritySpamSummary**](RadarEmailApi.md#radarGetEmailSecuritySpamSummary) | **GET** /radar/email/summary/spam | Get a summary of SPAM validations
[**radarGetEmailSecuritySpamTimeseriesGroup**](RadarEmailApi.md#radarGetEmailSecuritySpamTimeseriesGroup) | **GET** /radar/email/timeseries/spam | Get a time series of SPAM validations
[**radarGetEmailSecuritySpfSummary**](RadarEmailApi.md#radarGetEmailSecuritySpfSummary) | **GET** /radar/email/summary/spf | Get a summary of SPF validations
[**radarGetEmailSecuritySpfTimeseriesGroup**](RadarEmailApi.md#radarGetEmailSecuritySpfTimeseriesGroup) | **GET** /radar/email/timeseries/spf | Get a time series of SPF validations
[**radarGetEmailSecurityThreatCategorySummary**](RadarEmailApi.md#radarGetEmailSecurityThreatCategorySummary) | **GET** /radar/email/summary/threat_category | Get a summary of Threat Categories
[**radarGetEmailSecurityThreatCategoryTimeseriesGroup**](RadarEmailApi.md#radarGetEmailSecurityThreatCategoryTimeseriesGroup) | **GET** /radar/email/timeseries/threat_category | Get a time series of Threat Categories
[**radarGetEmailSecurityTopASes**](RadarEmailApi.md#radarGetEmailSecurityTopASes) | **GET** /radar/email/top/ases | Get top autonomous systems by HTTP requests
[**radarGetEmailSecurityTopASesByArc**](RadarEmailApi.md#radarGetEmailSecurityTopASesByArc) | **GET** /radar/email/top/ases/arc/{arc} | Get top autonomous systems by ARC validations
[**radarGetEmailSecurityTopASesByDkim**](RadarEmailApi.md#radarGetEmailSecurityTopASesByDkim) | **GET** /radar/email/top/ases/dkim/{dkim} | Get top autonomous systems by DKIM validations
[**radarGetEmailSecurityTopASesByDmarc**](RadarEmailApi.md#radarGetEmailSecurityTopASesByDmarc) | **GET** /radar/email/top/ases/dmarc/{dmarc} | Get top autonomous systems by DMARC validations
[**radarGetEmailSecurityTopASesByMalicious**](RadarEmailApi.md#radarGetEmailSecurityTopASesByMalicious) | **GET** /radar/email/top/ases/malicious/{malicious} | Get top autonomous systems by Malicious validations
[**radarGetEmailSecurityTopASesBySpam**](RadarEmailApi.md#radarGetEmailSecurityTopASesBySpam) | **GET** /radar/email/top/ases/spam/{spam} | Get top autonomous systems by Spam validations
[**radarGetEmailSecurityTopASesBySpf**](RadarEmailApi.md#radarGetEmailSecurityTopASesBySpf) | **GET** /radar/email/top/ases/spf/{spf} | Get top autonomous systems by SPF validations
[**radarGetEmailSecurityTopLocations**](RadarEmailApi.md#radarGetEmailSecurityTopLocations) | **GET** /radar/email/top/locations | Get top autonomous systems by HTTP requests
[**radarGetEmailSecurityTopLocationsByArc**](RadarEmailApi.md#radarGetEmailSecurityTopLocationsByArc) | **GET** /radar/email/top/locations/arc/{arc} | Get top locations by ARC validations
[**radarGetEmailSecurityTopLocationsByDkim**](RadarEmailApi.md#radarGetEmailSecurityTopLocationsByDkim) | **GET** /radar/email/top/locations/dkim/{dkim} | Get top locations by DKIM validations
[**radarGetEmailSecurityTopLocationsByDmarc**](RadarEmailApi.md#radarGetEmailSecurityTopLocationsByDmarc) | **GET** /radar/email/top/locations/dmarc/{dmarc} | Get top locations by DMARC validations
[**radarGetEmailSecurityTopLocationsByMalicious**](RadarEmailApi.md#radarGetEmailSecurityTopLocationsByMalicious) | **GET** /radar/email/top/locations/malicious/{malicious} | Get top locations by Malicious validations
[**radarGetEmailSecurityTopLocationsBySpam**](RadarEmailApi.md#radarGetEmailSecurityTopLocationsBySpam) | **GET** /radar/email/top/locations/spam/{spam} | Get top locations by Spam validations
[**radarGetEmailSecurityTopLocationsBySpf**](RadarEmailApi.md#radarGetEmailSecurityTopLocationsBySpf) | **GET** /radar/email/top/locations/spf/{spf} | Get top locations by SPF validations

<a name="radarGetEmailSecurityArcSummary"></a>
# **radarGetEmailSecurityArcSummary**
> InlineResponse20063 radarGetEmailSecurityArcSummary(name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format)

Get a summary of ARC validations

Percentage distribution of emails classified per Arc validation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20063 result = apiInstance.radarGetEmailSecurityArcSummary(name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityArcSummary");
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
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityArcTimeseriesGroup"></a>
# **radarGetEmailSecurityArcTimeseriesGroup**
> InlineResponse20067 radarGetEmailSecurityArcTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format)

Get a time series of ARC validations

Percentage distribution of emails classified per Arc validation over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20067 result = apiInstance.radarGetEmailSecurityArcTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityArcTimeseriesGroup");
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
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityDkimSummary"></a>
# **radarGetEmailSecurityDkimSummary**
> InlineResponse20063 radarGetEmailSecurityDkimSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format)

Get a summary of DKIM validations

Percentage distribution of emails classified per DKIM validation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20063 result = apiInstance.radarGetEmailSecurityDkimSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityDkimSummary");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityDkimTimeseriesGroup"></a>
# **radarGetEmailSecurityDkimTimeseriesGroup**
> InlineResponse20067 radarGetEmailSecurityDkimTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format)

Get a time series of DKIM validations validations

Percentage distribution of emails classified per DKIM validation over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20067 result = apiInstance.radarGetEmailSecurityDkimTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityDkimTimeseriesGroup");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityDmarcSummary"></a>
# **radarGetEmailSecurityDmarcSummary**
> InlineResponse20063 radarGetEmailSecurityDmarcSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format)

Get a summary of DMARC validations

Percentage distribution of emails classified per DMARC validation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20063 result = apiInstance.radarGetEmailSecurityDmarcSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityDmarcSummary");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityDmarcTimeseriesGroup"></a>
# **radarGetEmailSecurityDmarcTimeseriesGroup**
> InlineResponse20067 radarGetEmailSecurityDmarcTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format)

Get a time series of DMARC validations

Percentage distribution of emails classified per DMARC validation over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20067 result = apiInstance.radarGetEmailSecurityDmarcTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityDmarcTimeseriesGroup");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityMaliciousSummary"></a>
# **radarGetEmailSecurityMaliciousSummary**
> InlineResponse20064 radarGetEmailSecurityMaliciousSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get a summary of MALICIOUS validations

Percentage distribution of emails classified as MALICIOUS.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20064 result = apiInstance.radarGetEmailSecurityMaliciousSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityMaliciousSummary");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20064**](InlineResponse20064.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityMaliciousTimeseriesGroup"></a>
# **radarGetEmailSecurityMaliciousTimeseriesGroup**
> InlineResponse20068 radarGetEmailSecurityMaliciousTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get a time series of MALICIOUS validations

Percentage distribution of emails classified as MALICIOUS over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20068 result = apiInstance.radarGetEmailSecurityMaliciousTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityMaliciousTimeseriesGroup");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20068**](InlineResponse20068.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecuritySpamSummary"></a>
# **radarGetEmailSecuritySpamSummary**
> InlineResponse20065 radarGetEmailSecuritySpamSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get a summary of SPAM validations

Percentage distribution of emails classified as SPAM.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20065 result = apiInstance.radarGetEmailSecuritySpamSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecuritySpamSummary");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20065**](InlineResponse20065.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecuritySpamTimeseriesGroup"></a>
# **radarGetEmailSecuritySpamTimeseriesGroup**
> InlineResponse20069 radarGetEmailSecuritySpamTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get a time series of SPAM validations

Percentage distribution of emails classified as SPAM over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20069 result = apiInstance.radarGetEmailSecuritySpamTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecuritySpamTimeseriesGroup");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20069**](InlineResponse20069.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecuritySpfSummary"></a>
# **radarGetEmailSecuritySpfSummary**
> InlineResponse20063 radarGetEmailSecuritySpfSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format)

Get a summary of SPF validations

Percentage distribution of emails classified per SPF validation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20063 result = apiInstance.radarGetEmailSecuritySpfSummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecuritySpfSummary");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecuritySpfTimeseriesGroup"></a>
# **radarGetEmailSecuritySpfTimeseriesGroup**
> InlineResponse20067 radarGetEmailSecuritySpfTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format)

Get a time series of SPF validations

Percentage distribution of emails classified per SPF validation over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20067 result = apiInstance.radarGetEmailSecuritySpfTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecuritySpfTimeseriesGroup");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityThreatCategorySummary"></a>
# **radarGetEmailSecurityThreatCategorySummary**
> InlineResponse20066 radarGetEmailSecurityThreatCategorySummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get a summary of Threat Categories

Percentage distribution of emails classified in Threat Categories.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20066 result = apiInstance.radarGetEmailSecurityThreatCategorySummary(name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityThreatCategorySummary");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20066**](InlineResponse20066.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityThreatCategoryTimeseriesGroup"></a>
# **radarGetEmailSecurityThreatCategoryTimeseriesGroup**
> InlineResponse20070 radarGetEmailSecurityThreatCategoryTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get a time series of Threat Categories

Percentage distribution of emails classified in Threat Categories over time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String aggInterval = "aggInterval_example"; // String | Aggregation interval results should be returned in (for example, in 15 minutes or 1 hour intervals). Refer to [Aggregation intervals](https://developers.cloudflare.com/radar/concepts/aggregation-intervals/).
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20070 result = apiInstance.radarGetEmailSecurityThreatCategoryTimeseriesGroup(aggInterval, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityThreatCategoryTimeseriesGroup");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20070**](InlineResponse20070.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopASes"></a>
# **radarGetEmailSecurityTopASes**
> InlineResponse20071 radarGetEmailSecurityTopASes(limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get top autonomous systems by HTTP requests

Get the top autonomous systems (AS) by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetEmailSecurityTopASes(limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopASes");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopASesByArc"></a>
# **radarGetEmailSecurityTopASesByArc**
> InlineResponse20071 radarGetEmailSecurityTopASesByArc(arc, limit, name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format)

Get top autonomous systems by ARC validations

Get the top autonomous systems (AS), by emails classified, of ARC validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String arc = "arc_example"; // String | ARC.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetEmailSecurityTopASesByArc(arc, limit, name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopASesByArc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **arc** | **String**| ARC. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopASesByDkim"></a>
# **radarGetEmailSecurityTopASesByDkim**
> InlineResponse20071 radarGetEmailSecurityTopASesByDkim(dkim, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format)

Get top autonomous systems by DKIM validations

Get the top autonomous systems (AS), by emails classified, of DKIM validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String dkim = "dkim_example"; // String | DKIM.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetEmailSecurityTopASesByDkim(dkim, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopASesByDkim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dkim** | **String**| DKIM. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopASesByDmarc"></a>
# **radarGetEmailSecurityTopASesByDmarc**
> InlineResponse20071 radarGetEmailSecurityTopASesByDmarc(dmarc, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format)

Get top autonomous systems by DMARC validations

Get the top autonomous systems (AS), by emails classified, of DMARC validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String dmarc = "dmarc_example"; // String | DMARC.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetEmailSecurityTopASesByDmarc(dmarc, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopASesByDmarc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dmarc** | **String**| DMARC. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopASesByMalicious"></a>
# **radarGetEmailSecurityTopASesByMalicious**
> InlineResponse20071 radarGetEmailSecurityTopASesByMalicious(malicious, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get top autonomous systems by Malicious validations

Get the top autonomous systems (AS), by emails classified, of Malicious validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String malicious = "malicious_example"; // String | Malicious.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetEmailSecurityTopASesByMalicious(malicious, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopASesByMalicious");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **malicious** | **String**| Malicious. | [enum: MALICIOUS, NOT_MALICIOUS]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopASesBySpam"></a>
# **radarGetEmailSecurityTopASesBySpam**
> InlineResponse20071 radarGetEmailSecurityTopASesBySpam(spam, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get top autonomous systems by Spam validations

Get the top autonomous systems (AS), by emails classified, of Spam validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String spam = "spam_example"; // String | Spam.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetEmailSecurityTopASesBySpam(spam, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopASesBySpam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spam** | **String**| Spam. | [enum: SPAM, NOT_SPAM]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopASesBySpf"></a>
# **radarGetEmailSecurityTopASesBySpf**
> InlineResponse20071 radarGetEmailSecurityTopASesBySpf(spf, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format)

Get top autonomous systems by SPF validations

Get the top autonomous systems (AS), by emails classified, of SPF validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String spf = "spf_example"; // String | SPF.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20071 result = apiInstance.radarGetEmailSecurityTopASesBySpf(spf, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopASesBySpf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spf** | **String**| SPF. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopLocations"></a>
# **radarGetEmailSecurityTopLocations**
> InlineResponse20046 radarGetEmailSecurityTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get top autonomous systems by HTTP requests

Get the top locations by HTTP traffic. Values are a percentage out of the total traffic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetEmailSecurityTopLocations(limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopLocations");
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
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopLocationsByArc"></a>
# **radarGetEmailSecurityTopLocationsByArc**
> InlineResponse20046 radarGetEmailSecurityTopLocationsByArc(arc, limit, name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format)

Get top locations by ARC validations

Get the locations, by emails classified, of ARC validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String arc = "arc_example"; // String | ARC.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetEmailSecurityTopLocationsByArc(arc, limit, name, dateRange, dateStart, dateEnd, asn, location, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopLocationsByArc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **arc** | **String**| ARC. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopLocationsByDkim"></a>
# **radarGetEmailSecurityTopLocationsByDkim**
> InlineResponse20046 radarGetEmailSecurityTopLocationsByDkim(dkim, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format)

Get top locations by DKIM validations

Get the locations, by emails classified, of DKIM validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String dkim = "dkim_example"; // String | DKIM.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetEmailSecurityTopLocationsByDkim(dkim, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopLocationsByDkim");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dkim** | **String**| DKIM. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopLocationsByDmarc"></a>
# **radarGetEmailSecurityTopLocationsByDmarc**
> InlineResponse20046 radarGetEmailSecurityTopLocationsByDmarc(dmarc, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format)

Get top locations by DMARC validations

Get the locations, by emails classified, of DMARC validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String dmarc = "dmarc_example"; // String | DMARC.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetEmailSecurityTopLocationsByDmarc(dmarc, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopLocationsByDmarc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dmarc** | **String**| DMARC. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopLocationsByMalicious"></a>
# **radarGetEmailSecurityTopLocationsByMalicious**
> InlineResponse20046 radarGetEmailSecurityTopLocationsByMalicious(malicious, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get top locations by Malicious validations

Get the locations, by emails classified, of Malicious validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String malicious = "malicious_example"; // String | Malicious.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetEmailSecurityTopLocationsByMalicious(malicious, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopLocationsByMalicious");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **malicious** | **String**| Malicious. | [enum: MALICIOUS, NOT_MALICIOUS]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopLocationsBySpam"></a>
# **radarGetEmailSecurityTopLocationsBySpam**
> InlineResponse20046 radarGetEmailSecurityTopLocationsBySpam(spam, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format)

Get top locations by Spam validations

Get the locations, by emails classified, of Spam validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String spam = "spam_example"; // String | Spam.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
List<String> spf = Arrays.asList("spf_example"); // List<String> | Filter for spf.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetEmailSecurityTopLocationsBySpam(spam, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, spf, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopLocationsBySpam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spam** | **String**| Spam. | [enum: SPAM, NOT_SPAM]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **spf** | [**List&lt;String&gt;**](String.md)| Filter for spf. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetEmailSecurityTopLocationsBySpf"></a>
# **radarGetEmailSecurityTopLocationsBySpf**
> InlineResponse20046 radarGetEmailSecurityTopLocationsBySpf(spf, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format)

Get top locations by SPF validations

Get the locations, by emails classified, of SPF validations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarEmailApi;

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


RadarEmailApi apiInstance = new RadarEmailApi();
String spf = "spf_example"; // String | SPF.
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
List<String> asn = Arrays.asList("asn_example"); // List<String> | Array of comma separated list of ASNs, start with `-` to exclude from results. For example, `-174, 3356` excludes results from AS174, but includes results from AS3356.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of comma separated list of locations (alpha-2 country codes). Start with `-` to exclude from results. For example, `-US,PT` excludes results from the US, but includes results from PT.
List<String> arc = Arrays.asList("arc_example"); // List<String> | Filter for arc (Authenticated Received Chain).
List<String> dkim = Arrays.asList("dkim_example"); // List<String> | Filter for dkim.
List<String> dmarc = Arrays.asList("dmarc_example"); // List<String> | Filter for dmarc.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20046 result = apiInstance.radarGetEmailSecurityTopLocationsBySpf(spf, limit, name, dateRange, dateStart, dateEnd, asn, location, arc, dkim, dmarc, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarEmailApi#radarGetEmailSecurityTopLocationsBySpf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spf** | **String**| SPF. | [enum: PASS, NONE, FAIL]
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **asn** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of ASNs, start with &#x60;-&#x60; to exclude from results. For example, &#x60;-174, 3356&#x60; excludes results from AS174, but includes results from AS3356. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of locations (alpha-2 country codes). Start with &#x60;-&#x60; to exclude from results. For example, &#x60;-US,PT&#x60; excludes results from the US, but includes results from PT. | [optional]
 **arc** | [**List&lt;String&gt;**](String.md)| Filter for arc (Authenticated Received Chain). | [optional] [enum: PASS, NONE, FAIL]
 **dkim** | [**List&lt;String&gt;**](String.md)| Filter for dkim. | [optional] [enum: PASS, NONE, FAIL]
 **dmarc** | [**List&lt;String&gt;**](String.md)| Filter for dmarc. | [optional] [enum: PASS, NONE, FAIL]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

