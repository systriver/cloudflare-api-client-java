# ZoneLevelAccessMTlsAuthenticationApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAccessMTlsAuthenticationAddAnMTlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMTlsAuthenticationAddAnMTlsCertificate) | **POST** /zones/{identifier}/access/certificates | Add an mTLS certificate
[**zoneLevelAccessMTlsAuthenticationDeleteAnMTlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMTlsAuthenticationDeleteAnMTlsCertificate) | **DELETE** /zones/{identifier}/access/certificates/{uuid} | Delete an mTLS certificate
[**zoneLevelAccessMTlsAuthenticationGetAnMTlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMTlsAuthenticationGetAnMTlsCertificate) | **GET** /zones/{identifier}/access/certificates/{uuid} | Get an mTLS certificate
[**zoneLevelAccessMTlsAuthenticationListMTlsCertificates**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMTlsAuthenticationListMTlsCertificates) | **GET** /zones/{identifier}/access/certificates | List mTLS certificates
[**zoneLevelAccessMTlsAuthenticationUpdateAnMTlsCertificate**](ZoneLevelAccessMTlsAuthenticationApi.md#zoneLevelAccessMTlsAuthenticationUpdateAnMTlsCertificate) | **PUT** /zones/{identifier}/access/certificates/{uuid} | Update an mTLS certificate

<a name="zoneLevelAccessMTlsAuthenticationAddAnMTlsCertificate"></a>
# **zoneLevelAccessMTlsAuthenticationAddAnMTlsCertificate**
> CloudflareClientAPICertificatesComponentsSchemasSingleResponse zoneLevelAccessMTlsAuthenticationAddAnMTlsCertificate(body, identifier)

Add an mTLS certificate

Adds a new mTLS root certificate to Access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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


ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi();
AccessCertificatesBody1 body = new AccessCertificatesBody1(); // AccessCertificatesBody1 | 
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessMTlsAuthenticationAddAnMTlsCertificate(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMTlsAuthenticationAddAnMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccessCertificatesBody1**](AccessCertificatesBody1.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPICertificatesComponentsSchemasSingleResponse**](CloudflareClientAPICertificatesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAccessMTlsAuthenticationDeleteAnMTlsCertificate"></a>
# **zoneLevelAccessMTlsAuthenticationDeleteAnMTlsCertificate**
> CertificatesComponentsSchemasIdResponse zoneLevelAccessMTlsAuthenticationDeleteAnMTlsCertificate(uuid, identifier)

Delete an mTLS certificate

Deletes an mTLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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


ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CertificatesComponentsSchemasIdResponse result = apiInstance.zoneLevelAccessMTlsAuthenticationDeleteAnMTlsCertificate(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMTlsAuthenticationDeleteAnMTlsCertificate");
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

<a name="zoneLevelAccessMTlsAuthenticationGetAnMTlsCertificate"></a>
# **zoneLevelAccessMTlsAuthenticationGetAnMTlsCertificate**
> CloudflareClientAPICertificatesComponentsSchemasSingleResponse zoneLevelAccessMTlsAuthenticationGetAnMTlsCertificate(uuid, identifier)

Get an mTLS certificate

Fetches a single mTLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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


ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi();
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessMTlsAuthenticationGetAnMTlsCertificate(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMTlsAuthenticationGetAnMTlsCertificate");
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

<a name="zoneLevelAccessMTlsAuthenticationListMTlsCertificates"></a>
# **zoneLevelAccessMTlsAuthenticationListMTlsCertificates**
> CloudflareClientAPICertificatesComponentsSchemasResponseCollection zoneLevelAccessMTlsAuthenticationListMTlsCertificates(identifier)

List mTLS certificates

Lists all mTLS certificates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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


ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi();
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasResponseCollection result = apiInstance.zoneLevelAccessMTlsAuthenticationListMTlsCertificates(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMTlsAuthenticationListMTlsCertificates");
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

<a name="zoneLevelAccessMTlsAuthenticationUpdateAnMTlsCertificate"></a>
# **zoneLevelAccessMTlsAuthenticationUpdateAnMTlsCertificate**
> CloudflareClientAPICertificatesComponentsSchemasSingleResponse zoneLevelAccessMTlsAuthenticationUpdateAnMTlsCertificate(body, uuid, identifier)

Update an mTLS certificate

Updates a configured mTLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAccessMTlsAuthenticationApi;

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


ZoneLevelAccessMTlsAuthenticationApi apiInstance = new ZoneLevelAccessMTlsAuthenticationApi();
CertificatesUuidBody1 body = new CertificatesUuidBody1(); // CertificatesUuidBody1 | 
String uuid = "uuid_example"; // String | 
String identifier = "identifier_example"; // String | 
try {
    CloudflareClientAPICertificatesComponentsSchemasSingleResponse result = apiInstance.zoneLevelAccessMTlsAuthenticationUpdateAnMTlsCertificate(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAccessMTlsAuthenticationApi#zoneLevelAccessMTlsAuthenticationUpdateAnMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CertificatesUuidBody1**](CertificatesUuidBody1.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**String**](.md)|  |

### Return type

[**CloudflareClientAPICertificatesComponentsSchemasSingleResponse**](CloudflareClientAPICertificatesComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

