# DlpPatternValidationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dlpPatternValidationValidatePattern**](DlpPatternValidationApi.md#dlpPatternValidationValidatePattern) | **POST** /accounts/{account_identifier}/dlp/patterns/validate | Validate pattern

<a name="dlpPatternValidationValidatePattern"></a>
# **dlpPatternValidationValidatePattern**
> CloudflareClientAPIValidateResponse dlpPatternValidationValidatePattern(body, accountIdentifier)

Validate pattern

Validates whether this pattern is a valid regular expression. Rejects it if the regular expression is too complex or can match an unbounded-length string. Your regex will be rejected if it uses the Kleene Star -- be sure to bound the maximum number of characters that can be matched.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DlpPatternValidationApi;

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


DlpPatternValidationApi apiInstance = new DlpPatternValidationApi();
ValidatePattern body = new ValidatePattern(); // ValidatePattern | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CloudflareClientAPIValidateResponse result = apiInstance.dlpPatternValidationValidatePattern(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DlpPatternValidationApi#dlpPatternValidationValidatePattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ValidatePattern**](ValidatePattern.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIValidateResponse**](CloudflareClientAPIValidateResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

