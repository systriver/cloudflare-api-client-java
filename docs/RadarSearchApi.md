# RadarSearchApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetSearchGlobal**](RadarSearchApi.md#radarGetSearchGlobal) | **GET** /radar/search/global | Search for locations, autonomous systems (AS) and reports.

<a name="radarGetSearchGlobal"></a>
# **radarGetSearchGlobal**
> InlineResponse20098 radarGetSearchGlobal(query, limit, limitPerGroup, include, exclude, format)

Search for locations, autonomous systems (AS) and reports.

Lets you search for locations, autonomous systems (AS) and reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarSearchApi;

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


RadarSearchApi apiInstance = new RadarSearchApi();
String query = "query_example"; // String | Search for locations, AS and reports.
Integer limit = 5; // Integer | Limit the number of objects in the response.
BigDecimal limitPerGroup = new BigDecimal(); // BigDecimal | Limit the number of objects per search category.
List<String> include = Arrays.asList("include_example"); // List<String> | Search types to be included in results.
List<String> exclude = Arrays.asList("exclude_example"); // List<String> | Search types to be excluded from results.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20098 result = apiInstance.radarGetSearchGlobal(query, limit, limitPerGroup, include, exclude, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarSearchApi#radarGetSearchGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| Search for locations, AS and reports. |
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **limitPerGroup** | **BigDecimal**| Limit the number of objects per search category. | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Search types to be included in results. | [optional] [enum: SPECIAL_EVENTS, NOTEBOOKS, LOCATIONS, ASNS]
 **exclude** | [**List&lt;String&gt;**](String.md)| Search types to be excluded from results. | [optional] [enum: SPECIAL_EVENTS, NOTEBOOKS, LOCATIONS, ASNS]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20098**](InlineResponse20098.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

