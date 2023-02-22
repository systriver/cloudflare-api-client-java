# SslVerificationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslVerificationEditSslCertificatePackValidationMethod**](SslVerificationApi.md#sslVerificationEditSslCertificatePackValidationMethod) | **PATCH** /zones/{zone_identifier}/ssl/verification/{cert_pack_uuid} | Edit SSL Certificate Pack Validation Method
[**sslVerificationSslVerificationDetails**](SslVerificationApi.md#sslVerificationSslVerificationDetails) | **GET** /zones/{zone_identifier}/ssl/verification | SSL Verification Details

<a name="sslVerificationEditSslCertificatePackValidationMethod"></a>
# **sslVerificationEditSslCertificatePackValidationMethod**
> SslValidationMethodResponseCollection sslVerificationEditSslCertificatePackValidationMethod(body, certPackUuid, zoneIdentifier)

Edit SSL Certificate Pack Validation Method

Edit SSL validation method for a certificate pack. A PATCH request will request an immediate validation check on any certificate, and return the updated status. If a validation method is provided, the validation will be immediately attempted using that method.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SslVerificationApi;

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


SslVerificationApi apiInstance = new SslVerificationApi();
ComponentsSchemasValidationMethod body = new ComponentsSchemasValidationMethod(); // ComponentsSchemasValidationMethod | 
String certPackUuid = "certPackUuid_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SslValidationMethodResponseCollection result = apiInstance.sslVerificationEditSslCertificatePackValidationMethod(body, certPackUuid, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SslVerificationApi#sslVerificationEditSslCertificatePackValidationMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ComponentsSchemasValidationMethod**](ComponentsSchemasValidationMethod.md)|  |
 **certPackUuid** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SslValidationMethodResponseCollection**](SslValidationMethodResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sslVerificationSslVerificationDetails"></a>
# **sslVerificationSslVerificationDetails**
> SslVerificationResponseCollection sslVerificationSslVerificationDetails(zoneIdentifier)

SSL Verification Details

Get SSL Verification Info for a Zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SslVerificationApi;

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


SslVerificationApi apiInstance = new SslVerificationApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    SslVerificationResponseCollection result = apiInstance.sslVerificationSslVerificationDetails(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SslVerificationApi#sslVerificationSslVerificationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**SslVerificationResponseCollection**](SslVerificationResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

