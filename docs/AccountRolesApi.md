# AccountRolesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountRolesListRoles**](AccountRolesApi.md#accountRolesListRoles) | **GET** /accounts/{account_identifier}/roles | List Roles
[**accountRolesRoleDetails**](AccountRolesApi.md#accountRolesRoleDetails) | **GET** /accounts/{account_identifier}/roles/{identifier} | Role Details

<a name="accountRolesListRoles"></a>
# **accountRolesListRoles**
> CloudflareClientAPIResponseCollection accountRolesListRoles(accountIdentifier)

List Roles

Get all available roles for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRolesApi;

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


AccountRolesApi apiInstance = new AccountRolesApi();
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    CloudflareClientAPIResponseCollection result = apiInstance.accountRolesListRoles(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRolesApi#accountRolesListRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIResponseCollection**](CloudflareClientAPIResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRolesRoleDetails"></a>
# **accountRolesRoleDetails**
> ResponseSingle accountRolesRoleDetails(identifier, accountIdentifier)

Role Details

Get information about a specific role for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRolesApi;

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


AccountRolesApi apiInstance = new AccountRolesApi();
CloudflareClientAPISchemasIdentifier identifier = new CloudflareClientAPISchemasIdentifier(); // CloudflareClientAPISchemasIdentifier | 
CloudflareClientAPIAccountIdentifier accountIdentifier = new CloudflareClientAPIAccountIdentifier(); // CloudflareClientAPIAccountIdentifier | 
try {
    ResponseSingle result = apiInstance.accountRolesRoleDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRolesApi#accountRolesRoleDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**CloudflareClientAPISchemasIdentifier**](.md)|  |
 **accountIdentifier** | [**CloudflareClientAPIAccountIdentifier**](.md)|  |

### Return type

[**ResponseSingle**](ResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

