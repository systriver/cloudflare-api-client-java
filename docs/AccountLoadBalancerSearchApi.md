# AccountLoadBalancerSearchApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountLoadBalancerSearchSearchResources**](AccountLoadBalancerSearchApi.md#accountLoadBalancerSearchSearchResources) | **GET** /accounts/{account_identifier}/load_balancers/search | Search Resources

<a name="accountLoadBalancerSearchSearchResources"></a>
# **accountLoadBalancerSearchSearchResources**
> InlineResponse2003 accountLoadBalancerSearchSearchResources(accountIdentifier)

Search Resources

Search for Load Balancing resources.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountLoadBalancerSearchApi;

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


AccountLoadBalancerSearchApi apiInstance = new AccountLoadBalancerSearchApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2003 result = apiInstance.accountLoadBalancerSearchSearchResources(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountLoadBalancerSearchApi#accountLoadBalancerSearchSearchResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

