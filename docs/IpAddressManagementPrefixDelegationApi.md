# IpAddressManagementPrefixDelegationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ipAddressManagementPrefixDelegationCreatePrefixDelegation**](IpAddressManagementPrefixDelegationApi.md#ipAddressManagementPrefixDelegationCreatePrefixDelegation) | **POST** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier}/delegations | Create Prefix Delegation
[**ipAddressManagementPrefixDelegationDeletePrefixDelegation**](IpAddressManagementPrefixDelegationApi.md#ipAddressManagementPrefixDelegationDeletePrefixDelegation) | **DELETE** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier}/delegations/{delegation_identifier} | Delete Prefix Delegation
[**ipAddressManagementPrefixDelegationListPrefixDelegations**](IpAddressManagementPrefixDelegationApi.md#ipAddressManagementPrefixDelegationListPrefixDelegations) | **GET** /accounts/{account_identifier}/addressing/prefixes/{prefix_identifier}/delegations | List Prefix Delegations

<a name="ipAddressManagementPrefixDelegationCreatePrefixDelegation"></a>
# **ipAddressManagementPrefixDelegationCreatePrefixDelegation**
> IpamDelegationsComponentsSchemasSingleResponse ipAddressManagementPrefixDelegationCreatePrefixDelegation(body, prefixIdentifier, accountIdentifier)

Create Prefix Delegation

Create a new account delegation for a given IP prefix.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixDelegationApi;

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


IpAddressManagementPrefixDelegationApi apiInstance = new IpAddressManagementPrefixDelegationApi();
PrefixIdentifierDelegationsBody body = new PrefixIdentifierDelegationsBody(); // PrefixIdentifierDelegationsBody | 
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    IpamDelegationsComponentsSchemasSingleResponse result = apiInstance.ipAddressManagementPrefixDelegationCreatePrefixDelegation(body, prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixDelegationApi#ipAddressManagementPrefixDelegationCreatePrefixDelegation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PrefixIdentifierDelegationsBody**](PrefixIdentifierDelegationsBody.md)|  |
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**IpamDelegationsComponentsSchemasSingleResponse**](IpamDelegationsComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementPrefixDelegationDeletePrefixDelegation"></a>
# **ipAddressManagementPrefixDelegationDeletePrefixDelegation**
> IpamDelegationsComponentsSchemasIdResponse ipAddressManagementPrefixDelegationDeletePrefixDelegation(delegationIdentifier, prefixIdentifier, accountIdentifier)

Delete Prefix Delegation

Delete an account delegation for a given IP prefix.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixDelegationApi;

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


IpAddressManagementPrefixDelegationApi apiInstance = new IpAddressManagementPrefixDelegationApi();
String delegationIdentifier = "delegationIdentifier_example"; // String | 
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    IpamDelegationsComponentsSchemasIdResponse result = apiInstance.ipAddressManagementPrefixDelegationDeletePrefixDelegation(delegationIdentifier, prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixDelegationApi#ipAddressManagementPrefixDelegationDeletePrefixDelegation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegationIdentifier** | [**String**](.md)|  |
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**IpamDelegationsComponentsSchemasIdResponse**](IpamDelegationsComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ipAddressManagementPrefixDelegationListPrefixDelegations"></a>
# **ipAddressManagementPrefixDelegationListPrefixDelegations**
> IpamDelegationsComponentsSchemasResponseCollection ipAddressManagementPrefixDelegationListPrefixDelegations(prefixIdentifier, accountIdentifier)

List Prefix Delegations

List all delegations for a given account IP prefix.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IpAddressManagementPrefixDelegationApi;

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


IpAddressManagementPrefixDelegationApi apiInstance = new IpAddressManagementPrefixDelegationApi();
String prefixIdentifier = "prefixIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    IpamDelegationsComponentsSchemasResponseCollection result = apiInstance.ipAddressManagementPrefixDelegationListPrefixDelegations(prefixIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IpAddressManagementPrefixDelegationApi#ipAddressManagementPrefixDelegationListPrefixDelegations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefixIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**IpamDelegationsComponentsSchemasResponseCollection**](IpamDelegationsComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

