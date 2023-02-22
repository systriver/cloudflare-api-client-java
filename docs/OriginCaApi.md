# OriginCaApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**originCaCreateCertificate**](OriginCaApi.md#originCaCreateCertificate) | **POST** /certificates | Create Certificate
[**originCaGetCertificate**](OriginCaApi.md#originCaGetCertificate) | **GET** /certificates/{identifier} | Get Certificate
[**originCaListCertificates**](OriginCaApi.md#originCaListCertificates) | **GET** /certificates | List Certificates
[**originCaRevokeCertificate**](OriginCaApi.md#originCaRevokeCertificate) | **DELETE** /certificates/{identifier} | Revoke Certificate

<a name="originCaCreateCertificate"></a>
# **originCaCreateCertificate**
> SchemasCertificateResponseSingle originCaCreateCertificate(body)

Create Certificate

Create an Origin CA certificate. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OriginCaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure API key authorization: user_service_key
ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
user_service_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_service_key.setApiKeyPrefix("Token");

OriginCaApi apiInstance = new OriginCaApi();
CertificatesBody body = new CertificatesBody(); // CertificatesBody | 
try {
    SchemasCertificateResponseSingle result = apiInstance.originCaCreateCertificate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginCaApi#originCaCreateCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CertificatesBody**](CertificatesBody.md)|  |

### Return type

[**SchemasCertificateResponseSingle**](SchemasCertificateResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="originCaGetCertificate"></a>
# **originCaGetCertificate**
> SchemasCertificateResponseSingle originCaGetCertificate(identifier)

Get Certificate

Get an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OriginCaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure API key authorization: user_service_key
ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
user_service_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_service_key.setApiKeyPrefix("Token");

OriginCaApi apiInstance = new OriginCaApi();
String identifier = "identifier_example"; // String | 
try {
    SchemasCertificateResponseSingle result = apiInstance.originCaGetCertificate(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginCaApi#originCaGetCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**SchemasCertificateResponseSingle**](SchemasCertificateResponseSingle.md)

### Authorization

[api_token](../README.md#api_token)[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="originCaListCertificates"></a>
# **originCaListCertificates**
> SchemasCertificateResponseCollection originCaListCertificates()

List Certificates

List all existing Origin CA certificates for a given zone. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OriginCaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure API key authorization: user_service_key
ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
user_service_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_service_key.setApiKeyPrefix("Token");

OriginCaApi apiInstance = new OriginCaApi();
try {
    SchemasCertificateResponseCollection result = apiInstance.originCaListCertificates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginCaApi#originCaListCertificates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SchemasCertificateResponseCollection**](SchemasCertificateResponseCollection.md)

### Authorization

[api_token](../README.md#api_token)[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="originCaRevokeCertificate"></a>
# **originCaRevokeCertificate**
> CertificateResponseSingleId originCaRevokeCertificate(identifier)

Revoke Certificate

Revoke an existing Origin CA certificate by its serial number. Use your Origin CA Key as your User Service Key when calling this endpoint ([see above](#requests)).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OriginCaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


// Configure API key authorization: user_service_key
ApiKeyAuth user_service_key = (ApiKeyAuth) defaultClient.getAuthentication("user_service_key");
user_service_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//user_service_key.setApiKeyPrefix("Token");

OriginCaApi apiInstance = new OriginCaApi();
String identifier = "identifier_example"; // String | 
try {
    CertificateResponseSingleId result = apiInstance.originCaRevokeCertificate(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginCaApi#originCaRevokeCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseSingleId**](CertificateResponseSingleId.md)

### Authorization

[api_token](../README.md#api_token)[user_service_key](../README.md#user_service_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

