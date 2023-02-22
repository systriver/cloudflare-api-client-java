# DurableObjectsNamespaceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**durableObjectsNamespaceListNamespaces**](DurableObjectsNamespaceApi.md#durableObjectsNamespaceListNamespaces) | **GET** /accounts/{account_identifier}/workers/durable_objects/namespaces | List Namespaces
[**durableObjectsNamespaceListObjects**](DurableObjectsNamespaceApi.md#durableObjectsNamespaceListObjects) | **GET** /accounts/{account_identifier}/workers/durable_objects/namespaces/{id}/objects | List Objects

<a name="durableObjectsNamespaceListNamespaces"></a>
# **durableObjectsNamespaceListNamespaces**
> InlineResponse20015 durableObjectsNamespaceListNamespaces(accountIdentifier)

List Namespaces

Returns the namespaces owned by an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DurableObjectsNamespaceApi;

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


DurableObjectsNamespaceApi apiInstance = new DurableObjectsNamespaceApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20015 result = apiInstance.durableObjectsNamespaceListNamespaces(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DurableObjectsNamespaceApi#durableObjectsNamespaceListNamespaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="durableObjectsNamespaceListObjects"></a>
# **durableObjectsNamespaceListObjects**
> InlineResponse20016 durableObjectsNamespaceListObjects(id, accountIdentifier)

List Objects

Returns the Durable Objects in a given namespace.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DurableObjectsNamespaceApi;

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


DurableObjectsNamespaceApi apiInstance = new DurableObjectsNamespaceApi();
String id = "id_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse20016 result = apiInstance.durableObjectsNamespaceListObjects(id, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DurableObjectsNamespaceApi#durableObjectsNamespaceListObjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

