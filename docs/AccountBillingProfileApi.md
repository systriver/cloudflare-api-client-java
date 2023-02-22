# AccountBillingProfileApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountBillingProfileBillingProfileDetails**](AccountBillingProfileApi.md#accountBillingProfileBillingProfileDetails) | **GET** /accounts/{account_identifier}/billing/profile | Billing Profile Details

<a name="accountBillingProfileBillingProfileDetails"></a>
# **accountBillingProfileBillingProfileDetails**
> BillingResponseSingle accountBillingProfileBillingProfileDetails(accountIdentifier)

Billing Profile Details

Gets the current billing profile for the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountBillingProfileApi;

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


AccountBillingProfileApi apiInstance = new AccountBillingProfileApi();
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    BillingResponseSingle result = apiInstance.accountBillingProfileBillingProfileDetails(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountBillingProfileApi#accountBillingProfileBillingProfileDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**BillingResponseSingle**](BillingResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

