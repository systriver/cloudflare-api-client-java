# LoadBalancerRegionsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loadBalancerRegionsGetRegion**](LoadBalancerRegionsApi.md#loadBalancerRegionsGetRegion) | **GET** /accounts/{account_identifier}/load_balancers/regions/{region_code} | Get Region
[**loadBalancerRegionsListRegions**](LoadBalancerRegionsApi.md#loadBalancerRegionsListRegions) | **GET** /accounts/{account_identifier}/load_balancers/regions | List Regions

<a name="loadBalancerRegionsGetRegion"></a>
# **loadBalancerRegionsGetRegion**
> RegionComponentsSchemasSingleResponse loadBalancerRegionsGetRegion(regionCode, accountIdentifier)

Get Region

Get a single region mapping.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerRegionsApi;

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


LoadBalancerRegionsApi apiInstance = new LoadBalancerRegionsApi();
RegionCode regionCode = new RegionCode(); // RegionCode | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RegionComponentsSchemasSingleResponse result = apiInstance.loadBalancerRegionsGetRegion(regionCode, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerRegionsApi#loadBalancerRegionsGetRegion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionCode** | [**RegionCode**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RegionComponentsSchemasSingleResponse**](RegionComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerRegionsListRegions"></a>
# **loadBalancerRegionsListRegions**
> RegionComponentsSchemasResponseCollection loadBalancerRegionsListRegions(accountIdentifier)

List Regions

List all region mappings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerRegionsApi;

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


LoadBalancerRegionsApi apiInstance = new LoadBalancerRegionsApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    RegionComponentsSchemasResponseCollection result = apiInstance.loadBalancerRegionsListRegions(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerRegionsApi#loadBalancerRegionsListRegions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**RegionComponentsSchemasResponseCollection**](RegionComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

