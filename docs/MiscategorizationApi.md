# MiscategorizationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**miscategorizationCreateMiscategorization**](MiscategorizationApi.md#miscategorizationCreateMiscategorization) | **POST** /accounts/{account_identifier}/intel/miscategorization | Create Miscategorization

<a name="miscategorizationCreateMiscategorization"></a>
# **miscategorizationCreateMiscategorization**
> ApiResponseSingle miscategorizationCreateMiscategorization(body, accountIdentifier)

Create Miscategorization

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MiscategorizationApi;

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


MiscategorizationApi apiInstance = new MiscategorizationApi();
Miscategorization body = new Miscategorization(); // Miscategorization | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.miscategorizationCreateMiscategorization(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscategorizationApi#miscategorizationCreateMiscategorization");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Miscategorization**](Miscategorization.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

