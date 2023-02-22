# CustomSslForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customSslForAZoneCreateSslConfiguration**](CustomSslForAZoneApi.md#customSslForAZoneCreateSslConfiguration) | **POST** /zones/{zone_identifier}/custom_certificates | Create SSL Configuration
[**customSslForAZoneDeleteSslConfiguration**](CustomSslForAZoneApi.md#customSslForAZoneDeleteSslConfiguration) | **DELETE** /zones/{zone_identifier}/custom_certificates/{identifier} | Delete SSL Configuration
[**customSslForAZoneEditSslConfiguration**](CustomSslForAZoneApi.md#customSslForAZoneEditSslConfiguration) | **PATCH** /zones/{zone_identifier}/custom_certificates/{identifier} | Edit SSL Configuration
[**customSslForAZoneListSslConfigurations**](CustomSslForAZoneApi.md#customSslForAZoneListSslConfigurations) | **GET** /zones/{zone_identifier}/custom_certificates | List SSL Configurations
[**customSslForAZoneRePrioritizeSslCertificates**](CustomSslForAZoneApi.md#customSslForAZoneRePrioritizeSslCertificates) | **PUT** /zones/{zone_identifier}/custom_certificates/prioritize | Re-prioritize SSL Certificates
[**customSslForAZoneSslConfigurationDetails**](CustomSslForAZoneApi.md#customSslForAZoneSslConfigurationDetails) | **GET** /zones/{zone_identifier}/custom_certificates/{identifier} | SSL Configuration Details

<a name="customSslForAZoneCreateSslConfiguration"></a>
# **customSslForAZoneCreateSslConfiguration**
> CertificateResponseSingle customSslForAZoneCreateSslConfiguration(body, zoneIdentifier)

Create SSL Configuration

Upload a new SSL certificate for a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomSslForAZoneApi;

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


CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi();
ZoneIdentifierCustomCertificatesBody body = new ZoneIdentifierCustomCertificatesBody(); // ZoneIdentifierCustomCertificatesBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseSingle result = apiInstance.customSslForAZoneCreateSslConfiguration(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneCreateSslConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdentifierCustomCertificatesBody**](ZoneIdentifierCustomCertificatesBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseSingle**](CertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customSslForAZoneDeleteSslConfiguration"></a>
# **customSslForAZoneDeleteSslConfiguration**
> CertificateResponseIdOnly customSslForAZoneDeleteSslConfiguration(identifier, zoneIdentifier)

Delete SSL Configuration

Remove a SSL certificate from a zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomSslForAZoneApi;

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


CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseIdOnly result = apiInstance.customSslForAZoneDeleteSslConfiguration(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneDeleteSslConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseIdOnly**](CertificateResponseIdOnly.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customSslForAZoneEditSslConfiguration"></a>
# **customSslForAZoneEditSslConfiguration**
> CertificateResponseSingle customSslForAZoneEditSslConfiguration(body, identifier, zoneIdentifier)

Edit SSL Configuration

Upload a new private key and/or PEM/CRT for the SSL certificate. Note: PATCHing a configuration for sni_custom certificates will result in a new resource id being returned, and the previous one being deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomSslForAZoneApi;

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


CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi();
CustomCertificatesIdentifierBody body = new CustomCertificatesIdentifierBody(); // CustomCertificatesIdentifierBody | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseSingle result = apiInstance.customSslForAZoneEditSslConfiguration(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneEditSslConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomCertificatesIdentifierBody**](CustomCertificatesIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseSingle**](CertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customSslForAZoneListSslConfigurations"></a>
# **customSslForAZoneListSslConfigurations**
> CertificateResponseCollection customSslForAZoneListSslConfigurations(zoneIdentifier)

List SSL Configurations

List, search, and filter all of your custom SSL certificates. The higher priority will break ties across overlapping &#x27;legacy_custom&#x27; certificates, but &#x27;legacy_custom&#x27; certificates will always supercede &#x27;sni_custom&#x27; certificates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomSslForAZoneApi;

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


CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseCollection result = apiInstance.customSslForAZoneListSslConfigurations(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneListSslConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseCollection**](CertificateResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customSslForAZoneRePrioritizeSslCertificates"></a>
# **customSslForAZoneRePrioritizeSslCertificates**
> CertificateResponseCollection customSslForAZoneRePrioritizeSslCertificates(body, zoneIdentifier)

Re-prioritize SSL Certificates

If a zone has multiple SSL certificates, you can set the order in which they should be used during a request. The higher priority will break ties across overlapping &#x27;legacy_custom&#x27; certificates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomSslForAZoneApi;

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


CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi();
CustomCertificatesPrioritizeBody body = new CustomCertificatesPrioritizeBody(); // CustomCertificatesPrioritizeBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseCollection result = apiInstance.customSslForAZoneRePrioritizeSslCertificates(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneRePrioritizeSslCertificates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomCertificatesPrioritizeBody**](CustomCertificatesPrioritizeBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseCollection**](CertificateResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customSslForAZoneSslConfigurationDetails"></a>
# **customSslForAZoneSslConfigurationDetails**
> CertificateResponseSingle customSslForAZoneSslConfigurationDetails(identifier, zoneIdentifier)

SSL Configuration Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomSslForAZoneApi;

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


CustomSslForAZoneApi apiInstance = new CustomSslForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseSingle result = apiInstance.customSslForAZoneSslConfigurationDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomSslForAZoneApi#customSslForAZoneSslConfigurationDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseSingle**](CertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

