# LogcontrolCmbConfigForAnAccountApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAccountsAccountIdentifierLogsControlCmbConfig**](LogcontrolCmbConfigForAnAccountApi.md#deleteAccountsAccountIdentifierLogsControlCmbConfig) | **DELETE** /accounts/{account_identifier}/logs/control/cmb/config | Delete CMB config
[**getAccountsAccountIdentifierLogsControlCmbConfig**](LogcontrolCmbConfigForAnAccountApi.md#getAccountsAccountIdentifierLogsControlCmbConfig) | **GET** /accounts/{account_identifier}/logs/control/cmb/config | Get CMB config
[**putAccountsAccountIdentifierLogsControlCmbConfig**](LogcontrolCmbConfigForAnAccountApi.md#putAccountsAccountIdentifierLogsControlCmbConfig) | **POST** /accounts/{account_identifier}/logs/control/cmb/config | Update CMB config

<a name="deleteAccountsAccountIdentifierLogsControlCmbConfig"></a>
# **deleteAccountsAccountIdentifierLogsControlCmbConfig**
> InlineResponse2004 deleteAccountsAccountIdentifierLogsControlCmbConfig(accountIdentifier)

Delete CMB config

Deletes CMB config.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogcontrolCmbConfigForAnAccountApi;

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


LogcontrolCmbConfigForAnAccountApi apiInstance = new LogcontrolCmbConfigForAnAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.deleteAccountsAccountIdentifierLogsControlCmbConfig(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogcontrolCmbConfigForAnAccountApi#deleteAccountsAccountIdentifierLogsControlCmbConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountsAccountIdentifierLogsControlCmbConfig"></a>
# **getAccountsAccountIdentifierLogsControlCmbConfig**
> CmbConfigResponseSingle getAccountsAccountIdentifierLogsControlCmbConfig(accountIdentifier)

Get CMB config

Gets CMB config.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogcontrolCmbConfigForAnAccountApi;

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


LogcontrolCmbConfigForAnAccountApi apiInstance = new LogcontrolCmbConfigForAnAccountApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CmbConfigResponseSingle result = apiInstance.getAccountsAccountIdentifierLogsControlCmbConfig(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogcontrolCmbConfigForAnAccountApi#getAccountsAccountIdentifierLogsControlCmbConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CmbConfigResponseSingle**](CmbConfigResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putAccountsAccountIdentifierLogsControlCmbConfig"></a>
# **putAccountsAccountIdentifierLogsControlCmbConfig**
> CmbConfigResponseSingle putAccountsAccountIdentifierLogsControlCmbConfig(body, accountIdentifier)

Update CMB config

Updates CMB config.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LogcontrolCmbConfigForAnAccountApi;

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


LogcontrolCmbConfigForAnAccountApi apiInstance = new LogcontrolCmbConfigForAnAccountApi();
CmbConfig body = new CmbConfig(); // CmbConfig | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CmbConfigResponseSingle result = apiInstance.putAccountsAccountIdentifierLogsControlCmbConfig(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogcontrolCmbConfigForAnAccountApi#putAccountsAccountIdentifierLogsControlCmbConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CmbConfig**](CmbConfig.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CmbConfigResponseSingle**](CmbConfigResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

