# UserBillingProfileApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userBillingProfileBillingProfileDetails**](UserBillingProfileApi.md#userBillingProfileBillingProfileDetails) | **GET** /user/billing/profile | Billing Profile Details

<a name="userBillingProfileBillingProfileDetails"></a>
# **userBillingProfileBillingProfileDetails**
> BillingResponseSingle userBillingProfileBillingProfileDetails()

Billing Profile Details

Accesses your billing profile object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserBillingProfileApi;

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


UserBillingProfileApi apiInstance = new UserBillingProfileApi();
try {
    BillingResponseSingle result = apiInstance.userBillingProfileBillingProfileDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserBillingProfileApi#userBillingProfileBillingProfileDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingResponseSingle**](BillingResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

