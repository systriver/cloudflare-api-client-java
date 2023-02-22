# DomainIntelligenceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**domainIntelligenceGetDomainDetails**](DomainIntelligenceApi.md#domainIntelligenceGetDomainDetails) | **GET** /accounts/{account_identifier}/intel/domain | Get Domain Details
[**domainIntelligenceGetMultipleDomainDetails**](DomainIntelligenceApi.md#domainIntelligenceGetMultipleDomainDetails) | **GET** /accounts/{account_identifier}/intel/domain/bulk | Get Multiple Domain Details

<a name="domainIntelligenceGetDomainDetails"></a>
# **domainIntelligenceGetDomainDetails**
> DomainComponentsSchemasSingleResponse domainIntelligenceGetDomainDetails(accountIdentifier)

Get Domain Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainIntelligenceApi;

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


DomainIntelligenceApi apiInstance = new DomainIntelligenceApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    DomainComponentsSchemasSingleResponse result = apiInstance.domainIntelligenceGetDomainDetails(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainIntelligenceApi#domainIntelligenceGetDomainDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**DomainComponentsSchemasSingleResponse**](DomainComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="domainIntelligenceGetMultipleDomainDetails"></a>
# **domainIntelligenceGetMultipleDomainDetails**
> SchemasCollectionResponse domainIntelligenceGetMultipleDomainDetails(accountIdentifier)

Get Multiple Domain Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainIntelligenceApi;

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


DomainIntelligenceApi apiInstance = new DomainIntelligenceApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    SchemasCollectionResponse result = apiInstance.domainIntelligenceGetMultipleDomainDetails(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainIntelligenceApi#domainIntelligenceGetMultipleDomainDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**SchemasCollectionResponse**](SchemasCollectionResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

