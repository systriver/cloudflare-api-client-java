# PhishingUrlScannerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**phishingUrlScannerSubmitSuspiciousUrlForScanning**](PhishingUrlScannerApi.md#phishingUrlScannerSubmitSuspiciousUrlForScanning) | **POST** /accounts/{account_identifier}/brand-protection/submit | Submit suspicious URL for scanning

<a name="phishingUrlScannerSubmitSuspiciousUrlForScanning"></a>
# **phishingUrlScannerSubmitSuspiciousUrlForScanning**
> PhishingUrlSubmitComponentsSchemasSingleResponse phishingUrlScannerSubmitSuspiciousUrlForScanning(body, accountIdentifier)

Submit suspicious URL for scanning

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PhishingUrlScannerApi;

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


PhishingUrlScannerApi apiInstance = new PhishingUrlScannerApi();
BrandprotectionSubmitBody body = new BrandprotectionSubmitBody(); // BrandprotectionSubmitBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    PhishingUrlSubmitComponentsSchemasSingleResponse result = apiInstance.phishingUrlScannerSubmitSuspiciousUrlForScanning(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhishingUrlScannerApi#phishingUrlScannerSubmitSuspiciousUrlForScanning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BrandprotectionSubmitBody**](BrandprotectionSubmitBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**PhishingUrlSubmitComponentsSchemasSingleResponse**](PhishingUrlSubmitComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

