# PerHostnameAuthenticatedOriginPullApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate) | **DELETE** /zones/{zone_identifier}/origin_tls_client_auth/hostnames/certificates/{identifier} | Delete Hostname Client Certificate
[**perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication) | **PUT** /zones/{zone_identifier}/origin_tls_client_auth/hostnames | Enable or Disable a Hostname for Client Authentication
[**perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate) | **GET** /zones/{zone_identifier}/origin_tls_client_auth/hostnames/certificates/{identifier} | Get the Hostname Client Certificate
[**perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication) | **GET** /zones/{zone_identifier}/origin_tls_client_auth/hostnames/{hostname} | Get the Hostname Status for Client Authentication
[**perHostnameAuthenticatedOriginPullListCertificates**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullListCertificates) | **GET** /zones/{zone_identifier}/origin_tls_client_auth/hostnames/certificates | List Certificates
[**perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate**](PerHostnameAuthenticatedOriginPullApi.md#perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate) | **POST** /zones/{zone_identifier}/origin_tls_client_auth/hostnames/certificates | Upload a Hostname Client Certificate

<a name="perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate"></a>
# **perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate**
> ComponentsSchemasCertificateResponseSingle perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate(identifier, zoneIdentifier)

Delete Hostname Client Certificate

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PerHostnameAuthenticatedOriginPullApi;

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


PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ComponentsSchemasCertificateResponseSingle result = apiInstance.perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullDeleteHostnameClientCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasCertificateResponseSingle**](ComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication"></a>
# **perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication**
> HostnameAopResponseCollection perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication(body, zoneIdentifier)

Enable or Disable a Hostname for Client Authentication

Associate a hostname to a certificate and enable, disable or invalidate the association. If disabled, client certificate will not be sent to the hostname even if activated at the zone level. 100 maximum associations on a single certificate are allowed. Note: Use a null value for parameter *enabled* to invalidate the association.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PerHostnameAuthenticatedOriginPullApi;

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


PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi();
OriginTlsClientAuthHostnamesBody body = new OriginTlsClientAuthHostnamesBody(); // OriginTlsClientAuthHostnamesBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HostnameAopResponseCollection result = apiInstance.perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullEnableOrDisableAHostnameForClientAuthentication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OriginTlsClientAuthHostnamesBody**](OriginTlsClientAuthHostnamesBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HostnameAopResponseCollection**](HostnameAopResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate"></a>
# **perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate**
> ComponentsSchemasCertificateResponseSingle perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate(identifier, zoneIdentifier)

Get the Hostname Client Certificate

Get the certificate by ID to be used for client authentication on a hostname.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PerHostnameAuthenticatedOriginPullApi;

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


PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ComponentsSchemasCertificateResponseSingle result = apiInstance.perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullGetTheHostnameClientCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasCertificateResponseSingle**](ComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication"></a>
# **perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication**
> HostnameAopSingleResponse perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication(hostname, zoneIdentifier)

Get the Hostname Status for Client Authentication

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PerHostnameAuthenticatedOriginPullApi;

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


PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi();
String hostname = "hostname_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HostnameAopSingleResponse result = apiInstance.perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication(hostname, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullGetTheHostnameStatusForClientAuthentication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hostname** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HostnameAopSingleResponse**](HostnameAopSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="perHostnameAuthenticatedOriginPullListCertificates"></a>
# **perHostnameAuthenticatedOriginPullListCertificates**
> HostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection perHostnameAuthenticatedOriginPullListCertificates(zoneIdentifier)

List Certificates

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PerHostnameAuthenticatedOriginPullApi;

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


PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    HostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection result = apiInstance.perHostnameAuthenticatedOriginPullListCertificates(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullListCertificates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**HostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection**](HostnameAuthenticatedOriginPullComponentsSchemasCertificateResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate"></a>
# **perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate**
> ComponentsSchemasCertificateResponseSingle perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate(body, zoneIdentifier)

Upload a Hostname Client Certificate

Upload a certificate to be used for client authentication on a hostname. 10 hostname certificates per zone are allowed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PerHostnameAuthenticatedOriginPullApi;

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


PerHostnameAuthenticatedOriginPullApi apiInstance = new PerHostnameAuthenticatedOriginPullApi();
HostnamesCertificatesBody body = new HostnamesCertificatesBody(); // HostnamesCertificatesBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ComponentsSchemasCertificateResponseSingle result = apiInstance.perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerHostnameAuthenticatedOriginPullApi#perHostnameAuthenticatedOriginPullUploadAHostnameClientCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HostnamesCertificatesBody**](HostnamesCertificatesBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasCertificateResponseSingle**](ComponentsSchemasCertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

