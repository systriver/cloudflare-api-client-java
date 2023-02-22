# AsnIntelligenceApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asnIntelligenceGetAsnOverview**](AsnIntelligenceApi.md#asnIntelligenceGetAsnOverview) | **GET** /accounts/{account_identifier}/intel/asn/{asn} | Get ASN Overview
[**asnIntelligenceGetAsnSubnets**](AsnIntelligenceApi.md#asnIntelligenceGetAsnSubnets) | **GET** /accounts/{account_identifier}/intel/asn/{asn}/subnets | Get ASN Subnets

<a name="asnIntelligenceGetAsnOverview"></a>
# **asnIntelligenceGetAsnOverview**
> AsnComponentsSchemasResponse asnIntelligenceGetAsnOverview(asn, accountIdentifier)

Get ASN Overview

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AsnIntelligenceApi;

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


AsnIntelligenceApi apiInstance = new AsnIntelligenceApi();
AsnComponentsSchemasAsn asn = new AsnComponentsSchemasAsn(); // AsnComponentsSchemasAsn | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AsnComponentsSchemasResponse result = apiInstance.asnIntelligenceGetAsnOverview(asn, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnIntelligenceApi#asnIntelligenceGetAsnOverview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asn** | [**AsnComponentsSchemasAsn**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AsnComponentsSchemasResponse**](AsnComponentsSchemasResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="asnIntelligenceGetAsnSubnets"></a>
# **asnIntelligenceGetAsnSubnets**
> InlineResponse2002 asnIntelligenceGetAsnSubnets(asn, accountIdentifier)

Get ASN Subnets

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AsnIntelligenceApi;

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


AsnIntelligenceApi apiInstance = new AsnIntelligenceApi();
AsnComponentsSchemasAsn asn = new AsnComponentsSchemasAsn(); // AsnComponentsSchemasAsn | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.asnIntelligenceGetAsnSubnets(asn, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsnIntelligenceApi#asnIntelligenceGetAsnSubnets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asn** | [**AsnComponentsSchemasAsn**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

