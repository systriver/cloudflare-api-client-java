# StreamVideoClippingApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamVideoClippingClipVideosGivenAStartAndEndTime**](StreamVideoClippingApi.md#streamVideoClippingClipVideosGivenAStartAndEndTime) | **POST** /accounts/{account_identifier}/stream/clip | Clip videos given a start and end time

<a name="streamVideoClippingClipVideosGivenAStartAndEndTime"></a>
# **streamVideoClippingClipVideosGivenAStartAndEndTime**
> ClipResponseSingle streamVideoClippingClipVideosGivenAStartAndEndTime(body, accountIdentifier)

Clip videos given a start and end time

Clips a video based on the specified start and end times provided in seconds.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideoClippingApi;

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


StreamVideoClippingApi apiInstance = new StreamVideoClippingApi();
VideoClipStandard body = new VideoClipStandard(); // VideoClipStandard | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ClipResponseSingle result = apiInstance.streamVideoClippingClipVideosGivenAStartAndEndTime(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideoClippingApi#streamVideoClippingClipVideosGivenAStartAndEndTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VideoClipStandard**](VideoClipStandard.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ClipResponseSingle**](ClipResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

