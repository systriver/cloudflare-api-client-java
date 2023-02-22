# AccountLevelCustomNameserversApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountLevelCustomNameserversAddAccountCustomNameserver**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversAddAccountCustomNameserver) | **POST** /accounts/{identifier}/custom_ns | Add Account Custom Nameserver
[**accountLevelCustomNameserversDeleteAccountCustomNameserver**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversDeleteAccountCustomNameserver) | **DELETE** /accounts/{identifier}/custom_ns/{ns_name} | Delete Account Custom Nameserver
[**accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers) | **GET** /accounts/{identifier}/custom_ns/availability | Get Eligible Zones for Account Custom Nameservers
[**accountLevelCustomNameserversListAccountCustomNameservers**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversListAccountCustomNameservers) | **GET** /accounts/{identifier}/custom_ns | List Account Custom Nameservers
[**accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords**](AccountLevelCustomNameserversApi.md#accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords) | **POST** /accounts/{identifier}/custom_ns/verify | Verify Account Custom Nameserver Glue Records

<a name="accountLevelCustomNameserversAddAccountCustomNameserver"></a>
# **accountLevelCustomNameserversAddAccountCustomNameserver**
> AcnsResponseSingle accountLevelCustomNameserversAddAccountCustomNameserver(body, identifier)

Add Account Custom Nameserver

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLevelCustomNameserversApi;

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


AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi();
CustomNSInput body = new CustomNSInput(); // CustomNSInput | 
String identifier = "identifier_example"; // String | 
try {
    AcnsResponseSingle result = apiInstance.accountLevelCustomNameserversAddAccountCustomNameserver(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversAddAccountCustomNameserver");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomNSInput**](CustomNSInput.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**AcnsResponseSingle**](AcnsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLevelCustomNameserversDeleteAccountCustomNameserver"></a>
# **accountLevelCustomNameserversDeleteAccountCustomNameserver**
> CloudflareClientAPIEmptyResponse accountLevelCustomNameserversDeleteAccountCustomNameserver(nsName, identifier)

Delete Account Custom Nameserver

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLevelCustomNameserversApi;

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


AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi();
String nsName = "nsName_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPIEmptyResponse result = apiInstance.accountLevelCustomNameserversDeleteAccountCustomNameserver(nsName, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversDeleteAccountCustomNameserver");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nsName** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPIEmptyResponse**](CloudflareClientAPIEmptyResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers"></a>
# **accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers**
> AvailabilityResponse accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers(identifier)

Get Eligible Zones for Account Custom Nameservers

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLevelCustomNameserversApi;

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


AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi();
String identifier = "identifier_example"; // String | 
try {
    AvailabilityResponse result = apiInstance.accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversGetEligibleZonesForAccountCustomNameservers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**AvailabilityResponse**](AvailabilityResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLevelCustomNameserversListAccountCustomNameservers"></a>
# **accountLevelCustomNameserversListAccountCustomNameservers**
> AcnsResponseCollection accountLevelCustomNameserversListAccountCustomNameservers(identifier)

List Account Custom Nameservers

List an account&#x27;s custom nameservers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLevelCustomNameserversApi;

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


AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi();
String identifier = "identifier_example"; // String | 
try {
    AcnsResponseCollection result = apiInstance.accountLevelCustomNameserversListAccountCustomNameservers(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversListAccountCustomNameservers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**AcnsResponseCollection**](AcnsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords"></a>
# **accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords**
> AcnsResponseCollection accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords(identifier)

Verify Account Custom Nameserver Glue Records

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLevelCustomNameserversApi;

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


AccountLevelCustomNameserversApi apiInstance = new AccountLevelCustomNameserversApi();
String identifier = "identifier_example"; // String | 
try {
    AcnsResponseCollection result = apiInstance.accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLevelCustomNameserversApi#accountLevelCustomNameserversVerifyAccountCustomNameserverGlueRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**AcnsResponseCollection**](AcnsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

