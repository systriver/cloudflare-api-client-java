# RadarDatasetsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**radarGetDatasetList**](RadarDatasetsApi.md#radarGetDatasetList) | **GET** /radar/datasets | Get Datasets
[**radarGetDatasetStream**](RadarDatasetsApi.md#radarGetDatasetStream) | **GET** /radar/datasets/{alias} | Get Dataset csv Stream
[**radarPostDatasetDownload**](RadarDatasetsApi.md#radarPostDatasetDownload) | **POST** /radar/datasets/download | Get Dataset download url

<a name="radarGetDatasetList"></a>
# **radarGetDatasetList**
> InlineResponse20059 radarGetDatasetList(limit, offset, datasetType, format)

Get Datasets

Get a list of datasets.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarDatasetsApi;

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


RadarDatasetsApi apiInstance = new RadarDatasetsApi();
Integer limit = 5; // Integer | Limit the number of objects in the response.
Integer offset = 0; // Integer | Number of objects to skip before grabbing results.
String datasetType = "datasetType_example"; // String | Dataset type.
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20059 result = apiInstance.radarGetDatasetList(limit, offset, datasetType, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarDatasetsApi#radarGetDatasetList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit the number of objects in the response. | [optional] [default to 5]
 **offset** | **Integer**| Number of objects to skip before grabbing results. | [optional] [default to 0]
 **datasetType** | **String**| Dataset type. | [optional] [enum: RANKING_BUCKET, REPORT]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarGetDatasetStream"></a>
# **radarGetDatasetStream**
> Object radarGetDatasetStream(alias, date)

Get Dataset csv Stream

Get the csv content of a given dataset by alias or id. When getting the content by alias the latest dataset is returned, optionally filtered by the latest available at a given date.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarDatasetsApi;

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


RadarDatasetsApi apiInstance = new RadarDatasetsApi();
String alias = "alias_example"; // String | Dataset alias or id
LocalDate date = new LocalDate(); // LocalDate | Filter dataset alias by date
try {
    Object result = apiInstance.radarGetDatasetStream(alias, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarDatasetsApi#radarGetDatasetStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**| Dataset alias or id |
 **date** | **LocalDate**| Filter dataset alias by date | [optional]

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="radarPostDatasetDownload"></a>
# **radarPostDatasetDownload**
> InlineResponse20060 radarPostDatasetDownload(body, format)

Get Dataset download url

Get a url to download a single dataset.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RadarDatasetsApi;

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


RadarDatasetsApi apiInstance = new RadarDatasetsApi();
DatasetsDownloadBody body = new DatasetsDownloadBody(); // DatasetsDownloadBody | 
String format = "format_example"; // String | Format results are returned in.
try {
    InlineResponse20060 result = apiInstance.radarPostDatasetDownload(body, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RadarDatasetsApi#radarPostDatasetDownload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatasetsDownloadBody**](DatasetsDownloadBody.md)|  | [optional]
 **format** | **String**| Format results are returned in. | [optional] [enum: JSON, CSV]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

