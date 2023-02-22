# EmailRoutingSettingsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailRoutingSettingsDisableEmailRouting**](EmailRoutingSettingsApi.md#emailRoutingSettingsDisableEmailRouting) | **POST** /zones/{zone_identifier}/email/routing/disable | Disable Email Routing
[**emailRoutingSettingsEmailRoutingDnsSettings**](EmailRoutingSettingsApi.md#emailRoutingSettingsEmailRoutingDnsSettings) | **GET** /zones/{zone_identifier}/email/routing/dns | Email Routing - DNS settings
[**emailRoutingSettingsEnableEmailRouting**](EmailRoutingSettingsApi.md#emailRoutingSettingsEnableEmailRouting) | **POST** /zones/{zone_identifier}/email/routing/enable | Enable Email Routing
[**emailRoutingSettingsGetEmailRoutingSettings**](EmailRoutingSettingsApi.md#emailRoutingSettingsGetEmailRoutingSettings) | **GET** /zones/{zone_identifier}/email/routing | Get Email Routing settings

<a name="emailRoutingSettingsDisableEmailRouting"></a>
# **emailRoutingSettingsDisableEmailRouting**
> EmailSettingsResponseSingle emailRoutingSettingsDisableEmailRouting(zoneIdentifier)

Disable Email Routing

Disable your Email Routing zone. Also removes additional MX records previously required for Email Routing to work.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingSettingsApi;

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


EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EmailSettingsResponseSingle result = apiInstance.emailRoutingSettingsDisableEmailRouting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsDisableEmailRouting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EmailSettingsResponseSingle**](EmailSettingsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailRoutingSettingsEmailRoutingDnsSettings"></a>
# **emailRoutingSettingsEmailRoutingDnsSettings**
> DnsSettingsResponseCollection emailRoutingSettingsEmailRoutingDnsSettings(zoneIdentifier)

Email Routing - DNS settings

Show the DNS records needed to configure your Email Routing zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingSettingsApi;

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


EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    DnsSettingsResponseCollection result = apiInstance.emailRoutingSettingsEmailRoutingDnsSettings(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsEmailRoutingDnsSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**DnsSettingsResponseCollection**](DnsSettingsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="emailRoutingSettingsEnableEmailRouting"></a>
# **emailRoutingSettingsEnableEmailRouting**
> EmailSettingsResponseSingle emailRoutingSettingsEnableEmailRouting(zoneIdentifier)

Enable Email Routing

Enable you Email Routing zone. Add and lock the necessary MX and SPF records.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingSettingsApi;

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


EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EmailSettingsResponseSingle result = apiInstance.emailRoutingSettingsEnableEmailRouting(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsEnableEmailRouting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EmailSettingsResponseSingle**](EmailSettingsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emailRoutingSettingsGetEmailRoutingSettings"></a>
# **emailRoutingSettingsGetEmailRoutingSettings**
> EmailSettingsResponseSingle emailRoutingSettingsGetEmailRoutingSettings(zoneIdentifier)

Get Email Routing settings

Get information about the settings for your Email Routing zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailRoutingSettingsApi;

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


EmailRoutingSettingsApi apiInstance = new EmailRoutingSettingsApi();
String zoneIdentifier = "zoneIdentifier_example"; // String | 
try {
    EmailSettingsResponseSingle result = apiInstance.emailRoutingSettingsGetEmailRoutingSettings(zoneIdentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailRoutingSettingsApi#emailRoutingSettingsGetEmailRoutingSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneIdentifier** | [**String**](.md)|  |

### Return type

[**EmailSettingsResponseSingle**](EmailSettingsResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

