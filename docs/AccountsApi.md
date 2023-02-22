# AccountsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountsAccountDetails**](AccountsApi.md#accountsAccountDetails) | **GET** /accounts/{identifier} | Account Details
[**accountsListAccounts**](AccountsApi.md#accountsListAccounts) | **GET** /accounts | List Accounts
[**accountsUpdateAccount**](AccountsApi.md#accountsUpdateAccount) | **PUT** /accounts/{identifier} | Update Account

<a name="accountsAccountDetails"></a>
# **accountsAccountDetails**
> ResponseSingle accountsAccountDetails(identifier)

Account Details

Get information about a specific account that you are a member of.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

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


AccountsApi apiInstance = new AccountsApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    ResponseSingle result = apiInstance.accountsAccountDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#accountsAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountsListAccounts"></a>
# **accountsListAccounts**
> CloudflareClientAPIResponseCollection accountsListAccounts()

List Accounts

List all accounts you have ownership or verified access to.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

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


AccountsApi apiInstance = new AccountsApi();
try {
    CloudflareClientAPIResponseCollection result = apiInstance.accountsListAccounts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#accountsListAccounts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CloudflareClientAPIResponseCollection**](CloudflareClientAPIResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountsUpdateAccount"></a>
# **accountsUpdateAccount**
> ResponseSingle accountsUpdateAccount(body, identifier)

Update Account

Update an existing account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountsApi;

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


AccountsApi apiInstance = new AccountsApi();
ComponentsSchemasAccount body = new ComponentsSchemasAccount(); // ComponentsSchemasAccount | 
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
try {
    ResponseSingle result = apiInstance.accountsUpdateAccount(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#accountsUpdateAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComponentsSchemasAccount**](ComponentsSchemasAccount.md)|  |
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

