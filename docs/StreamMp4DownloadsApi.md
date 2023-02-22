# StreamMp4DownloadsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamMP4DownloadsCreateDownloads**](StreamMp4DownloadsApi.md#streamMP4DownloadsCreateDownloads) | **POST** /accounts/{account_identifier}/stream/{identifier}/downloads | Create downloads
[**streamMP4DownloadsDeleteDownloads**](StreamMp4DownloadsApi.md#streamMP4DownloadsDeleteDownloads) | **DELETE** /accounts/{account_identifier}/stream/{identifier}/downloads | Delete downloads
[**streamMP4DownloadsListDownloads**](StreamMp4DownloadsApi.md#streamMP4DownloadsListDownloads) | **GET** /accounts/{account_identifier}/stream/{identifier}/downloads | List downloads

<a name="streamMP4DownloadsCreateDownloads"></a>
# **streamMP4DownloadsCreateDownloads**
> DownloadsResponse streamMP4DownloadsCreateDownloads(identifier, accountIdentifier)

Create downloads

Creates a download for a video when a video is ready to view.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamMp4DownloadsApi;

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


StreamMp4DownloadsApi apiInstance = new StreamMp4DownloadsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DownloadsResponse result = apiInstance.streamMP4DownloadsCreateDownloads(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamMp4DownloadsApi#streamMP4DownloadsCreateDownloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DownloadsResponse**](DownloadsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamMP4DownloadsDeleteDownloads"></a>
# **streamMP4DownloadsDeleteDownloads**
> DeletedResponse streamMP4DownloadsDeleteDownloads(identifier, accountIdentifier)

Delete downloads

Delete the downloads for a video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamMp4DownloadsApi;

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


StreamMp4DownloadsApi apiInstance = new StreamMp4DownloadsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeletedResponse result = apiInstance.streamMP4DownloadsDeleteDownloads(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamMp4DownloadsApi#streamMP4DownloadsDeleteDownloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DeletedResponse**](DeletedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamMP4DownloadsListDownloads"></a>
# **streamMP4DownloadsListDownloads**
> DownloadsResponse streamMP4DownloadsListDownloads(identifier, accountIdentifier)

List downloads

Lists the downloads created for a video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamMp4DownloadsApi;

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


StreamMp4DownloadsApi apiInstance = new StreamMp4DownloadsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DownloadsResponse result = apiInstance.streamMP4DownloadsListDownloads(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamMp4DownloadsApi#streamMP4DownloadsListDownloads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DownloadsResponse**](DownloadsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

