# CloudflareImagesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudflareImagesBaseImage**](CloudflareImagesApi.md#cloudflareImagesBaseImage) | **GET** /accounts/{account_identifier}/images/v1/{identifier}/blob | Base image
[**cloudflareImagesCreateAuthenticatedDirectUploadUrlV2**](CloudflareImagesApi.md#cloudflareImagesCreateAuthenticatedDirectUploadUrlV2) | **POST** /accounts/{account_identifier}/images/v2/direct_upload | Create authenticated direct upload URL V2
[**cloudflareImagesDeleteImage**](CloudflareImagesApi.md#cloudflareImagesDeleteImage) | **DELETE** /accounts/{account_identifier}/images/v1/{identifier} | Delete image
[**cloudflareImagesImageDetails**](CloudflareImagesApi.md#cloudflareImagesImageDetails) | **GET** /accounts/{account_identifier}/images/v1/{identifier} | Image details
[**cloudflareImagesImagesUsageStatistics**](CloudflareImagesApi.md#cloudflareImagesImagesUsageStatistics) | **GET** /accounts/{account_identifier}/images/v1/stats | Images usage statistics
[**cloudflareImagesListImages**](CloudflareImagesApi.md#cloudflareImagesListImages) | **GET** /accounts/{account_identifier}/images/v1 | List images
[**cloudflareImagesUpdateImage**](CloudflareImagesApi.md#cloudflareImagesUpdateImage) | **PATCH** /accounts/{account_identifier}/images/v1/{identifier} | Update image
[**cloudflareImagesUploadAnImageViaUrl**](CloudflareImagesApi.md#cloudflareImagesUploadAnImageViaUrl) | **POST** /accounts/{account_identifier}/images/v1 | Upload an image via URL

<a name="cloudflareImagesBaseImage"></a>
# **cloudflareImagesBaseImage**
> ImageResponseBlob cloudflareImagesBaseImage(identifier, accountIdentifier)

Base image

Fetch base image. For most images this will be the originally uploaded file. For larger images it can be a near-lossless version of the original.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ImageResponseBlob result = apiInstance.cloudflareImagesBaseImage(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesBaseImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ImageResponseBlob**](ImageResponseBlob.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareImagesCreateAuthenticatedDirectUploadUrlV2"></a>
# **cloudflareImagesCreateAuthenticatedDirectUploadUrlV2**
> DirectUploadResponseV2 cloudflareImagesCreateAuthenticatedDirectUploadUrlV2(expiry, id, metadata, requireSignedURLs, accountIdentifier)

Create authenticated direct upload URL V2

Direct uploads allow users to upload images without API keys. A common use case are web apps, client-side applications, or mobile devices where users upload content directly to Cloudflare Images. This method creates a draft record for a future image. It returns an upload URL and an image identifier. To verify if the image itself has been uploaded, send an image details request (accounts/:account_identifier/images/v1/:identifier), and check that the &#x60;draft: true&#x60; property is not present.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
OffsetDateTime expiry = new OffsetDateTime(); // OffsetDateTime | 
String id = "id_example"; // String | 
Object metadata = null; // Object | 
Boolean requireSignedURLs = true; // Boolean | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DirectUploadResponseV2 result = apiInstance.cloudflareImagesCreateAuthenticatedDirectUploadUrlV2(expiry, id, metadata, requireSignedURLs, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesCreateAuthenticatedDirectUploadUrlV2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expiry** | **OffsetDateTime**|  |
 **id** | **String**|  |
 **metadata** | [**Object**](.md)|  |
 **requireSignedURLs** | **Boolean**|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DirectUploadResponseV2**](DirectUploadResponseV2.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="cloudflareImagesDeleteImage"></a>
# **cloudflareImagesDeleteImage**
> CloudflareClientAPIDeletedResponse cloudflareImagesDeleteImage(identifier, accountIdentifier)

Delete image

Delete an image on Cloudflare Images. On success, all copies of the image are deleted and purged from cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CloudflareClientAPIDeletedResponse result = apiInstance.cloudflareImagesDeleteImage(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesDeleteImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIDeletedResponse**](CloudflareClientAPIDeletedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareImagesImageDetails"></a>
# **cloudflareImagesImageDetails**
> ImageResponseSingle cloudflareImagesImageDetails(identifier, accountIdentifier)

Image details

Fetch details for a single image.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ImageResponseSingle result = apiInstance.cloudflareImagesImageDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesImageDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ImageResponseSingle**](ImageResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareImagesImagesUsageStatistics"></a>
# **cloudflareImagesImagesUsageStatistics**
> ImagesStats cloudflareImagesImagesUsageStatistics(accountIdentifier)

Images usage statistics

Fetch usage statistics details for Cloudflare Images.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ImagesStats result = apiInstance.cloudflareImagesImagesUsageStatistics(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesImagesUsageStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ImagesStats**](ImagesStats.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareImagesListImages"></a>
# **cloudflareImagesListImages**
> ImageResponseCollection cloudflareImagesListImages(accountIdentifier)

List images

List up to 100 images with one request. Use the optional parameters below to get a specific range of images.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ImageResponseCollection result = apiInstance.cloudflareImagesListImages(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesListImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ImageResponseCollection**](ImageResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cloudflareImagesUpdateImage"></a>
# **cloudflareImagesUpdateImage**
> ImageResponseSingle cloudflareImagesUpdateImage(body, identifier, accountIdentifier)

Update image

Update image access control. On access control change, all copies of the image are purged from cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
ImagePatchRequest body = new ImagePatchRequest(); // ImagePatchRequest | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ImageResponseSingle result = apiInstance.cloudflareImagesUpdateImage(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesUpdateImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImagePatchRequest**](ImagePatchRequest.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ImageResponseSingle**](ImageResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloudflareImagesUploadAnImageViaUrl"></a>
# **cloudflareImagesUploadAnImageViaUrl**
> ImageResponseSingle cloudflareImagesUploadAnImageViaUrl(metadata, requireSignedURLs, url, accountIdentifier)

Upload an image via URL

Upload an image via URL with up to 10 Megabytes using a single HTTP POST (multipart/form-data) request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesApi;

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


CloudflareImagesApi apiInstance = new CloudflareImagesApi();
Object metadata = null; // Object | 
Boolean requireSignedURLs = true; // Boolean | 
String url = "url_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ImageResponseSingle result = apiInstance.cloudflareImagesUploadAnImageViaUrl(metadata, requireSignedURLs, url, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesApi#cloudflareImagesUploadAnImageViaUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metadata** | [**Object**](.md)|  |
 **requireSignedURLs** | **Boolean**|  |
 **url** | **String**|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ImageResponseSingle**](ImageResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

