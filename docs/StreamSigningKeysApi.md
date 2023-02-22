# StreamSigningKeysApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamSigningKeysCreateSigningKeys**](StreamSigningKeysApi.md#streamSigningKeysCreateSigningKeys) | **POST** /accounts/{account_identifier}/stream/keys | Create signing keys
[**streamSigningKeysDeleteSigningKeys**](StreamSigningKeysApi.md#streamSigningKeysDeleteSigningKeys) | **DELETE** /accounts/{account_identifier}/stream/keys/{identifier} | Delete signing keys
[**streamSigningKeysListSigningKeys**](StreamSigningKeysApi.md#streamSigningKeysListSigningKeys) | **GET** /accounts/{account_identifier}/stream/keys | List signing keys

<a name="streamSigningKeysCreateSigningKeys"></a>
# **streamSigningKeysCreateSigningKeys**
> KeyGenerationResponse streamSigningKeysCreateSigningKeys(accountIdentifier)

Create signing keys

Creates an RSA private key in PEM and JWK formats. Key files are only displayed once after creation. Keys are created, used, and deleted independently of videos, and every key can sign any video.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamSigningKeysApi;

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


StreamSigningKeysApi apiInstance = new StreamSigningKeysApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    KeyGenerationResponse result = apiInstance.streamSigningKeysCreateSigningKeys(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamSigningKeysApi#streamSigningKeysCreateSigningKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**KeyGenerationResponse**](KeyGenerationResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamSigningKeysDeleteSigningKeys"></a>
# **streamSigningKeysDeleteSigningKeys**
> DeletedResponse streamSigningKeysDeleteSigningKeys(identifier, accountIdentifier)

Delete signing keys

Deletes signing keys and revokes all signed URLs generated with the key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamSigningKeysApi;

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


StreamSigningKeysApi apiInstance = new StreamSigningKeysApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DeletedResponse result = apiInstance.streamSigningKeysDeleteSigningKeys(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamSigningKeysApi#streamSigningKeysDeleteSigningKeys");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamSigningKeysListSigningKeys"></a>
# **streamSigningKeysListSigningKeys**
> KeyResponseCollection streamSigningKeysListSigningKeys(accountIdentifier)

List signing keys

Lists the video ID and creation date and time when a signing key was created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StreamSigningKeysApi;

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


StreamSigningKeysApi apiInstance = new StreamSigningKeysApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    KeyResponseCollection result = apiInstance.streamSigningKeysListSigningKeys(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StreamSigningKeysApi#streamSigningKeysListSigningKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**KeyResponseCollection**](KeyResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

