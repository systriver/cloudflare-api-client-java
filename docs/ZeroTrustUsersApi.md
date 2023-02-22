# ZeroTrustUsersApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustUsersGetFailedLogins**](ZeroTrustUsersApi.md#zeroTrustUsersGetFailedLogins) | **GET** /accounts/{identifier}/access/users/{id}/failed_logins | Get failed logins
[**zeroTrustUsersGetUsers**](ZeroTrustUsersApi.md#zeroTrustUsersGetUsers) | **GET** /accounts/{identifier}/access/users | Get users

<a name="zeroTrustUsersGetFailedLogins"></a>
# **zeroTrustUsersGetFailedLogins**
> FailedLoginResponse zeroTrustUsersGetFailedLogins(id, identifier)

Get failed logins

Get all failed login attempts for a single user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustUsersApi;

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


ZeroTrustUsersApi apiInstance = new ZeroTrustUsersApi();
UsersComponentsSchemasId id = new UsersComponentsSchemasId(); // UsersComponentsSchemasId | 
UsersComponentsSchemasIdentifier identifier = new UsersComponentsSchemasIdentifier(); // UsersComponentsSchemasIdentifier | 
try {
    FailedLoginResponse result = apiInstance.zeroTrustUsersGetFailedLogins(id, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustUsersApi#zeroTrustUsersGetFailedLogins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UsersComponentsSchemasId**](.md)|  |
 **identifier** | [**UsersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**FailedLoginResponse**](FailedLoginResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustUsersGetUsers"></a>
# **zeroTrustUsersGetUsers**
> UsersComponentsSchemasResponseCollection zeroTrustUsersGetUsers(identifier)

Get users

Gets a list of users for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustUsersApi;

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


ZeroTrustUsersApi apiInstance = new ZeroTrustUsersApi();
UsersComponentsSchemasIdentifier identifier = new UsersComponentsSchemasIdentifier(); // UsersComponentsSchemasIdentifier | 
try {
    UsersComponentsSchemasResponseCollection result = apiInstance.zeroTrustUsersGetUsers(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustUsersApi#zeroTrustUsersGetUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**UsersComponentsSchemasIdentifier**](.md)|  |

### Return type

[**UsersComponentsSchemasResponseCollection**](UsersComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

