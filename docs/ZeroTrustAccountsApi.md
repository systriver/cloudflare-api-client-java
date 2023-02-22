# ZeroTrustAccountsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustAccountsCreateZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsCreateZeroTrustAccount) | **POST** /accounts/{identifier}/gateway | Create Zero Trust account
[**zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount) | **GET** /accounts/{identifier}/devices/settings | Get device settings for Zero Trust account
[**zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount) | **GET** /accounts/{identifier}/gateway/logging | Get logging settings for the Zero Trust account
[**zeroTrustAccountsGetZeroTrustAccountConfiguration**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetZeroTrustAccountConfiguration) | **GET** /accounts/{identifier}/gateway/configuration | Get Zero Trust account configuration
[**zeroTrustAccountsGetZeroTrustAccountInformation**](ZeroTrustAccountsApi.md#zeroTrustAccountsGetZeroTrustAccountInformation) | **GET** /accounts/{identifier}/gateway | Get Zero Trust account information
[**zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount) | **PUT** /accounts/{identifier}/devices/settings | Update device settings for the Zero Trust account
[**zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount**](ZeroTrustAccountsApi.md#zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount) | **PUT** /accounts/{identifier}/gateway/logging | Update logging settings for the Zero Trust account
[**zeroTrustAccountsUpdateZeroTrustAccountConfiguration**](ZeroTrustAccountsApi.md#zeroTrustAccountsUpdateZeroTrustAccountConfiguration) | **PUT** /accounts/{identifier}/gateway/configuration | Update Zero Trust account configuration

<a name="zeroTrustAccountsCreateZeroTrustAccount"></a>
# **zeroTrustAccountsCreateZeroTrustAccount**
> GatewayAccount zeroTrustAccountsCreateZeroTrustAccount(body, identifier)

Create Zero Trust account

Create Zero Trust account with existing cloudflare account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
IdentifierGatewayBody body = new IdentifierGatewayBody(); // IdentifierGatewayBody | 
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccount result = apiInstance.zeroTrustAccountsCreateZeroTrustAccount(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsCreateZeroTrustAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentifierGatewayBody**](IdentifierGatewayBody.md)|  |
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccount**](GatewayAccount.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount"></a>
# **zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount**
> GatewayAccountDeviceSettingsResponse zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount(identifier)

Get device settings for Zero Trust account

Describes the current device settings Zero Trust account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccountDeviceSettingsResponse result = apiInstance.zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetDeviceSettingsForZeroTrustAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccountDeviceSettingsResponse**](GatewayAccountDeviceSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount"></a>
# **zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount**
> GatewayAccountLoggingSettingsResponse zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount(identifier)

Get logging settings for the Zero Trust account

Describes the current logging settings for Zero Trust account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccountLoggingSettingsResponse result = apiInstance.zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetLoggingSettingsForTheZeroTrustAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccountLoggingSettingsResponse**](GatewayAccountLoggingSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustAccountsGetZeroTrustAccountConfiguration"></a>
# **zeroTrustAccountsGetZeroTrustAccountConfiguration**
> GatewayAccountConfig zeroTrustAccountsGetZeroTrustAccountConfiguration(identifier)

Get Zero Trust account configuration

Describes current Zero Trust account configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccountConfig result = apiInstance.zeroTrustAccountsGetZeroTrustAccountConfiguration(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetZeroTrustAccountConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccountConfig**](GatewayAccountConfig.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustAccountsGetZeroTrustAccountInformation"></a>
# **zeroTrustAccountsGetZeroTrustAccountInformation**
> GatewayAccount zeroTrustAccountsGetZeroTrustAccountInformation(identifier)

Get Zero Trust account information

Get Zero Trust account information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccount result = apiInstance.zeroTrustAccountsGetZeroTrustAccountInformation(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsGetZeroTrustAccountInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccount**](GatewayAccount.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount"></a>
# **zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount**
> GatewayAccountDeviceSettingsResponse zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount(body, identifier)

Update device settings for the Zero Trust account

Updates the current device settings for Zero Trust account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
GatewayAccountDeviceSettings body = new GatewayAccountDeviceSettings(); // GatewayAccountDeviceSettings | 
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccountDeviceSettingsResponse result = apiInstance.zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsUpdateDeviceSettingsForTheZeroTrustAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayAccountDeviceSettings**](GatewayAccountDeviceSettings.md)|  |
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccountDeviceSettingsResponse**](GatewayAccountDeviceSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount"></a>
# **zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount**
> GatewayAccountLoggingSettingsResponse zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount(body, identifier)

Update logging settings for the Zero Trust account

Updates the current logging settings for the Zero Trust accounty.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
GatewayAccountLoggingSettings body = new GatewayAccountLoggingSettings(); // GatewayAccountLoggingSettings | 
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccountLoggingSettingsResponse result = apiInstance.zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsUpdateLoggingSettingsForTheZeroTrustAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayAccountLoggingSettings**](GatewayAccountLoggingSettings.md)|  |
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccountLoggingSettingsResponse**](GatewayAccountLoggingSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zeroTrustAccountsUpdateZeroTrustAccountConfiguration"></a>
# **zeroTrustAccountsUpdateZeroTrustAccountConfiguration**
> GatewayAccountConfig zeroTrustAccountsUpdateZeroTrustAccountConfiguration(body, identifier)

Update Zero Trust account configuration

Updates the current Zero Trust account configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustAccountsApi;

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


ZeroTrustAccountsApi apiInstance = new ZeroTrustAccountsApi();
GatewayAccountSettings body = new GatewayAccountSettings(); // GatewayAccountSettings | 
AccountsComponentsSchemasIdentifier identifier = new AccountsComponentsSchemasIdentifier(); // AccountsComponentsSchemasIdentifier | 
try {
    GatewayAccountConfig result = apiInstance.zeroTrustAccountsUpdateZeroTrustAccountConfiguration(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustAccountsApi#zeroTrustAccountsUpdateZeroTrustAccountConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GatewayAccountSettings**](GatewayAccountSettings.md)|  |
 **identifier** | [**AccountsComponentsSchemasIdentifier**](.md)|  |

### Return type

[**GatewayAccountConfig**](GatewayAccountConfig.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

