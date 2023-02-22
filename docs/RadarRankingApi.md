# RadarRankingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetRankingDetails**](RadarRankingApi.md#radarGetRankingDetails) | **GET** /radar/ranking/domain/{domain} | Get Domains Rank details
[**radarGetRankingTimeseries**](RadarRankingApi.md#radarGetRankingTimeseries) | **GET** /radar/ranking/timeseries | Get Domains Rank time series
[**radarGetRankingTop**](RadarRankingApi.md#radarGetRankingTop) | **GET** /radar/ranking/top | Get Domains Rank top

<a name="radarGetRankingDetails"></a>
# **radarGetRankingDetails**
> InlineResponse20095 radarGetRankingDetails(domain, limit, name, date, format)

Get Domains Rank details

Gets Domains Rank details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarRankingApi;

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


RadarRankingApi apiInstance = new RadarRankingApi();
String domain = "domain_example"; // String | 
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<LocalDate> date = Arrays.asList(new LocalDate()); // List<LocalDate> | Array of dates to filter the ranking.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20095 result = apiInstance.radarGetRankingDetails(domain, limit, name, date, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarRankingApi#radarGetRankingDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **date** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Array of dates to filter the ranking. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20095**](InlineResponse20095.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetRankingTimeseries"></a>
# **radarGetRankingTimeseries**
> InlineResponse20096 radarGetRankingTimeseries(limit, name, location, domains, dateRange, dateStart, dateEnd, format)

Get Domains Rank time series

Gets Domains Rank updates change over time. Raw values are returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarRankingApi;

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


RadarRankingApi apiInstance = new RadarRankingApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of locations (alpha-2 country codes).
List<String> domains = Arrays.asList("domains_example"); // List<String> | Array of comma separated list of domains names.
List<String> dateRange = Arrays.asList("dateRange_example"); // List<String> | For example, use `7d` and `7dControl` to compare this week with the previous week. Use this parameter or set specific start and end dates (`dateStart` and `dateEnd` parameters).
List<OffsetDateTime> dateStart = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the start of a series.
List<OffsetDateTime> dateEnd = Arrays.asList(new OffsetDateTime()); // List<OffsetDateTime> | Array of datetimes to filter the end of a series.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20096 result = apiInstance.radarGetRankingTimeseries(limit, name, location, domains, dateRange, dateStart, dateEnd, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarRankingApi#radarGetRankingTimeseries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of locations (alpha-2 country codes). | [optional]
 **domains** | [**List&lt;String&gt;**](String.md)| Array of comma separated list of domains names. | [optional]
 **dateRange** | [**List&lt;String&gt;**](String.md)| For example, use &#x60;7d&#x60; and &#x60;7dControl&#x60; to compare this week with the previous week. Use this parameter or set specific start and end dates (&#x60;dateStart&#x60; and &#x60;dateEnd&#x60; parameters). | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the start of a series. | [optional]
 **dateEnd** | [**List&lt;OffsetDateTime&gt;**](OffsetDateTime.md)| Array of datetimes to filter the end of a series. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20096**](InlineResponse20096.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetRankingTop"></a>
# **radarGetRankingTop**
> InlineResponse20097 radarGetRankingTop(limit, name, location, date, format)

Get Domains Rank top

Gets Top Domains Rank globally or by country.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarRankingApi;

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


RadarRankingApi apiInstance = new RadarRankingApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
List<String> name = Arrays.asList("name_example"); // List<String> | Array of names that will be used to name the series in responses.
List<String> location = Arrays.asList("location_example"); // List<String> | Array of locations (alpha-2 country codes).
List<LocalDate> date = Arrays.asList(new LocalDate()); // List<LocalDate> | Array of dates to filter the ranking.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20097 result = apiInstance.radarGetRankingTop(limit, name, location, date, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarRankingApi#radarGetRankingTop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **name** | [**List&lt;String&gt;**](String.md)| Array of names that will be used to name the series in responses. | [optional]
 **location** | [**List&lt;String&gt;**](String.md)| Array of locations (alpha-2 country codes). | [optional]
 **date** | [**List&lt;LocalDate&gt;**](LocalDate.md)| Array of dates to filter the ranking. | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20097**](InlineResponse20097.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

