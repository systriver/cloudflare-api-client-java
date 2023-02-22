# InstantLogsJobsForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZonesZoneIdentifierLogpushEdgeJobs**](InstantLogsJobsForAZoneApi.md#getZonesZoneIdentifierLogpushEdgeJobs) | **GET** /zones/{zone_identifier}/logpush/edge | List Instant Logs jobs
[**postZonesZoneIdentifierLogpushEdgeJobs**](InstantLogsJobsForAZoneApi.md#postZonesZoneIdentifierLogpushEdgeJobs) | **POST** /zones/{zone_identifier}/logpush/edge | Create Instant Logs job

<a name="getZonesZoneIdentifierLogpushEdgeJobs"></a>
# **getZonesZoneIdentifierLogpushEdgeJobs**
> InstantLogsJobResponseCollection getZonesZoneIdentifierLogpushEdgeJobs(zoneIdentifier)

List Instant Logs jobs

Lists Instant Logs jobs for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstantLogsJobsForAZoneApi;

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


InstantLogsJobsForAZoneApi apiInstance = new InstantLogsJobsForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InstantLogsJobResponseCollection result = apiInstance.getZonesZoneIdentifierLogpushEdgeJobs(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstantLogsJobsForAZoneApi#getZonesZoneIdentifierLogpushEdgeJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InstantLogsJobResponseCollection**](InstantLogsJobResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postZonesZoneIdentifierLogpushEdgeJobs"></a>
# **postZonesZoneIdentifierLogpushEdgeJobs**
> InstantLogsJobResponseSingle postZonesZoneIdentifierLogpushEdgeJobs(body, zoneIdentifier)

Create Instant Logs job

Creates a new Instant Logs job for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InstantLogsJobsForAZoneApi;

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


InstantLogsJobsForAZoneApi apiInstance = new InstantLogsJobsForAZoneApi();
LogpushEdgeBody body = new LogpushEdgeBody(); // LogpushEdgeBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InstantLogsJobResponseSingle result = apiInstance.postZonesZoneIdentifierLogpushEdgeJobs(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstantLogsJobsForAZoneApi#postZonesZoneIdentifierLogpushEdgeJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogpushEdgeBody**](LogpushEdgeBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InstantLogsJobResponseSingle**](InstantLogsJobResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

