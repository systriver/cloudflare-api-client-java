# StreamWatermarkProfileApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload**](StreamWatermarkProfileApi.md#streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload) | **POST** /accounts/{account_identifier}/stream/watermarks | Create watermark profiles via basic upload
[**streamWatermarkProfileDeleteWatermarkProfiles**](StreamWatermarkProfileApi.md#streamWatermarkProfileDeleteWatermarkProfiles) | **DELETE** /accounts/{account_identifier}/stream/watermarks/{identifier} | Delete watermark profiles
[**streamWatermarkProfileListWatermarkProfiles**](StreamWatermarkProfileApi.md#streamWatermarkProfileListWatermarkProfiles) | **GET** /accounts/{account_identifier}/stream/watermarks | List watermark profiles
[**streamWatermarkProfileWatermarkProfileDetails**](StreamWatermarkProfileApi.md#streamWatermarkProfileWatermarkProfileDetails) | **GET** /accounts/{account_identifier}/stream/watermarks/{identifier} | Watermark profile details

<a name="streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload"></a>
# **streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload**
> WatermarkResponseSingle streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(file, name, opacity, padding, position, scale, accountIdentifier)

Create watermark profiles via basic upload

Creates watermark profiles using a single &#x60;HTTP POST multipart/form-data&#x60; request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamWatermarkProfileApi;

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


StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi();
String file = "file_example"; // String | 
String name = "name_example"; // String | 
BigDecimal opacity = new BigDecimal(); // BigDecimal | 
BigDecimal padding = new BigDecimal(); // BigDecimal | 
String position = "position_example"; // String | 
BigDecimal scale = new BigDecimal(); // BigDecimal | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    WatermarkResponseSingle result = apiInstance.streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload(file, name, opacity, padding, position, scale, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileCreateWatermarkProfilesViaBasicUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **String**|  |
 **name** | [**String**](.md)|  |
 **opacity** | [**BigDecimal**](.md)|  |
 **padding** | [**BigDecimal**](.md)|  |
 **position** | [**String**](.md)|  |
 **scale** | [**BigDecimal**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**WatermarkResponseSingle**](WatermarkResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="streamWatermarkProfileDeleteWatermarkProfiles"></a>
# **streamWatermarkProfileDeleteWatermarkProfiles**
> InlineResponse20012 streamWatermarkProfileDeleteWatermarkProfiles(identifier, accountIdentifier)

Delete watermark profiles

Deletes a watermark profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamWatermarkProfileApi;

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


StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20012 result = apiInstance.streamWatermarkProfileDeleteWatermarkProfiles(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileDeleteWatermarkProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamWatermarkProfileListWatermarkProfiles"></a>
# **streamWatermarkProfileListWatermarkProfiles**
> WatermarkResponseCollection streamWatermarkProfileListWatermarkProfiles(accountIdentifier)

List watermark profiles

Lists all watermark profiles for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamWatermarkProfileApi;

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


StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    WatermarkResponseCollection result = apiInstance.streamWatermarkProfileListWatermarkProfiles(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileListWatermarkProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**WatermarkResponseCollection**](WatermarkResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamWatermarkProfileWatermarkProfileDetails"></a>
# **streamWatermarkProfileWatermarkProfileDetails**
> WatermarkResponseSingle streamWatermarkProfileWatermarkProfileDetails(identifier, accountIdentifier)

Watermark profile details

Retrieves details for a single watermark profile.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamWatermarkProfileApi;

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


StreamWatermarkProfileApi apiInstance = new StreamWatermarkProfileApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    WatermarkResponseSingle result = apiInstance.streamWatermarkProfileWatermarkProfileDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamWatermarkProfileApi#streamWatermarkProfileWatermarkProfileDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**WatermarkResponseSingle**](WatermarkResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

