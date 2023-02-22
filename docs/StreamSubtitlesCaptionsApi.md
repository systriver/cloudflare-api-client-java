# StreamSubtitlesCaptionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamSubtitlesCaptionsDeleteCaptionsOrSubtitles**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsDeleteCaptionsOrSubtitles) | **DELETE** /accounts/{account_identifier}/stream/{identifier}/captions/{language} | Delete captions or subtitles
[**streamSubtitlesCaptionsListCaptionsOrSubtitles**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsListCaptionsOrSubtitles) | **GET** /accounts/{account_identifier}/stream/{identifier}/captions | List captions or subtitles
[**streamSubtitlesCaptionsUploadCaptionsOrSubtitles**](StreamSubtitlesCaptionsApi.md#streamSubtitlesCaptionsUploadCaptionsOrSubtitles) | **PUT** /accounts/{account_identifier}/stream/{identifier}/captions/{language} | Upload captions or subtitles

<a name="streamSubtitlesCaptionsDeleteCaptionsOrSubtitles"></a>
# **streamSubtitlesCaptionsDeleteCaptionsOrSubtitles**
> InlineResponse20013 streamSubtitlesCaptionsDeleteCaptionsOrSubtitles(language, identifier, accountIdentifier)

Delete captions or subtitles

Removes the captions or subtitles from a video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamSubtitlesCaptionsApi;

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


StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi();
String language = "language_example"; // String | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20013 result = apiInstance.streamSubtitlesCaptionsDeleteCaptionsOrSubtitles(language, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsDeleteCaptionsOrSubtitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamSubtitlesCaptionsListCaptionsOrSubtitles"></a>
# **streamSubtitlesCaptionsListCaptionsOrSubtitles**
> LanguageResponseCollection streamSubtitlesCaptionsListCaptionsOrSubtitles(identifier, accountIdentifier)

List captions or subtitles

Lists the available captions or subtitles for a specific video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamSubtitlesCaptionsApi;

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


StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LanguageResponseCollection result = apiInstance.streamSubtitlesCaptionsListCaptionsOrSubtitles(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsListCaptionsOrSubtitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LanguageResponseCollection**](LanguageResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamSubtitlesCaptionsUploadCaptionsOrSubtitles"></a>
# **streamSubtitlesCaptionsUploadCaptionsOrSubtitles**
> LanguageResponseSingle streamSubtitlesCaptionsUploadCaptionsOrSubtitles(file, language, identifier, accountIdentifier)

Upload captions or subtitles

Uploads the caption or subtitle file to the endpoint for a specific BCP47 language. One caption or subtitle file per language is allowed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamSubtitlesCaptionsApi;

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


StreamSubtitlesCaptionsApi apiInstance = new StreamSubtitlesCaptionsApi();
String file = "file_example"; // String | 
String language = "language_example"; // String | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    LanguageResponseSingle result = apiInstance.streamSubtitlesCaptionsUploadCaptionsOrSubtitles(file, language, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamSubtitlesCaptionsApi#streamSubtitlesCaptionsUploadCaptionsOrSubtitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **String**|  |
 **language** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**LanguageResponseSingle**](LanguageResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

