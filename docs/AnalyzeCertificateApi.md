# AnalyzeCertificateApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeCertificateAnalyzeCertificate**](AnalyzeCertificateApi.md#analyzeCertificateAnalyzeCertificate) | **POST** /zones/{identifier}/ssl/analyze | Analyze Certificate

<a name="analyzeCertificateAnalyzeCertificate"></a>
# **analyzeCertificateAnalyzeCertificate**
> CertificateAnalyzeResponse analyzeCertificateAnalyzeCertificate(body, identifier)

Analyze Certificate

Returns the set of hostnames, the signature algorithm, and the expiration date of the certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalyzeCertificateApi;

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


AnalyzeCertificateApi apiInstance = new AnalyzeCertificateApi();
SslAnalyzeBody body = new SslAnalyzeBody(); // SslAnalyzeBody | 
String identifier = "identifier_example"; // String | 
try {
    CertificateAnalyzeResponse result = apiInstance.analyzeCertificateAnalyzeCertificate(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalyzeCertificateApi#analyzeCertificateAnalyzeCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SslAnalyzeBody**](SslAnalyzeBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CertificateAnalyzeResponse**](CertificateAnalyzeResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

