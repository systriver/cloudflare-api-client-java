# StreamVideosApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamVideosCreateSignedUrlTokensForVideos**](StreamVideosApi.md#streamVideosCreateSignedUrlTokensForVideos) | **POST** /accounts/{account_identifier}/stream/{identifier}/token | Create signed URL tokens for videos
[**streamVideosDeleteVideo**](StreamVideosApi.md#streamVideosDeleteVideo) | **DELETE** /accounts/{account_identifier}/stream/{identifier} | Delete video
[**streamVideosInitiateVideoUploadsUsingTus**](StreamVideosApi.md#streamVideosInitiateVideoUploadsUsingTus) | **POST** /accounts/{account_identifier}/stream | Initiate video uploads using TUS
[**streamVideosListVideos**](StreamVideosApi.md#streamVideosListVideos) | **GET** /accounts/{account_identifier}/stream | List videos
[**streamVideosRetreieveEmbedCodeHtml**](StreamVideosApi.md#streamVideosRetreieveEmbedCodeHtml) | **GET** /accounts/{account_identifier}/stream/{identifier}/embed | Retreieve embed Code HTML
[**streamVideosRetrieveVideoDetails**](StreamVideosApi.md#streamVideosRetrieveVideoDetails) | **GET** /accounts/{account_identifier}/stream/{identifier} | Retrieve video details
[**streamVideosUpdateVideoDetails**](StreamVideosApi.md#streamVideosUpdateVideoDetails) | **POST** /accounts/{account_identifier}/stream/{identifier} | Update video details
[**streamVideosUploadVideosFromAUrl**](StreamVideosApi.md#streamVideosUploadVideosFromAUrl) | **POST** /accounts/{account_identifier}/stream/copy | Upload videos from a URL
[**streamVideosUploadVideosViaDirectUploadUrLs**](StreamVideosApi.md#streamVideosUploadVideosViaDirectUploadUrLs) | **POST** /accounts/{account_identifier}/stream/direct_upload | Upload videos via direct upload URLs

<a name="streamVideosCreateSignedUrlTokensForVideos"></a>
# **streamVideosCreateSignedUrlTokensForVideos**
> SignedTokenResponse streamVideosCreateSignedUrlTokensForVideos(body, identifier, accountIdentifier)

Create signed URL tokens for videos

Creates a signed URL token for a video. If a body is not provided in the request, a token is created with default values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
SignedTokenRequest body = new SignedTokenRequest(); // SignedTokenRequest | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SignedTokenResponse result = apiInstance.streamVideosCreateSignedUrlTokensForVideos(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosCreateSignedUrlTokensForVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SignedTokenRequest**](SignedTokenRequest.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SignedTokenResponse**](SignedTokenResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamVideosDeleteVideo"></a>
# **streamVideosDeleteVideo**
> streamVideosDeleteVideo(identifier, accountIdentifier)

Delete video

Deletes a video and its copies from Cloudflare Stream.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.streamVideosDeleteVideo(identifier, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosDeleteVideo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamVideosInitiateVideoUploadsUsingTus"></a>
# **streamVideosInitiateVideoUploadsUsingTus**
> streamVideosInitiateVideoUploadsUsingTus(tusResumable, uploadCreator, uploadLength, accountIdentifier)

Initiate video uploads using TUS

Initiates a video upload using the TUS protocol. On success, the server responds with a status code 201 (created) and includes a &#x60;location&#x60; header to indicate where the content should be uploaded. Refer to https://tus.io for protocol details.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
TusResumable tusResumable = new TusResumable(); // TusResumable | 
String uploadCreator = "uploadCreator_example"; // String | 
Integer uploadLength = 56; // Integer | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    apiInstance.streamVideosInitiateVideoUploadsUsingTus(tusResumable, uploadCreator, uploadLength, accountIdentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosInitiateVideoUploadsUsingTus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tusResumable** | [**TusResumable**](.md)|  |
 **uploadCreator** | [**String**](.md)|  |
 **uploadLength** | [**Integer**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

null (empty response body)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamVideosListVideos"></a>
# **streamVideosListVideos**
> VideoResponseCollection streamVideosListVideos(accountIdentifier)

List videos

Lists up to 1000 videos from a single request. For a specific range, refer to the optional parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VideoResponseCollection result = apiInstance.streamVideosListVideos(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosListVideos");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VideoResponseCollection**](VideoResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamVideosRetreieveEmbedCodeHtml"></a>
# **streamVideosRetreieveEmbedCodeHtml**
> Object streamVideosRetreieveEmbedCodeHtml(identifier, accountIdentifier)

Retreieve embed Code HTML

Fetches an HTML code snippet to embed a video in a web page delivered through Cloudflare. On success, returns an HTML fragment for use on web pages to display a video. On failure, returns a JSON response body.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    Object result = apiInstance.streamVideosRetreieveEmbedCodeHtml(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosRetreieveEmbedCodeHtml");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

**Object**

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamVideosRetrieveVideoDetails"></a>
# **streamVideosRetrieveVideoDetails**
> VideoResponseSingle streamVideosRetrieveVideoDetails(identifier, accountIdentifier)

Retrieve video details

Fetches details for a single video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VideoResponseSingle result = apiInstance.streamVideosRetrieveVideoDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosRetrieveVideoDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VideoResponseSingle**](VideoResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamVideosUpdateVideoDetails"></a>
# **streamVideosUpdateVideoDetails**
> VideoResponseSingle streamVideosUpdateVideoDetails(body, identifier, accountIdentifier)

Update video details

Update details for a single video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
VideoUpdate body = new VideoUpdate(); // VideoUpdate | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VideoResponseSingle result = apiInstance.streamVideosUpdateVideoDetails(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosUpdateVideoDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VideoUpdate**](VideoUpdate.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VideoResponseSingle**](VideoResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamVideosUploadVideosFromAUrl"></a>
# **streamVideosUploadVideosFromAUrl**
> VideoResponseSingle streamVideosUploadVideosFromAUrl(body, accountIdentifier)

Upload videos from a URL

Uploads a video to Stream from a provided URL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
VideoCopyRequest body = new VideoCopyRequest(); // VideoCopyRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    VideoResponseSingle result = apiInstance.streamVideosUploadVideosFromAUrl(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosUploadVideosFromAUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VideoCopyRequest**](VideoCopyRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**VideoResponseSingle**](VideoResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamVideosUploadVideosViaDirectUploadUrLs"></a>
# **streamVideosUploadVideosViaDirectUploadUrLs**
> DirectUploadResponse streamVideosUploadVideosViaDirectUploadUrLs(body, accountIdentifier)

Upload videos via direct upload URLs

Creates a direct upload that allows video uploads without an API key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamVideosApi;

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


StreamVideosApi apiInstance = new StreamVideosApi();
DirectUploadRequest body = new DirectUploadRequest(); // DirectUploadRequest | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DirectUploadResponse result = apiInstance.streamVideosUploadVideosViaDirectUploadUrLs(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamVideosApi#streamVideosUploadVideosViaDirectUploadUrLs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectUploadRequest**](DirectUploadRequest.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DirectUploadResponse**](DirectUploadResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

