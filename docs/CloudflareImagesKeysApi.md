# CloudflareImagesKeysApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloudflareImagesKeysListSigningKeys**](CloudflareImagesKeysApi.md#cloudflareImagesKeysListSigningKeys) | **GET** /accounts/{account_identifier}/images/v1/keys | List Signing Keys

<a name="cloudflareImagesKeysListSigningKeys"></a>
# **cloudflareImagesKeysListSigningKeys**
> CloudflareClientAPIKeyResponseCollection cloudflareImagesKeysListSigningKeys(accountIdentifier)

List Signing Keys

Lists your signing keys. These can be found on your Cloudflare Images dashboard.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudflareImagesKeysApi;

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


CloudflareImagesKeysApi apiInstance = new CloudflareImagesKeysApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CloudflareClientAPIKeyResponseCollection result = apiInstance.cloudflareImagesKeysListSigningKeys(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudflareImagesKeysApi#cloudflareImagesKeysListSigningKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIKeyResponseCollection**](CloudflareClientAPIKeyResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

