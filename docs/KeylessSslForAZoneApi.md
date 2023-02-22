# KeylessSslForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keylessSslForAZoneCreateKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneCreateKeylessSslConfiguration) | **POST** /zones/{zone_identifier}/keyless_certificates | Create Keyless SSL Configuration
[**keylessSslForAZoneDeleteKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneDeleteKeylessSslConfiguration) | **DELETE** /zones/{zone_identifier}/keyless_certificates/{identifier} | Delete Keyless SSL Configuration
[**keylessSslForAZoneEditKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneEditKeylessSslConfiguration) | **PATCH** /zones/{zone_identifier}/keyless_certificates/{identifier} | Edit Keyless SSL Configuration
[**keylessSslForAZoneGetKeylessSslConfiguration**](KeylessSslForAZoneApi.md#keylessSslForAZoneGetKeylessSslConfiguration) | **GET** /zones/{zone_identifier}/keyless_certificates/{identifier} | Get Keyless SSL Configuration
[**keylessSslForAZoneListKeylessSslConfigurations**](KeylessSslForAZoneApi.md#keylessSslForAZoneListKeylessSslConfigurations) | **GET** /zones/{zone_identifier}/keyless_certificates | List Keyless SSL Configurations

<a name="keylessSslForAZoneCreateKeylessSslConfiguration"></a>
# **keylessSslForAZoneCreateKeylessSslConfiguration**
> KeylessResponseSingle keylessSslForAZoneCreateKeylessSslConfiguration(body, zoneIdentifier)

Create Keyless SSL Configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeylessSslForAZoneApi;

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


KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi();
ZoneIdentifierKeylessCertificatesBody body = new ZoneIdentifierKeylessCertificatesBody(); // ZoneIdentifierKeylessCertificatesBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    KeylessResponseSingle result = apiInstance.keylessSslForAZoneCreateKeylessSslConfiguration(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneCreateKeylessSslConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdentifierKeylessCertificatesBody**](ZoneIdentifierKeylessCertificatesBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**KeylessResponseSingle**](KeylessResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="keylessSslForAZoneDeleteKeylessSslConfiguration"></a>
# **keylessSslForAZoneDeleteKeylessSslConfiguration**
> KeylessResponseSingleId keylessSslForAZoneDeleteKeylessSslConfiguration(identifier, zoneIdentifier)

Delete Keyless SSL Configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeylessSslForAZoneApi;

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


KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    KeylessResponseSingleId result = apiInstance.keylessSslForAZoneDeleteKeylessSslConfiguration(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneDeleteKeylessSslConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**KeylessResponseSingleId**](KeylessResponseSingleId.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="keylessSslForAZoneEditKeylessSslConfiguration"></a>
# **keylessSslForAZoneEditKeylessSslConfiguration**
> KeylessResponseSingle keylessSslForAZoneEditKeylessSslConfiguration(body, identifier, zoneIdentifier)

Edit Keyless SSL Configuration

This will update attributes of a Keyless SSL. Consists of one or more of the following:  host,name,port,certificate,enabled.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeylessSslForAZoneApi;

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


KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi();
KeylessCertificatesIdentifierBody body = new KeylessCertificatesIdentifierBody(); // KeylessCertificatesIdentifierBody | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    KeylessResponseSingle result = apiInstance.keylessSslForAZoneEditKeylessSslConfiguration(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneEditKeylessSslConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**KeylessCertificatesIdentifierBody**](KeylessCertificatesIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**KeylessResponseSingle**](KeylessResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="keylessSslForAZoneGetKeylessSslConfiguration"></a>
# **keylessSslForAZoneGetKeylessSslConfiguration**
> KeylessResponseSingle keylessSslForAZoneGetKeylessSslConfiguration(identifier, zoneIdentifier)

Get Keyless SSL Configuration

Get details for one Keyless SSL configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeylessSslForAZoneApi;

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


KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    KeylessResponseSingle result = apiInstance.keylessSslForAZoneGetKeylessSslConfiguration(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneGetKeylessSslConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**KeylessResponseSingle**](KeylessResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="keylessSslForAZoneListKeylessSslConfigurations"></a>
# **keylessSslForAZoneListKeylessSslConfigurations**
> KeylessResponseCollection keylessSslForAZoneListKeylessSslConfigurations(zoneIdentifier)

List Keyless SSL Configurations

List all Keyless SSL configurations for a given zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.KeylessSslForAZoneApi;

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


KeylessSslForAZoneApi apiInstance = new KeylessSslForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    KeylessResponseCollection result = apiInstance.keylessSslForAZoneListKeylessSslConfigurations(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KeylessSslForAZoneApi#keylessSslForAZoneListKeylessSslConfigurations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**KeylessResponseCollection**](KeylessResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

