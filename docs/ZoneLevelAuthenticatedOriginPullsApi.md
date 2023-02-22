# ZoneLevelAuthenticatedOriginPullsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**zoneLevelAuthenticatedOriginPullsDeleteCertificate**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsDeleteCertificate) | **DELETE** /zones/{zone_identifier}/origin_tls_client_auth/{identifier} | Delete Certificate
[**zoneLevelAuthenticatedOriginPullsGetCertificateDetails**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsGetCertificateDetails) | **GET** /zones/{zone_identifier}/origin_tls_client_auth/{identifier} | Get Certificate Details
[**zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone) | **GET** /zones/{zone_identifier}/origin_tls_client_auth/settings | Get Enablement Setting for Zone
[**zoneLevelAuthenticatedOriginPullsListCertificates**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsListCertificates) | **GET** /zones/{zone_identifier}/origin_tls_client_auth | List Certificates
[**zoneLevelAuthenticatedOriginPullsSetEnablementForZone**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsSetEnablementForZone) | **PUT** /zones/{zone_identifier}/origin_tls_client_auth/settings | Set Enablement for Zone
[**zoneLevelAuthenticatedOriginPullsUploadCertificate**](ZoneLevelAuthenticatedOriginPullsApi.md#zoneLevelAuthenticatedOriginPullsUploadCertificate) | **POST** /zones/{zone_identifier}/origin_tls_client_auth | Upload Certificate

<a name="zoneLevelAuthenticatedOriginPullsDeleteCertificate"></a>
# **zoneLevelAuthenticatedOriginPullsDeleteCertificate**
> CertificateResponseSingle zoneLevelAuthenticatedOriginPullsDeleteCertificate(identifier, zoneIdentifier)

Delete Certificate

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAuthenticatedOriginPullsApi;

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


ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseSingle result = apiInstance.zoneLevelAuthenticatedOriginPullsDeleteCertificate(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsDeleteCertificate");
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAuthenticatedOriginPullsGetCertificateDetails"></a>
# **zoneLevelAuthenticatedOriginPullsGetCertificateDetails**
> CertificateResponseSingle zoneLevelAuthenticatedOriginPullsGetCertificateDetails(identifier, zoneIdentifier)

Get Certificate Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAuthenticatedOriginPullsApi;

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


ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseSingle result = apiInstance.zoneLevelAuthenticatedOriginPullsGetCertificateDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsGetCertificateDetails");
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

<a name="zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone"></a>
# **zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone**
> EnabledResponse zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone(zoneIdentifier)

Get Enablement Setting for Zone

Get whether zone-level authenticated origin pulls is enabled or not. It is false by default.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAuthenticatedOriginPullsApi;

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


ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EnabledResponse result = apiInstance.zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsGetEnablementSettingForZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EnabledResponse**](EnabledResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneLevelAuthenticatedOriginPullsListCertificates"></a>
# **zoneLevelAuthenticatedOriginPullsListCertificates**
> ComponentsSchemasCertificateResponseCollection zoneLevelAuthenticatedOriginPullsListCertificates(zoneIdentifier)

List Certificates

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAuthenticatedOriginPullsApi;

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


ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    ComponentsSchemasCertificateResponseCollection result = apiInstance.zoneLevelAuthenticatedOriginPullsListCertificates(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsListCertificates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**ComponentsSchemasCertificateResponseCollection**](ComponentsSchemasCertificateResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="zoneLevelAuthenticatedOriginPullsSetEnablementForZone"></a>
# **zoneLevelAuthenticatedOriginPullsSetEnablementForZone**
> EnabledResponse zoneLevelAuthenticatedOriginPullsSetEnablementForZone(body, zoneIdentifier)

Set Enablement for Zone

Enable or disable zone-level authenticated origin pulls. &#x27;enabled&#x27; should be set true either before/after the certificate is uploaded to see the certificate in use.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAuthenticatedOriginPullsApi;

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


ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi();
OriginTlsClientAuthSettingsBody body = new OriginTlsClientAuthSettingsBody(); // OriginTlsClientAuthSettingsBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EnabledResponse result = apiInstance.zoneLevelAuthenticatedOriginPullsSetEnablementForZone(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsSetEnablementForZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OriginTlsClientAuthSettingsBody**](OriginTlsClientAuthSettingsBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EnabledResponse**](EnabledResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="zoneLevelAuthenticatedOriginPullsUploadCertificate"></a>
# **zoneLevelAuthenticatedOriginPullsUploadCertificate**
> CertificateResponseSingle zoneLevelAuthenticatedOriginPullsUploadCertificate(body, zoneIdentifier)

Upload Certificate

Upload your own certificate you want Cloudflare to use for edge-to-origin communication to override the shared certificate. Please note that it is important to keep only one certificate active. Also, make sure to enable zone-level authenticated origin pulls by making a PUT call to settings endpoint to see the uploaded certificate in use.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZoneLevelAuthenticatedOriginPullsApi;

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


ZoneLevelAuthenticatedOriginPullsApi apiInstance = new ZoneLevelAuthenticatedOriginPullsApi();
ZoneIdentifierOriginTlsClientAuthBody body = new ZoneIdentifierOriginTlsClientAuthBody(); // ZoneIdentifierOriginTlsClientAuthBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CertificateResponseSingle result = apiInstance.zoneLevelAuthenticatedOriginPullsUploadCertificate(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZoneLevelAuthenticatedOriginPullsApi#zoneLevelAuthenticatedOriginPullsUploadCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdentifierOriginTlsClientAuthBody**](ZoneIdentifierOriginTlsClientAuthBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CertificateResponseSingle**](CertificateResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

