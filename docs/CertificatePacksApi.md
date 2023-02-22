# CertificatePacksApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**certificatePacksDeleteAdvancedCertificateManagerCertificatePack**](CertificatePacksApi.md#certificatePacksDeleteAdvancedCertificateManagerCertificatePack) | **DELETE** /zones/{zone_identifier}/ssl/certificate_packs/{identifier} | Delete Advanced Certificate Manager Certificate Pack
[**certificatePacksGetCertificatePack**](CertificatePacksApi.md#certificatePacksGetCertificatePack) | **GET** /zones/{zone_identifier}/ssl/certificate_packs/{identifier} | Get Certificate Pack
[**certificatePacksGetCertificatePackQuotas**](CertificatePacksApi.md#certificatePacksGetCertificatePackQuotas) | **GET** /zones/{zone_identifier}/ssl/certificate_packs/quota | Get Certificate Pack Quotas
[**certificatePacksListCertificatePacks**](CertificatePacksApi.md#certificatePacksListCertificatePacks) | **GET** /zones/{zone_identifier}/ssl/certificate_packs | List Certificate Packs
[**certificatePacksOrderAdvancedCertificateManagerCertificatePack**](CertificatePacksApi.md#certificatePacksOrderAdvancedCertificateManagerCertificatePack) | **POST** /zones/{zone_identifier}/ssl/certificate_packs/order | Order Advanced Certificate Manager Certificate Pack
[**certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack**](CertificatePacksApi.md#certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack) | **PATCH** /zones/{zone_identifier}/ssl/certificate_packs/{identifier} | Restart Validation for Advanced Certificate Manager Certificate Pack

<a name="certificatePacksDeleteAdvancedCertificateManagerCertificatePack"></a>
# **certificatePacksDeleteAdvancedCertificateManagerCertificatePack**
> DeleteAdvancedCertificatePackResponseSingle certificatePacksDeleteAdvancedCertificateManagerCertificatePack(identifier, zoneIdentifier)

Delete Advanced Certificate Manager Certificate Pack

For a given zone, delete an advanced certificate pack.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificatePacksApi;

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


CertificatePacksApi apiInstance = new CertificatePacksApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DeleteAdvancedCertificatePackResponseSingle result = apiInstance.certificatePacksDeleteAdvancedCertificateManagerCertificatePack(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatePacksApi#certificatePacksDeleteAdvancedCertificateManagerCertificatePack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DeleteAdvancedCertificatePackResponseSingle**](DeleteAdvancedCertificatePackResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="certificatePacksGetCertificatePack"></a>
# **certificatePacksGetCertificatePack**
> CertificatePackResponseSingle certificatePacksGetCertificatePack(identifier, zoneIdentifier)

Get Certificate Pack

For a given zone, get a certificate pack.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificatePacksApi;

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


CertificatePacksApi apiInstance = new CertificatePacksApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificatePackResponseSingle result = apiInstance.certificatePacksGetCertificatePack(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatePacksApi#certificatePacksGetCertificatePack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificatePackResponseSingle**](CertificatePackResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="certificatePacksGetCertificatePackQuotas"></a>
# **certificatePacksGetCertificatePackQuotas**
> CertificatePackQuotaResponse certificatePacksGetCertificatePackQuotas(zoneIdentifier)

Get Certificate Pack Quotas

For a given zone, list certificate pack quotas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificatePacksApi;

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


CertificatePacksApi apiInstance = new CertificatePacksApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificatePackQuotaResponse result = apiInstance.certificatePacksGetCertificatePackQuotas(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatePacksApi#certificatePacksGetCertificatePackQuotas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificatePackQuotaResponse**](CertificatePackQuotaResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="certificatePacksListCertificatePacks"></a>
# **certificatePacksListCertificatePacks**
> CertificatePackResponseCollection certificatePacksListCertificatePacks(zoneIdentifier)

List Certificate Packs

For a given zone, list all active certificate packs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificatePacksApi;

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


CertificatePacksApi apiInstance = new CertificatePacksApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificatePackResponseCollection result = apiInstance.certificatePacksListCertificatePacks(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatePacksApi#certificatePacksListCertificatePacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificatePackResponseCollection**](CertificatePackResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="certificatePacksOrderAdvancedCertificateManagerCertificatePack"></a>
# **certificatePacksOrderAdvancedCertificateManagerCertificatePack**
> AdvancedCertificatePackResponseSingle certificatePacksOrderAdvancedCertificateManagerCertificatePack(body, zoneIdentifier)

Order Advanced Certificate Manager Certificate Pack

For a given zone, order an advanced certificate pack.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificatePacksApi;

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


CertificatePacksApi apiInstance = new CertificatePacksApi();
CertificatePacksOrderBody body = new CertificatePacksOrderBody(); // CertificatePacksOrderBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    AdvancedCertificatePackResponseSingle result = apiInstance.certificatePacksOrderAdvancedCertificateManagerCertificatePack(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatePacksApi#certificatePacksOrderAdvancedCertificateManagerCertificatePack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CertificatePacksOrderBody**](CertificatePacksOrderBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**AdvancedCertificatePackResponseSingle**](AdvancedCertificatePackResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack"></a>
# **certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack**
> AdvancedCertificatePackResponseSingle certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack(identifier, zoneIdentifier)

Restart Validation for Advanced Certificate Manager Certificate Pack

For a given zone, restart validation for an advanced certificate pack.  This is only a validation operation for a Certificate Pack in a validation_timed_out status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificatePacksApi;

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


CertificatePacksApi apiInstance = new CertificatePacksApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    AdvancedCertificatePackResponseSingle result = apiInstance.certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificatePacksApi#certificatePacksRestartValidationForAdvancedCertificateManagerCertificatePack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**AdvancedCertificatePackResponseSingle**](AdvancedCertificatePackResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

