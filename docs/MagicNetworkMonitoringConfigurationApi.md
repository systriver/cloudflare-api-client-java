# MagicNetworkMonitoringConfigurationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**magicNetworkMonitoringConfigurationCreateAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationCreateAccountConfiguration) | **POST** /accounts/{account_identifier}/mnm/config | Create account configuration
[**magicNetworkMonitoringConfigurationDeleteAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationDeleteAccountConfiguration) | **DELETE** /accounts/{account_identifier}/mnm/config | Delete account configuration
[**magicNetworkMonitoringConfigurationListAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationListAccountConfiguration) | **GET** /accounts/{account_identifier}/mnm/config | List account configuration
[**magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration) | **GET** /accounts/{account_identifier}/mnm/config/full | List rules and account configuration
[**magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields) | **PATCH** /accounts/{account_identifier}/mnm/config | Update account configuration fields
[**magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration**](MagicNetworkMonitoringConfigurationApi.md#magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration) | **PUT** /accounts/{account_identifier}/mnm/config | Update an entire account configuration

<a name="magicNetworkMonitoringConfigurationCreateAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationCreateAccountConfiguration**
> MnmConfigSingleResponse magicNetworkMonitoringConfigurationCreateAccountConfiguration(accountIdentifier)

Create account configuration

Create a new network monitoring configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringConfigurationApi;

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


MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi();
ConfigComponentsSchemasAccountIdentifier accountIdentifier = new ConfigComponentsSchemasAccountIdentifier(); // ConfigComponentsSchemasAccountIdentifier | 
try {
    MnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationCreateAccountConfiguration(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationCreateAccountConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**ConfigComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmConfigSingleResponse**](MnmConfigSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicNetworkMonitoringConfigurationDeleteAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationDeleteAccountConfiguration**
> MnmConfigSingleResponse magicNetworkMonitoringConfigurationDeleteAccountConfiguration(accountIdentifier)

Delete account configuration

Delete an existing network monitoring configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringConfigurationApi;

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


MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi();
ConfigComponentsSchemasAccountIdentifier accountIdentifier = new ConfigComponentsSchemasAccountIdentifier(); // ConfigComponentsSchemasAccountIdentifier | 
try {
    MnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationDeleteAccountConfiguration(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationDeleteAccountConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**ConfigComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmConfigSingleResponse**](MnmConfigSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicNetworkMonitoringConfigurationListAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationListAccountConfiguration**
> MnmConfigSingleResponse magicNetworkMonitoringConfigurationListAccountConfiguration(accountIdentifier)

List account configuration

Lists default sampling and router IPs for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringConfigurationApi;

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


MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi();
ConfigComponentsSchemasAccountIdentifier accountIdentifier = new ConfigComponentsSchemasAccountIdentifier(); // ConfigComponentsSchemasAccountIdentifier | 
try {
    MnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationListAccountConfiguration(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationListAccountConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**ConfigComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmConfigSingleResponse**](MnmConfigSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration**
> MnmConfigSingleResponse magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration(accountIdentifier)

List rules and account configuration

Lists default sampling, router IPs, and rules for account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringConfigurationApi;

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


MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi();
ConfigComponentsSchemasAccountIdentifier accountIdentifier = new ConfigComponentsSchemasAccountIdentifier(); // ConfigComponentsSchemasAccountIdentifier | 
try {
    MnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationListRulesAndAccountConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**ConfigComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmConfigSingleResponse**](MnmConfigSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields"></a>
# **magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields**
> MnmConfigSingleResponse magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields(accountIdentifier)

Update account configuration fields

Update fields in an existing network monitoring configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringConfigurationApi;

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


MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi();
ConfigComponentsSchemasAccountIdentifier accountIdentifier = new ConfigComponentsSchemasAccountIdentifier(); // ConfigComponentsSchemasAccountIdentifier | 
try {
    MnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationUpdateAccountConfigurationFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**ConfigComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmConfigSingleResponse**](MnmConfigSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration"></a>
# **magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration**
> MnmConfigSingleResponse magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration(accountIdentifier)

Update an entire account configuration

Update an existing network monitoring configuration, requires the entire configuration to be updated at once.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicNetworkMonitoringConfigurationApi;

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


MagicNetworkMonitoringConfigurationApi apiInstance = new MagicNetworkMonitoringConfigurationApi();
ConfigComponentsSchemasAccountIdentifier accountIdentifier = new ConfigComponentsSchemasAccountIdentifier(); // ConfigComponentsSchemasAccountIdentifier | 
try {
    MnmConfigSingleResponse result = apiInstance.magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicNetworkMonitoringConfigurationApi#magicNetworkMonitoringConfigurationUpdateAnEntireAccountConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**ConfigComponentsSchemasAccountIdentifier**](.md)|  |

### Return type

[**MnmConfigSingleResponse**](MnmConfigSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

