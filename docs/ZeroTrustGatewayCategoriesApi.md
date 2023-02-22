# ZeroTrustGatewayCategoriesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustGatewayCategoriesListCategories**](ZeroTrustGatewayCategoriesApi.md#zeroTrustGatewayCategoriesListCategories) | **GET** /accounts/{account_id}/gateway/categories | List Categories

<a name="zeroTrustGatewayCategoriesListCategories"></a>
# **zeroTrustGatewayCategoriesListCategories**
> CategoriesComponentsSchemasResponseCollection zeroTrustGatewayCategoriesListCategories(accountId)

List Categories

List all Categories.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayCategoriesApi;

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


ZeroTrustGatewayCategoriesApi apiInstance = new ZeroTrustGatewayCategoriesApi();
String accountId = "accountId_example"; // String | 
try {
    CategoriesComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayCategoriesListCategories(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayCategoriesApi#zeroTrustGatewayCategoriesListCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)|  |

### Return type

[**CategoriesComponentsSchemasResponseCollection**](CategoriesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

