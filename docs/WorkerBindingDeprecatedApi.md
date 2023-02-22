# WorkerBindingDeprecatedApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workerBindingDeprecatedListBindings**](WorkerBindingDeprecatedApi.md#workerBindingDeprecatedListBindings) | **GET** /zones/{zone_identifier}/workers/script/bindings | List Bindings

<a name="workerBindingDeprecatedListBindings"></a>
# **workerBindingDeprecatedListBindings**
> InlineResponse200171 workerBindingDeprecatedListBindings(zoneIdentifier)

List Bindings

List the bindings for a Workers script.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkerBindingDeprecatedApi;

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


WorkerBindingDeprecatedApi apiInstance = new WorkerBindingDeprecatedApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200171 result = apiInstance.workerBindingDeprecatedListBindings(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkerBindingDeprecatedApi#workerBindingDeprecatedListBindings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200171**](InlineResponse200171.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

