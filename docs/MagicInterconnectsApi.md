# MagicInterconnectsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**magicInterconnectsListInterconnectDetails**](MagicInterconnectsApi.md#magicInterconnectsListInterconnectDetails) | **GET** /accounts/{account_identifier}/magic/cf_interconnects/{tunnel_identifier} | List interconnect Details
[**magicInterconnectsListInterconnects**](MagicInterconnectsApi.md#magicInterconnectsListInterconnects) | **GET** /accounts/{account_identifier}/magic/cf_interconnects | List interconnects
[**magicInterconnectsUpdateInterconnect**](MagicInterconnectsApi.md#magicInterconnectsUpdateInterconnect) | **PUT** /accounts/{account_identifier}/magic/cf_interconnects/{tunnel_identifier} | Update interconnect
[**magicInterconnectsUpdateMultipleInterconnects**](MagicInterconnectsApi.md#magicInterconnectsUpdateMultipleInterconnects) | **PUT** /accounts/{account_identifier}/magic/cf_interconnects | Update multiple interconnects

<a name="magicInterconnectsListInterconnectDetails"></a>
# **magicInterconnectsListInterconnectDetails**
> ComponentsSchemasTunnelSingleResponse magicInterconnectsListInterconnectDetails(tunnelIdentifier, accountIdentifier)

List interconnect Details

Lists details for a specific interconnect.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicInterconnectsApi;

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


MagicInterconnectsApi apiInstance = new MagicInterconnectsApi();
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ComponentsSchemasTunnelSingleResponse result = apiInstance.magicInterconnectsListInterconnectDetails(tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsListInterconnectDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasTunnelSingleResponse**](ComponentsSchemasTunnelSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicInterconnectsListInterconnects"></a>
# **magicInterconnectsListInterconnects**
> ComponentsSchemasTunnelsCollectionResponse magicInterconnectsListInterconnects(accountIdentifier)

List interconnects

Lists interconnects associated with an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicInterconnectsApi;

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


MagicInterconnectsApi apiInstance = new MagicInterconnectsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ComponentsSchemasTunnelsCollectionResponse result = apiInstance.magicInterconnectsListInterconnects(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsListInterconnects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasTunnelsCollectionResponse**](ComponentsSchemasTunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="magicInterconnectsUpdateInterconnect"></a>
# **magicInterconnectsUpdateInterconnect**
> ComponentsSchemasTunnelModifiedResponse magicInterconnectsUpdateInterconnect(body, tunnelIdentifier, accountIdentifier)

Update interconnect

Updates a specific interconnect associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicInterconnectsApi;

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


MagicInterconnectsApi apiInstance = new MagicInterconnectsApi();
ComponentsSchemasTunnelUpdateRequest body = new ComponentsSchemasTunnelUpdateRequest(); // ComponentsSchemasTunnelUpdateRequest | 
String tunnelIdentifier = "tunnelIdentifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ComponentsSchemasTunnelModifiedResponse result = apiInstance.magicInterconnectsUpdateInterconnect(body, tunnelIdentifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsUpdateInterconnect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComponentsSchemasTunnelUpdateRequest**](ComponentsSchemasTunnelUpdateRequest.md)|  |
 **tunnelIdentifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasTunnelModifiedResponse**](ComponentsSchemasTunnelModifiedResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="magicInterconnectsUpdateMultipleInterconnects"></a>
# **magicInterconnectsUpdateMultipleInterconnects**
> ComponentsSchemasModifiedTunnelsCollectionResponse magicInterconnectsUpdateMultipleInterconnects(body, accountIdentifier)

Update multiple interconnects

Updates multiple interconnects associated with an account. Use &#x60;?validate_only&#x3D;true&#x60; as an optional query parameter to only run validation without persisting changes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MagicInterconnectsApi;

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


MagicInterconnectsApi apiInstance = new MagicInterconnectsApi();
Object body = null; // Object | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    ComponentsSchemasModifiedTunnelsCollectionResponse result = apiInstance.magicInterconnectsUpdateMultipleInterconnects(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MagicInterconnectsApi#magicInterconnectsUpdateMultipleInterconnects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasModifiedTunnelsCollectionResponse**](ComponentsSchemasModifiedTunnelsCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

