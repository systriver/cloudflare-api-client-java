# AccountRequestTracerApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountRequestTracerRequestTrace**](AccountRequestTracerApi.md#accountRequestTracerRequestTrace) | **POST** /accounts/{account_identifier}/request-tracer/trace | Request Trace

<a name="accountRequestTracerRequestTrace"></a>
# **accountRequestTracerRequestTrace**
> InlineResponse2005 accountRequestTracerRequestTrace(body, accountIdentifier)

Request Trace

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountRequestTracerApi;

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


AccountRequestTracerApi apiInstance = new AccountRequestTracerApi();
RequesttracerTraceBody body = new RequesttracerTraceBody(); // RequesttracerTraceBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2005 result = apiInstance.accountRequestTracerRequestTrace(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountRequestTracerApi#accountRequestTracerRequestTrace");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequesttracerTraceBody**](RequesttracerTraceBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

