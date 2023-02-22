# CustomErrorResponsesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customErrorResponsesGetCustomErrorResponses**](CustomErrorResponsesApi.md#customErrorResponsesGetCustomErrorResponses) | **GET** /zones/{zone_id}/rulesets/phases/http_custom_errors/entrypoint | Get Custom Error Responses
[**customErrorResponsesUpdateCustomErrorResponses**](CustomErrorResponsesApi.md#customErrorResponsesUpdateCustomErrorResponses) | **PUT** /zones/{zone_id}/rulesets/phases/http_custom_errors/entrypoint | Update Custom Error Responses

<a name="customErrorResponsesGetCustomErrorResponses"></a>
# **customErrorResponsesGetCustomErrorResponses**
> CustomErrorResponsesComponentsSchemasRuleset customErrorResponsesGetCustomErrorResponses(zoneId)

Get Custom Error Responses

Fetches all Custom Error Responses in a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomErrorResponsesApi;

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


CustomErrorResponsesApi apiInstance = new CustomErrorResponsesApi();
String zoneId = "zoneId_example"; // String | 
try {
    CustomErrorResponsesComponentsSchemasRuleset result = apiInstance.customErrorResponsesGetCustomErrorResponses(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomErrorResponsesApi#customErrorResponsesGetCustomErrorResponses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | [**String**](.md)|  |

### Return type

[**CustomErrorResponsesComponentsSchemasRuleset**](CustomErrorResponsesComponentsSchemasRuleset.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customErrorResponsesUpdateCustomErrorResponses"></a>
# **customErrorResponsesUpdateCustomErrorResponses**
> ApiResponseSingle customErrorResponsesUpdateCustomErrorResponses(body, zoneId)

Update Custom Error Responses

Updates the Custom Error Responses of a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomErrorResponsesApi;

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


CustomErrorResponsesApi apiInstance = new CustomErrorResponsesApi();
UpdateRuleset body = new UpdateRuleset(); // UpdateRuleset | 
String zoneId = "zoneId_example"; // String | 
try {
    ApiResponseSingle result = apiInstance.customErrorResponsesUpdateCustomErrorResponses(body, zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomErrorResponsesApi#customErrorResponsesUpdateCustomErrorResponses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateRuleset**](UpdateRuleset.md)|  |
 **zoneId** | [**String**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

