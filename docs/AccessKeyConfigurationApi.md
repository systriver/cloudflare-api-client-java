# AccessKeyConfigurationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessKeyConfigurationGetTheAccessKeyConfiguration**](AccessKeyConfigurationApi.md#accessKeyConfigurationGetTheAccessKeyConfiguration) | **GET** /accounts/{identifier}/access/keys | Get the Access key configuration
[**accessKeyConfigurationRotateAccessKeys**](AccessKeyConfigurationApi.md#accessKeyConfigurationRotateAccessKeys) | **POST** /accounts/{identifier}/access/keys/rotate | Rotate Access keys
[**accessKeyConfigurationUpdateTheAccessKeyConfiguration**](AccessKeyConfigurationApi.md#accessKeyConfigurationUpdateTheAccessKeyConfiguration) | **PUT** /accounts/{identifier}/access/keys | Update the Access key configuration

<a name="accessKeyConfigurationGetTheAccessKeyConfiguration"></a>
# **accessKeyConfigurationGetTheAccessKeyConfiguration**
> KeysComponentsSchemasSingleResponse accessKeyConfigurationGetTheAccessKeyConfiguration(identifier)

Get the Access key configuration

Gets the Access key rotation settings for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessKeyConfigurationApi;

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


AccessKeyConfigurationApi apiInstance = new AccessKeyConfigurationApi();
KeysComponentsSchemasIdentifier identifier = new KeysComponentsSchemasIdentifier(); // KeysComponentsSchemasIdentifier | 
try {
    KeysComponentsSchemasSingleResponse result = apiInstance.accessKeyConfigurationGetTheAccessKeyConfiguration(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessKeyConfigurationApi#accessKeyConfigurationGetTheAccessKeyConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**KeysComponentsSchemasIdentifier**](.md)|  |

### Return type

[**KeysComponentsSchemasSingleResponse**](KeysComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessKeyConfigurationRotateAccessKeys"></a>
# **accessKeyConfigurationRotateAccessKeys**
> KeysComponentsSchemasSingleResponse accessKeyConfigurationRotateAccessKeys(identifier)

Rotate Access keys

Perfoms a key rotation for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessKeyConfigurationApi;

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


AccessKeyConfigurationApi apiInstance = new AccessKeyConfigurationApi();
KeysComponentsSchemasIdentifier identifier = new KeysComponentsSchemasIdentifier(); // KeysComponentsSchemasIdentifier | 
try {
    KeysComponentsSchemasSingleResponse result = apiInstance.accessKeyConfigurationRotateAccessKeys(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessKeyConfigurationApi#accessKeyConfigurationRotateAccessKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**KeysComponentsSchemasIdentifier**](.md)|  |

### Return type

[**KeysComponentsSchemasSingleResponse**](KeysComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessKeyConfigurationUpdateTheAccessKeyConfiguration"></a>
# **accessKeyConfigurationUpdateTheAccessKeyConfiguration**
> KeysComponentsSchemasSingleResponse accessKeyConfigurationUpdateTheAccessKeyConfiguration(body, identifier)

Update the Access key configuration

Updates the Access key rotation settings for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessKeyConfigurationApi;

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


AccessKeyConfigurationApi apiInstance = new AccessKeyConfigurationApi();
AccessKeysBody body = new AccessKeysBody(); // AccessKeysBody | 
KeysComponentsSchemasIdentifier identifier = new KeysComponentsSchemasIdentifier(); // KeysComponentsSchemasIdentifier | 
try {
    KeysComponentsSchemasSingleResponse result = apiInstance.accessKeyConfigurationUpdateTheAccessKeyConfiguration(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessKeyConfigurationApi#accessKeyConfigurationUpdateTheAccessKeyConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessKeysBody**](AccessKeysBody.md)|  |
 **identifier** | [**KeysComponentsSchemasIdentifier**](.md)|  |

### Return type

[**KeysComponentsSchemasSingleResponse**](KeysComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

