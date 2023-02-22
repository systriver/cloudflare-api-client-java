# SsltlsModeRecommendationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslTlsModeRecommendationSslTlsRecommendation**](SsltlsModeRecommendationApi.md#sslTlsModeRecommendationSslTlsRecommendation) | **GET** /zones/{zone_identifier}/ssl/recommendation | SSL/TLS Recommendation

<a name="sslTlsModeRecommendationSslTlsRecommendation"></a>
# **sslTlsModeRecommendationSslTlsRecommendation**
> InlineResponse200170 sslTlsModeRecommendationSslTlsRecommendation(zoneIdentifier)

SSL/TLS Recommendation

Retrieve the SSL/TLS Recommender&#x27;s recommendation for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SsltlsModeRecommendationApi;

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


SsltlsModeRecommendationApi apiInstance = new SsltlsModeRecommendationApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200170 result = apiInstance.sslTlsModeRecommendationSslTlsRecommendation(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsltlsModeRecommendationApi#sslTlsModeRecommendationSslTlsRecommendation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200170**](InlineResponse200170.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

