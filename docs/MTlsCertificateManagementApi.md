# MTlsCertificateManagementApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mTlsCertificateManagementDeleteMTlsCertificate**](MTlsCertificateManagementApi.md#mTlsCertificateManagementDeleteMTlsCertificate) | **DELETE** /accounts/{account_identifier}/mtls_certificates/{identifier} | Delete mTLS certificate
[**mTlsCertificateManagementGetMTlsCertificate**](MTlsCertificateManagementApi.md#mTlsCertificateManagementGetMTlsCertificate) | **GET** /accounts/{account_identifier}/mtls_certificates/{identifier} | Get mTLS certificate
[**mTlsCertificateManagementListMTlsCertificateAssociations**](MTlsCertificateManagementApi.md#mTlsCertificateManagementListMTlsCertificateAssociations) | **GET** /accounts/{account_identifier}/mtls_certificates/{identifier}/associations | List mTLS certificate associations
[**mTlsCertificateManagementListMTlsCertificates**](MTlsCertificateManagementApi.md#mTlsCertificateManagementListMTlsCertificates) | **GET** /accounts/{account_identifier}/mtls_certificates | List mTLS certificates
[**mTlsCertificateManagementUploadMTlsCertificate**](MTlsCertificateManagementApi.md#mTlsCertificateManagementUploadMTlsCertificate) | **POST** /accounts/{account_identifier}/mtls_certificates | Upload mTLS certificate

<a name="mTlsCertificateManagementDeleteMTlsCertificate"></a>
# **mTlsCertificateManagementDeleteMTlsCertificate**
> MtlsManagementComponentsSchemasCertificateResponseSingle mTlsCertificateManagementDeleteMTlsCertificate(identifier, accountIdentifier)

Delete mTLS certificate

Deletes the mTLS certificate unless the certificate is in use by one or more Cloudflare services.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MTlsCertificateManagementApi;

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


MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    MtlsManagementComponentsSchemasCertificateResponseSingle result = apiInstance.mTlsCertificateManagementDeleteMTlsCertificate(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementDeleteMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**MtlsManagementComponentsSchemasCertificateResponseSingle**](MtlsManagementComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mTlsCertificateManagementGetMTlsCertificate"></a>
# **mTlsCertificateManagementGetMTlsCertificate**
> MtlsManagementComponentsSchemasCertificateResponseSingle mTlsCertificateManagementGetMTlsCertificate(identifier, accountIdentifier)

Get mTLS certificate

Fetches a single mTLS certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MTlsCertificateManagementApi;

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


MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    MtlsManagementComponentsSchemasCertificateResponseSingle result = apiInstance.mTlsCertificateManagementGetMTlsCertificate(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementGetMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**MtlsManagementComponentsSchemasCertificateResponseSingle**](MtlsManagementComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mTlsCertificateManagementListMTlsCertificateAssociations"></a>
# **mTlsCertificateManagementListMTlsCertificateAssociations**
> AssociationResponseCollection mTlsCertificateManagementListMTlsCertificateAssociations(identifier, accountIdentifier)

List mTLS certificate associations

Lists all active associations between the certificate and Cloudflare services.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MTlsCertificateManagementApi;

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


MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi();
String identifier = "identifier_example"; // String | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    AssociationResponseCollection result = apiInstance.mTlsCertificateManagementListMTlsCertificateAssociations(identifier, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementListMTlsCertificateAssociations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**AssociationResponseCollection**](AssociationResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mTlsCertificateManagementListMTlsCertificates"></a>
# **mTlsCertificateManagementListMTlsCertificates**
> MtlsManagementComponentsSchemasCertificateResponseCollection mTlsCertificateManagementListMTlsCertificates(accountIdentifier)

List mTLS certificates

Lists all mTLS certificates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MTlsCertificateManagementApi;

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


MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi();
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    MtlsManagementComponentsSchemasCertificateResponseCollection result = apiInstance.mTlsCertificateManagementListMTlsCertificates(accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementListMTlsCertificates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**MtlsManagementComponentsSchemasCertificateResponseCollection**](MtlsManagementComponentsSchemasCertificateResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="mTlsCertificateManagementUploadMTlsCertificate"></a>
# **mTlsCertificateManagementUploadMTlsCertificate**
> CertificateResponseSinglePost mTlsCertificateManagementUploadMTlsCertificate(body, accountIdentifier)

Upload mTLS certificate

Upload a certificate that you want to use with mTLS-enabled Cloudflare services.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MTlsCertificateManagementApi;

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


MTlsCertificateManagementApi apiInstance = new MTlsCertificateManagementApi();
AccountIdentifierMtlsCertificatesBody body = new AccountIdentifierMtlsCertificatesBody(); // AccountIdentifierMtlsCertificatesBody | 
String accountIdentifier = "accountIdentifier_example"; // String | 
try {
    CertificateResponseSinglePost result = apiInstance.mTlsCertificateManagementUploadMTlsCertificate(body, accountIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MTlsCertificateManagementApi#mTlsCertificateManagementUploadMTlsCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountIdentifierMtlsCertificatesBody**](AccountIdentifierMtlsCertificatesBody.md)|  |
 **accountIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseSinglePost**](CertificateResponseSinglePost.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

