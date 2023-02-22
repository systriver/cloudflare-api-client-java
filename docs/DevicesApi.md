# DevicesApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**devicesCreateDeviceSettingsPolicy**](DevicesApi.md#devicesCreateDeviceSettingsPolicy) | **POST** /accounts/{identifier}/devices/policy | Create Device Settings Policy
[**devicesDeleteDeviceSettingsPolicy**](DevicesApi.md#devicesDeleteDeviceSettingsPolicy) | **DELETE** /accounts/{identifier}/devices/policy/{uuid} | Delete Device Settings Policy
[**devicesDeviceDetails**](DevicesApi.md#devicesDeviceDetails) | **GET** /accounts/{identifier}/devices/{uuid} | Device Details
[**devicesGetDefaultDeviceSettingsPolicy**](DevicesApi.md#devicesGetDefaultDeviceSettingsPolicy) | **GET** /accounts/{identifier}/devices/policy | Get Default Device Settings Policy
[**devicesGetDeviceSettingsPolicyById**](DevicesApi.md#devicesGetDeviceSettingsPolicyById) | **GET** /accounts/{identifier}/devices/policy/{uuid} | Get Device Settings Policy by ID
[**devicesGetLocalDomainFallbackList**](DevicesApi.md#devicesGetLocalDomainFallbackList) | **GET** /accounts/{identifier}/devices/policy/fallback_domains | Get Local Domain Fallback List
[**devicesGetLocalDomainFallbackListForADeviceSettingsPolicy**](DevicesApi.md#devicesGetLocalDomainFallbackListForADeviceSettingsPolicy) | **GET** /accounts/{identifier}/devices/policy/{uuid}/fallback_domains | Get Local Domain Fallback List for a Device Settings Policy
[**devicesGetSplitTunnelExcludeList**](DevicesApi.md#devicesGetSplitTunnelExcludeList) | **GET** /accounts/{identifier}/devices/policy/exclude | Get Split Tunnel Exclude List
[**devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy) | **GET** /accounts/{identifier}/devices/policy/{uuid}/exclude | Get Split Tunnel Exclude List for a Device Settings Policy
[**devicesGetSplitTunnelIncludeList**](DevicesApi.md#devicesGetSplitTunnelIncludeList) | **GET** /accounts/{identifier}/devices/policy/include | Get Split Tunnel Include List
[**devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy) | **GET** /accounts/{identifier}/devices/policy/{uuid}/include | Get Split Tunnel Include List for a Device Settings Policy
[**devicesListAdminOverrideCodeForDevice**](DevicesApi.md#devicesListAdminOverrideCodeForDevice) | **GET** /accounts/{identifier}/devices/{uuid}/override_codes | List Admin Override code for device
[**devicesListDeviceSettingsPolicies**](DevicesApi.md#devicesListDeviceSettingsPolicies) | **GET** /accounts/{identifier}/devices/policies | List Device Settings Policies
[**devicesListDevices**](DevicesApi.md#devicesListDevices) | **GET** /accounts/{identifier}/devices | List Devices
[**devicesRevokeDevices**](DevicesApi.md#devicesRevokeDevices) | **POST** /accounts/{identifier}/devices/revoke | Revoke Devices
[**devicesSetLocalDomainFallbackList**](DevicesApi.md#devicesSetLocalDomainFallbackList) | **PUT** /accounts/{identifier}/devices/policy/fallback_domains | Set Local Domain Fallback List
[**devicesSetLocalDomainFallbackListForADeviceSettingsPolicy**](DevicesApi.md#devicesSetLocalDomainFallbackListForADeviceSettingsPolicy) | **PUT** /accounts/{identifier}/devices/policy/{uuid}/fallback_domains | Set Local Domain Fallback List for a Device Settings Policy
[**devicesSetSplitTunnelExcludeList**](DevicesApi.md#devicesSetSplitTunnelExcludeList) | **PUT** /accounts/{identifier}/devices/policy/exclude | Set Split Tunnel Exclude List
[**devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy) | **PUT** /accounts/{identifier}/devices/policy/{uuid}/exclude | Set Split Tunnel Exclude List for a Device Settings Policy
[**devicesSetSplitTunnelIncludeList**](DevicesApi.md#devicesSetSplitTunnelIncludeList) | **PUT** /accounts/{identifier}/devices/policy/include | Set Split Tunnel Include List
[**devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy**](DevicesApi.md#devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy) | **PUT** /accounts/{identifier}/devices/policy/{uuid}/include | Set Split Tunnel Include List for a Device Settings Policy
[**devicesUnrevokeDevices**](DevicesApi.md#devicesUnrevokeDevices) | **POST** /accounts/{identifier}/devices/unrevoke | Unrevoke Devices
[**devicesUpdateDefaultDeviceSettingsPolicy**](DevicesApi.md#devicesUpdateDefaultDeviceSettingsPolicy) | **PATCH** /accounts/{identifier}/devices/policy | Update Default Device Settings Policy
[**devicesUpdateDeviceSettingsPolicy**](DevicesApi.md#devicesUpdateDeviceSettingsPolicy) | **PATCH** /accounts/{identifier}/devices/policy/{uuid} | Update Device Settings Policy

<a name="devicesCreateDeviceSettingsPolicy"></a>
# **devicesCreateDeviceSettingsPolicy**
> DeviceSettingsResponse devicesCreateDeviceSettingsPolicy(body, identifier)

Create Device Settings Policy

Create a device settings policy to be applied to certain devices matching the criteria.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesPolicyBody body = new DevicesPolicyBody(); // DevicesPolicyBody | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DeviceSettingsResponse result = apiInstance.devicesCreateDeviceSettingsPolicy(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesCreateDeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DevicesPolicyBody**](DevicesPolicyBody.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceSettingsResponse**](DeviceSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesDeleteDeviceSettingsPolicy"></a>
# **devicesDeleteDeviceSettingsPolicy**
> DeviceSettingsResponseCollection devicesDeleteDeviceSettingsPolicy(uuid, identifier)

Delete Device Settings Policy

Delete a device settings policy. Returns the remaining policies for the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DeviceSettingsResponseCollection result = apiInstance.devicesDeleteDeviceSettingsPolicy(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesDeleteDeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceSettingsResponseCollection**](DeviceSettingsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesDeviceDetails"></a>
# **devicesDeviceDetails**
> DeviceResponse devicesDeviceDetails(uuid, identifier)

Device Details

Fetch a single Device.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DeviceResponse result = apiInstance.devicesDeviceDetails(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesDeviceDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceResponse**](DeviceResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetDefaultDeviceSettingsPolicy"></a>
# **devicesGetDefaultDeviceSettingsPolicy**
> DefaultDeviceSettingsResponse devicesGetDefaultDeviceSettingsPolicy(identifier)

Get Default Device Settings Policy

Get the default device settings policy for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DefaultDeviceSettingsResponse result = apiInstance.devicesGetDefaultDeviceSettingsPolicy(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetDefaultDeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DefaultDeviceSettingsResponse**](DefaultDeviceSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetDeviceSettingsPolicyById"></a>
# **devicesGetDeviceSettingsPolicyById**
> DeviceSettingsResponse devicesGetDeviceSettingsPolicyById(uuid, identifier)

Get Device Settings Policy by ID

Get the device settings policy by ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DeviceSettingsResponse result = apiInstance.devicesGetDeviceSettingsPolicyById(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetDeviceSettingsPolicyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceSettingsResponse**](DeviceSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetLocalDomainFallbackList"></a>
# **devicesGetLocalDomainFallbackList**
> FallbackDomainResponseCollection devicesGetLocalDomainFallbackList(identifier)

Get Local Domain Fallback List

Get the list of domains to bypass Gateway for DNS resolution and instead use the specified server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    FallbackDomainResponseCollection result = apiInstance.devicesGetLocalDomainFallbackList(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetLocalDomainFallbackList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**FallbackDomainResponseCollection**](FallbackDomainResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetLocalDomainFallbackListForADeviceSettingsPolicy"></a>
# **devicesGetLocalDomainFallbackListForADeviceSettingsPolicy**
> FallbackDomainResponseCollection devicesGetLocalDomainFallbackListForADeviceSettingsPolicy(uuid, identifier)

Get Local Domain Fallback List for a Device Settings Policy

Get the list of domains to bypass Gateway for DNS resolution and instead use the specified server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    FallbackDomainResponseCollection result = apiInstance.devicesGetLocalDomainFallbackListForADeviceSettingsPolicy(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetLocalDomainFallbackListForADeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**FallbackDomainResponseCollection**](FallbackDomainResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetSplitTunnelExcludeList"></a>
# **devicesGetSplitTunnelExcludeList**
> SplitTunnelResponseCollection devicesGetSplitTunnelExcludeList(identifier)

Get Split Tunnel Exclude List

Get the list of routes excluded from the WARP client&#x27;s tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelResponseCollection result = apiInstance.devicesGetSplitTunnelExcludeList(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelExcludeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelResponseCollection**](SplitTunnelResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy"></a>
# **devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy**
> SplitTunnelResponseCollection devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy(uuid, identifier)

Get Split Tunnel Exclude List for a Device Settings Policy

Get the list of routes excluded from the WARP client&#x27;s tunnel for one specific device settings policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelResponseCollection result = apiInstance.devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelExcludeListForADeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelResponseCollection**](SplitTunnelResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetSplitTunnelIncludeList"></a>
# **devicesGetSplitTunnelIncludeList**
> SplitTunnelIncludeResponseCollection devicesGetSplitTunnelIncludeList(identifier)

Get Split Tunnel Include List

Get the list of routes included in the WARP client&#x27;s tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelIncludeResponseCollection result = apiInstance.devicesGetSplitTunnelIncludeList(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelIncludeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelIncludeResponseCollection**](SplitTunnelIncludeResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy"></a>
# **devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy**
> SplitTunnelIncludeResponseCollection devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy(uuid, identifier)

Get Split Tunnel Include List for a Device Settings Policy

Get the list of routes included in the WARP client&#x27;s tunnel for one specific device settings policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelIncludeResponseCollection result = apiInstance.devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesGetSplitTunnelIncludeListForADeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelIncludeResponseCollection**](SplitTunnelIncludeResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesListAdminOverrideCodeForDevice"></a>
# **devicesListAdminOverrideCodeForDevice**
> OverrideCodesResponse devicesListAdminOverrideCodeForDevice(uuid, identifier)

List Admin Override code for device

Fetch one-time use admin override code for a device. This relies on the Admin Override setting being enabled in your device configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    OverrideCodesResponse result = apiInstance.devicesListAdminOverrideCodeForDevice(uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesListAdminOverrideCodeForDevice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**OverrideCodesResponse**](OverrideCodesResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesListDeviceSettingsPolicies"></a>
# **devicesListDeviceSettingsPolicies**
> DeviceSettingsResponseCollection devicesListDeviceSettingsPolicies(identifier)

List Device Settings Policies

Lists the device settings policies for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DeviceSettingsResponseCollection result = apiInstance.devicesListDeviceSettingsPolicies(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesListDeviceSettingsPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceSettingsResponseCollection**](DeviceSettingsResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesListDevices"></a>
# **devicesListDevices**
> DevicesResponse devicesListDevices(identifier)

List Devices

List Enrolled Devices.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DevicesResponse result = apiInstance.devicesListDevices(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesListDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DevicesResponse**](DevicesResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="devicesRevokeDevices"></a>
# **devicesRevokeDevices**
> ApiResponseSingle devicesRevokeDevices(body, identifier)

Revoke Devices

Revoke a list of devices.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    ApiResponseSingle result = apiInstance.devicesRevokeDevices(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesRevokeDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesSetLocalDomainFallbackList"></a>
# **devicesSetLocalDomainFallbackList**
> FallbackDomainResponseCollection devicesSetLocalDomainFallbackList(body, identifier)

Set Local Domain Fallback List

Set the list of domains to bypass Gateway for DNS resolution and instead use the specified server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<FallbackDomain> body = Arrays.asList(new FallbackDomain()); // List<FallbackDomain> | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    FallbackDomainResponseCollection result = apiInstance.devicesSetLocalDomainFallbackList(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesSetLocalDomainFallbackList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;FallbackDomain&gt;**](FallbackDomain.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**FallbackDomainResponseCollection**](FallbackDomainResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesSetLocalDomainFallbackListForADeviceSettingsPolicy"></a>
# **devicesSetLocalDomainFallbackListForADeviceSettingsPolicy**
> FallbackDomainResponseCollection devicesSetLocalDomainFallbackListForADeviceSettingsPolicy(body, uuid, identifier)

Set Local Domain Fallback List for a Device Settings Policy

Set the list of domains to bypass Gateway for DNS resolution and instead use the specified server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<FallbackDomain> body = Arrays.asList(new FallbackDomain()); // List<FallbackDomain> | 
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    FallbackDomainResponseCollection result = apiInstance.devicesSetLocalDomainFallbackListForADeviceSettingsPolicy(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesSetLocalDomainFallbackListForADeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;FallbackDomain&gt;**](FallbackDomain.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**FallbackDomainResponseCollection**](FallbackDomainResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesSetSplitTunnelExcludeList"></a>
# **devicesSetSplitTunnelExcludeList**
> SplitTunnelResponseCollection devicesSetSplitTunnelExcludeList(body, identifier)

Set Split Tunnel Exclude List

Set the list of routes excluded from the WARP client&#x27;s tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<SplitTunnel> body = Arrays.asList(new SplitTunnel()); // List<SplitTunnel> | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelResponseCollection result = apiInstance.devicesSetSplitTunnelExcludeList(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelExcludeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SplitTunnel&gt;**](SplitTunnel.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelResponseCollection**](SplitTunnelResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy"></a>
# **devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy**
> SplitTunnelResponseCollection devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy(body, uuid, identifier)

Set Split Tunnel Exclude List for a Device Settings Policy

Set the list of routes excluded from the WARP client&#x27;s tunnel for one specific device settings policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<SplitTunnel> body = Arrays.asList(new SplitTunnel()); // List<SplitTunnel> | 
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelResponseCollection result = apiInstance.devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelExcludeListForADeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SplitTunnel&gt;**](SplitTunnel.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelResponseCollection**](SplitTunnelResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesSetSplitTunnelIncludeList"></a>
# **devicesSetSplitTunnelIncludeList**
> SplitTunnelIncludeResponseCollection devicesSetSplitTunnelIncludeList(body, identifier)

Set Split Tunnel Include List

Set the list of routes included in the WARP client&#x27;s tunnel.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<SplitTunnelInclude> body = Arrays.asList(new SplitTunnelInclude()); // List<SplitTunnelInclude> | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelIncludeResponseCollection result = apiInstance.devicesSetSplitTunnelIncludeList(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelIncludeList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SplitTunnelInclude&gt;**](SplitTunnelInclude.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelIncludeResponseCollection**](SplitTunnelIncludeResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy"></a>
# **devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy**
> SplitTunnelIncludeResponseCollection devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy(body, uuid, identifier)

Set Split Tunnel Include List for a Device Settings Policy

Set the list of routes included in the WARP client&#x27;s tunnel for one specific device settings policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<SplitTunnelInclude> body = Arrays.asList(new SplitTunnelInclude()); // List<SplitTunnelInclude> | 
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    SplitTunnelIncludeResponseCollection result = apiInstance.devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesSetSplitTunnelIncludeListForADeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;SplitTunnelInclude&gt;**](SplitTunnelInclude.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**SplitTunnelIncludeResponseCollection**](SplitTunnelIncludeResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesUnrevokeDevices"></a>
# **devicesUnrevokeDevices**
> ApiResponseSingle devicesUnrevokeDevices(body, identifier)

Unrevoke Devices

Unrevoke a list of devices.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
List<String> body = Arrays.asList("body_example"); // List<String> | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    ApiResponseSingle result = apiInstance.devicesUnrevokeDevices(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesUnrevokeDevices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;String&gt;**](String.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ApiResponseSingle**](ApiResponseSingle.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesUpdateDefaultDeviceSettingsPolicy"></a>
# **devicesUpdateDefaultDeviceSettingsPolicy**
> DefaultDeviceSettingsResponse devicesUpdateDefaultDeviceSettingsPolicy(body, identifier)

Update Default Device Settings Policy

Update the default device settings policy for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
DevicesPolicyBody1 body = new DevicesPolicyBody1(); // DevicesPolicyBody1 | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DefaultDeviceSettingsResponse result = apiInstance.devicesUpdateDefaultDeviceSettingsPolicy(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesUpdateDefaultDeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DevicesPolicyBody1**](DevicesPolicyBody1.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DefaultDeviceSettingsResponse**](DefaultDeviceSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="devicesUpdateDeviceSettingsPolicy"></a>
# **devicesUpdateDeviceSettingsPolicy**
> DeviceSettingsResponse devicesUpdateDeviceSettingsPolicy(body, uuid, identifier)

Update Device Settings Policy

Update a device settings policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DevicesApi;

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


DevicesApi apiInstance = new DevicesApi();
PolicyUuidBody body = new PolicyUuidBody(); // PolicyUuidBody | 
String uuid = "uuid_example"; // String | 
DevicesComponentsSchemasIdentifier identifier = new DevicesComponentsSchemasIdentifier(); // DevicesComponentsSchemasIdentifier | 
try {
    DeviceSettingsResponse result = apiInstance.devicesUpdateDeviceSettingsPolicy(body, uuid, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevicesApi#devicesUpdateDeviceSettingsPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PolicyUuidBody**](PolicyUuidBody.md)|  |
 **uuid** | [**String**](.md)|  |
 **identifier** | [**DevicesComponentsSchemasIdentifier**](.md)|  |

### Return type

[**DeviceSettingsResponse**](DeviceSettingsResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

