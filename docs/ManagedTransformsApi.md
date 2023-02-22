# ManagedTransformsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**managedTransformsListManagedTransforms**](ManagedTransformsApi.md#managedTransformsListManagedTransforms) | **GET** /zones/{zone_id}/managed_headers | List Managed Transforms
[**managedTransformsUpdateStatusOfManagedTransforms**](ManagedTransformsApi.md#managedTransformsUpdateStatusOfManagedTransforms) | **PATCH** /zones/{zone_id}/managed_headers | Update status of Managed Transforms

<a name="managedTransformsListManagedTransforms"></a>
# **managedTransformsListManagedTransforms**
> InlineResponse200174 managedTransformsListManagedTransforms(zoneId)

List Managed Transforms

Fetches a list of all Managed Transforms.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagedTransformsApi;

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


ManagedTransformsApi apiInstance = new ManagedTransformsApi();
String zoneId = "zoneId_example"; // String | 
try {
    InlineResponse200174 result = apiInstance.managedTransformsListManagedTransforms(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagedTransformsApi#managedTransformsListManagedTransforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**InlineResponse200174**](InlineResponse200174.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="managedTransformsUpdateStatusOfManagedTransforms"></a>
# **managedTransformsUpdateStatusOfManagedTransforms**
> InlineResponse200175 managedTransformsUpdateStatusOfManagedTransforms(body, zoneId)

Update status of Managed Transforms

Updates the status of one or more Managed Transforms.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ManagedTransformsApi;

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


ManagedTransformsApi apiInstance = new ManagedTransformsApi();
ZoneIdManagedHeadersBody body = new ZoneIdManagedHeadersBody(); // ZoneIdManagedHeadersBody | 
String zoneId = "zoneId_example"; // String | 
try {
    InlineResponse200175 result = apiInstance.managedTransformsUpdateStatusOfManagedTransforms(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ManagedTransformsApi#managedTransformsUpdateStatusOfManagedTransforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdManagedHeadersBody**](ZoneIdManagedHeadersBody.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**InlineResponse200175**](InlineResponse200175.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

