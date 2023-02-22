# LoadBalancerMonitorsApi

All URIs are relative to *https://api.cloudflare.com/client/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loadBalancerMonitorsCreateMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsCreateMonitor) | **POST** /user/load_balancers/monitors | Create Monitor
[**loadBalancerMonitorsDeleteMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsDeleteMonitor) | **DELETE** /user/load_balancers/monitors/{identifier} | Delete Monitor
[**loadBalancerMonitorsListMonitorReferences**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsListMonitorReferences) | **GET** /user/load_balancers/monitors/{identifier}/references | List Monitor References
[**loadBalancerMonitorsListMonitors**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsListMonitors) | **GET** /user/load_balancers/monitors | List Monitors
[**loadBalancerMonitorsMonitorDetails**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsMonitorDetails) | **GET** /user/load_balancers/monitors/{identifier} | Monitor Details
[**loadBalancerMonitorsPatchMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsPatchMonitor) | **PATCH** /user/load_balancers/monitors/{identifier} | Patch Monitor
[**loadBalancerMonitorsPreviewMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsPreviewMonitor) | **POST** /user/load_balancers/monitors/{identifier}/preview | Preview Monitor
[**loadBalancerMonitorsPreviewResult**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsPreviewResult) | **GET** /user/load_balancers/preview/{preview_id} | Preview Result
[**loadBalancerMonitorsUpdateMonitor**](LoadBalancerMonitorsApi.md#loadBalancerMonitorsUpdateMonitor) | **PUT** /user/load_balancers/monitors/{identifier} | Update Monitor

<a name="loadBalancerMonitorsCreateMonitor"></a>
# **loadBalancerMonitorsCreateMonitor**
> MonitorComponentsSchemasSingleResponse loadBalancerMonitorsCreateMonitor(body)

Create Monitor

Create a configured monitor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
LoadBalancersMonitorsBody1 body = new LoadBalancersMonitorsBody1(); // LoadBalancersMonitorsBody1 | 
try {
    MonitorComponentsSchemasSingleResponse result = apiInstance.loadBalancerMonitorsCreateMonitor(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsCreateMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoadBalancersMonitorsBody1**](LoadBalancersMonitorsBody1.md)|  |

### Return type

[**MonitorComponentsSchemasSingleResponse**](MonitorComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerMonitorsDeleteMonitor"></a>
# **loadBalancerMonitorsDeleteMonitor**
> MonitorComponentsSchemasIdResponse loadBalancerMonitorsDeleteMonitor(identifier)

Delete Monitor

Delete a configured monitor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
MonitorComponentsSchemasIdentifier identifier = new MonitorComponentsSchemasIdentifier(); // MonitorComponentsSchemasIdentifier | 
try {
    MonitorComponentsSchemasIdResponse result = apiInstance.loadBalancerMonitorsDeleteMonitor(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsDeleteMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**MonitorComponentsSchemasIdentifier**](.md)|  |

### Return type

[**MonitorComponentsSchemasIdResponse**](MonitorComponentsSchemasIdResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerMonitorsListMonitorReferences"></a>
# **loadBalancerMonitorsListMonitorReferences**
> ReferencesResponse loadBalancerMonitorsListMonitorReferences(identifier)

List Monitor References

Get the list of resources that reference the provided monitor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
MonitorComponentsSchemasIdentifier identifier = new MonitorComponentsSchemasIdentifier(); // MonitorComponentsSchemasIdentifier | 
try {
    ReferencesResponse result = apiInstance.loadBalancerMonitorsListMonitorReferences(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsListMonitorReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**MonitorComponentsSchemasIdentifier**](.md)|  |

### Return type

[**ReferencesResponse**](ReferencesResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerMonitorsListMonitors"></a>
# **loadBalancerMonitorsListMonitors**
> MonitorComponentsSchemasResponseCollection loadBalancerMonitorsListMonitors()

List Monitors

List configured monitors for a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
try {
    MonitorComponentsSchemasResponseCollection result = apiInstance.loadBalancerMonitorsListMonitors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsListMonitors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MonitorComponentsSchemasResponseCollection**](MonitorComponentsSchemasResponseCollection.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerMonitorsMonitorDetails"></a>
# **loadBalancerMonitorsMonitorDetails**
> MonitorComponentsSchemasSingleResponse loadBalancerMonitorsMonitorDetails(identifier)

Monitor Details

List a single configured monitor for a user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
MonitorComponentsSchemasIdentifier identifier = new MonitorComponentsSchemasIdentifier(); // MonitorComponentsSchemasIdentifier | 
try {
    MonitorComponentsSchemasSingleResponse result = apiInstance.loadBalancerMonitorsMonitorDetails(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsMonitorDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | [**MonitorComponentsSchemasIdentifier**](.md)|  |

### Return type

[**MonitorComponentsSchemasSingleResponse**](MonitorComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerMonitorsPatchMonitor"></a>
# **loadBalancerMonitorsPatchMonitor**
> MonitorComponentsSchemasSingleResponse loadBalancerMonitorsPatchMonitor(body, identifier)

Patch Monitor

Apply changes to an existing monitor, overwriting the supplied properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
MonitorsIdentifierBody3 body = new MonitorsIdentifierBody3(); // MonitorsIdentifierBody3 | 
MonitorComponentsSchemasIdentifier identifier = new MonitorComponentsSchemasIdentifier(); // MonitorComponentsSchemasIdentifier | 
try {
    MonitorComponentsSchemasSingleResponse result = apiInstance.loadBalancerMonitorsPatchMonitor(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsPatchMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MonitorsIdentifierBody3**](MonitorsIdentifierBody3.md)|  |
 **identifier** | [**MonitorComponentsSchemasIdentifier**](.md)|  |

### Return type

[**MonitorComponentsSchemasSingleResponse**](MonitorComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerMonitorsPreviewMonitor"></a>
# **loadBalancerMonitorsPreviewMonitor**
> CloudflareClientAPIPreviewResponse loadBalancerMonitorsPreviewMonitor(body, identifier)

Preview Monitor

Preview pools using the specified monitor with provided monitor details. The returned preview_id can be used in the preview endpoint to retrieve the results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
IdentifierPreviewBody2 body = new IdentifierPreviewBody2(); // IdentifierPreviewBody2 | 
MonitorComponentsSchemasIdentifier identifier = new MonitorComponentsSchemasIdentifier(); // MonitorComponentsSchemasIdentifier | 
try {
    CloudflareClientAPIPreviewResponse result = apiInstance.loadBalancerMonitorsPreviewMonitor(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsPreviewMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IdentifierPreviewBody2**](IdentifierPreviewBody2.md)|  |
 **identifier** | [**MonitorComponentsSchemasIdentifier**](.md)|  |

### Return type

[**CloudflareClientAPIPreviewResponse**](CloudflareClientAPIPreviewResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="loadBalancerMonitorsPreviewResult"></a>
# **loadBalancerMonitorsPreviewResult**
> PreviewResultResponse loadBalancerMonitorsPreviewResult(previewId)

Preview Result

Get the result of a previous preview operation using the provided preview_id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
PreviewId previewId = new PreviewId(); // PreviewId | 
try {
    PreviewResultResponse result = apiInstance.loadBalancerMonitorsPreviewResult(previewId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsPreviewResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **previewId** | [**PreviewId**](.md)|  |

### Return type

[**PreviewResultResponse**](PreviewResultResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loadBalancerMonitorsUpdateMonitor"></a>
# **loadBalancerMonitorsUpdateMonitor**
> MonitorComponentsSchemasSingleResponse loadBalancerMonitorsUpdateMonitor(body, identifier)

Update Monitor

Modify a configured monitor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LoadBalancerMonitorsApi;

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


LoadBalancerMonitorsApi apiInstance = new LoadBalancerMonitorsApi();
MonitorsIdentifierBody2 body = new MonitorsIdentifierBody2(); // MonitorsIdentifierBody2 | 
MonitorComponentsSchemasIdentifier identifier = new MonitorComponentsSchemasIdentifier(); // MonitorComponentsSchemasIdentifier | 
try {
    MonitorComponentsSchemasSingleResponse result = apiInstance.loadBalancerMonitorsUpdateMonitor(body, identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoadBalancerMonitorsApi#loadBalancerMonitorsUpdateMonitor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MonitorsIdentifierBody2**](MonitorsIdentifierBody2.md)|  |
 **identifier** | [**MonitorComponentsSchemasIdentifier**](.md)|  |

### Return type

[**MonitorComponentsSchemasSingleResponse**](MonitorComponentsSchemasSingleResponse.md)

### Authorization

[api_email](../README.md#api_email)[api_key](../README.md#api_key)[api_token](../README.md#api_token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

