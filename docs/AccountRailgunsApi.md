# AccountRailgunsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountRailgunsCreateRailgun**](AccountRailgunsApi.md#accountRailgunsCreateRailgun) | **POST** /accounts/{account_identifier}/railguns | Create Railgun
[**accountRailgunsDeleteARailgun**](AccountRailgunsApi.md#accountRailgunsDeleteARailgun) | **DELETE** /accounts/{account_identifier}/railguns/{identifier} | Delete a Railgun
[**accountRailgunsListRailguns**](AccountRailgunsApi.md#accountRailgunsListRailguns) | **GET** /accounts/{account_identifier}/railguns | List Railguns
[**accountRailgunsRailgunDetails**](AccountRailgunsApi.md#accountRailgunsRailgunDetails) | **GET** /accounts/{account_identifier}/railguns/{identifier} | Railgun details
[**accountRailgunsUpdateRailgun**](AccountRailgunsApi.md#accountRailgunsUpdateRailgun) | **PUT** /accounts/{account_identifier}/railguns/{identifier} | Update Railgun

<a name="accountRailgunsCreateRailgun"></a>
# **accountRailgunsCreateRailgun**
> RailgunResponseSingle accountRailgunsCreateRailgun(body, accountIdentifier)

Create Railgun

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRailgunsApi;

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


AccountRailgunsApi apiInstance = new AccountRailgunsApi();
AccountIdentifierRailgunsBody body = new AccountIdentifierRailgunsBody(); // AccountIdentifierRailgunsBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.accountRailgunsCreateRailgun(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRailgunsApi#accountRailgunsCreateRailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountIdentifierRailgunsBody**](AccountIdentifierRailgunsBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRailgunsDeleteARailgun"></a>
# **accountRailgunsDeleteARailgun**
> RailgunResponseSingleId accountRailgunsDeleteARailgun(identifier, accountIdentifier)

Delete a Railgun

Disable and delete a Railgun. This will immediately disable the Railgun for any connected zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRailgunsApi;

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


AccountRailgunsApi apiInstance = new AccountRailgunsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RailgunResponseSingleId result = apiInstance.accountRailgunsDeleteARailgun(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRailgunsApi#accountRailgunsDeleteARailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingleId**](RailgunResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountRailgunsListRailguns"></a>
# **accountRailgunsListRailguns**
> RailgunResponseCollection accountRailgunsListRailguns(accountIdentifier)

List Railguns

List, search, sort and filter your Railguns.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRailgunsApi;

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


AccountRailgunsApi apiInstance = new AccountRailgunsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RailgunResponseCollection result = apiInstance.accountRailgunsListRailguns(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRailgunsApi#accountRailgunsListRailguns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseCollection**](RailgunResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRailgunsRailgunDetails"></a>
# **accountRailgunsRailgunDetails**
> RailgunResponseSingle accountRailgunsRailgunDetails(identifier, accountIdentifier)

Railgun details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRailgunsApi;

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


AccountRailgunsApi apiInstance = new AccountRailgunsApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.accountRailgunsRailgunDetails(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRailgunsApi#accountRailgunsRailgunDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountRailgunsUpdateRailgun"></a>
# **accountRailgunsUpdateRailgun**
> RailgunResponseSingle accountRailgunsUpdateRailgun(body, identifier, accountIdentifier)

Update Railgun

Update a Railgun.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRailgunsApi;

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


AccountRailgunsApi apiInstance = new AccountRailgunsApi();
SchemasRailgun body = new SchemasRailgun(); // SchemasRailgun | 
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RailgunResponseSingle result = apiInstance.accountRailgunsUpdateRailgun(body, identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRailgunsApi#accountRailgunsUpdateRailgun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SchemasRailgun**](SchemasRailgun.md)|  |
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RailgunResponseSingle**](RailgunResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

