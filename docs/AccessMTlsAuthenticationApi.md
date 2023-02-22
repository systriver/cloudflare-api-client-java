# AccessMTlsAuthenticationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accessMTlsAuthenticationAddAnMTlsCertificate**](AccessMTlsAuthenticationApi.md#accessMTlsAuthenticationAddAnMTlsCertificate) | **POST** /accounts/{identifier}/access/certificates | Add an mTLS certificate
[**accessMTlsAuthenticationDeleteAnMTlsCertificate**](AccessMTlsAuthenticationApi.md#accessMTlsAuthenticationDeleteAnMTlsCertificate) | **DELETE** /accounts/{identifier}/access/certificates/{uuid} | Delete an mTLS certificate
[**accessMTlsAuthenticationGetAnMTlsCertificate**](AccessMTlsAuthenticationApi.md#accessMTlsAuthenticationGetAnMTlsCertificate) | **GET** /accounts/{identifier}/access/certificates/{uuid} | Get an mTLS certificate
[**accessMTlsAuthenticationListMTlsCertificates**](AccessMTlsAuthenticationApi.md#accessMTlsAuthenticationListMTlsCertificates) | **GET** /accounts/{identifier}/access/certificates | List mTLS certificates
[**accessMTlsAuthenticationUpdateAnMTlsCertificate**](AccessMTlsAuthenticationApi.md#accessMTlsAuthenticationUpdateAnMTlsCertificate) | **PUT** /accounts/{identifier}/access/certificates/{uuid} | Update an mTLS certificate

<a name="accessMTlsAuthenticationAddAnMTlsCertificate"></a>
# **accessMTlsAuthenticationAddAnMTlsCertificate**
> CloudflareClientAPICertificatesComponentsSchemasSingleResponse accessMTlsAuthenticationAddAnMTlsCertificate(body, identifier)

Add an mTLS certificate

Adds a new mTLS root certificate to Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessMTlsAuthenticationApi;

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


AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi();
AccessCertificatesBody body = new AccessCertificatesBody(); // AccessCertificatesBody | 
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasSingleResponse result = apiInstance.accessMTlsAuthenticationAddAnMTlsCertificate(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMTlsAuthenticationAddAnMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessCertificatesBody**](AccessCertificatesBody.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPICertificatesComponentsSchemasSingleResponse**](CloudflareClientAPICertificatesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessMTlsAuthenticationDeleteAnMTlsCertificate"></a>
# **accessMTlsAuthenticationDeleteAnMTlsCertificate**
> CertificatesComponentsSchemasIdResponse accessMTlsAuthenticationDeleteAnMTlsCertificate(uuid, identifier)

Delete an mTLS certificate

Deletes an mTLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessMTlsAuthenticationApi;

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


AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CertificatesComponentsSchemasIdResponse result = apiInstance.accessMTlsAuthenticationDeleteAnMTlsCertificate(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMTlsAuthenticationDeleteAnMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CertificatesComponentsSchemasIdResponse**](CertificatesComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="accessMTlsAuthenticationGetAnMTlsCertificate"></a>
# **accessMTlsAuthenticationGetAnMTlsCertificate**
> CloudflareClientAPICertificatesComponentsSchemasSingleResponse accessMTlsAuthenticationGetAnMTlsCertificate(uuid, identifier)

Get an mTLS certificate

Fetches a single mTLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessMTlsAuthenticationApi;

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


AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasSingleResponse result = apiInstance.accessMTlsAuthenticationGetAnMTlsCertificate(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMTlsAuthenticationGetAnMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPICertificatesComponentsSchemasSingleResponse**](CloudflareClientAPICertificatesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessMTlsAuthenticationListMTlsCertificates"></a>
# **accessMTlsAuthenticationListMTlsCertificates**
> CloudflareClientAPICertificatesComponentsSchemasResponseCollection accessMTlsAuthenticationListMTlsCertificates(identifier)

List mTLS certificates

Lists all mTLS certificates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessMTlsAuthenticationApi;

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


AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi();
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasResponseCollection result = apiInstance.accessMTlsAuthenticationListMTlsCertificates(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMTlsAuthenticationListMTlsCertificates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPICertificatesComponentsSchemasResponseCollection**](CloudflareClientAPICertificatesComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="accessMTlsAuthenticationUpdateAnMTlsCertificate"></a>
# **accessMTlsAuthenticationUpdateAnMTlsCertificate**
> CloudflareClientAPICertificatesComponentsSchemasSingleResponse accessMTlsAuthenticationUpdateAnMTlsCertificate(body, uuid, identifier)

Update an mTLS certificate

Updates a configured mTLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccessMTlsAuthenticationApi;

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


AccessMTlsAuthenticationApi apiInstance = new AccessMTlsAuthenticationApi();
CertificatesUuidBody body = new CertificatesUuidBody(); // CertificatesUuidBody | 
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasSingleResponse result = apiInstance.accessMTlsAuthenticationUpdateAnMTlsCertificate(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessMTlsAuthenticationApi#accessMTlsAuthenticationUpdateAnMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CertificatesUuidBody**](CertificatesUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPICertificatesComponentsSchemasSingleResponse**](CloudflareClientAPICertificatesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

