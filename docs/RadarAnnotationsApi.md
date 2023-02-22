# RadarAnnotationsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetAnnotationsOutages**](RadarAnnotationsApi.md#radarGetAnnotationsOutages) | **GET** /radar/annotations/outages | Get outages annotations
[**radarGetAnnotationsOutagesTop**](RadarAnnotationsApi.md#radarGetAnnotationsOutagesTop) | **GET** /radar/annotations/outages/locations | Get top outages annotations

<a name="radarGetAnnotationsOutages"></a>
# **radarGetAnnotationsOutages**
> InlineResponse20031 radarGetAnnotationsOutages(limit, offset, dateRange, dateStart, dateEnd, format)

Get outages annotations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAnnotationsApi;

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


RadarAnnotationsApi apiInstance = new RadarAnnotationsApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
Integer offset = 0; // Integer | Number of objects to skip before grabbing results.
String dateRange = "dateRange_example"; // String | Shorthand date ranges for the last X days - use when you don't need specific start and end dates.
OffsetDateTime dateStart = new OffsetDateTime(); // OffsetDateTime | Start of the date range (inclusive).
OffsetDateTime dateEnd = new OffsetDateTime(); // OffsetDateTime | End of the date range (inclusive).
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20031 result = apiInstance.radarGetAnnotationsOutages(limit, offset, dateRange, dateStart, dateEnd, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAnnotationsApi#radarGetAnnotationsOutages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **offset** | **Integer**| Number of objects to skip before grabbing results. | [optional] [default to 0]
 **dateRange** | **String**| Shorthand date ranges for the last X days - use when you don&#x27;t need specific start and end dates. | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | **OffsetDateTime**| Start of the date range (inclusive). | [optional]
 **dateEnd** | **OffsetDateTime**| End of the date range (inclusive). | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetAnnotationsOutagesTop"></a>
# **radarGetAnnotationsOutagesTop**
> InlineResponse20032 radarGetAnnotationsOutagesTop(limit, dateRange, dateStart, dateEnd, format)

Get top outages annotations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarAnnotationsApi;

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


RadarAnnotationsApi apiInstance = new RadarAnnotationsApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
String dateRange = "dateRange_example"; // String | Shorthand date ranges for the last X days - use when you don't need specific start and end dates.
OffsetDateTime dateStart = new OffsetDateTime(); // OffsetDateTime | Start of the date range (inclusive).
OffsetDateTime dateEnd = new OffsetDateTime(); // OffsetDateTime | End of the date range (inclusive).
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20032 result = apiInstance.radarGetAnnotationsOutagesTop(limit, dateRange, dateStart, dateEnd, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarAnnotationsApi#radarGetAnnotationsOutagesTop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **dateRange** | **String**| Shorthand date ranges for the last X days - use when you don&#x27;t need specific start and end dates. | [optional] [enum: 1d, 7d, 14d, 28d, 12w, 24w, 52w, 1dControl, 7dControl, 14dControl, 28dControl, 12wControl, 24wControl]
 **dateStart** | **OffsetDateTime**| Start of the date range (inclusive). | [optional]
 **dateEnd** | **OffsetDateTime**| End of the date range (inclusive). | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

