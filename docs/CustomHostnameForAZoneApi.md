# CustomHostnameForAZoneApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customHostnameForAZoneCreateCustomHostname**](CustomHostnameForAZoneApi.md#customHostnameForAZoneCreateCustomHostname) | **POST** /zones/{zone_identifier}/custom_hostnames | Create Custom Hostname
[**customHostnameForAZoneCustomHostnameDetails**](CustomHostnameForAZoneApi.md#customHostnameForAZoneCustomHostnameDetails) | **GET** /zones/{zone_identifier}/custom_hostnames/{identifier} | Custom Hostname Details
[**customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates**](CustomHostnameForAZoneApi.md#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates) | **DELETE** /zones/{zone_identifier}/custom_hostnames/{identifier} | Delete Custom Hostname (and any issued SSL certificates)
[**customHostnameForAZoneEditCustomHostname**](CustomHostnameForAZoneApi.md#customHostnameForAZoneEditCustomHostname) | **PATCH** /zones/{zone_identifier}/custom_hostnames/{identifier} | Edit Custom Hostname
[**customHostnameForAZoneListCustomHostnames**](CustomHostnameForAZoneApi.md#customHostnameForAZoneListCustomHostnames) | **GET** /zones/{zone_identifier}/custom_hostnames | List Custom Hostnames

<a name="customHostnameForAZoneCreateCustomHostname"></a>
# **customHostnameForAZoneCreateCustomHostname**
> CustomHostnameResponseSingle customHostnameForAZoneCreateCustomHostname(body, zoneIdentifier)

Create Custom Hostname

Add a new custom hostname and request that an SSL certificate be issued for it. One of three validation methods—http, txt, email—should be used, with &#x27;http&#x27; recommended if the CNAME is already in place (or will be soon). Specifying &#x27;email&#x27; will send an email to the WHOIS contacts on file for the base domain plus hostmaster, postmaster, webmaster, admin, administrator. If http is used and the domain is not already pointing to the Managed CNAME host, the PATCH method must be used once it is (to complete validation).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameForAZoneApi;

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


CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi();
ZoneIdentifierCustomHostnamesBody body = new ZoneIdentifierCustomHostnamesBody(); // ZoneIdentifierCustomHostnamesBody | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CustomHostnameResponseSingle result = apiInstance.customHostnameForAZoneCreateCustomHostname(body, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameForAZoneApi#customHostnameForAZoneCreateCustomHostname");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ZoneIdentifierCustomHostnamesBody**](ZoneIdentifierCustomHostnamesBody.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CustomHostnameResponseSingle**](CustomHostnameResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customHostnameForAZoneCustomHostnameDetails"></a>
# **customHostnameForAZoneCustomHostnameDetails**
> CustomHostnameResponseSingle customHostnameForAZoneCustomHostnameDetails(identifier, zoneIdentifier)

Custom Hostname Details

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameForAZoneApi;

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


CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CustomHostnameResponseSingle result = apiInstance.customHostnameForAZoneCustomHostnameDetails(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameForAZoneApi#customHostnameForAZoneCustomHostnameDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CustomHostnameResponseSingle**](CustomHostnameResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates"></a>
# **customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates**
> InlineResponse200112 customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates(identifier, zoneIdentifier)

Delete Custom Hostname (and any issued SSL certificates)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameForAZoneApi;

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


CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi();
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    InlineResponse200112 result = apiInstance.customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates(identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameForAZoneApi#customHostnameForAZoneDeleteCustomHostnameAndAnyIssuedSslCertificates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**InlineResponse200112**](InlineResponse200112.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customHostnameForAZoneEditCustomHostname"></a>
# **customHostnameForAZoneEditCustomHostname**
> CustomHostnameResponseSingle customHostnameForAZoneEditCustomHostname(body, identifier, zoneIdentifier)

Edit Custom Hostname

Modify SSL configuration for a custom hostname. When sent with SSL config that matches existing config, used to indicate that hostname should pass domain control validation (DCV). Can also be used to change validation type, e.g., from &#x27;http&#x27; to &#x27;email&#x27;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameForAZoneApi;

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


CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi();
CustomHostnamesIdentifierBody body = new CustomHostnamesIdentifierBody(); // CustomHostnamesIdentifierBody | 
String identifier = "identifier_example"; // String | 
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CustomHostnameResponseSingle result = apiInstance.customHostnameForAZoneEditCustomHostname(body, identifier, zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameForAZoneApi#customHostnameForAZoneEditCustomHostname");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomHostnamesIdentifierBody**](CustomHostnamesIdentifierBody.md)|  |
 **identifier** | [**String**](.md)|  |
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CustomHostnameResponseSingle**](CustomHostnameResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customHostnameForAZoneListCustomHostnames"></a>
# **customHostnameForAZoneListCustomHostnames**
> CustomHostnameResponseCollection customHostnameForAZoneListCustomHostnames(zoneIdentifier)

List Custom Hostnames

List, search, sort, and filter all of your custom hostnames.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CustomHostnameForAZoneApi;

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


CustomHostnameForAZoneApi apiInstance = new CustomHostnameForAZoneApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    CustomHostnameResponseCollection result = apiInstance.customHostnameForAZoneListCustomHostnames(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomHostnameForAZoneApi#customHostnameForAZoneListCustomHostnames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**CustomHostnameResponseCollection**](CustomHostnameResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

