# ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings**](ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi.md#zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings) | **GET** /accounts/{identifier}/gateway/app_types | List Application and Application Type mappings

<a name="zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings"></a>
# **zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings**
> AppTypesComponentsSchemasResponseCollection zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings(identifier)

List Application and Application Type mappings

List all Application and Application Type mappings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi;

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


ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi apiInstance = new ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi();
String identifier = "identifier_example"; // String | 
try {
    AppTypesComponentsSchemasResponseCollection result = apiInstance.zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZeroTrustGatewayApplicationAndApplicationTypeMappingsApi#zeroTrustGatewayApplicationAndApplicationTypeMappingsListApplicationAndApplicationTypeMappings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**AppTypesComponentsSchemasResponseCollection**](AppTypesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

